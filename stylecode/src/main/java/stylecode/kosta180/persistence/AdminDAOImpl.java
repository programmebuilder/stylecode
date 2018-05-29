package stylecode.kosta180.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import stylecode.kosta180.domain.Manager_spmVO;



@Repository
public class AdminDAOImpl implements AdminDAO {

		@Inject
		private SqlSession session;
		
		private static String namespace = "stylecode.kosta180.mapper.admin";
		
		/*       ������û ������� ���θ� ����Ʈ �̱�                */
	@Override
	public List<Manager_spmVO> spmList() throws Exception {
		
		return session.selectList(namespace+".selectedSPM");
	}

	/*       ���� ��               */
	@Override
	public void spmAccept(int spmEnrollNo) throws Exception {
		session.update(namespace+".spmAccept");
		
	}

	
	/*       ������                */
	@Override
	public void deleteSpm(int spmEnrollNo) throws Exception {
		session.delete(namespace+".deleteSpm");
		
	}

	@Override
	public void deleteSpmManager(int spmEnrollNo) throws Exception {
		session.delete(namespace+".deleteSpmManager");
		
	}

}
