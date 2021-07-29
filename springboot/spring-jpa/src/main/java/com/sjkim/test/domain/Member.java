package com.sjkim.test.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity(name = "member") //JPA가 관리하는 클래스로, member 테이블과 매핑
public class Member {
	
	@Id//기본키(PK)
	@GeneratedValue(strategy = GenerationType.IDENTITY) //AUTO_INCREMENT, 기본 키 생성을 데이터베이스에 위임
	private Long memberNo;
	
	private String id;
	private String name;
	
	@Builder
	public Member(String id, String name){
		this.id = id;
		this.name = name;
	}
	
}
