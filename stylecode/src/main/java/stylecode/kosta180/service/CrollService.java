package stylecode.kosta180.service;

import java.util.List;

import stylecode.kosta180.domain.CrollProductVO;
import stylecode.kosta180.domain.CrollSPMVO;

public interface CrollService {
	public void insertShopDataService(List<CrollSPMVO> crollSPMList) throws Exception;
	public void insertProductDataService(List<CrollProductVO> crollProductList) throws Exception;
}
