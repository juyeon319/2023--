package kr.or.ddit.users.service;

import java.util.List;

import org.springframework.stereotype.Service;

import kr.or.ddit.common.enumpkg.ServiceResult;
import kr.or.ddit.paging.vo.PaginationInfo;
import kr.or.ddit.users.dao.ScrapDAO;
import kr.or.ddit.users.vo.ScrapVO;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ScrapServiceImpl implements ScrapService{

	private final ScrapDAO scrapDAO;

	/**
	 * 스크랩 공고 리스트 조회
	 */
	@Override
	public void retrieveScrapList(PaginationInfo<ScrapVO> paging) {
		int totalRecord = scrapDAO.selectTotalRecord(paging);
	      paging.setTotalRecord(totalRecord);
	      List<ScrapVO> dataList = scrapDAO.selectScrapList(paging);
	      paging.setDataList(dataList);
	}

	/**
	 * 스크랩 삭제
	 */
	@Override
	public ServiceResult removeScrap(ScrapVO scrapVO) {
		int cnt = scrapDAO.deleteScrap(scrapVO);
		return cnt > 0 ? ServiceResult.OK : ServiceResult.FAIL;
	}

}
