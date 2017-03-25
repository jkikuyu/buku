package ke.co.buku.dao;

import java.util.List;

import ke.co.buku.model.BookStore;
import ke.co.buku.model.Category;

/**
 * Book Data Access Object (DAO) interface.
 *
 * @author <a href="mailto:jkikuyu@gmail.com">Jude Kikuyu</a>
 * date: 24/03/2017
 */

public interface CategoryDao extends GenericDao<Category, Long> {
    /**
     * {@inheritDoc}
     */
	
	
	public List <Category> getCategories();

	    /**
	     * {@inheritDoc}
	     */
	public Category getCategory(Integer categoryId);

	    /**
	     * {@inheritDoc}
	     */
	public Category saveCategory(Category category);

	    /**
	     * {@inheritDoc}
	     */
	public void removeCategory(Integer categoryId);
}
