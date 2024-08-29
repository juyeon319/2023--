package kr.or.ddit.users.service;

import kr.or.ddit.common.enumpkg.ServiceResult;
import kr.or.ddit.paging.vo.PaginationInfo;
import kr.or.ddit.users.vo.ScrapVO;

public interface ScrapService {
	
	/**
	 * 스크랩 공고 리스트 조회
	 */
	public void retrieveScrapList(PaginationInfo<ScrapVO> paging);
	
	/**
	 * 스크랩 삭제
	 */
	public ServiceResult removeScrap(ScrapVO scrapVO);

}
