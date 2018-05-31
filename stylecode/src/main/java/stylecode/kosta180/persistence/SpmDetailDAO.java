package stylecode.kosta180.persistence;


import java.util.List;
import java.util.Map;

import stylecode.kosta180.domain.ProductVO;
import stylecode.kosta180.domain.ShoppingMallVO;
import stylecode.kosta180.domain.SpmBmVO;

public interface SpmDetailDAO {

	public ShoppingMallVO selectedSPM(int spmEnrollNo) throws Exception;
	public List<String> SpmStyle(int spmEnrollNo)throws Exception;
	public List<ProductVO> selectedProduct(int spmEnrollNo) throws Exception;
	
	//���ã�� ó���ϴ� �κ�
	public void insertBm(SpmBmVO vo) throws Exception;
	public void deleteBm(Integer spmBmNo) throws Exception;
	public int  checkBm(Map<String, Object> map) throws Exception;
	
}
