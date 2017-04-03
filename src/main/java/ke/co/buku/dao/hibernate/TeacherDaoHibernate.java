package ke.co.buku.dao.hibernate;

import java.util.List;

import ke.co.buku.dao.TeacherDao;
import ke.co.buku.model.Teacher;

public class TeacherDaoHibernate extends GenericDaoHibernate<Teacher, Long> implements TeacherDao {

	public TeacherDaoHibernate() {
		super(Teacher.class);
		// TODO Auto-generated constructor stub
	}


	@Override
	public Teacher getTeacher(Integer teacherId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Teacher saveTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeTeacher(Integer teacherId) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Teacher> getTeachers() {
		// TODO Auto-generated method stub
		return null;
	}

}
