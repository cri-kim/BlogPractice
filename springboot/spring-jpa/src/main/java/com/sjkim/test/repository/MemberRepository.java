package com.sjkim.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sjkim.test.domain.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long>{ //기본 CRUD가 포함되어있음

	//findBy+"컬럼명" => select {columns} from {table name} where {컬렴명}={파라미터}
	public List<Member> findById(String id);
	
	public List<Member> findByName(String name);
	
	//findBy+"컬럼명"+Like => Like 검색
	public List<Member> findByNameLike(String name);
	
	//findBy+"컬럼명"+OR/AND+"컬럼명"+... => OR 혹은 AND 조건 검색
	public List<Member> findByIdOrName(String id, String name);
	
	//findBy+"컬럼명"+Between => Between 조건 검색
	public List<Member> findByMemberNoBetween(String start, String end);	
	
}
