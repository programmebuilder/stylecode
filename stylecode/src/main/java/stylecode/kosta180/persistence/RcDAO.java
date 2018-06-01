package stylecode.kosta180.persistence;

import java.util.List;

import stylecode.kosta180.domain.CategoryVO;
import stylecode.kosta180.domain.ProductVO;

public interface RcDAO {
	public List<ProductVO> selectProductData(CategoryVO criteria) throws Exception; 
	public List<ProductVO> productList(int cgno) throws Exception;
	public int countingPaging(CategoryVO criteria) throws Exception;
}
