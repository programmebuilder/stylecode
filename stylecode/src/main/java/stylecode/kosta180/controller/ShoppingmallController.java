package stylecode.kosta180.controller;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import stylecode.kosta180.domain.PageMaker;
import stylecode.kosta180.domain.ShoppingMallSearchVO;
import stylecode.kosta180.domain.ShoppingMallVO;
import stylecode.kosta180.domain.SpmFilterListVO;
import stylecode.kosta180.domain.SpmFilterVO;
import stylecode.kosta180.service.ShoppingmallService;

/*	?¼?ëª? ë¦¬ì¤?¸ ì»¨í¸ë¡¤ë¬	*/

@Controller
@RequestMapping("/shoppingmall/*")
public class ShoppingmallController {
	private static final Logger logger=LoggerFactory.getLogger(ShoppingmallController.class);
	
	@Inject
	private ShoppingmallService service;
	
	// ?¼?ëª? ë¦¬ì¤?¸(?¼ë°? ë¦¬ì¤?¸, ê²?? ë¦¬ì¤?¸, ??° ë¦¬ì¤?¸)	
	@RequestMapping(value="/ShoppingMall", method=RequestMethod.GET)
	public void listShoppingmall(@ModelAttribute("search") ShoppingMallSearchVO search, Model model, SpmFilterVO filter) throws Exception {
		
		logger.info(search.toString());
		//?¼?ëª? ?¼ë°?, ê²?? ë¦¬ì¤?¸ ì¶ë ¥
		model.addAttribute("list", service.listShoppingMall(search));
		
		PageMaker pageMaker=new PageMaker();
		
		//??°ë§? ? ??´ì§? ì²ë¦¬
		if(filter.getCategory()!=null) {
			
			//??°ë§ë ?¼?ëª? ë²í¸ ë°ì?¤ê¸?
			List<Integer> num_list=service.SPMfiter(filter);
			
			//ë²í¸ ê°?ì§?ê³? ?¼?ëª? ë¦¬ì¤?¸ ë¿ë ¤ì£¼ê¸°
			//SpmFilterList? ?ë¹? ì¿¼ë¦¬ë¬? ?¬?© ? ?¸?ë¥? ??´ ë§ë  ê°ì²´
			List<ShoppingMallVO>filterList=new ArrayList<ShoppingMallVO>();
			SpmFilterListVO ffList=new SpmFilterListVO();

			//??°ë§ë ë¦¬ì¤?¸ë¥? SpmFilterListê°ì²´? ?´ê¸? 	
			ffList.setFilterList(num_list);
			filterList=service.listShoppingMallFilter(ffList);
			
			model.addAttribute("filterList", filterList);
			
			//??°ë§ì¼ ê²½ì° ??´ì§? ì²ë¦¬, ì¶ë ¥
			pageMaker.setCri(filter);
			pageMaker.setTotalCount(service.getFilterListCount(filter));
			
			model.addAttribute("pageMaker", pageMaker);
			
			return;
		}
		
		//??°ë§ì´ ?? ê²½ì°? ??´ì§? ì²ë¦¬, ì¶ë ¥
		pageMaker.setCri(search);
		pageMaker.setTotalCount(service.getListCount(search));
		
		model.addAttribute("pageMaker", pageMaker);
	}
}
