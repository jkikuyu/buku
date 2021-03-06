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

import ke.co.buku.model.Role;
import ke.co.buku.service.RoleManager;

/**
 * Implementation of <strong>SimpleFormController</strong> that interacts with
 * the {@link UserManager} to retrieve/persist values to the database.
 *
 * <p><a href="UserFormController.java.html"><i>View Source</i></a>
 *
 * @author <a href="mailto:matt@raibledesigns.com">Matt Raible</a>
 */
@Controller
@RequestMapping("/admin/roleform*")
public class RoleFormController extends BaseFormController {

	private RoleManager roleManager = null;
	  protected final transient Log log = LogFactory.getLog(getClass());

	  @Autowired
	  public void setRoleManager(RoleManager roleManager) {
		this.roleManager = roleManager;
	}
	  
	  public RoleFormController (){
		  setCancelView("redirect:/admin/roles");
		  setSuccessView("redirect:/admin/roles");
	  }
	  
	  @ModelAttribute
	  @RequestMapping(method = RequestMethod.GET)
	  protected Role showForm(final HttpServletRequest request, final HttpServletResponse response)throws Exception
	  {
		  String id = request.getParameter("id");
		  if (!StringUtils.isBlank(id))
		  {
			  return roleManager.get(new Long(id));
		  }
		  return new Role();
	  }
	  
	  @RequestMapping(method = RequestMethod.POST)
	 
	    public String onSubmit(Role role, BindingResult errors, HttpServletRequest request,
	                           HttpServletResponse response)
	    throws Exception {
	        if (request.getParameter("cancel") != null) {
	            return getCancelView();
	        }

	        if (validator != null) { // validator is null during testing
	            validator.validate(role, errors);

	            if (errors.hasErrors() && request.getParameter("delete") == null) { // don't validate when deleting
	                return "admin/roleform";
	            }
	        }

	        log.debug("entering 'onSubmit' method...");

	        boolean isNew = (role.getId() == null);
	        String success = getSuccessView();
	        Locale locale = request.getLocale();

	        if (request.getParameter("delete") != null) {
	        	roleManager.remove(role.getId());
	            saveMessage(request, getText("role.deleted", locale));
	        } else {
	        	roleManager.save(role);
	            String key = (isNew) ? "role.added" : "role.updated";
	            saveMessage(request, getText(key, role.getName() ,locale));

	            if (!isNew) {
	                success = "redirect:/admin/roleform?id=" + role.getId();
	            }
	        }

	        return success;
	    }
    
}
