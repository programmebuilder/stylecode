package stylecode.kosta180.persistence;

import java.util.List;
import java.util.Map;

import stylecode.kosta180.product.domain.ProductVO;
import stylecode.kosta180.domain.ShoppingMallSearchVO;
import stylecode.kosta180.domain.ShoppingMallVO;
import stylecode.kosta180.domain.SpmFilterVO;
import stylecode.kosta180.domain.SpmRequestVO;
import stylecode.kosta180.domain.SpmFilterListVO;

public interface ShoppingmallDAO {
	//�씪諛�, 寃��깋 �떆 �눥�븨紐� 由ъ뒪�듃
	public List<ShoppingMallVO> listShoppingMall(ShoppingMallSearchVO search) throws Exception;
	//�눥�븨紐� �븘�꽣留� 泥섎━
	public List<Integer> SPMfiter(SpmFilterVO filter) throws Exception;
	//�븘�꽣留� �떆 �눥�븨紐� 由ъ뒪�듃
	public List<ShoppingMallVO> listShoppingMallFilter (SpmFilterListVO filterList) throws Exception;
	//�눥�븨紐� 媛앹껜 媛��졇�삤湲�
	public ShoppingMallVO selectedSPM(int spmEnrollNo) throws Exception;	
	//�럹�씠吏� 泥섎━
	public int getListCount(ShoppingMallSearchVO search) throws Exception;
	//�븘�꽣 �럹�씠吏� 泥섎━
	public int getFilterListCount(SpmFilterVO filter) throws Exception;
	//�엯�젏�떊泥� �깮�꽦
	public void requestSPM(SpmRequestVO spmRequest) throws Exception;
	public void requestSPM2(SpmRequestVO spmRequest) throws Exception;
	//�엯�젏�떊泥� �렪�쓽瑜� �쐞�븳 由ъ뒪�듃
	public int listShoppingMallR() throws Exception;
}
