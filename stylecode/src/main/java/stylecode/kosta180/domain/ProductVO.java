package stylecode.kosta180.domain;

public class ProductVO {
	private long pEnrollNo;
	private String pNm; 
	private String pImg; 
	private int mPrice;
	private int spmEnrollNo; 
	private int cgNo;
	private int cgDtNo; 
	private String prodURL;
	
	//getter, setter
	public long getpEnrollNo() {
		return pEnrollNo;
	}
	public void setpEnrollNo(long pEnrollNo) {
		this.pEnrollNo = pEnrollNo;
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
	public int getSpmEnrollNo() {
		return spmEnrollNo;
	}
	public void setSpmEnrollNo(int spmEnrollNo) {
		this.spmEnrollNo = spmEnrollNo;
	}
	public int getCgNo() {
		return cgNo;
	}
	public void setCgNo(int cgNo) {
		this.cgNo = cgNo;
	}
	public int getCgDtNo() {
		return cgDtNo;
	}
	public void setCgDtNo(int cgDtNo) {
		this.cgDtNo = cgDtNo;
	}
	public String getProdURL() {
		return prodURL;
	}
	public void setProdURL(String prodURL) {
		this.prodURL = prodURL;
	}
	
	public ProductVO(){}
	public ProductVO(long pEnrollNo, String pNm, String pImg, int mPrice, int spmEnrollNo, int cgNo, int cgDtNo,
			String prodURL) {
		this.pEnrollNo = pEnrollNo;
		this.pNm = pNm;
		this.pImg = pImg;
		this.mPrice = mPrice;
		this.spmEnrollNo = spmEnrollNo;
		this.cgNo = cgNo;
		this.cgDtNo = cgDtNo;
		this.prodURL = prodURL;
	}
	
	
	
}
