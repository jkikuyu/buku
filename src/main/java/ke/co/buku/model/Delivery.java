package ke.co.buku.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.search.annotations.DocumentId;
import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Indexed;

@Entity
@Table(name = "DELIVERY")
@Indexed
@XmlRootElement
@SequenceGenerator(allocationSize=1,name="sequence", sequenceName="DELIVERY_FCSEQ")

public class Delivery extends BaseObject implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @DocumentId
	private Long deliveryId;
	

	@OneToMany(mappedBy="delivery")
	private Set<Order>orders;

	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="STATUS_ID") 
	private Status status;
	
	public Delivery() {
		// TODO Auto-generated constructor stub
	}


	public Long getDeliveryId() {
		return deliveryId;
	}

	public Set<Order> getOrders() {
		return orders;
	}

	public Status getStatus() {
		return status;
	}


	public void setStatus(Status status) {
		this.status = status;
	}


	public void setDeliveryId(Long deliveryId) {
		this.deliveryId = deliveryId;
	}

	public void setOrders(Set<Order> orders) {
		this.orders = orders;
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
