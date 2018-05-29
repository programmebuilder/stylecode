package stylecode.kosta180.service;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

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
		//EnrollNo�� �Ķ���ͷ� �޾� ���θ� ��ü�� return ���ش�.
		return spmDao.selectedSPM(spmEnrollNo);
	}

	@Override
	public List<String> SpmStyle(int spmEnrollNo) throws Exception {
		//���θ��� ���� ��Ÿ��
		return spmDao.SpmStyle(spmEnrollNo);
	}

	@Override
	public List<ProductVO> selectedProduct(int spmEnrollNo) throws Exception {
		//���θ��� ���� ��ǰ ����Ʈ
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
		System.out.println("����"+spmDao.checkBm(map));
		
		return spmDao.checkBm(map);
	}

}
