package ke.co.buku.dao.hibernate;

import java.util.List;
import java.util.Map;

import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.springframework.stereotype.Repository;

import ke.co.buku.dao.BookListDao;
import ke.co.buku.dao.SearchException;
import ke.co.buku.model.BookList;
@Repository("bookListDao")
public class BookListDaoHibernate extends GenericDaoHibernate<BookList, Long> implements BookListDao {

	public BookListDaoHibernate() {
		super(BookList.class);
	}

	@Override
	public List<BookList> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BookList> getAllDistinct() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BookList> search(String searchTerm) throws SearchException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookList get(Long idBookDaoHibernate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public BookList save(BookList object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(BookList object) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<BookList> findByNamedQuery(String queryName, Map<String, Object> queryParams) {
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
	public BookList getBookList(Integer bookListId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookList saveBookList(BookList bookList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeBookList(Integer bookListId) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<BookList> getBookLists() {
		// TODO Auto-generated method stub
		return null;
	}

}
