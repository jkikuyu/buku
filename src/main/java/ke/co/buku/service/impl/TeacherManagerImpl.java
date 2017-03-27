package ke.co.buku.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ke.co.buku.dao.TeacherDao;
import ke.co.buku.model.Teacher;
import ke.co.buku.service.TeacherManager;
@Service("teacherManager")
public class TeacherManagerImpl extends GenericManagerImpl<Teacher, Long> implements TeacherManager{
	TeacherDao teacherDao;

    @Autowired
    public TeacherManagerImpl(TeacherDao teacherDao) {
        super(teacherDao);
        this.teacherDao = teacherDao;
    }

	/**
     * {@inheritDoc}
     */

    public List <Teacher> getTeachers(){
    	return dao.getAll();
    }

    /**
     * {@inheritDoc}
     */
    public Teacher getTeacher(Integer teacherId){
    	return teacherDao.getTeacher(teacherId);
    }

    /**
     * {@inheritDoc}
     */
    public Teacher saveTeacher(Teacher teacher){
    	return dao.save(teacher);
    }

    /**
     * {@inheritDoc}
     */
    public void removeTeacher(Integer teacherId){
    	teacherDao.removeTeacher(teacherId);
    }


}
