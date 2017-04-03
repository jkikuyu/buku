package ke.co.buku.dao.hibernate;

import java.util.List;

import org.springframework.stereotype.Repository;

import ke.co.buku.dao.BookDao;
import ke.co.buku.model.Book;
@Repository("bookDao")
public class BookDaoHibernate extends GenericDaoHibernate<Book, Long> implements BookDao {

	public BookDaoHibernate() {
		super(Book.class);
	}


	@Override
	public Book getBook(Integer bookId) {
		// TODO Auto-generated method stub
		return null;
	}

	public Book saveBook(Book book) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeBook(Integer bookId) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Book> getBooks() {
		// TODO Auto-generated method stub
		return null;
	}

}
