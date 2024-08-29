package kr.or.ddit.users.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.or.ddit.paging.vo.PaginationInfo;
import kr.or.ddit.users.vo.InterviewReviewVO;

@Mapper
public interface InterviewReviewDAO {
	
	/**
	 * 면접후기 상세조회
	 */
	public InterviewReviewVO selectReview(String intrevNo);
	
	/**
	 * 페이징
	 */
	public int selectTotalRecord(PaginationInfo<InterviewReviewVO> paging);
	
	/**
	 * 면접후기 리스트 조회
	 */
	public List<InterviewReviewVO> selectReviewList(PaginationInfo<InterviewReviewVO> paging);

	/**
	 * 면접후기 등록
	 */
	public int insertInterviewReview(InterviewReviewVO interviewReviewVO);
	
	/**
	 * 면접후기 등록여부
	 */
	public int updateReviewSt(String intrNo);
	
	/**
	 * 면접후기 수정
	 */
	public int updateReview(InterviewReviewVO interviewReviewVO);
	
}
