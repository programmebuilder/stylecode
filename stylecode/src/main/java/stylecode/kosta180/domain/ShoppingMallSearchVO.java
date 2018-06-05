package stylecode.kosta180.domain;

public class ShoppingMallSearchVO extends Criteria {
	//쇼핑몰 검색을 위해 사용되는 클래스
	private String searchKey;
	
	public String getSearchKey() {
		return searchKey;
	}
	public void setSearchKey(String searchKey) {
		this.searchKey = searchKey;
	}

}
