<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="/WEB-INF/layout/common/taglib.jspf"%>

<!DOCTYPE HTML>
<html>
<head>
<title>立案注销/拒赔处理暂存或提交后显示界面</title>
</head>
<body>
	<div class="fixedmargin page_wrap">
		<!-- 按钮组 -->
		<div class="top_btn">
			<div class="top_btn">
				<a class="btn btn-primary" onclick="viewEndorseInfo('${prpLClaimVo.registNo}')">保单批改记录</a>
		    <a class="btn  btn-primary" onclick="openTaskEditWin('报案详细信息','/claimcar/regist/edit.do?registNo=${prpLCMainVo.registNo}')">报案详细信息</a>
		    <a class="btn  btn-primary" onclick="checkSeeMessage('${prpLCMainVo.registNo}')">查勘详细信息</a>
		    <a class="btn  btn-primary" onclick="showFlow('${prpLClaimVo.flowId}')">流程查询</a>
		    </div><br/>
		</div>
		<p>
		<div class="table_cont">
				<!-- 基本信息    -->
		<%@include file="claimCancelApplyEdit_Infos.jsp" %>
		<form  id="defossform" role="form" method="post"  name="fm" >
			<input hidden="hidden" name="claimNo" value="${ prpLClaimVo.claimNo}" id="claimNo">
			<input hidden="hidden" name="riskCode" value="${ prpLClaimVo.riskCode}" id="riskCode">
			<input hidden="hidden" name="flowTask" value="${ prpLClaimVo.flowId}">
			<input hidden="hidden" name="registNo" value="${prpLCMainVo.registNo }">
			<input hidden="hidden" name="id" value="${ id}">
			<input hidden="hidden" name="taskId" value="${taskId}">
			<input hidden="hidden" id="flags" name="flags" value="${flags}">
			<input hidden="hidden" name="dealReasoon" value="${prpLcancelTraceVo.dealReasoon }">
			<input hidden="hidden" name="applyReason" value="${prpLcancelTraceVo.applyReason }">
			<input hidden="hidden" name="swindleReason" value="${prpLcancelTraceVo.swindleReason }">
			<input hidden="hidden" name="swindleType" value="${prpLcancelTraceVo.swindleType }">
			<input hidden="hidden" name="swindleSum" value="${prpLcancelTraceVo.swindleSum }">
				<!-- 输入信息    -->
		<%@include file="claimCancelApplyEdit_Inputs.jsp" %>
		</div>
            
		<div class="text-c mt-10 hidden" id="shenQin">
			<div class="table_wrap">
				<br>
				<div class="table_cont ">
					<table class="table table-striped table-border table-hover">
						<thead>
							<tr class="text-c">
								<th>提交路径选择</th>
								<th>
									<select class="select" name="updateType" id="updateType" style='width:40%;'>
										<option value="1">注销审核</option>
									</select>
								</th>
							</tr>
						</thead>
						<tbody>
						</tbody>
					</table>
					<div class="text-c">
							<br/>
						<input class="btn btn-primary ml-5"  onclick="updates()" type="button" value="提交任务">
					</div>
				</div>
			</div>
		</div>
			
		<div class="text-c mt-10 hidden" id="juPei">
			<div class="table_wrap">
				<br>
				<div class="table_cont ">
					<table class="table table-striped table-border table-hover">
						<thead>
							<tr class="text-c">
							<th>提交路径选择</th>
							<th>
								<select class="select" name="juPeiType" id="juPeiType" style='width:40%;'>
									<option value="1">核赔</option>
								</select>
							</th>
							</tr>
						</thead>
							<tbody>
							</tbody>
					</table>
						<div class="text-c">
							<br/>
						<input class="btn btn-primary ml-5" onclick="juPei()" type="button" value="提交任务">
					</div>
				</div>
			</div>
		</div>
		</form>

		<div class="text-c mt-10" id="submitAfters">
		<input hidden="hidden" id="canCelStatus" value="${Status}">
		<c:if test="${Status=='1' }">
		<input class="btn btn-primary ml-5" id="zhancunssss" onclick="zhanCun()" type="button" value="暂存">
		<input class="btn btn-primary ml-5" id="save" onclick="save()" type="button" value="提交"> 
		<input class="btn btn-primary ml-5" id="cancel" onclick="cancel()" type="button" value="注销">
		</c:if>
			<c:if test="${Status=='0' }">
			<input class="btn btn-disabled ml-5" id="zhancun" type="button" value="暂存">
			<input class="btn btn-disabled ml-5" id="save" type="button" value="提交"> 
			<input class="btn btn-disabled ml-5"  type="button" value="注销">
		</c:if>
		</div>
	</div>

	<script type="text/javascript">
	$(function(){
		/* var state = $("#canCelStatus").val();
		if(state==0){
			$("#applyReason").attr("disabled","disabled"); 
			$("#dealReasoon").attr("disabled","disabled"); 
			$("#swindleSum").attr("disabled","disabled"); 
			$("#swindleType").attr("disabled","disabled"); 
			$("#swindleReason").attr("disabled","disabled"); 
		} */
		$("#applyReason").attr("disabled","disabled"); 
		$("#dealReasoon").attr("disabled","disabled"); 
		$("#swindleSum").attr("disabled","disabled"); 
		$("#swindleType").attr("disabled","disabled"); 
		$("#swindleReason").attr("disabled","disabled"); 
	});
	var layerIndex = 0;
		function save(){
			var a = $("#dealReasoon").val();
			if(a=="1"||a=="2"){
				layerIndex=layer.open({
				    type: 1,
				    title: false,
				    shade: false,
					shadeClose : true,
					scrollbar : false,
				    skin: 'yourclass',
				    area: ['500px', '150px'],
				    content:$("#shenQin")
				});
				$("#shenQin").removeClass("hidden");  
			}else{
				layerIndex=layer.open({
				    type: 1,
				    title: false,
				    shade: false,
					shadeClose : true,
					scrollbar : false,
				    skin: 'yourclass',
				    area: ['500px', '150px'],
				    content:$("#juPei")
				});
				$("#juPei").removeClass("hidden");  
			}
		}
		function updates(){
			/* var riskCode = $("#riskCode").val();
			var claimNo = $("#claimNo").val(); */
			var updateType = $("#updateType").val();
			/* var flowId = $("#flowId").val();
			alert("123=="+flowId); */
			/* alert(riskCode);
			alert(claimNo); */
			if(updateType=="1"){
				layer.load(0, {shade : [0.8, '#393D49']});
				$.ajax({
					type: "POST",
					url : "/claimcar/claim/claimCancelSave.do", // 后台校验
					data : $("#defossform").serialize(),
					success : function(jsonData) {// 回调方法，可单独定义
						/* var result = eval(jsonData);
						if (result.status == "200") {
							if(result.data !="ok"){
								layer.alert(result.data);
								returnflag = false;
							}
						} */
						layer.msg("提交成功");
						layer.close(layerIndex);
						layer.closeAll('loading');
						//window.location.reload();
						/* $("#zhancunssss").removeAttr("onclick");
						$("#save").removeAttr("onclick"); */
						
						$("#submitAfters").addClass("hidden");   
					}
				});
			}else{
				layer.close(layerIndex);
			}
			
		}
		
		
		
		
		//拒赔
		function juPei(){
			var juPeiType = $("#juPeiType").val();
			if(juPeiType=="1"){
				layer.load(0, {shade : [0.8, '#393D49']});
				$.ajax({
					type: "POST",
					url : "/claimcar/claim/claimCancelJuPei.do", // 后台校验
					data : $("#defossform").serialize(),
					success : function(jsonData) {
						layer.msg("提交成功");
						layer.close(layerIndex);
						$("#submitAfters").hide();
						layer.closeAll('loading');
						//window.location.reload();
						$("#submitAfters").addClass("hidden");  
					}
				});
			}else{
				layer.close(layerIndex);
			}
			
		}
		//
		function zhanCun(){
			$.ajax({
				type: "POST",
				url : "/claimcar/claim/claimInitZhanC.do", // 后台校验
				data : $("#defossform").serialize(),
				success : function(jsonData) {// 回调方法，可单独定义
					layer.msg("暂存成功");
					layer.close(layerIndex);
					//window.location.reload();
				}
			});
		
		
	}
		function cancel(){
			//进行判断是拒赔发起注销还是立案注销发起注销
			if($("#dealReasoon").val()=="1"||$("#dealReasoon").val()=="2"){
				$.ajax({
					type: "POST",
					url : "/claimcar/claim/cancel.do", // 后台校验
					data : $("#defossform").serialize(),
					success : function(jsonData) {// 回调方法，可单独定义
						layer.msg("注销成功");
						layer.close(layerIndex);
						$("#submitAfters").hide();
						//window.location.reload();
					}
				});
			}
			if($("#dealReasoon").val()=="3"||$("#dealReasoon").val()=="4"){
				$.ajax({
					type: "POST",
					url : "/claimcar/claim/cancelJ.do", // 后台校验
					data : $("#defossform").serialize(),
					success : function(jsonData) {// 回调方法，可单独定义
						layer.msg("注销成功");
						layer.close(layerIndex);
						$("#submitAfters").hide();
						//window.location.reload();
					}
				});
			}
		}
		$("#dealReasoon").change(function(){
			var dealReasoon = $("#dealReasoon").val();
			if(dealReasoon==3||dealReasoon==4){
				$("#zhapian").removeClass("hidden");  
			}else if(dealReasoon==1||dealReasoon==2){
				$("#zhapian").addClass("hidden"); 
			}
		});
		$(document).ready(function(){  
			var flags = $("#flags").val();
			if(flags!="1"){
				layer.alert(flags);
				$("#submitAfters").addClass("hidden"); 
			}
			var dealReasoon = $("#dealReasoon").val();
			if(dealReasoon==3||dealReasoon==4){
				$("#zhapian").removeClass("hidden");  
			}else if(dealReasoon==1||dealReasoon==2){
				$("#zhapian").addClass("hidden"); 
			}
		}); 
	</script>
</body>

</html>