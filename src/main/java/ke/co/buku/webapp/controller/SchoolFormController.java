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

import ke.co.buku.model.School;
import ke.co.buku.service.SchoolManager;

/**
 * Implementation of <strong>SimpleFormController</strong> that interacts with
 * the {@link UserManager} to retrieve/persist values to the database.
 *
 * <p><a href="UserFormController.java.html"><i>View Source</i></a>
 *
 * @author <a href="mailto:matt@raibledesigns.com">Matt Raible</a>
 */
@Controller
@RequestMapping("/admin/schoolform*")
public class SchoolFormController extends BaseFormController {

	private SchoolManager schoolManager = null;
	  protected final transient Log log = LogFactory.getLog(getClass());

	  @Autowired
	  public void setSchoolManager(SchoolManager schoolManager) {
		this.schoolManager = schoolManager;
	}
	  
	  public SchoolFormController (){
		  setCancelView("redirect:/admin/schools");
		  setSuccessView("redirect:/admin/schools");
	  }
	  
	  @ModelAttribute
	  @RequestMapping(method = RequestMethod.GET)
	  protected School showForm(HttpServletRequest request)throws Exception
	  {
		  String id = request.getParameter("id");
		  if (!StringUtils.isBlank(id))
		  {
			  return schoolManager.get(new Long(id));
		  }
		  return new School();
	  }
	  
	  @RequestMapping(method = RequestMethod.POST)
	 
	    public String onSubmit(School school, BindingResult errors, HttpServletRequest request,
	                           HttpServletResponse response)
	    throws Exception {
	        if (request.getParameter("cancel") != null) {
	            return getCancelView();
	        }

	        if (validator != null) { // validator is null during testing
	            validator.validate(school, errors);

	            if (errors.hasErrors() && request.getParameter("delete") == null) { // don't validate when deleting
	                return "admin/schoolform";
	            }
	        }

	        log.debug("entering 'onSubmit' method...");

	        boolean isNew = (school.getSchoolId() == null);
	        String success = getSuccessView();
	        Locale locale = request.getLocale();

	        if (request.getParameter("delete") != null) {
	        	schoolManager.remove(school.getSchoolId());
	            saveMessage(request, getText("school.deleted", locale));
	        } else {
	        	schoolManager.save(school);
	            String key = (isNew) ? "school.added" : "school.updated";
	            saveMessage(request, getText(key,school.getShortName(), locale));

	            if (!isNew) {
	                success = "redirect:/admin/schoolform?id=" + school.getSchoolId();
	            }
	        }

	        return success;
	    }
    
}
