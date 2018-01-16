package driving.school.web.app.dao;

import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import driving.school.web.app.entity.MapDetails;

@Repository
@Transactional
public class MapDetailsDaoImpl implements MapDetailsDao {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public MapDetails getMapDetails(String mapDetailsId) {
		try {
			@SuppressWarnings("unchecked")
			TypedQuery<MapDetails> query = sessionFactory.getCurrentSession()
					.createQuery("from MapDetails d WHERE d.id = :mapDetailsId");
			query.setParameter("mapDetailsId", mapDetailsId);
			return query.getSingleResult();
		} catch (Exception e) {
			return null;
		}

	}

	@Override
	public MapDetails createMapDetails(MapDetails mapDetails) {
		Session session = null;
		Transaction transaction = null;

		try {
			session = sessionFactory.openSession();
			transaction = session.getTransaction();
			transaction.begin();
			session.save(mapDetails);
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

		return mapDetails;
	}

	@Override
	public MapDetails updateMapDetails(MapDetails mapDetails) {
		Session session = null;
		Transaction transaction = null;

		try {
			session = sessionFactory.openSession();
			transaction = session.getTransaction();
			transaction.begin();
			session.update(mapDetails);
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

		return mapDetails;
	}

	@Override
	public String deleteMapDetails(String mapDetailsId) {
		Session session = null;
		Transaction transaction = null;
		String deletedMapDetailsId = null;
		try {
			MapDetails mapDetails = new MapDetails.Builder().id(mapDetailsId).build();

			session = sessionFactory.openSession();
			transaction = session.getTransaction();
			transaction.begin();
			session.delete(mapDetails);
			transaction.commit();
			deletedMapDetailsId = mapDetailsId;
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
		return deletedMapDetailsId;
	}
}
