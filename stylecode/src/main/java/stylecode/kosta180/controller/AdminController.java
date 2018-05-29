package stylecode.kosta180.controller;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import stylecode.kosta180.domain.Manager_spmVO;
import stylecode.kosta180.service.AdminService;

/*                          ADMIN PAGE �κ� restController                          */

@RestController
@RequestMapping("/admin")
public class AdminController {


	@Inject
	private AdminService adminService;
   
	
	/*   ������û ���� �ִ� ���θ� ����Ʈ      */
	@RequestMapping(value="/all", method=RequestMethod.GET)
	public ResponseEntity<List<Manager_spmVO>> list(){
		
		ResponseEntity<List<Manager_spmVO>> entity =null;
		try {
			entity = new ResponseEntity<>(adminService.spmList(), HttpStatus.OK);

		} catch (Exception e) {
			e.printStackTrace();
			entity = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return entity;
		
	}
	/*    ���� ����         */
	
	/*     ���� ����        */
		
	}
	
	

