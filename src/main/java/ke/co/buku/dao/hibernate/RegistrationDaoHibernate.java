package ke.co.buku.dao.hibernate;

import java.util.List;

import org.springframework.stereotype.Repository;

import ke.co.buku.dao.RegistrationDao;
import ke.co.buku.model.UserRegistration;
@Repository("registrationDao")
public class RegistrationDaoHibernate extends GenericDaoHibernate<UserRegistration, Long> implements RegistrationDao {

	public RegistrationDaoHibernate() {
		super(UserRegistration.class);
		// TODO Auto-generated constructor stub
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
