package ke.co.buku.service;

import java.util.List;

import ke.co.buku.dao.ClaszDao;
import ke.co.buku.model.Clasz;

/**
 * Business Service Interface to handle communication between web and
 * persistence layer.
 *
 * @author <a href="mailto:jkikuyu@gmail.com">Jude Kikuyu </a>
 * date: 24/03/2017
 */

public interface ClaszManager extends GenericManager<Clasz, Long> {
    /**
     * Convenience method for testing - allows you to mock the DAO and set it on an interface.
     * @param classDao the ClassDao implementation to use
     */

	void setClaszDao(ClaszDao classDao);

	/**
     * {@inheritDoc}
     */
	List <Clasz> getClasses();

    /**
     * {@inheritDoc}
     */
	Clasz getClass(Integer classId);

    /**
     * {@inheritDoc}
     */
	Clasz saveClass(Clasz clasz);

    /**
     * {@inheritDoc}
     */
    void removeClass(Integer classId);
    /**
     * Search a user for search terms.
     * @param searchTerm the search terms.
     * @return a list of matches, or all if no searchTerm.
     */
    List<Clasz> search(String searchTerm);


}
