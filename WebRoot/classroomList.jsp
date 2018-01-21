<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>网站后台管理系统HTML模板--模板之家 www.cssmoban.com</title>
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/jquery-1.10.2.min.js"></script>
<script type="text/javascript" src="js/kkpager.min.js"></script>
<link rel="stylesheet" type="text/css" href="css/kkpager_orange.css" />
<link rel="stylesheet" type="text/css" href="css/style.css" />


</head>


<body>

	<div class="place">
    <span>位置：</span>
    <ul class="placeul">
    <li><a href="#">首页</a></li>
    <li><a href="#">数据表</a></li>
    <li><a href="#">基本内容</a></li>
    </ul>
    </div>
    
    <div class="rightinfo">
    
   <%--  <div class="tools">
    
    	<ul class="toolbar">
        <li class="click"><a href="food_input.action"><span><img src="images/t01.png" /></span>添加</a></li>
        <li class="click"><span><img src="images/t02.png" /></span>修改</li>
        <li><span><img src="images/t03.png" /></span>删除</li>
        <li><a href="https://www.ele.me/shop/159325176"><span><img src="images/t04.png" /></span>详情</a></li>
        </ul>
        
        
        <ul class="toolbar1">
        <li><span><img src="images/t05.png" /></span>设置</li>
        </ul>
    
    </div> --%>
    
    <div style="margin: 10px">
		<s:form action="classroom_like.action" method="post">
			<input
				style="width: 300px; height: 35px;
    	 			border: #B7D5DF 1px solid;padding-left:10px; font-size:14px; color:#90a2bc;"
				type="text" name="input" id="code_input" value="" placeholder="   请输入查询关键字" />

			<input id="my_button" name="submit" type="submit" class="loginbtn"
				value="查询" />
		</s:form>
	</div>
    
    <table class="tablelist">
    	<thead>
    	<tr>
        <th>教室编号<i class="sort"><img src="images/px.gif" /></i></th>
        <th>教室名称</th>
        <th>上课班级</th>
        <th>授课老师</th>
        <th>是否为空教室</th>
        </tr>
        </thead>
        <tbody>
        
       <s:iterator value="list" var="e">
       		<tr>
        		<td align="left"><s:property value="#e.classroomId" /></td>
        		<td align="left"><s:property value="#e.classroomName" /></td>
        		<td align="left"><s:property value="#e.class_" /></td>
        		<td align="left"><s:property value="#e.teacher" /></td>
        		<td align="left"><s:property value="#e.hava" /></td>
        	</tr>
       </s:iterator>
       </tbody>
    </table>
    <div style="position:absolute; right: 50px">
			<table border="0" cellspacing="0" cellpadding="0" width="900px">
				<tr>
					<td align="right"><span>第<s:property value="currPage" />/<s:property
								value="totalPage" />页</span>&nbsp;&nbsp; <span>总记录数：<s:property
								value="totalCount" />&nbsp;&nbsp;每页显示:<s:property
								value="pageSize" />
					</span>&nbsp;&nbsp; <span> 
					<s:if test="currPage != 1">
								<a href="${pageContext.request.contextPath }/library_list.action?currPage=1">[首页]</a>&nbsp;&nbsp;
	       						<a href="${pageContext.request.contextPath }/library_list.action?currPage=<s:property value="currPage-1"/>">[上一页]</a>&nbsp;&nbsp;
	   				</s:if> 
	   				<s:if test="currPage != totalPage">
								<a href="${pageContext.request.contextPath }/library_list.action?currPage=<s:property value="currPage+1"/>">[下一页]</a>&nbsp;&nbsp;
	       						<a href="${pageContext.request.contextPath }/library_list.action?currPage=<s:property value="totalPage"/>">[尾页]</a>&nbsp;&nbsp;
	   				</s:if> </span></td>
				</tr>
			</table>
		</div>
    
    
		<div id="kkpager"></div>
		
	</div>
    <!-- 隔行变色效果 -->
    <script type="text/javascript">
	$('.tablelist tbody tr:odd').addClass('odd');
	</script>

<%-- <script type="text/javascript">
//生成分页控件  
kkpager.generPageHtml({
    pno : '${currPage}',
    mode : 'link', //可选，默认就是link
    //总页码  
    total : '${totalPage}',  
    //总数据条数  
    totalRecords : '${totalCount}',  
    //链接前部  
    hrefFormer : 'classroom_list.action?currPage=1',
    //链接尾部  
    hrefLatter : 'classroom_list.action?currPage=8',
    //链接算法
    getLink : function(n){
        //这里是默认算法，算法适用于比如：
        //hrefFormer=http://www.xx.com/news/20131212
        //hrefLatter=.html
        //那么首页（第1页）就是http://www.xx.com/news/20131212.html
        //第2页就是http://www.xx.com/news/20131212_2.html
        //第n页就是http://www.xx.com/news/20131212_n.html
        if(n == 1){
            return this.hrefFormer + this.hrefLatter;
        }
        return this.hrefFormer + '_' + n + this.hrefLatter;
    }

});
</script> --%>
</body>
</html>
