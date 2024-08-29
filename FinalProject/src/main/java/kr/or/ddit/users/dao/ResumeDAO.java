package kr.or.ddit.users.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.or.ddit.paging.vo.PaginationInfo;
import kr.or.ddit.users.vo.CareerVO;
import kr.or.ddit.users.vo.CertificateVO;
import kr.or.ddit.users.vo.CoverLetterVO;
import kr.or.ddit.users.vo.EducationVO;
import kr.or.ddit.users.vo.IntrnActvtVO;
import kr.or.ddit.users.vo.LanguageVO;
import kr.or.ddit.users.vo.OverseasStudyVO;
import kr.or.ddit.users.vo.ResumeVO;

@Mapper
public interface ResumeDAO {
	
	////////////////*이력서 상세조회*////////////////
	/**
	 * 이력서 개인정보 조회
	 */
	public ResumeVO selectUsersInfo(String usersId);
	
	/**
	 * 이력서 상세조회
	 */
	public ResumeVO selectResumeInfo(String resumeNo);
	
	/**
	 * 학력 조회
	 */
	public List<EducationVO> selectEduInfo(String resumeNo);
	
	/**
	 * 자격증 조회
	 */
	public List<CertificateVO> selectCerInfo(String resumeNo);
	
	/**
	 * 자기소개서 조회
	 */
	public List<CoverLetterVO> selectCovInfo(String resumeNo);
	
	/**
	 * 어학 조회
	 */
	public List<LanguageVO> selectLagInfo(String resumeNo);
	
	/**
	 * 대외활동 조회
	 */
	public List<IntrnActvtVO> selectInaInfo(String resumeNo); 
	
	/**
	 * 해외연수 조회(수정)
	 */
	public List<OverseasStudyVO> selectOstInfo(String resumeNo);
	
	/**
	 * 경력 조회
	 */
	public List<CareerVO> selectCarInfo(String resumeNo);
	
	////////////////*이력서 리스트 조회*////////////////
	/**
	 * 검색 조건에 맞는 게시글 수 조회
	 */
	public int selectTotalRecord(PaginationInfo<ResumeVO> paging);

	/**
	 * 검색 조건에 맞는 이력서 리스트 조회
	 */
	public List<ResumeVO> selectResumeList(PaginationInfo<ResumeVO> paging);

	////////////////*이력서 등록*////////////////
	/**
	 * 이력서 등록
	 */
	public int insertResume(ResumeVO resumeVO);
	
	/**
	 * 경력 등록
	 */
	public int insertCareer(CareerVO careerVO);
	
	/**
	 * 학력 등록
	 */
	public int insertEducation(EducationVO educationVO);
	
	/**
	 * 자격증 등록
	 */
	public int insertCertificate(CertificateVO certificateVO);
	
	/**
	 * 활동 등록
	 */
	public int insertIntrnActvt(IntrnActvtVO intrnActvtVO);
	
	/**
	 * 어학 등록
	 */
	public int insertLanguage(LanguageVO languageVO);
	
	/**
	 * 자기소개서 등록
	 */
	public int insertCoverLetter(CoverLetterVO coverLetterVO);
	
	////////////////*이력서 수정*////////////////
	/**
	 * 이력서 수정
	 */
	public int updateResume(ResumeVO resumeVO);
	
	/**
	 * 경력 수정
	 */
	public int updateCareer(CareerVO careerVO);
	
	/**
	 * 학력 수정
	 */
	public int updateEducation(EducationVO educationVO);
	
	/**
	 * 경험 수정
	 */
	public int updateIntrnActvt(IntrnActvtVO intrnActvtVO);
	
	/**
	 * 자격증 수정
	 */
	public int updateCertificate(CertificateVO certificateVO);
	
	/**
	 * 어학 수정
	 */
	public int updateLanguage(LanguageVO languageVO);
	
	/**
	 * 자기소개서 수정
	 */
	public int updateCoverLetter(CoverLetterVO coverLetterVO);
	
	////////////////*이력서 삭제*////////////////
	/**
	 * 이력서 삭제
	 */
	public int deleteResume(ResumeVO resumeVO);
	
}