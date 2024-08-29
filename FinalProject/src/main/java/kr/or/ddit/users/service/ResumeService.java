package kr.or.ddit.users.service;

import java.util.List;

import kr.or.ddit.common.enumpkg.ServiceResult;
import kr.or.ddit.paging.vo.PaginationInfo;
import kr.or.ddit.users.vo.CareerVO;
import kr.or.ddit.users.vo.CertificateVO;
import kr.or.ddit.users.vo.CoverLetterVO;
import kr.or.ddit.users.vo.EducationVO;
import kr.or.ddit.users.vo.IntrnActvtVO;
import kr.or.ddit.users.vo.LanguageVO;
import kr.or.ddit.users.vo.OverseasStudyVO;
import kr.or.ddit.users.vo.ResumeVO;

public interface ResumeService {
	
	////////////////*이력서 상세조회*////////////////
	/**
	* 이력서 개인정보 조회
	*/
	public ResumeVO retrieveUsersInfo(String usersId);

	/**
	 * 이력서 상세조회
	 */
	public ResumeVO retrieveResume(String resumeNo);
	
	/**
	 * 학력 조회
	 */
	public List<EducationVO> retrieveEduInfo(String resumeNo);
	
	/**
	 * 자격증 조회
	 */
	public List<CertificateVO> retrieveCerInfo(String resumeNo);
	
	/**
	 * 자기소개서 조회
	 */
	public List<CoverLetterVO> retrieveCovList(String resumeNo);
	
	/**
	 * 어학 조회
	 */
	public List<LanguageVO> retrieveLagList(String resumeNo);
	
	/**
	 * 대외활동 조회
	 */
	public List<IntrnActvtVO> retrieveInaList(String resumeNo);
	
	/**
	 * 해외연수 조회
	 */
	public List<OverseasStudyVO> retrieveOstList(String resumeNo);
	
	/**
	 * 경력사항 조회
	 */
	public List<CareerVO> retrieveCarList(String resumeNo);
	
	////////////////*이력서 리스트 조회*////////////////
	/**
	 * 이력서 리스트 조회
	 */
	public void retrieveResumeList(PaginationInfo<ResumeVO> paging);
	
	////////////////*이력서 등록*////////////////
	/**
	 * 이력서 등록
	 */
	public void createResume(ResumeVO resumeVO);
	
	////////////////*이력서 수정*////////////////
	/**
	 * 이력서 수정
	 */
	public void modifyResume(ResumeVO resumeVO);
	
	////////////////*이력서 삭제*////////////////
	/**
	 * 이력서 삭제
	 */
	public ServiceResult removeResume(ResumeVO resumeVO);
}