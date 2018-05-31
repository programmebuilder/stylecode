package stylecode.kosta180.domain;

import java.io.Serializable;

public class SpmBmVO implements Serializable {
	private int spmBmNo;
	private int bmEnrollNo;
	private String mId;
	
	public SpmBmVO(){}
	

	public SpmBmVO(int spmBmNo, int bmEnrollNo, String mId) {
		super();
		this.spmBmNo = spmBmNo;
		this.bmEnrollNo = bmEnrollNo;
		this.mId = mId;
	}


	public int getSpmBmNo() {
		return spmBmNo;
	}

	public void setSpmBmNo(int spmBmNo) {
		this.spmBmNo = spmBmNo;
	}

	public int getBmEnrollNo() {
		return bmEnrollNo;
	}

	public void setBmEnrollNo(int bmEnrollNo) {
		this.bmEnrollNo = bmEnrollNo;
	}

	public String getmId() {
		return mId;
	}

	public void setmId(String mId) {
		this.mId = mId;
	}

	@Override
	public String toString() {
		return "SpmBmVO [spmBmNo=" + spmBmNo + ", bmEnrollNo=" + bmEnrollNo + ", mId=" + mId + "]";
	}
	
	

	


}
