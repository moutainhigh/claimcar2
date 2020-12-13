<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="/WEB-INF/layout/common/taglib.jspf"%>
	<div class="table_cont table_list ">
		<table class="table table-border table-hover">
		     <thead>
				<tr class="text-c">
				    <th>收付原因</th>
					<th>计算书号</th>
					<th>报案号</th>
					<th>保单号</th>
					<th>立案号</th>
					<th>被保险人名</th>
					<th>任务详情</th>
					<th>费用金额</th>
				</tr>
			</thead>
		
			<tbody>
				 <c:forEach var="assessorFeeVo" items="${assessorFeeList}" varStatus="status">
					<tr class="text-c">
						<td>${assessorFeeVo.createUser}</td>
						<td>${assessorFeeVo.compensateNo}</td>
						<td>${assessorFeeVo.registNo}</td>
						<td>${assessorFeeVo.policyNo}</td>
						<td>${assessorFeeVo.claimNo}</td>
						<td>${assessorFeeVo.insurename}</td>
						<td>${assessorFeeVo.taskDetail}</td>
						<td>${assessorFeeVo.amount}</td>
					</tr>
					</c:forEach>
			</tbody>
		</table>
	


<script type="text/javascript">
		
	</script>