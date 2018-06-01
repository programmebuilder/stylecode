package stylecode.kosta180.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import stylecode.kosta180.domain.ShoppingMallVO;

@Repository
public class BookMarkDAOImpl implements BookMarkDAO {
	@Inject
	private SqlSession session;
	
	private static String namespace="stylecode.kosta180.mapper.spmDetailMapper";
	@Override
	public List<ShoppingMallVO> detailBookMark(String mId) {
		// TODO Auto-generated method stub
		System.out.println("bookmark DAO Ȯ��");
		if(mId==null){
			System.out.println("mId is null");
		}
		System.out.println(mId);
		return session.selectList(namespace+".detailBookMark",mId);
	}

	@Override
	public int deleteBookMark(int spmEnrollNo) {
		// TODO Auto-generated method stub
		return session.delete(namespace+".deleteBookMark",spmEnrollNo);
	}

}