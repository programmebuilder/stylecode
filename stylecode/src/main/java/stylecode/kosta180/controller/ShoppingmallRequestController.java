package stylecode.kosta180.controller;

import javax.inject.Inject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import stylecode.kosta180.domain.ShoppingmallVO;
import stylecode.kosta180.domain.SpmRequestVO;
import stylecode.kosta180.service.ShoppingmallService;

@Controller
@RequestMapping("/shoppingmall/*")
public class ShoppingmallRequestController {
	static int idx=1;
	
	@Inject
	private ShoppingmallService service;
	
	@RequestMapping(value="/shoppingmallRequest", method=RequestMethod.GET)
	public void shoppingmallRequestGET(Model model) throws Exception {

	}
	
	@RequestMapping(value="/shoppingmallRequest", method=RequestMethod.POST)
	public String shoppingmallRequestPOST(Model model, SpmRequestVO spmRequest) throws Exception {
		ShoppingmallVO vo;
		
		vo=service.listShoppingMallR().get(idx);
		vo.getSpmEnrollNo();
		spmRequest.setmSpmEnrollNo(vo.getSpmEnrollNo());

		service.requestSPM(spmRequest);
		
		idx+=1;
		
		return "redirect:/shoppingmall/ShoppingMall";
	}
}