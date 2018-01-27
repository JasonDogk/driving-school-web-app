package driving.school.web.app.dao;

import java.util.List;

import driving.school.web.app.entity.MapDetails;

public interface MapDetailsDao {

	MapDetails getMapDetails(String driverId);

	List<MapDetails> getMapDetails();

	MapDetails createMapDetails(MapDetails driver);

	MapDetails updateMapDetails(MapDetails driver);

	String deleteMapDetails(String driverId);
}
