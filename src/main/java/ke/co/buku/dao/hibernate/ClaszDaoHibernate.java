package ke.co.buku.dao.hibernate;

import java.util.List;

import org.springframework.stereotype.Repository;

import ke.co.buku.dao.ClaszDao;
import ke.co.buku.model.Clasz;
@Repository("classDao")

public class ClaszDaoHibernate extends GenericDaoHibernate<Clasz, Long> implements ClaszDao {
	
	public ClaszDaoHibernate() {
		super(Clasz.class);
	}


	@Override
	public Clasz getClasz(Integer classId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Clasz saveClasz(Clasz clasz) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeClasz(Integer classId) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Clasz> getClasses() {
		// TODO Auto-generated method stub
		return null;
	}

}
