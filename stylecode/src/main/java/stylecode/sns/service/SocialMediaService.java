package stylecode.sns.service;

import java.util.List;

import stylecode.sns.domain.MemberVO;
import stylecode.sns.domain.SocialMediaListVO;
import stylecode.sns.domain.SocialMediaVO;

public interface SocialMediaService {

	// 게시물 작성
	public void regist(SocialMediaVO vo) throws Exception;

	// 게시물 전체 출력(최신순)
	public List<SocialMediaListVO> list() throws Exception;

	// 게시물 이미지 전체 출력
	public List<SocialMediaListVO> listAttach() throws Exception;
	
	// 게시물 페이징 처리
	public List<SocialMediaListVO> listPagination(String startPageNum, String endPageNum) throws Exception;

	// 게시물 삭제
	public void remove(Integer bdno) throws Exception;

	// 게시물 수정
	public void modify(SocialMediaVO vo) throws Exception;

	// 게시물 세부 출력(게시물 수정 관련)
	public SocialMediaVO read(Integer bdno) throws Exception;

	// 회원 정보
	public MemberVO memberInfomation(String mid) throws Exception;

}
