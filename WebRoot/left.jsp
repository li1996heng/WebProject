<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<script language="JavaScript" src="js/jquery.js"></script>

<script type="text/javascript">
$(function(){	
	//导航切换
	$(".menuson li").click(function(){
		$(".menuson li.active").removeClass("active")
		$(this).addClass("active");
	});
	
	$('.title').click(function(){
		var $ul = $(this).next('ul');
		$('dd').find('ul').slideUp();
		if($ul.is(':visible')){
			$(this).next('ul').slideUp();
		}else{
			$(this).next('ul').slideDown();
		}
	});
})	
</script>


</head>

<body style="background:#f0f9fd;">
	<div class="lefttop"><span></span>信息管理系统</div>
    
    <dl class="leftmenu">
        
    <dd>
    <div class="title">
    <span><img src="images/leftico01.png" /></span>爱美食
    </div>
    	<ul class="menuson">
        <li class="active"><cite></cite><a href="index.jsp" target="rightFrame">首页</a><i></i></li>
        <li><cite></cite><a href="${pageContext.request.contextPath}/food_list.action" class="a_post" target="rightFrame">饿了吧</a><i></i></li>
       <!--  <li><cite></cite><a href="imgtable.jsp" target="rightFrame">图片数据表</a><i></i></li>
        <li><cite></cite><a href="form.jsp" target="rightFrame">添加编辑</a><i></i></li>
        <li><cite></cite><a href="imglist.jsp" target="rightFrame">图片列表</a><i></i></li>
        <li><cite></cite><a href="imglist1.jsp" target="rightFrame">自定义</a><i></i></li>
        <li><cite></cite><a href="tools.jsp" target="rightFrame">常用工具</a><i></i></li>
        <li><cite></cite><a href="filelist.jsp" target="rightFrame">信息管理</a><i></i></li>
        <li><cite></cite><a href="tab.jsp" target="rightFrame">Tab页</a><i></i></li>
        <li><cite></cite><a href="error.jsp" target="rightFrame">404页面</a><i></i></li> -->
        </ul>    
    </dd>
        
    
    <dd>
    <div class="title">
    <span><img src="images/leftico02.png" /></span>爱学习
    </div>
    <ul class="menuson">
        <li><cite></cite><a href="${pageContext.request.contextPath}/course_list.action?uid=${session.user.id}" target="rightFrame">课程表</a><i></i></li>
        <li><cite></cite><a href="${pageContext.request.contextPath}/library_list.action" target="rightFrame">图书馆</a><i></i></li>
        <li><cite></cite><a href="${pageContext.request.contextPath}/classroom_list.action" target="rightFrame">空教室</a><i></i></li>
        </ul>     
    </dd> 
    
    
    <dd><div class="title"><span><img src="images/leftico03.png" /></span>爱玩乐</div>
    <ul class="menuson">
       <li><cite></cite><a href="${pageContext.request.contextPath}/store_list.action" target="rightFrame">南湖街</a><i></i></li>
        <li><cite></cite><a href="${pageContext.request.contextPath}/games/bydr/bydr.html" target="rightFrame">捕鱼达人</a><i></i></li>
        <li><cite></cite><a href="${pageContext.request.contextPath}/games/xxl/xxl.html" target="rightFrame">开心消消乐</a><i></i></li>
        <li><cite></cite><a href="${pageContext.request.contextPath}/games/els/els.html" target="rightFrame">俄罗斯方块</a><i></i></li>
    </ul>    
    </dd>  
    
    
    <dd><div class="title"><span><img src="images/leftico04.png" /></span>爱出行</div>
    <ul class="menuson">
        <li><cite></cite><a href="${pageContext.request.contextPath}/bick_list.action" target="rightFrame">共享单车</a><i></i></li>
        <li><cite></cite><a href="${pageContext.request.contextPath}/bus_list.action" target="rightFrame">公交车</a><i></i></li>
        <li><cite></cite><a href="${pageContext.request.contextPath}/movie_list.action" target="rightFrame">看电影</a><i></i></li>
    </ul>
    
    </dd>   
    
    </dl>
</body>
</html>
