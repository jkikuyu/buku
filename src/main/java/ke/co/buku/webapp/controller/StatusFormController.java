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

import ke.co.buku.model.Status;
import ke.co.buku.service.StatusManager;

/**
 * Implementation of <strong>SimpleFormController</strong> that interacts with
 * the {@link UserManager} to retrieve/persist values to the database.
 *
 * <p><a href="StatusFormController.java.html"><i>View Source</i></a>
 *
 * @author <a href="mailto:jkikuyu@gmail.com">Jude KikuyuS</a>
 */
@Controller
@RequestMapping("/admin/statusform*")
public class StatusFormController extends BaseFormController {

	private StatusManager statusManager = null;
	  protected final transient Log log = LogFactory.getLog(getClass());

	  @Autowired
	  public void setStatusManager(StatusManager statusManager) {
		this.statusManager = statusManager;
	}
	  
	  public StatusFormController (){
		  setCancelView("redirect:/admin/status");
		  setSuccessView("redirect:/admin/status");
	  }
	  
	  @ModelAttribute
	  @RequestMapping(method = RequestMethod.GET)
	  protected Status showForm(final HttpServletRequest request, final HttpServletResponse response)throws Exception
	  {
		  String id = request.getParameter("id");
		  if (!StringUtils.isBlank(id))
		  {
			  return statusManager.get(new Long(id));
		  }
		  return new Status();
	  }
	  
	  @RequestMapping(method = RequestMethod.POST)
	    public String onSubmit(Status status, BindingResult errors, HttpServletRequest request,
	     HttpServletResponse response) throws Exception {
	        if (request.getParameter("cancel") != null) {
	            return getCancelView();
	        }

	        if (validator != null) { // validator is null during testing
	            validator.validate(status, errors);

	            if (errors.hasErrors() && request.getParameter("delete") == null) { // don't validate when deleting
	                return "admin/statusform";
	            }
	        }

	        log.debug("entering 'onSubmit' method...");

	        boolean isNew = (status.getStatusId() == null);
	        String success = getSuccessView();
	        Locale locale = request.getLocale();

	        if (request.getParameter("delete") != null) {
	        	statusManager.remove(status.getStatusId());
	            saveMessage(request, getText("status.deleted", locale));
	        } else {
	        	statusManager.save(status);
	            String key = (isNew) ? "status.added" : "status.updated";
	            saveMessage(request, getText(key, status.getName() ,locale));

	            if (!isNew) {
	                success = "redirect:/admin/statusform?id=" + status.getStatusId();
	            }
	        }

	        return success;
	    }
    
}
