package ke.co.buku.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.search.annotations.DocumentId;
import org.hibernate.search.annotations.Field;
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

public class Class extends BaseObject implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long classId;
	private String className;
	private School school;
	

	public Class() {
		// TODO Auto-generated constructor stub
	}
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @DocumentId

	public Long getClassId() {
		return classId;
	}
    @Column(nullable = false, length = 50, unique = true)
    @Field
	public String getClassName() {
		return className;
	}
    
	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="SCHOOL_ID") 

    public School getSchool() {
		return school;
	}
	public void setSchool(School school) {
		this.school = school;
	}

	public void setClassId(Long classId) {
		this.classId = classId;
	}

	public void setClassName(String className) {
		this.className = className;
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
