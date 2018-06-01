package stylecode.kosta180.util;

import java.io.File;
import java.util.List;

import org.apache.mahout.cf.taste.impl.common.LongPrimitiveIterator;
import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.impl.recommender.GenericItemBasedRecommender;
import org.apache.mahout.cf.taste.impl.similarity.PearsonCorrelationSimilarity;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.similarity.ItemSimilarity;

public class RecommendTest {	
	public static void main(String[] args) throws Exception {
	    /*DataModel model = new FileDataModel(new File("C:/Users/JUNHEE/Desktop/prac/mahoutexam/src/testdt.csv"));
		
	    UserSimilarity similarity = new PearsonCorrelationSimilarity(model);
	    UserNeighborhood neighborhood =
	      new NearestNUserNeighborhood(2, similarity, model);

	    Recommender recommender = new GenericUserBasedRecommender(
	        model, neighborhood, similarity);

	    List<RecommendedItem> recommendations =
	        recommender.recommend(1, 2);

	    for (RecommendedItem recommendation : recommendations) {
	      System.out.println(recommendation);
	    }*/
		
/*		DataModel model = new FileDataModel (new File("C:/Users/JUNHEE/Desktop/prac/mahoutexam/src/testdt.csv"));
		ItemSimilarity itemSimilarity = new EuclideanDistanceSimilarity (model);
		Recommender itemRecommender = new GenericItemBasedRecommender(model,itemSimilarity);
		List<RecommendedItem> itemRecommendations = itemRecommender.recommend(1, 3);
		
		for (RecommendedItem itemRecommendation : itemRecommendations) {
			System.out.println("Item: " + itemRecommendation);
		}*/
	DataModel dm;
	try {		
		/* 데이터 모델 생성  */
		dm = new FileDataModel(new File("C:/Users/JUNHEE/Desktop/prac/mahoutexam/src/testdt.csv"));
		
		/* 유사도 모델 선택  */
		ItemSimilarity sim = (ItemSimilarity) new PearsonCorrelationSimilarity(dm);
		
		/* 추천기 선택 : ItemBased  */
		GenericItemBasedRecommender recommender = new GenericItemBasedRecommender(dm, sim);
		
		int x=1;
		
		/* 데이터 모델 내의 item들의 iterator를 단계별로 이동하며 추천 아이템들 제공 */
		for(LongPrimitiveIterator items = dm.getItemIDs(); items.hasNext();){
			
			long itemID = items.nextLong(); /*현재 아이디*/
		
		/* 현재 item ID와 가장 유사한 5개 아이템 추천*/
			List<RecommendedItem> recommendations = recommender.mostSimilarItems(itemID, 5);
		/* 유사한 아이템 출력 ='현재 아이템ID|추천아이템ID|유사도'*/
			for(RecommendedItem recommendation : recommendations){
				System.out.println(itemID + "," + recommendation.getItemID() + "," + recommendation.getValue());
			}
			x++; /*아이템ID 5까지 유사한 아이템들 5개씩*/
			if(x>5) System.exit(0);
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
}
