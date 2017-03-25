package ke.co.buku.service;

import java.util.List;

import ke.co.buku.model.UserType;

public interface UserTypeManager extends GenericManager<UserType, Long> {
	
    /**
     * {@inheritDoc}
     */

    List getUserTypes(UserType userType);

    /**
     * {@inheritDoc}
     */
    UserType getSchool(Integer userTypeId);

    /**
     * {@inheritDoc}
     */
    UserType saveUserType(UserType userType);

    /**
     * {@inheritDoc}
     */
    void removeUserType(Integer userTypeId);



}
