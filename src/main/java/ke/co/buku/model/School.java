package ke.co.buku.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
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
@SequenceGenerator(allocationSize=1,name="sequence", sequenceName="SCHOOL_FCSEQ")
public class School extends BaseObject implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @DocumentId
	private Long schoolId;
	
	@Column(nullable = false, length = 25, unique = true)
    @Field
	private String shortName;
	@Column(nullable = false, length = 50, unique = true)
    @Field
	private String longName;
	

	private Address address = new Address();

	
    @Pattern(regexp="(^$|[0-9]{10})")
    @Field
	private String telNo1;
	
    @Pattern(regexp="(^$|[0-9]{10})")
    @Field
	private String telNo2;
	
    @Column(nullable = false, unique = true)
    @Field
    private String email;
	
	@Field
	private String website;

	@OneToMany(mappedBy="school")
	private Set <Teacher> teachers;
	
	@OneToMany(mappedBy="school")
	private Set <Clasz> classes;
	
	public School() {
	}
	public Long getSchoolId() {
		return schoolId;
	}
 
	
    @Embedded
    @IndexedEmbedded
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
	public String getWebsite() {
		return website;
	}
	
	public Set<Teacher> getTeachers() {
		return teachers;
	}
	public Set<Clasz> getClasses() {
		return classes;
	}

	public String getShortName() {
		return shortName;
	}
	public String getLongName() {
		return longName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public void setLongName(String longName) {
		this.longName = longName;
	}
	public void setTeachers(Set<Teacher> teachers) {
		this.teachers = teachers;
	}

	public void setClasses(Set<Clasz> classes) {
		this.classes = classes;
	}

	public void setSchoolId(Long schoolId) {
		this.schoolId = schoolId;
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
