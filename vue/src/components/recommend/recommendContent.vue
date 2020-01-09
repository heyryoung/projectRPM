<template>
    <div>

        <div class="mypage_CarList interest">
            <div class="tit_area">
                <h3>추천받은 차</h3>
                <p>추천받은 차량은 최대 3개월 동안 보관되며 판매완료시 삭제됩니다.</p>

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
                            <a href="/recipt">

                                <!-- 20181217 VR차량 -->

                                <!-- //20181217 VR차량 -->
                                <img src="https://img.kcar.com/carpicture/carpicture06/pic6026/kcar_60263050_001.jpg"
                                     alt="자동차 썸네일">
                            </a>
                        </td>
                        <td class="car_info">
                            <a href="/recipt" class="name">벤츠 GLE-클래스 W166<br> GLE350 d 4MATIC 프리미엄 </a>
                            <span class="md_year">18년 11월식(18년형) &nbsp; 7,368km</span>


                            <span class="price">7,990만원 </span>


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
                                    <span class="pt">무사고</span>
                                    <span>디젤</span>
                                </li>
                                <li>
                                    <span>갈색</span>
                                    <span>SUV</span>
                                </li>
                                <li>
                                    <span>경기/인천</span>
                                    <span>
													
															5인승
													
												</span>
                                </li>
                            </ul>

                            <span class="online_buy">★1인신조 / 신차급 / 옵션우수 / 제조사보증 / 4륜 / 우수함 ★</span>
                        </td>
                        <td class="btn_area">
                            <a href="javascript:fnOnlineBuy('EC60263050','0');" class="online" id="onlineBuy0">온라인
                                구매 </a>
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
        methods: {
            goRecipt() {
                this.$router.push(`/recipt`)
            }
        }
    }
</script>