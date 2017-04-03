package ke.co.buku.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ke.co.buku.Constants;
import ke.co.buku.dao.SearchException;
import ke.co.buku.service.UserTypeManager;
/**
 * Simple class to retrieve a list of users from the database.
 * <p/>
 * <p>
 * <a href="StatusController.java.html"><i>View Source</i></a>
 * </p>
 *
 * @author <a href="mailto:jkikuyu@gmail.com">Jude Kikuyu</a>
 */

@Controller
@RequestMapping("/admin/types")
public class UserTypeController {

	public UserTypeController() {
		// TODO Auto-generated constructor stub
	}


    private UserTypeManager userTypeManager = null;

    @Autowired
    public void setStatusManager(UserTypeManager userTypeManager) {
        this.userTypeManager = userTypeManager;

    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView handleRequest(@RequestParam(required = false, value = "q") String query) throws Exception {
        Model model = new ExtendedModelMap();
        try {
            model.addAttribute(Constants.USERTYPE_LIST, userTypeManager.search(query));
        } catch (SearchException se) {
            model.addAttribute("searchError", se.getMessage());
            model.addAttribute(userTypeManager.getUserTypes());
        }
        return new ModelAndView("admin/usertypeList", model.asMap());
    }
}

