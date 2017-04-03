package ke.co.buku.dao.hibernate;

import java.util.List;

import org.springframework.stereotype.Repository;

import ke.co.buku.dao.CategoryDao;
import ke.co.buku.model.Category;
@Repository("categoryDao")

public class CategoryDaoHibernate extends GenericDaoHibernate<Category, Long> implements CategoryDao {

	public CategoryDaoHibernate() {
		super(Category.class);
		// TODO Auto-generated constructor stub
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
