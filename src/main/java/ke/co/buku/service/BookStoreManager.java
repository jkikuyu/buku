package ke.co.buku.service;

import java.util.List;

import ke.co.buku.dao.BookStoreDao;
import ke.co.buku.model.BookStore;

/**
 * Business Service Interface to handle communication between web and
 * persistence layer.
 *
 * @author <a href="mailto:jkikuyu@gmail.com">Jude Kikuyu </a>
 * date: 24/03/2017
 */
public interface BookStoreManager extends GenericManager<BookStore, Long> {
    /**
     * Convenience method for testing - allows you to mock the DAO and set it on an interface.
     * @param bookStoreDao the BookStoreDao implementation to use
     */

	void setBookStoreDao(BookStoreDao bookStoreDao);

	/**
     * {@inheritDoc}
     */

    List <BookStore> getBookStores();

    /**
     * {@inheritDoc}
     */
    BookStore getBookStore(Integer bookstoreId);

    /**
     * {@inheritDoc}
     */
    BookStore saveBookStore(BookStore bookstore);

    /**
     * {@inheritDoc}
     */
    void removeBookStore(Integer bookstoreId);

}
