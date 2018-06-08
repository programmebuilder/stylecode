package stylecode.kosta180.userrecommend.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import stylecode.kosta180.userrecommend.domain.ProductRateVO;



@Repository
public class RateDAOImpl implements RateDAO {
	@Inject
	private SqlSession session;
	
	private static String namespace="recommend.item.mappers.recommendMapper";
	

	
	public List<ProductRateVO> getAllRate() {
		// TODO Auto-generated method stub
		return session.selectList(namespace+".getAllRateList");
	}



	@Override
	public List<ProductRateVO> getRate(int mCode) {
		// TODO Auto-generated method stub
		return session.selectList(namespace+".getRateList",mCode);
	}



	@Override
	public int insertRate(ProductRateVO rateVO) {
		session.insert(namespace+".insertRate",rateVO);
		return 0;
	}




}
