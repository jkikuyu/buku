package ke.co.buku.dao;

import java.util.List;

import ke.co.buku.model.Publisher;

/**
 * Book Data Access Object (DAO) interface.
 *
 * @author <a href="mailto:jkikuyu@gmail.com">Jude Kikuyu</a>
 * date: 24/03/2017
 */

public interface PublisherDao extends GenericDao<Publisher, Long> {
    /**
     * {@inheritDoc}
     */
	public List <Publisher> getPublishers();

    /**
     * {@inheritDoc}
     */
    public Publisher getPublisher(Integer publisherId);

    /**
     * {@inheritDoc}
     */
    public Publisher savePublisher(Publisher publisher);

    /**
     * {@inheritDoc}
     */
    public void removePublisher(Integer publisherId);


}
