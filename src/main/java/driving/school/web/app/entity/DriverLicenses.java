package driving.school.web.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "driver_licenses")
public class DriverLicenses {

	@Id
	private String id;

	@Column(name = "am")
	private String am;

	@Column(name = "am_date")
	private String amDate;

	@Column(name = "am_finished")
	private String amFinished;

	@Column(name = "a1")
	private String a1;

	@Column(name = "a1_date")
	private String a1Date;

	@Column(name = "a1_finished")
	private String a1Finished;

	@Column(name = "a1_finished_date")
	private String a1FinishedDate;

	@Column(name = "a2")
	private String a2;

	@Column(name = "a2_date")
	private String a2Date;

	@Column(name = "a2_finished")
	private String a2Finished;

	@Column(name = "a2_finished_date")
	private String a2FinishedDate;

	@Column(name = "a")
	private String a;

	@Column(name = "a_date")
	private String aDate;

	@Column(name = "a_finished")
	private String aFinished;

	@Column(name = "a_finished_date")
	private String aFinishedDate;

	@Column(name = "b1")
	private String b1;

	@Column(name = "b1_date")
	private String b1Date;

	@Column(name = "b1_finished")
	private String b1Finished;

	@Column(name = "b1_finished_date")
	private String b1FinishedDate;

	@Column(name = "b")
	private String b;

	@Column(name = "b_date")
	private String bDate;

	@Column(name = "b_finished")
	private String bFinished;

	@Column(name = "b_finished_date")
	private String bFinishedDate;

	@Column(name = "c1")
	private String c1;

	@Column(name = "c1_date")
	private String c1Date;

	@Column(name = "c1_finished")
	private String c1Finished;

	@Column(name = "c")
	private String c;

	@Column(name = "c_date")
	private String cDate;

	@Column(name = "c_finished")
	private String cFinished;

	@Column(name = "c_finished_date")
	private String cFinishedDate;

	@Column(name = "d1")
	private String d1;

	@Column(name = "d1_date")
	private String d1Date;

	@Column(name = "d1_finished")
	private String d1Finished;

	@Column(name = "d1_finished_date")
	private String d1FinishedFate;

	@Column(name = "d")
	private String d;

	@Column(name = "dDate")
	private String dDate;

	@Column(name = "d_finished")
	private String dFinished;

	@Column(name = "d_finished_date")
	private String dFinishedDate;

	@Column(name = "be")
	private String be;

	@Column(name = "be_date")
	private String beDate;

	@Column(name = "be_finished")
	private String beFinished;

	@Column(name = "be_finished_date")
	private String beFinishedDate;

	@Column(name = "c1e")
	private String c1e;

	@Column(name = "c1e_date")
	private String c1eDate;

	@Column(name = "c1e_finished")
	private String c1eFinished;

	@Column(name = "c1e_finished_date")
	private String c1eFinishedDate;

	@Column(name = "ce")
	private String ce;

	@Column(name = "ce_date")
	private String ceDate;

	@Column(name = "ce_finished")
	private String ceFinished;

	@Column(name = "ce_finished_date")
	private String ceFinishedDate;

	@Column(name = "d1e")
	private String d1e;

	@Column(name = "d1e_date")
	private String d1eDate;

	@Column(name = "d1e_finished")
	private String d1eFinished;

	@Column(name = "d1e_finished_date")
	private String d1eFinishedDate;

	@Column(name = "de")
	private String de;

	@Column(name = "de_date")
	private String deDate;

	@Column(name = "de_finished")
	private String deFinished;

	@Column(name = "de_finished_date")
	private String deFinishedDate;

