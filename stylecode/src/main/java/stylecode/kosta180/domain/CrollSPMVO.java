package stylecode.kosta180.domain;

import java.sql.Date;

public class CrollSPMVO {
	
	private int spmEnrollNo;
	private String spmNm; 
	private String spmURL;
	private String spmTN;
	private String spmInfo;
	private int spmViews;
	private String spmClassifCn;
	private String spmAges;
	private Date spmDate;
		
	public CrollSPMVO(){}	
	public CrollSPMVO(int spmEnrollNo, String spmNm, String spmURL, String spmTN, String spmInfo, int spmViews,
			String spmClassifCn, String spmAges, Date spmDate) {
		super();
		this.spmEnrollNo = spmEnrollNo;
		this.spmNm = spmNm;
		this.spmURL = spmURL;
		this.spmTN = spmTN;
		this.spmInfo = spmInfo;
		this.spmViews = spmViews;
		this.spmClassifCn = spmClassifCn;
		this.spmAges = spmAges;
		this.spmDate = spmDate;
	}
	
	//getter, setter
	public int getSpmEnrollNo() {
		return spmEnrollNo;
	}
	public void setSpmEnrollNo(int spmEnrollNo) {
		this.spmEnrollNo = spmEnrollNo;
	}
	public String getSpmNm() {
		return spmNm;
	}
	public void setSpmNm(String spmNm) {
		this.spmNm = spmNm;
	}
	public String getSpmURL() {
		return spmURL;
	}
	public void setSpmURL(String spmURL) {
		this.spmURL = spmURL;
	}
	public String getSpmTN() {
		return spmTN;
	}
	public void setSpmTN(String spmTN) {
		this.spmTN = spmTN;
	}
	public String getSpmInfo() {
		return spmInfo;
	}
	public void setSpmInfo(String spmInfo) {
		this.spmInfo = spmInfo;
	}
	public int getSpmViews() {
		return spmViews;
	}
	public void setSpmViews(int spmViews) {
		this.spmViews = spmViews;
	}
	public String getSpmClassifCn() {
		return spmClassifCn;
	}
	public void setSpmClassifCn(String spmClassifCn) {
		this.spmClassifCn = spmClassifCn;
	}
	public String getSpmAges() {
		return spmAges;
	}
	public void setSpmAges(String spmAges) {
		this.spmAges = spmAges;
	}
	public Date getSpmDate() {
		return spmDate;
	}
	public void setSpmDate(Date spmDate) {
		this.spmDate = spmDate;
	}
	
	@Override
	public String toString() {
		return "CrollSPMVO [spmEnrollNo=" + spmEnrollNo + ", spmNm=" + spmNm + ", spmURL=" + spmURL + ", spmTN=" + spmTN
				+ ", spmInfo=" + spmInfo + ", spmViews=" + spmViews + ", spmClassifCn=" + spmClassifCn + ", spmAges="
				+ spmAges + ", spmDate=" + spmDate + "]";
	}
	
	
}
