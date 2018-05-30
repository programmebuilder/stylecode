package stylecode.kosta180.persistence;

import java.util.List;
import java.util.Map;

import stylecode.kosta180.domain.ProductVO;
import stylecode.kosta180.domain.ShoppingMallSearchVO;
import stylecode.kosta180.domain.ShoppingmallVO;
import stylecode.kosta180.domain.SpmFilterVO;
import stylecode.kosta180.domain.SpmFilterListVO;

public interface ShoppingmallDAO {
	public List<ShoppingmallVO> listShoppingMall(ShoppingMallSearchVO search) throws Exception;

	public List<Integer> SPMfiter(SpmFilterVO filter) throws Exception;
	
	public List<ShoppingmallVO> listShoppingMallFilter (SpmFilterListVO filterList) throws Exception;
	// 조회수
	public void hitCount(int SpmEnrollNo) throws Exception;
	//쇼핑몰 객체 가져오기
	public ShoppingmallVO selectedSPM(int spmEnrollNo) throws Exception;	
	//페이징 처리
	public int getListCount(ShoppingMallSearchVO search) throws Exception;
	public int getFilterListCount(SpmFilterVO filter) throws Exception;
	/*//쇼핑몰에 대한 상품
	public List<ProductVO> selectedProduct(int SpmEnrollNo) throws Exception;	
	//쇼핑몰에 대한 스타일	
	public List<String> SpmStyle(int SpmEnrollNo) throws Exception;	
	//쇼핑몰 즐겨찾기에 추가하기
	public int addSpmBm(BookMark bookMark) throws Exception;
	//즐겨찾기기본키 번호
	public int selectspmBmNo() throws Exception;	
	//즐찾여부 확인
	public List<Integer> checkBM(Map<String, Object> map) throws Exception;
	//즐겨찾기 삭제
	public int deleteBm(Map<String, Object> map) throws Exception;*/
}
