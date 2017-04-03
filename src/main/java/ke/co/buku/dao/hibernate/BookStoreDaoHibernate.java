package ke.co.buku.dao.hibernate;

import java.util.List;

import org.springframework.stereotype.Repository;

import ke.co.buku.dao.BookStoreDao;
import ke.co.buku.model.BookStore;
@Repository("bookStoreDao")
public class BookStoreDaoHibernate extends GenericDaoHibernate<BookStore, Long> implements BookStoreDao {

	public BookStoreDaoHibernate() {
		super(BookStore.class);
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
