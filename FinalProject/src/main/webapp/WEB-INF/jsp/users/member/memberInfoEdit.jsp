<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js" ></script>
<div class="memberInfo">
    <div id="sri_section">
        <!-- 사이드 메뉴 -->
        <div id="sri_gnb_wrap">
            <ul class="gnb">
                <li class="only">
                    <a href="/zf_user/member/persons/main" onmousedown="pushDataLayer('ga_lead', 'pc_my_gnb', 'main', '')">
                        <svg>
                            <use xlink:href="#svg_my_14"></use>
                        </svg>
                        <span class="txt"></span>
                    </a>
                </li>
                <li class="only selected">
                    <a href="<%=request.getContextPath() %>/user/info" onmousedown="pushDataLayer('ga_lead', 'pc_my_gnb', 'mag', '')">
                        <svg>
                            <use xlink:href="#svg_my_16"></use>
                        </svg>
                        <span class="txt">개인정보관리</span>
                    </a>
                </li>
                <li class="only">
                    <a href="<%=request.getContextPath() %>/user/resume/new" onmousedown="pushDataLayer('ga_lead', 'pc_my_gnb', 'mag', '')">
                        <svg>
                            <use xlink:href="#svg_my_16"></use>
                        </svg>
                        <span class="txt">이력서 등록</span>
                    </a>
                </li>
                <li class="only">
                    <a href="<%=request.getContextPath() %>/user/resumeList" onmousedown="pushDataLayer('ga_lead', 'pc_my_gnb', 'mag', '')">
                        <svg>
                            <use xlink:href="#svg_my_16"></use>
                        </svg>
                        <span class="txt">이력서 관리</span>
                    </a>
                </li>
                <li class="only">
                    <a href="<%=request.getContextPath() %>/user/scrapList" onmousedown="pushDataLayer('ga_lead', 'pc_my_gnb', 'scrap', '')">
                        <svg>
                            <use xlink:href="#svg_my_18"></use>
                        </svg>
                        <span class="txt">스크랩/관심기업</span>
                    </a>
                </li>
                <li class="only">
                    <a href="<%=request.getContextPath() %>/user/applyList" onmousedown="pushDataLayer('ga_lead', 'pc_my_gnb', 'apply', '')">
                        <svg>
                            <use xlink:href="#svg_my_20"></use>
                        </svg>
                        <span class="txt">입사지원현황</span>
                    </a>
                </li>
                <li class="only">
                    <a href="<%=request.getContextPath() %>/user/interviewScheduleList" onmousedown="pushDataLayer('ga_lead', 'pc_my_gnb', 'apply', '')">
                        <svg>
                            <use xlink:href="#svg_my_20"></use>
                        </svg>
                        <span class="txt">면접일정</span>
                    </a>
                </li>
                <li class="only">
                    <a href="<%=request.getContextPath() %>/user/interviewReviewList" onmousedown="pushDataLayer('ga_lead', 'pc_my_gnb', 'qna', '')">
                        <svg>
                            <use xlink:href="#svg_my_22"></use>
                        </svg>
                        <span class="txt">면접후기</span>
                    </a>
                </li>
                <li class="only">
                    <a href="<%=request.getContextPath() %>/myPage_PointCouponTicketView" onmousedown="pushDataLayer('ga_lead', 'pc_my_gnb', 'point', '')">
                        <svg>
                            <use xlink:href="#svg_my_23"></use>
                        </svg>
                        <span class="txt">포인트/쿠폰/이용권</span>
                    </a>
                </li>
            </ul>
        </div>
        <!-- 사이드 메뉴 끝 -->
        <!-- 데이터 -->
        <div id="sri_wrap">
            <div id="content">
                <script type="text/javascript" src="/js/ui-component.js?v=20231114103235"></script>
                <script type="text/javascript" src="/js/httpRequest.js"></script>
                <div class="wrapper_narrow">
                    <h1 class="wrap_title">개인정보 관리</h1>
                    <form id="frm" name="frm" method="post" action="/FinalProject/user/editPost" enctype="multipart/form-data">
                        <div class="person_update">
                            <div class="person_update_sidearea">
                                <div class="photo_wrap">
                                    <span class="photo" id="myhome_profile_photo"><img id="jyImg" alt="" src="">
                                        <img id="jyImg" alt="" src="<%=request.getContextPath()%>/recruit/usersInfo${member.users.usersImg}" />
                                    </span>
                                    <span class="photo_border"></span>
                                    <input type="file" id="jyFile" name="uploadFiles" style="display:none">
                                    <button type="button" onclick="fChgImg()" class="btn_photo" aria-label="프로필 편집/삭제" aria-haspopup="menu"></button>
                                </div>
                            </div>
                            <div class="person_update_main">
                                <div class="person_field_wrap">
                                    <h2 class="person_field_legend">기본정보</h2>
                                    <table class="person_field_table">
                                        <tr class="person_field active">
                                            <th>아이디</th>
                                            <td>
                                                ${member.memId }
                                                <input type="hidden" name="memId" value="${member.memId}" />
                                            </td>
                                        </tr>
                                        <tr class="person_field active">
                                            <th>새 비밀번호</th>
                                            <td><input type="password" id="newPassword" name="memPass" class="form-control" value="" placeholder="영문자 + 숫자 + 특수문자 (8-20자)" /></td>
                                        </tr>
                                        <tr class="person_field active">
                                            <th>비밀번호 확인</th>
                                            <td>
                                                <input type="password" id="memPassConfirm" class="form-control" value="" placeholder="영문자 + 숫자 + 특수문자 (8-20자)"/>
                                                <button type="button" id="checkPasswordBtn" class="BtnType SizeL defalt btn_cert_pop collet_btn">확인</button>
                                            </td>
                                        </tr>
                                        <tr class="person_field active">
                                            <th scope="row">이름</th>
                                            <td><input type="text" name="users.usersNm" class="form-control" value="${member.users.usersNm }">
                                            </td>
                                        </tr>
                                        <tr class="person_field active">
                                            <th scope="row">생년월일</th>
                                            <td>
                                                <input type="text" name="users.usersBir" class="form-control" placeholder="YYYYMMDD" value="${member.users.usersBir }">
                                            </td>
                                        </tr>
                                        <tr class="person_field active">
                                            <th scope="row">성별</th>
                                            <td>
                                                <div class="person_field_body person_field_edit radiogroup">
                                                    <div class="InpBox">
                                                        <span class="Rdo">
                                                            <input type="radio" name="users.usersGen" id="sexMale" value="M" ${member.users.usersGen=='M' ? 'checked' : '' }>
                                                            <label class="Lbl" for="sexMale">남성</label>
                                                        </span>
                                                    </div>
                                                    <div class="InpBox">
                                                        <span class="Rdo">
                                                            <input type="radio" name="users.usersGen" id="sexFemale" value="F" ${member.users.usersGen=='F' ? 'checked' : '' }>
                                                            <label class="Lbl" for="sexFemale">여성</label>
                                                        </span>
                                                    </div>
                                                </div>
                                            </td>
                                        </tr>
                                        </tbody>
                                    </table>
                                </div>
                                <div class="person_field_wrap">
                                    <h2 class="person_field_legend">연락처 정보</h2>
                                    <table class="person_field_table">
                                        <tbody>
                                            <tr class="person_field person_field_cell">
                                                <th scope="row">휴대폰</th>
                                                <td><input type="text" name="memTel" class="form-control" value="${member.memTel }"> </td>
                                            </tr>
                                            <tr class="person_field person_field_mail">
                                                <th scope="row">이메일</th>
                                                <td><input type="email" name="memMail" class="form-control" value="${member.memMail }"></td>
                                            </tr>
                                            <tr class="person_field active">
                                                <th scope="row">주소</th>
                                                <td>
                                                    <div class="person_field_body person_field_edit">
                                                        <div class="TypoBox">
                                                            <input type="text" id="sample6_postcode" name="memZip" class="Typo address_domestic _searchArea" value="${member.memZip }" style="width: 100px;">
                                                        </div>
                                                        <input type="button" onclick="sample6_execDaumPostcode()" class="BtnType SizeL defalt btn_cert_pop collet_btn" value="우편번호 찾기"><br>
                                                        <div class="TypoBox">
                                                            <input type="text" id="sample6_address" name="memAddr1" class="Typo address_domestic _searchArea" value="${member.memAddr1 }" style="width: 305px;">
                                                        </div>
                                                        <div class="TypoBox">
                                                            <input type="text" id="sample6_detailAddress" name="memAddr2" class="Typo address_domestic _searchArea" value="${member.memAddr2 }" style="width: 305px;">
                                                        </div>
                                                        <div>
                                                            <input type="hidden" id="sample6_extraAddress" placeholder="참고항목">
                                                        </div>
                                                    </div>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td colspan="2">
                                                    <input type="submit" value="저장" class="btn btn-primary btn-lg" />
                                                    <a href="<c:url value='/user/info'/>" class="btn btn-secondary btn-lg">취소</a>
                                                </td>
                                            </tr>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>

