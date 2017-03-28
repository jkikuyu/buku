package ke.co.buku.service;

import java.util.List;

import ke.co.buku.dao.TeacherDao;
import ke.co.buku.model.Teacher;

public interface TeacherManager extends GenericManager<Teacher, Long> {
    /**
     * Convenience method for testing - allows you to mock the DAO and set it on an interface.
     * @param userDao the UserDao implementation to use
     */

	void setTeacherDao(TeacherDao teacherDao);

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
    void removeTeacher(Integer teacherId);
    /**
     * Search a user for search terms.
     * @param searchTerm the search terms.
     * @return a list of matches, or all if no searchTerm.
     */
    public List<Teacher> search(String searchTerm);


}
