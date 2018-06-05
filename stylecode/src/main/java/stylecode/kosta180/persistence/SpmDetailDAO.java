package stylecode.kosta180.persistence;


import java.util.List;
import java.util.Map;

import stylecode.kosta180.domain.Criteria;
import stylecode.kosta180.product.domain.ProductVO;
import stylecode.kosta180.domain.ShoppingMallVO;
import stylecode.kosta180.domain.SpmBmVO;

public interface SpmDetailDAO {

	public ShoppingMallVO selectedSPM(int spmEnrollNo) throws Exception;
	public List<String> SpmStyle(int spmEnrollNo)throws Exception;
	public List<ProductVO> selectedProduct(int spmEnrollNo) throws Exception;
	// 議고쉶�닔
	public void hitCount(int SpmEnrollNo) throws Exception;
	//占쏙옙占시ｏ옙占� 처占쏙옙占싹댐옙 占싸븝옙
	public void insertBm(SpmBmVO vo) throws Exception;
	public void deleteBm(Integer spmBmNo) throws Exception;
	public int  checkBm(Map<String, Object> map) throws Exception;
	
}
