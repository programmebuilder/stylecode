package stylecode.kosta180.service;

import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;

import stylecode.kosta180.domain.ProductSearchVO;
import stylecode.kosta180.domain.ProductVO;

public interface ProductService {
public List<ProductVO> listAll(ProductSearchVO searchKey) throws Exception;
public List<ProductVO> listAllLow(ProductSearchVO searchKey) throws Exception;
public List<ProductVO> listAllHigh(ProductSearchVO searchKey)throws Exception;
public int productListCount(ProductSearchVO search)throws Exception;
public List<ProductVO> recommendList(List<Integer> recommend) throws Exception;
public List<ProductVO> listRandom() throws Exception;
}
