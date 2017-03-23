package ke.co.buku.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.search.annotations.DocumentId;
import org.hibernate.search.annotations.Indexed;
@Entity
@Table(name = "ORDERITEM")
@Indexed
@XmlRootElement
@SequenceGenerator(allocationSize=1,name="sequence", sequenceName="OR_FCSEQ")

public class OrderItem extends BaseObject implements Serializable {
	

	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @DocumentId

	private Long orderItemId;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="book_id")
	private Book book;

	public OrderItem() {
		// TODO Auto-generated constructor stub
	}

	public Long getOrderItemId() {
		return orderItemId;
	}

	public void setOrderItemId(Long orderItemId) {
		this.orderItemId = orderItemId;
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
