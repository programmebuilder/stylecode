package stylecode.kosta180.controller;
import java.security.Principal;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import stylecode.kosta180.domain.SecurityMemberVO;
import stylecode.kosta180.security.CustomUserDetails;
import stylecode.kosta180.security.LoginReq;
import stylecode.kosta180.security.service.MemberService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class SecurityController {
	private static final Logger logger = LoggerFactory.getLogger(SecurityController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(HttpSession session) {
		logger.info("Welcome login! {}", session.getId()); 
		return "signin/login";
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		CustomUserDetails userDetails = (CustomUserDetails)session.getAttribute("userLoginInfo");
		
		logger.info("Welcome logout! {}, {}", session.getId(), userDetails.getUsername());
		
		
		session.invalidate();
		return "signin/logout";
	}
	
	@RequestMapping(value = "/login_success", method = RequestMethod.GET)
	public String login_success(HttpSession session) {
		CustomUserDetails userDetails = (CustomUserDetails)SecurityContextHolder.getContext().getAuthentication().getDetails();
		
		logger.info("Welcome login_success! {}, {}", session.getId(), userDetails.getUsername() + "/" + userDetails.getPassword());
		session.setAttribute("userLoginInfo", userDetails);
		
		return "signin/login_success";
	}
	
	@RequestMapping(value = "/page1", method = RequestMethod.GET)
	public String page1(HttpSession session) {	
		
		CustomUserDetails userDetails = (CustomUserDetails)session.getAttribute("userLoginInfo");
		logger.info("Welcome logout! {}, {}", session.getId(), userDetails.getUsername());
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "signin/page1";
	}
	
	@RequestMapping(value = "/login_duplicate", method = RequestMethod.GET)
	public String login_duplicate() {		
		logger.info("Welcome login_duplicate!");
		return "signin/login_duplicate";
	}
	
	/*@RequestMapping(value = "/register", method=RequestMethod.POST)
	public String register(SecurityMemberVO securitymember,Model model){
		logger.info("register�� ������");
		memberService.join(securitymember);
		return "redirect:/productlist";
	}*/
	
	
	
	
}
