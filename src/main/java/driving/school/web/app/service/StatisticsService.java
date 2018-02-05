package driving.school.web.app.service;

import driving.school.web.app.entity.Statistics;
import driving.school.web.app.exceptions.DataNotFoundException;

public interface StatisticsService {

	Statistics getMaleFemaleLast3Years() throws DataNotFoundException;

	Statistics getMaleFemaleThisYear() throws DataNotFoundException;

	Statistics getLicensesThisYear() throws DataNotFoundException;

	Statistics getRegistrationsThisYear() throws DataNotFoundException;

	Statistics getStartingEndingLessonsPerMonthThisYear() throws DataNotFoundException;
}
