package ke.co.buku.dao;

import java.util.List;

import ke.co.buku.model.Book;
/**
 * Book Data Access Object (DAO) interface.
 *
 * @author <a href="mailto:jkikuyu@gmail.com">Jude Kikuyu</a>
 * date: 24/03/2017
 */

public interface BookDao extends GenericDao<Book, Long> {
    /**
     * {@iheritDoc}
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

