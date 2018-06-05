package stylecode.kosta180.controller;




import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import stylecode.kosta180.domain.Criteria;
import stylecode.kosta180.product.domain.ProductVO;
import stylecode.kosta180.service.SpmDetailService;

@Controller
public class SpmDetailController {

	private static final Logger logger = LoggerFactory.getLogger(SpmDetailController.class);
	
	@Inject
	private SpmDetailService spmService;
	
	@RequestMapping(value="/spmDetail/{spmEnrollNo}")
	public String spmDetail(@PathVariable int spmEnrollNo, Model model,HttpSession session)throws Exception{	
		
		//利먭꺼李얘린 �뿬遺� �솗�씤�쓣 �쐞�빐�꽌 id�� enrollNo�쓣 �꽆寃⑥��떎
		String mId = (String)session.getAttribute("mId");

		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("spmEnrollNo",spmEnrollNo );
		map.put("mId", mId);

		
		
		model.addAttribute("spm", spmService.selectedSPM(spmEnrollNo));
		
		model.addAttribute("product", spmService.selectedProduct(spmEnrollNo));
		//model.addAttribute("smbm", 0);
		int  spmBmNo = 0;
		try {
			spmBmNo = spmService.checkBm(map);
			
			model.addAttribute("smbm",spmBmNo);
			
		} catch (Exception e) {
			spmBmNo = 0;
			model.addAttribute("smbm", 0);
		}
		
		

		return "/spmDetail/spmDetail";	
	} 
	
	
	
	
	
}
