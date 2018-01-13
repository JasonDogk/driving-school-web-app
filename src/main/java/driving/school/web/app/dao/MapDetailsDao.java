package driving.school.web.app.dao;

import java.util.List;

import driving.school.web.app.entity.MapDetails;

public interface MapDetailsDao {
	List<MapDetails> listMapDetailss();

	MapDetails getMapDetailsById(String driverId);

	MapDetails createMapDetails(MapDetails driver);

	MapDetails updateMapDetails(MapDetails driver);

	Void deleteMapDetails(String driverId);
}
