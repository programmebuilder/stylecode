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
import java.util.Random;

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
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import stylecode.kosta180.domain.MemberVO;
import stylecode.kosta180.domain.ProductPageMaker;
import stylecode.kosta180.domain.ProductSearchVO;
import stylecode.kosta180.domain.ProductVO;
import stylecode.kosta180.service.ProductService;

@Controller
public class ProductListController {

	@Inject
	private ProductService service;

	@RequestMapping(value = "/productlist", method = RequestMethod.GET)
	public String productlist(Model model, @ModelAttribute("searchKey") ProductSearchVO searchKey) throws Exception {
		ProductPageMaker pageMaker = new ProductPageMaker();

		model.addAttribute("list", service.listAll(searchKey));
		model.addAttribute("recommendList", service.listRandom());
		pageMaker.setCri(searchKey);
		pageMaker.setTotalCount(service.productListCount(searchKey));
		model.addAttribute("pageMaker", pageMaker);
		return "product/productlist";
	}

	@RequestMapping(value = "/productlistLow", method = RequestMethod.GET)
	public String productlistLow(Model model, @ModelAttribute("searchKey") ProductSearchVO searchKey) throws Exception {
		ProductPageMaker pageMaker = new ProductPageMaker();
		pageMaker.setCri(searchKey);
		pageMaker.setTotalCount(service.productListCount(searchKey));
		model.addAttribute("pageMaker", pageMaker);
		model.addAttribute("list", service.listAllLow(searchKey));
		model.addAttribute("recommendList", service.listRandom());
		System.out.println("�������ݼ�");
		return "product/productlist";
	}

	@RequestMapping(value = "/productlistHigh", method = RequestMethod.GET)
	public String productlistHigh(Model model, @ModelAttribute("searchKey") ProductSearchVO searchKey)
			throws Exception {
		ProductPageMaker pageMaker = new ProductPageMaker();
		pageMaker.setCri(searchKey);
		pageMaker.setTotalCount(service.productListCount(searchKey));
		model.addAttribute("pageMaker", pageMaker);
		model.addAttribute("recommendList", service.listRandom());
		model.addAttribute("list", service.listAllHigh(searchKey));
		System.out.println("�������ݼ�");
		return "product/productlist";
	}

	@RequestMapping(value = "/recommendCheakBox")
	public String testitems(@RequestParam(name = "chk") ArrayList<Integer> penrollno, Model model) throws Exception {
		try {
			DataModel dm = new FileDataModel(new File("C:\\data\\itemcsv.csv"));
			TanimotoCoefficientSimilarity sim = new TanimotoCoefficientSimilarity(dm);
			GenericItemBasedRecommender recommender = new GenericItemBasedRecommender(dm, sim);
			List<Integer> recommendList = new ArrayList<Integer>();
			ProductPageMaker pageMaker = new ProductPageMaker();

			for (int i = 0; i < penrollno.size(); i++) {
				List<RecommendedItem> recommendations = recommender.mostSimilarItems(penrollno.get(i), 5);
				for (RecommendedItem recommendation : recommendations) {
					System.out.println(
							penrollno.get(i) + "," + recommendation.getItemID() + "," + recommendation.getValue());
					recommendList.add((int) recommendation.getItemID());
				}

			}
			for (int i = 0; i < recommendList.size(); i++) {
				System.out.println("��õ��ǰ�̵����� Ȯ���ϱ�" + recommendList.get(i));
				System.out.println(recommendList.size() + "����:" + i);
			}

			// üũ�ڽ��� Ŭ���� ��ǰ�� ���� ��ǰ penrollNo�� ���ؼ� ������
			model.addAttribute("list", service.recommendList(recommendList));
			// productlist.jsp �� �ִ� ���â�� �������λѷ��ֱ����� �Լ�
			model.addAttribute("recommendList", service.listRandom());

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