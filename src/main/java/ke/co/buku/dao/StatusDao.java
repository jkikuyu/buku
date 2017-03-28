package ke.co.buku.dao;

import java.util.List;

import ke.co.buku.model.Status;

public interface StatusDao extends GenericDao<Status, Long> {
	
    /**
     * {@iheritDoc}
     */
	public List <Status> getStatuses();
    /**
     * {@inheritDoc}
     */

	public Status getStatus(Integer statusId);
    /**
     * {@inheritDoc}
     */

	public Status saveStatus(Status Status);
    /**
     * {@inheritDoc}
     */
  
	public void removeStatus(Integer statusId);

}
