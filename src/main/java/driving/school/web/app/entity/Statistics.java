package driving.school.web.app.entity;

public class Statistics {

	Integer thisYear = 0;
	Integer maleOfThisYear = 0;
	Integer femaleOfThisYear = 0;
	Integer lastYear = 0;
	Integer maleOfLastYear = 0;
	Integer femaleOfLastYear = 0;
	Integer lastToLastYear = 0;
	Integer maleOfLastToLastYear = 0;
	Integer femaleOfLastToLastYear = 0;
	// **
	Integer aMForThisYear = 0;
	Integer a1ForThisYear = 0;
	Integer a2ForThisYear = 0;
	Integer aForThisYear = 0;
	Integer b1ForThisYear = 0;
	Integer bForThisYear = 0;
	Integer cForThisYear = 0;
	Integer c1ForThisYear = 0;
	Integer dForThisYear = 0;
	Integer d1ForThisYear = 0;
	Integer bEForThisYear = 0;
	Integer c1EForThisYear = 0;
	Integer cEForThisYear = 0;
	Integer d1EForThisYear = 0;
	Integer dEForThisYear = 0;
	// **
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
	// **
	Integer januaryStartingRegistries = 0;
	Integer februaryStartingRegistries = 0;
	Integer marchStartingRegistries = 0;
	Integer aprilStartingRegistries = 0;
	Integer mayStartingRegistries = 0;
	Integer juneStartingRegistries = 0;
	Integer julyStartingRegistries = 0;
	Integer augustStartingRegistries = 0;
	Integer septemberStartingRegistries = 0;
	Integer octoberStartingRegistries = 0;
	Integer novemberStartingRegistries = 0;
	Integer decemberStartingRegistries = 0;
	// **
	Integer januaryEndingRegistries = 0;
	Integer februaryEndingRegistries = 0;
	Integer marchEndingRegistries = 0;
	Integer aprilEndingRegistries = 0;
	Integer mayEndingRegistries = 0;
	Integer juneEndingRegistries = 0;
	Integer julyEndingRegistries = 0;
	Integer augustEndingRegistries = 0;
	Integer septemberEndingRegistries = 0;
	Integer octoberEndingRegistries = 0;
	Integer novemberEndingRegistries = 0;
	Integer decemberEndingRegistries = 0;

	public Statistics() {

	}

	private Statistics(MaleFemaleLast3Years builder) {
		this.thisYear = builder.thisYear;
		this.maleOfThisYear = builder.maleOfThisYear;
		this.femaleOfThisYear = builder.femaleOfThisYear;
		this.lastYear = builder.lastYear;
		this.maleOfLastYear = builder.maleOfLastYear;
		this.femaleOfLastYear = builder.femaleOfLastYear;
		this.lastToLastYear = builder.lastToLastYear;
		this.maleOfLastToLastYear = builder.maleOfLastToLastYear;
		this.femaleOfLastToLastYear = builder.femaleOfLastToLastYear;

	}

	private Statistics(LicensesThisYears builder) {
		this.aMForThisYear = builder.aMForThisYear;
		this.a1ForThisYear = builder.a1ForThisYear;
		this.a2ForThisYear = builder.a2ForThisYear;
		this.aForThisYear = builder.aForThisYear;
		this.b1ForThisYear = builder.b1ForThisYear;
		this.bForThisYear = builder.bForThisYear;
		this.cForThisYear = builder.cForThisYear;
		this.c1ForThisYear = builder.c1ForThisYear;
		this.dForThisYear = builder.dForThisYear;
		this.d1ForThisYear = builder.d1ForThisYear;
		this.bEForThisYear = builder.bEForThisYear;
		this.c1EForThisYear = builder.c1EForThisYear;
		this.cEForThisYear = builder.cEForThisYear;
		this.d1EForThisYear = builder.d1EForThisYear;
		this.dEForThisYear = builder.dEForThisYear;

	}

	private Statistics(RegistriesThisYears builder) {
		this.januaryRegistries = builder.januaryRegistries;
		this.februaryRegistries = builder.februaryRegistries;
		this.marchRegistries = builder.marchRegistries;
		this.aprilRegistries = builder.aprilRegistries;
		this.mayRegistries = builder.mayRegistries;
		this.juneRegistries = builder.juneRegistries;
		this.julyRegistries = builder.julyRegistries;
		this.augustRegistries = builder.augustRegistries;
		this.septemberRegistries = builder.septemberRegistries;
		this.octoberRegistries = builder.octoberRegistries;
		this.novemberRegistries = builder.novemberRegistries;
		this.decemberRegistries = builder.decemberRegistries;

	}

	private Statistics(StartingRegistriesThisYears builder) {
		this.januaryStartingRegistries = builder.januaryStartingRegistries;
		this.februaryStartingRegistries = builder.februaryStartingRegistries;
		this.marchStartingRegistries = builder.marchStartingRegistries;
		this.aprilStartingRegistries = builder.aprilStartingRegistries;
		this.mayStartingRegistries = builder.mayStartingRegistries;
		this.juneStartingRegistries = builder.juneStartingRegistries;
		this.julyStartingRegistries = builder.julyStartingRegistries;
		this.augustStartingRegistries = builder.augustStartingRegistries;
		this.septemberStartingRegistries = builder.septemberStartingRegistries;
		this.octoberStartingRegistries = builder.octoberStartingRegistries;
		this.novemberStartingRegistries = builder.novemberStartingRegistries;
		this.decemberStartingRegistries = builder.decemberStartingRegistries;

	}

