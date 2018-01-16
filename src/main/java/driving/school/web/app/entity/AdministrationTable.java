package driving.school.web.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "administration_table")
public class AdministrationTable {

	@Id
	private String id;

	@Column(name = "username")
	private String username;

	@Column(name = "password")
	private String password;

	private AdministrationTable() {
	}

	private AdministrationTable(Builder builder) {
		this.id = builder.id;
		this.username = builder.username;
		this.password = builder.password;
	}

	public String getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	@Override
	public String toString() {
		return "AdministrationTable [id=" + id + ", username=" + username + ", password=" + password + "]";
	}

	public static class Builder {
		private String id;
		private String username;
		private String password;

		// public Builder id(String id) {
		// this.id = id;
		// return this;
		// }
		//
		// public Builder username(String username) {
		// this.username = username;
		// return this;
		// }
		//
		// public Builder password(String password) {
		// this.password = password;
		// return this;
		// }

		public Builder id(String id) {
			this.id = id;
			return this;
		}

		public Builder username(String username) {
			this.username = username;
			return this;
		}

		public Builder password(String password) {
			this.password = password;
			return this;
		}

		public AdministrationTable build() {
			AdministrationTable administrationTable = new AdministrationTable(this);
			return administrationTable;
		}
	}

}
