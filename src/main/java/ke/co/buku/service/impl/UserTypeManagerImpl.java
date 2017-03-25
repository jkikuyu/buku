package ke.co.buku.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ke.co.buku.dao.UserTypeDao;
import ke.co.buku.model.UserType;

@Service("UserTypeManager")
public class UserTypeManagerImpl extends GenericManagerImpl<UserType, Long> {
	
	UserTypeDao userTypeDao;

    @Autowired
    public UserTypeManagerImpl(UserTypeDao userTypeDao) {
        super(userTypeDao);
        this.userTypeDao = userTypeDao;
    }

    /**
     * {@inheritDoc}
     */

    List <UserType> getUserTypes(){
    	return dao.getAll();
    }

    /**
     * {@inheritDoc}
     */
    UserType  getUserType(Integer userTypeId){
    	return userTypeDao.getUserType(userTypeId);
    }

    /**
     * {@inheritDoc}
     */
    UserType saveUserType(UserType userType){
    	return dao.save(userType);
    }

    /**
     * {@inheritDoc}
     */
    void removeUserType(Integer userTypeId){
    	userTypeDao.removeUserType(userTypeId);
    }



}
