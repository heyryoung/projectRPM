<template>
    <div>
        <div class="mypage_CarList interest">
            <div class="tit_area">
                <h3>손님 리스트</h3>
                <p></p>
            </div>

            <div class="align_field">
                <div class="all_check">
                    <div class="checker" id="uniform-allCheck"><span><input type="checkbox" name="allCheck"
                                                                            id="allCheck" class="uniform" title="전체체크"></span>
                    </div>
                </div>
                <div class="align">
                    <!-- 20181217 VR차량 -->
                    <span><a href="javascript:orderbyVrFlag();" class="3dview_flag txt "><em class="vr_ordermark"></em> 3D 라이브 뷰 차량</a></span>
                    <!-- //20181217 VR차량 -->
                    <span class="basic"><a href="javascript:orderbyChange('EMC.V_REG_DTM DESC');"
                                           class="txt">기본정렬</a></span>
                    <span><a href="javascript:orderbyChange('C.N_PRICE ASC');" class="txt">가격순</a><a
                            href="javascript:orderbyChange('C.N_PRICE ASC');" class="down ">낮은순</a>
												<a href="javascript:orderbyChange('C.N_PRICE DESC');"
                                                   class="up ">높은순</a>
						</span>
                    <span><a href="javascript:orderbyChange('C.N_MILEAGE ASC');" class="txt">주행거리 순</a><a
                            href="javascript:orderbyChange('C.N_MILEAGE ASC');;" class="down ">낮은순</a>
						<a href="javascript:orderbyChange('C.N_MILEAGE DESC');"
                           class="up ">높은순</a>
						</span>
                    <span><a href="javascript:orderbyChange('C.V_MFR_DATE ASC');" class="txt">연식 순</a><a
                            href="javascript:orderbyChange('C.V_MFR_DATE ASC');" class="down ">낮은순</a>
						<a href="javascript:orderbyChange('C.V_MFR_DATE DESC');" class="up ">높은순</a>
						</span>
                </div>
            </div>
            <div class="result_list">
                <table>
                    <caption>관심차량</caption>

                    <colgroup>
                        <col style="width: 55px;">
                        <col style="width: 190px;">
                        <col style="width: 485px;">
                        <col style="width: 290px;">
                        <col>
                    </colgroup>

                    <tbody>


                    <tr>
                        <td class="check">
                            <div class="checker" id="uniform-interest_list_check1"><span><input type="checkbox"
                                                                                                id="interest_list_check1"
                                                                                                class="uniform"
                                                                                                name="i_arrCarCd"
                                                                                                value="EC60263050"
                                                                                                data-maketype="MAKE_TYPE020"></span>
                            </div>
                        </td>
                        <td class="thumb">
                            <a href="/customerDetail">

                                <!-- 20181217 VR차량 -->

                                <!-- //20181217 VR차량 -->
                                <img src="https://story-img.kakaocdn.net/dn/qoQx7/hyBwU4vCEL/RswKkc4XSgAQPTF4piHXQ0/img_xl.jpg?width=1096&height=822&face=481_327_571_426&avg=%23c9c6c7"
                                     alt="자동차 썸네일">
                            </a>
                        </td>
                        <td class="car_info">
                            <a href="/car/info/car_info_imported_detail.do?i_sCarCd=EC60263050" class="name">권혜령(35)
                                <br/>준준형 중고차 원합니다<br/>말많습니다 </a>
                            <span class="md_year"></span>


                            <span class="price"></span>


                            <span class="mark" data-mark="10;26;29" data-lease="2"><span class="tip_list tip_10"><button
                                    type="button" class="tip_btn"
                                    onclick="openHotMarkToolTip(this);">1인소유</button> <span class="tip_hot none"><b>1인소유<a
                                    href="javascript:closeHotMarkToolTip(this);" class="tip_cl">닫기</a></b><i>소유자 변경 이력이 없는 차량(대여 이력 및 법인 명의 차량 제외)</i></span></span><span
                                    class="tip_list tip_26"><button type="button" class="tip_btn"
                                                                    onclick="openHotMarkToolTip(this);">제조사AS</button> <span
                                    class="tip_hot none"><b>제조사AS<a href="javascript:closeHotMarkToolTip(this);"
                                                                    class="tip_cl">닫기</a></b><i>제조사 A/S 잔존 차량</i></span></span><span
                                    class="tip_list tip_29"><button type="button" class="tip_btn"
                                                                    onclick="openHotMarkToolTip(this);">신차급</button> <span
                                    class="tip_hot none"><b>신차급<a href="javascript:closeHotMarkToolTip(this);"
                                                                  class="tip_cl">닫기</a></b><i>출고 후 1년 이내 차량</i></span></span></span>
                        </td>
                        <td class="car_opt">
                            <ul class="opt_list">
                                <li>
                                    <span class="pt"></span>
                                    <span></span>
                                </li>
                                <li>
                                    <span></span>
                                    <span></span>
                                </li>
                                <li>
                                    <span>경기/인천</span>
                                    <span>
													
															5인승
													
												</span>
                                </li>
                            </ul>

                            <span class="online_buy"></span>
                        </td>

                    </tr>


                    </tbody>
                </table>
            </div>

            <div class="btn_cont">
                <a href="javascript:;" class="delete" onclick="fnDelete(); return false;">선택삭제</a>

                <div class="center_btn">
                    <!-- <a @click="goCompare" href="javascript:;">한눈에 비교하기</a> -->

                </div>
            </div>


            <div class="cm_pagination">
                <ul class="pagination">
                    <li class="move prev"><a href="javascript:;"><img
                            src="/resources/images/content/buy/pagination_arrows.png" border="0" alt="이전10개"
                            style="cursor:pointer"></a></li>
                    <li class="num on"><a>1</a></li>
                    <li class="move next"><a href="javascript:;"><img
                            src="/resources/images/content/buy/pagination_arrows.png" border="0" alt="다음10개"
                            style="cursor:pointer"></a></li>
                </ul>
            </div>
        </div>
    </div>
</template>
<script>
    export default {
        methods: {}
    }
</script>