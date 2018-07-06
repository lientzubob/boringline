package com.casual.member.dao;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.casual.common.entity.GenericEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="member")
public class MemberBean extends GenericEntity implements UserDetails{
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3942873740603499498L;

	private String account;
	
	private String password;

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		ArrayList<GrantedAuthority> authorities = new ArrayList<>();
		GrantedAuthority auth = new SimpleGrantedAuthority("ROLE_Member");
		if(account.equals("Admin")) {
			auth = new SimpleGrantedAuthority("ROLE_Admin");
		}		
		authorities.add(auth);
		return authorities;
	}

	@Override
	public String getUsername() {
		return account;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
	
	
}
