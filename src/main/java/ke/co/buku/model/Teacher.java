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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.search.annotations.DocumentId;
import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Indexed;
@Entity
@Table(name = "TEACHER")
@Indexed
@XmlRootElement
public class Teacher extends BaseObject implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long teacherId;

	private User user;
	private School school;
	public Teacher() {
		// TODO Auto-generated constructor stub
	}

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @DocumentId

	public Long getTeacherId() {
		return teacherId;
	}
    @OneToOne 
    @JoinColumn(name="USER_ID") 

	public User getUser() {
		return user;
	}
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="SCHOOL_ID") 
	public School getSchool() {
		return school;
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
