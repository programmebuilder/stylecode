package stylecode.sns.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter @Setter
public class MemberVO {

	private String mid;
	private String mpasswd;
	private String mnm;
	private String mbirth;
	private String mphone;
	private String mimg;
	
}
