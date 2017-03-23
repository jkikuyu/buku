package ke.co.buku.model;

import java.io.Serializable;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.search.annotations.DocumentId;
import org.hibernate.search.annotations.Indexed;
import org.hibernate.search.annotations.IndexedEmbedded;
@Entity
@Table(name = "CUSTOMER")
@Indexed
@XmlRootElement
public class Customer extends BaseObject implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Long customerId;
	private Address address = new Address();
	private User user;

	public Customer() {
		// TODO Auto-generated constructor stub
	}
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @DocumentId

	public Long getCustomerId() {
		return customerId;
	}
    @Embedded
    @IndexedEmbedded
	public Address getAddress() {
		return address;
	}
    @OneToOne 
    @JoinColumn(name="USER_ID") 
    

	public User getUser() {
		return user;
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
