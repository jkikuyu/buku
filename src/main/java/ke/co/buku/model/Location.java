package ke.co.buku.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.search.annotations.DocumentId;
import org.hibernate.search.annotations.Indexed;
@Entity
@Table(name = "LOCATION")
@Indexed
@XmlRootElement
public class Location extends BaseObject implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @DocumentId
	private Long locationId;
	private String name;
	private Double coord_X;
	private Double coord_Y;
	
	public Location() {
		// TODO Auto-generated constructor stub
	}

	public Long getLocationId() {
		return locationId;
	}

	public String getName() {
		return name;
	}

	public Double getCoord_X() {
		return coord_X;
	}

	public Double getCoord_Y() {
		return coord_Y;
	}

	public void setLocationId(Long locationId) {
		this.locationId = locationId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCoord_X(Double coord_X) {
		this.coord_X = coord_X;
	}

	public void setCoord_Y(Double coord_Y) {
		this.coord_Y = coord_Y;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean equals(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 0;
	}

}