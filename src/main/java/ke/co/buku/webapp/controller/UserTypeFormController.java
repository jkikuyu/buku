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

import ke.co.buku.model.UserType;
import ke.co.buku.service.UserTypeManager;

/**
 * Implementation of <strong>SimpleFormController</strong> that interacts with
 * the {@link UserManager} to retrieve/persist values to the database.
 *
 * <p><a href="StatusFormController.java.html"><i>View Source</i></a>
 *
 * @author <a href="mailto:jkikuyu@gmail.com">Jude KikuyuS</a>
 */
@Controller
@RequestMapping("/admin/usertypeform")
public class UserTypeFormController extends BaseFormController {

	private UserTypeManager userTypeManager = null;
	  protected final transient Log log = LogFactory.getLog(getClass());

	  @Autowired
	  public void setUserTypeManager(UserTypeManager userTypeManager) {
		this.userTypeManager = userTypeManager;
	}
	  
	  public UserTypeFormController (){
		  setCancelView("redirect:/admin/types");
		  setSuccessView("redirect:/admin/types");
	  }
	  
	  @ModelAttribute
	  @RequestMapping(method = RequestMethod.GET)
	  protected UserType showForm(final HttpServletRequest request, final HttpServletResponse response)throws Exception
	  {
		  String id = request.getParameter("id");
		  if (!StringUtils.isBlank(id))
		  {
			  return userTypeManager.get(new Long(id));
		  }
		  return new UserType();
	  }
	  
	  @RequestMapping(method = RequestMethod.POST)
	    public String onSubmit(UserType usertype, BindingResult errors, HttpServletRequest request,
	     HttpServletResponse response) throws Exception {
	        if (request.getParameter("cancel") != null) {
	            return getCancelView();
	        }

	        if (validator != null) { // validator is null during testing
	            validator.validate(usertype, errors);

	            if (errors.hasErrors() && request.getParameter("delete") == null) { // don't validate when deleting
	                return "admin/usertypeform";
	            }
	        }

	        log.debug("entering 'onSubmit' method...");

	        boolean isNew = (usertype.getUserTypeId() == null);
	        String success = getSuccessView();
	        Locale locale = request.getLocale();

	        if (request.getParameter("delete") != null) {
	        	userTypeManager.remove(usertype.getUserTypeId() );
	            saveMessage(request, getText("usertype.deleted",usertype.getName(),  locale));
	        } else {
	        	userTypeManager.save(usertype);
	            String key = (isNew) ? "usertype.added" : "usertype.updated";
	            saveMessage(request, getText(key, usertype.getName() ,locale));

	            if (!isNew) {
	                success = "redirect:/admin/usertypeform?id=" + usertype.getUserTypeId();
	            }
	        }

	        return success;
	    }
    
}
