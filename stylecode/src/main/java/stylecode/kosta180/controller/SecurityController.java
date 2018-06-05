package stylecode.kosta180.controller;
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
			System.out.println("loginform 메소드 호출입니다.");
			return "signin/loginform";// "/WEB-INF/views/loginform.jsp"
		}

		// 로그인실패 페이지 요청
		@RequestMapping(value = "/loginfail", method = RequestMethod.GET)
		public String loginfail() {
			System.out.println("실패 호출");
			/* View 정보를 반환하는 부분 */
			return "signin/loginfail"; // "/WEB-INF/views/loginfail.jsp"
		}

		// 로그아웃폼 페이지 요청
		@RequestMapping(value = "/logoutform", method = RequestMethod.GET)
		public String logoutform(HttpServletRequest request) {
				HttpSession session=request.getSession();
				session.invalidate();
			/* View 정보를 반환하는 부분 */
			return "signin/logoutform"; // "/WEB-INF/views/logoutform.jsp"
		}

		// 계정별 로그인
		@SuppressWarnings("null")
		@RequestMapping(value = "/loginsuccess", method = RequestMethod.GET)
		public String loginresult(HttpServletRequest request) {
			/*세션 mId저장*/
			HttpSession session=request.getSession(true);
			User user =(User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
			session.setAttribute("mId", user.getUsername());
			
		/*	stylecode.kosta180.product.controller*/
			
			return "redirect:/productlist";// "/WEB-INF/views/product/productlist.jsp"
		}
		
	
	}

	
	
	
	

