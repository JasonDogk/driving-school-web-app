package driving.school.web.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "map_details")
public class MapDetails {

	@Id
	private String id;

	@Column(name = "longtitude")
	private String longtitude;

	@Column(name = "latitude")
	private String latitude;

	private MapDetails(Builder builder) {
		this.id = builder.id;
		this.longtitude = builder.longtitude;
		this.latitude = builder.latitude;
	}

	public String getId() {
		return id;
	}

	public String getLongtitude() {
		return longtitude;
	}

	public String getLatitude() {
		return latitude;
	}

	@Override
	public String toString() {
		return "MapDetails [id=" + id + ", longtitude=" + longtitude + ", latitude=" + latitude + "]";
	}

	public static class Builder {
		private String id;
		private String longtitude;
		private String latitude;

		public Builder id(String id) {
			this.id = id;
			return this;
		}

		public Builder longtitude(String longtitude) {
			this.longtitude = longtitude;
			return this;
		}

		public Builder latitude(String latitude) {
			this.latitude = latitude;
			return this;
		}

		public MapDetails build() {
			MapDetails mapDetails = new MapDetails(this);
			return mapDetails;
		}
	}

}
