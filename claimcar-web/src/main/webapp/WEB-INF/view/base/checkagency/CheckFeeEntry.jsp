<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ include file="/WEB-INF/layout/common/taglib.jspf"%>
<!DOCTYPE HTML>
<html>
<head>
<title>查勘费录入</title>
</head>
<body id="Checks">
	<br>
	<!-- 按钮组 -->
	<div class="top_btn">
	<!-- 	<a class="btn btn-primary mb-10" onclick="uploadAssessorsFee('${assessorMainVo.taskId}','${handlerStatus}');">影像上传</a>   -->
	    <a class="btn  btn-primary  mb-10" onclick="imageCheckFeeUpload('${prpLAcheckMainVo.taskId}','${handlerStatus}');">信雅达影像上传</a>
	</div>
	</br>
	</br>
	<form name="fm" id="fm" class="form-horizontal" role="form">
		<!-- 任务基本信息 -->
		<%@include file="CheckFeeTaskBasicInfoOne.jsp"%>
		<!-- 发票登记 -->
		<c:if test="${handlerStatus ne '9'}">
		<%@include file="Chebillregister.jsp"%>
		</c:if>
		<!-- 费用 -->
		<%@include file="CheckFee.jsp"%>
		<!-- 意见 -->
		<%@include file="CheckFeeOpinion.jsp"%>
		<!-- 意见列表 -->
		<%@include file="CheckFeeOpinionsList.jsp"%>
		<br>
		<c:choose>
			<c:when test="${handlerStatus=='3'||handlerStatus=='9' }">
			</c:when>
			<c:otherwise>
				<div id="submitDiv" class="text-c">
					<br />
					<input class="btn btn-primary " id="save" onclick="submitNextNode(this)" type="button" value="暂存">
					&nbsp;&nbsp;&nbsp;
					<input class="btn btn-primary " id="submit" onclick="submitNextNode(this)" type="button" value="提交">
					&nbsp;&nbsp;&nbsp;
					<input class="btn btn-primary " id="cancel" onclick="submitNextNode(this)" type="button" value="注销任务">
				</div>
			</c:otherwise>
		</c:choose>
	</form>
	<script type="text/javascript" src="${ctx}/js/base/checkFee.js"></script>
</body>
</html>