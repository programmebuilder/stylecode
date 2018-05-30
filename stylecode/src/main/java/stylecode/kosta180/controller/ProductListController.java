package stylecode.kosta180.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.impl.common.LongPrimitiveArrayIterator;
import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.impl.neighborhood.NearestNUserNeighborhood;
import org.apache.mahout.cf.taste.impl.recommender.GenericItemBasedRecommender;
import org.apache.mahout.cf.taste.impl.recommender.GenericUserBasedRecommender;
import org.apache.mahout.cf.taste.impl.similarity.TanimotoCoefficientSimilarity;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.neighborhood.UserNeighborhood;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.similarity.UserSimilarity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import stylecode.kosta180.domain.MemberVO;
import stylecode.kosta180.service.ProductService;

@Controller
public class ProductListController {
	/*
	 * private static final Logger logger =
	 * LoggerFactory.getLogger(SecurityController.class);
	 */
	@Inject
	private ProductService service;

	@RequestMapping(value = "/productlist", method = RequestMethod.GET)
	public String productlist(Model model) throws Exception {
		model.addAttribute("list", service.listAll());
		return "product/productlist";
	}

	@RequestMapping(value = "/productlistLow", method = RequestMethod.GET)
	public String productlistLow(Model model) throws Exception {
		model.addAttribute("list", service.listAllLow());

		return "product/productlist";
	}

	@RequestMapping(value = "/productlistHigh", method = RequestMethod.GET)
	public String productlistHigh(Model model) throws Exception {
		model.addAttribute("list", service.listAllHigh());
		return "product/productlist";
	}



	@RequestMapping(value = "/recommendCheakBox")
	public String testitems(@RequestParam(name = "chk") ArrayList<Integer> penrollno,Model model) throws Exception {
		try {
			DataModel dm = new FileDataModel(new File("C:\\data\\rate.csv"));
			TanimotoCoefficientSimilarity sim = new TanimotoCoefficientSimilarity(dm);
			GenericItemBasedRecommender recommender = new GenericItemBasedRecommender(dm, sim);
			List<Integer> recommendList = new ArrayList<Integer>();
			HashMap<Integer, Object> recommendMap= new HashMap<Integer,Object>();
			// 체크스를 4개를 선택하게 한다음 4개를 mostSimailarItems에 넣어야겠다.
			// 넘어온 값을 각각 int값으로 넘긴다음에 그것에 맞춰 if문을 써줌 체크박스가 1일떈 if==변수 한개 써주고
			// 이렇게해야겠다
			// for (LongPrimitiveArrayIterator items =
			// (LongPrimitiveArrayIterator) dm.getItemIDs(); items.hasNext();) {
			// long itemId = items.nextLong();

			for (int i = 0; i < penrollno.size(); i++) {
				List<RecommendedItem> recommendations = recommender.mostSimilarItems(penrollno.get(i), 10);
				for (RecommendedItem recommendation : recommendations) {
					System.out.println(
							penrollno.get(i) + "," + recommendation.getItemID() + "," + recommendation.getValue());
					recommendList.add((int)recommendation.getItemID());
				}

			}
			for (int i = 0; i < recommendList.size(); i++) {
				System.out.println("추천상품이들어갓는지 확인하기" + recommendList.get(i));
				System.out.println(recommendList.size() + "갯수:" + i);
			}
			
			model.addAttribute("list",service.recommendList(recommendList));
		}

		catch (IOException e) {
			System.out.println("error");
		} catch (TasteException e) {
			System.out.println("error2");
			e.printStackTrace();
		}

			return "product/productlist";
	}

}