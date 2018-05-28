package stylecode.sns.service;

import java.util.List;

import stylecode.sns.domain.BoardVO;

public interface BoardService {

	// 게시물 작성
	public void regist(BoardVO vo) throws Exception;
	
	// 게시물 전체 출력(최신순)
	public List<BoardVO> list() throws Exception;
	
	// 게시물 삭제
	public void remove(Integer bdno) throws Exception;
	
	// 게시물 수정
	public void modify(BoardVO vo) throws Exception;
	
	// 게시물 세부 출력(게시물 수정 관련)
	public BoardVO read(Integer bdno) throws Exception;
	
}
