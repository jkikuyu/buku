package ke.co.buku.dao;

import java.util.List;

/**
 * Book Data Access Object (DAO) interface.
 *
 * @author <a href="mailto:jkikuyu@gmail.com">Jude Kikuyu</a>
 * date: 24/03/2017
 */


import ke.co.buku.model.Teacher;

public interface TeacherDao extends GenericDao<Teacher, Long> {


	/**
     * {@inheritDoc}
     */

	public List <Teacher> getTeachers();

    /**
     * {@inheritDoc}
     */
    public Teacher getTeacher(Integer teacherId);

    /**
     * {@inheritDoc}
     */
    public Teacher saveTeacher(Teacher teacher);

    /**
     * {@inheritDoc}
     */
    public void removeTeacher(Integer teacherId);


}
