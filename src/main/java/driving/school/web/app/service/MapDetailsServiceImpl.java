package driving.school.web.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import driving.school.web.app.dao.MapDetailsDao;
import driving.school.web.app.entity.MapDetails;

@Service
public class MapDetailsServiceImpl implements MapDetailsService {

	@Autowired
	private MapDetailsDao mapDetailsDao;

	@Transactional(readOnly = true)
	@Override
	public List<MapDetails> listMapDetailss() {
		return mapDetailsDao.listMapDetailss();
	}

	@Override
	public MapDetails getMapDetailsById(String mapDetailsId) {
		return mapDetailsDao.getMapDetailsById(mapDetailsId);
	}

	@Override
	public MapDetails createMapDetails(MapDetails mapDetails) {
		return mapDetailsDao.createMapDetails(mapDetails);
	}

	@Override
	public MapDetails updateMapDetails(MapDetails mapDetails) {
		return mapDetailsDao.updateMapDetails(mapDetails);
	}

	@Override
	public Void deleteMapDetails(String mapDetailsId) {
		mapDetailsDao.deleteMapDetails(mapDetailsId);
		return null;
	}
}
