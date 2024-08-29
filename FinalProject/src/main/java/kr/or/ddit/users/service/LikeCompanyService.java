package kr.or.ddit.users.service;

import kr.or.ddit.common.enumpkg.ServiceResult;
import kr.or.ddit.paging.vo.PaginationInfo;
import kr.or.ddit.users.vo.LikeCompanyVO;

public interface LikeCompanyService {

	/**
	 * 관심기업 리스트 조회
	 */
	public void retrieveLiekCompanyList(PaginationInfo<LikeCompanyVO> paging);
	
	/**
	 * 관심기업 삭제
	 */
	public ServiceResult removeLikeCompany(LikeCompanyVO likeCompanyVO);
	
}
