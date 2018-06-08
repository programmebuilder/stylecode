package stylecode.kosta180.userrecommend.service;

import java.util.List;

import stylecode.kosta180.userrecommend.domain.ProductRateVO;



public interface RateService {
	public List<ProductRateVO> getRateService(int mCode);
	public int insertRateService(ProductRateVO rate);
}
