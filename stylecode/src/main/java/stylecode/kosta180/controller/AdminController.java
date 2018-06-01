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

/*                          ADMIN PAGE restController                          */


@Controller
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
         System.out.println(adminService.spmList().size());
         System.out.println("all 실행(컨트롤러)");

      } catch (Exception e) {
         e.printStackTrace();
         entity = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
      }
      return entity;
      
   }
   /*    승인        */
   //@RequestMapping(value="/accept", method=RequestMethod.PUT)
   @RequestMapping(value="/accept", method=RequestMethod.POST)
   /*public ResponseEntity<String> accept(@RequestBody String[] array){*/
   public ResponseEntity<String> accept(@RequestParam(value="array[]")
         List<String> array)throws Exception{
      
      HashMap hm = new HashMap<>();
      hm.put("Num", array);
      
      
      
      //List<String> eA = (List<String>) hm.get("Num");

      ResponseEntity<String> entity = null;
      System.out.println("admin 컨트롤러");
      Boolean bool = true;
      try {
         //승인처리(spmdate null값 채워줌)
         adminService.spmAccept(hm);
         //메일보내기 수행(bool값 true)
         adminService.sendEmail(hm, bool);
         System.out.println(hm);
         entity = new ResponseEntity<>("SUCCESS",HttpStatus.OK);
         
      } catch (Exception e) {
         e.printStackTrace();
         entity = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
      }
      return entity;
   }
   
   /*     거절        */
   @RequestMapping(value="/refuse", method=RequestMethod.DELETE)
   public ResponseEntity<String> refuse(@RequestParam(value="array[]")
         List<String> array)throws Exception{
      
      System.out.println("거절 컨트롤러");
      
      HashMap hm = new HashMap<>();
      hm.put("Num", array);

      ResponseEntity<String> entity = null;
      Boolean bool = false;
      try {
         
         //삭제하기 수정
          adminService.spmRefuse(hm);
         //메일보내기 서비스 수행(bool값 false)
          adminService.sendEmail(hm, bool);
         entity = new ResponseEntity<>("SUCCESS",HttpStatus.OK);
         
      } catch (Exception e) {
         e.printStackTrace();
         entity = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
      }
      return entity;
   }
   }
   
   

