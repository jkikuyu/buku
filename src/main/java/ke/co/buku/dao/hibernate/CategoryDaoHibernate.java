package ke.co.buku.dao.hibernate;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import ke.co.buku.dao.CategoryDao;
import ke.co.buku.dao.SearchException;
import ke.co.buku.model.Category;
@Repository("categoryDao")

public class CategoryDaoHibernate extends GenericDaoHibernate<Category, Long> implements CategoryDao {

	public CategoryDaoHibernate() {
		super(Category.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Category> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Category> getAllDistinct() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Category> search(String searchTerm) throws SearchException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Category save(Category object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(Category object) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Category> findByNamedQuery(String queryName, Map<String, Object> queryParams) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void reindex() {
		// TODO Auto-generated method stub

	}

	@Override
	public void reindexAll(boolean async) {
		// TODO Auto-generated method stub

	}


	@Override
	public Category getCategory(Integer categoryId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category saveCategory(Category category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeCategory(Integer categoryId) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Category> getCategories() {
		// TODO Auto-generated method stub
		return null;
	}

}
