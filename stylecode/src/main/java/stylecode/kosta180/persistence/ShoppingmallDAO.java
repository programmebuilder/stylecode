package stylecode.kosta180.persistence;

import java.util.List;
import java.util.Map;

import stylecode.kosta180.domain.ProductVO;
import stylecode.kosta180.domain.ShoppingMallSearchVO;
import stylecode.kosta180.domain.ShoppingMallVO;
import stylecode.kosta180.domain.SpmFilterVO;
import stylecode.kosta180.domain.SpmRequestVO;
import stylecode.kosta180.domain.SpmFilterListVO;

public interface ShoppingmallDAO {
	//일반, 검색 시 쇼핑몰 리스트
	public List<ShoppingMallVO> listShoppingMall(ShoppingMallSearchVO search) throws Exception;
	//쇼핑몰 필터링 처리
	public List<Integer> SPMfiter(SpmFilterVO filter) throws Exception;
	//필터링 시 쇼핑몰 리스트
	public List<ShoppingMallVO> listShoppingMallFilter (SpmFilterListVO filterList) throws Exception;
	//쇼핑몰 객체 가져오기
	public ShoppingMallVO selectedSPM(int spmEnrollNo) throws Exception;	
	//페이징 처리
	public int getListCount(ShoppingMallSearchVO search) throws Exception;
	//필터 페이징 처리
	public int getFilterListCount(SpmFilterVO filter) throws Exception;
	//입점신청 생성
	public void requestSPM(SpmRequestVO spmRequest) throws Exception;
	public void requestSPM2(SpmRequestVO spmRequest) throws Exception;
	//입점신청 편의를 위한 리스트
	public int listShoppingMallR() throws Exception;
}