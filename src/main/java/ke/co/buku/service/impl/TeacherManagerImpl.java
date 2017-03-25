package ke.co.buku.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ke.co.buku.dao.TeacherDao;
import ke.co.buku.model.Teacher;
@Service("userManager")
public class TeacherManagerImpl extends GenericManagerImpl<Teacher, Long> {
	TeacherDao teacherDao;

    @Autowired
    public TeacherManagerImpl(TeacherDao teacherDao) {
        super(teacherDao);
        this.teacherDao = teacherDao;
    }

	/**
     * {@inheritDoc}
     */

    List <Teacher> getTeachers(){
    	return dao.getAll();
    }

    /**
     * {@inheritDoc}
     */
    Teacher getTeacher(Integer teacherId){
    	return teacherDao.getTeacher(teacherId);
    }

    /**
     * {@inheritDoc}
     */
    Teacher saveTeacher(Teacher teacher){
    	return dao.save(teacher);
    }

    /**
     * {@inheritDoc}
     */
    void removeTeacher(Integer teacherId){
    	teacherDao.removeTeacher(teacherId);
    }


}
