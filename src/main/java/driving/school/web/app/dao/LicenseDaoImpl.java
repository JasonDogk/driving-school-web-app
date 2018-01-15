package driving.school.web.app.dao;

import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import driving.school.web.app.entity.License;

@Repository
@Transactional
public class LicenseDaoImpl implements LicenseDao {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public License getLicense(String licenseId) {
		try {
			@SuppressWarnings("unchecked")
			TypedQuery<License> query = sessionFactory.getCurrentSession()
					.createQuery("from License d WHERE d.id = :licenseId");
			query.setParameter("licenseId", licenseId);
			return query.getSingleResult();
		} catch (Exception e) {
			return null;
		}

	}

	@Override
	public License createLicense(License license) {
		Session session = null;
		Transaction transaction = null;

		try {
			session = sessionFactory.openSession();
			transaction = session.getTransaction();
			transaction.begin();
			session.save(license);
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

		return license;
	}

	@Override
	public License updateLicense(License license) {
		Session session = null;
		Transaction transaction = null;

		try {
			session = sessionFactory.openSession();
			transaction = session.getTransaction();
			transaction.begin();
			session.update(license);
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

		return license;
	}

	@Override
	public String deleteLicense(String licenseId) {
		Session session = null;
		Transaction transaction = null;
		String deletedLicenseId = null;
		try {
			License license = new License.Builder().id(licenseId).build();

			session = sessionFactory.openSession();
			transaction = session.getTransaction();
			transaction.begin();
			session.delete(license);
			transaction.commit();
			deletedLicenseId = licenseId;
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
		return deletedLicenseId;
	}
}
