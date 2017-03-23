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
@Table(name = "PAYMENTMODE")
@Indexed
@XmlRootElement
public class PaymentMode extends BaseObject implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @DocumentId
	private Long modeId;
	private String name;
	

	public PaymentMode() {
		// TODO Auto-generated constructor stub
	}

	public Long getModeId() {
		return modeId;
	}

	public String getName() {
		return name;
	}

	public void setModeId(Long modeId) {
		this.modeId = modeId;
	}

	public void setName(String name) {
		this.name = name;
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
