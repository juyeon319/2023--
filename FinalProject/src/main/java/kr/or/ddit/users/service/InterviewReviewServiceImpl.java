package kr.or.ddit.users.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.or.ddit.paging.vo.PaginationInfo;
import kr.or.ddit.users.dao.InterviewReviewDAO;
import kr.or.ddit.users.vo.InterviewReviewVO;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class InterviewReviewServiceImpl implements InterviewReviewService{
	private final InterviewReviewDAO dao;

	/**
	 * 면접후기 리스트 조회
	 */
	@Override
	public void retrieveReviewList(PaginationInfo<InterviewReviewVO> paging) {
		int totalRecord = dao.selectTotalRecord(paging);
		paging.setTotalRecord(totalRecord);
		List<InterviewReviewVO> dataList = dao.selectReviewList(paging);
		paging.setDataList(dataList);
		
	}
	
	/**
	 * 면접후기 상세조회
	 */
	@Override
	public InterviewReviewVO retrieveReview(String intrevNo) {
		return dao.selectReview(intrevNo);
	}
	
	/**
	 * 면접후기 등록
	 */
	@Transactional
	@Override
	public void createInterviewReview(InterviewReviewVO interviewReviewVO) {
		dao.insertInterviewReview(interviewReviewVO);
		String intrNo = interviewReviewVO.getIntrNo();
		dao.updateReviewSt(intrNo);
	}

	/**
	 * 면접후기 수정
	 */
	@Override
	public void modifyReview(InterviewReviewVO interviewReviewVO) {
		dao.updateReview(interviewReviewVO);
	}
	
}
