package ke.co.buku.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ke.co.buku.dao.BookStoreDao;
import ke.co.buku.model.BookStore;
import ke.co.buku.service.BookStoreManager;

/**
 * Business Service Interface to handle communication between web and
 * persistence layer.
 *
 * @author <a href="mailto:jkikuyu@gmail.com">Jude Kikuyu </a>
 * date: 24/03/2017
 */
@Service("bookStoreManager")
public class BookStoreManagerImpl extends GenericManagerImpl<BookStore, Long> implements BookStoreManager{
	BookStoreDao bookStoreDao;

    @Autowired
    public BookStoreManagerImpl(BookStoreDao bookStoreDao) {
        super(bookStoreDao);
        this.bookStoreDao = bookStoreDao;
    }

	/**
     * {@inheritDoc}
     */

    public List <BookStore>getBookStores(){
    	return dao.getAll();
    }

    /**
     * {@inheritDoc}
     */
    public BookStore getBookStore(Integer bookstoreId){
    	return bookStoreDao.getBookStore(bookstoreId);
    }

    /**
     * {@inheritDoc}
     */
    public BookStore saveBookStore(BookStore bookstore){
    	return dao.save(bookstore);
    }

    /**
     * {@inheritDoc}
     */
    public void removeBookStore(Integer bookstoreId){
    	bookStoreDao.getBookStore(bookstoreId);
    }
    

}