<script>
document.addEventListener("DOMContentLoaded", function() {
    //이미지 수정
    const jyFile = document.querySelector("#jyFile");
    const jyImg = document.querySelector("#jyImg");

    jyFile.addEventListener("change", () => {
        const file = jyFile.files[0];
        if (file) {
            const fileReader = new FileReader();
            fileReader.onload = function() {
                jyImg.src = fileReader.result;
                const lastImage = document.querySelector("#myhome_profile_photo img:last-child");
                if (lastImage) {
                    lastImage.remove();
                }
            };
            fileReader.readAsDataURL(file);
        }
    });

    //프로필 이미지 변경 버튼 클릭
    document.querySelector(".btn_photo").addEventListener("click", function() {
        jyFile.click();
    });

    //비밀번호 확인 버튼 클릭 시 이벤트
    document.querySelector("#checkPasswordBtn").addEventListener("click", function() {
        const newPassword = document.querySelector("#newPassword").value;
        const memPassConfirm = document.querySelector("#memPassConfirm").value;

        if (newPassword === memPassConfirm) {
            alert("비밀번호가 일치합니다.");
        } else {
            alert("비밀번호가 일치하지 않습니다.");
        }
    });

    //폼 제출 시 비밀번호 일치 여부 확인
    document.querySelector("#frm").addEventListener("submit", function(event) {
        const newPassword = document.querySelector("#newPassword").value;
        const memPassConfirm = document.querySelector("#memPassConfirm").value;

        if (newPassword !== memPassConfirm) {
            alert("비밀번호가 일치하지 않습니다.");
            event.preventDefault(); // 폼 제출을 막음
        }
    });
});

//우편번호 API
function sample6_execDaumPostcode() {
    new daum.Postcode({
        oncomplete: function(data) {
            let addr = '';
            let extraAddr = '';

            if (data.userSelectedType === 'R') { 
                addr = data.roadAddress;
                if (data.bname && /[동|로|가]$/g.test(data.bname)) {
                    extraAddr += data.bname;
                }
                if (data.buildingName && data.apartment === 'Y') {
                    extraAddr += (extraAddr !== '' ? ', ' : '') + data.buildingName;
                }
                if (extraAddr !== '') {
                    extraAddr = ' (' + extraAddr + ')';
                }
                document.getElementById("sample6_extraAddress").value = extraAddr;
            } else {
                addr = data.jibunAddress;
                document.getElementById("sample6_extraAddress").value = '';
            }

            document.getElementById('sample6_postcode').value = data.zonecode;
            document.getElementById("sample6_address").value = addr;
            document.getElementById("sample6_detailAddress").value = '';
            document.getElementById("sample6_detailAddress").focus();
        }
    }).open();
}

</script>
