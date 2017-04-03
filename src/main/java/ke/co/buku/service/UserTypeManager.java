package ke.co.buku.service;

import java.util.List;

import ke.co.buku.dao.UserTypeDao;
import ke.co.buku.model.UserType;

public interface UserTypeManager extends GenericManager<UserType, Long> {
    /**
     * Convenience method for testing - allows you to mock the DAO and set it on an interface.
     * @param userTypeDao the BookStoreDao implementation to use
     */

	void setUserTypeDao(UserTypeDao userTypeDao);
	
    /**
     * {@inheritDoc}
     */

    List <UserType>getUserTypes();

    /**
     * {@inheritDoc}
     */
    UserType getUserType(Integer userTypeId);

    /**
     * {@inheritDoc}
     */
    UserType saveUserType(UserType userType);

    /**
     * {@inheritDoc}
     */
    void removeUserType(Integer userTypeId);
    /**
     * Search a user for search terms.
     * @param searchTerm the search terms.
     * @return a list of matches, or all if no searchTerm.
     */
    List<UserType> search(String searchTerm);




}
