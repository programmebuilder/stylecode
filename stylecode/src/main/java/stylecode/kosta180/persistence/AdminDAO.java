package stylecode.kosta180.persistence;

import java.util.List;

import stylecode.kosta180.domain.Manager_spmVO;



public interface AdminDAO {

	public List<Manager_spmVO> spmList()throws Exception;
	public void spmAccept(int spmEnrollNo)throws Exception;
	public void deleteSpm(int spmEnrollNo)throws Exception;
	public void deleteSpmManager(int spmEnrollNo)throws Exception;
}