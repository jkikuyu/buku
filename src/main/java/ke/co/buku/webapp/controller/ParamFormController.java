package ke.co.buku.webapp.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ke.co.buku.model.Parameter;
import ke.co.buku.service.ParamManager;
import ke.co.buku.service.UserManager;

/**
 * Implementation of <strong>SimpleFormController</strong> that interacts with
 * the {@link UserManager} to retrieve/persist values to the database.
 *
 * <p><a href="StatusFormController.java.html"><i>View Source</i></a>
 *
 * @author <a href="mailto:jkikuyu@gmail.com">Jude KikuyuS</a>
 */
@Controller
@RequestMapping("/admin/paramsform*")
public class ParamFormController extends BaseFormController {

	private ParamManager paramManager = null;
	  protected final transient Log log = LogFactory.getLog(getClass());

	  @Autowired
	  public void setParamManager(ParamManager paramManager) {
		this.paramManager = paramManager;
	}
	  
	  public ParamFormController (){
		  setCancelView("redirect:/admin/params");
		  setSuccessView("redirect:/admin/params");
	  }
	  
	  @ModelAttribute
	  @RequestMapping(method = RequestMethod.GET)
	  protected Parameter showForm(final HttpServletRequest request, final HttpServletResponse response)throws Exception
	  {
		  String id = request.getParameter("id");
		  if (!StringUtils.isBlank(id))
		  {
			  return paramManager.get(new Long(id));
		  }
		  return new Parameter();
	  }
	  
	  @RequestMapping(method = RequestMethod.POST)
	    public String onSubmit(Parameter parameter, BindingResult errors, HttpServletRequest request,
	     HttpServletResponse response) throws Exception {
	        if (request.getParameter("cancel") != null) {
	            return getCancelView();
	        }

	        if (validator != null) { // validator is null during testing
	            validator.validate(parameter, errors);

	            if (errors.hasErrors() && request.getParameter("delete") == null) { // don't validate when deleting
	                return "admin/paramsform";
	            }
	        }

	        log.debug("entering 'onSubmit' method...");

	        boolean isNew = (parameter.getParameterId() == null);
	        String success = getSuccessView();
	        Locale locale = request.getLocale();

	        if (request.getParameter("delete") != null) {
	        	paramManager.remove(parameter.getParameterId());
	            saveMessage(request, getText("parameter.deleted", locale));
	        } else {
	        	paramManager.save(parameter);
	            String key = (isNew) ? "parameter.added" : "parameter.updated";
	            saveMessage(request, getText(key, parameter.getDescription() ,locale));

	            if (!isNew) {
	                success = "redirect:/admin/paramsform?id=" + parameter.getParameterId();
	            
	        }

	     
	    }
	       return success;
	  }
}
