package stylecode.kosta180.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import stylecode.kosta180.domain.ShoppingMallVO;
import stylecode.kosta180.service.BookMarkServiceImpl;

@Controller
@RequestMapping(value="/bookmark/*")
public class BookMarkController {
	@Inject
	private BookMarkServiceImpl service;
	private static final Logger logger=LoggerFactory.getLogger(BookMarkController.class);
	
	@RequestMapping(value="/bookmarklist")
	public void bookmarkList(Model model,HttpSession session){
		String mId = (String) session.getAttribute("mId");
		logger.info("bookmark Controller Ȯ��");
		List<ShoppingMallVO> list = service.bookMarkList(mId);
		model.addAttribute("list",list);
		System.out.println(service.bookMarkList(mId).toString());
	}
	
	@RequestMapping(value="/deletebookmark")
	public String deleteBookMark(int spmEnrollNo){
		service.deleteBookMark(spmEnrollNo);
		
		
		return "redirect:/bookmark/bookmarklist";
	}

}