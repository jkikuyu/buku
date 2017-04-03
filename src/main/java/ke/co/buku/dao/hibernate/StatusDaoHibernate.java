package ke.co.buku.dao.hibernate;

import java.util.List;

import org.springframework.stereotype.Repository;

import ke.co.buku.dao.StatusDao;
import ke.co.buku.model.Status;
@Repository("statusDao")
public class StatusDaoHibernate extends GenericDaoHibernate<Status, Long> implements StatusDao {

	public StatusDaoHibernate() {
		super(Status.class);
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
