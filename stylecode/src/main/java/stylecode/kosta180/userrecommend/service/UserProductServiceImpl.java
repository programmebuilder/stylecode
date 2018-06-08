package stylecode.kosta180.userrecommend.service;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import stylecode.kosta180.product.domain.ProductSearchVO;
import stylecode.kosta180.product.domain.ProductVO;
import stylecode.kosta180.userrecommend.persistence.UserProductDAOImpl;


@Service
public class UserProductServiceImpl implements UserProductService {
	@Inject
	UserProductDAOImpl dao;


	public List<ProductVO> getPagingItemService(ProductSearchVO search) {
		
		return dao.getPagingItems(search);
	}


	@Override
	public int getItemCount(ProductSearchVO search) throws Exception {

		return dao.productListCount(search);
	}


	@Override
	public List<ProductVO> getAllItemService() {
		// TODO Auto-generated method stub
		return dao.getAllItems();
	}


	@Override
	public List<ProductVO> getRecommendService(List<Long> list) {
		// TODO Auto-generated method stub
		System.out.println("getRecommendService �Լ�");
		
		return dao.getRecommendList(list);
	}




}
