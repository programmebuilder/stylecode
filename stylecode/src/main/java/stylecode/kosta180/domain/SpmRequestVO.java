package stylecode.kosta180.domain;

import java.io.Serializable;

public class SpmRequestVO extends ShoppingMallVO implements Serializable {
	private String mId; //쇼핑몰 담당자 아이디
	private String mPasswd; //쇼핑몰 담당자 비밀번호
	private String mName; //쇼핑몰 담당자 이름
	private String mPhone; //쇼핑몰 담당자 휴대폰
	private String mCall; //쇼핑몰 담당자 유선전화
	
	public SpmRequestVO() {}
	
	public SpmRequestVO(String mId, String mPasswd, String mName, String mPhone, String mCall) {
		super();
		this.mId = mId;
		this.mPasswd = mPasswd;
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

	@Override
	public int getSpmEnrollNo() {
		// TODO Auto-generated method stub
		return super.getSpmEnrollNo();
	}

	@Override
	public void setSpmEnrollNo(int spmEnrollNo) {
		// TODO Auto-generated method stub
		super.setSpmEnrollNo(spmEnrollNo);
	}

	@Override
	public String getSpmNm() {
		// TODO Auto-generated method stub
		return super.getSpmNm();
	}

	@Override
	public void setSpmNm(String spmNm) {
		// TODO Auto-generated method stub
		super.setSpmNm(spmNm);
	}

	@Override
	public String getSpmURL() {
		// TODO Auto-generated method stub
		return super.getSpmURL();
	}

	@Override
	public void setSpmURL(String spmURL) {
		// TODO Auto-generated method stub
		super.setSpmURL(spmURL);
	}

	@Override
	public String getSpmTn() {
		// TODO Auto-generated method stub
		return super.getSpmTn();
	}

	@Override
	public void setSpmTn(String spmTn) {
		// TODO Auto-generated method stub
		super.setSpmTn(spmTn);
	}

	@Override
	public String getSpmInfo() {
		// TODO Auto-generated method stub
		return super.getSpmInfo();
	}

	@Override
	public void setSpmInfo(String spmInfo) {
		// TODO Auto-generated method stub
		super.setSpmInfo(spmInfo);
	}

	@Override
	public int getSpmViews() {
		// TODO Auto-generated method stub
		return super.getSpmViews();
	}

	@Override
	public void setSpmViews(int spmViews) {
		// TODO Auto-generated method stub
		super.setSpmViews(spmViews);
	}

	@Override
	public String getSpmClassifcn() {
		// TODO Auto-generated method stub
		return super.getSpmClassifcn();
	}

	@Override
	public void setSpmClassifcn(String spmClassifcn) {
		// TODO Auto-generated method stub
		super.setSpmClassifcn(spmClassifcn);
	}

	@Override
	public String getSpmAges() {
		// TODO Auto-generated method stub
		return super.getSpmAges();
	}

	@Override
	public void setSpmAges(String spmAges) {
		// TODO Auto-generated method stub
		super.setSpmAges(spmAges);
	}

	@Override
	public String getSpmDate() {
		// TODO Auto-generated method stub
		return super.getSpmDate();
	}

	@Override
	public void setSpmDate(String spmDate) {
		// TODO Auto-generated method stub
		super.setSpmDate(spmDate);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
