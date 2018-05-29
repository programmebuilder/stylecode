package stylecode.kosta180.persistence;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

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
		//EnrollNo�� �Ķ���ͷ� �޾� ���θ� ��ü�� return ���ش�.
		return session.selectOne(namespace+".selectedSPM", spmEnrollNo);
	}

	@Override
	public List<String> SpmStyle(int spmEnrollNo) throws Exception {
		//���θ��� ���� ��Ÿ��
		return session.selectList(namespace+".SpmStyle", spmEnrollNo);
	}

	@Override
	public List<ProductVO> selectedProduct(int spmEnrollNo) throws Exception {
		//���θ��� ���� ��ǰ ����Ʈ
		return session.selectList(namespace+".selectedProduct", spmEnrollNo);
	}

	
	//SpmBM �κ�
	@Override
	public void insertBm(SpmBmVO vo) throws Exception {

		session.insert(namespace +".insertBookMark", vo);
		
	}

	@Override
	public void deleteBm(Integer spmBmNo) throws Exception {
		
		session.delete(namespace+".deleteBm", spmBmNo);
	}

	//id�� ���θ��� ���� ���ã�� ���� Ȯ��
	@Override
	public int checkBm(Map<String, Object> map) throws Exception {
		
		System.out.println("DAO : " + session.selectOne(namespace+".checkBm", map));
		return session.selectOne(namespace+".checkBm", map);
	}



	
	
	
	
}