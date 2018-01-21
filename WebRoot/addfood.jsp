<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>添加店铺</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<link href="css/dcalendar.picker.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery-1.10.2.min.js"></script>                  
<script type="text/javascript" src="js/dcalendar.picker.js"></script>
</head>

<body>
	<div class="place">
    <span>位置：</span>
    <ul class="placeul">
    <li><a href="#">首页</a></li>
    <li><a href="#">添加</a></li>
    </ul>
    </div>
    
    <div class="formbody">
    <div class="formtitle"><span>基本信息</span></div>
	    <s:form action="food_add.action" method="post" theme="css_xhtml" namespace="/">
	    <ul class="forminfo">
	    <li><label><font style="font-size: 13pt">店铺名称</font></label><s:select cssStyle="font-size:13pt; width:130px; 
	    height:32px;border-top:solid 1px #a7b5bc; border-left:solid 1px #a7b5bc; border-right:solid 1px #ced9df; 
	    border-bottom:solid 1px #ced9df;" list="#request.shops" listKey="shopId" name="shopTab.shopId" listValue="shopName" 
	    headerKey="" headerValue="----请选择----" value=""></s:select></li>
	    <li><label><font style="font-size: 13pt">商品名称</font></label><s:textfield name="foodName" value="" cssClass="dfinput"/></li>
	    <li><label><font style="font-size: 13pt">原价</font></label><s:textfield name="oldprice" value="" cssClass="ddfinput"/></li>
	    <li><label><font style="font-size: 13pt">现价</font></label><s:textfield name="newprice" value="" cssClass="ddfinput"/></li>
	    <li><label><font style="font-size: 13pt">发布时间</font></label><s:textfield name="newstime" value="" readonly="true" required="required" cssClass="dfinput" id='mydatepicker2'/></li>
	    <li><label><font style="font-size: 13pt">是否折扣</font></label><s:textfield name="discount" value="" cssClass="dfinput"/></li>
	    <li><label><font style="font-size: 13pt">销售状态</font></label><s:textfield name="hava" value="" cssClass="dfinput"/></li>
	    </ul>
	    <br/>
	    <div style="position:absolute; left: 200px; "><s:submit cssClass="btn" value="确认保存"/></div>
	    </s:form>
	   
	    
    </div>
    
    <!-- 设置datepicker 格式 -->
    <script type="text/javascript">
		$('#mydatepicker2').dcalendarpicker({
			format:'yyyy-mm-dd'
		}); 
	</script>
    
</body>    
</html>
