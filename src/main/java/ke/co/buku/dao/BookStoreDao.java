package ke.co.buku.dao;

import java.util.List;

import ke.co.buku.model.BookStore;

/**
 * Book Data Access Object (DAO) interface.
 *
 * @author <a href="mailto:jkikuyu@gmail.com">Jude Kikuyu</a>
 * date: 24/03/2017
 */

public interface BookStoreDao extends GenericDao<BookStore, Long> {
    /**
     * {@inheritDoc}
     */

	public List <BookStore>  getBookStores();

    /**
     * {@inheritDoc}
     */
	public BookStore getBookStore(Integer bookstoreId);

    /**
     * {@inheritDoc}
     */
	public BookStore saveBookStore(BookStore bookstore);

    /**
     * {@inheritDoc}
     */
	public void removeBookStore(Integer bookstoreId);

}
