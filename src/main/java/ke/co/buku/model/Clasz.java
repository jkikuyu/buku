package ke.co.buku.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.search.annotations.DocumentId;
import org.hibernate.search.annotations.Indexed;
/**
 * This class represents the basic Class object in Buku that allows 
 * for Entry of class Details
 
 * @author <a href="mailto:jkikuyu@gmail.com">Jude Kikuyu/a>
 *        

 */
@Entity
@Table(name = "CLASS")
@Indexed
@XmlRootElement
@SequenceGenerator(allocationSize=1,name="sequence", sequenceName="CLASS_FCSEQ")
public class Clasz extends BaseObject implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @DocumentId
	private Long classId;

	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="SCHOOL_ID") 
	private School school;
	@ManyToMany(mappedBy="classes")

	private Set<Teacher> teachers;
	
	@OneToOne(mappedBy="clasz")	
	private BookList booklist;

	public Clasz() {
		// TODO Auto-generated constructor stub
	}

	public Long getClassId() {
		return classId;
	}


    public School getSchool() {
		return school;
	}

	public Set<Teacher> getTeachers() {
		return teachers;
	}

	public BookList getBooklist() {
		return booklist;
	}

	public void setBooklist(BookList booklist) {
		this.booklist = booklist;
	}

	public void setTeachers(Set<Teacher> teachers) {
		this.teachers = teachers;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	public void setClassId(Long classId) {
		this.classId = classId;
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
