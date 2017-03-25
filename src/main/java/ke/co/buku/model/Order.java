package ke.co.buku.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.search.annotations.DocumentId;
import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Indexed;
@Entity
@Table(name = "ORDER")
@Indexed
@XmlRootElement
@SequenceGenerator(allocationSize=1,name="sequence", sequenceName="ORDER_FCSEQ")

public class Order extends BaseObject implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @DocumentId
	private Long orderId;
    
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
    @Field
 	private Date orderDate;
   
    @Column(nullable = false, length = 4)
	@Field
	private Integer quantity;
	
    @ManyToMany(fetch = FetchType.EAGER)
    @Fetch(FetchMode.SELECT)
    @JoinTable(
        name = "order_book",
        joinColumns = { @JoinColumn(name = "order_id") },
        inverseJoinColumns = @JoinColumn(name = "book_id")
        )
	private Set <Book> books;
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CUSTOMER_ID") 
    private Customer customer;
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="DELIVERY_ID") 
    private Delivery delivery;

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

	public Set<Book> getBooks() {
		return books;
	}

	public Customer getCustomer() {
		return customer;
	}

	public Delivery getDelivery() {
		return delivery;
	}

	public void setDelivery(Delivery delivery) {
		this.delivery = delivery;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public void setBooks(Set<Book> books) {
		this.books = books;
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
