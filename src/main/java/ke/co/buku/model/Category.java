package ke.co.buku.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	
	@Column(nullable = false, length = 50, unique = true)
	private String CategoryName;
	

	public Category() {
		// TODO Auto-generated constructor stub
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
