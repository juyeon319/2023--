package kr.or.ddit.users.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.or.ddit.paging.vo.PaginationInfo;
import kr.or.ddit.users.vo.ScrapVO;

@Mapper
public interface ScrapDAO {
	
	/**
	 * 페이징
	 */
	public int selectTotalRecord(PaginationInfo<ScrapVO> paging);
	
	/**
	 * 스크랩 공고 리스트 조회
	 */
	public List<ScrapVO> selectScrapList(PaginationInfo<ScrapVO> paging);
	
	/**
	 * 스크랩 삭제
	 */
	public int deleteScrap(ScrapVO scrapVO);
	
}
