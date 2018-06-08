package stylecode.kosta180.product.persistence;

import java.util.List;
import java.util.Map;

import stylecode.kosta180.product.domain.ProductSearchVO;
import stylecode.kosta180.product.domain.ProductVO;

public interface ProductDAO {

	public List<ProductVO> productlist(ProductSearchVO searchKey) throws Exception;
	public List<ProductVO> productlistLow(ProductSearchVO searchKey) throws Exception;
	public List<ProductVO> productlistHigh(ProductSearchVO searchKey) throws Exception;
	public int productListCount(ProductSearchVO search)throws Exception;
	/* ITEM��� ��õ*/
	public List<ProductVO> recommendList(List<Integer> recommendlist);
	
	/*������ǰ�� �̱����� �Լ�*/
	public List<ProductVO> recommendRandom() throws Exception;
	
}
