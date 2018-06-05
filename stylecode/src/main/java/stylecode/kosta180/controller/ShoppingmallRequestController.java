package stylecode.kosta180.controller;

import javax.inject.Inject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import stylecode.kosta180.domain.ShoppingMallVO;
import stylecode.kosta180.domain.SpmRequestVO;
import stylecode.kosta180.service.ShoppingmallService;

/*		입점신청 컨트롤러		*/

@Controller
@RequestMapping("/request/*")
public class ShoppingmallRequestController {
	static int idx=1;
	
	@Inject
	private ShoppingmallService service;
	
	@RequestMapping(value="/shoppingmallRequest", method=RequestMethod.GET)
	public void shoppingmallRequestGET(Model model) throws Exception {

	}
	
	@RequestMapping(value="/shoppingmallRequest", method=RequestMethod.POST)
	public String shoppingmallRequestPOST(Model model, SpmRequestVO spmRequest) throws Exception {
		System.out.println("idx: "+idx);
		
		idx=service.listShoppingMallR()+1;
		
		spmRequest.setSpmEnrollNo(idx);

		service.requestSPM2(spmRequest);
		service.requestSPM(spmRequest);
		
		idx+=1;
		
		return "redirect:/shoppingmall/ShoppingMall";
	}
}
