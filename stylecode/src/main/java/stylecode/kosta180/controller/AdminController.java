package stylecode.kosta180.controller;

import static org.hamcrest.CoreMatchers.instanceOf;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import stylecode.kosta180.domain.Manager_spmVO;
import stylecode.kosta180.service.AdminService;

/*                          ADMIN PAGE 부분 restController                          */

@Controller
@RestController
@RequestMapping("/admin")
public class AdminController {


	@Inject
	private AdminService adminService;
   
	
	/*   입점신청 들어와 있는 쇼핑몰 리스트      */
	@RequestMapping(value="/all", method=RequestMethod.GET)
	public ResponseEntity<List<Manager_spmVO>> list(){
		
		ResponseEntity<List<Manager_spmVO>> entity =null;
		try {
			entity = new ResponseEntity<>(adminService.spmList(), HttpStatus.OK);
			System.out.println("all 실행함");

		} catch (Exception e) {
			e.printStackTrace();
			entity = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return entity;
		
	}
	/*    입점 승인         */
	//@RequestMapping(value="/accept", method=RequestMethod.PUT)
	@RequestMapping(value="/accept", method=RequestMethod.POST)
	/*public ResponseEntity<String> accept(@RequestBody String[] array){*/
	public ResponseEntity<String> accept(@RequestParam(value="array[]")
			List<String> array)throws Exception{
		
		HashMap hm = new HashMap<>();
		hm.put("Num", array);

		ResponseEntity<String> entity = null;
		System.out.println("admin 빰빰빰빰 컨트롤러");
		
		try {
			adminService.spmAccept(hm);
			
			entity = new ResponseEntity<>("SUCCESS",HttpStatus.OK);
			
		} catch (Exception e) {
			e.printStackTrace();
			entity = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return entity;
	}
	/*     입점 거절        */
		
	}