package driving.school.web.app.dao;

import java.util.Calendar;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import driving.school.web.app.entity.Statistics;

@Repository
@Transactional
public class StatisticsDaoImpl implements StatisticsDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Statistics getMaleFemaleLast3Years() {

		Integer currentYearAge = Calendar.getInstance().get(Calendar.YEAR);

		if ((currentYearAge != null) && (currentYearAge != 0)) {
			// Calculate the last 2 years
			Integer lastYearAge = currentYearAge - 1;
			Integer lastToLastYearAge = currentYearAge - 2;

			// @formatter:off
			String queryString = "SELECT " + "SUM (CASE WHEN date_of_creation LIKE '%" + currentYearAge
					+ "' THEN 1 ELSE 0 END) AS thisYear," + "SUM (CASE WHEN date_of_creation LIKE '%" + currentYearAge
					+ "'AND Gender = 'Male' THEN 1 ELSE 0 END) AS maleOfThisYear,"
					+ "SUM (CASE WHEN date_of_creation LIKE '%" + currentYearAge
					+ "'AND Gender = 'Female' THEN 1 ELSE 0 END) AS femaleOfThisYear,"
					+ "SUM (CASE WHEN date_of_creation LIKE '%" + lastYearAge + "' THEN 1 ELSE 0 END) AS lastYear,"
					+ "SUM (CASE WHEN date_of_creation LIKE '%" + lastYearAge
					+ "'AND Gender = 'Male' THEN 1 ELSE 0 END) AS maleOfLastYear,"
					+ "SUM (CASE WHEN date_of_creation LIKE '%" + lastYearAge
					+ "'AND Gender = 'Female' THEN 1 ELSE 0 END) AS femaleOfLastYear,"
					+ "SUM (CASE WHEN date_of_creation LIKE '%" + lastToLastYearAge
					+ "' THEN 1 ELSE 0 END) AS lastToLastYear," + "SUM (CASE WHEN date_of_creation LIKE '%"
					+ lastToLastYearAge + "'AND Gender = 'Male' THEN 1 ELSE 0 END) AS maleOfLastToLastYear,"
					+ "SUM (CASE WHEN date_of_creation LIKE '%" + lastToLastYearAge
					+ "'AND Gender = 'Female' THEN 1 ELSE 0 END) AS femaleOfLastToLastYear" + " FROM Driver";
			// @formatter:on

			@SuppressWarnings("unchecked")
			List<Object[]> query = sessionFactory.getCurrentSession().createQuery(queryString).getResultList();
			Integer.valueOf(String.valueOf(query.get(0)[0]));
			Integer thisYear = Integer.valueOf(String.valueOf(query.get(0)[0]));
			Integer maleOfThisYear = Integer.valueOf(String.valueOf(query.get(0)[1]));
			Integer femaleOfThisYear = Integer.valueOf(String.valueOf(query.get(0)[2]));
			Integer lastYear = Integer.valueOf(String.valueOf(query.get(0)[3]));
			Integer maleOfLastYear = Integer.valueOf(String.valueOf(query.get(0)[4]));
			Integer femaleOfLastYear = Integer.valueOf(String.valueOf(query.get(0)[5]));
			Integer lastToLastYear = Integer.valueOf(String.valueOf(query.get(0)[6]));
			Integer maleOfLastToLastYear = Integer.valueOf(String.valueOf(query.get(0)[7]));
			Integer femaleOfLastToLastYear = Integer.valueOf(String.valueOf(query.get(0)[8]));

			Statistics statistics = new Statistics.MaleFemaleLast3Years().thisYear(thisYear)
					.maleOfThisYear(maleOfThisYear).femaleOfThisYear(femaleOfThisYear).lastYear(lastYear)
					.maleOfLastYear(maleOfLastYear).femaleOfLastYear(femaleOfLastYear).lastToLastYear(lastToLastYear)
					.maleOfLastToLastYear(maleOfLastToLastYear).femaleOfLastToLastYear(femaleOfLastToLastYear).build();

			return statistics;
		} else {
			return null;
		}
	}

	@Override
	public Statistics getMaleFemaleThisYear() {

		Integer currentYearAge = Calendar.getInstance().get(Calendar.YEAR);

		if ((currentYearAge != null) && (currentYearAge != 0)) {

			// @formatter:off
			String queryString = "SELECT " + "SUM (CASE WHEN date_of_creation LIKE '%" + currentYearAge
					+ "' THEN 1 ELSE 0 END) AS thisYear," + "SUM (CASE WHEN date_of_creation LIKE '%" + currentYearAge
					+ "'AND Gender = 'Male' THEN 1 ELSE 0 END) AS maleOfThisYear,"
					+ "SUM (CASE WHEN date_of_creation LIKE '%" + currentYearAge
					+ "'AND Gender = 'Female' THEN 1 ELSE 0 END) AS femaleOfThisYear" + " FROM Driver ";
			// @formatter:on

			@SuppressWarnings("unchecked")
			List<Object[]> query = sessionFactory.getCurrentSession().createQuery(queryString).getResultList();
			Integer.valueOf(String.valueOf(query.get(0)[0]));
			Integer thisYear = Integer.valueOf(String.valueOf(query.get(0)[0]));
			Integer maleOfThisYear = Integer.valueOf(String.valueOf(query.get(0)[1]));
			Integer femaleOfThisYear = Integer.valueOf(String.valueOf(query.get(0)[2]));

			Statistics statistics = new Statistics.MaleFemaleLast3Years().thisYear(thisYear)
					.maleOfThisYear(maleOfThisYear).femaleOfThisYear(femaleOfThisYear).build();

			return statistics;
		} else {
			return null;
		}
	}

	@Override
	public Statistics getLicensesThisYear() {

		Integer currentYearAge = Calendar.getInstance().get(Calendar.YEAR);

		if ((currentYearAge != null) && (currentYearAge != 0)) {

			// @formatter:off
			String queryString = "SELECT " + "SUM (CASE WHEN am_date LIKE '%" + currentYearAge
					+ "'AND AM = 'true'  THEN 1 ELSE 0 END) AS AMForThisYear," + "SUM (CASE WHEN a1_date LIKE '%"
					+ currentYearAge + "'AND A1 = 'true' THEN 1 ELSE 0 END) AS A1ForThisYear,"
					+ "SUM (CASE WHEN a2_date LIKE '%" + currentYearAge
					+ "'AND A2 = 'true' THEN 1 ELSE 0 END) AS A2ForThisYear," + "SUM (CASE WHEN a_date LIKE '%"
					+ currentYearAge + "'AND A = 'true' THEN 1 ELSE 0 END) AS AForThisYear,"
					+ "SUM (CASE WHEN b1_date LIKE '%" + currentYearAge
					+ "'AND B1 = 'true' THEN 1 ELSE 0 END) AS B1ForThisYear," + "SUM (CASE WHEN b_date LIKE '%"
					+ currentYearAge + "'AND B = 'true' THEN 1 ELSE 0 END) AS BForThisYear,"
					+ "SUM (CASE WHEN c_date LIKE '%" + currentYearAge
					+ "'AND C = 'true' THEN 1 ELSE 0 END) AS CForThisYear," + "SUM (CASE WHEN c1_date LIKE '%"
					+ currentYearAge + "'AND C1 = 'true' THEN 1 ELSE 0 END) AS C1ForThisYear,"
					+ "SUM (CASE WHEN d1_date LIKE '%" + currentYearAge
					+ "'AND D1 = 'true' THEN 1 ELSE 0 END) AS D1ForThisYear," + "SUM (CASE WHEN d_date LIKE '%"
					+ currentYearAge + "'AND D = 'true' THEN 1 ELSE 0 END) AS DForThisYear,"
					+ "SUM (CASE WHEN be_date LIKE '%" + currentYearAge
					+ "'AND BE = 'true' THEN 1 ELSE 0 END) AS BEForThisYear," + "SUM (CASE WHEN c1e_date LIKE '%"
					+ currentYearAge + "'AND C1E = 'true' THEN 1 ELSE 0 END) AS C1EForThisYear,"
					+ "SUM (CASE WHEN ce_date LIKE '%" + currentYearAge
					+ "'AND CE = 'true' THEN 1 ELSE 0 END) AS CEForThisYear," + "SUM (CASE WHEN d1e_date LIKE '%"
					+ currentYearAge + "'AND D1E = 'true' THEN 1 ELSE 0 END) AS D1EForThisYear,"
					+ "SUM (CASE WHEN de_date LIKE '%" + currentYearAge
					+ "'AND DE = 'true' THEN 1 ELSE 0 END) AS DEForThisYear" + " FROM driver_licenses";

			// @formatter:on

			@SuppressWarnings("unchecked")
			List<Object[]> query = sessionFactory.getCurrentSession().createQuery(queryString).getResultList();
			Integer.valueOf(String.valueOf(query.get(0)[0]));

			Integer aMForThisYear = Integer.valueOf(String.valueOf(query.get(0)[1]));
			Integer a1ForThisYear = Integer.valueOf(String.valueOf(query.get(0)[2]));
			Integer a2ForThisYear = Integer.valueOf(String.valueOf(query.get(0)[3]));
			Integer aForThisYear = Integer.valueOf(String.valueOf(query.get(0)[4]));
			Integer b1ForThisYear = Integer.valueOf(String.valueOf(query.get(0)[5]));
			Integer bForThisYear = Integer.valueOf(String.valueOf(query.get(0)[6]));
			Integer cForThisYear = Integer.valueOf(String.valueOf(query.get(0)[7]));
			Integer c1ForThisYear = Integer.valueOf(String.valueOf(query.get(0)[8]));
			Integer d1ForThisYear = Integer.valueOf(String.valueOf(query.get(0)[9]));
			Integer dForThisYear = Integer.valueOf(String.valueOf(query.get(0)[10]));
			Integer bEForThisYear = Integer.valueOf(String.valueOf(query.get(0)[11]));
			Integer c1EForThisYear = Integer.valueOf(String.valueOf(query.get(0)[12]));
			Integer cEForThisYear = Integer.valueOf(String.valueOf(query.get(0)[13]));
			Integer d1EForThisYear = Integer.valueOf(String.valueOf(query.get(0)[14]));
			Integer dEForThisYear = Integer.valueOf(String.valueOf(query.get(0)[15]));

			Statistics statistics = new Statistics.LicensesThisYears().aMForThisYear(aMForThisYear)
					.a1ForThisYear(a1ForThisYear).a2ForThisYear(a2ForThisYear).aForThisYear(aForThisYear)
					.b1ForThisYear(b1ForThisYear).bForThisYear(bForThisYear).cForThisYear(cForThisYear)
					.c1ForThisYear(c1ForThisYear).d1ForThisYear(d1ForThisYear).dForThisYear(dForThisYear)
					.bEForThisYear(bEForThisYear).c1EForThisYear(c1EForThisYear).cEForThisYear(cEForThisYear)
					.d1EForThisYear(d1EForThisYear).dEForThisYear(dEForThisYear).build();
			return statistics;
		} else {
			return null;
		}
	}

	@Override
	public Statistics getRegistrationsThisYear() {

		Integer currentYearAge = Calendar.getInstance().get(Calendar.YEAR);

		if ((currentYearAge != null) && (currentYearAge != 0)) {

			// @formatter:off
			String queryString = "SELECT " + "SUM (CASE WHEN date_of_creation LIKE '%/01/" + currentYearAge
					+ "' THEN 1 ELSE 0 END) AS januaryRegistries," + "SUM (CASE WHEN date_of_creation LIKE '%/02/"
					+ currentYearAge + "' THEN 1 ELSE 0 END) AS februaryRegistries,"
					+ "SUM (CASE WHEN date_of_creation LIKE '%/03/" + currentYearAge
					+ "' THEN 1 ELSE 0 END) AS marchRegistries," + "SUM (CASE WHEN date_of_creation LIKE '%/04/"
					+ currentYearAge + "' THEN 1 ELSE 0 END) AS aprilRegistries,"
					+ "SUM (CASE WHEN date_of_creation LIKE '%/05/" + currentYearAge
					+ "' THEN 1 ELSE 0 END) AS mayRegistries," + "SUM (CASE WHEN date_of_creation LIKE '%/06/"
					+ currentYearAge + "' THEN 1 ELSE 0 END) AS juneRegistries,"
					+ "SUM (CASE WHEN date_of_creation LIKE '%/07/" + currentYearAge
					+ "' THEN 1 ELSE 0 END) AS julyRegistries," + "SUM (CASE WHEN date_of_creation LIKE '%/08/"
					+ currentYearAge + "' THEN 1 ELSE 0 END) AS augustRegistries,"
					+ "SUM (CASE WHEN date_of_creation LIKE '%/09/" + currentYearAge
					+ "' THEN 1 ELSE 0 END) AS septemberRegistries," + "SUM (CASE WHEN date_of_creation LIKE '%/10/"
					+ currentYearAge + "' THEN 1 ELSE 0 END) AS octoberRegistries,"
					+ "SUM (CASE WHEN date_of_creation LIKE '%/11/" + currentYearAge
					+ "' THEN 1 ELSE 0 END) AS novemberRegistries," + "SUM (CASE WHEN date_of_creation LIKE '%/12/"
					+ currentYearAge + "' THEN 1 ELSE 0 END) AS decemberRegistries" + " FROM Driver";

			// @formatter:on

			@SuppressWarnings("unchecked")
			List<Object[]> query = sessionFactory.getCurrentSession().createQuery(queryString).getResultList();
			Integer.valueOf(String.valueOf(query.get(0)[0]));

			Integer januaryRegistries = Integer.valueOf(String.valueOf(query.get(0)[1]));
			Integer februaryRegistries = Integer.valueOf(String.valueOf(query.get(0)[2]));
			Integer marchRegistries = Integer.valueOf(String.valueOf(query.get(0)[3]));
			Integer aprilRegistries = Integer.valueOf(String.valueOf(query.get(0)[4]));
			Integer mayRegistries = Integer.valueOf(String.valueOf(query.get(0)[4]));
			Integer juneRegistries = Integer.valueOf(String.valueOf(query.get(0)[5]));
			Integer julyRegistries = Integer.valueOf(String.valueOf(query.get(0)[6]));
			Integer augustRegistries = Integer.valueOf(String.valueOf(query.get(0)[7]));
			Integer septemberRegistries = Integer.valueOf(String.valueOf(query.get(0)[8]));
			Integer octoberRegistries = Integer.valueOf(String.valueOf(query.get(0)[9]));
			Integer novemberRegistries = Integer.valueOf(String.valueOf(query.get(0)[10]));
			Integer decemberRegistries = Integer.valueOf(String.valueOf(query.get(0)[11]));

			Statistics statistics = new Statistics.RegistriesThisYears().januaryRegistries(januaryRegistries)
					.februaryRegistries(februaryRegistries).marchRegistries(marchRegistries)
					.aprilRegistries(aprilRegistries).mayRegistries(mayRegistries).juneRegistries(juneRegistries)
					.julyRegistries(julyRegistries).augustRegistries(augustRegistries)
					.septemberRegistries(septemberRegistries).octoberRegistries(octoberRegistries)
					.novemberRegistries(novemberRegistries).decemberRegistries(decemberRegistries).build();
			return statistics;
		} else {
			return null;
		}
	}

	@Override
	public Statistics getStartingLessonsPerMonthForThisYear() {

		Integer currentYearAge = Calendar.getInstance().get(Calendar.YEAR);

		String[] LICENSES = { "AM", "A1", "A2", "A", "B1", "B", "C1", "C", "D1", "D", "BE", "C1E", "CE", "D1E", "DE" };

		Integer januaryRegistries = 0;
		Integer februaryRegistries = 0;
		Integer marchRegistries = 0;
		Integer aprilRegistries = 0;
		Integer mayRegistries = 0;
		Integer juneRegistries = 0;
		Integer julyRegistries = 0;
		Integer augustRegistries = 0;
		Integer septemberRegistries = 0;
		Integer octoberRegistries = 0;
		Integer novemberRegistries = 0;
		Integer decemberRegistries = 0;

		if ((currentYearAge != null) && (currentYearAge != 0)) {

			for (String license : LICENSES) {
				// @formatter:off
				String queryString = "SELECT " + "SUM (CASE WHEN " + license.toLowerCase() + "_date LIKE '%/01/"
						+ currentYearAge + "' THEN 1 ELSE 0 END) AS januaryStartingRegistries," + "SUM (CASE WHEN "
						+ license.toLowerCase() + "_date LIKE '%/02/" + currentYearAge
						+ "' THEN 1 ELSE 0 END) AS februaryStartingRegistries," + "SUM (CASE WHEN "
						+ license.toLowerCase() + "_date LIKE '%/03/" + currentYearAge
						+ "' THEN 1 ELSE 0 END) AS marchStartingRegistries," + "SUM (CASE WHEN " + license.toLowerCase()
						+ "_date LIKE '%/04/" + currentYearAge + "' THEN 1 ELSE 0 END) AS aprilStartingRegistries,"
						+ "SUM (CASE WHEN " + license.toLowerCase() + "_date LIKE '%/05/" + currentYearAge
						+ "' THEN 1 ELSE 0 END) AS mayStartingRegistries," + "SUM (CASE WHEN " + license.toLowerCase()
						+ "_date LIKE '%/06/" + currentYearAge + "' THEN 1 ELSE 0 END) AS juneStartingRegistries,"
						+ "SUM (CASE WHEN " + license.toLowerCase() + "_date LIKE '%/07/" + currentYearAge
						+ "' THEN 1 ELSE 0 END) AS julyStartingRegistries," + "SUM (CASE WHEN " + license.toLowerCase()
						+ "_date LIKE '%/08/" + currentYearAge + "' THEN 1 ELSE 0 END) AS augustStartingRegistries,"
						+ "SUM (CASE WHEN " + license.toLowerCase() + "_date LIKE '%/09/" + currentYearAge
						+ "' THEN 1 ELSE 0 END) AS septemberStartingRegistries," + "SUM (CASE WHEN "
						+ license.toLowerCase() + "_date LIKE '%/10/" + currentYearAge
						+ "' THEN 1 ELSE 0 END) AS octoberStartingRegistries," + "SUM (CASE WHEN "
						+ license.toLowerCase() + "_date LIKE '%/11/" + currentYearAge
						+ "' THEN 1 ELSE 0 END) AS novemberStartingRegistries," + "SUM (CASE WHEN "
						+ license.toLowerCase() + "_date LIKE '%/12/" + currentYearAge
						+ "' THEN 1 ELSE 0 END) AS decemberStartingRegistries" + " FROM driver_licenses";

				// @formatter:on
				@SuppressWarnings("unchecked")
				List<Object[]> query = sessionFactory.getCurrentSession().createQuery(queryString).getResultList();

				januaryRegistries += Integer.valueOf(String.valueOf(query.get(0)[0]));
				februaryRegistries += Integer.valueOf(String.valueOf(query.get(0)[1]));
				marchRegistries += Integer.valueOf(String.valueOf(query.get(0)[2]));
				aprilRegistries += Integer.valueOf(String.valueOf(query.get(0)[3]));
				mayRegistries += Integer.valueOf(String.valueOf(query.get(0)[4]));
				juneRegistries += Integer.valueOf(String.valueOf(query.get(0)[5]));
				julyRegistries += Integer.valueOf(String.valueOf(query.get(0)[6]));
				augustRegistries += Integer.valueOf(String.valueOf(query.get(0)[7]));
				septemberRegistries += Integer.valueOf(String.valueOf(query.get(0)[8]));
				octoberRegistries += Integer.valueOf(String.valueOf(query.get(0)[9]));
				novemberRegistries += Integer.valueOf(String.valueOf(query.get(0)[10]));
				decemberRegistries += Integer.valueOf(String.valueOf(query.get(0)[11]));
			}

			Statistics statistics = new Statistics.StartingRegistriesThisYears()
					.januaryStartingRegistries(januaryRegistries).februaryStartingRegistries(februaryRegistries)
					.marchStartingRegistries(marchRegistries).aprilStartingRegistries(aprilRegistries)
					.mayStartingRegistries(mayRegistries).juneStartingRegistries(juneRegistries)
					.julyStartingRegistries(julyRegistries).augustStartingRegistries(augustRegistries)
					.septemberStartingRegistries(septemberRegistries).octoberStartingRegistries(octoberRegistries)
					.novemberStartingRegistries(novemberRegistries).decemberStartingRegistries(decemberRegistries)
					.build();
			return statistics;

		} else {
			return null;
		}
	}

	@Override
	public Statistics getEndingLessonsPerMonthForThisYear() {

		Integer currentYearAge = Calendar.getInstance().get(Calendar.YEAR);

		String[] LICENSES = { "AM", "A1", "A2", "A", "B1", "B", "C1", "C", "D1", "D", "BE", "C1E", "CE", "D1E", "DE" };

		Integer januaryRegistries = 0;
		Integer februaryRegistries = 0;
		Integer marchRegistries = 0;
		Integer aprilRegistries = 0;
		Integer mayRegistries = 0;
		Integer juneRegistries = 0;
		Integer julyRegistries = 0;
		Integer augustRegistries = 0;
		Integer septemberRegistries = 0;
		Integer octoberRegistries = 0;
		Integer novemberRegistries = 0;
		Integer decemberRegistries = 0;

		if ((currentYearAge != null) && (currentYearAge != 0)) {

			for (String license : LICENSES) {
				// @formatter:off
				String queryString = "SELECT " + "SUM (CASE WHEN " + license.toLowerCase()
						+ "_finished_date LIKE '%/01/" + currentYearAge
						+ "' THEN 1 ELSE 0 END) AS januaryEndingRegistries," + "SUM (CASE WHEN " + license.toLowerCase()
						+ "_finished_date LIKE '%/02/" + currentYearAge
						+ "' THEN 1 ELSE 0 END) AS februaryEndingRegistries," + "SUM (CASE WHEN "
						+ license.toLowerCase() + "_finished_date LIKE '%/03/" + currentYearAge
						+ "' THEN 1 ELSE 0 END) AS marchEndingRegistries," + "SUM (CASE WHEN " + license.toLowerCase()
						+ "_finished_date LIKE '%/04/" + currentYearAge
						+ "' THEN 1 ELSE 0 END) AS aprilEndingRegistries," + "SUM (CASE WHEN " + license.toLowerCase()
						+ "_finished_date LIKE '%/05/" + currentYearAge + "' THEN 1 ELSE 0 END) AS mayEndingRegistries,"
						+ "SUM (CASE WHEN " + license.toLowerCase() + "_finished_date LIKE '%/06/" + currentYearAge
						+ "' THEN 1 ELSE 0 END) AS juneEndingRegistries," + "SUM (CASE WHEN " + license.toLowerCase()
						+ "_finished_date LIKE '%/07/" + currentYearAge
						+ "' THEN 1 ELSE 0 END) AS julyEndingRegistries," + "SUM (CASE WHEN " + license.toLowerCase()
						+ "_finished_date LIKE '%/08/" + currentYearAge
						+ "' THEN 1 ELSE 0 END) AS augustEndingRegistries," + "SUM (CASE WHEN " + license.toLowerCase()
						+ "_finished_date LIKE '%/09/" + currentYearAge
						+ "' THEN 1 ELSE 0 END) AS septemberEndingRegistries," + "SUM (CASE WHEN "
						+ license.toLowerCase() + "_finished_date LIKE '%/10/" + currentYearAge
						+ "' THEN 1 ELSE 0 END) AS octoberEndingRegistries," + "SUM (CASE WHEN " + license.toLowerCase()
						+ "_finished_date LIKE '%/11/" + currentYearAge
						+ "' THEN 1 ELSE 0 END) AS novemberEndingRegistries," + "SUM (CASE WHEN "
						+ license.toLowerCase() + "_finished_date LIKE '%/12/" + currentYearAge
						+ "' THEN 1 ELSE 0 END) AS decemberEndingRegistries" + " FROM driver_licenses";

				// @formatter:on
				@SuppressWarnings("unchecked")
				List<Object[]> query = sessionFactory.getCurrentSession().createQuery(queryString).getResultList();

				januaryRegistries += Integer.valueOf(String.valueOf(query.get(0)[0]));
				februaryRegistries += Integer.valueOf(String.valueOf(query.get(0)[1]));
				marchRegistries += Integer.valueOf(String.valueOf(query.get(0)[2]));
				aprilRegistries += Integer.valueOf(String.valueOf(query.get(0)[3]));
				mayRegistries += Integer.valueOf(String.valueOf(query.get(0)[4]));
				juneRegistries += Integer.valueOf(String.valueOf(query.get(0)[5]));
				julyRegistries += Integer.valueOf(String.valueOf(query.get(0)[6]));
				augustRegistries += Integer.valueOf(String.valueOf(query.get(0)[7]));
				septemberRegistries += Integer.valueOf(String.valueOf(query.get(0)[8]));
				octoberRegistries += Integer.valueOf(String.valueOf(query.get(0)[9]));
				novemberRegistries += Integer.valueOf(String.valueOf(query.get(0)[10]));
				decemberRegistries += Integer.valueOf(String.valueOf(query.get(0)[11]));
			}

			Statistics statistics = new Statistics.EndingRegistriesThisYears()
					.januaryEndingRegistries(januaryRegistries).februaryEndingRegistries(februaryRegistries)
					.marchEndingRegistries(marchRegistries).aprilEndingRegistries(aprilRegistries)
					.mayEndingRegistries(mayRegistries).juneEndingRegistries(juneRegistries)
					.julyEndingRegistries(julyRegistries).augustEndingRegistries(augustRegistries)
					.septemberEndingRegistries(septemberRegistries).octoberEndingRegistries(octoberRegistries)
					.novemberEndingRegistries(novemberRegistries).decemberEndingRegistries(decemberRegistries).build();
			return statistics;
		} else {
			return null;
		}
	}

}
