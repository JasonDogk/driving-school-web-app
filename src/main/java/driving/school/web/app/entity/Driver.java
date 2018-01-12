package driving.school.web.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "driver")
public class Driver {

	@Id
	private String id;

	@Column(name = "first_name")
	private String fistrName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "fathers_name")
	private String fathersName;

	@Column(name = "afm")
	private String afm;

	@Column(name = "protocol_number")
	private String protocolNumber;

	@Column(name = "phone_number")
	private String phoneNumber;

	@Column(name = "identification_card_number")
	private String identificationCardNumber;

	@Column(name = "date_of_creation")
	private String dateOfCreation;

	@Column(name = "time_of_creation")
	private String timeOfCreation;

	@Column(name = "license_expiration_date")
	private String licenseExpirationDate;

	@Column(name = "gender")
	private String gender;

	@Column(name = "photo")
	private String photo;

	@Column(name = "residence")
	private String residence;

	@Column(name = "address")
	private String address;

	@Column(name = "number")
	private String number;

	@Column(name = "nant")
	private String nant;

	@Column(name = "email")
	private String email;

	@Column(name = "notes")
	private String notes;

	public Driver() {
	}

	private Driver(Builder builder) {
		this.id = builder.id;
		this.fistrName = builder.firstName;
		this.fathersName = builder.fathersName;
		this.lastName = builder.lastName;
		this.afm = builder.afm;
		this.protocolNumber = builder.protocolNumber;
		this.phoneNumber = builder.phoneNumber;
		this.identificationCardNumber = builder.identificationCardNumber;
		this.dateOfCreation = builder.dateOfCreation;
		this.timeOfCreation = builder.timeOfCreation;
		this.licenseExpirationDate = builder.licenseExpirationDate;
		this.gender = builder.gender;
		this.photo = builder.photo;
		this.residence = builder.residence;
		this.address = builder.address;
		this.number = builder.number;
		this.notes = builder.notes;
	}

	public String getId() {
		return id;
	}

	public String getFistrName() {
		return fistrName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getFathersName() {
		return fathersName;
	}

	public String getAfm() {
		return afm;
	}

	public String getProtocolNumber() {
		return protocolNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getIdentificationCardNumber() {
		return identificationCardNumber;
	}

	public String getDateOfCreation() {
		return dateOfCreation;
	}

	public String getTimeOfCreation() {
		return timeOfCreation;
	}

	public String getLicenseExpirationDate() {
		return licenseExpirationDate;
	}

	public String getGender() {
		return gender;
	}

	public String getPhoto() {
		return photo;
	}

	public String getResidence() {
		return residence;
	}

	public String getAddress() {
		return address;
	}

	public String getNumber() {
		return number;
	}

	public String getNant() {
		return nant;
	}

	public String getEmail() {
		return email;
	}

	public String getNotes() {
		return notes;
	}

	@Override
	public String toString() {
		return "Driver [id=" + id + ", fistrName=" + fistrName + ", lastName=" + lastName + ", fathersName="
				+ fathersName + ", afm=" + afm + ", protocolNumber=" + protocolNumber + ", phoneNumber=" + phoneNumber
				+ ", identificationCardNumber=" + identificationCardNumber + ", dateOfCreation=" + dateOfCreation
				+ ", timeOfCreation=" + timeOfCreation + ", licenseExpirationDate=" + licenseExpirationDate
				+ ", gender=" + gender + ", photo=" + photo + ", residence=" + residence + ", address=" + address
				+ ", number=" + number + ", nant=" + nant + ", email=" + email + ", notes=" + notes + "]";
	}

	public static class Builder {

		private String id;
		public String firstName;
		private String lastName;
		private String fathersName;
		private String afm;
		private String protocolNumber;
		private String phoneNumber;
		private String identificationCardNumber;
		private String dateOfCreation;
		private String timeOfCreation;
		private String licenseExpirationDate;
		private String gender;
		private String photo;
		private String residence;
		private String address;
		private String number;
		private String nant;
		private String email;
		private String notes;

		public Builder() {
		}

		public Driver build() {
			Driver driver = new Driver(this);
			return driver;
		}
	}

}
