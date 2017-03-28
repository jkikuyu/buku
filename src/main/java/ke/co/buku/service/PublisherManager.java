package ke.co.buku.service;

import java.util.List;

import ke.co.buku.dao.PublisherDao;
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
     * Convenience method for testing - allows you to mock the DAO and set it on an interface.
     * @param publisherDao the PublisherDao implementation to use
     */

	void setPublisherDao(PublisherDao publisherDao);

	/**
     * {@inheritDoc}
     */
    List <Publisher>getPublisher();

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