	private Statistics(StartingEndingRegistriesThisYear builder) {

		this.januaryStartingRegistries = builder.januaryStartingRegistries;
		this.februaryStartingRegistries = builder.februaryStartingRegistries;
		this.marchStartingRegistries = builder.marchStartingRegistries;
		this.aprilStartingRegistries = builder.aprilStartingRegistries;
		this.mayStartingRegistries = builder.mayStartingRegistries;
		this.juneStartingRegistries = builder.juneStartingRegistries;
		this.julyStartingRegistries = builder.julyStartingRegistries;
		this.augustStartingRegistries = builder.augustStartingRegistries;
		this.septemberStartingRegistries = builder.septemberStartingRegistries;
		this.octoberStartingRegistries = builder.octoberStartingRegistries;
		this.novemberStartingRegistries = builder.novemberStartingRegistries;
		this.decemberStartingRegistries = builder.decemberStartingRegistries;

		this.januaryEndingRegistries = builder.januaryEndingRegistries;
		this.februaryEndingRegistries = builder.februaryEndingRegistries;
		this.marchEndingRegistries = builder.marchEndingRegistries;
		this.aprilEndingRegistries = builder.aprilEndingRegistries;
		this.mayEndingRegistries = builder.mayEndingRegistries;
		this.juneEndingRegistries = builder.juneEndingRegistries;
		this.julyEndingRegistries = builder.julyEndingRegistries;
		this.augustEndingRegistries = builder.augustEndingRegistries;
		this.septemberEndingRegistries = builder.septemberEndingRegistries;
		this.octoberEndingRegistries = builder.octoberEndingRegistries;
		this.novemberEndingRegistries = builder.novemberEndingRegistries;
		this.decemberEndingRegistries = builder.decemberEndingRegistries;

	}

	private Statistics(EndingRegistriesThisYears builder) {
		this.januaryEndingRegistries = builder.januaryEndingRegistries;
		this.februaryEndingRegistries = builder.februaryEndingRegistries;
		this.marchEndingRegistries = builder.marchEndingRegistries;
		this.aprilEndingRegistries = builder.aprilEndingRegistries;
		this.mayEndingRegistries = builder.mayEndingRegistries;
		this.juneEndingRegistries = builder.juneEndingRegistries;
		this.julyEndingRegistries = builder.julyEndingRegistries;
		this.augustEndingRegistries = builder.augustEndingRegistries;
		this.septemberEndingRegistries = builder.septemberEndingRegistries;
		this.octoberEndingRegistries = builder.octoberEndingRegistries;
		this.novemberEndingRegistries = builder.novemberEndingRegistries;
		this.decemberEndingRegistries = builder.decemberEndingRegistries;

	}

	public static class MaleFemaleLast3Years {
		private Integer thisYear = 0;
		private Integer maleOfThisYear = 0;
		private Integer femaleOfThisYear = 0;
		private Integer lastYear = 0;
		private Integer maleOfLastYear = 0;
		private Integer femaleOfLastYear = 0;
		private Integer lastToLastYear = 0;
		private Integer maleOfLastToLastYear = 0;
		private Integer femaleOfLastToLastYear = 0;

		public MaleFemaleLast3Years thisYear(Integer thisYear) {
			this.thisYear = thisYear;
			return this;
		}

		public MaleFemaleLast3Years maleOfThisYear(Integer maleOfThisYear) {
			this.maleOfThisYear = maleOfThisYear;
			return this;
		}

		public MaleFemaleLast3Years femaleOfThisYear(Integer femaleOfThisYear) {
			this.femaleOfThisYear = femaleOfThisYear;
			return this;
		}

		public MaleFemaleLast3Years lastYear(Integer lastYear) {
			this.lastYear = lastYear;
			return this;
		}

		public MaleFemaleLast3Years maleOfLastYear(Integer maleOfLastYear) {
			this.maleOfLastYear = maleOfLastYear;
			return this;
		}

		public MaleFemaleLast3Years femaleOfLastYear(Integer femaleOfLastYear) {
			this.femaleOfLastYear = femaleOfLastYear;
			return this;
		}

		public MaleFemaleLast3Years lastToLastYear(Integer lastToLastYear) {
			this.lastToLastYear = lastToLastYear;
			return this;
		}

		public MaleFemaleLast3Years maleOfLastToLastYear(Integer maleOfLastToLastYear) {
			this.maleOfLastToLastYear = maleOfLastToLastYear;
			return this;
		}

		public MaleFemaleLast3Years femaleOfLastToLastYear(Integer femaleOfLastToLastYear) {
			this.femaleOfLastToLastYear = femaleOfLastToLastYear;
			return this;
		}

		public Statistics build() {
			Statistics maleFemaleLast3Years = new Statistics(this);
			return maleFemaleLast3Years;
		}

	}

