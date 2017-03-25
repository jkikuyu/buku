package ke.co.buku.service;

import java.util.List;

import ke.co.buku.model.Teacher;

public interface TeacherManager extends GenericManager<Teacher, Long> {
    /**
     * {@inheritDoc}
     */

    List <Teacher> getTeachers();

    /**
     * {@inheritDoc}
     */
    Teacher getTeacher(Integer teacherId);

    /**
     * {@inheritDoc}
     */
    Teacher saveTeacher(Teacher teacher);

    /**
     * {@inheritDoc}
     */
    void removeTeacher(Integer teacherId);


}
