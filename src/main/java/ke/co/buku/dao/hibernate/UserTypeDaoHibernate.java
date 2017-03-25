package ke.co.buku.dao.hibernate;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import ke.co.buku.dao.SearchException;
import ke.co.buku.dao.UserTypeDao;
import ke.co.buku.model.UserType;
@Repository("userTypeDao")
public class UserTypeDaoHibernate extends GenericDaoHibernate<UserType, Long> implements UserTypeDao {

	public UserTypeDaoHibernate() {
		super(UserType.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<UserType> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserType> getAllDistinct() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserType> search(String searchTerm) throws SearchException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserType get(Long id) {
		return null;
	}

	@Override
	public boolean exists(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public UserType save(UserType object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(UserType object) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<UserType> findByNamedQuery(String queryName, Map<String, Object> queryParams) {
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
