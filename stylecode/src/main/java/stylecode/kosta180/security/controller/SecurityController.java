package stylecode.kosta180.security.controller;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;

import java.security.Principal;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import stylecode.kosta180.domain.MemberVO;




/**
 * Handles requests for the application home page.
 */
@Controller
public class SecurityController {
	private static final Logger logger = LoggerFactory.getLogger(SecurityController.class);
		
	/*@Inject
	private SignUpService signUpService;*/
	
	
		@RequestMapping(value = "/loginform", method = { RequestMethod.GET, RequestMethod.POST })
		public String loginform() {
			System.out.println("loginform �޼ҵ� ȣ���Դϴ�.");
			return "signin/loginform";// "/WEB-INF/views/loginform.jsp"
		}

		// �α��ν��� ������ ��û
		@RequestMapping(value = "/loginfail", method = RequestMethod.GET)
		public String loginfail() {
			System.out.println("���� ȣ��");
			/* View ������ ��ȯ�ϴ� �κ� */
			return "signin/loginfail"; // "/WEB-INF/views/loginfail.jsp"
		}

		// �α׾ƿ��� ������ ��û
		@RequestMapping(value = "/logoutform", method = RequestMethod.GET)
		public String logoutform(HttpServletRequest request) {
				HttpSession session=request.getSession();
				session.invalidate();
			/* View ������ ��ȯ�ϴ� �κ� */
			return "signin/logoutform"; // "/WEB-INF/views/logoutform.jsp"
		}

		// ������ �α���
		@SuppressWarnings("null")
		@RequestMapping(value = "/loginsuccess", method = RequestMethod.GET)
		public String loginresult(HttpServletRequest request) {
			/*���� mId����*/
			HttpSession session=request.getSession(true);
			User user =(User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
			session.setAttribute("mId", user.getUsername());
			System.out.println("��������:-"+user.getAuthorities());
		/*	stylecode.kosta180.product.controller*/
			
			return "redirect:/recommend";// "/WEB-INF/views/product/productlist.jsp"
		}
		
	
	}

	
	
	
	
