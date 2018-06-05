package stylecode.kosta180.service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import javax.inject.Inject;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;

import org.springframework.stereotype.Service;

import stylecode.kosta180.domain.Manager_spmVO;
import stylecode.kosta180.persistence.AdminDAO;
import stylecode.kosta180.util.MyAuthentication;


@Service
public class AdminServiceImpl implements AdminService {

	@Inject 
	private AdminDAO dao;


	@Override
	public List<Manager_spmVO> spmList() throws Exception {
		
		return dao.spmList();
	}

	@Override
	public void spmAccept(HashMap spmEnrollNo) throws Exception {
		
		
		dao.spmAccept(spmEnrollNo);
	}

	@Override
	public void spmRefuse(HashMap spmEnrollNo) throws Exception {
		
		dao.deleteSpmManager(spmEnrollNo);
		dao.deleteSpm(spmEnrollNo);
	}

	@Override
	public void sendEmail(HashMap spmEnrollNo, boolean bool) throws Exception {

		//dao수행 해서 email 받아오기	
		System.out.println("이메일 서비스 해쉬" + spmEnrollNo);
		System.out.println("이메일 서비스 : " + dao.emailAdd(spmEnrollNo));
		List<String> emailList = dao.emailAdd(spmEnrollNo);
		System.out.println("변수에 넣은것 : " + emailList);
		
		
		//hm리스트로 바꿔주기
		
		for(int i=0; i<emailList.size(); i++){
			System.out.println(i+"번째 : " + emailList.get(i));
			 Properties p = System.getProperties();
		     p.put("mail.smtp.starttls.enable", "true");     // gmail은 무조건 true 고정
		     p.put("mail.smtp.host", "smtp.gmail.com");      // smtp 서버 주소
		     p.put("mail.smtp.auth","true");                 // gmail은 무조건 true 고정
		     p.put("mail.smtp.port", "587");                 // gmail 포트

		     Authenticator auth = new MyAuthentication();
		     
		     //session,MimeMessage 생성
		     Session eSession = Session.getDefaultInstance(p, auth);
		     MimeMessage msg = new MimeMessage(eSession);
		     
		     try {
		    	 	msg.setSentDate(new Date());
		    	 	InternetAddress from = new InternetAddress();
		    	 	from = new InternetAddress("Style Code<mb7407@gamil.com>");
		    	 	
		    	 	//이메일 발신자
		    	 	msg.setFrom(from);
		    	 	
		    	 	//이메일 수신자
		    	 	InternetAddress to = new InternetAddress(emailList.get(i));
		    	 	msg.setRecipient(Message.RecipientType.TO, to);
		    	 	
		    	 	//이메일 헤더
		    	 	msg.setHeader("content-Type", "text/html");

		    	 	//이메일제목
		    	 	msg.setSubject("안녕하세요 Style Code 입니다", "UTF-8");
		    	 	
		    	 	
					if(bool){
						//승인 했을 때에 보내는 메세지
						//bool값이 true 일 때 메세지
						//이메일 내용
						msg.setText("안녕하세요 Style Code 입니다. "
								+ "입점신청이 완료되었습니다."
								+ "감사합니다.", "UTF-8");

						
					}else{
						//거절 했을 때에 보내는 이메일
						//bool값이 false 일 때 메세지
						//이메일 내용
						msg.setText("안녕하세요 Style Code 입니다. "
								+ "입점신청이 거절되었습니다."
								+ "자세한 내용은 문의 부탁드립니다.", "UTF-8");
					}
					
					//이메일 보내기
					javax.mail.Transport.send(msg);

			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		
	}
		
}
