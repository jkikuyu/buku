package ke.co.buku.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ke.co.buku.dao.PublisherDao;
import ke.co.buku.model.Publisher;
import ke.co.buku.service.PublisherManager;

/**
 * Business Service Interface to handle communication between web and
 * persistence layer.
 *
 * @author <a href="mailto:jkikuyu@gmail.com">Jude Kikuyu </a>
 * date: 24/03/2017
 */
@Service("publisherManager")
public class PublisherManagerImpl extends GenericManagerImpl<Publisher, Long> implements PublisherManager {
	private PublisherDao publisherDao;

	@Override
    @Autowired
	public void setPublisherDao(PublisherDao publisherDao) {
        this.dao = publisherDao;
        this.publisherDao = publisherDao;
		
	}

/*    public PublisherManagerImpl(PublisherDao publisherDao) {
        super(publisherDao);
        this.publisherDao = publisherDao;
    }
*/
	/**
     * {@inheritDoc}
     */
    public List<Publisher> getPublishers(){
    	return dao.getAll();
    }

    /**
     * {@inheritDoc}
     */
    public Publisher getPublisher(Integer publisherId){
    	
    	return publisherDao.getPublisher(publisherId);
    }

    /**
     * {@inheritDoc}
     */
    public Publisher savePublisher(Publisher publisher){
    	return dao.save(publisher);
    }

    /**
     * {@inheritDoc}
     */
    public void removePublisher(Integer publisherId){
    	publisherDao.removePublisher(publisherId);
    }

	@Override
	public List<Publisher> getPublisher() {
		// TODO Auto-generated method stub
		return null;
	}


}
