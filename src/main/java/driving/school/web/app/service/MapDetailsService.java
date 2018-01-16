package driving.school.web.app.service;

import driving.school.web.app.entity.MapDetails;
import driving.school.web.app.exceptions.EmptyObjectException;
import driving.school.web.app.exceptions.LicenseNotFoundException;
import driving.school.web.app.exceptions.MissingRequiredParamsException;

public interface MapDetailsService {

	MapDetails getMapDetails(String mapDetailsId) throws EmptyObjectException;

	MapDetails createMapDetails(MapDetails mapDetails) throws EmptyObjectException;

	MapDetails updateMapDetails(MapDetails mapDetails) throws EmptyObjectException, MissingRequiredParamsException;

	String deleteMapDetails(String mapDetailsId) throws LicenseNotFoundException, EmptyObjectException;
}
