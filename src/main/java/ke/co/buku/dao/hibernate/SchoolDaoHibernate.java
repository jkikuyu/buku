package ke.co.buku.dao.hibernate;

import java.util.List;

import org.springframework.stereotype.Repository;

import ke.co.buku.dao.SchoolDao;
import ke.co.buku.model.School;
@Repository("schoolDao")
public class SchoolDaoHibernate extends GenericDaoHibernate<School, Long> implements SchoolDao {

	public SchoolDaoHibernate() {
		super(School.class);
		// TODO Auto-generated constructor stub
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
