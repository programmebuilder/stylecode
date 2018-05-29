package stylecode.kosta180.controller;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import stylecode.kosta180.domain.SpmBmVO;
import stylecode.kosta180.service.SpmDetailService;
                       /*          bookMark 추가,삭제 부분 restController            */
@RestController
@RequestMapping("/spmBm")
public class SpmBmController {

	@Inject
	private SpmDetailService service;
	
	//spmBm 추가
	@RequestMapping(value="",method = RequestMethod.POST)
	public ResponseEntity<String> addspmBm(@RequestBody SpmBmVO vo){
		
		ResponseEntity<String> entity =null;
		
		try {
			service.insertBm(vo);
			entity = new ResponseEntity<String>("SUCCESS",HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			entity = new ResponseEntity<String>(e.getMessage(),HttpStatus.BAD_REQUEST);
			
		}return entity;
	}
	//spmBm 삭제
	@RequestMapping(value="/{spmBmNo}", method=RequestMethod.DELETE)
	public ResponseEntity<String> deleteBm(@PathVariable Integer spmBmNo){
		
		ResponseEntity<String> entity = null;
		try {

			service.deleteBm(spmBmNo);
			entity = new ResponseEntity<String>("SUCCESS",HttpStatus.OK);		
		} catch (Exception e) {
			
			e.printStackTrace();
			entity = new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
		}
		return entity;
	}
	
	//spmBmNo값 받기
	@RequestMapping(value="get/{spmEnrollNo}",method=RequestMethod.GET)
	public ResponseEntity<Integer> getSpmbm(@PathVariable int spmEnrollNo, HttpSession session)throws Exception{
		
		Map<String, Object> map = new HashMap<String, Object>();
		String mId = (String)session.getAttribute("mId");
		
		map.put("spmEnrollNo",spmEnrollNo );
		map.put("mId", mId);
		System.out.println("map"+ map);
				
		ResponseEntity<Integer> entity = null;
		System.out.println("컨트롤러 들어옴");

		try {
		
			entity = new ResponseEntity<>(service.checkBm(map),HttpStatus.OK);
			System.out.println(entity);
			
		} catch (Exception e) {
			e.printStackTrace();
			entity = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
			System.out.println("실패시 : " + entity);
		}
		return entity;
		
	}

	
	
	
	
	
}
