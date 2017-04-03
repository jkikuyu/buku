package ke.co.buku.dao;

import java.util.List;

import ke.co.buku.model.Clasz;

/**
 * Book Data Access Object (DAO) interface.
 *
 * @author <a href="mailto:jkikuyu@gmail.com">Jude Kikuyu</a>
 * date: 24/03/2017
 */


public interface ClaszDao extends GenericDao<Clasz, Long> {
    /**
     * {@inheritDoc}
     */
	public List <Clasz> getClasses();

    /**
     * {@inheritDoc}
     */
	public Clasz getClasz(Integer classId);

    /**
     * {@inheritDoc}
     */
	public Clasz saveClasz(Clasz clasz);

    /**
     * {@inheritDoc}
     */
	public void removeClasz(Integer classId);


}
