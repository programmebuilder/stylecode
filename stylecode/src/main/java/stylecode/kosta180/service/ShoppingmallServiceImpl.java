package stylecode.kosta180.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import stylecode.kosta180.domain.ShoppingMallSearchVO;
import stylecode.kosta180.domain.ShoppingMallVO;
import stylecode.kosta180.domain.SpmFilterListVO;
import stylecode.kosta180.domain.SpmFilterVO;
import stylecode.kosta180.domain.SpmRequestVO;
import stylecode.kosta180.persistence.ShoppingmallDAO;

@Service
public class ShoppingmallServiceImpl implements ShoppingmallService {
	@Inject
	private ShoppingmallDAO dao;

	@Override
	public List<ShoppingMallVO> listShoppingMall(ShoppingMallSearchVO search) throws Exception {
		// 처음/검색 시 리스트
		return dao.listShoppingMall(search);
	}

	@Override
	public List<Integer> SPMfiter(SpmFilterVO filter) throws Exception {
		//쇼핑몰 필터링 처리
		return dao.SPMfiter(filter);
	}

	@Override
	public List<ShoppingMallVO> listShoppingMallFilter(SpmFilterListVO filterList) throws Exception {
		//필터 사용 시 출력 메소드
		return dao.listShoppingMallFilter(filterList);
	}

	@Override
	public int getListCount(ShoppingMallSearchVO search) throws Exception {
		//페이징 처리
		return dao.getListCount(search);
	}

	@Override
	public int getFilterListCount(SpmFilterVO filter) throws Exception {
		//필터 페이징 처리
		return dao.getFilterListCount(filter);
	}

	@Override
	public void requestSPM(SpmRequestVO spmRequest) throws Exception {
		//입점신청 생성
		dao.requestSPM(spmRequest);
	}
	
	@Override
	public void requestSPM2(SpmRequestVO spmRequest) throws Exception {
		// TODO Auto-generated method stub
		dao.requestSPM2(spmRequest);
	}

	@Override
	public int listShoppingMallR() throws Exception {
		//입점신청 편의를 위한 리스트
		return dao.listShoppingMallR();
	}

}
