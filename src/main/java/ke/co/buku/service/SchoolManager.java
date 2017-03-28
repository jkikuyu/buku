package ke.co.buku.service;

import java.util.List;

import ke.co.buku.dao.SchoolDao;
import ke.co.buku.model.School;
import ke.co.buku.model.User;

/**
 * Business Service Interface to handle communication between web and
 * persistence layer.
 *
 * @author <a href="mailto:jkikuyu@gmail.com">Jude Kikuyu </a>
 * date: 24/03/2017
 */
public interface SchoolManager extends GenericManager<School, Long> {
    /**
     * Convenience method for testing - allows you to mock the DAO and set it on an interface.
     * @param schoolDao the BookStoreDao implementation to use
     */

	void setSchoolDao(SchoolDao schoolDao);

	/**
     * {@inheritDoc}
     */

    List<School> getSchools();

    /**S
     * {@inheritDoc}
     */
    School getSchool(Integer schoolId);

    /**
     * {@inheritDoc}
     */
    School saveSchool(School school);

    /**
     * {@inheritDoc}
     */
    void removeSchool(Integer schoolId);

    /**
     * Search a user for search terms.
     * @param searchTerm the search terms.
     * @return a list of matches, or all if no searchTerm.
     */
    List<School> search(String searchTerm);

}
