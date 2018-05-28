package stylecode.sns.persistence;

import java.util.List;

import stylecode.sns.domain.BoardVO;

public interface BoardDAO {

	// 게시물 작성
	public void create(BoardVO vo) throws Exception;
	
	// 게시물 전체 출력(최신순)
	public List<BoardVO> list() throws Exception;
	
	// 게시물 삭제
	public void delete(Integer bdno) throws Exception;
	
	// 게시물 수정
	public void update(BoardVO vo) throws Exception;
	
	// 게시물 세부 출력(게시물 수정 관련)
	public BoardVO read(Integer bdno) throws Exception;
	
}
