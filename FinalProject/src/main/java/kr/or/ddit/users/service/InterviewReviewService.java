package kr.or.ddit.users.service;

import kr.or.ddit.paging.vo.PaginationInfo;
import kr.or.ddit.users.vo.InterviewReviewVO;

public interface InterviewReviewService {
	
	/**
	 * 면접후기 리스트 조회
	 */
	public void retrieveReviewList(PaginationInfo<InterviewReviewVO> paging);
	
	/**
	 * 면접후기 상세조회
	 */
	public InterviewReviewVO retrieveReview(String intrevNo);
	
	/**
	 * 면접후기 등록
	 */
	public void createInterviewReview(InterviewReviewVO interviewReviewVO);
	
	/**
	 * 면접후기 수정
	 */
	public void modifyReview(InterviewReviewVO interviewReviewVO);
	
}
