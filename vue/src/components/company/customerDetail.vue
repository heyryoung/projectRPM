<template>
    <div>

        <div class="form_area clearFix personal_info" id="formarea">
            <form id="write_form" name="write_form" method="post" action="" accept-charset="utf-8"
                  enctype="multipart/form-data">
                <input type="hidden" id="action" name="Action" value="">
                <input type="hidden" id="sMyCarType" name="sMyCarType" value="R">
                <input type="hidden" id="sReferer" name="sReferer" value="">
                <fieldset>
                    <legend>가격계산/판매신청</legend>
                    <div class="left">
                        <h4 class="title">xxx 고객님의 요구사항</h4>

                        <dl id="dl_model">
                            <dt>차량모델</dt>
                            <dd>
                                <h1 class="title">르노삼성 sm5 노바</h1>
                                <div>
                                    <span class="guide" value=""> </span>
                                    <input type="hidden" id="modelCode" name="modelCode" value="">
                                    <input type="hidden" id="modelName" name="modelName" value="">
                                    <input type="hidden" id="brandCode" name="brandCode" value="">
                                </div>
                            </dd>
                        </dl>
                        <dl id="dl_year">
                            <dt>연식</dt>
                            <dd>
                                <div class="select_box">
                                    <select title="연식" id="sel_year" name="year" required="">

                                        <option value="2005">2005</option>

                                    </select>
                                </div>
                            </dd>
                        </dl>
                        <dl id="dl_mileage">
                            <dt>주행거리</dt>
                            <dd><input type="text" name="mileage" class="inner_mileage" value="100000km" title="주행거리"
                                       maxlength="11" required="" onchange="this.value=this.value.replace(/[^0-9]/g,'')"
                                       onkeydown="return (event.which >= 48 &amp;&amp; event.which <= 57) || (event.which >= 96 &amp;&amp; event.which <= 105) || event.which == 8 || event.which == 46 || event.which == 37 || event.which == 39"><span>km</span>
                            </dd>
                        </dl>
                        <dl id="dl_fuel">
                            <dt>연료</dt>
                            <dd>
                                <label><input type="radio" name="fuel" value="G" title="연료" checked=""><span>휘발유</span></label>
                                <label><input type="radio" name="fuel" value="D" title="연료"><span>경유</span></label>
                                <label><input type="radio" name="fuel" value="L" title="연료"><span>LPG</span></label>
                                <label><input type="radio" name="fuel" value="E" title="연료"><span>전기</span></label>
                                <label><input type="radio" name="fuel" value="h" title="연료"><span>하이브리드</span></label>
                            </dd>
                        </dl>
                        <dl id="dl_tm">
                            <dt>변속기</dt>
                            <dd>
                                <label><input type="radio" name="tm" value="A" title="변속기"
                                              checked=""><span>오토 A/T</span></label>
                                <label><input type="radio" name="tm" value="M" title="변속기"><span>수동 M/T</span></label>
                            </dd>
                        </dl>
                        <dl id="dl_accident">
                            <dt>사고여부</dt>
                            <dd>
                                <label><input type="radio" name="accident" value="0" title="사고여부"
                                              checked=""><span>무사고</span></label>
                                <label><input type="radio" name="accident" value="1"
                                              title="사고여부"><span>사고</span></label>
                                <textarea id="txt_accident" name="txt_accident" style="display:none;" title="사고 내용"
                                          placeholder="사고 정도를 상세 입력해 주세요. "></textarea>
                            </dd>
                        </dl>
                        <dl id="dl_local">
                            <dt>지역</dt>
                            <dd class="local">
                                <div class="select_box">
                                    <select id="sel_sido" name="sido" title="시도 선택" required="">
                                        <option value="S20" code="S20">서울</option>
                                    </select>
                                </div>
                                <div class="select_box">
                                    <select id="sel_sigungu" name="sigungu" title="시군구 선택" required="">
                                        <option name="area" value="">시군구</option>
                                    </select>
                                </div>
                            </dd>
                        </dl>

                        <dl id="dl_finance">
                            <dt>소유 형태</dt>
                            <dd>
                                <label><input type="radio" name="financeType" value="C" title="보유상태" checked=""><span>자가보유</span></label>
                                <label><input type="radio" name="financeType" value="L" title="보유상태"><span>리스/렌트</span></label>
                            </dd>
                        </dl>

                    </div>
                    <div class="carlist">
                        <div class="carSearch_cont">
                            <div class="result_box_wrap">
                                <ul class="choice_area"></ul> <!-- 검색 선택 항목 javascript -->
                                <div class="until_box">
                                    <div class="top_field">
                                        <div id="totalCount" class="total">총 <strong>8,546</strong>대</div>
                                        <!-- 검색 결과 카운트 ajax -->
                                        <div class="hit"><span>인기모델</span><a href="javascript:void(0);"
                                                                             class="topSelecter"
                                                                             style="margin-right: 7px;cursor: pointer;"
                                                                             data-v_makecd="002"
                                                                             data-v_model_grp_cd="002"
                                                                             data-v_modelcd="122"
                                                                             data-v_modelnm="올 뉴 K7">올 뉴 K7</a><a
                                                href="javascript:void(0);" class="topSelecter"
                                                style="margin-right: 7px;cursor: pointer;" data-v_makecd="001"
                                                data-v_model_grp_cd="004" data-v_modelcd="141" data-v_modelnm="그랜저 IG">그랜저
                                            IG</a><a href="javascript:void(0);" class="topSelecter"
                                                     style="margin-right: 7px;cursor: pointer;" data-v_makecd="001"
                                                     data-v_model_grp_cd="019" data-v_modelcd="136"
                                                     data-v_modelnm="아반떼 AD">아반떼 AD</a><a href="javascript:void(0);"
                                                                                          class="topSelecter"
                                                                                          style="margin-right: 7px;cursor: pointer;"
                                                                                          data-v_makecd="002"
                                                                                          data-v_model_grp_cd="036"
                                                                                          data-v_modelcd="113"
                                                                                          data-v_modelnm="올 뉴 카니발">올 뉴
                                            카니발</a><a href="javascript:void(0);" class="topSelecter"
                                                      style="margin-right: 7px;cursor: pointer;" data-v_makecd="007"
                                                      data-v_model_grp_cd="002" data-v_modelcd="002"
                                                      data-v_modelnm="제네시스 G80">제네시스 G80</a><a
                                                href="javascript:void(0);" class="topSelecter"
                                                style="margin-right: 7px;cursor: pointer;" data-v_makecd="013"
                                                data-v_model_grp_cd="004" data-v_modelcd="001"
                                                data-v_modelnm="벤츠 E-클래스">벤츠 E-클래스</a></div> <!-- 인기 검색어 ajax -->
                                        <div class="search_area">
                                            <input type="text" placeholder="차량번호/판매담당자">
                                            <button type="button">검색</button>
                                        </div>
                                    </div>
                                    <div class="align_field">
                                        <div class="align">
                                            <span class="live3d"><a href="javascript:void(0);" class="3dview_flag txt"
                                                                    name="wr_eq_v_3dview_flag"><em
                                                    class="vr_ordermark"></em> 3D 라이브 뷰 차량</a></span>
                                            <span class="basic"><a href="javascript:void(0);" class="txt default"
                                                                   data-bro="order">기본정렬</a></span>
                                            <span><a href="javascript:void(0);" class="txt" data-bro="order">가격순</a><a
                                                    href="javascript:void(0);" class="down" data-show="order">낮은순</a><a
                                                    href="javascript:void(0);" class="up"
                                                    data-show="order">높은순</a></span>
                                            <span><a href="javascript:void(0);" class="txt"
                                                     data-bro="order">주행거리 순</a><a href="javascript:void(0);"
                                                                                   class="down"
                                                                                   data-show="order">낮은순</a><a
                                                    href="javascript:void(0);" class="up"
                                                    data-show="order">높은순</a></span>
                                            <span><a href="javascript:void(0);" class="txt" data-bro="order">연식 순</a><a
                                                    href="javascript:void(0);" class="down" data-show="order">낮은순</a><a
                                                    href="javascript:void(0);" class="up"
                                                    data-show="order">높은순</a></span>
                                            <input id="orderInput" class="orderbyInput" type="hidden" name="orderby"
                                                   value="">
                                            <input id="3dOrderInput" class="3dOrderInput" type="hidden"
                                                   name="wr_eq_v_3dview_flag" value="">
                                        </div>

                                        <div class="detail_check">
                                            <div class="count_sel">
                                                <div class="selectric-wrapper selectric-selectric">
                                                    <div class="selectric-hide-select"><select name="limit"
                                                                                               id="listCount"
                                                                                               class="selectric"
                                                                                               data-beusable-tracking=""
                                                                                               tabindex="-1">
                                                        <option value="15">15개</option>
                                                        <option value="30">30개</option>
                                                        <option value="45">45개</option>
                                                        <option value="60">60개</option>
                                                    </select></div>
                                                    <div class="selectric"><span class="label"
                                                                                 data-beusable-tracking="">15개</span><b
                                                            class="button">▾</b></div>
                                                    <div class="selectric-items" tabindex="-1">
                                                        <div class="selectric-scroll">
                                                            <ul>
                                                                <li data-index="0" class="selected">15개</li>
                                                                <li data-index="1" class="">30개</li>
                                                                <li data-index="2" class="">45개</li>
                                                                <li data-index="3" class="last">60개</li>
                                                            </ul>
                                                        </div>
                                                    </div>
                                                    <input class="selectric-input" tabindex="0"></div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="result_list">
                                    <table>
                                        <caption>차량검색결과</caption>

                                        <colgroup>
                                            <col style="width: 190px;">
                                            <col style="width: 300px;">
                                            <col style="width: 280px;">
                                            <col>
                                        </colgroup>

                                        <tbody>
                                        <tr>
                                            <td class="thumb"><a
                                                    href="/car/info/car_info_detail.do?i_sCarCd=EC60319243&amp;i_iInstMonth=36&amp;i_iInstRate=6.5"
                                                    target="_blank">
                                                <div class="mark_area"></div>
                                                <span class="markvr">3D VR로 보기</span><span
                                                    class="markwater">K Car 워터마크</span><img
                                                    src="https://img.kcar.com/3dcarpicture/2020/01/129/60319243_1/main/main780.jpg"
                                                    alt="자동차 썸네일"></a></td>
                                            <td class="car_info"><a
                                                    href="/car/info/car_info_detail.do?i_sCarCd=EC60319243&amp;i_iInstMonth=36&amp;i_iInstRate=6.5"
                                                    target="_blank" class="name">기아 올 뉴 카렌스<br>2.0 LPi 럭셔리 </a><span
                                                    class="md_year">15년 12월식 (16년형) &nbsp;&nbsp; 110,225km &nbsp;&nbsp;LPG</span><span
                                                    class="price">920만원</span><a
                                                    href="javascript:searchEvent.fnWindowPop('keep_pop','630','650','installment','yes', 'i_sCarCd=EC60319243&amp;maketing=car_keep_pop1&amp;i_iInstMonth=36&amp;i_iInstRate=6.5')"><span
                                                    class="monthly">월 20만원</span></a></td>
                                            <td class="car_opt">
                                                <div class="mark"></div>
                                                <ul class="opt_list">
                                                    <li><span>단순사고(접촉)</span><span>RV</span></li>
                                                    <li><span>전주</span><span></span></li>
                                                    <li><span>7인승</span><span>&nbsp;</span></li>
                                                </ul>
                                                <span class="online_buy">주행 대비 동력 컨디션 우수 / 홈서비스 출고 가능</span></td>
                                        </tr>
                                        <tr>
                                            <td class="thumb"><a
                                                    href="/car/info/car_info_detail.do?i_sCarCd=EC60315465&amp;i_iInstMonth=36&amp;i_iInstRate=6.5"
                                                    target="_blank">
                                                <div class="mark_area"></div>
                                                <img src="https://img.kcar.com/carpicture/carpicture01/pic6031/kcar_60315465_011.jpg"
                                                     alt="자동차 썸네일"></a></td>
                                            <td class="car_info"><a
                                                    href="/car/info/car_info_detail.do?i_sCarCd=EC60315465&amp;i_iInstMonth=36&amp;i_iInstRate=6.5"
                                                    target="_blank" class="name">르노삼성 SM5 노바<br>1.6 TCE </a><span
                                                    class="md_year">15년 12월식  &nbsp;&nbsp; 66,987km &nbsp;&nbsp;가솔린</span><span
                                                    class="price">1,150만원</span><a
                                                    href="javascript:searchEvent.fnWindowPop('keep_pop','630','650','installment','yes', 'i_sCarCd=EC60315465&amp;maketing=car_keep_pop1&amp;i_iInstMonth=36&amp;i_iInstRate=6.5')"><span
                                                    class="monthly">월 25만원</span></a></td>
                                            <td class="car_opt">
                                                <div class="mark"><span class="tip_list tip_09"><button type="button"
                                                                                                        class="tip_btn"
                                                                                                        onclick="openHotMarkToolTip(this);">특옵션</button> <span
                                                        class="tip_hot none"><b>특옵션<a
                                                        href="javascript:closeHotMarkToolTip(this);"
                                                        class="tip_cl">닫기</a></b><i>추가 선택 옵션 장착 혹은 최상위 등급 차량</i></span></span><span
                                                        class="tip_list tip_19"><button type="button" class="tip_btn"
                                                                                        onclick="openHotMarkToolTip(this);">짧은Km</button> <span
                                                        class="tip_hot none"><b>짧은Km<a
                                                        href="javascript:closeHotMarkToolTip(this);"
                                                        class="tip_cl">닫기</a></b><i>연 10,000km 이내 주행 차량</i></span></span><span
                                                        class="tip_list tip_30"><button type="button" class="tip_btn"
                                                                                        onclick="openHotMarkToolTip(this);">보험이력無</button> <span
                                                        class="tip_hot none"><b>보험이력無<a
                                                        href="javascript:closeHotMarkToolTip(this);"
                                                        class="tip_cl">닫기</a></b><i>정보 조회일자 기준 보험이력이 없는 차량</i></span></span>
                                                </div>
                                                <ul class="opt_list">
                                                    <li><span>단순교환</span><span>중형차</span></li>
                                                    <li><span>대구반야월</span><span></span></li>
                                                    <li><span>5인승</span><span>&nbsp;</span></li>
                                                </ul>
                                                <span class="online_buy">★누유,누수없는A급★스마트키★게트락社DCT★알카미스스피커★</span></td>
                                        </tr>
                                        <tr>
                                            <td class="thumb"><a
                                                    href="/car/info/car_info_detail.do?i_sCarCd=EC60305803&amp;i_iInstMonth=36&amp;i_iInstRate=6.5"
                                                    target="_blank">
                                                <div class="mark_area"></div>
                                                <img src="https://img.kcar.com/carpicture/carpicture10/pic6030/kcar_60305803_011.jpg"
                                                     alt="자동차 썸네일"></a></td>
                                            <td class="car_info"><a
                                                    href="/car/info/car_info_detail.do?i_sCarCd=EC60305803&amp;i_iInstMonth=36&amp;i_iInstRate=6.5"
                                                    target="_blank" class="name">쉐보레(GM대우) 더 뉴 말리부<br>1.3 터보 프리미어 프라임
                                                세이프티</a><span class="md_year">19년 02월식  &nbsp;&nbsp; 5,631km &nbsp;&nbsp;가솔린</span><span
                                                    class="price">2,490만원 <em>2,570만원</em></span><a
                                                    href="javascript:searchEvent.fnWindowPop('keep_pop','630','650','installment','yes', 'i_sCarCd=EC60305803&amp;maketing=car_keep_pop1&amp;i_iInstMonth=36&amp;i_iInstRate=6.5')"><span
                                                    class="monthly">월 53만원</span></a></td>
                                            <td class="car_opt">
                                                <div class="mark"><span class="tip_list tip_09"><button type="button"
                                                                                                        class="tip_btn"
                                                                                                        onclick="openHotMarkToolTip(this);">특옵션</button> <span
                                                        class="tip_hot none"><b>특옵션<a
                                                        href="javascript:closeHotMarkToolTip(this);"
                                                        class="tip_cl">닫기</a></b><i>추가 선택 옵션 장착 혹은 최상위 등급 차량</i></span></span><span
                                                        class="tip_list tip_10"><button type="button" class="tip_btn"
                                                                                        onclick="openHotMarkToolTip(this);">1인소유</button> <span
                                                        class="tip_hot none"><b>1인소유<a
                                                        href="javascript:closeHotMarkToolTip(this);"
                                                        class="tip_cl">닫기</a></b><i>소유자 변경 이력이 없는 차량(대여 이력 및 법인 명의 차량 제외)</i></span></span><span
                                                        class="tip_list tip_29"><button type="button" class="tip_btn"
                                                                                        onclick="openHotMarkToolTip(this);">신차급</button> <span
                                                        class="tip_hot none"><b>신차급<a
                                                        href="javascript:closeHotMarkToolTip(this);"
                                                        class="tip_cl">닫기</a></b><i>출고 후 1년 이내 차량</i></span></span>
                                                </div>
                                                <ul class="opt_list">
                                                    <li><span>무사고</span><span>중형차</span></li>
                                                    <li><span>의정부</span><span>렌트가능</span></li>
                                                    <li><span>5인승</span><span>&nbsp;</span></li>
                                                </ul>
                                                <span class="online_buy"># 신차급 컨디션 차량 ^^ # 휠 제외한 풀옵션 차량 !!</span></td>
                                        </tr>
                                        <tr>
                                            <td class="thumb"><a
                                                    href="/car/info/car_info_detail.do?i_sCarCd=EC60320954&amp;i_iInstMonth=36&amp;i_iInstRate=6.5"
                                                    target="_blank">
                                                <div class="mark_area"></div>
                                                <img src="https://img.kcar.com/carpicture/carpicture02/pic6032/kcar_60320954_011.jpg"
                                                     alt="자동차 썸네일"></a></td>
                                            <td class="car_info"><a
                                                    href="/car/info/car_info_detail.do?i_sCarCd=EC60320954&amp;i_iInstMonth=36&amp;i_iInstRate=6.5"
                                                    target="_blank" class="name">현대 i40<br>2.0 GDi 프리미엄</a><span
                                                    class="md_year">12년 02월식  &nbsp;&nbsp; 101,674km &nbsp;&nbsp;가솔린</span><span
                                                    class="price">980만원</span><a
                                                    href="javascript:searchEvent.fnWindowPop('keep_pop','630','650','installment','yes', 'i_sCarCd=EC60320954&amp;maketing=car_keep_pop1&amp;i_iInstMonth=36&amp;i_iInstRate=6.5')"><span
                                                    class="monthly">월 21만원</span></a></td>
                                            <td class="car_opt">
                                                <div class="mark"></div>
                                                <ul class="opt_list">
                                                    <li><span>단순사고(접촉)</span><span>중형차</span></li>
                                                    <li><span>성동</span><span></span></li>
                                                    <li><span>5인승</span><span>&nbsp;</span></li>
                                                </ul>
                                                <span class="online_buy"># 풀옵션 # 관리상태 # 매우우수 # 강력추천</span></td>
                                        </tr>
                                        </tbody> <!-- 검색 결과 리스트 ajax -->
                                    </table>
                                </div>

                                <div class="cm_pagination"><input id="pagingInput" class="pagingInput" type="hidden"
                                                                  name="pageno" value="">
                                    <ul class="pagination">
                                        <li class="num on"><a href="javascript:void(0);">1</a></li>
                                        <li class="num"><a href="javascript:searchEvent.pagingFn(2);">2</a></li>
                                        <li class="num"><a href="javascript:searchEvent.pagingFn(3);">3</a></li>
                                        <li class="num"><a href="javascript:searchEvent.pagingFn(4);">4</a></li>
                                        <li class="num"><a href="javascript:searchEvent.pagingFn(5);">5</a></li>
                                        <li class="num"><a href="javascript:searchEvent.pagingFn(6);">6</a></li>
                                        <li class="num"><a href="javascript:searchEvent.pagingFn(7);">7</a></li>
                                        <li class="num"><a href="javascript:searchEvent.pagingFn(8);">8</a></li>
                                        <li class="num"><a href="javascript:searchEvent.pagingFn(9);">9</a></li>
                                        <li class="num"><a href="javascript:searchEvent.pagingFn(10);">10</a></li>
                                        <li class="move next"><a href="javascript:searchEvent.pagingFn(2);">다음</a></li>
                                    </ul>
                                </div>


                                <!-- 20190625렌트노출강화 -->

                                <!-- //20190625렌트노출강화 -->
                            </div>

                        </div>
                    </div>
                </fieldset>
            </form>
        </div>
    </div>
