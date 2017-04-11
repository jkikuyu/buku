package ke.co.buku.service;

import java.util.List;

import ke.co.buku.dao.ParamDao;
import ke.co.buku.model.Parameter;

/**
 * Business Service Interface to handle communication between web and
 * persistence layer.
 *
 * @author <a href="mailto:jkikuyu@gmail.com">Jude Kikuyu </a>
 * date: 24/03/2017
 */

public interface ParamManager extends GenericManager<Parameter, Long> {
    /**
     * Convenience method for testing - allows you to mock the DAO and set it on an interface.
     * @param classDao the ClassDao implementation to use
     */

	void setParamDao(ParamDao paramDao);

	/**
     * {@inheritDoc}
     */
	List <Parameter> getParams();

	/**
     * {@inheritDoc}
     */
	List <Parameter> getParamsByGroupId(Integer groupId);

    /**
     * {@inheritDoc}
     */
	Parameter getParam(Integer classId);

    /**
     * {@inheritDoc}
     */
    /**
     * {@inheritDoc}
     */
	Parameter saveParam(Parameter parameter);

    void removeParam(Integer parameterId);
    /**
     * Search a user for search terms.
     * @param searchTerm the search terms.
     * @return a list of matches, or all if no searchTerm.
     */
    List<Parameter> search(String searchTerm);


}
