package ke.co.buku.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.search.annotations.DocumentId;
import org.hibernate.search.annotations.Field;
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

	@Column(nullable = false, length = 100, unique = true)
	@Field
	private String name;
	
	@Column(nullable = false, length = 1000, unique = true)
	@Field
	private String description;
	
	@Field
	private Double coord_X;
	
	@Field
	private Double coord_Y;
	@OneToMany(mappedBy="location")

	private Set <Customer>customers;
	
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
	
	public String getDescription() {
		return description;
	}
	public Set<Customer> getCustomers() {
		return customers;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setCustomers(Set<Customer> customers) {
		this.customers = customers;
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
