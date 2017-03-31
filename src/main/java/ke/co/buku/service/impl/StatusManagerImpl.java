package ke.co.buku.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ke.co.buku.dao.StatusDao;
import ke.co.buku.model.Status;
import ke.co.buku.service.StatusManager;
@Service("statusManager")
public class StatusManagerImpl extends GenericManagerImpl<Status, Long> implements StatusManager {

	
	private StatusDao statusDao;
	@Override
	@Autowired
	public void setStatusDao(StatusDao statusDao) {
		this.dao = statusDao;
		this.statusDao = statusDao;

	}


	@Override
	public List<Status> getStatuses() {
		return dao.getAll();
	}

	@Override
	public Status getStatus(Integer statusId) {
		return statusDao.getStatus(statusId);
	}

	@Override
	public Status saveStatus(Status status) {
		return dao.save(status);
	}

	@Override
	public void removeStatus(Integer statusId) {
		statusDao.removeStatus(statusId);
		
	}

	@Override
	public List<Status> search(String searchTerm) {
		return super.search(searchTerm, Status.class);
	}



}
