package ke.co.buku.service;

import java.util.List;

import ke.co.buku.dao.RoleDao;
import ke.co.buku.model.Role;

/**
 * Business Service Interface to handle communication between web and
 * persistence layer.
 *
 * @author <a href="mailto:dan@getrolling.com">Dan Kibler </a>
 */
public interface RoleManager extends GenericManager<Role, Long> {
    /**
     * Convenience method for testing - allows you to mock the DAO and set it on an interface.
     * @param roleDao the RoleDao implementation to use
     */

	void setRoleDao(RoleDao roleDao);

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
    /**
     * Search a user for search terms.
     * @param searchTerm the search terms.
     * @return a list of matches, or all if no searchTerm.
     */
    List<Role> search(String searchTerm);

}
