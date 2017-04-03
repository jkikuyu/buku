package ke.co.buku.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ke.co.buku.dao.UserTypeDao;
import ke.co.buku.model.UserType;
import ke.co.buku.service.UserTypeManager;

@Service("userTypeManager")
public class UserTypeManagerImpl extends GenericManagerImpl<UserType, Long> implements UserTypeManager{
	
	private UserTypeDao userTypeDao;
	
	@Override
	@Autowired
	public void setUserTypeDao(UserTypeDao userTypeDao) {
        this.dao = userTypeDao;
        this.userTypeDao = userTypeDao;
		
	}

    /**
     * {@inheritDoc}
     */
    public UserType saveUserType(UserType userType){
    	return dao.save(userType);
    }

    /**
     * {@inheritDoc}
     */
    public void removeUserType(Integer userTypeId){
    	userTypeDao.removeUserType(userTypeId);
    }

	@Override
	public List<UserType> getUserTypes() {
		return dao.getAll();
	}

	@Override
	public UserType getUserType(Integer userTypeId) {
		// TODO Auto-generated method stub
		return userTypeDao.getUserType(userTypeId);
	}

	@Override
	public List<UserType> search(String searchTerm) {
		// TODO Auto-generated method stub
		return super.search(searchTerm, UserType.class);
	}



}
