package ke.co.buku.dao;

import java.util.List;

import ke.co.buku.model.Role;

/**
 * Role Data Access Object (DAO) interface.
 *
 * @author <a href="mailto:matt@raibledesigns.com">Matt Raible</a>
 */
public interface RoleDao extends GenericDao<Role, Long> {
    /**
     * Gets role information based on rolename
     * @param rolename the rolename
     * @return populated role object
     */
    Role getRoleByName(String rolename);

    /**
     * Removes a role from the database by name
     * @param rolename the role's rolename
     */
    void removeRole(String rolename);
    /**
     * List roles from the database 
     */

	public List<Role> getRoles();
    /**
     * Save a role from the database 
     * @param role object
     */

    public Role saveRole(Role role);

}
