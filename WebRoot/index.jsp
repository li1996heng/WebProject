<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery.js"></script>

</head>


<body>

	<div class="place">
    <span>位置：</span>
    <ul class="placeul">
    <li><a href="#">首页</a></li>
    </ul>
    </div>
    
    <div class="mainindex">
    
    
    <div class="welinfo">
    <span><img src="images/sun.png" alt="天气" /></span>
    <b>${session.user.username} 早上好，欢迎使用信息管理系统</b>
    </div>
    
    <div class="welinfo">
    <span><img src="images/time.png" alt="时间" /></span>
    <i>您上次登录的时间：${applicationScope.time}</i> （不是您登录的？<a href="user_edit.action?id=${session.user.id}">请点这里</a>）
    </div>
    
    <div class="xline"></div>
    
    <ul class="iconlist">
    
    <li><img src="images/ico01.png" /><p><a href="#">管理设置</a></p></li>
    <li><img src="images/ico02.png" /><p><a href="#">发布文章</a></p></li>
    <li><img src="images/ico03.png" /><p><a href="#">数据统计</a></p></li>
    <li><img src="images/ico04.png" /><p><a href="#">文件上传</a></p></li>
    <li><img src="images/ico05.png" /><p><a href="#">目录管理</a></p></li>
    <li><img src="images/ico06.png" /><p><a href="#">查询</a></p></li> 
            
    </ul>
    
    <div class="ibox"><a class="ibtn"><img src="images/iadd.png" />添加新的快捷功能</a></div>
    
    <div class="xline"></div>
    <div class="box"></div>
    
    <div class="welinfo">
    <span><img src="images/dp.png" alt="提醒" /></span>
    <b>信息管理系统使用指南</b>
    </div>
    
    <ul class="infolist">
    <li><span>您可以在这里直接点餐</span><a href="${pageContext.request.contextPath}/food_list.action" class="ibtn">爱美食</a></li>
    <li><span>您可以查询课程表信息</span><a href="${pageContext.request.contextPath}/course_list.action" class="ibtn">爱学习</a></li>
    <li><span>您可以查询共享单车信息</span><a href="${pageContext.request.contextPath}/bick_list.action" class="ibtn">爱出行</a></li>
    </ul>
    
    <div class="xline"></div>
    
    <div class="info"><b>查看网站使用指南，您可以了解到多种风格的B/S后台管理界面,软件界面设计，图标设计，手机界面等相关信息</b>(More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> - Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a>)</div>
    
    <ul class="umlist">
    <li><a href="#">如何发布文章</a></li>
    <li><a href="#">如何访问网站</a></li>
    <li><a href="#">如何管理广告</a></li>
    <li><a href="#">后台用户设置(权限)</a></li>
    <li><a href="#">系统设置</a></li>
    </ul>
    
    
    </div>
</body>
</html>
