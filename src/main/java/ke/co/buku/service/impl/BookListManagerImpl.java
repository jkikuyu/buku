package ke.co.buku.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ke.co.buku.dao.BookListDao;
import ke.co.buku.model.BookList;
/**
 * Business Service Interface to handle communication between web and
 * persistence layer.
 *
 * @author <a href="mailto:jkikuyu@gmail.com">Jude Kikuyu </a>
 * date: 24/03/2017
 */
@Service("bookListManager")
public class BookListManagerImpl extends GenericManagerImpl<BookList, Long> {
	BookListDao bookListDao;

    @Autowired
    public BookListManagerImpl(BookListDao bookListDao) {
        super(bookListDao);
        this.bookListDao = bookListDao;
    }

    /**
     * {@inheritDoc}
     */
    List <BookList> getBookLists(){
    	return dao.getAll();
    }

    /**
     * {@inheritDoc}
     */
    BookList getBookList(Integer bookListId){
    	return bookListDao.getBookList(bookListId);
    }

    /**
     * {@inheritDoc}
     */
    BookList saveBookList(BookList bookList){
    	return dao.save(bookList);
    }

    /**
     * {@inheritDoc}
     */
    void removeBookList(Integer bookListId){
    	bookListDao.removeBookList(bookListId);
    }

}
