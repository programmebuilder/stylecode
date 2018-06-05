package stylecode.kosta180.persistence;

import java.util.List;

import stylecode.kosta180.domain.ShoppingMallVO;

public interface BookMarkDAO {
	public List<ShoppingMallVO> detailBookMark(String mId);
	
	public int deleteBookMark(int spmEnrollNo);

}
