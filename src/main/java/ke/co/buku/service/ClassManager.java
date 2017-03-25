package ke.co.buku.service;

import java.util.List;

/**
 * Business Service Interface to handle communication between web and
 * persistence layer.
 *
 * @author <a href="mailto:jkikuyu@gmail.com">Jude Kikuyu </a>
 * date: 24/03/2017
 */

public interface ClassManager extends GenericManager<Class, Long> {
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


}
