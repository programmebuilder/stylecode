/*package stylecode.kosta180.security.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.stereotype.Service;

import stylecode.kosta180.domain.SecurityMemberVO;

@Service
public class MemberServiceImpl implements MemberService {

	@Override
	public void join(SecurityMemberVO memberVo) {
		 UserDetails user= new User(memberVo.getId(), memberVo.getPw(), Arrays.asList(new SimpleGrantedAuthority("USER")));
		userDetailsManager.createUser(user);
	}

}
*/