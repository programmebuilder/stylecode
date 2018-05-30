package stylecode.kosta180.persistence;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import stylecode.kosta180.domain.ProductVO;

@Repository
public class ProductDAOImpl implements ProductDAO {
	
	@Inject
	private SqlSession session;
	
	public static String namespace = "stylecode.kosta180.mappers.productMapper";

	@Override
	public List<ProductVO> productlist() throws Exception {

		return session.selectList(namespace + ".productlist");
	}

	@Override
	public List<ProductVO> productlistLow() throws Exception {
		
		return session.selectList(namespace+".productlistLow");
	}

	@Override
	public List<ProductVO> productlistHigh() throws Exception {

		return session.selectList(namespace+".productlistHigh");
	}



	@Override
	public List<ProductVO> recommendList(List<Integer> recommendList) {
		
		return session.selectList(namespace+".recommendList",recommendList);
	}

}
