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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.search.annotations.DocumentId;
import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Indexed;
/**
 * This class represents the basic book object in Buku that allows 
 * for Entry of book Details
 
 * @author <a href="mailto:jkikuyu@gmail.com">Jude Kikuyu/a>
 *        

 */
@Entity
@Table(name = "BOOKS")
@Indexed
@XmlRootElement
@SequenceGenerator(allocationSize=1,name="sequence", sequenceName="BOOK_FCSEQ")
public class Book extends BaseObject implements Serializable {
	
	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @DocumentId
	private Long bookId;
	private String Author;
	private String Name;
	private Integer edition;
	private String thumbnailLoc;
	private String samplePage;
	private String Description;
	private  Integer price;
	private Set <OrderItem> bookitems;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}


	public Long getBookId() {
		return bookId;
	}

    @Column(nullable = false, length = 30)
	@Field
	public String getAuthor() {
		return Author;
	}
    @Column(nullable = false, length = 50, unique = true)
	@Field
	public String getName() {
		return Name;
	}
	@Field
	public Integer getEdition() {
		return edition;
	}
	@Field
	public String getDescription() {
		return Description;
	}
	@Field
	public String getThumbnailLoc() {
		return thumbnailLoc;
	}
	@Field
	public String getSamplePage() {
		return samplePage;
	}
	@Field
	public Integer getPrice() {
		return price;
	}



	public Set <OrderItem> getBookitems() {
		return bookitems;
	}


	public void setBookitems(Set <OrderItem> bookitems) {
		this.bookitems = bookitems;
	}


	public void setPrice(Integer price) {
		this.price = price;
	}

	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}


	public void setAuthor(String author) {
		Author = author;
	}

	public void setName(String name) {
		Name = name;
	}

	public void setEdition(Integer edition) {
		this.edition = edition;
	}



	public void setDescription(String description) {
		Description = description;
	}

	public void setThumbnailLoc(String thumbnailLoc) {
		this.thumbnailLoc = thumbnailLoc;
	}

	public void setSamplePage(String samplePage) {
		this.samplePage = samplePage;
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
