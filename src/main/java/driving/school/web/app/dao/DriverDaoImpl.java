package driving.school.web.app.dao;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
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

	@Override
	public Driver createDriver(Driver driver) {
		Session session = null;
		Transaction transaction = null;

		try {
			session = sessionFactory.openSession();
			transaction = session.getTransaction();
			transaction.begin();
			session.save(driver);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}

		return driver;
	}

	@Override
	public Driver updateDriver(Driver driver) {
		Session session = null;
		Transaction transaction = null;

		try {
			session = sessionFactory.openSession();
			transaction = session.getTransaction();
			transaction.begin();
			session.update(driver);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}

		return driver;
	}

	@Override
	public Void deleteDriver(String driverId) {
		Session session = null;
		Transaction transaction = null;
		try {
			Driver driver = new Driver.Builder().id(driverId).build();

			session = sessionFactory.openSession();
			transaction = session.getTransaction();
			transaction.begin();
			session.delete(driver);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return null;
	}

}
