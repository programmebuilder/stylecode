package stylecode.kosta180.service;

import java.util.List;

import stylecode.kosta180.domain.ProductVO;

public interface RcService {
	public List<ProductVO> selectProductDataService() throws Exception;
	public List<ProductVO> productListService(int cgno) throws Exception;
}
