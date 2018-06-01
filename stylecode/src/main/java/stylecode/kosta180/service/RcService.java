package stylecode.kosta180.service;

import java.util.List;

import stylecode.kosta180.domain.CategoryVO;
import stylecode.kosta180.domain.ProductVO;

public interface RcService {
	public List<ProductVO> selectProductDataService(CategoryVO criteria) throws Exception;
	public List<ProductVO> productListService(int cgno) throws Exception;
	public int countingPagingService(CategoryVO criteria) throws Exception;
}
