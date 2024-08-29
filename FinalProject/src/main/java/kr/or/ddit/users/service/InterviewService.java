package kr.or.ddit.users.service;

import kr.or.ddit.company.vo.InterviewSchdVO;
import kr.or.ddit.paging.vo.PaginationInfo;
import kr.or.ddit.users.vo.InterviewReviewVO;

public interface InterviewService {
	
	/**
	 * 면접일정 리스트 조회
	 */
	public void retrieveInterviewSchdList(PaginationInfo<InterviewSchdVO> paging);

	/**
	 * 면접후기 상세보기(기웅)
	 */
	public InterviewSchdVO retrieveInfo(String intrNo);

}
