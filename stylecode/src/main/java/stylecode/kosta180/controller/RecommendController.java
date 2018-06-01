package stylecode.kosta180.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import stylecode.kosta180.domain.CategoryVO;
import stylecode.kosta180.domain.PageMaker;
import stylecode.kosta180.domain.ProductVO;
import stylecode.kosta180.service.RcServiceImpl;

@Controller
@RequestMapping(value="/recommend/*")
public class RecommendController {
	
	@Inject
	private RcServiceImpl service;
	
	@RequestMapping(value="/")
	public String rcInitialize(Model model, @ModelAttribute("cri") CategoryVO cri){
		
		PageMaker pageMaker = new PageMaker();
		
		int totalCount = 0;
		try {
			totalCount = service.countingPagingService(cri);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			List<ProductVO> prodList = service.selectProductDataService(cri);
			model.addAttribute("prodList", prodList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(totalCount);
		model.addAttribute("pageMaker", pageMaker);
		
		return "recommend/rcMain";
	}
		
/*	@RequestMapping(value="/cgno/{cgno}", method=RequestMethod.GET)
	public ResponseEntity<List<ProductVO>> rcCategory(@PathVariable("cgno") Integer cgno){
		
		ResponseEntity<List<ProductVO>> entity = null;
				
		try {
			entity = new ResponseEntity<>(service.productListService(cgno),HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			entity = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		
		return entity;
	}*/

}
