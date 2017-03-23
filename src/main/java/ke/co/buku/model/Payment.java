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
@Table(name = "PAYMENT")
@Indexed
@XmlRootElement

public class Payment extends BaseObject implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @DocumentId
	private Long paymentId;
	private Integer receiptNo;
	private String trans_code;
	private Double amount;

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