</template>
<style scoped>
    div.result_box_wrap {
        float: left;
    }

    .carSearch_cont {
        text-align: left;
        color: #333;
        font-size: 12px;
        padding: 0;
        line-height: 180%;
        width: 1180px;
        margin: 30px 0px;
        font-family: 'Noto Sans Korean';
    }

    .carlist {
        color: #333;
        font-size: 12px;
        font-family: "돋움", Dotum, "굴림", gulim, AppleGothic, Helvetica, Sans-serif;
        float: left;
        margin: 50px 0px;
        line-height: 180%;
        padding: 10px 500px 50px 10px;
        width: 522px;
        background: #fff;
        border: 1px solid black;
    }

    .left {
        color: #333;
        font-size: 12px;
        font-family: "돋움", Dotum, "굴림", gulim, AppleGothic, Helvetica, Sans-serif;
        float: left;
        margin: 50px 50px;
        line-height: 180%;
        padding: 50px 80px;
        width: 522px;
        background: #fff;
        border: 1px solid black;
    }

    .title {
        color: #333;
        text-align: left;
        margin: 0;
        padding: 0;
        line-height: 180%;
        padding-top: 5px;
        font-size: 20px;
        font-weight: bold;
        font-family: 맑은고딕, 'Malgun Gothic';
    }

    dl {
        color: #333;
        text-align: left;
        margin: 0;
        position: relative;
        padding: 12px 0 12px;
        min-height: 33px;
        border-bottom: 1px solid black;
        line-height: 120%;
        font-size: 15px;
        font-family: 맑은고딕, 'Malgun Gothic';
        margin-top: 13px;

    }

    .btn_selmodel {
        line-height: 180%;
        padding: 0;
        margin: 0;
        border: 0;
        cursor: pointer;
        -webkit-appearance: none;
        -webkit-border-radius: 0;
        display: block;
        padding-bottom: 3px;
        width: 220px;
        height: 33px;
        background: #595959;
        color: #fff;
        text-align: center;
        font-weight: bold;
        font-size: 15px;
        font-family: 맑은고딕, 'Malgun Gothic';
    }

    dt {
        text-align: left;
        font-size: 15px;
        font-family: 맑은고딕, 'Malgun Gothic';
        margin: 0;
        padding: 0;
        position: absolute;
        top: 17px;
        left: 0;
        width: 78px;
        line-height: 120%;
        font-weight: bold;
        color: #000;
    }

    dd {
        color: #333;
        text-align: left;
        font-size: 15px;
        font-family: 맑은고딕, 'Malgun Gothic';
        margin: 0;
        padding: 0;
        line-height: 180%;
        padding-left: 78px;
    }

    input[type="text"] {
        margin: 0;
        -webkit-appearance: none;
        -webkit-border-radius: 0;
        vertical-align: middle;
        padding: 0 10px 3px;
        width: 220px;
        height: 33px;
        border: 1px solid #b2b2b2;
        line-height: 120%;
        font-size: 15px;
        font-family: 맑은고딕, 'Malgun Gothic';
        -webkit-box-sizing: border-box;
        padding-right: 40px;
        text-align: right;
    }
</style>