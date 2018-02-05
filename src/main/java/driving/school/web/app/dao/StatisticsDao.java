package driving.school.web.app.dao;

import driving.school.web.app.entity.Statistics;

public interface StatisticsDao {
	Statistics getMaleFemaleLast3Years();

	Statistics getMaleFemaleThisYear();

	Statistics getLicensesThisYear();

	Statistics getRegistrationsThisYear();

	Statistics getStartingLessonsPerMonthForThisYear();

	Statistics getEndingLessonsPerMonthForThisYear();
}
