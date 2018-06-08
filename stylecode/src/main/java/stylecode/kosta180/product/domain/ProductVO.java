package stylecode.kosta180.product.domain;


import java.io.Serializable;

import org.springframework.stereotype.Repository;

@Repository
public class ProductVO implements Serializable {
	private int pEnrollNo;
	private String pNm;
	private String pImg;
	private int mPrice;
	private int spmEnrollNo;
	private int cgNo;
	private String prodUrl;
	
	public String getpImg() {
		return pImg;
	}
	public void setpImg(String pImg) {
		this.pImg = pImg;
	}
	public String getProdUrl() {
		return prodUrl;
	}
	public void setProdUrl(String prodUrl) {
		this.prodUrl = prodUrl;
	}
	public int getpEnrollNo() {
		return pEnrollNo;
	}
	public void setpEnrollNo(int pEnrollNo) {
		this.pEnrollNo = pEnrollNo;
	}
	public int getSpmEnrollNo() {
		return spmEnrollNo;
	}
	public void setSpmEnrollNo(int spmEnrollNo) {
		this.spmEnrollNo = spmEnrollNo;
	}
	public String getpNm() {
		return pNm;
	}
	public void setpNm(String pNm) {
		this.pNm = pNm;
	}
	public int getmPrice() {
		return mPrice;
	}
	public void setmPrice(int mPrice) {
		this.mPrice = mPrice;
	}
	public int getCgNo() {
		return cgNo;
	}
	public void setCgNo(int cgNo) {
		this.cgNo = cgNo;
	}
	@Override
	public String toString() {
		return "ProductVO [pEnrollNo=" + pEnrollNo + ", pNm=" + pNm + ", pImg=" + pImg + ", mPrice=" + mPrice
				+ ", spmEnrollNo=" + spmEnrollNo + ", cgNo=" + cgNo + ", prodUrl=" + prodUrl + "]";
	}
	
	
	

}
