package ke.co.buku.dao;

import java.util.List;

import ke.co.buku.model.UserRegistration;

/**
 * Book Data Access Object (DAO) interface.
 *
 * @author <a href="mailto:jkikuyu@gmail.com">Jude Kikuyu</a>
 * date: 24/03/2017
 */

public interface RegistrationDao extends GenericDao<UserRegistration, Long> {
    /**
     * {@inheritDoc}
     */
	public List <UserRegistration> getUserRegistrations();

    /**
     * {@inheritDoc}
     */
    public UserRegistration getUserRegistration(Integer registrationId);

    /**
     * {@inheritDoc}
     */
    public UserRegistration saveUserRegistration(UserRegistration userRegistration);

    /**
     * {@inheritDoc}
     */
    public void removeUserRegistration(Integer registrationId);

}
