package ke.co.buku.service;

import java.util.List;

import ke.co.buku.model.UserType;

public interface UserTypeManager extends GenericManager<UserType, Long> {
	
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



}
