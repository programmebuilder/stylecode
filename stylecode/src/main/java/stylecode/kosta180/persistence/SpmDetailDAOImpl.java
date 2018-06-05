package stylecode.kosta180.persistence;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import stylecode.kosta180.domain.Criteria;
import stylecode.kosta180.product.domain.ProductVO;
import stylecode.kosta180.domain.ShoppingMallVO;
import stylecode.kosta180.domain.SpmBmVO;

@Repository
public class SpmDetailDAOImpl implements SpmDetailDAO {

	@Inject
	private SqlSession session;
	
	private static String namespace = "stylecode.kosta180.mapper.spmDetailMapper";

	@Override
	public ShoppingMallVO selectedSPM(int spmEnrollNo) throws Exception {
		// EnrollNo瑜� �뙆�씪誘명꽣濡� 諛쏆븘 �눥�븨紐� 媛앹껜瑜� return �빐以��떎.
		return session.selectOne(namespace + ".selectedSPM", spmEnrollNo);
	}

	@Override
	public List<String> SpmStyle(int spmEnrollNo) throws Exception {
		// �눥�븨紐곗뿉 ���븳 �뒪���씪
		return session.selectList(namespace + ".SpmStyle", spmEnrollNo);
	}

	@Override
	public List<ProductVO> selectedProduct(int spmEnrollNo) throws Exception {
		// �눥�븨紐곗뿉 ���븳 �긽�뭹 由ъ뒪�듃
		return session.selectList(namespace + ".selectedProduct", spmEnrollNo, new RowBounds(1, 15));
	}

	// SpmBM 遺�遺�
	@Override
	public void insertBm(SpmBmVO vo) throws Exception {

		session.insert(namespace + ".insertBookMark", vo);

	}

	@Override
	public void deleteBm(Integer spmBmNo) throws Exception {

		session.delete(namespace + ".deleteBm", spmBmNo);
	}

	// id�� �눥�븨紐곗뿉 ���빐 利먭꺼李얘린 �뿬遺� �솗�씤
	@Override
	public int checkBm(Map<String, Object> map) throws Exception {

		System.out.println("DAO : " + session.selectOne(namespace + ".checkBm", map));
		return session.selectOne(namespace + ".checkBm", map);
	}
	
	@Override
	public void hitCount(int SpmEnrollNo) throws Exception { 
		//議고쉶�닔 泥섎━
		session.update(namespace+".hitCount", SpmEnrollNo);
	}

}
