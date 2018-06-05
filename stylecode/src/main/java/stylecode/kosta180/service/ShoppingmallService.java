package stylecode.kosta180.service;

import java.util.List;

import stylecode.kosta180.domain.ShoppingMallSearchVO;
import stylecode.kosta180.domain.ShoppingMallVO;
import stylecode.kosta180.domain.SpmFilterListVO;
import stylecode.kosta180.domain.SpmFilterVO;
import stylecode.kosta180.domain.SpmRequestVO;

public interface ShoppingmallService {
	public List<ShoppingMallVO> listShoppingMall(ShoppingMallSearchVO search) throws Exception;
	public List<Integer> SPMfiter(SpmFilterVO filter) throws Exception;
	public List<ShoppingMallVO> listShoppingMallFilter (SpmFilterListVO filterList) throws Exception;
	public int getListCount(ShoppingMallSearchVO search) throws Exception;
	public int getFilterListCount(SpmFilterVO filter) throws Exception;
	public void requestSPM(SpmRequestVO spmRequest) throws Exception;
	public void requestSPM2(SpmRequestVO spmRequest) throws Exception;
	public int listShoppingMallR() throws Exception;
}
