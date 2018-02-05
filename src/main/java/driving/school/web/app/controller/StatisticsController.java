package driving.school.web.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import driving.school.web.app.entity.Statistics;
import driving.school.web.app.exceptions.DataNotFoundException;
import driving.school.web.app.service.StatisticsService;

@RestController
public class StatisticsController {

	@Autowired
	private StatisticsService statisticsService;

	@RequestMapping(value = "/statistics/male/female/last/3/years", method = RequestMethod.GET, headers = "Accept=application/json")
	public Statistics getMaleFemaleLast3Years() {
		Statistics maleFemaleLast3Years = null;
		try {
			maleFemaleLast3Years = statisticsService.getMaleFemaleLast3Years();
		} catch (DataNotFoundException e) {
			e.printStackTrace();

		}
		return maleFemaleLast3Years;
	}

	@RequestMapping(value = "/statistics/male/female/this/year", method = RequestMethod.GET, headers = "Accept=application/json")
	public Statistics getMaleFemaleThisYear() {
		Statistics maleFemaleThisYear = null;
		try {
			maleFemaleThisYear = statisticsService.getMaleFemaleThisYear();
		} catch (DataNotFoundException e) {
			e.printStackTrace();

		}
		return maleFemaleThisYear;
	}

	@RequestMapping(value = "/statistics/licenses/this/year", method = RequestMethod.GET, headers = "Accept=application/json")
	public Statistics getLicensesThisYear() {
		Statistics licensesThisYear = null;
		try {
			licensesThisYear = statisticsService.getMaleFemaleThisYear();
		} catch (DataNotFoundException e) {
			e.printStackTrace();

		}
		return licensesThisYear;
	}

	@RequestMapping(value = "/statistics/registrations/this/year", method = RequestMethod.GET, headers = "Accept=application/json")
	public Statistics getRegistrationsThisYear() {
		Statistics registrationsThisYear = null;
		try {
			registrationsThisYear = statisticsService.getRegistrationsThisYear();
		} catch (DataNotFoundException e) {
			e.printStackTrace();

		}
		return registrationsThisYear;
	}

	@RequestMapping(value = "/statistics/starting/ending/lessons/per/month/this/year", method = RequestMethod.GET, headers = "Accept=application/json")
	public Statistics getStartingEndingLessonsPerMonthThisYear() {
		Statistics registrationsThisYear = null;
		try {
			registrationsThisYear = statisticsService.getStartingEndingLessonsPerMonthThisYear();
		} catch (DataNotFoundException e) {
			e.printStackTrace();

		}
		return registrationsThisYear;
	}

}
