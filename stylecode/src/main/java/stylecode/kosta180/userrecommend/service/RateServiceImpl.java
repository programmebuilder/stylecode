package stylecode.kosta180.userrecommend.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import stylecode.kosta180.userrecommend.domain.ProductRateVO;
import stylecode.kosta180.userrecommend.persistence.RateDAOImpl;

@Service
public class RateServiceImpl implements RateService {
	@Inject
	RateDAOImpl dao;

	@Override
	public List<ProductRateVO> getRateService(int mCode) {
		// TODO Auto-generated method stub
		 
		return dao.getRate(mCode);	
	}
	
	public List<ProductRateVO> getAllRateService(){
		return dao.getAllRate();
	}

	@Override
	public int insertRateService(ProductRateVO rate) {
		return dao.insertRate(rate);
	}
	
	

}
