package ke.co.buku.dao;

import java.util.List;
/**
 * Book Data Access Object (DAO) interface.
 *
 * @author <a href="mailto:jkikuyu@gmail.com">Jude Kikuyu</a>
 * date: 24/03/2017
 */


import ke.co.buku.model.UserType;

public interface UserTypeDao extends GenericDao<UserType, Long> {
	
    /**
     * {@inheritDoc}
     */

	public List <UserType> getUserTypes();

    /**
     * {@inheritDoc}
     */
	public UserType getUserType(Integer userTypeId);

    /**
     * {@inheritDoc}
     */
	public UserType saveUserType(UserType userType);

    /**
     * {@inheritDoc}
     */
	public void removeUserType(Integer userTypeId);



}
