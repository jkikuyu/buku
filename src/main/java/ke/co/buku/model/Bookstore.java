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
import javax.persistence.Table;
import javax.validation.constraints.Pattern;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.search.annotations.DocumentId;
import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Indexed;
import org.hibernate.search.annotations.IndexedEmbedded;
/**
 * This class represents the basic Bookstore object in Buku that allows 
 * for Entry of bookstore Details
 
 * @author <a href="mailto:jkikuyu@gmail.com">Jude Kikuyu/a>
 *        

 */
@Entity
@Table(name = "BOOKSTORE")
@Indexed
@XmlRootElement
public class Bookstore extends BaseObject implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long storeId;
	private String storeName;
	private Address address= new Address();
	private String telNo1;
	private String telNo2;
	private String email;
	private String website;
	private User user;

	public Bookstore() {
		// TODO Auto-generated constructor stub
	}
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @DocumentId

	public Long getStoreId() {
		return storeId;
	}
    @Column(nullable = false, length = 50, unique = true)
    @Field
	public String getStoreName() {
		return storeName;
	}
	@Embedded
	@IndexedEmbedded
	public Address getAddress() {
		return address;
	}
    @Pattern(regexp="(^$|[0-9]{10})")
    @Field

	public String getTelNo1() {
		return telNo1;
	}
    @Pattern(regexp="(^$|[0-9]{10})")
    @Field

	public String getTelNo2() {
		return telNo2;
	}

	public String getEmail() {
		return email;
	}

	public String getWebsite() {
		return website;
	}
    @OneToOne 
    @JoinColumn(name="USER_ID") 
    

    public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

	public void setStoreId(Long storeId) {
		this.storeId = storeId;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
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

	public void setWebsite(String website) {
		this.website = website;
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
