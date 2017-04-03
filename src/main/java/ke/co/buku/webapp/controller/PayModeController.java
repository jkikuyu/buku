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
import ke.co.buku.service.PaymentModeManger;

/**
 * Simple class to retrieve a list of users from the database.
 * <p/>
 * <p>
 * <a href="UserController.java.html"><i>View Source</i></a>
 * </p>
 *
 * @author <a href="mailto:matt@raibledesigns.com">Matt Raible</a>
 */

@Controller
@RequestMapping("/admin/paymode*")
public class PayModeController {
	private PaymentModeManger paymentModeManager;
	
	public PayModeController() {
		// TODO Auto-generated constructor stub
	}

    @Autowired
    public void setPaymentModeManger(PaymentModeManger paymentModeManager) {
        this.paymentModeManager = paymentModeManager;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView handleRequest(@RequestParam(required = false, value = "q") String query) throws Exception {
        Model model = new ExtendedModelMap();
        try {
            model.addAttribute(Constants.MODE_LIST, paymentModeManager.search(query));
        } catch (SearchException se) {
            model.addAttribute("searchError", se.getMessage());
            model.addAttribute(paymentModeManager.getPaymentModes());
        }
        return new ModelAndView("admin/paymodeList", model.asMap());
    }
}


