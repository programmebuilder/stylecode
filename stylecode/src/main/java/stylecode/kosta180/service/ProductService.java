package stylecode.kosta180.service;

import java.util.List;

import stylecode.kosta180.domain.ProductVO;

public interface ProductService {
public List<ProductVO> listAll() throws Exception;
public List<ProductVO> listAllLow() throws Exception;
public List<ProductVO> listAllHigh()throws Exception;

}