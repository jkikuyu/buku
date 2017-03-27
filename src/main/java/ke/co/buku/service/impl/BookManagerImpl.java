package ke.co.buku.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ke.co.buku.dao.BookDao;
import ke.co.buku.model.Book;
import ke.co.buku.service.BookManager;
/**
 * Business Service Interface to handle communication between web and
 * persistence layer.
 *
 * @author <a href="mailto:jkikuyu@gmail.com">Jude Kikuyu </a>
 * date: 24/03/2017
 */
@Service("bookManager")

public class BookManagerImpl extends GenericManagerImpl<Book, Long> implements BookManager{
	BookDao bookDao;

    @Autowired
    public BookManagerImpl(BookDao bookDao) {
        super(bookDao);
        this.bookDao = bookDao;
    }

    /**
     * {@inheritDoc}
     */
    public List <Book> getBooks(){
		return dao.getAll();
    	
    }

    /**
     * {@inheritDoc}
     */
    public Book getBook(Integer bookId){
    	return bookDao.getBook(bookId);
    	
    }

    /**
     * {@inheritDoc}
     */
    public Book saveBook(Book book){
    	return dao.save(book);
    }

    /**
     * {@inheritDoc}
     */
    public void removeBook(Integer bookId){
    	bookDao.removeBook(bookId);
    	
    }
}

