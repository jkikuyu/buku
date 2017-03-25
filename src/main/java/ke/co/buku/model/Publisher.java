package ke.co.buku.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.search.annotations.DocumentId;
import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Indexed;
import org.hibernate.search.annotations.IndexedEmbedded;


@Entity
@Table(name = "PUBLISHER")
@Indexed
@XmlRootElement
@SequenceGenerator(allocationSize=1,name="sequence", sequenceName="PUBLISHER_FCSEQ")

public class Publisher extends BaseObject implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@DocumentId
	private Long publisherId;
	
	@Column(nullable = false, length = 100, unique = true)
	@Field
	private String PublisherName;
   
	@Embedded
    @IndexedEmbedded
	private Address address = new Address();

	@Column(nullable = false, length = 25)
	@Field
	private String telNo1;
	
	@Column(nullable = false, length = 25)
	@Field
	private String telNo2;
	
	@Column(nullable = false, length = 100)
	@Field
	private String email;
	
    @OneToOne 
    @JoinColumn(name="USER_ID") 
	private User user;
	
	public Publisher() {
		// TODO Auto-generated constructor stub
	}
	
    
	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public Long getPublisherId() {
		return publisherId;
	}
	public String getPublisherName() {
		return PublisherName;
	}
	public Address getAddress() {
		return address;
	}
	public String getTelNo1() {
		return telNo1;
	}
	public String getTelNo2() {
		return telNo2;
	}
	public String getEmail() {
		return email;
	}

	public void setPublisherId(Long publisherId) {
		this.publisherId = publisherId;
	}

	public void setPublisherName(String publisherName) {
		PublisherName = publisherName;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setTelNo1(String telNo1) {
		this.telNo1 = telNo1;
	}

	public void setTelNo2(String telNo2) {
		this.telNo2 = telNo2;
	}

	public void setEmail(String email) {
		this.email = email;
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
