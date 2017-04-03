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

import ke.co.buku.model.Category;
import ke.co.buku.service.CategoryManager;

/**
 * Implementation of <strong>SimpleFormController</strong> that interacts with
 * the {@link UserManager} to retrieve/persist values to the database.
 *
 * <p><a href="StatusFormController.java.html"><i>View Source</i></a>
 *
 * @author <a href="mailto:jkikuyu@gmail.com">Jude KikuyuS</a>
 */
@Controller
@RequestMapping("/admin/categoryform*")
public class CategoryFormController extends BaseFormController {

	private CategoryManager categoryManager = null;
	  protected final transient Log log = LogFactory.getLog(getClass());

	  @Autowired
	  public void setCategoryManager(CategoryManager categoryManager) {
		this.categoryManager = categoryManager;
	}
	  
	  public CategoryFormController (){
		  setCancelView("redirect:/home");
		  setSuccessView("redirect:/admin/category");
	  }
	  
	  @ModelAttribute
	  @RequestMapping(method = RequestMethod.GET)
	  protected Category showForm(final HttpServletRequest request, final HttpServletResponse response)throws Exception
	  {
		  String id = request.getParameter("id");
		  if (!StringUtils.isBlank(id))
		  {
			  return categoryManager.get(new Long(id));
		  }
		  return new Category();
	  }
	  
	  @RequestMapping(method = RequestMethod.POST)
	    public String onSubmit(Category category, BindingResult errors, HttpServletRequest request,
	     HttpServletResponse response) throws Exception {
	        if (request.getParameter("cancel") != null) {
	            return getCancelView();
	        }

	        if (validator != null) { // validator is null during testing
	            validator.validate(category, errors);

	            if (errors.hasErrors() && request.getParameter("delete") == null) { // don't validate when deleting
	                return "admin/categoryform";
	            }
	        }

	        log.debug("entering 'onSubmit' method...");

	        boolean isNew = (category.getCategoryId() == null);
	        String success = getSuccessView();
	        Locale locale = request.getLocale();

	        if (request.getParameter("delete") != null) {
	        	categoryManager.remove(category.getCategoryId());
	            saveMessage(request, getText("category.deleted", category.getCategoryName(), locale));
	        } else {
	        	categoryManager.save(category);
	            String key = (isNew) ? "category.added" : "category.updated";
	            saveMessage(request, getText(key, category.getCategoryName() ,locale));

	            if (!isNew) {
	                success = "redirect:/admin/categoryform?id=" + category.getCategoryId();
	            }
	        }

	        return success;
	    }
    
}
