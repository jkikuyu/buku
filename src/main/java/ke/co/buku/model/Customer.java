package ke.co.buku.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.search.annotations.DocumentId;
import org.hibernate.search.annotations.Indexed;
import org.hibernate.search.annotations.IndexedEmbedded;
@Entity
@Table(name = "CUSTOMER")
@Indexed
@XmlRootElement
@SequenceGenerator(allocationSize=1,name="sequence", sequenceName="CUSTOMER_FCSEQ")

public class Customer extends BaseObject implements Serializable {
	
	private static final long serialVersionUID = 1L;
    
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @DocumentId
	private Long customerId;
    
	@Embedded
    @IndexedEmbedded
	private Address address = new Address();
    
	@OneToOne 
    @JoinColumn(name="USER_ID") 
	private User user;
	
    @OneToMany(mappedBy="customer")
	private Set<Payment> payments = new HashSet<Payment>();
	
	@OneToMany(mappedBy="customer")
	private Set <Order> orders;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="LOCATION_ID") 
	private Location location;

	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public Long getCustomerId() {
		return customerId;
	}

	public Address getAddress() {
		return address;
	}
 
	public User getUser() {
		return user;
	}
	public Set<Payment> getPayments() {
		return payments;
	}
	public Location getLocation() {
		return location;
	}
	public Set<Order> getOrders() {
		return orders;
	}
	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}
	
	public void setPayments(Set<Payment> payments) {
		this.payments = payments;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public void setUser(User user) {
		this.user = user;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public void setAddress(Address address) {
		this.address = address;
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
