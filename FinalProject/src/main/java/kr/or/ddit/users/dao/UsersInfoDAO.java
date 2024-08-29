package kr.or.ddit.users.dao;

import org.apache.ibatis.annotations.Mapper;

import kr.or.ddit.common.vo.MemberVO;

@Mapper
public interface UsersInfoDAO {
	
	/**
	 * 개인정보조회
	 */
	public MemberVO selectUsers(String memId);
	
	/**
	 * 개인정보수정 - MEMBER 테이블
	 */
	public int editMemberPost(MemberVO member);
	
	/**
	 * 개인정보수정 - USERS 테이블
	 */
	public int editUsersPost(MemberVO member);
	
	/**
	 * 탈퇴
	 */
	public int exitPost(String memId);
	
}
