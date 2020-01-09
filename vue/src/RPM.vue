<template>
    <div class="container">
        <link rel="stylesheet" href="https://www.kcar.com/resources/css/re_import.css?v=20191230094250">
        <link rel="stylesheet" href="https://www.kcar.com/resources/css/plugin/selectric.css?v=20191230094250">
        <link rel="stylesheet" type="text/css" href="https://www.kcar.com/resources/css/plugin/ion.rangeSlider.css">
        <link rel="stylesheet" type="text/css" href="https://www.kcar.com/resources/css/plugin/ion.rangeSlider.skinHTML5.css">
        <link rel="stylesheet" href="https://www.kcar.com/resources/css/plugin/uniform.css">
        <link rel="stylesheet" href="https://www.kcar.com/resources/css/plugin/jquery.scrollbar.css">
        <link rel="stylesheet" type="text/css" href="http://static.danawa.com/new/recss/auto/common.css?v=200108090126">
        <link rel="stylesheet" type="text/css" href="http://static.danawa.com/new/recss/auto/home.css?v=200108090126">
        <link rel="stylesheet" type="text/css" href="http://static.danawa.com/new/recss/auto/theme.css?v=200108090126">
        <link rel="stylesheet" type="text/css" href="http://static.danawa.com/new/recss/auto/auto.css?v=200108090126">
        <link rel="stylesheet" type="text/css" href="http://static.danawa.com/new/recss/auto/window.css?v=200108090126">
        <link rel="stylesheet" type="text/css" href="http://static.danawa.com/new/recss/auto/compare.css?v=200103163154">
                <nav class="navbar navbar-toggleable-sm fixed-top bg-primary navbar-light">
                    <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse justify-content-start" id="navbarSupportedContent">
                        <ul class="navbar-nav">
                            <li class="nav-item">
                              <Slide disableOutsideClick noOverlay>
                                <router-link to="/">HOME</router-link>
                                <router-link to="/login">로그인</router-link>
                                <router-link to="/join">회원가입</router-link>
                                <router-link to="/searchmain">검색창</router-link>
                                <router-link to="/product">제품</router-link>
                                <router-link to="/mypage">마이페이지</router-link>
                                <router-link to="/seencar">최근 본 차량(비교함)</router-link>
                                <router-link to="/mapList">주유소 지도</router-link>
                                <router-link to="/buycar">자동차구매 </router-link>
                                <router-link to="/buycarSelectGoods">자동차구매1 </router-link>
                                <router-link to="/buycarInsertContractorInfomation">자동차구매2 </router-link>
                                <router-link to="/buycarInsertContractorInfomation">자동차구매3 </router-link>
                                  <a href="/recommendHome"> 딜러에게 추천받기</a>
                                <a id="home" href="#">
                                  <span>차계부</span>
                                </a>
                                <a id="home" href="#">
                                  <span>관심차량</span>
                                </a>
                                <a id="home" href="#">
                                  <span>SNS(REVIEW)</span>
                                </a>
                                <a id="home" href="/companyHome">
                                  <span>ADMIN</span>
                                </a>
                              </Slide >
                            </li>
<!--                             <li class="nav-item">
                                <a class="nav-link" href="#section1">Section 1</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="#section2">Section 2</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="#section3">Section 3</a>
                            </li> -->
                        </ul>
                    </div>
                </nav>
                    <div class="container-fluid section"  id="about">
                      <div class="container text-center">
                          <div class="row align-items-center">
                              <div class="col">
                                <router-view></router-view>
                            </div>
                          </div>		
                       </div>
                      </div> 
        </div>
</template>

<script>
import {Slide} from 'vue-burger-menu'
export default {
  name: 'app',
  components: {
    Slide
  }
}
</script>

<style>

.about{
  margin : 0px auto;
}

 html, body {
   height : 100% !important;
} 

.container-fluid > .container, .container > .row {
  height: 100%;
}
#about{
  margin-top:50px;
}
.text-light{
  margin-top:50px;
}
nav {
  min-height: 5rem;
}

nav.fixed-top {
  padding: 0.5rem;
}
nav.bg-primary li a {
  color: #fff !important;
}
nav li a.active {
  padding: .2rem .4rem;
  color: #0275d8 !important;
  background-color: #fff;
  border-radius: .2rem;
  margin: .3rem 0.6rem;
}
nav .navbar-collapse.collapsing ul,
nav .navbar-collapse.show ul {
  margin-top: 3rem;
}
nav .navbar-collapse.collapsing li a,
nav .navbar-collapse.show li a  {
  padding: 0.5rem;
}
nav .navbar-collapse.show li a.active  {
  margin: 0;
}
.navbar-toggler {
  border: 0;
}
.bg-primary {
    color: #fff;
    background-color: black !important;
}
.container{
        margin: 0 200px;
    }
</style>