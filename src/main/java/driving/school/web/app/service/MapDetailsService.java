package driving.school.web.app.service;

import java.util.List;

import driving.school.web.app.entity.MapDetails;
import driving.school.web.app.exceptions.DataNotFoundException;
import driving.school.web.app.exceptions.EmptyObjectException;
import driving.school.web.app.exceptions.MapDetailsNotFoundException;
import driving.school.web.app.exceptions.MissingRequiredParamsException;

public interface MapDetailsService {

	MapDetails getMapDetails(String mapDetailsId) throws EmptyObjectException;

	List<MapDetails> getMapDetails() throws DataNotFoundException;

	MapDetails createMapDetails(MapDetails mapDetails) throws EmptyObjectException;

	MapDetails updateMapDetails(MapDetails mapDetails) throws EmptyObjectException, MissingRequiredParamsException;

	String deleteMapDetails(String mapDetailsId) throws MapDetailsNotFoundException, EmptyObjectException;
}
