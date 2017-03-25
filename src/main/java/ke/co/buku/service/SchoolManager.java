package ke.co.buku.service;

import java.util.List;

import ke.co.buku.model.School;

/**
 * Business Service Interface to handle communication between web and
 * persistence layer.
 *
 * @author <a href="mailto:jkikuyu@gmail.com">Jude Kikuyu </a>
 * date: 24/03/2017
 */
public interface SchoolManager extends GenericManager<School, Long> {
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


}
