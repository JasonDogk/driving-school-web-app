package driving.school.web.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import driving.school.web.app.dao.MapDetailsDao;
import driving.school.web.app.entity.MapDetails;
import driving.school.web.app.exceptions.EmptyObjectException;
import driving.school.web.app.exceptions.LicenseNotFoundException;
import driving.school.web.app.exceptions.MissingRequiredParamsException;
import driving.school.web.app.utilLib.UtilLib;

@Service
public class MapDetailsServiceImpl implements MapDetailsService {

	@Autowired
	private MapDetailsDao mapDetailsDao;

	@Override
	public MapDetails getMapDetails(String mapDetailsId) throws EmptyObjectException {
		if (!UtilLib.isEmpty(mapDetailsId)) {
			return mapDetailsDao.getMapDetails(mapDetailsId);
		} else {
			throw new EmptyObjectException("Provided Map Details id is empty/null");
		}

	}

	@Override
	public MapDetails createMapDetails(MapDetails mapDetails) throws EmptyObjectException {
		UtilLib.containsId(mapDetails);
		String id = mapDetails.getId();

		return mapDetailsDao.createMapDetails(mapDetails);

	}

	@Override
	public MapDetails updateMapDetails(MapDetails mapDetails)
			throws EmptyObjectException, MissingRequiredParamsException {

		if (UtilLib.containsId(mapDetails)) {
			if (UtilLib.hasAllTheMandatoryFields(mapDetails)) {
				return mapDetailsDao.updateMapDetails(mapDetails);
			} else {
				throw new MissingRequiredParamsException("Not All mandatory fields completed to create map details");
			}

		} else {
			throw new MissingRequiredParamsException("Missing mandatory id for map details in order to be updated");
		}
	}

	@Override
	public String deleteMapDetails(String mapDetailsId) throws LicenseNotFoundException, EmptyObjectException {

		if (!UtilLib.isEmpty(mapDetailsId)) {
			String deletedLicenseId = mapDetailsDao.deleteMapDetails(mapDetailsId);
			if (!UtilLib.isEmpty(deletedLicenseId)) {
				return deletedLicenseId;
			} else {
				throw new LicenseNotFoundException("Requested license id to be deleted was not found");
			}
		} else {
			throw new EmptyObjectException("No license id provided in order to be deleted");
		}

	}
}
