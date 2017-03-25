package ke.co.buku.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ke.co.buku.dao.SchoolDao;
import ke.co.buku.model.School;

/**
 * Business Service Interface to handle communication between web and
 * persistence layer.
 *
 * @author <a href="mailto:jkikuyu@gmail.com">Jude Kikuyu </a>
 * date: 24/03/2017
 */
@Service("schoolManager")

public class SchoolManagerImpl extends GenericManagerImpl<School, Long> {
	SchoolDao schoolDao;

    @Autowired
    public SchoolManagerImpl(SchoolDao schoolDao) {
        super(schoolDao);
        this.schoolDao = schoolDao;
    }

	/**
     * {@inheritDoc}
     */

    public List <School> getSchools(){
    	return dao.getAll();
    }

    /**
     * {@inheritDoc}
     */
    public School getSchool(Integer schoolId){
    	return schoolDao.getSchool(schoolId);
    }

    /**
     * {@inheritDoc}
     */
    public School saveSchool(School school){
    	return dao.save(school);
    }

    /**
     * {@inheritDoc}
     */
    public void removeSchool(Integer schoolId){
    	schoolDao.removeSchool(schoolId);
    }


}
