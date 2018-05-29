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
import stylecode.kosta180.domain.ShoppingmallVO;
import stylecode.kosta180.domain.SpmFilterListVO;
import stylecode.kosta180.domain.SpmFilterVO;
import stylecode.kosta180.service.ShoppingmallService;

@Controller
@RequestMapping("/shoppingmall/*")
public class ShoppingmallController {
	private static final Logger logger=LoggerFactory.getLogger(ShoppingmallController.class);
	
	@Inject
	private ShoppingmallService service;
	
	@RequestMapping(value="/ShoppingMall", method=RequestMethod.GET)
	public void listShoppingmall(@ModelAttribute("search") ShoppingMallSearchVO search, Model model, SpmFilterVO filter) throws Exception {
		
		logger.info(search.toString());
		model.addAttribute("list", service.listShoppingMall(search));
		
		PageMaker pageMaker=new PageMaker();
		
		if(filter.getCategory()!=null) {
			
			//필터링된 쇼핑몰 번호 받아오기
			List<Integer> num_list=service.SPMfiter(filter);
			
			//번호 가지고 쇼핑몰 리스트 뿌려주기
			//SpmFilterList는 디비 쿼리문 사용 시 편의를 위해 만든 객체
			List<ShoppingmallVO>filterList=new ArrayList<ShoppingmallVO>();
			SpmFilterListVO ffList=new SpmFilterListVO();

			//필터링된 리스트를 SpmFilterList객체에 담기 	
			ffList.setFilterList(num_list);
			filterList=service.listShoppingMallFilter(ffList);
			
			model.addAttribute("filterList", filterList);
			
			pageMaker.setCri(filter);
			pageMaker.setTotalCount(service.getFilterListCount(filter));
			
			model.addAttribute("pageMaker", pageMaker);
			
			return;
		}
		
		pageMaker.setCri(search);
		pageMaker.setTotalCount(service.getListCount(search));
		
		model.addAttribute("pageMaker", pageMaker);
	}
	
	@RequestMapping(value="/shoppingmallRequest", method=RequestMethod.GET)
	public void shoppingmallRequestGET(Model model) throws Exception {

	}
	
	@RequestMapping(value="/shoppingmallRequest", method=RequestMethod.POST)
	public String shoppingmallRequestPOST(Model model) throws Exception {
		return "redirect:/shoppingmall/.....";
	}
}