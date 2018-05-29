package stylecode.kosta180.service;

import java.util.List;

import stylecode.kosta180.domain.ShoppingMallSearchVO;
import stylecode.kosta180.domain.ShoppingmallVO;
import stylecode.kosta180.domain.SpmFilterListVO;
import stylecode.kosta180.domain.SpmFilterVO;

public interface ShoppingmallService {
	public List<ShoppingmallVO> listShoppingMall(ShoppingMallSearchVO search) throws Exception;
	public List<Integer> SPMfiter(SpmFilterVO filter) throws Exception;
	public List<ShoppingmallVO> listShoppingMallFilter (SpmFilterListVO filterList) throws Exception;
	public int getListCount(ShoppingMallSearchVO search) throws Exception;
	public int getFilterListCount(SpmFilterVO filter) throws Exception;
/*	public ShoppingmallVO selectedSPM(int spmEnrollNo, boolean check) throws Exception;*/
}