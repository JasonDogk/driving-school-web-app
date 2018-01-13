package driving.school.web.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import driving.school.web.app.entity.MapDetails;
import driving.school.web.app.service.MapDetailsService;

@RestController
public class MapDetailsController {
	@Autowired
	private MapDetailsService mapDetailsService;

	@RequestMapping(value = "/mapDetailss", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<MapDetails> getMapDetailss() {
		List<MapDetails> mapDetailss = mapDetailsService.listMapDetailss();
		return mapDetailss;
	}

	@RequestMapping(value = "/mapDetails/{mapDetailsId}", method = RequestMethod.GET, headers = "Accept=application/json")
	public MapDetails getMapDetailsById(@PathVariable String mapDetailsId) {

		MapDetails mapDetails = mapDetailsService.getMapDetailsById(mapDetailsId);
		return mapDetails;
	}

	@RequestMapping(value = "/mapDetails", method = RequestMethod.POST, headers = "Accept=application/json")
	public MapDetails createMapDetails(@RequestBody MapDetails mapDetails) {
		mapDetails = mapDetailsService.createMapDetails(mapDetails);
		return mapDetails;

	}

	@RequestMapping(value = "/mapDetails", method = RequestMethod.PUT, headers = "Accept=application/json")
	public MapDetails updateMapDetails(@RequestBody MapDetails mapDetails) {
		mapDetails = mapDetailsService.updateMapDetails(mapDetails);
		return mapDetails;

	}

	@RequestMapping(value = "/mapDetails/{mapDetailsId}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public Void updateMapDetails(@PathVariable String mapDetailsId) {
		mapDetailsService.deleteMapDetails(mapDetailsId);
		return null;
	}
}
