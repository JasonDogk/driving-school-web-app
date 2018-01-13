package driving.school.web.app.service;

import java.util.List;

import driving.school.web.app.entity.MapDetails;

public interface MapDetailsService {
	List<MapDetails> listMapDetailss();

	MapDetails getMapDetailsById(String mapDetailsId);

	MapDetails createMapDetails(MapDetails mapDetails);

	MapDetails updateMapDetails(MapDetails mapDetails);

	Void deleteMapDetails(String mapDetailsId);
}
