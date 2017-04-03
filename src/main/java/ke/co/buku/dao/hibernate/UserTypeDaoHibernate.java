package ke.co.buku.dao.hibernate;

import java.util.List;

import org.springframework.stereotype.Repository;

import ke.co.buku.dao.UserTypeDao;
import ke.co.buku.model.UserType;
@Repository
public class UserTypeDaoHibernate extends GenericDaoHibernate<UserType, Long> implements UserTypeDao {

	public UserTypeDaoHibernate() {
		super(UserType.class);
		// TODO Auto-generated constructor stub
	}


	@Override
	public UserType getUserType(Integer userTypeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserType saveUserType(UserType userType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeUserType(Integer userTypeId) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<UserType> getUserTypes() {
		// TODO Auto-generated method stub
		return null;
	}

}
