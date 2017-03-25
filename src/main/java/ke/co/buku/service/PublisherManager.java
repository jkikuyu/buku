package ke.co.buku.service;

import java.util.List;

import ke.co.buku.model.BookList;
import ke.co.buku.model.Publisher;

/**
 * Business Service Interface to handle communication between web and
 * persistence layer.
 *
 * @author <a href="mailto:jkikuyu@gmail.com">Jude Kikuyu </a>
 * date: 24/03/2017
 */
public interface PublisherManager extends GenericManager<Publisher, Long> {
    /**
     * {@inheritDoc}
     */
    List getBookLists(Publisher publisher);

    /**
     * {@inheritDoc}
     */
    Publisher getPublisher(Integer publisherId);

    /**
     * {@inheritDoc}
     */
    Publisher savePublisher(Publisher publisher);

    /**
     * {@inheritDoc}
     */
    void removePublisher(Integer publisherId);


}
