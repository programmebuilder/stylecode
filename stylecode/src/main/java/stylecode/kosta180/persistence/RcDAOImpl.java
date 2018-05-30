package stylecode.kosta180.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import stylecode.kosta180.domain.ProductVO;

@Repository
public class RcDAOImpl implements RcDAO {
	
	private static final String namespace = "stylecode.kosta180.mapper.RcMapper";
	
	@Inject
	SqlSession sqlSession;
	
	@Override
	public List<ProductVO> selectProductData() throws Exception {
		List<ProductVO> productVO = sqlSession.selectList(namespace+".selectProductData");
		return productVO;
	}

	@Override
	public List<ProductVO> productList(int cgno) throws Exception {
		List<ProductVO> productVO = sqlSession.selectList(namespace+".productList", cgno);
		return productVO;
	}

}
