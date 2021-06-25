package com.sjkim.test.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sjkim.test.domain.Member;
import com.sjkim.test.repository.MemberRepository;

@Service
public class MemberService {
	@Autowired
	private MemberRepository memberRepository;
	
	public List<Member> findAll(){
		List<Member> members = new ArrayList<>();
		memberRepository.findAll().forEach(e-> members.add(e));
		return members;
	}
	
	public Optional<Member> findById(Long memberNo){
		//CRUDReposiory 에서 자동으로 생성된 @Id의 값 검색 -> 직접 추가 생성한 findById 와 다름
		Optional<Member> member = memberRepository.findById(memberNo);
		return member;
	}

	public void deleteById(Long memberNo) {
		memberRepository.deleteById(memberNo);
	}

	public Member save(Member member) {
		memberRepository.save(member);
		return member;
	}
	
	public void updateById(Long memberNo, Member member) {
		Optional<Member> vMember = memberRepository.findById(memberNo);
		
		//검색 결과가 있는지 확인
		if(vMember.isPresent()) {
			vMember.get().setMemberNo(member.getMemberNo());
			vMember.get().setId(member.getId());
			vMember.get().setName(member.getName());
//			memberRepository.save(member);
			memberRepository.save(vMember.get());
		}
		
	}
}
