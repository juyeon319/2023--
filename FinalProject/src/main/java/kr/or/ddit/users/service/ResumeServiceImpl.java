package kr.or.ddit.users.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.or.ddit.common.enumpkg.ServiceResult;
import kr.or.ddit.paging.vo.PaginationInfo;
import kr.or.ddit.users.dao.ResumeDAO;
import kr.or.ddit.users.vo.CareerVO;
import kr.or.ddit.users.vo.CertificateVO;
import kr.or.ddit.users.vo.CoverLetterVO;
import kr.or.ddit.users.vo.EducationVO;
import kr.or.ddit.users.vo.IntrnActvtVO;
import kr.or.ddit.users.vo.LanguageVO;
import kr.or.ddit.users.vo.OverseasStudyVO;
import kr.or.ddit.users.vo.ResumeVO;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ResumeServiceImpl implements ResumeService{
	
	private final ResumeDAO dao;
	
	//이력서 수정
	@Transactional
	@Override
	public void modifyResume(ResumeVO resumeVO) {
		dao.updateResume(resumeVO);
		
		List<CareerVO> carList = resumeVO.getCareerVOList();
		for (CareerVO careerVO : carList) {
			careerVO.setResumeNo(resumeVO.getResumeNo());
			dao.updateCareer(careerVO);			
		}
		
		List<EducationVO> eduList = resumeVO.getEducationVOList();
		for (EducationVO educationVO : eduList) {
			educationVO.setResumeNo(resumeVO.getResumeNo());
			dao.updateEducation(educationVO);
		}
		
		List<CertificateVO> cerList = resumeVO.getCertificateVOList();
		for (CertificateVO certificateVO : cerList) {
			certificateVO.setResumeNo(resumeVO.getResumeNo());
			dao.updateCertificate(certificateVO);
		}
		
		List<IntrnActvtVO> iaList = resumeVO.getIntrnActvtVOList();
		for (IntrnActvtVO intrnActvtVO : iaList) {
			intrnActvtVO.setResumeNo(resumeVO.getResumeNo());
			dao.updateIntrnActvt(intrnActvtVO);
		}
		
		List<LanguageVO> lanList = resumeVO.getLanguageVOList();
		for (LanguageVO languageVO : lanList) {
			languageVO.setResumeNo(resumeVO.getResumeNo());
			dao.updateLanguage(languageVO);
		}
		
		List<CoverLetterVO> cvList = resumeVO.getCoverLetterVOList();
		for (CoverLetterVO coverLetterVO : cvList) {
			coverLetterVO.setResumeNo(resumeVO.getResumeNo());
			dao.updateCoverLetter(coverLetterVO);
		}
	}
	
	//이력서 등록
	@Transactional
	@Override
	public void createResume(ResumeVO resumeVO) {
		dao.insertResume(resumeVO);
		
		List<CareerVO> carList = resumeVO.getCareerVOList();
		for (CareerVO careerVO : carList) {
			careerVO.setResumeNo(resumeVO.getResumeNo());
			dao.insertCareer(careerVO);			
		}
		
		List<EducationVO> eduList = resumeVO.getEducationVOList();
		for (EducationVO educationVO : eduList) {
			educationVO.setResumeNo(resumeVO.getResumeNo());
			dao.insertEducation(educationVO);
		}
		
		List<CertificateVO> cerList = resumeVO.getCertificateVOList();
		for (CertificateVO certificateVO : cerList) {
			certificateVO.setResumeNo(resumeVO.getResumeNo());
			dao.insertCertificate(certificateVO);
		}
		
		List<IntrnActvtVO> iaList = resumeVO.getIntrnActvtVOList();
		for (IntrnActvtVO intrnActvtVO : iaList) {
			intrnActvtVO.setResumeNo(resumeVO.getResumeNo());
			dao.insertIntrnActvt(intrnActvtVO);
		}
		
		List<LanguageVO> lanList = resumeVO.getLanguageVOList();
		for (LanguageVO languageVO : lanList) {
			languageVO.setResumeNo(resumeVO.getResumeNo());
			dao.insertLanguage(languageVO);
		}
		
		List<CoverLetterVO> cvList = resumeVO.getCoverLetterVOList();
		for (CoverLetterVO coverLetterVO : cvList) {
			coverLetterVO.setResumeNo(resumeVO.getResumeNo());
			dao.insertCoverLetter(coverLetterVO);
		}
	}

	////////////이력서 상세조회////////////
	@Override
	public ResumeVO retrieveResume(String resumeNo) {
		return dao.selectResumeInfo(resumeNo);
	}
	
	//개인정보 조회
	@Override
	public ResumeVO retrieveUsersInfo(String usersId) {
		return dao.selectUsersInfo(usersId);
	}
	
	//학력 조회
	@Override
	public List<EducationVO> retrieveEduInfo(String resumeNo) {
		return dao.selectEduInfo(resumeNo);
	}
	
	//자격증 조회
	@Override
	public List<CertificateVO> retrieveCerInfo(String resumeNo) {
		return dao.selectCerInfo(resumeNo);
	}
	
	//자기소개서 조회
	@Override
	public List<CoverLetterVO> retrieveCovList(String resumeNo) {
		return dao.selectCovInfo(resumeNo);
	}
	
	//어학 조회
	@Override
	public List<LanguageVO> retrieveLagList(String resumeNo) {
		return dao.selectLagInfo(resumeNo);
	}
	
	//활동 조회
	@Override
	public List<IntrnActvtVO> retrieveInaList(String resumeNo) {
		return dao.selectInaInfo(resumeNo);
	}
	
	//해외연수 조회(수정)
	@Override
	public List<OverseasStudyVO> retrieveOstList(String resumeNo) {
		return dao.selectOstInfo(resumeNo);
	}
	
	//경력 조회
	@Override
	public List<CareerVO> retrieveCarList(String resumeNo) {
		return dao.selectCarInfo(resumeNo);
	}

	//이력서 리스트 조회
	@Override
	public void retrieveResumeList(PaginationInfo<ResumeVO> paging) {
		int totalRecord =dao.selectTotalRecord(paging);
		paging.setTotalRecord(totalRecord);
		List<ResumeVO>dataList = dao.selectResumeList(paging);
		paging.setDataList(dataList);
	}

	//이력서 삭제
	@Override
	public ServiceResult removeResume(ResumeVO resumeVO) {
		int cnt = dao.deleteResume(resumeVO);
		return cnt > 0 ? ServiceResult.OK : ServiceResult.FAIL;
	}
	
}