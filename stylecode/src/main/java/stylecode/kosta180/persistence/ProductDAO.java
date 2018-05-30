package stylecode.kosta180.persistence;

import java.util.List;
import java.util.Map;

import stylecode.kosta180.domain.ProductVO;

public interface ProductDAO {

	public List<ProductVO> productlist() throws Exception;
	public List<ProductVO> productlistLow() throws Exception;
	public List<ProductVO> productlistHigh() throws Exception;
	
	/* ITEM��� ��õ*/
	public List<ProductVO> recommendList(List<Integer> recommendlist);
	
	
}
