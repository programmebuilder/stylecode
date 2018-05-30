package stylecode.kosta180.service;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.impl.recommender.GenericItemBasedRecommender;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.similarity.ItemSimilarity;
import org.springframework.stereotype.Service;
import org.apache.mahout.cf.taste.impl.similarity.LogLikelihoodSimilarity;
import stylecode.kosta180.domain.ProductVO;
import stylecode.kosta180.persistence.ProductDAO;

@Service
public class ProductServiceImpl implements ProductService {
	@Inject
	private ProductDAO productDao;

	@Override
	public List<ProductVO> listAll() throws Exception {

		return productDao.productlist();
	}

	@Override
	public List<ProductVO> listAllLow() throws Exception {

		return productDao.productlistLow();
	}

	@Override
	public List<ProductVO> listAllHigh() throws Exception {

		return productDao.productlistHigh();
	}

	@Override
	public List<ProductVO> recommendList(List<Integer> recommend) throws Exception {

		return productDao.recommendList(recommend);
	}

}
