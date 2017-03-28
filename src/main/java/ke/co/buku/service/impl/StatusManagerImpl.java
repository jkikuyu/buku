package ke.co.buku.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ke.co.buku.dao.StatusDao;
import ke.co.buku.model.Status;
import ke.co.buku.service.StatusManager;
@Service("statusManager")
public class StatusManagerImpl extends GenericManagerImpl<Status, Long> implements StatusManager {

	
	private StatusDao tstatusDao;
	@Override
	@Autowired
	public void setStatusDao(StatusDao statusDao) {
		this.dao = statusDao;
		this.tstatusDao = statusDao;

	}


	@Override
	public List<Status> getStatuses() {
		return dao.getAll();
	}

	@Override
	public Status getStatus(Integer statusId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Status saveStatus(Status status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeStatus(Integer status) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Status> search(String searchTerm) {
		// TODO Auto-generated method stub
		return null;
	}



}
