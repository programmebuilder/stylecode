package stylecode.kosta180.service;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import stylecode.kosta180.domain.Criteria;
import stylecode.kosta180.domain.ProductVO;
import stylecode.kosta180.domain.ShoppingMallVO;
import stylecode.kosta180.domain.SpmBmVO;
import stylecode.kosta180.persistence.SpmDetailDAO;


@Service
public class SpmDetailServiceImpl implements SpmDetailService {

	@Inject
	private SpmDetailDAO spmDao;
	@Override
	public ShoppingMallVO selectedSPM(int spmEnrollNo) throws Exception {
		//EnrollNo를 파라미터로 받아 쇼핑몰 객체를 return 해준다.
		spmDao.hitCount(spmEnrollNo);
		return spmDao.selectedSPM(spmEnrollNo);
	}

	@Override
	public List<String> SpmStyle(int spmEnrollNo) throws Exception {
		//쇼핑몰에 대한 스타일
		return spmDao.SpmStyle(spmEnrollNo);
	}

	@Override
	public List<ProductVO> selectedProduct(int spmEnrollNo) throws Exception {
		//쇼핑몰에 대한 상품 리스트
		return spmDao.selectedProduct(spmEnrollNo);
	}

	@Override
	public void insertBm(SpmBmVO vo) throws Exception {
		
		spmDao.insertBm(vo);
		
	}

	@Override
	public void deleteBm(Integer spmBmNo) throws Exception {
		
		spmDao.deleteBm(spmBmNo);
	}

	@Override
	public Integer checkBm(Map<String, Object> map) throws Exception {
		System.out.println("서비스"+spmDao.checkBm(map));
		
		return spmDao.checkBm(map);
	}

}
