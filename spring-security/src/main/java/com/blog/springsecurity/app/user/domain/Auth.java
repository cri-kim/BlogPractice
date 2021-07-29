package com.blog.springsecurity.app.user.domain;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Table(name = "auth_bas")
public class Auth {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "auth_id")
	private Long authId;
	
	@Column(name = "auth_nm")
	private String autNm;

	
	@JsonIgnore
	@OneToMany(mappedBy = "auth", fetch = FetchType.LAZY)
	private Set<UserAuth> userAuthLst;
	
	@Builder
	public Auth(String autNm) {
		this.autNm = autNm;
	}
}
