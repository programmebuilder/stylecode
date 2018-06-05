package stylecode.kosta180.util;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class MyAuthentication extends Authenticator {

	PasswordAuthentication pa;
	
	public MyAuthentication(){
		
		String id = "mb7407@gmail.com";
		String pw = "rmfowhdk1!";
		
		pa = new PasswordAuthentication(id, pw);
	}
	
	public PasswordAuthentication getPasswordAuthentication(){
		System.out.println(pa);
		return pa;
	}
}
