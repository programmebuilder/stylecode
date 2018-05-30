package stylecode.kosta180.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import stylecode.kosta180.domain.ProductVO;
import stylecode.kosta180.service.RcServiceImpl;

@Controller
@RequestMapping(value="/recommend/*")
public class RecommendController {
	
	@Inject
	private RcServiceImpl service;
	
	@RequestMapping(value="/")
	public String rcInitialize(Model model){
		try {
			List<ProductVO> prodList = service.selectProductDataService();
			model.addAttribute("prodList", prodList);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "recommend/rcMain";
	}
		
	@RequestMapping(value="/cgno/{cgno}", method=RequestMethod.GET)
	public ResponseEntity<List<ProductVO>> rcCategory(@PathVariable("cgno") Integer cgno){
		
		ResponseEntity<List<ProductVO>> entity = null;
				
		try {
			entity = new ResponseEntity<>(service.productListService(cgno),HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			entity = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		
		return entity;
	}
}
