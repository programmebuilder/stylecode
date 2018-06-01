package stylecode.kosta180.persistence;

import java.sql.SQLSyntaxErrorException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import stylecode.kosta180.domain.ShoppingMallSearchVO;
import stylecode.kosta180.domain.ShoppingMallVO;
import stylecode.kosta180.domain.SpmFilterListVO;
import stylecode.kosta180.domain.SpmFilterVO;
import stylecode.kosta180.domain.SpmRequestVO;

@Repository
public class ShoppingmallDAOImpl implements ShoppingmallDAO {
	
	@Inject
	private SqlSession session;
	
	private static String namespace="stylecode.kosta180.mapper.shoppingmallMapper";

	@Override
	public List<ShoppingMallVO> listShoppingMall(ShoppingMallSearchVO search) throws Exception { 
		// 처음/검색 시 리스트
		return session.selectList(namespace+".listShoppingMall", search, new RowBounds(search.getPageStart(), 10));
	}

	@Override
	public List<Integer> SPMfiter(SpmFilterVO filter) throws Exception {
		//쇼핑몰 필터링 처리
		return session.selectList(namespace+".spmFilter", filter, new RowBounds(filter.getPageStart(), filter.getPerPageNum()));
	}

	@Override
	public List<ShoppingMallVO> listShoppingMallFilter(SpmFilterListVO filterList) throws Exception {
		//필터 사용 시 출력 메소드
		return session.selectList(namespace+".listShoppingMallFilter", filterList);
	}

	@Override
	public ShoppingMallVO selectedSPM(int spmEnrollNo) throws Exception {
		// 쇼핑몰 한 개 클릭 시 처리
		return session.selectOne(namespace+".selectedSPM", spmEnrollNo);
	}

	@Override
	public int getListCount(ShoppingMallSearchVO search) throws Exception {
		//페이징 처리
		return session.selectOne(namespace+".getListCount", search);
	}

	@Override
	public int getFilterListCount(SpmFilterVO filter) throws Exception {
		//필터 페이징 처리
		return session.selectOne(namespace+".getFilterListCount", filter);
	}

	@Override
	public void requestSPM(SpmRequestVO spmRequest) throws Exception {
		//입점신청 생성
		session.insert(namespace+".requestSPM", spmRequest);
	}	

	@Override
	public void requestSPM2(SpmRequestVO spmRequest) throws Exception {
		// 입점신청 생성
		session.insert(namespace+".requestSPM2", spmRequest);
	}

	@Override
	public int listShoppingMallR() throws Exception {
		//입점신청 편의를 위한 리스트
		return session.selectOne(namespace+".listShoppingMallR");
	}
}
