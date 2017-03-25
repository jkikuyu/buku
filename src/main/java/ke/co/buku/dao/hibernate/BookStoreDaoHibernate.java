package ke.co.buku.dao.hibernate;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import ke.co.buku.dao.BookStoreDao;
import ke.co.buku.dao.SearchException;
import ke.co.buku.model.BookStore;
@Repository("bookStoreDao")
public class BookStoreDaoHibernate extends GenericDaoHibernate<BookStore, Long> implements BookStoreDao {

	public BookStoreDaoHibernate() {
		super(BookStore.class);
	}

	@Override
	public List<BookStore> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BookStore> getAllDistinct() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BookStore> search(String searchTerm) throws SearchException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookStore get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public BookStore save(BookStore object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(BookStore object) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<BookStore> findByNamedQuery(String queryName, Map<String, Object> queryParams) {
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
	public BookStore getBookStore(Integer bookstoreId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookStore saveBookStore(BookStore bookstore) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeBookStore(Integer bookstoreId) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<BookStore> getBookStores() {
		// TODO Auto-generated method stub
		return null;
	}

}
