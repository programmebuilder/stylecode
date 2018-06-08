package stylecode.kosta180.userrecommend.controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.impl.common.LongPrimitiveArrayIterator;
import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.impl.neighborhood.NearestNUserNeighborhood;
import org.apache.mahout.cf.taste.impl.neighborhood.ThresholdUserNeighborhood;
import org.apache.mahout.cf.taste.impl.recommender.GenericItemBasedRecommender;
import org.apache.mahout.cf.taste.impl.recommender.GenericUserBasedRecommender;
import org.apache.mahout.cf.taste.impl.similarity.PearsonCorrelationSimilarity;
import org.apache.mahout.cf.taste.impl.similarity.TanimotoCoefficientSimilarity;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.neighborhood.UserNeighborhood;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.Recommender;
import org.apache.mahout.cf.taste.similarity.UserSimilarity;
import org.aspectj.weaver.NewConstructorTypeMunger;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import stylecode.kosta180.domain.MemberVO;
import stylecode.kosta180.product.domain.ProductPageMaker;
import stylecode.kosta180.product.domain.ProductSearchVO;
import stylecode.kosta180.product.domain.ProductVO;
import stylecode.kosta180.product.service.ProductService;
import stylecode.kosta180.product.service.ProductServiceImpl;
import stylecode.kosta180.userrecommend.domain.ProductRateVO;
import stylecode.kosta180.userrecommend.service.MemberServiceImpl;
import stylecode.kosta180.userrecommend.service.RateServiceImpl;
import stylecode.kosta180.userrecommend.service.UserProductServiceImpl;

@Controller
public class RecommendedController {
	@Inject
	RateServiceImpl service;
	@Inject
	UserProductServiceImpl p_service;
	@Inject
	MemberServiceImpl m_service;
	@Inject
	ProductRateVO rateVO;
	@Inject
	ProductVO productVO;
	@Inject
	ProductService productservice;

	// HttpServletRequest request = new Http ;
	//
	// HttpSession session = request.getSession();
	// Model model;

	List<ProductRateVO> r_list = new ArrayList<ProductRateVO>();

	
	Date date = new Date();

	// 상품검색 페이지
	@RequestMapping(value = "/recommend", method = RequestMethod.GET)
	public String create_CSV_GET(Model model, @ModelAttribute("searchKey") ProductSearchVO searchKey,
			HttpServletRequest request) throws Exception {
		// 세션저장
		HttpSession session = request.getSession(true);
		User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		session.setAttribute("mId", user.getUsername());
		String mId=(String)session.getAttribute("mId");
		System.out.println("recommend시작");
		System.out.println("세션:" + session.getAttribute("mId"));
		// ProductRateVO rate;
		long mCode = 0;
		List<ProductRateVO> rateList = service.getAllRateService();
		List<ProductVO> a_list = p_service.getAllItemService();
		List<ProductVO> list = p_service.getPagingItemService(searchKey);
		List<MemberVO> mList = m_service.getMemberService();
		System.out.println("서비스 담기끝 ");
		for (int k = 0; k < mList.size(); k++) {
			if (mList.get(k).getmId().equals(mId)) {
				mCode = mList.get(k).getmCode();
				System.out.println(mCode);
			}
		}

		Random random = new Random();
		int rand = random.nextInt(5000);
		int rand2 = rand + 5;

		model.addAttribute("list", list);
		model.addAttribute("rateList", rateList);
		model.addAttribute("a_list", a_list);
		// System.out.println("list:"+list);
		// System.out.println("rateList:"+rateList);

		model.addAttribute("mCode", mCode);
		System.out.println("***mCode : " + mCode);
		model.addAttribute("rand", rand);
		model.addAttribute("rand2", rand2);
		System.out.println("random : " + rand);
		ProductPageMaker pageMaker = new ProductPageMaker();
		pageMaker.setCri(searchKey);
		pageMaker.setTotalCount(p_service.getItemCount(searchKey));
		model.addAttribute("pageMaker", pageMaker);

		return "product/productlist";
	}

	// 별점 주기 (DB)
	// @RequestMapping(value = "/rate", method = RequestMethod.GET)
	// public String recommend(@RequestParam(value = "mCode") int mCode,
	// @RequestParam(value = "pEnrollNo") int pEnrollNo,
	// @RequestParam(value = "rate") int paramRate, Model model,
	// RedirectAttributes attr) throws Exception {
	//
	// System.out.println("컨트롤러 : " + "mCode=" + mCode + " : " + "pEnrollNo=" +
	// pEnrollNo + " : " + "rate=" + paramRate);
	//
	// rateVO.setmCode(mCode);
	// rateVO.setpEnrollNo(pEnrollNo);
	// rateVO.setpRate(paramRate);
	// rateVO.setpRgDate(date);
	//
	// service.insertRateService(rateVO);
	//
	// List<ProductRateVO> list = service.getAllRateService(); //
	//
	// BufferedWriter bw = new BufferedWriter(new
	// FileWriter("C:\\data\\rate_recommend.csv"));
	// BufferedWriter bw2 = new BufferedWriter(new
	// FileWriter("C:\\data\\item.csv"));
	//
	// int i = 0;
	// int j = 0;
	//
	// // 평점테이블의 csv
	// while (i < list.size()) {
	// rateVO = list.get(i);
	// bw.write(rateVO.getmCode() + "," + rateVO.getpEnrollNo() + "," +
	// rateVO.getpRate() + "\n");
	// // System.out.println("rateVO : "+rateVO.toString());
	// i++;
	// }
	//
	// while (j < list.size()) {
	// rateVO = list.get(j);
	// bw2.write(rateVO.getmCode() + "," + rateVO.getpEnrollNo() + "\n");
	// j++;
	//
	// }
	//
	// bw.close();
	// bw2.close();
	// attr.addAttribute("mCode", mCode);
	// return "redirect:/user";
	// }

