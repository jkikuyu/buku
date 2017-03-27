package ke.co.buku.dao.hibernate;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import ke.co.buku.dao.RegistrationDao;
import ke.co.buku.dao.SearchException;
import ke.co.buku.model.UserRegistration;
@Repository("registrationDao")
public class RegistrationDaoHibernate extends GenericDaoHibernate<UserRegistration, Long> implements RegistrationDao {

	public RegistrationDaoHibernate() {
		super(UserRegistration.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<UserRegistration> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserRegistration> getAllDistinct() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserRegistration> search(String searchTerm) throws SearchException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserRegistration get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public UserRegistration save(UserRegistration object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(UserRegistration object) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<UserRegistration> findByNamedQuery(String queryName, Map<String, Object> queryParams) {
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
	public UserRegistration getUserRegistration(Integer registrationId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserRegistration saveUserRegistration(UserRegistration userRegistration) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeUserRegistration(Integer registrationId) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<UserRegistration> getUserRegistrations() {
		// TODO Auto-generated method stub
		return null;
	}

}
