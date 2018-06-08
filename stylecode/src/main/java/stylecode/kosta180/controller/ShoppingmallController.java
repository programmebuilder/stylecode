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

/*	?��?���? 리스?�� 컨트롤러	*/

@Controller
@RequestMapping("/shoppingmall/*")
public class ShoppingmallController {
	private static final Logger logger=LoggerFactory.getLogger(ShoppingmallController.class);
	
	@Inject
	private ShoppingmallService service;
	
	// ?��?���? 리스?��(?���? 리스?��, �??�� 리스?��, ?��?�� 리스?��)	
	@RequestMapping(value="/ShoppingMall", method=RequestMethod.GET)
	public void listShoppingmall(@ModelAttribute("search") ShoppingMallSearchVO search, Model model, SpmFilterVO filter) throws Exception {
		
		logger.info(search.toString());
		//?��?���? ?���?, �??�� 리스?�� 출력
		model.addAttribute("list", service.listShoppingMall(search));
		
		PageMaker pageMaker=new PageMaker();
		
		//?��?���? ?�� ?��?���? 처리
		if(filter.getCategory()!=null) {
			
			//?��?��링된 ?��?���? 번호 받아?���?
			List<Integer> num_list=service.SPMfiter(filter);
			
			//번호 �?�?�? ?��?���? 리스?�� 뿌려주기
			//SpmFilterList?�� ?���? 쿼리�? ?��?�� ?�� ?��?���? ?��?�� 만든 객체
			List<ShoppingMallVO>filterList=new ArrayList<ShoppingMallVO>();
			SpmFilterListVO ffList=new SpmFilterListVO();

			//?��?��링된 리스?���? SpmFilterList객체?�� ?���? 	
			ffList.setFilterList(num_list);
			filterList=service.listShoppingMallFilter(ffList);
			
			model.addAttribute("filterList", filterList);
			
			//?��?��링일 경우 ?��?���? 처리, 출력
			pageMaker.setCri(filter);
			pageMaker.setTotalCount(service.getFilterListCount(filter));
			
			model.addAttribute("pageMaker", pageMaker);
			
			return;
		}
		
		//?��?��링이 ?��?�� 경우?�� ?��?���? 처리, 출력
		pageMaker.setCri(search);
		pageMaker.setTotalCount(service.getListCount(search));
		
		model.addAttribute("pageMaker", pageMaker);
	}
}