	@RequestMapping(value = "/rate", method = RequestMethod.POST)
	public void recommend(int mCode, int pEnrollNo, int paramRate, HttpServletResponse response) throws Exception {

		System.out
				.println("컨트롤러 : " + "mCode=" + mCode + " : " + "pEnrollNo=" + pEnrollNo + " : " + "rate=" + paramRate);

		rateVO.setmCode(mCode);
		rateVO.setpEnrollNo(pEnrollNo);
		rateVO.setpRate(paramRate);
		rateVO.setpRgDate(date);

		int re = -1;
		re = service.insertRateService(rateVO);

		List<ProductRateVO> list = service.getAllRateService(); //

		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\data\\rate_recommend.csv"));
		BufferedWriter bw2 = new BufferedWriter(new FileWriter("C:\\data\\item.csv"));

		int i = 0;
		int j = 0;

		// 평점테이블의 csv
		while (i < list.size()) {
			rateVO = list.get(i);
			bw.write(rateVO.getmCode() + "," + rateVO.getpEnrollNo() + "," + rateVO.getpRate() + "\n");
			// System.out.println("rateVO : "+rateVO.toString());
			i++;
		}

		while (j < list.size()) {
			rateVO = list.get(j);
			bw2.write(rateVO.getmCode() + "," + rateVO.getpEnrollNo() + "\n");
			j++;

		}

		bw.close();
		bw2.close();

		response.getWriter().write(re);

	}

	// 사용자 기반 추천
	@RequestMapping(value = "/user")
	public String UserSimilarity_GET(Model model, @RequestParam(value = "mCode") long mCode) throws Exception {
		System.out.println("*****상품추천시작*****");

		System.out.println(mCode);
		// Long r_mCode = Long.parseLong(String.valueOf(mCode2)) ;

		// 사용자 아이디
		// Long r_mCode = Long.parseLong(String.valueOf(mCode));
		List<Long> itemList = new ArrayList<Long>();

		List<ProductVO> pList = p_service.getAllItemService();

		Random random = new Random();
		int rand = random.nextInt(5000);
		int rand2 = rand + 5;

		int i = 0;
		int j = 0;
		int k = 0;

		try {
			// 데이터 모델 생성
			DataModel dm = new FileDataModel(new File("C:\\data\\rate_recommend.csv"));
			System.out.println("**DataModel : " + dm.toString());

			// 유사도 모델 선택
			UserSimilarity sim = new PearsonCorrelationSimilarity(dm);
			System.out.println("**userSimilarity : " + sim.userSimilarity(4, 5));
			System.out.println("**userSimilarity : " + sim.userSimilarity(4, 6));
			System.out.println("**Similarity Model = " + sim.toString());

			UserNeighborhood neighbor;

			// neighbor= new NearestNUserNeighborhood(3, sim, dm);
			neighbor = new ThresholdUserNeighborhood(0.1, sim, dm);

			System.out.println("****neighbor : " + neighbor.toString());
			System.out.println("GetUserNeighborhood : " + neighbor.getUserNeighborhood(mCode).toString());

			// 추천기 선택 : UserBased
			Recommender recommender = new GenericUserBasedRecommender(dm, neighbor, sim);
			System.out.println("recommender : " + recommender.toString());
			System.out.println("**estimatePreference : " + recommender.estimatePreference(4, 884));

			List<RecommendedItem> recommendations = recommender.recommend(mCode, 16);

			System.out.println("mCode : " + mCode);
			System.out.println("추천데이터 : " + recommendations);

			for (RecommendedItem recommendation : recommendations) {
				System.out.println("***추천 아이템 : " + recommendation.getItemID() + " : " + recommendation.getValue());
				itemList.add(i, recommendation.getItemID());
				i++;
			}

			System.out.println("***itemList : " + itemList.toString());

			List<ProductVO> list = p_service.getRecommendService(itemList);

			model.addAttribute("mCode", mCode);
			model.addAttribute("list", list);
			model.addAttribute("a_list", pList);
			model.addAttribute("rand", rand);
			model.addAttribute("rand2", rand2);

			// attr.addAttribute("model", model);

		} catch (TasteException te) {
			te.printStackTrace();
		}
		return "product/productlist";
	}
}
