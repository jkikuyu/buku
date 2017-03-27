package ke.co.buku.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.search.annotations.DocumentId;
import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Indexed;
/**
 * This class represents the basic Booklist object in Buku that allows 
 * for Entry of booklist Details
 
 * @author <a href="mailto:jkikuyu@gmail.com">Jude Kikuyu/a>
 *        

 */
@Entity
@Table(name = "BOOKLIST")
@Indexed
@XmlRootElement
@SequenceGenerator(allocationSize=1,name="sequence", sequenceName="BOOKLIST_FCSEQ")

public class BookList extends BaseObject implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @DocumentId
	private Long booklistId;
   
	@Column(nullable = false, length = 50)
    @Field
	private String name;
    @Column(nullable = false, length = 50)
    @Field

	private Integer year;
	@OneToOne 
    @JoinColumn(name="CLASS_ID") 
	private Class clasz;
	

	public BookList() {
		// TODO Auto-generated constructor stub
	}

	public Long getBooklistId() {
		return booklistId;
	}
	public String getName() {
		return name;
	}
	public Integer getYear() {
		return year;
	}
	public Class getClasz() {
		return clasz;
	}
	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="BOOK_ID") 
	private Book book;
	
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
