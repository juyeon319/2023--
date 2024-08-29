package kr.or.ddit.users.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.or.ddit.paging.vo.PaginationInfo;
import kr.or.ddit.users.vo.LikeCompanyVO;

@Mapper
public interface LikeCompanyDAO {
	
	/**
	 * 페이징 
	 */
	public int selectTotalRecord(PaginationInfo<LikeCompanyVO> paging);
	
	/**
	 * 관심기업 리스트 조회
	 */
	public List<LikeCompanyVO> selectLikeCompanyList(PaginationInfo<LikeCompanyVO> paging);

	/**
	 * 관심기업 삭제
	 */
	public int deleteLikeCompany(LikeCompanyVO likeCompanyVO);
	
}
