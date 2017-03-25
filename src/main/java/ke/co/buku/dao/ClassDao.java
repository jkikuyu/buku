package ke.co.buku.dao;

import java.util.List;

/**
 * Book Data Access Object (DAO) interface.
 *
 * @author <a href="mailto:jkikuyu@gmail.com">Jude Kikuyu</a>
 * date: 24/03/2017
 */


public interface ClassDao extends GenericDao<Class, Long> {
    /**
     * {@inheritDoc}
     */
	public List <Class> getClasses();

    /**
     * {@inheritDoc}
     */
	public Class getClass(Integer classId);

    /**
     * {@inheritDoc}
     */
	public Class saveClass(Class clasz);

    /**
     * {@inheritDoc}
     */
	public void removeClass(Integer classId);


}
