<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>网站后台管理系统HTML模板--模板之家 www.cssmoban.com</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery.js"></script>

<script type="text/javascript">
	$(document).ready(function() {/* 
	  $(".click").click(function(){
	  $(".tip").fadeIn(200);
	  }); */

		$(".tiptop a").click(function() {
			$(".tip").fadeOut(200);
		});

		$(".sure").click(function() {
			$(".tip").fadeOut(100);
		});

		$(".cancel").click(function() {
			$(".tip").fadeOut(100);
		});

	});
</script>


</head>


<body>

	<div class="place">
		<span>位置：</span>
		<ul class="placeul">
			<li><a href="#">首页</a>
			</li>
			<li><a href="#">数据表</a>
			</li>
			<li><a href="#">基本内容</a>
			</li>
		</ul>
	</div>

	<div style="margin: 10px">
		<s:form action="library_like.action" method="post">
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
				<th>图书编号<i class="sort"><img src="images/px.gif" />
				</i>
				</th>
				<th>图书类别</th>
				<th>图书名称</th>
				<th>作者</th>
				<th>出版社</th>
				<th>是否可借</th>
			</tr>
		</thead>
		<tbody>

			<s:iterator value="list" var="v">
				<tr>
					<td align="left"><s:property value="#v.bookId" /></td>
					<td align="left"><s:property value="#v.bookClass" /></td>
					<td align="left">${bookName}</td>
					<td align="left">${author}</td>
					<td align="left">${press}</td>
					<td align="left">${hava}</td>
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


	<div class="tip">
		<div class="tiptop">
			<span>提示信息</span><a></a>
		</div>

		<div class="tipinfo">
			<span><img src="images/ticon.png" />
			</span>
			<div class="tipright">
				<p>是否确认对信息的修改 ？</p>
				<cite>如果是请点击确定按钮 ，否则请点取消。</cite>
			</div>
		</div>

		<div class="tipbtn">
			<input name="" type="button" class="sure" value="确定" />&nbsp; <input
				name="" type="button" class="cancel" value="取消" />
		</div>

	</div>





	<script type="text/javascript">
		$('.tablelist tbody tr:odd').addClass('odd');
	</script>
</body>
</html>
