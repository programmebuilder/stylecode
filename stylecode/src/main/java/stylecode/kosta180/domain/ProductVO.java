package stylecode.kosta180.domain;

import java.util.List;

import org.springframework.stereotype.Repository;
@Repository
public class ProductVO {
	private int penRollNo;
	private String pNm;
	private String pImg;
	private int mPrice;
	private int spemnRollNo;
	private int cGno;
	
	public int getPenRollNo() {
		return penRollNo;
	}
	public void setPenRollNo(int penRollNo) {
		this.penRollNo = penRollNo;
	}
	public String getpNm() {
		return pNm;
	}
	public void setpNm(String pNm) {
		this.pNm = pNm;
	}
	public String getpImg() {
		return pImg;
	}
	public void setpImg(String pImg) {
		this.pImg = pImg;
	}
	public int getmPrice() {
		return mPrice;
	}
	public void setmPrice(int mPrice) {
		this.mPrice = mPrice;
	}
	public int getSpemnRollNo() {
		return spemnRollNo;
	}
	public void setSpemnRollNo(int spemnRollNo) {
		this.spemnRollNo = spemnRollNo;
	}
	public int getcGno() {
		return cGno;
	}
	public void setcGno(int cGno) {
		this.cGno = cGno;
	}
	
}
