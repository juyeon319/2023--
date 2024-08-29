package kr.or.ddit.users.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.or.ddit.company.vo.InterviewSchdVO;
import kr.or.ddit.paging.vo.PaginationInfo;
import kr.or.ddit.users.dao.InterviewDAO;
import kr.or.ddit.users.vo.InterviewReviewVO;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class InterviewServiceImpl implements InterviewService{
	
	private final InterviewDAO dao;

	/**
	 * 면접일정 리스트 조회
	 */
	@Override
	public void retrieveInterviewSchdList(PaginationInfo<InterviewSchdVO> paging) {
		int totalRecord =dao.selectTotalRecord(paging);
		paging.setTotalRecord(totalRecord);
		List<InterviewSchdVO> dataList = dao.selectInterviewSchdList(paging);
		paging.setDataList(dataList);
	}

	/**
	 * 면접후기 상세보기(기웅)
	 */
	@Override
	public InterviewSchdVO retrieveInfo(String intrNo) {
		return dao.selectInfo(intrNo);
	}

}
