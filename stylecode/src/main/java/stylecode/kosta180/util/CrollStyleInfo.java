package stylecode.kosta180.util;

import java.io.FileReader;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import stylecode.kosta180.domain.CrollProductVO;
import stylecode.kosta180.domain.CrollSPMVO;
import stylecode.kosta180.service.CrollServiceImpl;

@Repository
public class CrollStyleInfo {
	
	@Inject
	CrollServiceImpl service = new CrollServiceImpl();
	
	public void crollInfo(){	
		JSONParser parser = new JSONParser();

		List<CrollSPMVO> crollSPMList = new ArrayList<CrollSPMVO>();
		List<CrollProductVO> crollProductList = new ArrayList<CrollProductVO>();

		try {
			Object shopListobj = parser.parse(new FileReader("C:\\json\\shopList.json")); 
			Object prodListobj = parser.parse(new FileReader("C:\\json\\prodList.json")); 
			
			JSONArray shopListJsonArray = (JSONArray) shopListobj;
			JSONArray prodListJsonArray = (JSONArray) prodListobj;
			
			Iterator shopListIT = shopListJsonArray.iterator();
			Iterator prodListIT = prodListJsonArray.iterator();

			while(shopListIT.hasNext()){

				JSONObject shopObj = (JSONObject) shopListIT.next();
				CrollSPMVO spmVO = new CrollSPMVO();

				int spmEnrollNo = Math.toIntExact((long) shopObj.get("shopSeq"));
				String spmNm = (String) shopObj.get("shopName");
				String spmURL = (String) shopObj.get("webUrl");
				String spmInfo = (String) shopObj.get("shopDescription");
				String spmAges = (String) shopObj.get("ageNames");
				String spmClassifCn = (String) shopObj.get("cateNames"); 
				String spmTN = "http://www.sta1.com" + (String) shopObj.get("mobIconPath"); 
				
				spmVO.setSpmEnrollNo(spmEnrollNo);
				spmVO.setSpmNm(spmNm);
				spmVO.setSpmURL(spmURL);
				spmVO.setSpmInfo(spmInfo);
				spmVO.setSpmAges(spmAges);
				spmVO.setSpmClassifCn(spmClassifCn);
				spmVO.setSpmTN(spmTN);
				
				crollSPMList.add(spmVO);
			}
			
			while(prodListIT.hasNext()){
			
				JSONObject prodObj = (JSONObject) prodListIT.next();
				CrollProductVO prodVO = new CrollProductVO();
				
				long pEnrollNo = (long) prodObj.get("rowNumber"); 
				String productName = (String) prodObj.get("prodName"); 
				String productImgURL =  "http://www.sta1.com" + (String) prodObj.get("webImgPath"); 
				String productURL = "http://www.sta1.com/cp/"
										  + prodObj.get("shopSeq") + "/" + prodObj.get("prodSeq"); 
				int productPrice = Math.toIntExact((long) prodObj.get("dcPrice"));
				int cateSeq = Math.toIntExact((long) prodObj.get("cateSeq")); 
				int spmEnrollNo = Math.toIntExact((long) prodObj.get("shopSeq"));

				prodVO.setpEnrollNo(pEnrollNo);
				prodVO.setpNm(productName);
				prodVO.setpImg(productImgURL);
				prodVO.setProdURL(productURL);
				prodVO.setmPrice(productPrice);
				prodVO.setCgNo(cateSeq);
				prodVO.setSpmEnrollNo(spmEnrollNo);
				
				crollProductList.add(prodVO);
			}
			
			//service.insertShopDataService(crollSPMList); 
			
			//service.insertProductDataService(crollProductList); 
			
				
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
	 }//end of crollInfo()

}
