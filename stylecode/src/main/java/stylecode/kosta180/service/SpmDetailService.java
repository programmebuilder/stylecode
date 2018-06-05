package stylecode.kosta180.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import stylecode.kosta180.domain.Criteria;
import stylecode.kosta180.product.domain.ProductVO;
import stylecode.kosta180.domain.ShoppingMallVO;
import stylecode.kosta180.domain.SpmBmVO;

@Service
public interface SpmDetailService {

	public ShoppingMallVO selectedSPM(int spmEnrollNo) throws Exception;
	public List<String> SpmStyle(int spmEnrollNo) throws Exception;
	public List<ProductVO> selectedProduct(int spmEnrollNo) throws Exception;
	
	//占쏙옙占시ｏ옙占� 처占쏙옙占싹댐옙 占싸븝옙
	public void insertBm(SpmBmVO vo) throws Exception;
	public void deleteBm(Integer spmBmNo) throws Exception;
	public Integer checkBm(Map<String, Object> map)throws Exception;
	
}
