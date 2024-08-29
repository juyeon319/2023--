package kr.or.ddit.users.service;

import java.io.IOException;

import kr.or.ddit.common.vo.MemberVO;

public interface UsersInfoService {
	
	/**
	 * 개인정보조회
	 */
	public MemberVO retrieveUsers(String memId);
	
	/**
	 * 개인정보수정(MEMBER+USERS)
	 */
	public int editPost(MemberVO memberVO) throws IOException;
	
	/**
	 * 탈퇴
	 */
	public int exitPost(String memId);

}
