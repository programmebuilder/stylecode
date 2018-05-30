package stylecode.kosta180.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.impl.common.LongPrimitiveArrayIterator;
import org.apache.mahout.cf.taste.impl.common.LongPrimitiveIterator;
import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.impl.recommender.GenericItemBasedRecommender;
import org.apache.mahout.cf.taste.impl.similarity.TanimotoCoefficientSimilarity;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestRecommend {

	
	@RequestMapping(value="/testddd")
	public void tanimotoCoefficientSimilarity_GET()throws Exception{
		
		try {
			DataModel dm=new FileDataModel(new File("C:\\data\\movies_info.csv"));
			
			TanimotoCoefficientSimilarity sim = new TanimotoCoefficientSimilarity(dm);
			System.out.println("sim:="+sim);
			GenericItemBasedRecommender recommender= new GenericItemBasedRecommender(dm, sim);
			int x= 1;
			
			System.out.println("타니모토사용합니더어~~");
			
			for(LongPrimitiveIterator items=dm.getItemIDs(); items.hasNext();){
				long itemId=items.nextLong();
				System.out.println("itemId:"+itemId);
				List<RecommendedItem> recommendations=recommender.mostSimilarItems(itemId, 5);
				System.out.println("recommendations:="+recommendations);
				for(RecommendedItem recommendation:recommendations){
					System.out.println(itemId+","+recommendation.getItemID()+","+recommendation.getValue());
					
					x++;
					if(x>10)System.exit(1);
				}
			}
		} catch (IOException e) {
			System.out.println("에러떳습뉘다에러에러");
		}catch (TasteException e) {
			System.out.println("Taste 에러에연");
			e.printStackTrace();
		}
	}
/*	@RequestMapping(value="/test1")
	public String itemRecommend()throws Exception{
		List<String> list =new ArrayList<String>();
		
		list=serv
	}*/
	
}

