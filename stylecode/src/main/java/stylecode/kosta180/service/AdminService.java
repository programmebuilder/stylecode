package stylecode.kosta180.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import stylecode.kosta180.domain.Manager_spmVO;


@Service
public interface AdminService {

	public List<Manager_spmVO> spmList() throws Exception;
	public void spmDecline(int spmEnrollNo) throws Exception;
	public void spmAccept(HashMap spmEnrollNo)throws Exception;
	public void sendEmail(HashMap spmEnrollNo, boolean bool )throws Exception;

	
}
