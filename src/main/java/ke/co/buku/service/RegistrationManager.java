package ke.co.buku.service;

import java.util.List;

import ke.co.buku.model.Publisher;
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
     * {@inheritDoc}
     */
    List getUserRegistrations(UserRegistration userRegistration);

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
