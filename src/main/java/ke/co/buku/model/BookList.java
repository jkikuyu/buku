package ke.co.buku.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.search.annotations.DocumentId;
import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Indexed;
@Entity
@Table(name = "BOOKLIST")
@Indexed
@XmlRootElement
public class BookList extends BaseObject implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long booklistId;
	private String name;
	private Integer year;
	private Class clasz;
	

	public BookList() {
		// TODO Auto-generated constructor stub
	}
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @DocumentId

	public Long getBooklistId() {
		return booklistId;
	}
    @Column(nullable = false, length = 50)
    @Field
	public String getName() {
		return name;
	}
    @Column(nullable = false, length = 50, unique = true)
    @Field
	public Integer getYear() {
		return year;
	}
    @OneToOne(mappedBy="class")
	public Class getClasz() {
		return clasz;
	}


	public void setBooklistId(Long booklistId) {
		this.booklistId = booklistId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setYear(Integer year) {
		this.year = year;
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
