package stylecode.kosta180.domain;

import java.io.Serializable;

public class ProductVO implements Serializable{
	
	private int penRollNo;
	private String pnm;
	private String pimg;
	private int mPrice;
	private int spmEnrollNo;
	private int cgno;
	private int colorNo;
	
	public ProductVO() {}
	public ProductVO(int penRollNo, String pnm, String pimg, int mPrice, int spmEnrollNo, int cgno, int colorNo) {
		super();
		this.penRollNo = penRollNo;
		this.pnm = pnm;
		this.pimg = pimg;
		this.mPrice = mPrice;
		this.spmEnrollNo = spmEnrollNo;
		this.cgno = cgno;
		this.colorNo = colorNo;
	}
	public int getPenRollNo() {
		return penRollNo;
	}
	public void setPenRollNo(int penRollNo) {
		this.penRollNo = penRollNo;
	}
	public String getPnm() {
		return pnm;
	}
	public void setPnm(String pnm) {
		this.pnm = pnm;
	}
	public String getPimg() {
		return pimg;
	}
	public void setPimg(String pimg) {
		this.pimg = pimg;
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
	public int getCgno() {
		return cgno;
	}
	public void setCgno(int cgno) {
		this.cgno = cgno;
	}
	public int getColorNo() {
		return colorNo;
	}
	public void setColorNo(int colorNo) {
		this.colorNo = colorNo;
	}
	
	
	
	
}
