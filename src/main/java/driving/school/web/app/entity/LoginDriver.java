package driving.school.web.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "driver")
public class LoginDriver {

	@Id
	private String id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "afm")
	private String afm;

	@Column(name = "phone_number")
	private String phoneNumber;

	public LoginDriver() {
	}

	private LoginDriver(Builder builder) {
		this.id = builder.id;
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.afm = builder.afm;
		this.phoneNumber = builder.phoneNumber;
	}

	public Builder toBuilder() {
		return new Builder().firstName(getFirstName()).lastName(getLastName()).afm(getAfm())
				.phoneNumber(getPhoneNumber()).id(getId());
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

	public String getAfm() {
		return afm;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	@Override
	public String toString() {
		return "LoginDriver [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", afm=" + afm
				+ ", phoneNumber=" + phoneNumber + "]";
	}

	public static class Builder {

		private String id;
		public String firstName;
		private String lastName;
		private String afm;
		private String phoneNumber;

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

		public Builder afm(String afm) {
			this.afm = afm;
			return this;
		}

		public Builder phoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
			return this;
		}

		public LoginDriver build() {
			LoginDriver driver = new LoginDriver(this);
			return driver;
		}
	}

}
