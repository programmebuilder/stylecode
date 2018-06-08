package stylecode.kosta180.userrecommend.domain;


import java.util.Date;

import org.springframework.stereotype.Repository;

@Repository
public class ProductRateVO {
	private int pRateNo;
	private long mCode;
	private int pEnrollNo;
	private int pRate;
	private Date pRgDate;
	
	public int getpRateNo() {
		return pRateNo;
	}
	public void setpRateNo(int pRateNo) {
		this.pRateNo = pRateNo;
	}
	
	public long getmCode() {
		return mCode;
	}
	public void setmCode(long mCode) {
		this.mCode = mCode;
	}
	public int getpEnrollNo() {
		return pEnrollNo;
	}
	public void setpEnrollNo(int pEnrollNo) {
		this.pEnrollNo = pEnrollNo;
	}
	public int getpRate() {
		return pRate;
	}
	public void setpRate(int pRate) {
		this.pRate = pRate;
	}
	
	public Date getpRgDate() {
		return pRgDate;
	}
	public void setpRgDate(Date pRgDate) {
		this.pRgDate = pRgDate;
	}
	@Override
	public String toString() {
		return "ProductRateVO [pRateNo=" + pRateNo + ", mCode=" + mCode + ", pEnrollNo=" + pEnrollNo + ", pRate="
				+ pRate + ", pRgDate=" + pRgDate + "]";
	}
	
	
	
	
	

}
