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
import driving.school.web.app.entity.LoginDriver;

@Repository
@Transactional
public class DriverDaoImpl implements DriverDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Driver> getDrivers() {
		@SuppressWarnings("unchecked")
		TypedQuery<Driver> query = sessionFactory.getCurrentSession().createQuery("from Driver");
		return query.getResultList();
	}

	@Override
	public List<LoginDriver> getLoginDrivers() {
		@SuppressWarnings("unchecked")
		TypedQuery<LoginDriver> query = sessionFactory.getCurrentSession().createQuery("from LoginDriver");
		return query.getResultList();
	}

	@Override
	public Driver getDriverById(String driverId) {

		try {
			@SuppressWarnings("unchecked")
			TypedQuery<Driver> query = sessionFactory.getCurrentSession()
					.createQuery("from Driver d WHERE d.id = :driverId");
			query.setParameter("driverId", driverId);
			return query.getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	@Override
	public Driver getDriverByAfm(String afm) {

		try {
			@SuppressWarnings("unchecked")
			TypedQuery<Driver> query = sessionFactory.getCurrentSession()
					.createQuery("from Driver d WHERE d.afm = :afm");
			query.setParameter("afm", afm);
			return query.getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

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

		return getDriverById(driver.getId());
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

		return getDriverById(driver.getId());
	}

	@Override
	public String deleteDriver(String driverId) {
		Session session = null;
		Transaction transaction = null;
		String deletedDriverId = null;
		try {
			Driver driver = new Driver.Builder().id(driverId).build();

			session = sessionFactory.openSession();
			transaction = session.getTransaction();
			transaction.begin();
			session.delete(driver);
			transaction.commit();
			deletedDriverId = driverId;
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
		return deletedDriverId;
	}

}
