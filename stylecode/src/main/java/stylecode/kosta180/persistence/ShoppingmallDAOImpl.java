package stylecode.kosta180.persistence;

import java.sql.SQLSyntaxErrorException;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import stylecode.kosta180.domain.ShoppingMallSearchVO;
import stylecode.kosta180.domain.ShoppingmallVO;
import stylecode.kosta180.domain.SpmFilterListVO;
import stylecode.kosta180.domain.SpmFilterVO;

@Repository
public class ShoppingmallDAOImpl implements ShoppingmallDAO {
	
	@Inject
	private SqlSession session;
	
	private static String namespace="stylecode.kosta180.mapper.shoppingmallMapper";

	@Override
	public List<ShoppingmallVO> listShoppingMall(ShoppingMallSearchVO search) throws Exception { 
		// 처음/검색 시 리스트
		return session.selectList(namespace+".listShoppingMall", search, new RowBounds(search.getPageStart(), search.getPerPageNum()));
	}

	@Override
	public List<Integer> SPMfiter(SpmFilterVO filter) throws Exception {
		return session.selectList(namespace+".spmFilter", filter, new RowBounds(filter.getPageStart(), filter.getPerPageNum()));
	}

	@Override
	public List<ShoppingmallVO> listShoppingMallFilter(SpmFilterListVO filterList) throws Exception {
		//필터 사용 시 출력 메소드
		return session.selectList(namespace+".listShoppingMallFilter", filterList);
	}
	
	@Override
	public void hitCount(int SpmEnrollNo) throws Exception { 
		//조회수 처리
		session.update(namespace+".hitCount", SpmEnrollNo);
	}

	@Override
	public ShoppingmallVO selectedSPM(int spmEnrollNo) throws Exception {
		// 쇼핑몰 한 개 클릭 시 처리
		return session.selectOne(namespace+".selectedSPM", spmEnrollNo);
	}
	/*
	@Override
	public List<String> SpmStyle(int SpmEnrollNo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
*/
	@Override
	public int getListCount(ShoppingMallSearchVO search) throws Exception {
		return session.selectOne(namespace+".getListCount", search);
	}

	@Override
	public int getFilterListCount(SpmFilterVO filter) throws Exception {
		return session.selectOne(namespace+".getFilterListCount", filter);
	}
}
