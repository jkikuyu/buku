package ke.co.buku.dao.hibernate;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import ke.co.buku.dao.SearchException;
import ke.co.buku.dao.StatusDao;
import ke.co.buku.model.School;
import ke.co.buku.model.Status;
@Repository("statusDao")
public class StatusDaoHibernate extends GenericDaoHibernate<Status, Long> implements StatusDao {

	public StatusDaoHibernate() {
		super(Status.class);
	}

	@Override
	public List<Status> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Status> getAllDistinct() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Status> search(String searchTerm) throws SearchException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Status get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Status save(Status object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(Status object) {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void remove(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Status> findByNamedQuery(String queryName, Map<String, Object> queryParams) {
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
	public Status getStatus(Integer statusId) {
		return null;
	}

	@Override
	public Status saveStatus(Status status) {
		return null;
	}

	@Override
	public void removeStatus(Integer statusId) {

	}

	@Override
	public List<Status> getStatuses() {
		// TODO Auto-generated method stub
		return null;
	}

}
