<<<<<<< HEAD
package com.blog.springsecurity.config.security.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.InternalAuthenticationServiceException;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import com.blog.springsecurity.app.user.service.UserService;

@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	@Autowired
	private UserService userService;

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		if(authentication == null) {
			throw new InternalAuthenticationServiceException("Authentication is null");
		}
		String username = authentication.getName();
		if(authentication.getCredentials() == null) {
			throw new AuthenticationCredentialsNotFoundException("Credentials is null");
		}
		String password = authentication.getCredentials().toString();
		UserDetails userDetails = userService.loadUserByUsername(username);
		if(userDetails == null) {
			throw new LockedException("User Account is locked");
		}
		if(!userDetails.isAccountNonExpired()) {
			throw new DisabledException("User is disabled");
		}
		/* password check */
		if(!passwordEncoder.matches(password, userDetails.getPassword())) {
			throw new BadCredentialsException("Password does not match stored value");
		}
		UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
		token.setDetails(authentication.getDetails());
		
		return token;
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication);
	}

}
=======
package com.blog.springsecurity.config.security.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.InternalAuthenticationServiceException;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import com.blog.springsecurity.app.user.service.UserService;

@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	@Autowired
	private UserService userService;

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		if(authentication == null) {
			throw new InternalAuthenticationServiceException("Authentication is null");
		}
		String username = authentication.getName();
		if(authentication.getCredentials() == null) {
			throw new AuthenticationCredentialsNotFoundException("Credentials is null");
		}
		String password = authentication.getCredentials().toString();
		UserDetails userDetails = userService.loadUserByUsername(username);
		if(userDetails == null) {
			throw new LockedException("User Account is locked");
		}
		if(!userDetails.isAccountNonExpired()) {
			throw new DisabledException("User is disabled");
		}
		/* password check */
		if(!passwordEncoder.matches(password, userDetails.getPassword())) {
			throw new BadCredentialsException("Password does not match stored value");
		}
		UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
		token.setDetails(authentication.getDetails());
		
		return token;
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication);
	}

}
>>>>>>> 92d11ea1ce9cdc5e166da397e7384eb4733f2b78
