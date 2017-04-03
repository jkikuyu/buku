package ke.co.buku.dao.hibernate;

import java.util.List;

import org.springframework.stereotype.Repository;

import ke.co.buku.dao.PublisherDao;
import ke.co.buku.model.Publisher;
@Repository("publisherDao")
public class PublisherDaoHibernate extends GenericDaoHibernate<Publisher, Long> implements PublisherDao {

	public PublisherDaoHibernate() {
		super(Publisher.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Publisher getPublisher(Integer publisherId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Publisher savePublisher(Publisher publisher) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removePublisher(Integer publisherId) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Publisher> getPublishers() {
		// TODO Auto-generated method stub
		return null;
	}

}