	public static class LicensesThisYears {
		private Integer aMForThisYear = 0;
		private Integer a1ForThisYear = 0;
		private Integer a2ForThisYear = 0;
		private Integer aForThisYear = 0;
		private Integer b1ForThisYear = 0;
		private Integer bForThisYear = 0;
		private Integer cForThisYear = 0;
		private Integer c1ForThisYear = 0;
		private Integer dForThisYear = 0;
		private Integer d1ForThisYear = 0;
		private Integer bEForThisYear = 0;
		private Integer c1EForThisYear = 0;
		private Integer cEForThisYear = 0;
		private Integer d1EForThisYear = 0;
		private Integer dEForThisYear = 0;

		public LicensesThisYears aMForThisYear(Integer aMForThisYear) {
			this.aMForThisYear = aMForThisYear;
			return this;
		}

		public LicensesThisYears a1ForThisYear(Integer a1ForThisYear) {
			this.a1ForThisYear = a1ForThisYear;
			return this;
		}

		public LicensesThisYears a2ForThisYear(Integer a2ForThisYear) {
			this.a2ForThisYear = a2ForThisYear;
			return this;
		}

		public LicensesThisYears aForThisYear(Integer aForThisYear) {
			this.aForThisYear = aForThisYear;
			return this;
		}

		public LicensesThisYears b1ForThisYear(Integer b1ForThisYear) {
			this.b1ForThisYear = b1ForThisYear;
			return this;
		}

		public LicensesThisYears bForThisYear(Integer bForThisYear) {
			this.bForThisYear = bForThisYear;
			return this;
		}

		public LicensesThisYears cForThisYear(Integer cForThisYear) {
			this.cForThisYear = cForThisYear;
			return this;
		}

		public LicensesThisYears c1ForThisYear(Integer c1ForThisYear) {
			this.c1ForThisYear = c1ForThisYear;
			return this;
		}

		public LicensesThisYears dForThisYear(Integer dForThisYear) {
			this.dForThisYear = dForThisYear;
			return this;
		}

		public LicensesThisYears d1ForThisYear(Integer d1ForThisYear) {
			this.d1ForThisYear = d1ForThisYear;
			return this;
		}

		public LicensesThisYears bEForThisYear(Integer bEForThisYear) {
			this.bEForThisYear = bEForThisYear;
			return this;
		}

		public LicensesThisYears c1EForThisYear(Integer c1EForThisYear) {
			this.c1EForThisYear = c1EForThisYear;
			return this;
		}

		public LicensesThisYears cEForThisYear(Integer cEForThisYear) {
			this.cEForThisYear = cEForThisYear;
			return this;
		}

		public LicensesThisYears d1EForThisYear(Integer d1EForThisYear) {
			this.d1EForThisYear = d1EForThisYear;
			return this;
		}

		public LicensesThisYears dEForThisYear(Integer dEForThisYear) {
			this.dEForThisYear = dEForThisYear;
			return this;
		}

		public Statistics build() {
			Statistics licensesThisYears = new Statistics(this);
			return licensesThisYears;
		}

	}

	public static class RegistriesThisYears {
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

		public RegistriesThisYears januaryRegistries(Integer januaryRegistries) {
			this.januaryRegistries = januaryRegistries;
			return this;
		}

		public RegistriesThisYears februaryRegistries(Integer februaryRegistries) {
			this.februaryRegistries = februaryRegistries;
			return this;
		}

		public RegistriesThisYears marchRegistries(Integer marchRegistries) {
			this.marchRegistries = marchRegistries;
			return this;
		}

		public RegistriesThisYears aprilRegistries(Integer aprilRegistries) {
			this.aprilRegistries = aprilRegistries;
			return this;
		}

		public RegistriesThisYears mayRegistries(Integer mayRegistries) {
			this.mayRegistries = mayRegistries;
			return this;
		}

		public RegistriesThisYears juneRegistries(Integer juneRegistries) {
			this.juneRegistries = juneRegistries;
			return this;
		}

		public RegistriesThisYears julyRegistries(Integer julyRegistries) {
			this.julyRegistries = julyRegistries;
			return this;
		}

		public RegistriesThisYears augustRegistries(Integer augustRegistries) {
			this.augustRegistries = augustRegistries;
			return this;
		}

		public RegistriesThisYears septemberRegistries(Integer septemberRegistries) {
			this.septemberRegistries = septemberRegistries;
			return this;
		}

		public RegistriesThisYears octoberRegistries(Integer octoberRegistries) {
			this.octoberRegistries = octoberRegistries;
			return this;
		}

		public RegistriesThisYears novemberRegistries(Integer novemberRegistries) {
			this.novemberRegistries = novemberRegistries;
			return this;
		}

		public RegistriesThisYears decemberRegistries(Integer decemberRegistries) {
			this.decemberRegistries = decemberRegistries;
			return this;
		}

		public Statistics build() {
			Statistics registriesThisYears = new Statistics(this);
			return registriesThisYears;
		}

	}

