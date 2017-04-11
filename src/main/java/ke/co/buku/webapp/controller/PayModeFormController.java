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

import ke.co.buku.model.PaymentMode;
import ke.co.buku.service.PaymentModeManager;
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
@RequestMapping("/admin/paymodeform*")
public class PayModeFormController extends BaseFormController {

	private PaymentModeManager paymodeManager = null;
	  protected final transient Log log = LogFactory.getLog(getClass());

	  @Autowired
	  public void setCategoryManager(PaymentModeManager paymodeManager) {
		this.paymodeManager = paymodeManager;
	}
	  
	  public PayModeFormController (){
		  setCancelView("redirect:/admin/paymode");
		  setSuccessView("redirect:/admin/paymode");
	  }
	  
	  @ModelAttribute
	  @RequestMapping(method = RequestMethod.GET)
	  protected PaymentMode showForm(final HttpServletRequest request, final HttpServletResponse response)throws Exception
	  {
		  String id = request.getParameter("id");
		  if (!StringUtils.isBlank(id))
		  {
			  return paymodeManager.get(new Long(id));
		  }
		  return new PaymentMode();
	  }
	  
	  @RequestMapping(method = RequestMethod.POST)
	    public String onSubmit(PaymentMode paymode, BindingResult errors, HttpServletRequest request,
	     HttpServletResponse response) throws Exception {
	        if (request.getParameter("cancel") != null) {
	            return getCancelView();
	        }

	        if (validator != null) { // validator is null during testing
	            validator.validate(paymode, errors);

	            if (errors.hasErrors() && request.getParameter("delete") == null) { // don't validate when deleting
	                return "admin/paymodeform";
	            }
	        }

	        log.debug("entering 'onSubmit' method...");

	        boolean isNew = (paymode.getModeId() == null);
	        String success = getSuccessView();
	        Locale locale = request.getLocale();

	        if (request.getParameter("delete") != null) {
	        	paymodeManager.remove(paymode.getModeId());
	            saveMessage(request, getText("paymode.deleted", locale));
	        } else {
	        	paymodeManager.save(paymode);
	            String key = (isNew) ? "paymode.added" : "paymode.updated";
	            saveMessage(request, getText(key, paymode.getName() ,locale));

	            if (!isNew) {
	                success = "redirect:/admin/paymodeform?id=" + paymode.getModeId();
	            }
	        }

	        return success;
	    }
    
}
