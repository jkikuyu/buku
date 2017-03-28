package ke.co.buku.dao.hibernate;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import ke.co.buku.dao.ClassDao;
import ke.co.buku.model.Category;
@Repository("classDao")

public class ClassDaoHibernate extends GenericDaoHibernate<Class, Long> implements ClassDao {
	
	public ClassDaoHibernate() {
		super(Class.class);
		// TODO Auto-generated constructor stub
	}


	public ClassDaoHibernate(Class<Class> persistentClass) {
		super(persistentClass);
		// TODO Auto-generated constructor stub
	}

	public ClassDaoHibernate(Class<Class> persistentClass, SessionFactory sessionFactory) {
		super(persistentClass, sessionFactory);
		// TODO Auto-generated constructor stub
	}


	@Override
	public Class getClass(Integer classId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class saveClass(Class clasz) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeClass(Integer classId) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Class> getClasses() {
		// TODO Auto-generated method stub
		return null;
	}

}
