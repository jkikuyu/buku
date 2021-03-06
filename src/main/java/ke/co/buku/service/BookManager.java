package ke.co.buku.service;

import java.util.List;

import ke.co.buku.dao.BookDao;
import ke.co.buku.model.Book;
/**
 * Business Service Interface to handle communication between web and
 * persistence layer.
 *
 * @author <a href="mailto:jkikuyu@gmail.com">Jude Kikuyu </a>
 * date: 24/03/2017
 */
public interface BookManager extends GenericManager<Book, Long> {
	
    /**
     * Convenience method for testing - allows you to mock the DAO and set it on an interface.
     * @param bookDao the BookDao implementation to use
     */

	void setBookDao(BookDao bookDao);

    /**
     * {@inheritDoc}
     */
	public List <Book> getBooks();

    /**
     * {@inheritDoc}
     */
	public Book getBook(Integer bookId);

    /**
     * {@inheritDoc}
     */
	public Book saveBook(Book book);

    /**
     * {@inheritDoc}
     */
	public void removeBook(Integer bookId);
}

