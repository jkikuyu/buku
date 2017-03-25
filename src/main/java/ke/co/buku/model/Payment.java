package ke.co.buku.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.search.annotations.DocumentId;
import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Indexed;
@Entity
@Table(name = "PAYMENT")
@Indexed
@XmlRootElement
@SequenceGenerator(allocationSize=1,name="sequence", sequenceName="PAYMENT_FCSEQ")

public class Payment extends BaseObject implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @DocumentId
	private Long paymentId;
	@Field
	
	private Integer receiptNo;
	
	@Field
	private String trans_code;
	
	@Field
	private Double amount;
	
	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CUSTOMER_ID") 
	private Customer customer;
	
	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="MODE_ID") 
	private PaymentMode paymentmode;

	
    @OneToOne 
    @JoinColumn(name="ORDER_ID") 
    private Order order;


	public Payment() {
		// TODO Auto-generated constructor stub
	}

	public Long getPaymentId() {
		return paymentId;
	}

	public Integer getReceiptNo() {
		return receiptNo;
	}

	public String getTrans_code() {
		return trans_code;
	}

	public Double getAmount() {
		return amount;
	}

	public Customer getCustomer() {
		return customer;
	}
	
	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}

	public void setReceiptNo(Integer receiptNo) {
		this.receiptNo = receiptNo;
	}

	public void setTrans_code(String trans_code) {
		this.trans_code = trans_code;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
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
