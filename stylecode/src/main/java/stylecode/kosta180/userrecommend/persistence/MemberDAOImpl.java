package stylecode.kosta180.userrecommend.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import stylecode.kosta180.domain.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO {

	@Inject
	SqlSession session;
	private static String namespace = "recommend.item.mappers.recommendMapper";
	@Override
	public List<MemberVO> getMember() {
		// TODO Auto-generated method stub
		return session.selectList(namespace+".getMemberAll");
	}

}
