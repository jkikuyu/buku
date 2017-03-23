package ke.co.buku.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.search.annotations.DocumentId;
import org.hibernate.search.annotations.Indexed;
@Entity
@Table(name = "ORDER")
@Indexed
@XmlRootElement
public class Order extends BaseObject implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @DocumentId

	private Long orderId;
    
	private Date orderDate;
	private Integer quantity;
	
	public Order() {
		// TODO Auto-generated constructor stub
	}
	
	public Long getOrderId() {
		return orderId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
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