	private DriverLicenses(Builder builder) {
		this.id = builder.id;
		this.am = builder.am;
		this.amDate = builder.amDate;
		this.amFinished = builder.amFinished;
		this.a1 = builder.a1;
		this.a1Date = builder.a1Date;
		this.a1Finished = builder.a1Finished;
		this.a1FinishedDate = builder.a1FinishedDate;
		this.a2 = builder.a2;
		this.a2Date = builder.a2Date;
		this.a2Finished = builder.a2Finished;
		this.a2FinishedDate = builder.a2FinishedDate;
		this.a = builder.a;
		this.aDate = builder.aDate;
		this.aFinished = builder.aFinished;
		this.aFinishedDate = builder.aFinishedDate;
		this.b1 = builder.b1;
		this.b1Date = builder.b1Date;
		this.b1Finished = builder.b1Finished;
		this.b1FinishedDate = builder.b1FinishedDate;
		this.b = builder.b;
		this.bDate = builder.bDate;
		this.bFinished = builder.bFinished;
		this.bFinishedDate = builder.bFinishedDate;
		this.c1 = builder.c1;
		this.c1Date = builder.c1Date;
		this.c1Finished = builder.c1Finished;
		this.c = builder.c;
		this.cDate = builder.cDate;
		this.cFinished = builder.cFinished;
		this.cFinishedDate = builder.cFinishedDate;
		this.d1 = builder.d1;
		this.d1Date = builder.d1Date;
		this.d1Finished = builder.d1Finished;
		this.d1FinishedFate = builder.d1FinishedFate;
		this.d = builder.d;
		this.dDate = builder.dDate;
		this.dFinished = builder.dFinished;
		this.dFinishedDate = builder.dFinishedDate;
		this.be = builder.be;
		this.beDate = builder.beDate;
		this.beFinished = builder.beFinished;
		this.beFinishedDate = builder.beFinishedDate;
		this.c1e = builder.c1e;
		this.c1eDate = builder.c1eDate;
		this.c1eFinished = builder.c1eFinished;
		this.c1eFinishedDate = builder.c1eFinishedDate;
		this.ce = builder.ce;
		this.ceDate = builder.ceDate;
		this.ceFinished = builder.ceFinished;
		this.ceFinishedDate = builder.ceFinishedDate;
		this.d1e = builder.d1e;
		this.d1eDate = builder.d1eDate;
		this.d1eFinished = builder.d1eFinished;
		this.d1eFinishedDate = builder.d1eFinishedDate;
		this.de = builder.de;
		this.deDate = builder.deDate;
		this.deFinished = builder.deFinished;
		this.deFinishedDate = builder.deFinishedDate;

	}

	public String getId() {
		return id;
	}

	public String getAm() {
		return am;
	}

	public String getAmDate() {
		return amDate;
	}

	public String getAmFinished() {
		return amFinished;
	}

	public String getA1() {
		return a1;
	}

	public String getA1Date() {
		return a1Date;
	}

	public String getA1Finished() {
		return a1Finished;
	}

	public String getA1FinishedDate() {
		return a1FinishedDate;
	}

	public String getA2() {
		return a2;
	}

	public String getA2Date() {
		return a2Date;
	}

	public String getA2Finished() {
		return a2Finished;
	}

	public String getA2FinishedDate() {
		return a2FinishedDate;
	}

	public String getA() {
		return a;
	}

	public String getaDate() {
		return aDate;
	}

	public String getaFinished() {
		return aFinished;
	}

	public String getaFinishedDate() {
		return aFinishedDate;
	}

	public String getB1() {
		return b1;
	}

	public String getB1Date() {
		return b1Date;
	}

	public String getB1Finished() {
		return b1Finished;
	}

	public String getB1FinishedDate() {
		return b1FinishedDate;
	}

	public String getB() {
		return b;
	}

	public String getbDate() {
		return bDate;
	}

	public String getbFinished() {
		return bFinished;
	}

	public String getbFinishedDate() {
		return bFinishedDate;
	}

	public String getC1() {
		return c1;
	}

	public String getC1Date() {
		return c1Date;
	}

	public String getC1Finished() {
		return c1Finished;
	}

	public String getC() {
		return c;
	}

	public String getcDate() {
		return cDate;
	}

	public String getcFinished() {
		return cFinished;
	}

	public String getcFinishedDate() {
		return cFinishedDate;
	}

	public String getD1() {
		return d1;
	}

	public String getD1Date() {
		return d1Date;
	}

	public String getD1Finished() {
		return d1Finished;
	}

	public String getD1FinishedFate() {
		return d1FinishedFate;
	}

	public String getD() {
		return d;
	}

	public String getdDate() {
		return dDate;
	}

	public String getdFinished() {
		return dFinished;
	}

	public String getdFinishedDate() {
		return dFinishedDate;
	}

	public String getBe() {
		return be;
	}

	public String getBeDate() {
		return beDate;
	}

	public String getBeFinished() {
		return beFinished;
	}

	public String getBeFinishedDate() {
		return beFinishedDate;
	}

	public String getC1e() {
		return c1e;
	}

	public String getC1eDate() {
		return c1eDate;
	}

	public String getC1eFinished() {
		return c1eFinished;
	}

	public String getC1eFinishedDate() {
		return c1eFinishedDate;
	}

	public String getCe() {
		return ce;
	}

	public String getCeDate() {
		return ceDate;
	}

