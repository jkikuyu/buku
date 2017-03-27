package ke.co.buku.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ke.co.buku.dao.RegistrationDao;
import ke.co.buku.model.UserRegistration;
import ke.co.buku.service.RegistrationManager;

/**
 * Business Service Interface to handle communication between web and
 * persistence layer.
 *
 * @author <a href="mailto:jkikuyu@gmail.com">Jude Kikuyu </a>
 * date: 24/03/2017
 */
@Service("registrationManager")
public class RegistrationManagerImpl extends GenericManagerImpl<UserRegistration, Long> implements RegistrationManager {
	RegistrationDao registrationDao;

    @Autowired
    public RegistrationManagerImpl(RegistrationDao registrationDao) {
        super(registrationDao);
        this.registrationDao = registrationDao;
    }

	/**
     * {@inheritDoc}
     */
    public List <UserRegistration>getUserRegistrations(){
    	return dao.getAll();
    }

    /**
     * {@inheritDoc}
     */
    public UserRegistration getUserRegistration(Integer registrationId){
    	return registrationDao.getUserRegistration(registrationId);
    }

    /**
     * {@inheritDoc}
     */
    public UserRegistration saveUserRegistration(UserRegistration userRegistration){
    	return dao.save(userRegistration);
    }

    /**
     * {@inheritDoc}
     */
    public void removeUserRegistration(Integer registrationId){
    	registrationDao.removeUserRegistration(registrationId);
    }


}
