package stylecode.kosta180.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import stylecode.kosta180.util.CrollStyleInfo;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value="/croll/*")
public class CrollController {
	
	private static final Logger logger = LoggerFactory.getLogger(CrollController.class);

	@Inject
	private CrollStyleInfo croll;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		
/*		CrollStyleInfo croll = new CrollStyleInfo();*/
		
		croll.crollInfo();
		
		return "home";
	}
	
}
