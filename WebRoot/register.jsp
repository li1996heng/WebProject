﻿<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>欢迎注册信息管理系统账户</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<style>
 dl,dt,dd,span{margin:0;padding:0;display:block;}
</style>
<script language="JavaScript" src="js/jquery.js"></script>
<script src="js/cloud.js" type="text/javascript"></script>
<script src="js/canvas-particle.js" type="text/javascript"></script>
<script language="javascript">

	
	
	
	$(function(){
    $('.loginbox').css({'position':'absolute','left':($(window).width()-692)/2});
	$(window).resize(function(){  
    $('.loginbox').css({'position':'absolute','left':($(window).width()-692)/2});
    })  
});  
</script> 

</head>

<body style="background-color:#1c77ac; background-image:url(images/light.png); background-repeat:no-repeat; background-position:center top; overflow:hidden;">

<div id="mydiv" style="height:auto; width:auto;">
	<script type="text/javascript">
		window.onload = function() {
		    //配置
		    var config = {
		        vx: 4,	//小球x轴速度,正为右，负为左
		        vy: 4,	//小球y轴速度
		        height: 2,	//小球高宽，其实为正方形，所以不宜太大
		        width: 2,
		        count: 200,		//点个数
		        color: "121, 162, 185", 	//点颜色
		        stroke: "130,255,255", 		//线条颜色
		        dist: 6000, 	//点吸附距离
		        e_dist: 20000, 	//鼠标吸附加速距离
		        max_conn: 10 	//点到点最大连接数
		    }

		    //调用
		    CanvasParticle(config);
		}
	</script>
    <div id="mainBody">
      <div id="cloud1" class="cloud"></div>
      <div id="cloud2" class="cloud"></div>
    </div>  


<div class="logintop">    
    <span>注册信息管理系统账号</span>    
    <ul>
    <li><a href="#">回首页</a></li>
    <li><a href="#">帮助</a></li>
    <li><a href="#">关于</a></li>
    </ul>    
    </div>
    
    <div class="loginbody">
    
    <span class="systemlogo"></span> 
     <form action="user_register.action" method="post"> 
	    <div class="loginbox">
	    	
		    <ul>
			    <li><input name="username" type="text" class="loginuser" value="" onclick="JavaScript:this.value=''"/></li>
			    <li><input name="pwd" type="password" class="loginpwd" value="" onclick="JavaScript:this.value=''"/></li>
			    <li><input name="email" type="text" class="loginpwd" value="" onclick="JavaScript:this.value=''"/></li>
			    <li><input name="" type="submit" class="loginbtn" value="注册" /></li>
		    </ul>
		    
	    </div>
    </form>
    </div>
    
    
    </div>
    <div class="loginbm">版权所有  2017  .com 仅供学习交流，勿用于任何商业用途</div>
</body>
</html>
