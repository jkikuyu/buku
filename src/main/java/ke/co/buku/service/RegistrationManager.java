package ke.co.buku.service;

import java.util.List;

import ke.co.buku.dao.RegistrationDao;
import ke.co.buku.model.UserRegistration;

/**
 * Business Service Interface to handle communication between web and
 * persistence layer.
 *
 * @author <a href="mailto:jkikuyu@gmail.com">Jude Kikuyu </a>
 * date: 24/03/2017
 */
public interface RegistrationManager extends GenericManager<UserRegistration, Long> {
    /**
     * Convenience method for testing - allows you to mock the DAO and set it on an interface.
     * @param registrationDao the RegistrationDao implementation to use
     */

	void setRegistrationDao(RegistrationDao registrationDao);

	/**
     * {@inheritDoc}
     */
    List <UserRegistration> getUserRegistrations();

    /**
     * {@inheritDoc}
     */
    UserRegistration getUserRegistration(Integer registrationId);

    /**
     * {@inheritDoc}
     */
    UserRegistration saveUserRegistration(UserRegistration userRegistration);

    /**
     * {@inheritDoc}
     */
    void removeUserRegistration(Integer registrationId);

}
