package stylecode.sns.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import stylecode.sns.domain.BoardVO;

@Repository
public class BoardDAOImpl implements BoardDAO {

	@Inject
	private SqlSession session;
	
	private static String namespace = "stylecode.sns.mapper.boardMapper";
	
	@Override
	public void create(BoardVO vo) throws Exception {
		session.insert(namespace + ".create", vo);
	}
	
	@Override
	public List<BoardVO> list() throws Exception {
		return session.selectList(namespace + ".list");
	}

	@Override
	public void delete(Integer bdno) throws Exception {
		session.delete(namespace + ".delete", bdno);
	}

	@Override
	public void update(BoardVO vo) throws Exception {
		session.update(namespace + ".update", vo);
	}

	@Override
	public BoardVO read(Integer bdno) throws Exception {
		return session.selectOne(namespace + ".read", bdno);
	}
	
}
