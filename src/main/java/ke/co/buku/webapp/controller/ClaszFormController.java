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

import ke.co.buku.model.Clasz;
import ke.co.buku.model.Status;
import ke.co.buku.service.ClaszManager;
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
@RequestMapping("/admin/classform*")
public class ClaszFormController extends BaseFormController {

	private ClaszManager claszManager = null;
	  protected final transient Log log = LogFactory.getLog(getClass());

	  @Autowired
	  public void setStatusManager(ClaszManager claszManager) {
		this.claszManager = claszManager;
	}
	  
	  public ClaszFormController (){
		  setCancelView("redirect:/home");
		  setSuccessView("redirect:/admin/class");
	  }
	  
	  @ModelAttribute
	  @RequestMapping(method = RequestMethod.GET)
	  protected Clasz showForm(final HttpServletRequest request, final HttpServletResponse response)throws Exception
	  {
		  String id = request.getParameter("id");
		  if (!StringUtils.isBlank(id))
		  {
			  return claszManager.get(new Long(id));
		  }
		  return new Clasz();
	  }
	  
	  @RequestMapping(method = RequestMethod.POST)
	    public String onSubmit(Clasz clasz, BindingResult errors, HttpServletRequest request,
	     HttpServletResponse response) throws Exception {
	        if (request.getParameter("cancel") != null) {
	            return getCancelView();
	        }

	        if (validator != null) { // validator is null during testing
	            validator.validate(clasz, errors);

	            if (errors.hasErrors() && request.getParameter("delete") == null) { // don't validate when deleting
	                return "admin/classform";
	            }
	        }

	        log.debug("entering 'onSubmit' method...");

	        boolean isNew = (clasz.getClassId() == null);
	        String success = getSuccessView();
	        Locale locale = request.getLocale();

	        if (request.getParameter("delete") != null) {
	        	claszManager.remove(clasz.getClassId());
	            saveMessage(request, getText("status.deleted", locale));
	        } else {
	        	claszManager.save(clasz);
	            String key = (isNew) ? "class.added" : "class.updated";
	            saveMessage(request, getText(key, clasz.getShortName() ,locale));

	            if (!isNew) {
	                success = "redirect:/admin/classform?id=" + clasz.getClassId();
	            
	        }

	     
	    }
	       return success;
	  }
}
