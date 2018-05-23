package stylecode.kosta180.controller;

import java.util.Map;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import stylecode.kosta180.service.ProductService;

@Controller
public class ProductListController {
	/*private static final Logger logger = LoggerFactory.getLogger(SecurityController.class);*/
	@Inject
	private ProductService service;
	
	@RequestMapping(value = "/productlist", method = RequestMethod.GET)
	public String productlist(Model model) throws Exception{
		model.addAttribute("list", service.listAll());
		return "product/productlist";
	}
	@RequestMapping(value = "/productlistLow", method = RequestMethod.GET)
	public String productlistLow(Model model) throws Exception{
		model.addAttribute("list",service.listAllLow());
		
		return "product/productlist";
	}
	
	@RequestMapping(value = "/productlistHigh", method = RequestMethod.GET)
	public String productlistHigh(Model model) throws Exception{
		model.addAttribute("list",service.listAllHigh());
		return "product/productlist";
	}
	
}
