package kr.or.ddit.users.controller;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import kr.or.ddit.common.vo.MemberVO;
import kr.or.ddit.users.service.UsersInfoService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/user")
public class UsersInfoController {
	@Inject
	private UsersInfoService service;

	//개인정보조회
	@GetMapping("info")
	public String userInfo(
			Model model
			, @SessionAttribute("authId") String memId
			) {
		log.info("아이디 : " + memId);
		MemberVO member = service.retrieveUsers(memId);
		model.addAttribute("member", member);

		return "users/member/memberInfo";
	}
	
	//개인정보수정-UI
	@GetMapping("edit")
	public String infoEdit(
			Model model
			, @SessionAttribute("authId") String memId
			) {
		log.info("아이디 : " + memId);
		MemberVO member = service.retrieveUsers(memId);
		model.addAttribute("member", member);

		return "users/member/memberInfoEdit";
	}
	
	//개인정보수정
	@PostMapping("editPost")
	public String editPost(
			MemberVO memberVO
			, @SessionAttribute("authId") String memId
			, Model model
		) throws IOException {
			log.info("아이디 : " + memId);
			log.info("editPost->memberVO : " + memberVO);
		  
			int result = this.service.editPost(memberVO);
			log.info("result : " + result);
		  
			//개인정보조회
			return "redirect:/user/info";
	}

	//탈퇴
	@PostMapping("exitPost")
	public String delete(
	        String memId
	        , HttpSession session
	        ) {
		
			log.info("exitPost->memId : " + memId);
					
			int result = this.service.exitPost(memId);
			log.info("result : " + result);
			
			if(result>0) {//탈퇴 성공 시
				session.invalidate();//세션 삭제
			}
			//메인페이지
			return "redirect:/";
	}
	
}