	public static class StartingRegistriesThisYears {
		Integer januaryStartingRegistries = 0;
		Integer februaryStartingRegistries = 0;
		Integer marchStartingRegistries = 0;
		Integer aprilStartingRegistries = 0;
		Integer mayStartingRegistries = 0;
		Integer juneStartingRegistries = 0;
		Integer julyStartingRegistries = 0;
		Integer augustStartingRegistries = 0;
		Integer septemberStartingRegistries = 0;
		Integer octoberStartingRegistries = 0;
		Integer novemberStartingRegistries = 0;
		Integer decemberStartingRegistries = 0;

		public StartingRegistriesThisYears januaryStartingRegistries(Integer januaryStartingRegistries) {
			this.januaryStartingRegistries = januaryStartingRegistries;
			return this;
		}

		public StartingRegistriesThisYears februaryStartingRegistries(Integer februaryStartingRegistries) {
			this.februaryStartingRegistries = februaryStartingRegistries;
			return this;
		}

		public StartingRegistriesThisYears marchStartingRegistries(Integer marchStartingRegistries) {
			this.marchStartingRegistries = marchStartingRegistries;
			return this;
		}

		public StartingRegistriesThisYears aprilStartingRegistries(Integer aprilStartingRegistries) {
			this.aprilStartingRegistries = aprilStartingRegistries;
			return this;
		}

		public StartingRegistriesThisYears mayStartingRegistries(Integer mayStartingRegistries) {
			this.mayStartingRegistries = mayStartingRegistries;
			return this;
		}

		public StartingRegistriesThisYears juneStartingRegistries(Integer juneStartingRegistries) {
			this.juneStartingRegistries = juneStartingRegistries;
			return this;
		}

		public StartingRegistriesThisYears julyStartingRegistries(Integer julyStartingRegistries) {
			this.julyStartingRegistries = julyStartingRegistries;
			return this;
		}

		public StartingRegistriesThisYears augustStartingRegistries(Integer augustStartingRegistries) {
			this.augustStartingRegistries = augustStartingRegistries;
			return this;
		}

		public StartingRegistriesThisYears septemberStartingRegistries(Integer septemberStartingRegistries) {
			this.septemberStartingRegistries = septemberStartingRegistries;
			return this;
		}

		public StartingRegistriesThisYears octoberStartingRegistries(Integer octoberStartingRegistries) {
			this.octoberStartingRegistries = octoberStartingRegistries;
			return this;
		}

		public StartingRegistriesThisYears novemberStartingRegistries(Integer novemberStartingRegistries) {
			this.novemberStartingRegistries = novemberStartingRegistries;
			return this;
		}

		public StartingRegistriesThisYears decemberStartingRegistries(Integer decemberStartingRegistries) {
			this.decemberStartingRegistries = decemberStartingRegistries;
			return this;
		}

		public Statistics build() {
			Statistics registriesThisYears = new Statistics(this);
			return registriesThisYears;
		}

	}

	public static class StartingEndingRegistriesThisYear {

		Integer januaryStartingRegistries = 0;
		Integer februaryStartingRegistries = 0;
		Integer marchStartingRegistries = 0;
		Integer aprilStartingRegistries = 0;
		Integer mayStartingRegistries = 0;
		Integer juneStartingRegistries = 0;
		Integer julyStartingRegistries = 0;
		Integer augustStartingRegistries = 0;
		Integer septemberStartingRegistries = 0;
		Integer octoberStartingRegistries = 0;
		Integer novemberStartingRegistries = 0;
		Integer decemberStartingRegistries = 0;

		Integer januaryEndingRegistries = 0;
		Integer februaryEndingRegistries = 0;
		Integer marchEndingRegistries = 0;
		Integer aprilEndingRegistries = 0;
		Integer mayEndingRegistries = 0;
		Integer juneEndingRegistries = 0;
		Integer julyEndingRegistries = 0;
		Integer augustEndingRegistries = 0;
		Integer septemberEndingRegistries = 0;
		Integer octoberEndingRegistries = 0;
		Integer novemberEndingRegistries = 0;
		Integer decemberEndingRegistries = 0;

		public StartingEndingRegistriesThisYear startingEndingRegistriesThisYear(Statistics startingStatistics,
				Statistics endingStatistics) {
			this.januaryStartingRegistries = startingStatistics.januaryStartingRegistries;
			this.februaryStartingRegistries = startingStatistics.februaryStartingRegistries;
			this.marchStartingRegistries = startingStatistics.marchStartingRegistries;
			this.aprilStartingRegistries = startingStatistics.aprilStartingRegistries;
			this.mayStartingRegistries = startingStatistics.mayStartingRegistries;
			this.juneStartingRegistries = startingStatistics.juneStartingRegistries;
			this.julyStartingRegistries = startingStatistics.julyStartingRegistries;
			this.augustStartingRegistries = startingStatistics.augustStartingRegistries;
			this.septemberStartingRegistries = startingStatistics.septemberStartingRegistries;
			this.octoberStartingRegistries = startingStatistics.octoberStartingRegistries;
			this.novemberStartingRegistries = startingStatistics.novemberStartingRegistries;
			this.decemberStartingRegistries = startingStatistics.decemberStartingRegistries;

			this.januaryEndingRegistries = endingStatistics.januaryEndingRegistries;
			this.februaryEndingRegistries = endingStatistics.februaryEndingRegistries;
			this.marchEndingRegistries = endingStatistics.marchEndingRegistries;
			this.aprilEndingRegistries = endingStatistics.aprilEndingRegistries;
			this.mayEndingRegistries = endingStatistics.mayEndingRegistries;
			this.juneEndingRegistries = endingStatistics.juneEndingRegistries;
			this.julyEndingRegistries = endingStatistics.julyEndingRegistries;
			this.augustEndingRegistries = endingStatistics.augustEndingRegistries;
			this.septemberEndingRegistries = endingStatistics.septemberEndingRegistries;
			this.octoberEndingRegistries = endingStatistics.octoberEndingRegistries;
			this.novemberEndingRegistries = endingStatistics.novemberEndingRegistries;
			this.decemberEndingRegistries = endingStatistics.decemberEndingRegistries;

			return this;
		}

