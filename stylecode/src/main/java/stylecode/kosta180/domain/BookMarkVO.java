package stylecode.kosta180.domain;

public class BookMarkVO {
	private int spmBmNo;	//¿Œµ¶Ω∫
	private int spmEnrollNo;	//ºÓ«Œ∏ÙµÓ∑œπ¯»£(?)
	private String mId;
	public int getSpmBmNo() {
		return spmBmNo;
	}
	public void setSpmBmNo(int spmBmNo) {
		this.spmBmNo = spmBmNo;
	}
	public int getSpmEnrollNo() {
		return spmEnrollNo;
	}
	public void setSpmEnrollNo(int spmEnrollNo) {
		this.spmEnrollNo = spmEnrollNo;
	}
	public String getmId() {
		return mId;
	}
	public void setmId(String mId) {
		this.mId = mId;
	}
	@Override
	public String toString() {
		return "BookMarkVO [spmBmNo=" + spmBmNo + ", spmEnrollNo=" + spmEnrollNo + ", mId=" + mId + "]";
	}
	
	
	
}
