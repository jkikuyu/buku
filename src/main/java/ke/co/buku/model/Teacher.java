package ke.co.buku.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.search.annotations.DocumentId;
import org.hibernate.search.annotations.Indexed;
@Entity
@Table(name = "TEACHER")
@Indexed
@XmlRootElement
@SequenceGenerator(allocationSize=1,name="sequence", sequenceName="TEACHER_FCSEQ")

public class Teacher extends BaseObject implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @DocumentId
	private Long teacherId;
   	
	@OneToOne 
    @JoinColumn(name="USER_ID") 
	private User user;
	
	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="SCHOOL_ID") 
	private School school;
	
	@ManyToMany(fetch = FetchType.EAGER)
    @Fetch(FetchMode.SELECT)
    @JoinTable(
        name = "teacher_class",
        joinColumns = { @JoinColumn(name = "teacher_id") },
        inverseJoinColumns = @JoinColumn(name = "class_id")
        )
	private Set <Clasz> classes;
	
	public Teacher() {
		// TODO Auto-generated constructor stub
	}



	public Long getTeacherId() {
		return teacherId;
	}


	public User getUser() {
		return user;
	}

	public School getSchool() {
		return school;
	}
    

	public Set<Clasz> getClasses() {
		return classes;
	}



	public void setClasses(Set<Clasz> classes) {
		this.classes = classes;
	}



	public void setUser(User user) {
		this.user = user;
	}

	public School setSchool() {
		return school;
	}

	public void setTeacherId(Long teacherId) {
		this.teacherId = teacherId;
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
