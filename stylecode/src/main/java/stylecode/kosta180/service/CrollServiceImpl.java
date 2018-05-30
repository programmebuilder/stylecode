package stylecode.kosta180.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import stylecode.kosta180.domain.CrollProductVO;
import stylecode.kosta180.domain.CrollSPMVO;
import stylecode.kosta180.persistence.CrollDAOImpl;

@Service
public class CrollServiceImpl implements CrollService {

	@Inject
	private CrollDAOImpl dao;
	
	@Override
	public void insertShopDataService(List<CrollSPMVO> crollSPMList) throws Exception {
		dao.insertShopData(crollSPMList);
	}

	@Override
	public void insertProductDataService(List<CrollProductVO> crollProductList) throws Exception {
		dao.insertProductData(crollProductList);
	}

}
