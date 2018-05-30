package stylecode.kosta180.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import stylecode.kosta180.domain.ProductVO;
import stylecode.kosta180.persistence.RcDAOImpl;

@Service
public class RcServiceImpl implements RcService {
	
	@Inject
	private RcDAOImpl dao;
	
	@Override
	public List<ProductVO> selectProductDataService() throws Exception {
		return dao.selectProductData();
	}

	@Override
	public List<ProductVO> productListService(int cgno) throws Exception {
		return dao.productList(cgno);
	}
}
