package stylecode.kosta180.persistence;

import java.util.List;
import java.util.Map;

import stylecode.kosta180.domain.ProductSearchVO;
import stylecode.kosta180.domain.ProductVO;

public interface ProductDAO {

	public List<ProductVO> productlist(ProductSearchVO searchKey) throws Exception;
	public List<ProductVO> productlistLow(ProductSearchVO searchKey) throws Exception;
	public List<ProductVO> productlistHigh(ProductSearchVO searchKey) throws Exception;
	public int productListCount(ProductSearchVO search)throws Exception;
	/* ITEM기반 추천*/
	public List<ProductVO> recommendList(List<Integer> recommendlist);
	
	/*랜덤상품을 뽑기위한 함수*/
	public List<ProductVO> recommendRandom() throws Exception;
	
}
