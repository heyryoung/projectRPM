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
                        <h4 class="title">구입하고 싶은 차량 정보를 알려주세요.</h4>

                        <dl id="dl_model">
                            <dt>차량모델</dt>
                            <dd>
                                <button type="button" class="btn_selmodel" tab="model" id="selectModel">
                                    모델 선택
                                </button>
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
                                        <option value="">선택</option>
                                        <option value="2020">2020</option>
                                        <option value="2019">2019</option>
                                        <option value="2018">2018</option>
                                        <option value="2017">2017</option>
                                        <option value="2016">2016</option>
                                        <option value="2015">2015</option>
                                        <option value="2014">2014</option>
                                        <option value="2013">2013</option>
                                        <option value="2012">2012</option>
                                        <option value="2011">2011</option>
                                        <option value="2010">2010</option>
                                        <option value="2009">2009</option>
                                        <option value="2008">2008</option>
                                        <option value="2007">2007</option>
                                        <option value="2006">2006</option>
                                        <option value="2005">2005</option>
                                        <option value="2004">2004</option>
                                        <option value="2003">2003</option>
                                        <option value="2002">2002</option>
                                        <option value="2001">2001</option>
                                    </select>
                                </div>
                            </dd>
                        </dl>
                        <dl id="dl_mileage">
                            <dt>주행거리</dt>
                            <dd><input type="text" name="mileage" class="inner_mileage" value="" title="주행거리"
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
                                        <option value="">시도 선택</option>
                                        <option value="S20" code="S20">서울</option>
                                        <option value="D31" code="D31">경기</option>
                                        <option value="S32" code="S32">인천</option>
                                        <option value="S42" code="S42">대전</option>
                                        <option value="S44" code="S44">세종</option>
                                        <option value="D43" code="D43">충북</option>
                                        <option value="D41" code="D41">충남</option>
                                        <option value="D33" code="D33">강원</option>
                                        <option value="S62" code="S62">광주</option>
                                        <option value="D63" code="D63">전북</option>
                                        <option value="D61" code="D61">전남</option>
                                        <option value="S64" code="S64">제주</option>
                                        <option value="S51" code="S51">부산</option>
                                        <option value="S53" code="S53">대구</option>
                                        <option value="S52" code="S52">울산</option>
                                        <option value="D54" code="D54">경북</option>
                                        <option value="D55" code="D55">경남</option>
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


                </fieldset>
            </form>
        </div>
    </div>
</template>
<style scoped>

    .left {
        color: #333;
        font-size: 12px;
        font-family: "돋움", Dotum, "굴림", gulim, AppleGothic, Helvetica, Sans-serif;
        float: left;
        margin: 50px 500px;
        line-height: 180%;

        padding: 50px 100px;
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