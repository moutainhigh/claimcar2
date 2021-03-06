<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/layout/common/taglib.jspf"%>

<div class="table_wrap table_cont">
<form id="prpLPayFxqCustomFormFrost" role="form" method="post">
	<div class="formtable">
		<div class="formtable mt-10">
			<c:if test="${not empty amlVo.fxqCustomId }">
				<input hidden="hidden" name="prpLPayFxqCustomVo.id" value="${amlVo.fxqCustomId }"></input>
			</c:if>
			<input type="hidden" value="${amlVo.claimNo}" name="prpLPayFxqCustomVo.claimNo"/>
			<div id="insured">
				<div class="row cl">
					<label class="form_label col-2"><font class="c-red">*</font>被保险人与投保人关系：</label>
					<div class="form_input col-2">
						<span class="select-box"  style="width: 95%">
							<app:codeSelect codeType="InsuredLegalIdentity" value="${amlVo.insureRelation }" type="select" />
						</span>
					</div>
					<label class="form_label col-2"><font class="c-red">*</font>被保险人名称：</label>
					<div class="form_input col-2">
						<input type="text" class="input-text"  value="${amlVo.insuredName }"/>					
					</div>
					<c:if test="${'00' eq amlVo.identifyType}">
						<label class="form_label col-2"><font class="c-red">*</font>社会统一信用代码：</label>
						<div class="form_input col-2">
							<input type="text" class="input-text" value="${amlVo.identifyNumber }"/>					
						</div>
					</c:if>
				</div>	
				<div class="row cl">
					<label class="form_label col-2"><font class="c-red">*</font>单位地址：</label>
					<div class="form_input col-2">
						<input type="text" class="input-text" value="${amlVo.adress }"/>	
					</div>
					<label class="form_label col-2"><font class="c-red">*</font>经营范围：</label>
					<div class="form_input col-2">
						<input type="text" class="input-text"  value="${amlVo.businessArea }"/>					
					</div>
					<label class="form_label col-2"><font class="c-red">*</font>证件有效期：</label>
					<div class="form_input col-2">
						<input type="text" class="Wdate" style="width:45%" id="dgDateMin"
								onfocus="WdatePicker({maxDate:'%y-%M-%d'})" style="width:97%" value="">
						-
						<input type="text" class="Wdate" style="width:45%" id="dgDateMin"
								onfocus="WdatePicker({minDate:'%y-%M-%d'})" style="width:97%" value="${amlVo.certifyDate }">
					</div>
				</div>
				<c:if test="${'10' eq amlVo.identifyType}">
					<div class="row cl">
						<label class="form_label col-2"><font class="c-red">*</font>组织机构代码：</label>
						<div class="form_input col-2">
							<input type="text" class="input-text"  value="${amlVo.identifyNumber }" />					
						</div>
						<label class="form_label col-2"><font class="c-red">*</font>税务登记证号码：</label>
						<div class="form_input col-2">
							<input type="text" class="input-text"  value="${amlVo.favoreelRevenueRegistNo }" />	
						</div>
						<label class="form_label col-2"><font class="c-red">*</font>营业执照编码：</label>
						<div class="form_input col-2">
							<input type="text" class="input-text"  value="${amlVo.favoreelBusinessCode }" />					
						</div>
					</div>
				</c:if>
			</div>
			<div class="line" ></div>
			<div class="row cl">
				<label class="form_label col-2"><font class="c-red">*</font>法定代表人姓名：</label>
				<div class="form_input col-2">
					<input type="text" class="input-text" name="prpLPayFxqCustomVo.legalPerson" value="${amlVo.legalPerson }" datatype="*" nullmsg="请填写法定代表人姓名"/>
				</div>
				<label class="form_label col-2"><font class="c-red">*</font>联系方式：</label>
				<div class="form_input col-2">
					<input type="text" class="input-text" name="prpLPayFxqCustomVo.legalPhone" value="${amlVo.legalPhone }" datatype="*" nullmsg="请填写联系方式"/>
				</div>
			</div>
			<div class="row cl">
				<label class="form_label col-2"><font class="c-red">*</font>证件类型：</label>
				<div class="form_input col-2">
					<span class="select-box"  style="width: 95%">
						<app:codeSelect codeType="CertifyType" name="prpLPayFxqCustomVo.legalCertifyType" value="${amlVo.legalIdentifyType }" type="select" clazz="must"/>	
					</span>
				</div>
				<label class="form_label col-2"><font class="c-red">*</font>证件号码：</label>
				<div class="form_input col-2">
					<input type="text" class="input-text" name="prpLPayFxqCustomVo.legalIdentifyCode" value="${amlVo.legalIdentifyCode }" datatype="*" nullmsg="请填写证件号码"/>					
				</div>
				<label class="form_label col-2"><font class="c-red">*</font>证件有效期：</label>
				<div class="form_input col-2">
					<c:set var="legalCertifyStartDate" >
						<fmt:formatDate  value="${amlVo.legalCertifyStartDate }" pattern="yyyy-MM-dd"/>
					</c:set>
					<c:set var="legalCertifyEndDate" >
						<fmt:formatDate  value="${amlVo.legalCertifyEndDate }" pattern="yyyy-MM-dd"/>
					</c:set>
					<input type="text" class="Wdate" style="width:45%" id="dgDateMin" name="prpLPayFxqCustomVo.legalCertifyStartDate" datatype="*" nullmsg="日期不能为空"
							onfocus="WdatePicker({maxDate:'%y-%M-%d'})" style="width:97%" value="${legalCertifyStartDate }">
					-
					<input type="text" class="Wdate" style="width:45%" id="dgDateMin" name="prpLPayFxqCustomVo.legalCertifyEndDate" datatype="*" nullmsg="日期不能为空"
							onfocus="WdatePicker({minDate:'%y-%M-%d'})" style="width:97%" value="${legalCertifyEndDate }">
				</div>
			</div>
			<div class="row cl">
				<label class="form_label col-2"><font class="c-red">*</font>授权办理人姓名：</label>
				<div class="form_input col-2">
					<input type="text" class="input-text" name="prpLPayFxqCustomVo.authorityName" value="${amlVo.authorityName }" datatype="*" nullmsg="请填写授权办人姓名"/>
				</div>
				<label class="form_label col-2"><font class="c-red">*</font>联系电话：</label>
				<div class="form_input col-2">
				    
					<input type="text" class="input-text" name="prpLPayFxqCustomVo.authorityPhone" value="${amlVo.authorityPhone }" datatype="*" nullmsg="请填写联系电话"/>
				</div>
			</div>	
			<div class="row cl">
				<label class="form_label col-2"><font class="c-red">*</font>证件类型：</label>
				<div class="form_input col-2">
					<span class="select-box"  style="width: 95%">
						<app:codeSelect codeType="CertifyType" name="prpLPayFxqCustomVo.authorityCertifyType" value="${amlVo.authorityCertifyType}" type="select" clazz="must"/>	
					</span>
				</div>
				<label class="form_label col-2"><font class="c-red">*</font>证件号码：</label>
				<div class="form_input col-2">
					<input type="text" class="input-text" name="prpLPayFxqCustomVo.authorityNo" value="${amlVo.authorityNo }" datatype="*" nullmsg="请填写证件号码"/>					
				</div>
				<label class="form_label col-2"><font class="c-red">*</font>证件有效期：</label>
				<div class="form_input col-2">
					<c:set var="authorityStartDate" >
						<fmt:formatDate  value="${amlVo.authorityStartDate }" pattern="yyyy-MM-dd"/>
					</c:set>
					<c:set var="authorityEndDate" >
						<fmt:formatDate  value="${amlVo.authorityEndDate }" pattern="yyyy-MM-dd"/>
					</c:set>
					<input type="text" class="Wdate" style="width:45%" id="dgDateMin" name="prpLPayFxqCustomVo.authorityStartDate" datatype="*" nullmsg="日期不能为空"
							onfocus="WdatePicker({maxDate:'%y-%M-%d'})" style="width:97%" value="${authorityStartDate }">
					-
					<input type="text" class="Wdate" style="width:45%" id="dgDateMin" name="prpLPayFxqCustomVo.authorityEndDate" datatype="*" nullmsg="日期不能为空"
							onfocus="WdatePicker({minDate:'%y-%M-%d'})" style="width:97%" value="${authorityEndDate }">
				</div>	
			</div>
			<div class="line" ></div>
			<div class="row cl">
				<label class="form_label col-2"><font class="c-red">*</font>缴费与赔款账户一致性：</label>
				<div class="form_input col-2">
					<span class="select-box"  style="width: 95%">
						<app:codeSelect codeType="YN10" type="radio" style="min-width:50px" name="prpLPayFxqCustomVo.isConsistent" value="${amlVo.isConsistent}" nullToVal="1" onchange="changeConsistent()" />
					</span>
				</div>
				<div id="payAccountNo">
					<label class="form_label col-2"><font class="c-red">*</font>缴费账户：</label>
					<div class="form_input col-2">
						<input type="text" class="input-text" name="prpLPayFxqCustomVo.payAccountNo" value="${amlVo.payAccountNo }" datatype="*" nullmsg="请填写缴费账户"/>					
					</div>
				</div>
			</div>
			<div class="row cl">
				<label class="form_label col-2"><font class="c-red">*</font>受益人客户类型：</label>
				<div class="form_input col-2">
					<app:codeSelect codeType="CustomerType" type="radio" style="min-width:50px" name="prpLFxqFavoreeVo.customerType" value="${amlVo.customerType}" nullToVal="1" onchange="changeCustomerType()" />
				</div>
			</div>
			<c:if test="${not empty amlVo.fxqFavoreeId }">
				<input type="hidden" value="${amlVo.fxqFavoreeId }" name="prpLFxqFavoreeVo.id"/>
			</c:if>
			<!-- 法人 -->
			<div id="favoreel">
				<div class="row cl">
					
					<label class="form_label col-2"><font class="c-red">*</font>受益人与被保险人关系：</label>
					<div class="form_input col-2">
						<span class="select-box"  style="width: 95%">
							<app:codeSelect codeType="InsuredLegalIdentity" id="favoreelInsureRelation" name="prpLFxqFavoreeVo.favoreelInsureRelation" value="${amlVo.favoreelInsureRelation }" type="select" clazz="must"/>
						</span>
					</div>
					<label class="form_label col-2"><font class="c-red">*</font>受益人名称（法人）：</label>
					<div class="form_input col-2">
					    <input type="hidden" value="1" name="prpLFxqFavoreeVo.flag"/>
						<input type="text" class="input-text" name="prpLFxqFavoreeVo.favoreeName" value="${amlVo.favoreeName }" datatype="*" nullmsg="请填写受益人名称（法人）"/>					
					</div>
					<label class="form_label col-2"><font class="c-red">*</font>证件类型：</label>
					<div class="form_input col-2">
						<span class="select-box"  style="width: 95%">
							<app:codeSelect codeType="CertifyType" id="favoreelCertifyType" name="prpLFxqFavoreeVo.favoreeCertifyType" value="${amlVo.favoreeCertifyType}" type="select" onchange="changeIdentify()"/>	
						</span>
					</div>
				</div>
				<div class="row cl">
					<label class="form_label col-2"><font class="c-red">*</font>单位地址：</label>
					<div class="form_input col-2">
						<input type="text" class="input-text" name="prpLFxqFavoreeVo.favoreeAdress" value="${amlVo.favoreeAdress}" datatype="*" nullmsg="请填写单位地址"/>	
					</div>		
					<label class="form_label col-2"><font class="c-red">*</font>经营范围：</label>
					<div class="form_input col-2">
						<input type="text" class="input-text" name="prpLFxqFavoreeVo.favoreelBusinessArea" value="${amlVo.favoreelBusinessArea }" datatype="*" nullmsg="请填写经营范围"/>					
					</div>
					<label class="form_label col-2"><font class="c-red">*</font>证件有效期：</label>
					<div class="form_input col-2">
						<c:set var="favoreeCertifyStartDate" >
							<fmt:formatDate  value="${amlVo.favoreeCertifyStartDate }" pattern="yyyy-MM-dd"/>
						</c:set>
						<c:set var="favoreeCertifyEndDate" >
							<fmt:formatDate  value="${amlVo.favoreeCertifyEndDate }" pattern="yyyy-MM-dd"/>
						</c:set>
						<input type="text" class="Wdate" style="width:45%" id="dgDateMin" name="prpLFxqFavoreeVo.favoreeCertifyStartDate" datatype="*" nullmsg="日期不能为空"
								onfocus="WdatePicker({maxDate:'%y-%M-%d'})" style="width:97%" value="${favoreeCertifyStartDate }">
						-
						<input type="text" class="Wdate" style="width:45%" id="dgDateMax" name="prpLFxqFavoreeVo.favoreeCertifyEndDate" datatype="*" nullmsg="日期不能为空"
								onfocus="WdatePicker({minDate:'%y-%M-%d'})" style="width:97%" value="${favoreeCertifyEndDate }">
					</div>				
				</div>
				<div id="shxy">
					<div class="row cl">
						<label class="form_label col-2"><font class="c-red">*</font>统一社会信用代码：</label>
						<div class="form_input col-2">
							<input type="text" class="input-text" name="prpLFxqFavoreeVo.favoreeIdentifyCode" value="${amlVo.favoreeIdentifyCode }" datatype="*" nullmsg="请填写统一社会信用代码"/>					
						</div>
					</div>
				</div>
				<div id="zzjg">
					<div class="row cl">
						<label class="form_label col-2"><font class="c-red">*</font>组织机构代码：</label>
						<div class="form_input col-2">
							<input type="text" class="input-text" name="prpLFxqFavoreeVo.favoreeIdentifyCode" value="${amlVo.favoreeIdentifyCode }" datatype="*" nullmsg="请填写组织机构代码"/>					
						</div>
						<label class="form_label col-2"><font class="c-red">*</font>营业执照编码：</label>
						<div class="form_input col-2">
							<input type="text" class="input-text" name="prpLFxqFavoreeVo.favoreelBusinessCode" value="${amlVo.favoreelBusinessCode }" datatype="*" nullmsg="请填写营业执照编码"/>					
						</div>
						<label class="form_label col-2"><font class="c-red">*</font>税务登记证号码：</label>
						<div class="form_input col-2">
							<input type="text" class="input-text" name="prpLFxqFavoreeVo.favoreelRevenueRegistNo" value="${amlVo.favoreelRevenueRegistNo}" datatype="*" nullmsg="请填写税务登记证号码"/>	
						</div>
					</div>
				</div>
			</div>
			<!-- 受益人自然人 -->
			<div id="favoreen">
				<div class="row cl">
					<label class="form_label col-2"><font class="c-red">*</font>受益人与被保险人关系：</label>
					<div class="form_input col-2">
						<span class="select-box"  style="width: 95%">
							<app:codeSelect codeType="InsuredLegalIdentity" id="favoreenInsureRelation" name="prpLFxqFavoreeVo.favoreelInsureRelation" value="${amlVo.favoreelInsureRelation }" type="select" clazz="must"/>
						</span>
					</div>
					<label class="form_label col-2"><font class="c-red">*</font>受益人姓名（自然人）：</label>
					<div class="form_input col-2">
						<input type="text" class="input-text" name="prpLFxqFavoreeVo.favoreeName" value="${amlVo.favoreeName }" datatype="*" nullmsg="请填写受益人姓名"/>					
					</div>
					<label class="form_label col-2"><font class="c-red">*</font>联系方式：</label>
					<div class="form_input col-2">
						<input type="text" class="input-text" name="prpLFxqFavoreeVo.favoreenPhone" value="${amlVo.favoreenPhone}" datatype="*" nullmsg="请填写联系方式"/>					
					</div>
				</div>
				<div class="row cl">
					<label class="form_label col-2"><font class="c-red">*</font>性别：</label>
					<div class="form_input col-2">
						<span class="select-box"  style="width: 95%">
							<app:codeSelect codeType="SexCode" id="favoreenSex" name="prpLFxqFavoreeVo.favoreenSex" value="${amlVo.favoreenSex }" type="select" clazz="must"/>
						</span>
					</div>
					<label class="form_label col-2"><font class="c-red">*</font>国籍：</label>
					<div class="form_input col-2">
						 <span class="select-box"  style="width: 95%">
							<app:codeSelect codeType="CountryCode" id="favoreenNatioNality" name="prpLFxqFavoreeVo.favoreenNatioNality" value="${amlVo.favoreenNatioNality}" type="select" clazz="must"/>
						</span> 
					</div>
					<label class="form_label col-2"><font class="c-red">*</font>职业：</label>
					<div class="form_input col-2">
						<input type="text" class="input-text" name="prpLFxqFavoreeVo.favoreenProfession" value="${amlVo.favoreenProfession}" datatype="*" nullmsg="请填写职业"/>					
					</div>
				</div>
				<div class="row cl">
					<label class="form_label col-2"><font class="c-red">*</font>证件类型：</label>
					<div class="form_input col-2">
						<span class="select-box"  style="width: 95%">
							<app:codeSelect codeType="CertifyType" id="favoreenCertifyType" name="prpLFxqFavoreeVo.favoreeCertifyType" value="${amlVo.favoreeCertifyType}" type="select" clazz="must"/>	
						</span>
					</div>
					<label class="form_label col-2"><font class="c-red">*</font>证件号码：</label>
					<div class="form_input col-2">
						<input type="text" class="input-text" name="prpLFxqFavoreeVo.favoreeIdentifyCode" value="${amlVo.favoreeIdentifyCode }" datatype="*" nullmsg="证件号码"/>					
					</div>
					<label class="form_label col-2"><font class="c-red">*</font>证件有效期：</label>
					<div class="form_input col-2">
						<c:set var="favoreeCertifyStartDate" >
							<fmt:formatDate  value="${amlVo.favoreeCertifyStartDate }" pattern="yyyy-MM-dd"/>
						</c:set>
						<c:set var="favoreeCertifyEndDate" >
							<fmt:formatDate  value="${amlVo.favoreeCertifyEndDate }" pattern="yyyy-MM-dd"/>
						</c:set>
						<input type="text" class="Wdate" style="width:45%" id="dgDateMin" name="prpLFxqFavoreeVo.favoreeCertifyStartDate" datatype="*" nullmsg="日期不能为空"
								onfocus="WdatePicker({maxDate:'%y-%M-%d'})" style="width:97%" value="${favoreeCertifyStartDate }">
						-
						<input type="text" class="Wdate" style="width:45%" id="dgDateMax" name="prpLFxqFavoreeVo.favoreeCertifyEndDate" datatype="*" nullmsg="日期不能为空"
								onfocus="WdatePicker({minDate:'%y-%M-%d'})" style="width:97%" value="${favoreeCertifyEndDate }">
					</div>
				</div>
				<div class="row cl">
					<label class="form_label col-2"><font class="c-red">*</font>住址类型：</label>
					<div class="form_input col-2">
						<span class="select-box"  style="width: 95%">
						<input type="hidden" value="${amlVo.claimNo}" name="prpLFxqFavoreeVo.claimNo"/>
							<app:codeSelect codeType="AdressType" id="favoreenAdressType" name="prpLFxqFavoreeVo.favoreenAdressType" value="${amlVo.favoreenAdressType}"  type="select" clazz="must"/>
						</span>
					</div>
					<label class="form_label col-2"><font class="c-red">*</font>地址：</label>
					<div class="form_input col-2">
						<input type="text" class="input-text" name="prpLFxqFavoreeVo.favoreeAdress" value="${amlVo.favoreeAdress}" datatype="*" nullmsg="请填写地址"/>					
					</div>	
				</div>
			</div>
		</div>
	</div>
	<div class="btn-footer clearfix text-c">
			    <c:if test="${signFlag ne 'SY' }">
				<a class="btn btn-primary ml-5" onclick="inAmlforIn()" style="width:60px;height:32px" id="centain">确定</a>
				</c:if>
				<a class="btn btn-primary ml-5" id="cancelBtn" onclick="closeLayer()">取消</a>
	</div>
	</form>
</div>
<!-- 银行信息  结束 -->
<script type="text/javascript" src="${ctx }/js/flow/inAmlforIn.js"></script>
<script type="text/javascript" src="/claimcar/js/common/application.js"></script>
<script type="text/javascript">



</script>
