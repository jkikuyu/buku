package ke.co.buku.dao.hibernate;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import ke.co.buku.dao.SchoolDao;
import ke.co.buku.dao.SearchException;
import ke.co.buku.model.School;
@Repository("schoolDao")
public class SchoolDaoHibernate extends GenericDaoHibernate<School, Long> implements SchoolDao {

	public SchoolDaoHibernate() {
		super(School.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<School> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<School> getAllDistinct() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<School> search(String searchTerm) throws SearchException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public School get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public School save(School object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(School object) {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void remove(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<School> findByNamedQuery(String queryName, Map<String, Object> queryParams) {
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
	public School getSchool(Integer schoolId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public School saveSchool(School school) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeSchool(Integer schoolId) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<School> getSchools() {
		// TODO Auto-generated method stub
		return null;
	}

}