	public String getCeFinished() {
		return ceFinished;
	}

	public String getCeFinishedDate() {
		return ceFinishedDate;
	}

	public String getD1e() {
		return d1e;
	}

	public String getD1eDate() {
		return d1eDate;
	}

	public String getD1eFinished() {
		return d1eFinished;
	}

	public String getD1eFinishedDate() {
		return d1eFinishedDate;
	}

	public String getDe() {
		return de;
	}

	public String getDeDate() {
		return deDate;
	}

	public String getDeFinished() {
		return deFinished;
	}

	public String getDeFinishedDate() {
		return deFinishedDate;
	}

	@Override
	public String toString() {
		return "DriverLicenses [id=" + id + ", am=" + am + ", amDate=" + amDate + ", amFinished=" + amFinished + ", a1="
				+ a1 + ", a1Date=" + a1Date + ", a1Finished=" + a1Finished + ", a1FinishedDate=" + a1FinishedDate
				+ ", a2=" + a2 + ", a2Date=" + a2Date + ", a2Finished=" + a2Finished + ", a2FinishedDate="
				+ a2FinishedDate + ", a=" + a + ", aDate=" + aDate + ", aFinished=" + aFinished + ", aFinishedDate="
				+ aFinishedDate + ", b1=" + b1 + ", b1Date=" + b1Date + ", b1Finished=" + b1Finished
				+ ", b1FinishedDate=" + b1FinishedDate + ", b=" + b + ", bDate=" + bDate + ", bFinished=" + bFinished
				+ ", bFinishedDate=" + bFinishedDate + ", c1=" + c1 + ", c1Date=" + c1Date + ", c1Finished="
				+ c1Finished + ", c=" + c + ", cDate=" + cDate + ", cFinished=" + cFinished + ", cFinishedDate="
				+ cFinishedDate + ", d1=" + d1 + ", d1Date=" + d1Date + ", d1Finished=" + d1Finished
				+ ", d1FinishedFate=" + d1FinishedFate + ", d=" + d + ", dDate=" + dDate + ", dFinished=" + dFinished
				+ ", dFinishedDate=" + dFinishedDate + ", be=" + be + ", beDate=" + beDate + ", beFinished="
				+ beFinished + ", beFinishedDate=" + beFinishedDate + ", c1e=" + c1e + ", c1eDate=" + c1eDate
				+ ", c1eFinished=" + c1eFinished + ", c1eFinishedDate=" + c1eFinishedDate + ", ce=" + ce + ", ceDate="
				+ ceDate + ", ceFinished=" + ceFinished + ", ceFinishedDate=" + ceFinishedDate + ", d1e=" + d1e
				+ ", d1eDate=" + d1eDate + ", d1eFinished=" + d1eFinished + ", d1eFinishedDate=" + d1eFinishedDate
				+ ", de=" + de + ", deDate=" + deDate + ", deFinished=" + deFinished + ", deFinishedDate="
				+ deFinishedDate + "]";
	}

	public static class Builder {

		private String id;
		private String am;
		private String amDate;
		private String amFinished;
		private String a1;
		private String a1Date;
		private String a1Finished;
		private String a1FinishedDate;
		private String a2;
		private String a2Date;
		private String a2Finished;
		private String a2FinishedDate;
		private String a;
		private String aDate;
		private String aFinished;
		private String aFinishedDate;
		private String b1;
		private String b1Date;
		private String b1Finished;
		private String b1FinishedDate;
		private String b;
		private String bDate;
		private String bFinished;
		private String bFinishedDate;
		private String c1;
		private String c1Date;
		private String c1Finished;
		private String c;
		private String cDate;
		private String cFinished;
		private String cFinishedDate;
		private String d1;
		private String d1Date;
		private String d1Finished;
		private String d1FinishedFate;
		private String d;
		private String dDate;
		private String dFinished;
		private String dFinishedDate;
		private String be;
		private String beDate;
		private String beFinished;
		private String beFinishedDate;
		private String c1e;
		private String c1eDate;
		private String c1eFinished;
		private String c1eFinishedDate;
		private String ce;
		private String ceDate;
		private String ceFinished;
		private String ceFinishedDate;
		private String d1e;
		private String d1eDate;
		private String d1eFinished;
		private String d1eFinishedDate;
		private String de;
		private String deDate;
		private String deFinished;
		private String deFinishedDate;

		public Builder() {
		}

		public DriverLicenses build() {
			DriverLicenses driverLicenses = new DriverLicenses(this);
			return driverLicenses;
		}

	}

}
