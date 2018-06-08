package stylecode.kosta180.domain;

import java.io.Serializable;

public class Manager_spmVO implements Serializable{

	private String mId;
	private int spmEnrollNo;
	private String mngLineNo;
	private ShoppingMallVO shoppingMallVO;
	
	
	public Manager_spmVO(){}
	public Manager_spmVO(String mId, int spmEnrollNo, String mngLineNo, ShoppingMallVO shoppingMallVO) {
		super();
		this.mId = mId;
		this.spmEnrollNo = spmEnrollNo;
		this.mngLineNo = mngLineNo;
		this.shoppingMallVO = shoppingMallVO;
	}
	public String getmId() {
		return mId;
	}
	public void setmId(String mId) {
		this.mId = mId;
	}
	public int getSpmEnrollNo() {
		return spmEnrollNo;
	}
	public void setSpmEnrollNo(int spmEnrollNo) {
		this.spmEnrollNo = spmEnrollNo;
	}
	public String getMngLineNo() {
		return mngLineNo;
	}
	public void setMngLineNo(String mngLineNo) {
		this.mngLineNo = mngLineNo;
	}
	public ShoppingMallVO getShoppingMallVO() {
		return shoppingMallVO;
	}
	public void setShoppingMallVO(ShoppingMallVO shoppingMallVO) {
		this.shoppingMallVO = shoppingMallVO;
	}
	@Override
	public String toString() {
		return "Manager_spmVO [mId=" + mId + ", spmEnrollNo=" + spmEnrollNo + ", mngLineNo=" + mngLineNo
				+ ", shoppingMallVO=" + shoppingMallVO + "]";
	}
	
	
	
	
}