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

/*	?‡¼?•‘ëª? ë¦¬ìŠ¤?Š¸ ì»¨íŠ¸ë¡¤ëŸ¬	*/

@Controller
@RequestMapping("/shoppingmall/*")
public class ShoppingmallController {
	private static final Logger logger=LoggerFactory.getLogger(ShoppingmallController.class);
	
	@Inject
	private ShoppingmallService service;
	
	// ?‡¼?•‘ëª? ë¦¬ìŠ¤?Š¸(?¼ë°? ë¦¬ìŠ¤?Š¸, ê²??ƒ‰ ë¦¬ìŠ¤?Š¸, ?•„?„° ë¦¬ìŠ¤?Š¸)	
	@RequestMapping(value="/ShoppingMall", method=RequestMethod.GET)
	public void listShoppingmall(@ModelAttribute("search") ShoppingMallSearchVO search, Model model, SpmFilterVO filter) throws Exception {
		
		logger.info(search.toString());
		//?‡¼?•‘ëª? ?¼ë°?, ê²??ƒ‰ ë¦¬ìŠ¤?Š¸ ì¶œë ¥
		model.addAttribute("list", service.listShoppingMall(search));
		
		PageMaker pageMaker=new PageMaker();
		
		//?•„?„°ë§? ?‹œ ?˜?´ì§? ì²˜ë¦¬
		if(filter.getCategory()!=null) {
			
			//?•„?„°ë§ëœ ?‡¼?•‘ëª? ë²ˆí˜¸ ë°›ì•„?˜¤ê¸?
			List<Integer> num_list=service.SPMfiter(filter);
			
			//ë²ˆí˜¸ ê°?ì§?ê³? ?‡¼?•‘ëª? ë¦¬ìŠ¤?Š¸ ë¿Œë ¤ì£¼ê¸°
			//SpmFilterList?Š” ?””ë¹? ì¿¼ë¦¬ë¬? ?‚¬?š© ?‹œ ?¸?˜ë¥? ?œ„?•´ ë§Œë“  ê°ì²´
			List<ShoppingMallVO>filterList=new ArrayList<ShoppingMallVO>();
			SpmFilterListVO ffList=new SpmFilterListVO();

			//?•„?„°ë§ëœ ë¦¬ìŠ¤?Š¸ë¥? SpmFilterListê°ì²´?— ?‹´ê¸? 	
			ffList.setFilterList(num_list);
			filterList=service.listShoppingMallFilter(ffList);
			
			model.addAttribute("filterList", filterList);
			
			//?•„?„°ë§ì¼ ê²½ìš° ?˜?´ì§? ì²˜ë¦¬, ì¶œë ¥
			pageMaker.setCri(filter);
			pageMaker.setTotalCount(service.getFilterListCount(filter));
			
			model.addAttribute("pageMaker", pageMaker);
			
			return;
		}
		
		//?•„?„°ë§ì´ ?•„?‹ ê²½ìš°?— ?˜?´ì§? ì²˜ë¦¬, ì¶œë ¥
		pageMaker.setCri(search);
		pageMaker.setTotalCount(service.getListCount(search));
		
		model.addAttribute("pageMaker", pageMaker);
	}
}