		public Statistics build() {
			Statistics startingEndingRegistriesThisYear = new Statistics(this);
			return startingEndingRegistriesThisYear;
		}
	}

	public static class EndingRegistriesThisYears {
		Integer januaryEndingRegistries = 0;
		Integer februaryEndingRegistries = 0;
		Integer marchEndingRegistries = 0;
		Integer aprilEndingRegistries = 0;
		Integer mayEndingRegistries = 0;
		Integer juneEndingRegistries = 0;
		Integer julyEndingRegistries = 0;
		Integer augustEndingRegistries = 0;
		Integer septemberEndingRegistries = 0;
		Integer octoberEndingRegistries = 0;
		Integer novemberEndingRegistries = 0;
		Integer decemberEndingRegistries = 0;

		public EndingRegistriesThisYears januaryEndingRegistries(Integer januaryEndingRegistries) {
			this.januaryEndingRegistries = januaryEndingRegistries;
			return this;
		}

		public EndingRegistriesThisYears februaryEndingRegistries(Integer februaryEndingRegistries) {
			this.februaryEndingRegistries = februaryEndingRegistries;
			return this;
		}

		public EndingRegistriesThisYears marchEndingRegistries(Integer marchEndingRegistries) {
			this.marchEndingRegistries = marchEndingRegistries;
			return this;
		}

		public EndingRegistriesThisYears aprilEndingRegistries(Integer aprilEndingRegistries) {
			this.aprilEndingRegistries = aprilEndingRegistries;
			return this;
		}

		public EndingRegistriesThisYears mayEndingRegistries(Integer mayEndingRegistries) {
			this.mayEndingRegistries = mayEndingRegistries;
			return this;
		}

		public EndingRegistriesThisYears juneEndingRegistries(Integer juneEndingRegistries) {
			this.juneEndingRegistries = juneEndingRegistries;
			return this;
		}

		public EndingRegistriesThisYears julyEndingRegistries(Integer julyEndingRegistries) {
			this.julyEndingRegistries = julyEndingRegistries;
			return this;
		}

		public EndingRegistriesThisYears augustEndingRegistries(Integer augustEndingRegistries) {
			this.augustEndingRegistries = augustEndingRegistries;
			return this;
		}

		public EndingRegistriesThisYears septemberEndingRegistries(Integer septemberEndingRegistries) {
			this.septemberEndingRegistries = septemberEndingRegistries;
			return this;
		}

		public EndingRegistriesThisYears octoberEndingRegistries(Integer octoberEndingRegistries) {
			this.octoberEndingRegistries = octoberEndingRegistries;
			return this;
		}

		public EndingRegistriesThisYears novemberEndingRegistries(Integer novemberEndingRegistries) {
			this.novemberEndingRegistries = novemberEndingRegistries;
			return this;
		}

		public EndingRegistriesThisYears decemberEndingRegistries(Integer decemberEndingRegistries) {
			this.decemberEndingRegistries = decemberEndingRegistries;
			return this;
		}

		public Statistics build() {
			Statistics registriesThisYears = new Statistics(this);
			return registriesThisYears;
		}

	}

