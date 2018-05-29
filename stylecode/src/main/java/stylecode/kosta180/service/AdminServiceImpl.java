package stylecode.kosta180.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import stylecode.kosta180.domain.Manager_spmVO;
import stylecode.kosta180.persistence.AdminDAO;


@Service
public class AdminServiceImpl implements AdminService {

	@Inject 
	private AdminDAO Dao;

	@Override
	public List<Manager_spmVO> spmList() throws Exception {
		
		return Dao.spmList();
	}

	@Override
	public void spmAccept(int spmEnrollNo) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void spmDecline(int spmEnrollNo) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	
	
}