package stylecode.kosta180.controller;
import java.security.Principal;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

			/* View ������ ��ȯ�ϴ� �κ� */
			return "signin/loginfail"; // "/WEB-INF/views/loginfail.jsp"
		}

		// �α׾ƿ��� ������ ��û
		@RequestMapping(value = "/logoutform", method = RequestMethod.GET)
		public String logoutform() {

			/* View ������ ��ȯ�ϴ� �κ� */
			return "signin/logoutform"; // "/WEB-INF/views/logoutform.jsp"
		}

		// ������ �α���
		@RequestMapping(value = "/loginsuccess", method = RequestMethod.GET)
		public String loginresult() {

			return "signin/loginsuccess";// "/WEB-INF/views/loginsuccess.jsp"
		}
		
		//ȸ������
		/*@RequestMapping(value="/SignUpInsert")
		public String SignUpInsert(@RequestParam("mId") String mId,@RequestParam("mPassword") String password ,@RequestParam("mNm") String mNm, @RequestParam("birth1") String bir1, @RequestParam("birth2") String bir2, @RequestParam("birth3") String bir3){
			String birth=bir1+"."+bir2+"."+bir3;
			MemberVO memberVo=new MemberVO();
			memberVo.setmBirth(birth);
			memberVo.setmId(mId);
			memberVo.setmNm(mNm);
			memberVo.setmPassword(password);
			
		 return signUpService.insertMember(memberVo);
			
		}*/
	}

	
	
	
	
