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

/*	쇼핑몰 리스트 컨트롤러	*/

@Controller
@RequestMapping("/shoppingmall/*")
public class ShoppingmallController {
	private static final Logger logger=LoggerFactory.getLogger(ShoppingmallController.class);
	
	@Inject
	private ShoppingmallService service;
	
	// 쇼핑몰 리스트(일반 리스트, 검색 리스트, 필터 리스트)	
	@RequestMapping(value="/ShoppingMall", method=RequestMethod.GET)
	public void listShoppingmall(@ModelAttribute("search") ShoppingMallSearchVO search, Model model, SpmFilterVO filter) throws Exception {
		
		logger.info(search.toString());
		//쇼핑몰 일반, 검색 리스트 출력
		model.addAttribute("list", service.listShoppingMall(search));
		
		PageMaker pageMaker=new PageMaker();
		
		//필터링 시 페이징 처리
		if(filter.getCategory()!=null) {
			
			//필터링된 쇼핑몰 번호 받아오기
			List<Integer> num_list=service.SPMfiter(filter);
			
			//번호 가지고 쇼핑몰 리스트 뿌려주기
			//SpmFilterList는 디비 쿼리문 사용 시 편의를 위해 만든 객체
			List<ShoppingMallVO>filterList=new ArrayList<ShoppingMallVO>();
			SpmFilterListVO ffList=new SpmFilterListVO();

			//필터링된 리스트를 SpmFilterList객체에 담기 	
			ffList.setFilterList(num_list);
			filterList=service.listShoppingMallFilter(ffList);
			
			model.addAttribute("filterList", filterList);
			
			//필터링일 경우 페이징 처리, 출력
			pageMaker.setCri(filter);
			pageMaker.setTotalCount(service.getFilterListCount(filter));
			
			model.addAttribute("pageMaker", pageMaker);
			
			return;
		}
		
		//필터링이 아닐 경우에 페이징 처리, 출력
		pageMaker.setCri(search);
		pageMaker.setTotalCount(service.getListCount(search));
		
		model.addAttribute("pageMaker", pageMaker);
	}
}