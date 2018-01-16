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
	private String firstName;

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
		this.firstName = builder.firstName;
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
		this.nant = builder.nant;
		this.email = builder.email;
	}

	public Builder toBuilder() {
		return new Builder().firstName(getFirstName()).lastName(getLastName()).fathersName(getFathersName())
				.afm(getAfm()).protocolNumber(getProtocolNumber()).phoneNumber(getPhoneNumber())
				.identificationCardNumber(getIdentificationCardNumber()).dateOfCreation(getDateOfCreation())
				.timeOfCreation(getTimeOfCreation()).licenseExpirationDate(getLicenseExpirationDate())
				.gender(getGender()).photo(getPhoto()).residence(getResidence()).address(getAddress())
				.number(getNumber()).notes(getNotes()).nant(getNant()).email(getEmail());
	}

	public String getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
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
		return "Driver [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", fathersName="
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

		public Builder id(String id) {
			this.id = id;
			return this;
		}

		public Builder firstName(String firstName) {
			this.firstName = firstName;
			return this;
		}

		public Builder lastName(String lastName) {
			this.lastName = lastName;
			return this;
		}

		public Builder fathersName(String fathersName) {
			this.fathersName = fathersName;
			return this;
		}

		public Builder afm(String afm) {
			this.afm = afm;
			return this;
		}

		public Builder protocolNumber(String protocolNumber) {
			this.protocolNumber = protocolNumber;
			return this;
		}

		public Builder phoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
			return this;
		}

		public Builder identificationCardNumber(String identificationCardNumber) {
			this.identificationCardNumber = identificationCardNumber;
			return this;
		}

		public Builder dateOfCreation(String dateOfCreation) {
			this.dateOfCreation = dateOfCreation;
			return this;
		}

		public Builder timeOfCreation(String timeOfCreation) {
			this.timeOfCreation = timeOfCreation;
			return this;
		}

		public Builder licenseExpirationDate(String licenseExpirationDate) {
			this.licenseExpirationDate = licenseExpirationDate;
			return this;
		}

		public Builder gender(String gender) {
			this.gender = gender;
			return this;
		}

		public Builder photo(String photo) {
			this.photo = photo;
			return this;
		}

		public Builder residence(String residence) {
			this.residence = residence;
			return this;
		}

		public Builder address(String address) {
			this.address = address;
			return this;
		}

		public Builder number(String number) {
			this.number = number;
			return this;
		}

		public Builder nant(String nant) {
			this.nant = nant;
			return this;
		}

		public Builder email(String email) {
			this.email = email;
			return this;
		}

		public Builder notes(String notes) {
			this.notes = notes;
			return this;
		}

		public Driver build() {
			Driver driver = new Driver(this);
			return driver;
		}
	}
}
