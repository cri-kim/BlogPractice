package com.sjkim.test.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sjkim.test.domain.Member;
import com.sjkim.test.service.MemberService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("member")
public class MemberController {
	@Autowired
	MemberService memberService;
	
	@PostMapping(value = "/all",produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<List<Member>> getAllMembers(){
		List<Member> members = memberService.findAll();
		return new ResponseEntity<List<Member>>(members, HttpStatus.OK);
	}

	@PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Member> getMember(Member vo){
		Optional<Member> member = memberService.findById(vo.getMemberNo());
		return new ResponseEntity<Member>(member.get(), HttpStatus.OK);
	}

	@PostMapping(value = "/save", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Member> save(Member vo){
		Member member = memberService.save(vo);
		return new ResponseEntity<Member>(member, HttpStatus.OK);
	}

	@PostMapping(value = "/mod", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Member> update(Member vo){
		memberService.updateById(vo.getMemberNo(), vo);
		return new ResponseEntity<Member>(vo, HttpStatus.OK);
	}
}
