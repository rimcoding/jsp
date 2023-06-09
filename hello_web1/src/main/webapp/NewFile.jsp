<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
	<html>
    <head>
       <meta charset="UTF-8">
	<title>Insert title here</title>
	<style type="text/css">
            
            * {
                margin: 0;
                padding: 0;
                line-height: 1.5;
                list-style: none;
                text-decoration: none;
                font-size: 14px;
            }

            .wrap {
                width: 1200px;
                margin: 0 auto;
            }

            .container {
                padding: 10px 0;
                display: flex;
                /* 시작점과 끝점을 배치후 중간 배치 */
                justify-content: space-between;
            }

            .container .tab,
            .container section {
                width: 32%;
            }

            .tab {
                display: flex;
            }

            .tab section {
                width: 49.5%;
            }

            .tab .sec-tit a {
                background: #f0f0f0;
                text-align: center;
                display: block;
                display: flex;
                height: 48px;
                justify-content: center;
                align-items: center;
            }

            .tab .on .sec-tit a {
                background: tomato;
                color: #fff;
            }
            .sec-goto .lst-goto{
                display: flex;
                flex-wrap: wrap;
                justify-content: space-between;
                height: 180px;
            } 
            .lst-goto li {
                width: 48%;
            }
            .lst-goto a{
                height: 85px;
                background: rgba(0, 0, 0, 0.15);
                border-radius: 11px;
                display: flex;
                /* 가로를 중앙 정렬 */
                justify-content: center;
                /* 세로를 중앙 정렬 */
                align-items: center;
            }
          .nav-depth1{
            display: flex;
          }
          .nav-depth1>li{
            position: relative;;
          }
          .nav-depth1>li>a{
            padding: 0 40px;
            line-height: 100px;
          }
          .nav-depth1>li>a:hover{
            font-weight: bold;
            color: tomato;
            border-bottom: 3px solid tomato;
          }
          .nav-depth1:hover .nav-depth2{
            height: 135px;
          }
          .nav-depth2{
            overflow: hidden;
            width: 100%;
            padding: 0;
            background: #fff;
            height: 0;
          }
          .nav-depth2 a:hover{
            background: tomato;
            color: #fff;
          }
          .nav-depth2 a{
            display: block;
            padding: 5px 0;
            text-align: center;
          }
        </style>
    </head>
    <header>
        <h1>Green 쇼핑몰</h1>
        <nav>
            <ul class="nav-depth1">
                <li>
                    <a href="#">탑</a>
                    <ul class="nav-depth2">
                        <li><a href="#">블라우스</a></li>
                        <li><a href="#">티</a></li>
                        <li><a href="#">셔츠</a></li>
                        <li><a href="#">니트</a></li>
                    </ul>
                </li>
                <li>
                    <a href="#">아우터</a>
                    <ul class="nav-depth2">
                        <li><a href="#">자켓</a></li>
                        <li><a href="#">코트</a></li>
                        <li><a href="#">가디언</a></li>
                        <li><a href="#">머플러</a></li>
                    </ul>
                </li>
                <li>
                    <a href="#">팬츠</a>
                    <ul class="nav-depth2">
                        <li><a href="#">청바지</a></li>
                        <li><a href="#">짧은바지</a></li>
                        <li><a href="#">긴바지</a></li>
                        <li><a href="#">레깅스</a></li>
                    </ul>
                </li>
                <li>
                    <a href="#">악세사리</a>
                    <ul class="nav-depth2">
                        <li><a href="#">귀고리</a></li>
                        <li><a href="#">목걸이</a></li>
                        <li><a href="#">반지</a></li>
                        <li><a href="#">팔찌</a></li>
                    </ul>
                </li>
                </ul>
        </nav>
    </header>

    <body>
       
        <div class="wrap">
            <img src="images/slide.jpg">
            <div class="container">
                <div class="tab">
                    <section class="on">
                        <h2 class="sec-tit">
                            <a href="#">공지사항</a>
                        </h2>
                        <div>
                            <ul>
                                <li>
                                    <a href="#">2021년 2월 무이자 할부 카드 안내 2021년 2월 무이자 할부 카드 안내</a>
                                </li>
                                <li>
                                    <a href="#">쿠폰 사용안내 2021년 2월 무이자 할부 카드 안내</a>
                                </li>
                            </ul>
                        </div>
                    </section>
                    <section>
                        <h2 class="sec-tit">
                            <a href="#">갤러리</a>
                        </h2>
                        <div>
                            <ul>
                                <li>
                                    <a href="#">2021년 2월 무이자 할부 카드 안내 2021년 2월 무이자 할부 카드 안내</a>
                                </li>
                                <li>
                                    <a href="#">쿠폰 사용안내 2021년 2월 무이자 할부 카드 안내</a>
                                </li>
                            </ul>
                        </div>
                    </section>
                </div>
                <section>
                    <div>
                        <a href="#">
                            <img src="images/main_img.jpg">
                        </a>
                    </div>
                </section>
                <section class="sec-goto">
                    <div>
                        <ul class="lst-goto">
                            <li>
                                <a href="#">나의 계정</a>
                            </li>
                            <li>
                                <a href="#">헤이 음악</a>
                            </li>
                            <li>
                                <a href="#">계정 추가</a>
                            </li>
                            <li>
                                <a href="#">클라우드</a>
                            </li>
                        </ul>
                    </div>
                </section>
            </div>
        </div>
    </body>

</html>