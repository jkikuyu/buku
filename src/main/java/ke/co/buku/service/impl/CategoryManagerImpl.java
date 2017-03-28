package ke.co.buku.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ke.co.buku.dao.CategoryDao;
import ke.co.buku.model.Category;
import ke.co.buku.service.CategoryManager;

/**
 * Business Service Interface to handle communication between web and
 * persistence layer.
 *
 * @author <a href="mailto:jkikuyu@gmail.com">Jude Kikuyu </a>
 * date: 24/03/2017
 */
@Service("categoryManager")
public class CategoryManagerImpl extends GenericManagerImpl<Category, Long> implements CategoryManager {
	private CategoryDao categoryDao;
	
	@Override
    @Autowired
	public void setCategoryDao(CategoryDao categoryDao) {
        this.dao = categoryDao;
        this.categoryDao = categoryDao;
		
	}

/*    public CategoryManagerImpl(CategoryDao categoryDao) {
        super(categoryDao);
        this.categoryDao = categoryDao;
    }
*/
	/**
     * {@inheritDoc}
     */
	
	public List <Category>getCategories(){
		return dao.getAll();
	}

	    /**
	     * {@inheritDoc}
	     */
	  public Category getCategory(Integer categoryId){
		  return categoryDao.getCategory(categoryId);
	  }

	    /**
	     * {@inheritDoc}
	     */
	  public Category saveCategory(Category category){
		  return dao.save(category);
	  }

	    /**
	     * {@inheritDoc}
	     */
	    public void removeCategory(Integer categoryId){
	    	categoryDao.removeCategory(categoryId);
	    	
	    }

		@Override
		public List<Category> search(String searchTerm) {
			// TODO Auto-generated method stub
	        return super.search(searchTerm, Category.class);
		}

}
