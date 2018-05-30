package stylecode.kosta180.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import stylecode.kosta180.domain.CrollProductVO;
import stylecode.kosta180.domain.CrollSPMVO;

@Repository
public class CrollDAOImpl implements CrollDAO{

	@Inject
	SqlSession sqlSession;
	
	private static final String namespace = "stylecode.kosta180.mapper.CrollMapper";
	
	@Override
	public void insertShopData(List<CrollSPMVO> crollSPMList) throws Exception {
		sqlSession.insert(namespace+".insertShopData", crollSPMList);
	}

	@Override
	public void insertProductData(List<CrollProductVO> crollProductList) throws Exception {
		sqlSession.insert(namespace+".insertProductData", crollProductList);
	}

}