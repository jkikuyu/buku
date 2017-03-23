package ke.co.buku.model;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.search.annotations.DocumentId;
import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Indexed;
import org.hibernate.search.annotations.IndexedEmbedded;

/**
 * This class represents the basic School object in Buku that allows 
 * for Entry of school Details
 
 * @author <a href="mailto:jkikuyu@gmail.com">Jude Kikuyu/a>
 *        

 */
@Entity
@Table(name = "SCHOOL")
@Indexed
@XmlRootElement


public class School extends BaseObject implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @DocumentId
	private Long schoolId;
	private String schoolName;
	private Address address = new Address();
	private String telNo1;
	private String telNo2;
	private String email;
	private String website;
	private Set <Teacher> teachers;
	private Set <Class> classes;
	
	public School() {
		// TODO Auto-generated constructor stub
	}

	public Long getSchoolId() {
		return schoolId;
	}
/*    @OneToMany(mappedBy="school")
    
	public List <Teacher> getTeacher(){
		return teachers;
	}
*/    
	@Column(nullable = false, length = 100, unique = true)
    @Field

	public String getSchoolName() {
		return schoolName;
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
    @Column(nullable = false, unique = true)
    @Field
	public String getEmail() {
		return email;
	}
	 @Field
	public String getWebsite() {
		return website;
	}
	
	@OneToMany(mappedBy="school")
	public Set<Teacher> getTeachers() {
		return teachers;
	}
	@OneToMany(mappedBy="school")
	public Set<Class> getClasses() {
		return classes;
	}

	public void setTeachers(Set<Teacher> teachers) {
		this.teachers = teachers;
	}

	public void setClasses(Set<Class> classes) {
		this.classes = classes;
	}

	public void setSchoolId(Long schoolId) {
		this.schoolId = schoolId;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
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
	public int hashCode() {
		// TODO Auto-generated method stub
		return 0;
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
}
