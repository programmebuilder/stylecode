package stylecode.kosta180.service;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import stylecode.kosta180.domain.Manager_spmVO;
import stylecode.kosta180.persistence.AdminDAO;


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
		// 이메일 보내기
		
		dao.spmAccept(spmEnrollNo);
	}

	@Override
	public void spmDecline(int spmEnrollNo) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendEmail(HashMap spmEnrollNo, boolean bool) throws Exception {

		//dao로 이메일 값 리스트 받아오기
		//승인 거절에 따라 메일 발송 메세지를 다르게 해준다.
		if(bool){
			//승인일 때
		}else{
		 //거절 일 때
		}
		
		
	}


	
	
}
