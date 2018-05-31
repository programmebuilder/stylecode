package stylecode.kosta180.persistence;

import java.util.HashMap;
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
		
		/*       입점신청 대기중인 쇼핑몰 리스트 뽑기                */
	@Override
	public List<Manager_spmVO> spmList() throws Exception {
		
		return session.selectList(namespace+".selectedSPM");
	}

	/*       승인 시               */
	@Override
	public void spmAccept(HashMap spmEnrollNo) throws Exception {
		
		System.out.println(spmEnrollNo);
		session.update(namespace+".spmAccept",spmEnrollNo);
		
	}

	
	/*       거절 시                */
	@Override
	public void deleteSpm(int spmEnrollNo) throws Exception {
		session.delete(namespace+".deleteSpm");
		
	}

	@Override
	public void deleteSpmManager(int spmEnrollNo) throws Exception {
		session.delete(namespace+".deleteSpmManager");
		
	}

	
	//메일 주소 받아오기
	@Override
	public List<String> emailAdd(HashMap spmEnrollNo) throws Exception {
		
		return session.selectList(namespace+".ㄸ");
	}

}