	@Override
	public String toString() {
		return "Statistics [thisYear=" + thisYear + ", maleOfThisYear=" + maleOfThisYear + ", femaleOfThisYear="
				+ femaleOfThisYear + ", lastYear=" + lastYear + ", maleOfLastYear=" + maleOfLastYear
				+ ", femaleOfLastYear=" + femaleOfLastYear + ", lastToLastYear=" + lastToLastYear
				+ ", maleOfLastToLastYear=" + maleOfLastToLastYear + ", femaleOfLastToLastYear="
				+ femaleOfLastToLastYear + ", aMForThisYear=" + aMForThisYear + ", a1ForThisYear=" + a1ForThisYear
				+ ", a2ForThisYear=" + a2ForThisYear + ", aForThisYear=" + aForThisYear + ", b1ForThisYear="
				+ b1ForThisYear + ", bForThisYear=" + bForThisYear + ", cForThisYear=" + cForThisYear
				+ ", c1ForThisYear=" + c1ForThisYear + ", dForThisYear=" + dForThisYear + ", d1ForThisYear="
				+ d1ForThisYear + ", bEForThisYear=" + bEForThisYear + ", c1EForThisYear=" + c1EForThisYear
				+ ", cEForThisYear=" + cEForThisYear + ", d1EForThisYear=" + d1EForThisYear + ", dEForThisYear="
				+ dEForThisYear + ", januaryRegistries=" + januaryRegistries + ", februaryRegistries="
				+ februaryRegistries + ", marchRegistries=" + marchRegistries + ", aprilRegistries=" + aprilRegistries
				+ ", mayRegistries=" + mayRegistries + ", juneRegistries=" + juneRegistries + ", julyRegistries="
				+ julyRegistries + ", augustRegistries=" + augustRegistries + ", septemberRegistries="
				+ septemberRegistries + ", octoberRegistries=" + octoberRegistries + ", novemberRegistries="
				+ novemberRegistries + ", decemberRegistries=" + decemberRegistries + ", januaryStartingRegistries="
				+ januaryStartingRegistries + ", februaryStartingRegistries=" + februaryStartingRegistries
				+ ", marchStartingRegistries=" + marchStartingRegistries + ", aprilStartingRegistries="
				+ aprilStartingRegistries + ", mayStartingRegistries=" + mayStartingRegistries
				+ ", juneStartingRegistries=" + juneStartingRegistries + ", julyStartingRegistries="
				+ julyStartingRegistries + ", augustStartingRegistries=" + augustStartingRegistries
				+ ", septemberStartingRegistries=" + septemberStartingRegistries + ", octoberStartingRegistries="
				+ octoberStartingRegistries + ", novemberStartingRegistries=" + novemberStartingRegistries
				+ ", decemberStartingRegistries=" + decemberStartingRegistries + ", januaryEndingRegistries="
				+ januaryEndingRegistries + ", februaryEndingRegistries=" + februaryEndingRegistries
				+ ", marchEndingRegistries=" + marchEndingRegistries + ", aprilEndingRegistries="
				+ aprilEndingRegistries + ", mayEndingRegistries=" + mayEndingRegistries + ", juneEndingRegistries="
				+ juneEndingRegistries + ", julyEndingRegistries=" + julyEndingRegistries + ", augustEndingRegistries="
				+ augustEndingRegistries + ", septemberEndingRegistries=" + septemberEndingRegistries
				+ ", octoberEndingRegistries=" + octoberEndingRegistries + ", novemberEndingRegistries="
				+ novemberEndingRegistries + ", decemberEndingRegistries=" + decemberEndingRegistries + "]";
	}

	public Integer getThisYear() {
		return thisYear;
	}

	public Integer getMaleOfThisYear() {
		return maleOfThisYear;
	}

	public Integer getFemaleOfThisYear() {
		return femaleOfThisYear;
	}

	public Integer getLastYear() {
		return lastYear;
	}

	public Integer getMaleOfLastYear() {
		return maleOfLastYear;
	}

	public Integer getFemaleOfLastYear() {
		return femaleOfLastYear;
	}

	public Integer getLastToLastYear() {
		return lastToLastYear;
	}

	public Integer getMaleOfLastToLastYear() {
		return maleOfLastToLastYear;
	}

	public Integer getFemaleOfLastToLastYear() {
		return femaleOfLastToLastYear;
	}

	public Integer getaMForThisYear() {
		return aMForThisYear;
	}

	public Integer getA1ForThisYear() {
		return a1ForThisYear;
	}

	public Integer getA2ForThisYear() {
		return a2ForThisYear;
	}

	public Integer getaForThisYear() {
		return aForThisYear;
	}

	public Integer getB1ForThisYear() {
		return b1ForThisYear;
	}

	public Integer getbForThisYear() {
		return bForThisYear;
	}

	public Integer getcForThisYear() {
		return cForThisYear;
	}

	public Integer getC1ForThisYear() {
		return c1ForThisYear;
	}

	public Integer getdForThisYear() {
		return dForThisYear;
	}

	public Integer getD1ForThisYear() {
		return d1ForThisYear;
	}

	public Integer getbEForThisYear() {
		return bEForThisYear;
	}

	public Integer getC1EForThisYear() {
		return c1EForThisYear;
	}

	public Integer getcEForThisYear() {
		return cEForThisYear;
	}

	public Integer getD1EForThisYear() {
		return d1EForThisYear;
	}

	public Integer getdEForThisYear() {
		return dEForThisYear;
	}

	public Integer getJanuaryRegistries() {
		return januaryRegistries;
	}

	public Integer getFebruaryRegistries() {
		return februaryRegistries;
	}

	public Integer getMarchRegistries() {
		return marchRegistries;
	}

	public Integer getAprilRegistries() {
		return aprilRegistries;
	}

	public Integer getMayRegistries() {
		return mayRegistries;
	}

	public Integer getJuneRegistries() {
		return juneRegistries;
	}

	public Integer getJulyRegistries() {
		return julyRegistries;
	}

	public Integer getAugustRegistries() {
		return augustRegistries;
	}

	public Integer getSeptemberRegistries() {
		return septemberRegistries;
	}

	public Integer getOctoberRegistries() {
		return octoberRegistries;
	}

	public Integer getNovemberRegistries() {
		return novemberRegistries;
	}

