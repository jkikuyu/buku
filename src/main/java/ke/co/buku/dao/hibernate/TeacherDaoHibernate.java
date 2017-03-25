package ke.co.buku.dao.hibernate;

import java.util.List;
import java.util.Map;

import ke.co.buku.dao.SearchException;
import ke.co.buku.dao.TeacherDao;
import ke.co.buku.model.Teacher;

public class TeacherDaoHibernate extends GenericDaoHibernate<Teacher, Long> implements TeacherDao {

	public TeacherDaoHibernate() {
		super(Teacher.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Teacher> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Teacher> getAllDistinct() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Teacher> search(String searchTerm) throws SearchException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Teacher get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Teacher save(Teacher object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(Teacher object) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(Long id) {
		// TODO Auto-generated method stubSchoolDaoHibernate

	}

	@Override
	public List<Teacher> findByNamedQuery(String queryName, Map<String, Object> queryParams) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void reindex() {
		// TODO Auto-generated method stub

	}

	@Override
	public void reindexAll(boolean async) {
		// TODO Auto-generated method stub

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
