package stylecode.kosta180.service;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import stylecode.kosta180.domain.Criteria;
import stylecode.kosta180.product.domain.ProductVO;
import stylecode.kosta180.domain.ShoppingMallVO;
import stylecode.kosta180.domain.SpmBmVO;
import stylecode.kosta180.persistence.SpmDetailDAO;


@Service
public class SpmDetailServiceImpl implements SpmDetailService {

	@Inject
	private SpmDetailDAO spmDao;
	@Override
	public ShoppingMallVO selectedSPM(int spmEnrollNo) throws Exception {
		//EnrollNo瑜� �뙆�씪誘명꽣濡� 諛쏆븘 �눥�븨紐� 媛앹껜瑜� return �빐以��떎.
		spmDao.hitCount(spmEnrollNo);
		return spmDao.selectedSPM(spmEnrollNo);
	}

	@Override
	public List<String> SpmStyle(int spmEnrollNo) throws Exception {
		//�눥�븨紐곗뿉 ���븳 �뒪���씪
		return spmDao.SpmStyle(spmEnrollNo);
	}

	@Override
	public List<ProductVO> selectedProduct(int spmEnrollNo) throws Exception {
		//�눥�븨紐곗뿉 ���븳 �긽�뭹 由ъ뒪�듃
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
		System.out.println("�꽌鍮꾩뒪"+spmDao.checkBm(map));
		
		return spmDao.checkBm(map);
	}

}
