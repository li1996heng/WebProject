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

	<div class="rightinfo">

		<div class="tools">
			<ul class="toolbar">
				<li class="click"><a href="food_input.action"><span><img
							src="images/t01.png" />
					</span>添加</a>
				</li>
				<li class="click"><span><img src="images/t02.png" />
				</span>修改</li>
				<li><span><img src="images/t03.png" />
				</span>删除</li>
				<li><a href="https://www.ele.me/shop/159325176"><span><img
							src="images/t04.png" />
					</span>详情</a>
				</li>
			</ul>
			<ul class="toolbar1">
				<li><span><img src="images/t05.png" />
				</span>设置</li>
			</ul>
		</div>
		<div style="position: absolute; left:400px; top:47px">
			<s:form action="food_like.action"
						method="post">
						<input
							style="width: 300px; height: 35px;
    	 			border: #B7D5DF 1px solid;padding-left:10px; font-size:14px; color:#90a2bc;"
							type="text" name="input" id="code_input" value=""
							placeholder="   请输入查询关键字" />

						<input id="my_button" name="submit" type="submit" class="loginbtn"
							value="查询" />
			</s:form>
		</div>


		<table class="tablelist">
			<thead>
				<tr>
					<th><input name="" type="checkbox" value="" />
					</th>
					<th>编号<i class="sort"><img src="images/px.gif" />
					</i>
					</th>
					<th>店铺名称</th>
					<th>商品名称</th>
					<th>原价</th>
					<th>现价</th>
					<th>发布时间</th>
					<th>是否折扣</th>
					<th>销售状态</th>
					<th>操作</th>
				</tr>
			</thead>
			<tbody>

				<s:iterator value="list" var="e">
					<tr>
						<td width="left"><input name="" type="checkbox" value="" />
						</td>
						<td align="left"><s:property value="#e.goodsId" />
						</td>
						<td align="left"><s:property value="#e.shopTab.shopName" />
						</td>
						<td align="left"><s:property value="#e.foodName" />
						</td>
						<td align="left"><s:property value="#e.oldprice" />
						</td>
						<td align="left"><s:property value="#e.newprice" />
						</td>
						<td align="left"><s:date name="#e.newstime"
								format="yyyy-MM-dd" />
						</td>
						<td align="left"><s:property value="#e.discount" />
						</td>
						<td align="left"><s:property value="#e.hava" />
						</td>
						<td><a
							href="desc_shop.action?id=<s:property value="#e.shopTab.shopId"/>"
							class="tablelink">查看</a> <a
							href="food_edit.action?id=<s:property value="#e.goodsId"/>"
							class="tablelink">修改</a> <a class="tablelink"
							href="javascript:if(confirm('该商品将永久消失   您确定要删除吗？'))location='food_delete.action?id=<s:property value="#e.goodsId"/>'">删除</a>
						</td>
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
								<a href="${pageContext.request.contextPath }/food_list.action?currPage=1">[首页]</a>&nbsp;&nbsp;
	       						<a href="${pageContext.request.contextPath }/food_list.action?currPage=<s:property value="currPage-1"/>">[上一页]</a>&nbsp;&nbsp;
	   				</s:if> 
	   				<s:if test="currPage != totalPage">
								<a href="${pageContext.request.contextPath }/food_list.action?currPage=<s:property value="currPage+1"/>">[下一页]</a>&nbsp;&nbsp;
	       						<a href="${pageContext.request.contextPath }/food_list.action?currPage=<s:property value="totalPage"/>">[尾页]</a>&nbsp;&nbsp;
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




	</div>

	<script type="text/javascript">
		$('.tablelist tbody tr:odd').addClass('odd');
	</script>
</body>
</html>
