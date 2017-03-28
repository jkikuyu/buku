package ke.co.buku.service;

import java.util.List;

import ke.co.buku.dao.BookListDao;
import ke.co.buku.model.BookList;
/**
 * Business Service Interface to handle communication between web and
 * persistence layer.
 *
 * @author <a href="mailto:jkikuyu@gmail.com">Jude Kikuyu </a>
 * date: 24/03/2017
 */

public interface BookListManager extends GenericManager<BookList, Long> {
	
    /**
     * Convenience method for testing - allows you to mock the DAO and set it on an interface.
     * @param userDao the UserDao implementation to use
     */

	void setBookListDao(BookListDao bookListDao);

    /**
     * {@inheritDoc}
     */
	public List <BookList> getBookLists();

    /**
     * {@inheritDoc}
     */
	public BookList getBookList(Integer bookListId);

    /**
     * {@inheritDoc}
     */
	public BookList saveBookList(BookList bookList);

    /**
     * {@inheritDoc}
     */
	public void removeBookList(Integer bookListId);

}
