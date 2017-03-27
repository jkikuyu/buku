package ke.co.buku.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ke.co.buku.dao.ClassDao;
import ke.co.buku.service.ClassManager;

/**
 * Business Service Interface to handle communication between web and
 * persistence layer.
 *
 * @author <a href="mailto:jkikuyu@gmail.com">Jude Kikuyu </a>
 * date: 24/03/2017
 */
@Service("classManager")
public class ClassManagerImpl extends GenericManagerImpl<Class, Long> implements ClassManager{
	ClassDao classDao;

    @Autowired
    public ClassManagerImpl(ClassDao classDao) {
        super(classDao);
        this.classDao = classDao;
    }

	/**
     * {@inheritDoc}
     */
	public List <Class> getClasses(){
		return dao.getAll();
	}

    /**
     * {@inheritDoc}
     */
	public Class getClass(Integer classId){
		return classDao.getClass(classId);
	}

    /**
     * {@inheritDoc}
     */
	public Class saveClass(Class clasz){
		return dao.save(clasz);
	}

    /**
     * {@inheritDoc}
     */
    public void removeClass(Integer classId){
    	classDao.removeClass(classId);
    }


}
