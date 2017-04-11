package ke.co.buku.dao;

import java.util.List;

import ke.co.buku.model.Parameter;

public interface ParamDao extends GenericDao<Parameter, Long> {
	
    /**
     * {@iheritDoc}
     */
	void setParameterDao(ParamDao paramDao);
	
    /**
     * {@iheritDoc}
     */

	public List <Parameter> getParams();
    /**
     * {@inheritDoc}
     */
	public List <Parameter> getParamsByGroupId(Integer groupId);
    /**
     * {@inheritDoc}
     */


	public Parameter getParam(Integer parameterId);
    /**
     * {@inheritDoc}
     */

	public Parameter saveParam(Parameter Parameter);
    /**
     * {@inheritDoc}
     */
  
	public void removeParam(Integer parameterId);

}
