package ke.co.buku.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.search.annotations.DocumentId;
import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Indexed;
@Entity
@Table(name = "REGISTRATION")
@Indexed
@XmlRootElement
public class UserRegistration extends BaseObject implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @DocumentId
	private Long regId;
    
	@Column(nullable = false, length = 25)
    @Field
	private String fName;
    
	@Column(nullable = false, length = 25)
    @Field
	private String lName;
    
	@Column(nullable = false, length = 25)
    @Field
	private String userName;
   
    @Column(nullable = false, unique = true, length = 100)
    @Field
	private String email;
    
    @Field
    private String verifyURL;
	

	public UserRegistration() {
		// TODO Auto-generated constructor stub
	}
	public Long getRegId() {
		return regId;
	}
	


/*	public User getUser() {
		return user;
	}
*/

	public String getfName() {
		return fName;
	}
	public String getlName() {
		return lName;
	}
    public String getEmail() {
		return email;
	}
    @Column(nullable = false, length = 50)
    @Field
	public String getVerifyURL() {
		return verifyURL;
	}
	
/*    @OneToOne(mappedBy="userRegistration")
	public User getUser() {
		return user;
	}
*/    
    @Column(nullable = false, unique = true, length = 50)
    @Field
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

/*	public void setUser(User user) {
		this.user = user;
	}
*/
	public void setRegId(Long regId) {
		this.regId = regId;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setVerifyURL(String verifyURL) {
		this.verifyURL = verifyURL;
	}
	
/*	public void setUser(User user) {
		this.user = user;
	}
*/
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
