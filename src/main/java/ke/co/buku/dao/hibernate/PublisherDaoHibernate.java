package ke.co.buku.dao.hibernate;

import java.util.List;
import java.util.Map;

import ke.co.buku.dao.PublisherDao;
import ke.co.buku.dao.SearchException;
import ke.co.buku.model.Publisher;

public class PublisherDaoHibernate extends GenericDaoHibernate<Publisher, Long> implements PublisherDao {

	public PublisherDaoHibernate() {
		super(Publisher.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Publisher> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Publisher> getAllDistinct() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Publisher> search(String searchTerm) throws SearchException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Publisher get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Publisher save(Publisher object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(Publisher object) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Publisher> findByNamedQuery(String queryName, Map<String, Object> queryParams) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void reindex() {
		// TODO Auto-generated method stub

	}

	@Override
	public void reindexAll(boolean async) {
		// TODO Auto-generated method stub

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
