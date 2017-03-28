package ke.co.buku.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ke.co.buku.dao.BookListDao;
import ke.co.buku.model.BookList;
import ke.co.buku.service.BookListManager;
/**
 * Business Service Interface to handle communication between web and
 * persistence layer.
 *
 * @author <a href="mailto:jkikuyu@gmail.com">Jude Kikuyu </a>
 * date: 24/03/2017
 */
@Service("bookListManager")
public class BookListManagerImpl extends GenericManagerImpl<BookList, Long> implements BookListManager{
	
	private BookListDao bookListDao;
	@Override
	@Autowired
	public void setBookListDao(BookListDao bookListDao) {
        this.dao = bookListDao;
        this.bookListDao = bookListDao;
		
	}
/*
    @Autowired
    public BookListManagerImpl(BookListDao bookListDao) {
        super(bookListDao);
        this.bookListDao = bookListDao;
    }
*/
    /**
     * {@inheritDoc}
     */
    public List <BookList> getBookLists(){
    	return dao.getAll();
    }

    /**
     * {@inheritDoc}
     */
    public BookList getBookList(Integer bookListId){
    	return bookListDao.getBookList(bookListId);
    }

    /**
     * {@inheritDoc}
     */
    public BookList saveBookList(BookList bookList){
    	return dao.save(bookList);
    }

    /**
     * {@inheritDoc}
     */
    public void removeBookList(Integer bookListId){
    	bookListDao.removeBookList(bookListId);
    }


}
