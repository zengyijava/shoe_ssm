<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="zh-CN">
<head>
<title>名牌鞋网站-后台首页</title>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/common.css">
<link rel="stylesheet" href="css/style.css">
<!--  
<link rel="shortcut icon" href="../images/copylogo.png" type="image/x-icon" />
-->
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/jquery.SuperSlide.js"></script>
<script type="text/javascript">
    $(function(){
        $(".sideMenu").slide({
            titCell:"h3",
            targetCell:"ul",
            defaultIndex:0,
            effect:'slideDown',
            delayTime:'500' ,
            trigger:'click',
            triggerTime:'150',
            defaultPlay:true,
            returnDefault:false,
            easing:'easeInQuint',
            endFun:function(){
                scrollWW();
            }
        });
        $(window).resize(function() {
            scrollWW();
        });
    });
    function scrollWW(){
        if($(".side").height()<$(".sideMenu").height()){
            $(".scroll").show();
            var pos = $(".sideMenu ul:visible").position().top-38;
            $('.sideMenu').animate({top:-pos});
        }else{
            $(".scroll").hide();
            $('.sideMenu').animate({top:0});
            n=1;
        }

    }

    var n=1;
    function menuScroll(num){
        var Scroll = $('.sideMenu');
        var ScrollP = $('.sideMenu').position();
        if(num==1){
            Scroll.animate({top:ScrollP.top-38});
            n = n+1;
        }else{
            if (ScrollP.top > -38 && ScrollP.top != 0) { ScrollP.top = -38; }
            if (ScrollP.top<0) {
                Scroll.animate({top:38+ScrollP.top});
            }else{
                n=1;
            }
            if(n>1){
                n = n-1;
            }
        }
    }

    function showpage(obj,page){
        $("#rightMain").attr("src",page);
        $("#sideMenu li").removeClass("on");
        $(obj).parent().addClass("on");
        $("#here_area").text("当前位置："+$(obj).text());
    }
</script>
</head>
<body>
<div class="top">
    <div id="top_t">
        <div id="" class=""></div>     <!-- logo2.png -->
        <div id="photo_info" class="fr">
            <div id="photo" class="fl">
                <a href="#"><img src="" alt="名牌鞋网站" width="60" height="60"></a>
            </div>
            <div id="base_info" class="fr">
                <div class="help_info">
                    <a href="1" id="hp">&nbsp;</a>
                    <a href="2" id="gy">&nbsp;</a>
                    <a href="../index.html" id="out">&nbsp;</a>
                </div>
                <div class="info_center">
                  名牌鞋网站
                    <span id="nt">通知</span><span><a href="#" id="notice">3</a></span>
                </div>
            </div>
        </div>
    </div>
    <div id="side_here">
        <div id="side_here_l" class="fl"></div>
        <div id="here_area" class="fl">当前位置：浏览界面</div>
    </div>
</div>
<!--  -->
<%-- --%>

<div class="side">
    <div class="sideMenu" id="sideMenu" style="margin:0 auto">
        <h3>用户信息</h3>
        <ul>
            <li><a href="javascript:void(0)" onclick="showpage(this,'page/admin.html')">添加管理员</a></li>
            <li><a href="javascript:void(0)" onclick="showpage(this,'page/view.html')">管理员信息</a></li>
            <li><a href="javascript:void(0)" onclick="showpage(this,'page/user.html')">会员信息</a></li>
        </ul>
        <h3>商品信息</h3>
        <ul>
            <li><a href="javascript:void(0)" onclick="showpage(this,'page/type.html')">商品类型管理</a></li>
            <li><a href="javascript:void(0)" onclick="showpage(this,'page/goods.html')">商品信息管理</a></li>
            <li><a href="javascript:void(0)" onclick="showpage(this,'page/view.html')">商品信息浏览</a></li>
        </ul>
        <h3>个人中心信息</h3>
        <ul>
            <li><a href="javascript:void(0)" onclick="showpage(this,'page/welcome.html')">个人信息</a></li>
            <li><a href="javascript:void(0)" onclick="showpage(this,'page/view_news.html')">修改密码</a></li>
        </ul>
    </div>
</div>
<div class="main">
    <iframe name="right" id="rightMain" src="page/welcome.html" frameborder="no" scrolling="auto" width="100%" height="auto" allowtransparency="true"></iframe>
</div>
<div class="bottom">
    <div id="bottom_bg"><a class="copy" href="#">计算机科学与技术学院</a>&copy;版权所有 0734-8355998</div>
</div>
<div class="scroll">
    <a href="javascript:;" class="per" title="使用鼠标滚轴滚动侧栏" onclick="menuScroll(1);"></a>
    <a href="javascript:;" class="next" title="使用鼠标滚轴滚动侧栏" onclick="menuScroll(2);"></a>
</div>
</body>
</html>
