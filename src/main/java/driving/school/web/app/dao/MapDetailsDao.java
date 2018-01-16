package driving.school.web.app.dao;

import driving.school.web.app.entity.MapDetails;

public interface MapDetailsDao {

	MapDetails getMapDetails(String driverId);

	MapDetails createMapDetails(MapDetails driver);

	MapDetails updateMapDetails(MapDetails driver);

	String deleteMapDetails(String driverId);
}
