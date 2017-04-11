package ke.co.buku.dao.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import ke.co.buku.dao.ParamDao;
import ke.co.buku.model.Parameter;
@Repository
public class ParamDaoHibernate extends GenericDaoHibernate<Parameter, Long> implements ParamDao {

	public ParamDaoHibernate() {
		super(Parameter.class);
	}


	@Override
	public Parameter getParam(Integer parameterId) {
		return null;
	}

	@Override
	public Parameter saveParam(Parameter parameter) {
		return null;
	}

	@Override
	public void removeParam(Integer parameterId) {

	}

	@Override
	public List<Parameter> getParams() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void setParameterDao(ParamDao paramDao) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Parameter> getParamsByGroupId(Integer groupId) {
		Query qry = getSession().createQuery("from Parameter p where p.groupId=:gid")
				.setInteger("gid", groupId);
	return qry.list();
	}




}
