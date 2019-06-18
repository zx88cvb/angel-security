/**
 * 
 */
package com.angel.security.security;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

/**
 * @author zhailiang
 *
 */
@Component
@Slf4j
public class MyUserDetailsService implements UserDetailsService {
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.security.core.userdetails.UserDetailsService#
	 * loadUserByUsername(java.lang.String)
	 */
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		log.info("登录的用户名:" + username);
		String password = passwordEncoder.encode("123456");
		// 根据用户名查询用户信息
		return new User(username, password , AuthorityUtils.commaSeparatedStringToAuthorityList("admin,angel,ROLE_USER"));
	}

}
