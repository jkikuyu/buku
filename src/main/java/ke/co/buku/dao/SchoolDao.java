package ke.co.buku.dao;

import java.util.List;

import ke.co.buku.model.School;

/**
 * Book Data Access Object (DAO) interface.
 *
 * @author <a href="mailto:jkikuyu@gmail.com">Jude Kikuyu</a>
 * date: 24/03/2017
 */

public interface SchoolDao extends GenericDao<School, Long> {
    /**
     * {@inheritDoc}
     */

	public List<School> getSchools();

    /**
     * {@inheritDoc}
     */
    public School getSchool(Integer schoolId);

    /**
     * {@inheritDoc}
     */
    public School saveSchool(School school);

    /**
     * {@inheritDoc}
     */
    public void removeSchool(Integer schoolId);


}
