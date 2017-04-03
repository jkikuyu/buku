package ke.co.buku.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.search.annotations.DocumentId;
import org.hibernate.search.annotations.Indexed;
/**
 * This class represents the basic Category object in Buku that allows 
 * for Entry of book category
 
 * @author <a href="mailto:jkikuyu@gmail.com">Jude Kikuyu/a>
 *        

 */
@Entity
@Table(name = "CATEGORY")
@Indexed
@XmlRootElement
public class Category extends BaseObject implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@DocumentId
	private Long categoryId;
	
	@Column(nullable = false, length = 25, unique = true)
	private String CategoryName;
	
	@Column(nullable = false, length = 100, unique = true)
	private String description;

	
	@OneToMany(mappedBy="category")
	private Set <Book> books;

	public Category() {
		// TODO Auto-generated constructor stub
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public String getCategoryName() {
		return CategoryName;
	}

	public Set<Book> getBooks() {
		return books;
	}

	public String getDescription() {
		return description;
	}


	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}

	public void setBooks(Set<Book> books) {
		this.books = books;
	}
	
	public void setDescription(String description) {
		this.description = description;
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
