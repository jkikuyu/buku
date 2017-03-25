package ke.co.buku.service;

import ke.co.buku.model.Role;

import java.util.List;

/**
 * Business Service Interface to handle communication between web and
 * persistence layer.
 *
 * @author <a href="mailto:jkikuyu@gmail.com">Jude Kikuyu </a>
 * date: 24/03/2017
 */
public interface RoleManager extends GenericManager<Role, Long> {
    /**
     * {@inheritDoc}
     */
    List <Role>getRoles();

    /**
     * {@inheritDoc}
     */
    Role getRole(String rolename);

    /**
     * {@inheritDoc}
     */
    Role saveRole(Role role);

    /**
     * {@inheritDoc}
     */
    void removeRole(String rolename);
}
