package stylecode.kosta180.userrecommend.service;

import java.util.List;

import stylecode.kosta180.product.domain.ProductSearchVO;
import stylecode.kosta180.product.domain.ProductVO;

public interface UserProductService {
	public List<ProductVO> getAllItemService();
	public List<ProductVO> getPagingItemService(ProductSearchVO search);
	public int getItemCount(ProductSearchVO search)throws Exception;
	public List<ProductVO> getRecommendService(List<Long> itemList);
}