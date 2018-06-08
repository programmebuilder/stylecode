package stylecode.kosta180.userrecommend.persistence;

import java.util.List;

import stylecode.kosta180.product.domain.ProductSearchVO;
import stylecode.kosta180.product.domain.ProductVO;





public interface UserProductDAO {
	public List<ProductVO> getPagingItems(ProductSearchVO search);
	public List<ProductVO> getAllItems();
	public int productListCount(ProductSearchVO search)throws Exception;
	public List<ProductVO> getRecommendList(List<Long> itemList);
}