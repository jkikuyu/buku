package ke.co.buku.service;

import java.util.List;

import ke.co.buku.dao.StatusDao;
import ke.co.buku.model.Status;

/**
 * Business Service Interface to handle communication between web and
 * persistence layer.
 *
 * @author <a href="mailto:jkikuyu@gmail.com">Jude Kikuyu </a>
 * date: 24/03/2017
 */
public interface StatusManager extends GenericManager<Status, Long> {

    /**
     * Convenience method for testing - allows you to mock the DAO and set it on an interface.
     * @param schoolDao the BookStoreDao implementation to use
     */

	void setStatusDao(StatusDao statusDao);

	/**
     * {@inheritDoc}
     */

    List<Status> getStatuses();

    /**S
     * {@inheritDoc}
     */
    Status getStatus(Integer statusId);

    /**
     * {@inheritDoc}
     */
    Status saveStatus(Status status);

    /**
     * {@inheritDoc}
     */
    void removeStatus(Integer statusId);

    /**
     * Search a user for search terms.
     * @param searchTerm the search terms.
     * @return a list of matches, or all if no searchTerm.
     */
    List<Status> search(String searchTerm);


}
