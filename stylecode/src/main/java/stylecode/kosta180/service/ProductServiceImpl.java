package stylecode.kosta180.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import stylecode.kosta180.domain.ProductVO;
import stylecode.kosta180.persistence.ProductDAO;
@Service
public class ProductServiceImpl implements ProductService {
@Inject
private ProductDAO productDao;

	@Override
	public List<ProductVO> listAll() throws Exception {

		return productDao.productlist();
	}

	@Override
	public List<ProductVO> listAllLow() throws Exception {
		
		return productDao.productlistLow();
	}

	@Override
	public List<ProductVO> listAllHigh() throws Exception {
		
		return productDao.productlistHigh();
	}

}