package ke.co.buku.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ke.co.buku.dao.ParamDao;
import ke.co.buku.model.Parameter;
import ke.co.buku.service.ParamManager;

@Service("paramManager")
public class ParamManagerImpl extends GenericManagerImpl<Parameter, Long> implements ParamManager {
	private ParamDao paramDao;
	@Override
    @Autowired
	
	public void setParamDao(ParamDao paramDao) {
        this.dao = paramDao;
        this.paramDao = paramDao;

		
	}

	@Override
	public List<Parameter> getParams() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}

	@Override
	public Parameter getParam(Integer parameterId) {
		// TODO Auto-generated method stub
		return paramDao.getParam(parameterId);
	}


	@Override
	public void removeParam(Integer parameterId) {
		paramDao.removeParam(parameterId);		
	}


	@Override
	public Parameter saveParam(Parameter parameter) {
		// TODO Auto-generated method stub
		return dao.save(parameter);
	}
	@Override
	public List<Parameter> search(String searchTerm) {
		// TODO Auto-generated method stub
		return super.search(searchTerm, Parameter.class);
	}

	@Override
	public List<Parameter> getParamsByGroupId(Integer groupId) {
		return paramDao.getParamsByGroupId(groupId);
	}

}
