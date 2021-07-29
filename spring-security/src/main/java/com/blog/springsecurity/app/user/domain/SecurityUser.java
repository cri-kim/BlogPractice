package com.blog.springsecurity.app.user.domain;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class SecurityUser implements UserDetails {
	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	private String useYn;
	private Set<UserAuth> authLst = new HashSet<>();

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return null;
	}

	@Override
	public boolean isAccountNonExpired() {
		if(useYn.equals("Y")) return true;
		return false;
	}

	@Override
	public boolean isAccountNonLocked() {
		if(useYn.equals("Y")) return true;
		return false;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		if(useYn.equals("Y")) return true;
		return false;
	}

	@Override
	public boolean isEnabled() {
		if(useYn.equals("Y")) return true;
		return false;
	}
	
	public SecurityUser(User user) {
		this.username = user.getEmail();
		this.password = user.getPassword();
		this.useYn = user.getUseYn();
		this.authLst = user.getUserAuthLst();
	}
}
