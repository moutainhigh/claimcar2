<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ include file="/WEB-INF/layout/common/taglib.jspf"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>保单验证</title>
</head>
<body>
<div class="page_wrap">
		<!--查询条件 开始-->
	<div class="table_wrap">
			<div class="table_cont pd-10">
				<form id="form" class="form-horizontal" role="form" method="post" action="#">
					<div class="formtable f_gray4">
						<input type="hidden" name="policyInfoVo.CallId" value="${CallId}" />
						<div class="row mb-3 cl">
							
							<label for="policyNo" class="form_label col-1"><input type="radio" value="1" checked="checked"   name="policyInfoVo.checkFlag" id="checkFlag" />保单号</label>
							<div class="form_input col-3"> 
								<input id="policyNo" type="text" class="input-text" name="policyInfoVo.policyNo" datatype="n4-21" ignore="ignore" errormsg="请输入4到21位数"  clazz="must" onfocus="radioChecked(1)"/>
							</div>
							
							
							<label for="licenseNo" class="form_label col-1"><input type="radio" value="2" name="policyInfoVo.checkFlag" id="checkFlag" />车牌号
							
							
							</label>
							<div class="form_input col-3">
								<input id="licenseNo" type="text" class="input-text"  datatype="carStrLicenseNo"  ignore="ignore" name="policyInfoVo.licenseNo" onfocus="radioChecked(2)"/>
							</div>
							
						
							
							<label for="engineNo" class="form_label col-1"><input type="radio" value="4" name="policyInfoVo.checkFlag" id="checkFlag" />发动机号</label>
							<div class="form_input col-3">
								<input id="engineNo" type="text" class="input-text" name="policyInfoVo.engineNo" onfocus="radioChecked(4)"/>
							</div>
							
						</div>
						<div class="row mb-3 cl">
							
						<!-- 	<label for="vinNo" class="form_label col-1"><input type="radio" value="6" name="policyInfoVo.checkFlag" id="checkFlag" />VIN 码</label>
							<div class="form_input col-3">
								<input id="vinNo" type="text" class="input-text" name="policyInfoVo.vinNo" onfocus="radioChecked(6)"/>
							</div> -->
							
							<label for="frameNo" class="form_label col-1"><input type="radio" value="5" name="policyInfoVo.checkFlag" id="checkFlag" />VIN码/车架</label>
							<div class="form_input col-3">
								<input id="frameNo" type="text" class="input-text" datatype="*4-17" ignore="ignore" name="policyInfoVo.frameNo" onfocus="radioChecked(5)"/>
							</div>
							
						<label for="insuredName" class="form_label col-1"><input type="radio" value="3" name="policyInfoVo.checkFlag" id="checkFlag" />被保险人</label>
							<div class="form_input col-3">
								<input id="insuredName" type="text" class="input-text" name="policyInfoVo.insuredName" onfocus="radioChecked(3)"/>
							</div>
							<!-- <label for="insuredIdNo" class="form_label col-1"><input type="radio" value="7" name="policyInfoVo.checkFlag" id="checkFlag" />身份证号</label>
							<div class="form_input col-3">
								<input id="insuredIdNo" type="text" class="input-text" name="policyInfoVo.insuredIdNo" placeholder="被保险人身份证" onfocus="radioChecked(7)" datatype="idcard" ignore="ignore"/>
							</div> -->
						</div>
					<%-- 	<div class="row mb-3 cl">
							<div>
							<label for="dgDateMin" class="form_label col-1">出险时间</label>
							<div class="form_input col-3">
								<input name="policyInfoVo.damageTime" id="damageTime"  value="<fmt:formatDate value='${policyInfoVo.damageTime}'  pattern='yyyy-MM-dd HH:mm' />" 
								datatype="*" type="text" class="Wdate wd96" 
								onfocus="WdatePicker({maxDate:'\'%y-%M-%d\'}',dateFmt:'yyyy-MM-dd HH:mm'})" 
								/><font class="must">*</font>
								<input id="nowTime" type="hidden" value="<fmt:formatDate value='${policyInfoVo.damageTime}'  pattern='yyyy-MM-dd HH:mm' />" />
							</div>
							</div>
							<label for="licenseColor" class="form_label col-1">号牌底色</label>
							<div class="form_input col-3">
								<span class="select-box" > 
									<app:codeSelect id="licenseColor" codeType="LicenseColor" name="policyInfoVo.licenseColor"  type="select" />
								</span>
							</div>
							
						</div> --%>
						
						<!-- <div class="row mb-3 cl">
							<label class="form_label col-2"></label>
							<div class="form_input col-7">
							</div>
							<div class="form_input col-2 text-l">
								<label><input id="onlyValid" value="1" name="policyInfoVo.onlyValid" type="checkbox" />仅查询有效保单</label>
							</div>
						</div> -->
						<div class="line"></div>
						<div class="row">
							<span class="col-offset-10 col-2">
							   <button class="btn btn-primary btn-outline btn-search" id="search" type="submit" disabled>查询</button>
							</span>
						</div>
					</div>
				</form>
			</div>
		</div>
		<!--案查询条件 结束-->


		<!--标签页 开始-->
			<div class="tabbox">
				<div id="tab-system" class="HuiTab">
					<div class="tabCon clearfix">
							<table class="table table-border table-hover data-table" cellpadding="0" cellspacing="0" id="resultDataTable">
							<thead>
								<tr class="text-c">
									<th style="width: 17%">保单号</th>
									<th>车牌号</th>
									<th>承保机构</th>
									<th>被保险人</th>
									<th width="160">车型</th>
									<th>车架号/发动机号</th>
								</tr>
							</thead>
							<tbody class="text-c">
							</tbody>
						</table>
						<!--table   结束-->
						<!--无保单报案保存成功后生成的临时报案号获取 隐藏域-->
						<input type="hidden" id="registTmpNo"/>
						<div class="row text-c">
							<br/>
						</div>
					</div>
					<div class="tabCon">tabCon22</div>
				</div>
			</div>
		<!--标签页 结束-->
