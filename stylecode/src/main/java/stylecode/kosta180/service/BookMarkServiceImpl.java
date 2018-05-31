package stylecode.kosta180.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import stylecode.kosta180.domain.ShoppingMallVO;
import stylecode.kosta180.persistence.BookMarkDAOImpl;


@Service
public class BookMarkServiceImpl implements BookMarkService {
	@Inject
	private BookMarkDAOImpl dao;
	@Override
	public List<ShoppingMallVO> bookMarkList(String mId) {
		// TODO Auto-generated method stub
		System.out.println("bookmark Service »Æ¿Œ");
		return dao.detailBookMark(mId);
	}

	@Override
	public void deleteBookMark(int spmEnrollNo) {
		// TODO Auto-generated method stub
		dao.deleteBookMark(spmEnrollNo);
	}

}
