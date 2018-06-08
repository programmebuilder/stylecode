package stylecode.kosta180.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import stylecode.kosta180.domain.ShoppingMallSearchVO;
import stylecode.kosta180.service.ShoppingmallService;

@RestController
@RequestMapping("/chat")
public class ChatbotController {
	
	@Inject
	private ShoppingmallService service;
	
	@RequestMapping(value="/Ok", method=RequestMethod.GET, produces = "application/text; charset=utf8")
	public String answer(@RequestParam(value="input") String msg){
	    System.out.println("컨트롤런");
	    System.out.println("파라미터 :  " + msg);
	    
	    //model.addAttribute("list", service.listShoppingMall(vo));
	    
		String str = "안녕하세요";
		
		if(msg.contains("안녕")||msg.contains("하이")) {
			str="안녕하세요";
		} else if(msg.contains("배송비")) {
			str="배송비는 쇼핑몰의 배송비 정책에 따라 부과됩니다.";
		} else if(msg.contains("배송")) {
			str="주문하신 상품은 판매 쇼핑몰에서 직접 발송하고 있습니다. 따라서 정확한 발송 예정일은 쇼핑몰, 상품별로 다를 수 있습니다. 주문에 관한 사항은 판매 쇼핑몰의 고객 센터를 이용해 주세요.";
		} else if(msg.contains("교환")||msg.contains("환불")) {
			str="주문하신 상품의 교환/환불 처리는 판매 쇼핑몰의 정책에 따라 진행됩니다. 교환/환불에 관한 자세한 문의는 판매 쇼핑몰을 이용해 주세요.";
		} else if(msg.contains("아이디")||msg.contains("계정")) {
			str="상품을 구매했던 이력을 통해 알려주시면 조회를 도와드리고 있습니다. 상품을 구매했던 쇼핑몰의 주문조회 페이지나 이메일로 발송된 결제완료 메일을 통해 주문번호를 찾아 문의해주시기 바랍니다.";
		} else if(msg.contains("입점")) {
			str="홈페이지 내 입점 신청하기 메뉴를 통해 입점 신청이 가능합니다.";
		} else {
			str="네?";
		}
	    
	    return str;
	}
}
