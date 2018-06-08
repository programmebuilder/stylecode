package stylecode.kosta180.domain;
import org.springframework.stereotype.Repository;

@Repository
public class MemberVO {
	private String mId;
	private String mPasswd;
	private String mBirth;
	private String mNm;
	private String mPhone;
	private String mImg;
	private int mCode;
	private String authority;
	private int enabled;
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
	public String getmBirth() {
		return mBirth;
	}
	public void setmBirth(String mBirth) {
		this.mBirth = mBirth;
	}
	public String getmNm() {
		return mNm;
	}
	public void setmNm(String mNm) {
		this.mNm = mNm;
	}
	public String getmPhone() {
		return mPhone;
	}
	public void setmPhone(String mPhone) {
		this.mPhone = mPhone;
	}
	public String getmImg() {
		return mImg;
	}
	public void setmImg(String mImg) {
		this.mImg = mImg;
	}
	public int getmCode() {
		return mCode;
	}
	public void setmCode(int mCode) {
		this.mCode = mCode;
	}
	public String getAuthority() {
		return authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}
	public int getEnabled() {
		return enabled;
	}
	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}
	@Override
	public String toString() {
		return "MemberVO [mId=" + mId + ", mPasswd=" + mPasswd + ", mBirth=" + mBirth + ", mNm=" + mNm + ", mPhone="
				+ mPhone + ", mImg=" + mImg + ", mCode=" + mCode + ", authority=" + authority + ", enabled=" + enabled
				+ "]";
	}
	
	

}