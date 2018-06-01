package stylecode.kosta180.persistence;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import stylecode.kosta180.domain.Criteria;
import stylecode.kosta180.domain.ProductVO;
import stylecode.kosta180.domain.ShoppingMallVO;
import stylecode.kosta180.domain.SpmBmVO;

@Repository
public class SpmDetailDAOImpl implements SpmDetailDAO {

	@Inject
	private SqlSession session;
	
	private static String namespace = "stylecode.kosta180.mapper.spmDetailMapper";

	@Override
	public ShoppingMallVO selectedSPM(int spmEnrollNo) throws Exception {
		// EnrollNo를 파라미터로 받아 쇼핑몰 객체를 return 해준다.
		return session.selectOne(namespace + ".selectedSPM", spmEnrollNo);
	}

	@Override
	public List<String> SpmStyle(int spmEnrollNo) throws Exception {
		// 쇼핑몰에 대한 스타일
		return session.selectList(namespace + ".SpmStyle", spmEnrollNo);
	}

	@Override
	public List<ProductVO> selectedProduct(int spmEnrollNo) throws Exception {
		// 쇼핑몰에 대한 상품 리스트
		return session.selectList(namespace + ".selectedProduct", spmEnrollNo, new RowBounds(1, 15));
	}

	// SpmBM 부분
	@Override
	public void insertBm(SpmBmVO vo) throws Exception {

		session.insert(namespace + ".insertBookMark", vo);

	}

	@Override
	public void deleteBm(Integer spmBmNo) throws Exception {

		session.delete(namespace + ".deleteBm", spmBmNo);
	}

	// id와 쇼핑몰에 대해 즐겨찾기 여부 확인
	@Override
	public int checkBm(Map<String, Object> map) throws Exception {

		System.out.println("DAO : " + session.selectOne(namespace + ".checkBm", map));
		return session.selectOne(namespace + ".checkBm", map);
	}
	
	@Override
	public void hitCount(int SpmEnrollNo) throws Exception { 
		//조회수 처리
		session.update(namespace+".hitCount", SpmEnrollNo);
	}

}
