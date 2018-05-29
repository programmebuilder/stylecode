package stylecode.kosta180.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import stylecode.kosta180.domain.ShoppingMallSearchVO;
import stylecode.kosta180.domain.ShoppingmallVO;
import stylecode.kosta180.domain.SpmFilterListVO;
import stylecode.kosta180.domain.SpmFilterVO;
import stylecode.kosta180.persistence.ShoppingmallDAO;

@Service
public class ShoppingmallServiceImpl implements ShoppingmallService {
	@Inject
	private ShoppingmallDAO dao;

	@Override
	public List<ShoppingmallVO> listShoppingMall(ShoppingMallSearchVO search) throws Exception {
		return dao.listShoppingMall(search);
	}

	@Override
	public List<Integer> SPMfiter(SpmFilterVO filter) throws Exception {
		return dao.SPMfiter(filter);
	}

	@Override
	public List<ShoppingmallVO> listShoppingMallFilter(SpmFilterListVO filterList) throws Exception {
		return dao.listShoppingMallFilter(filterList);
	}

	@Override
	public int getListCount(ShoppingMallSearchVO search) throws Exception {
		return dao.getListCount(search);
	}

	@Override
	public int getFilterListCount(SpmFilterVO filter) throws Exception {
		return dao.getFilterListCount(filter);
	}

/*	@Override
	public ShoppingmallVO selectedSPM(int spmEnrollNo, boolean check) throws Exception {
		if (check == true) {
			dao.hitCount(spmEnrollNo);
		}
		return dao.selectedSPM(spmEnrollNo);
	}*/

}
