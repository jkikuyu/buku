package ke.co.buku.service;

import java.util.List;

import ke.co.buku.dao.CategoryDao;
import ke.co.buku.model.Category;
import ke.co.buku.model.Role;

/**
 * Business Service Interface to handle communication between web and
 * persistence layer.
 *
 * @author <a href="mailto:jkikuyu@gmail.com">Jude Kikuyu </a>
 * date: 24/03/2017
 */
public interface CategoryManager extends GenericManager<Category, Long> {
    /**
     * Convenience method for testing - allows you to mock the DAO and set it on an interface.
     * @param categoryDao the CategoryDao implementation to use
     */

	void setCategoryDao(CategoryDao categoryDao);

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
	    /**
	     * Search a user for search terms.
	     * @param searchTerm the search terms.
	     * @return a list of matches, or all if no searchTerm.
	     */
	    List<Category> search(String searchTerm);

}
