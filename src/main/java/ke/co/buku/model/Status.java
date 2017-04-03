package ke.co.buku.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.search.annotations.DocumentId;
import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Indexed;
@Entity
@Table(name = "STATUS")
@Indexed
@XmlRootElement
@SequenceGenerator(allocationSize=1,name="sequence", sequenceName="STATUS_FCSEQ")

public class Status extends BaseObject implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @DocumentId
	private Long statusId;
	@Column(nullable = false, length = 25)
	@Field
	private String name;

	@Column(nullable = false, length = 50)
	@Field
	private String description;

	
	@OneToMany(mappedBy="status")
	private Set<Delivery> delivery;
	
	
	public Status() {
		// TODO Auto-generated constructor stub
	}

	public Long getStatusId() {
		return statusId;
	}

	public String getName() {
		return name;
	}

	public Set<Delivery> getDelivery() {
		return delivery;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setDelivery(Set<Delivery> delivery) {
		this.delivery = delivery;
	}

	public void setStatusId(Long statusId) {
		this.statusId = statusId;
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
