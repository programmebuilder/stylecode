package stylecode.kosta180.domain;

public class SpmRequestVO {
	private String mId; //쇼핑몰 담당자 아이디
	private String mPasswd; //쇼핑몰 담당자 비밀번호
	private String spmNm; //쇼핑몰 이름
	private String spmURL; //쇼핑몰 URL
	private String spmClassifcn; //쇼핑몰 분류
	private String mName; //쇼핑몰 담당자 이름
	private String mPhone; //쇼핑몰 담당자 휴대폰
	private String mCall; //쇼핑몰 담당자 유선전화
	
	public SpmRequestVO(String mId, String mPasswd, String spmNm, String spmURL, String spmClassifcn, int spmRegistNo,
			String mName, String mPhone, String mCall) {
		super();
		this.mId = mId;
		this.mPasswd = mPasswd;
		this.spmNm = spmNm;
		this.spmURL = spmURL;
		this.spmClassifcn = spmClassifcn;
		this.mName = mName;
		this.mPhone = mPhone;
		this.mCall = mCall;
	}

	public String getmId() {
		return mId;
	}

	public void setmId(String mId) {
		this.mId = mId;
	}

	public String getmPasswd() {
		return mPasswd;
	}

	public void setmPasswd(String mPasswd) {
		this.mPasswd = mPasswd;
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

	public String getSpmClassifcn() {
		return spmClassifcn;
	}

	public void setSpmClassifcn(String spmClassifcn) {
		this.spmClassifcn = spmClassifcn;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getmPhone() {
		return mPhone;
	}

	public void setmPhone(String mPhone) {
		this.mPhone = mPhone;
	}

	public String getmCall() {
		return mCall;
	}

	public void setmCall(String mCall) {
		this.mCall = mCall;
	}
}