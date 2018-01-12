package driving.school.web.app.dao;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import driving.school.web.app.entity.Driver;

@Repository
@Transactional
public class DriverDaoImpl implements DriverDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Driver> listDrivers() {
		@SuppressWarnings("unchecked")
		TypedQuery<Driver> query = sessionFactory.getCurrentSession().createQuery("from Driver");
		return query.getResultList();
	}

	@Override
	public Driver getDriverById(String driverId) {
		@SuppressWarnings("unchecked")
		TypedQuery<Driver> query = sessionFactory.getCurrentSession()
				.createQuery("from Driver d WHERE d.id = :driverId");
		query.setParameter("driverId", driverId);
		return query.getSingleResult();
	}

}
