package ke.co.buku.service;

import java.util.List;

import ke.co.buku.model.BookStore;
import ke.co.buku.model.Category;

/**
 * Business Service Interface to handle communication between web and
 * persistence layer.
 *
 * @author <a href="mailto:jkikuyu@gmail.com">Jude Kikuyu </a>
 * date: 24/03/2017
 */
public interface CategoryManager extends GenericManager<Category, Long> {
    /**
     * {@inheritDoc}
     */
	
	List <Category> getCategories();

	    /**
	     * {@inheritDoc}
	     */
	  Category getCategory(Integer categoryId);

	    /**
	     * {@inheritDoc}
	     */
	  Category saveCategory(Category category);

	    /**
	     * {@inheritDoc}
	     */
	    void removeCategory(Integer categoryId);
}
