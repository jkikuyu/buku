package ke.co.buku.service;

import java.util.List;

import ke.co.buku.dao.ClassDao;
import ke.co.buku.model.Status;

/**
 * Business Service Interface to handle communication between web and
 * persistence layer.
 *
 * @author <a href="mailto:jkikuyu@gmail.com">Jude Kikuyu </a>
 * date: 24/03/2017
 */

public interface ClassManager extends GenericManager<Class, Long> {
    /**
     * Convenience method for testing - allows you to mock the DAO and set it on an interface.
     * @param classDao the ClassDao implementation to use
     */

	void setClassDao(ClassDao classDao);

	/**
     * {@inheritDoc}
     */
	List <Class> getClasses();

    /**
     * {@inheritDoc}
     */
	Class getClass(Integer classId);

    /**
     * {@inheritDoc}
     */
	Class saveClass(Class clasz);

    /**
     * {@inheritDoc}
     */
    void removeClass(Integer classId);
    /**
     * Search a user for search terms.
     * @param searchTerm the search terms.
     * @return a list of matches, or all if no searchTerm.
     */
    List<Class> search(String searchTerm);


}
