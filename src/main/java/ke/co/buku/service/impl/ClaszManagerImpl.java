package ke.co.buku.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ke.co.buku.dao.ClaszDao;
import ke.co.buku.model.Clasz;
import ke.co.buku.service.ClaszManager;

/**
 * Business Service Interface to handle communication between web and
 * persistence layer.
 *
 * @author <a href="mailto:jkikuyu@gmail.com">Jude Kikuyu </a>
 * date: 24/03/2017
 */
@Service("classManager")
public class ClaszManagerImpl extends GenericManagerImpl<Clasz, Long> implements ClaszManager{
	ClaszDao claszDao;

   
	@Override
	@Autowired
	public void setClaszDao(ClaszDao claszDao) {
        this.dao = claszDao;
        this.claszDao = claszDao;
		
	}


/*    public ClassManagerImpl(ClassDao classDao) {
        super(classDao);
        this.classDao = classDao;
    }
*/
	/**
     * {@inheritDoc}
     */
	public List <Clasz> getClasses(){
		return dao.getAll();
	}

    /**
     * {@inheritDoc}
     */
	public Clasz getClass(Integer classId){
		return claszDao.getClasz(classId);
	}

    /**
     * {@inheritDoc}
     */
	public Clasz saveClass(Clasz clasz){
		return dao.save(clasz);
	}

    /**
     * {@inheritDoc}
     */
    public void removeClass(Integer classId){
    	claszDao.removeClasz(classId);
    }


	@Override
	public List<Clasz> search(String searchTerm) {
		// TODO Auto-generated method stub
        return super.search(searchTerm, Clasz.class);
	}


}
