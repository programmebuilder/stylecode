package stylecode.kosta180.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import stylecode.kosta180.domain.MemberVO;
@Repository
public class SignUpDAOImpl implements SignUpDAO {

	@Inject
	private SqlSession session;
	public static String namespace = "stylecode.kosta180.mappers.SignMapper";
	@Override
	public String insertMember(MemberVO memberVo) {
		session.insert(namespace+".insertMember");
		return null;
	}

}