	public Integer getDecemberRegistries() {
		return decemberRegistries;
	}

	public Integer getJanuaryStartingRegistries() {
		return januaryStartingRegistries;
	}

	public Integer getFebruaryStartingRegistries() {
		return februaryStartingRegistries;
	}

	public Integer getMarchStartingRegistries() {
		return marchStartingRegistries;
	}

	public Integer getAprilStartingRegistries() {
		return aprilStartingRegistries;
	}

	public Integer getMayStartingRegistries() {
		return mayStartingRegistries;
	}

	public Integer getJuneStartingRegistries() {
		return juneStartingRegistries;
	}

	public Integer getJulyStartingRegistries() {
		return julyStartingRegistries;
	}

	public Integer getAugustStartingRegistries() {
		return augustStartingRegistries;
	}

	public Integer getSeptemberStartingRegistries() {
		return septemberStartingRegistries;
	}

	public Integer getOctoberStartingRegistries() {
		return octoberStartingRegistries;
	}

	public Integer getNovemberStartingRegistries() {
		return novemberStartingRegistries;
	}

	public Integer getDecemberStartingRegistries() {
		return decemberStartingRegistries;
	}

	public Integer getJanuaryEndingRegistries() {
		return januaryEndingRegistries;
	}

	public Integer getFebruaryEndingRegistries() {
		return februaryEndingRegistries;
	}

	public Integer getMarchEndingRegistries() {
		return marchEndingRegistries;
	}

	public Integer getAprilEndingRegistries() {
		return aprilEndingRegistries;
	}

	public Integer getMayEndingRegistries() {
		return mayEndingRegistries;
	}

	public Integer getJuneEndingRegistries() {
		return juneEndingRegistries;
	}

	public Integer getJulyEndingRegistries() {
		return julyEndingRegistries;
	}

	public Integer getAugustEndingRegistries() {
		return augustEndingRegistries;
	}

	public Integer getSeptemberEndingRegistries() {
		return septemberEndingRegistries;
	}

	public Integer getOctoberEndingRegistries() {
		return octoberEndingRegistries;
	}

	public Integer getNovemberEndingRegistries() {
		return novemberEndingRegistries;
	}

	public Integer getDecemberEndingRegistries() {
		return decemberEndingRegistries;
	}

	public void setThisYear(Integer thisYear) {
		this.thisYear = thisYear;
	}

	public void setMaleOfThisYear(Integer maleOfThisYear) {
		this.maleOfThisYear = maleOfThisYear;
	}

	public void setFemaleOfThisYear(Integer femaleOfThisYear) {
		this.femaleOfThisYear = femaleOfThisYear;
	}

	public void setLastYear(Integer lastYear) {
		this.lastYear = lastYear;
	}

	public void setMaleOfLastYear(Integer maleOfLastYear) {
		this.maleOfLastYear = maleOfLastYear;
	}

	public void setFemaleOfLastYear(Integer femaleOfLastYear) {
		this.femaleOfLastYear = femaleOfLastYear;
	}

	public void setLastToLastYear(Integer lastToLastYear) {
		this.lastToLastYear = lastToLastYear;
	}

	public void setMaleOfLastToLastYear(Integer maleOfLastToLastYear) {
		this.maleOfLastToLastYear = maleOfLastToLastYear;
	}

	public void setFemaleOfLastToLastYear(Integer femaleOfLastToLastYear) {
		this.femaleOfLastToLastYear = femaleOfLastToLastYear;
	}

	public void setaMForThisYear(Integer aMForThisYear) {
		this.aMForThisYear = aMForThisYear;
	}

	public void setA1ForThisYear(Integer a1ForThisYear) {
		this.a1ForThisYear = a1ForThisYear;
	}

	public void setA2ForThisYear(Integer a2ForThisYear) {
		this.a2ForThisYear = a2ForThisYear;
	}

	public void setaForThisYear(Integer aForThisYear) {
		this.aForThisYear = aForThisYear;
	}

	public void setB1ForThisYear(Integer b1ForThisYear) {
		this.b1ForThisYear = b1ForThisYear;
	}

	public void setbForThisYear(Integer bForThisYear) {
		this.bForThisYear = bForThisYear;
	}

	public void setcForThisYear(Integer cForThisYear) {
		this.cForThisYear = cForThisYear;
	}

	public void setC1ForThisYear(Integer c1ForThisYear) {
		this.c1ForThisYear = c1ForThisYear;
	}

	public void setdForThisYear(Integer dForThisYear) {
		this.dForThisYear = dForThisYear;
	}

	public void setD1ForThisYear(Integer d1ForThisYear) {
		this.d1ForThisYear = d1ForThisYear;
	}

	public void setbEForThisYear(Integer bEForThisYear) {
		this.bEForThisYear = bEForThisYear;
	}

	public void setC1EForThisYear(Integer c1eForThisYear) {
		c1EForThisYear = c1eForThisYear;
	}

	public void setcEForThisYear(Integer cEForThisYear) {
		this.cEForThisYear = cEForThisYear;
	}

	public void setD1EForThisYear(Integer d1eForThisYear) {
		d1EForThisYear = d1eForThisYear;
	}