</div>
	<!--
	<script src="/js/policyQuery/CheckList.js"></script>
	-->
	<script type="text/javascript">
	var columns = [
		       		{
		       			"data" : "policyNo"
		       		}, {
		       			"data" : "licenseNo"
		       		}, {
		       			"data" : "comCodeName"
		       		}, {
		       			"data" : "insuredName"
		       		}, {
		       			"data" : "brandName",
		       			render : function(data, type, row) {
		    				return shortTxt(data,22);
		    			}
		       		}, {
		       			"data" : "frameNo"
		       		} ];
	var sizes=0;
	function rowCallback(row, data, displayIndex, displayIndexFull) {
		var goUrl = "/claimcar/policyView/policyViewToCB.do?policyNo="+ data.policyNo;
		$('td:eq(0)', row).html("<a href="+goUrl+"  target='_blank'>"+data.riskType+data.policyNo+"</a>");
		$('td:eq(5)', row).html(data.frameNo+"<br>"+data.engineNo);
  	}
	
	
	$(function(){
		
		$.Huitab("#tab-system .tabBar span","#tab-system .tabCon","current","click","0");
		
		bindValidForm($('#form'),searchTable);
		
		function searchTable () {
			if (checkBeforeQuery()) {
				layer.msg("需输入其中一个查询条件进行查询。");
				return;
			}
			//出险时间
		/* 	now=new Date(); //读取当前日期
			var b = 2; //分钟数
			now.setMinutes(now.getMinutes() + b);
			var nowTime = Date.parse(now);
			var damageTime = Date.parse($("#damageTime").val().replace('-','/'));
			if (damageTime > nowTime) {
				layer.msg("出险时间不能大于当前时间");
				return false;
			} */
			var ajaxList = new AjaxList("#resultDataTable");
			ajaxList.targetUrl = '/claimcar/policyQuery/policySearchs.do/';
			ajaxList.postData=$("#form").serializeJson();
			ajaxList.columns = columns;
			ajaxList.rowCallback = rowCallback;
			ajaxList.query();
			//layer.load(0, {shade : [0.8, '#393D49']});
		}
		});
	
			function radioChecked(val){
				$("input[name='policyInfoVo.checkFlag']").each(
					function(){
						if( $(this).val()==val){
							$(this).prop("checked",true);
						}
					});
			}
			
			//校验查询条件
			function checkBeforeQuery(){
				var checkedIndex = $("input[name='policyInfoVo.checkFlag']").filter(":checked").val();
				var flag = false;
				if (checkedIndex == 1) {
					var policyNo = $.trim($("#policyNo").val());
					if (policyNo == "") {
						flag = true;
					}
				}
				if (checkedIndex == 2) {
					var licenseNo = $.trim($("#licenseNo").val());
					if (licenseNo == "") {
						flag = true;
					}
				}
				if (checkedIndex == 3) {
					var insuredName = $.trim($("#insuredName").val());
					if (insuredName == "") {
						flag = true;
					}
				}
				if (checkedIndex == 4) {
					var engineNo = $.trim($("#engineNo").val());
					if (engineNo == "") {
						flag = true;
					}
				}
				if (checkedIndex == 5) {
					var frameNo = $.trim($("#frameNo").val());
					if (frameNo == "") {
						flag = true;
					}
				}
				return flag;
			}

	</script>
	<!--workbench_div     结束-->
</body>
</html>
