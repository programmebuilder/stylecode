package stylecode.kosta180.persistence;

import java.util.List;

import stylecode.kosta180.domain.CrollProductVO;
import stylecode.kosta180.domain.CrollSPMVO;

public interface CrollDAO {
	public void insertShopData(List<CrollSPMVO> crollSPMList) throws Exception;	
	public void insertProductData(List<CrollProductVO> crollProductList) throws Exception;	
}
