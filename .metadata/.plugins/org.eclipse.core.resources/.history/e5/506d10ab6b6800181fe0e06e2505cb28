package stylecode.kosta180.persistence;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import stylecode.kosta180.domain.ProductSearchVO;
import stylecode.kosta180.domain.ProductVO;

@Repository
public class ProductDAOImpl implements ProductDAO {
	
	@Inject
	private SqlSession session;
	
	public static String namespace = "stylecode.kosta180.mappers.productMapper";

	@Override
	public List<ProductVO> productlist(ProductSearchVO searchKey) throws Exception {

		return session.selectList(namespace + ".productlist",searchKey, new RowBounds(searchKey.getPageStart(), searchKey.getPerPageNum()));
	}

	@Override
	public List<ProductVO> productlistLow(ProductSearchVO searchKey) throws Exception {
		
		return session.selectList(namespace+".productlistLow",searchKey, new RowBounds(searchKey.getPageStart(), searchKey.getPerPageNum()));
	}

	@Override
	public List<ProductVO> productlistHigh(ProductSearchVO searchKey) throws Exception {

		return session.selectList(namespace+".productlistHigh",searchKey, new RowBounds(searchKey.getPageStart(), searchKey.getPerPageNum()));
	}



	@Override
	public List<ProductVO> recommendList(List<Integer> recommendList) {
		
		return session.selectList(namespace+".recommendList",recommendList);
	}

	@Override
	public int productListCount(ProductSearchVO search) throws Exception {
		
		return session.selectOne(namespace+".productListCount",search);
	}

	@Override
	public List<ProductVO> recommendRandom() throws Exception {

		return session.selectList(namespace+".recommendRandom");
	}

}
