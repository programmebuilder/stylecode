package stylecode.kosta180.domain;

public class CategoryVO extends Criteria {
	//카테고리를 위해 사용되는 클래스
	private int cgNo;

	public int getCgNo() {
		return cgNo;
	}

	public void setCgNo(int cgNo) {
		this.cgNo = cgNo;
	}

	@Override
	public String toString() {
		return "CategoryVO [cgNo=" + cgNo + "]";
	}
	
}