	public void setdEForThisYear(Integer dEForThisYear) {
		this.dEForThisYear = dEForThisYear;
	}

	public void setJanuaryRegistries(Integer januaryRegistries) {
		this.januaryRegistries = januaryRegistries;
	}

	public void setFebruaryRegistries(Integer februaryRegistries) {
		this.februaryRegistries = februaryRegistries;
	}

	public void setMarchRegistries(Integer marchRegistries) {
		this.marchRegistries = marchRegistries;
	}

	public void setAprilRegistries(Integer aprilRegistries) {
		this.aprilRegistries = aprilRegistries;
	}

	public void setMayRegistries(Integer mayRegistries) {
		this.mayRegistries = mayRegistries;
	}

	public void setJuneRegistries(Integer juneRegistries) {
		this.juneRegistries = juneRegistries;
	}

	public void setJulyRegistries(Integer julyRegistries) {
		this.julyRegistries = julyRegistries;
	}

	public void setAugustRegistries(Integer augustRegistries) {
		this.augustRegistries = augustRegistries;
	}

	public void setSeptemberRegistries(Integer septemberRegistries) {
		this.septemberRegistries = septemberRegistries;
	}

	public void setOctoberRegistries(Integer octoberRegistries) {
		this.octoberRegistries = octoberRegistries;
	}

	public void setNovemberRegistries(Integer novemberRegistries) {
		this.novemberRegistries = novemberRegistries;
	}

	public void setDecemberRegistries(Integer decemberRegistries) {
		this.decemberRegistries = decemberRegistries;
	}

	public void setJanuaryStartingRegistries(Integer januaryStartingRegistries) {
		this.januaryStartingRegistries = januaryStartingRegistries;
	}

	public void setFebruaryStartingRegistries(Integer februaryStartingRegistries) {
		this.februaryStartingRegistries = februaryStartingRegistries;
	}

	public void setMarchStartingRegistries(Integer marchStartingRegistries) {
		this.marchStartingRegistries = marchStartingRegistries;
	}

	public void setAprilStartingRegistries(Integer aprilStartingRegistries) {
		this.aprilStartingRegistries = aprilStartingRegistries;
	}

	public void setMayStartingRegistries(Integer mayStartingRegistries) {
		this.mayStartingRegistries = mayStartingRegistries;
	}

	public void setJuneStartingRegistries(Integer juneStartingRegistries) {
		this.juneStartingRegistries = juneStartingRegistries;
	}

	public void setJulyStartingRegistries(Integer julyStartingRegistries) {
		this.julyStartingRegistries = julyStartingRegistries;
	}

	public void setAugustStartingRegistries(Integer augustStartingRegistries) {
		this.augustStartingRegistries = augustStartingRegistries;
	}

	public void setSeptemberStartingRegistries(Integer septemberStartingRegistries) {
		this.septemberStartingRegistries = septemberStartingRegistries;
	}

	public void setOctoberStartingRegistries(Integer octoberStartingRegistries) {
		this.octoberStartingRegistries = octoberStartingRegistries;
	}

	public void setNovemberStartingRegistries(Integer novemberStartingRegistries) {
		this.novemberStartingRegistries = novemberStartingRegistries;
	}

	public void setDecemberStartingRegistries(Integer decemberStartingRegistries) {
		this.decemberStartingRegistries = decemberStartingRegistries;
	}

	public void setJanuaryEndingRegistries(Integer januaryEndingRegistries) {
		this.januaryEndingRegistries = januaryEndingRegistries;
	}

	public void setFebruaryEndingRegistries(Integer februaryEndingRegistries) {
		this.februaryEndingRegistries = februaryEndingRegistries;
	}

	public void setMarchEndingRegistries(Integer marchEndingRegistries) {
		this.marchEndingRegistries = marchEndingRegistries;
	}

	public void setAprilEndingRegistries(Integer aprilEndingRegistries) {
		this.aprilEndingRegistries = aprilEndingRegistries;
	}

	public void setMayEndingRegistries(Integer mayEndingRegistries) {
		this.mayEndingRegistries = mayEndingRegistries;
	}

	public void setJuneEndingRegistries(Integer juneEndingRegistries) {
		this.juneEndingRegistries = juneEndingRegistries;
	}

	public void setJulyEndingRegistries(Integer julyEndingRegistries) {
		this.julyEndingRegistries = julyEndingRegistries;
	}

	public void setAugustEndingRegistries(Integer augustEndingRegistries) {
		this.augustEndingRegistries = augustEndingRegistries;
	}

	public void setSeptemberEndingRegistries(Integer septemberEndingRegistries) {
		this.septemberEndingRegistries = septemberEndingRegistries;
	}

	public void setOctoberEndingRegistries(Integer octoberEndingRegistries) {
		this.octoberEndingRegistries = octoberEndingRegistries;
	}

	public void setNovemberEndingRegistries(Integer novemberEndingRegistries) {
		this.novemberEndingRegistries = novemberEndingRegistries;
	}

	public void setDecemberEndingRegistries(Integer decemberEndingRegistries) {
		this.decemberEndingRegistries = decemberEndingRegistries;
	}

}
