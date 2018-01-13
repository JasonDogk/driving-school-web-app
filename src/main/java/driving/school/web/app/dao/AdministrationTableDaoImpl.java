package driving.school.web.app.dao;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import driving.school.web.app.entity.AdministrationTable;

@Repository
@Transactional
public class AdministrationTableDaoImpl implements AdministrationTableDao {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<AdministrationTable> listAdministrationTables() {
		@SuppressWarnings("unchecked")
		TypedQuery<AdministrationTable> query = sessionFactory.getCurrentSession()
				.createQuery("from AdministrationTable");
		return query.getResultList();
	}

	@Override
	public AdministrationTable getAdministrationTableById(String administrationTableId) {
		@SuppressWarnings("unchecked")
		TypedQuery<AdministrationTable> query = sessionFactory.getCurrentSession()
				.createQuery("from AdministrationTable d WHERE d.id = :administrationTableId");
		query.setParameter("administrationTableId", administrationTableId);
		return query.getSingleResult();
	}

	@Override
	public AdministrationTable createAdministrationTable(AdministrationTable administrationTable) {
		Session session = null;
		Transaction transaction = null;

		try {
			session = sessionFactory.openSession();
			transaction = session.getTransaction();
			transaction.begin();
			session.save(administrationTable);
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

		return administrationTable;
	}

	@Override
	public AdministrationTable updateAdministrationTable(AdministrationTable administrationTable) {
		Session session = null;
		Transaction transaction = null;

		try {
			session = sessionFactory.openSession();
			transaction = session.getTransaction();
			transaction.begin();
			session.update(administrationTable);
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

		return administrationTable;
	}

	@Override
	public Void deleteAdministrationTable(String administrationTableId) {
		Session session = null;
		Transaction transaction = null;
		try {
			AdministrationTable administrationTable = new AdministrationTable.Builder().id(administrationTableId)
					.build();

			session = sessionFactory.openSession();
			transaction = session.getTransaction();
			transaction.begin();
			session.delete(administrationTable);
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
