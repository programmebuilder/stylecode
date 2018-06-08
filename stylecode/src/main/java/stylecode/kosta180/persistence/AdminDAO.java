package stylecode.kosta180.persistence;

import java.util.HashMap;
import java.util.List;

import stylecode.kosta180.domain.Manager_spmVO;



public interface AdminDAO {

	public List<Manager_spmVO> spmList()throws Exception;
	public void spmAccept(HashMap spmEnrollNo)throws Exception;
	
	public void deleteSpm(HashMap spmEnrollNo)throws Exception;
	public void deleteSpmManager(HashMap spmEnrollNo)throws Exception;
	
	//email 보내는 부분
	public List<String> emailAdd(HashMap spmEnrollNo)throws Exception;
	
}