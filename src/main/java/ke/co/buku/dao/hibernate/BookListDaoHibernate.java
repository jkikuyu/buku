package ke.co.buku.dao.hibernate;

import java.util.List;

import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.springframework.stereotype.Repository;

import ke.co.buku.dao.BookListDao;
import ke.co.buku.model.BookList;
@Repository("bookListDao")
public class BookListDaoHibernate extends GenericDaoHibernate<BookList, Long> implements BookListDao {

	public BookListDaoHibernate() {
		super(BookList.class);
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
