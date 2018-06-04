package stylecode.sns.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class SecurityController {
	private static final Logger logger = LoggerFactory.getLogger(SecurityController.class);

	/*
	 * @Inject private SignUpService signUpService;
	 */

	@RequestMapping(value = "/loginform", method = { RequestMethod.GET, RequestMethod.POST })
	public String loginform() {
		System.out.println("loginform 메소드 호출입니다.");
		return "signin/loginform";// "/WEB-INF/views/loginform.jsp"
	}

	// 로그인실패 페이지 요청
	@RequestMapping(value = "/loginfail", method = RequestMethod.GET)
	public String loginfail() {

		/* View 정보를 반환하는 부분 */
		return "signin/loginfail"; // "/WEB-INF/views/loginfail.jsp"
	}

	// 로그아웃폼 페이지 요청
	@RequestMapping(value = "/logoutform", method = RequestMethod.GET)
	public String logoutform() {

		/* View 정보를 반환하는 부분 */
		return "signin/logoutform"; // "/WEB-INF/views/logoutform.jsp"
	}

	// 계정별 로그인
	@RequestMapping(value = "/loginsuccess", method = RequestMethod.GET)
	public String loginresult() {

		return "signin/loginsuccess";// "/WEB-INF/views/loginsuccess.jsp"
	}

	// 회원가입
	/*
	 * @RequestMapping(value="/SignUpInsert") public String
	 * SignUpInsert(@RequestParam("mId") String mId,@RequestParam("mPassword")
	 * String password ,@RequestParam("mNm") String mNm, @RequestParam("birth1")
	 * String bir1, @RequestParam("birth2") String bir2, @RequestParam("birth3")
	 * String bir3){ String birth=bir1+"."+bir2+"."+bir3; MemberVO memberVo=new
	 * MemberVO(); memberVo.setmBirth(birth); memberVo.setmId(mId);
	 * memberVo.setmNm(mNm); memberVo.setmPassword(password);
	 * 
	 * return signUpService.insertMember(memberVo);
	 * 
	 * }
	 */
}
