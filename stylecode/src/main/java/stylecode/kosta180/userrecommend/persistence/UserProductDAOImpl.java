package stylecode.kosta180.userrecommend.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import stylecode.kosta180.product.domain.ProductSearchVO;
import stylecode.kosta180.product.domain.ProductVO;



@Repository
public class UserProductDAOImpl implements UserProductDAO {
	@Inject
	private SqlSession session;
	
	private static String namespace="recommend.item.mappers.recommendMapper";

	@Override
	public List<ProductVO> getPagingItems(ProductSearchVO search) {
		// TODO Auto-generated method stub
		
		return session.selectList(namespace+".getAllItems",search, new RowBounds(search.getPageStart(), search.getPerPageNum()));
	}

	@Override
	public int productListCount(ProductSearchVO search) throws Exception {

		return session.selectOne(namespace+".productListCount",search);
	}

	@Override
	public List<ProductVO> getAllItems() {
		// TODO Auto-generated method stub
		return session.selectList(namespace+".getAllItems");
	}

	@Override
	public List<ProductVO> getRecommendList(List<Long> itemList) {
		// TODO Auto-generated method stub
		System.out.println("DAO getRecommendList �Լ�");
		System.out.println(itemList);
		return session.selectList(namespace+".getRecommendList", itemList);
	}

}