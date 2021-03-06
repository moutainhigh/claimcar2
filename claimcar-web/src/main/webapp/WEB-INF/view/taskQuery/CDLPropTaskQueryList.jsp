<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ include file="/WEB-INF/layout/common/taglib.jspf"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>财产定损任务查询</title>
<link href="../css/TaskQuery.css" rel="stylesheet"  />
</head>
<body>
	<div class="page_wrap">
		<!--查询条件 开始-->
		<div class="table_wrap">
			<div class="table_cont pd-10">
				<div class="formtable f_gray4">
					<form id="form" name="form" class="form-horizontal" role="form" method="post">
					<input type="hidden"  name="nodeCode"  value="${nodeCode }" >
						<div class="row mb-3 cl">
							<label class="form-label col-1 text-c">
								报案号
							</label>
							<div class="formControls col-3">
								<input type="text" class="input-text" datatype="n4-22" ignore="ignore" errormsg="请输入4到22位数"  name="registNo" value="" />
							</div>
							<label class="form-label col-1 text-c">
								保单号
							</label>
							<div class="formControls col-3">
								<input type="text" class="input-text" datatype="n4-21" ignore="ignore" errormsg="请输入4到21位数" name="policyNo"  value="" />
							</div>
							<label class="form-label col-1 text-c">
								车牌号
							</label>
							<div class="formControls col-3">
								<input type="text" class="input-text" datatype="carStrLicenseNo" ignore="ignore"  name="licenseNo"  name="licenseNo" value="" />
							</div>
						</div>
						<div class="row mb-3 cl">
						 <label class="form-label col-1 text-c">
							车架号
						</label>
							<div class="formControls col-3">
								<input type="text" class="input-text" datatype="*4-17" ignore="ignore" name="frameNo" value="" />
							</div>
							<label class="form-label col-1 text-c">
								被保险人
							</label>
							<div class="formControls col-3">
								<input type="text" class="input-text"  name="insuredName"  value="" />
							</div>
							<label class="form-label col-1 text-c">归属机构</label>
							<div class="formControls col-3">
								<span class="select-box"> 
								 <app:codeSelect codeType="ComCodeSelect" type="select" id="comCode" 
										name="comCode" lableType="code-name"  value="${comCode }" />
								</span>
							</div>
							</div>
							<div class="row mb-3 cl">
							<label class="form-label col-1 text-c">流入时间</label>
							<div class="formControls col-3">
								<input type="text" class="Wdate" id="tiDateMin"
									name="taskInTimeStart" value="<fmt:formatDate value='${taskInTimeStart}' pattern='yyyy-MM-dd'/>"
									onfocus="WdatePicker({maxDate:'#F{$dp.$D(\'tiDateMax\')||\'%y-%M-%d\'}'})" datatype="*"/>
								<span class="datespt">-</span><input type="text" class="Wdate" id="tiDateMax"
									name="taskInTimeEnd" value="<fmt:formatDate value='${taskInTimeEnd}' pattern='yyyy-MM-dd'/>"
									onfocus="WdatePicker({minDate:'#F{$dp.$D(\'tiDateMin\')}',maxDate:'%y-%M-%d'})" datatype="*"/>
								<font color="red">*</font>
							</div>
							<label class="form-label col-1 text-c">紧急程度</label>
							<div class="formControls col-3">
								<span class="select-box">
								<app:codeSelect 	codeType="MercyFlag" type="select" 
										name="mercyFlag" lableType="code-name" />
								</span>
							</div>
							<label class="form-label col-1">任务类型</label>
							<div class="formControls col-3">
								<span class="select-box"> 
									 <select name="subNodeCode" class=" select ">
									 <option value="DLProps"></option>
									 <option value="DLProp">普通定损</option>
									<option value="DLPropMod">定损修改</option>
									</select>
								</span>
							</div>
						</div>
						<div class="row mb-6 cl">
							<label class="form-label col-1 text-c">任务状态</label>
							<div class="formControls col-6">
							 	<label>
							 	<input type="radio" name="handleStatus" onchange="changeHandleStatus(this)" value="2" checked="checked">正在处理
							 	</label>
							 	<label>
							 	 	<input type="radio" name="handleStatus" onchange="changeHandleStatus(this)" value="6">已退回
							 	</label>	
							 	<font color="red">*</font>			
							</div>
						</div>
						<div class="line"></div>
						<div class="row">
							<span class="col-offset-10 col-2">
								<button class="btn btn-primary btn-outline btn-search"  type="submit" disabled>
								<i class="Hui-iconfont  Hui-iconfont-search2"></i>  查询</button>
							</span><br />
						</div>
					</form>
				</div>
			</div>
			<!--案查询条件 结束-->


			<!--标签页 开始-->
			<div id="tab-system" class="HuiTab">
				<div class="tabBar cl">
					<span onclick="changeHandleTab(2)"><i class="Hui-iconfont handing">&#xe619;</i>正在处理</span>
					<span onclick="changeHandleTab(6)"><i class="Hui-iconfont handback">&#xe619;</i>已退回</span>
				</div>
				<!--正在处理-->
				<div class="tabCon clearfix">
					<table id="DataTable_2" class="table table-border table-hover data-table" cellpadding="0" cellspacing="0"  >
						<thead>
							<tr>
							    <th>业务标识</th>
								<th>报案号</th>
								<th>保单号</th>
								<th>车牌号码</th>
								<th>项目损失类型</th>
								<th>查勘估损金额</th>
								<th>被保险人</th>
								<th>承保机构</th>
								<th>流入时间</th>
								<th>提交人</th>
								<th>任务类型</th>
							</tr>
						</thead>
						<tbody>
						</tbody>
					</table>
				</div>
				<!--退回-->
				<div class="tabCon clearfix">
					<table id="DataTable_6" class="table table-border table-hover data-table" cellpadding="0" cellspacing="0"  >
						<thead>
							<tr>
								<th>业务标识</th>
								<th>报案号</th>
								<th>保单号</th>
								<th>车牌号码</th>
								<th>项目损失类型</th>
								<th>查勘估损金额</th>
								<th>被保险人</th>
								<th>承保机构</th>
								<th>流入时间</th>
								<th>提交人</th>
								<th>任务类型</th>
							</tr>
						</thead>
						<tbody>
						</tbody>
					</table>
				</div>
			</div>
			<!--标签页 结束-->
		</div>
	</div>

	<script type="text/javascript" src="${ctx }/js/flow/flowCommon.js"></script>
	
	<script type="text/javascript">


		var columns2 = [ 
		    			{"data" : "bussTagHtml"}, //
		    			{"data" : "registNoHtml"}, //报案号
		    			{"data" : "policyNoHtml"}, //保单号
		    			{"data" : "license"}, //车牌号码
		    			{"data" : "serialNo"}, //项目损失类型...
		    			{"data" : "lossFee"}, //查勘估损金额
		    			{"data" : "insuredName"}, //被保险人
		    			{"data" : "comCodeName"}, //承保机构
		    			{"data" : "taskInTime"}, //流入时间
		    			{"data" : "taskInUserName"}, //提交人
		    			{"data" : "taskName"} //任务类型
		    			];
		function rowCallback(row, data, displayIndex, displayIndexFull) {
			$('td:eq(1)', row).html("<a  onclick=\"openTaskEditWin('财产定损注销处理','/claimcar/schedule/schLogout?flowId="+data.flowId+"&taskId="+data.taskId+"&taskInKey="+data.taskInKey+"&handlerIdKey="+data.handlerIdKey+"&registNo="+data.registNo+"&remark=2"+"')\">"+data.registNo+"</a>");
			if(data.serialNo == '地面'){
				$('td:eq(3)', row).html("无（地面）");
			}
		}
		
		//----------未接收   已接收待处理--- end
		
		
		
		function search(){
			var handleStatus=$("input[name='handleStatus']:checked").val();
			if(isBlank(handleStatus)){
				layer.msg("请选择任务状态");
				return false;
			}

			var ajaxList = new AjaxList("#DataTable_"+handleStatus);
			ajaxList.targetUrl = 'searchCancelTask.do';// + $("#form").serialize();
			ajaxList.postData = $("#form").serializeJson();
			ajaxList.rowCallback = rowCallback;

			ajaxList.columns = columns2;
			ajaxList.query();
		}
		$("[name='registNo']").change(function(){
			if($("input[name='registNo']").val().length >= 4){
				$("[name='taskInTimeStart']").removeAttr("datatype").removeClass("Validform_error").qtip('destroy', true);
				$("[name='taskInTimeEnd']").removeAttr("datatype").removeClass("Validform_error").qtip('destroy', true);
				
			}else if($("input[name='registNo']").val().length == 0){
				$("[name='taskInTimeStart']").attr("datatype","*");
				$("[name='taskInTimeEnd']").attr("datatype","*");
			}
		});
	</script>
</body>
</html>
