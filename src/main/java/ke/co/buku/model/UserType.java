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
@Table(name = "USERTYPE")
@Indexed
@XmlRootElement
@SequenceGenerator(allocationSize=1,name="sequence", sequenceName="USERTYPE_FCSEQ")

public class UserType extends BaseObject implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @DocumentId
	private Long userTypeId;
    @Column(nullable = false, length = 25)
	@Field
	private String name;

    @Column(nullable = false, length = 50)
	@Field
	private String description;

    
	@OneToMany(mappedBy="userType")
	private Set<User> users;
	
	public UserType() {
		// TODO Auto-generated constructor stub
	}

	public Long getUserTypeId() {
		return userTypeId;
	}

	public String getName() {
		return name;
	}

	public Set<User> getUsers() {
		return users;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	public void setUserTypeId(Long userTypeId) {
		this.userTypeId = userTypeId;
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
