package driving.school.web.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import driving.school.web.app.entity.MapDetails;
import driving.school.web.app.exceptions.DataNotFoundException;
import driving.school.web.app.exceptions.EmptyObjectException;
import driving.school.web.app.exceptions.MapDetailsNotFoundException;
import driving.school.web.app.exceptions.MissingRequiredParamsException;
import driving.school.web.app.service.MapDetailsService;

@RestController
public class MapDetailsController {
	@Autowired
	private MapDetailsService mapDetailsService;

	@RequestMapping(value = "/mapDetails", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<MapDetails> getMapDetails() {
		List<MapDetails> mapDetails = null;
		try {
			mapDetails = mapDetailsService.getMapDetails();
		} catch (DataNotFoundException e) {
			e.printStackTrace();

		}
		return mapDetails;
	}

	@RequestMapping(value = "/mapDetails/{mapDetailsId}", method = RequestMethod.GET, headers = "Accept=application/json")
	public MapDetails getMapDetails(@PathVariable String mapDetailsId) {

		try {
			MapDetails mapDetails = mapDetailsService.getMapDetails(mapDetailsId);
			return mapDetails;
		} catch (EmptyObjectException e) {
			e.printStackTrace();
		}
		return null;

	}

	@RequestMapping(value = "/mapDetails", method = RequestMethod.POST, headers = "Accept=application/json")
	public MapDetails createMapDetails(@RequestBody MapDetails mapDetails) {
		try {
			mapDetails = mapDetailsService.createMapDetails(mapDetails);
			return mapDetails;
		} catch (EmptyObjectException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	@RequestMapping(value = "/mapDetails", method = RequestMethod.PUT, headers = "Accept=application/json")
	public MapDetails updateMapDetails(@RequestBody MapDetails mapDetails)
			throws EmptyObjectException, MissingRequiredParamsException {
		mapDetails = mapDetailsService.updateMapDetails(mapDetails);
		return mapDetails;

	}

	@RequestMapping(value = "/mapDetails/{mapDetailsId}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public Void updateMapDetails(@PathVariable String mapDetailsId) {
		try {
			mapDetailsService.deleteMapDetails(mapDetailsId);
		} catch (MapDetailsNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EmptyObjectException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
