package stylecode.kosta180.userrecommend.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import stylecode.kosta180.domain.MemberVO;
import stylecode.kosta180.userrecommend.persistence.MemberDAOImpl;

@Service
public class MemberServiceImpl implements MemberService {
	@Inject
	MemberDAOImpl dao;

	@Override
	public List<MemberVO> getMemberService() {
		// TODO Auto-generated method stub
		return dao.getMember();
	}

}
