package stylecode.kosta180.userrecommend.persistence;

import java.util.List;

import stylecode.kosta180.userrecommend.domain.ProductRateVO;



public interface RateDAO {
	public List<ProductRateVO> getRate(int mCode);
	public int insertRate(ProductRateVO rateVO);
}
