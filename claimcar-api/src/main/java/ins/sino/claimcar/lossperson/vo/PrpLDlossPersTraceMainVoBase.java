package ins.sino.claimcar.lossperson.vo;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
import java.math.BigDecimal;
import java.util.Date;

/**
 * Vo Base Class of PO PrpLDlossPersTraceMain
 */
public class PrpLDlossPersTraceMainVoBase implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String registNo;
	private String riskCode;
	private String mercyFlag;
	private String caseProcessType;
	private String intermediaryFlag;
	private String intermediaryInfoId;
	private String majorcaseFlag;
	private String majorcaseOption;
	private Date appointmentTime;
	private String operatorCode;
	private String operatorName;
	private String underwriteFlag;
	private String underwriteCode;
	private String underwriteName;
	private Date underwriteEndDate;
	private String undwrtFeeCode;
	private String undwrtFeeName;
	private Date undwrtFeeEndDate;
	private String claimReportFlag;
	private String claimReportOpinion;
	private String itemsName;
	private String itemsContent;
	private String makeCom;
	private String comCode;
	private Date inputTime;
	private String validFlag;
	private String remark;
	private String flag;
	private String createUser;
	private Date createTime;
	private String updateUser;
	private Date updateTime;
	private String reportType;
	private String plfName;
	private String plfCertiCode;
	private String plfPhone;
	private String lossState;
	private String auditStatus;
	private BigDecimal sumChargeFee;
	private BigDecimal sumVeriChargeFee;
	private BigDecimal traceTimes;
	private Date plfSubTime;
	private Integer verifyLevel;
	private Integer maxLevel;
	private String verifyCertiCode;
	private String payOpinions;
	private String isTimeout;
	private String isMinorInjuryCases;//是否小伤小额案件
	private String isDeroFlag;//是否减损
	private BigDecimal isDeroAmout;//减损金额
	private BigDecimal isDeroVerifyAmout;//审核减损金额
	private String inSideDeroFlag;//是否内部减损
	private String operatorCertiCode;
	private String plCode;
	private String checkCode;//人伤跟踪查勘费机构

	
	
	public String getPlCode() {
		return plCode;
	}


	
	public void setPlCode(String plCode) {
		this.plCode = plCode;
	}


	public String getOperatorCertiCode() {
		return operatorCertiCode;
	}

	
	public void setOperatorCertiCode(String operatorCertiCode) {
		this.operatorCertiCode = operatorCertiCode;
	}

	protected PrpLDlossPersTraceMainVoBase(){

	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRegistNo() {
		return this.registNo;
	}

	public void setRegistNo(String registNo) {
		this.registNo = registNo;
	}

	public String getRiskCode() {
		return this.riskCode;
	}

	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}

	public String getMercyFlag() {
		return this.mercyFlag;
	}

	public void setMercyFlag(String mercyFlag) {
		this.mercyFlag = mercyFlag;
	}

	public String getCaseProcessType() {
		return this.caseProcessType;
	}

	public void setCaseProcessType(String caseProcessType) {
		this.caseProcessType = caseProcessType;
	}

	public String getIntermediaryFlag() {
		return this.intermediaryFlag;
	}

	public void setIntermediaryFlag(String intermediaryFlag) {
		this.intermediaryFlag = intermediaryFlag;
	}

	public String getIntermediaryInfoId() {
		return this.intermediaryInfoId;
	}

	public void setIntermediaryInfoId(String intermediaryInfoId) {
		this.intermediaryInfoId = intermediaryInfoId;
	}

	public String getMajorcaseFlag() {
		return this.majorcaseFlag;
	}

	public void setMajorcaseFlag(String majorcaseFlag) {
		this.majorcaseFlag = majorcaseFlag;
	}

	public String getMajorcaseOption() {
		return this.majorcaseOption;
	}

	public void setMajorcaseOption(String majorcaseOption) {
		this.majorcaseOption = majorcaseOption;
	}

	public Date getAppointmentTime() {
		return this.appointmentTime;
	}

	public void setAppointmentTime(Date appointmentTime) {
		this.appointmentTime = appointmentTime;
	}

	public String getOperatorCode() {
		return this.operatorCode;
	}

	public void setOperatorCode(String operatorCode) {
		this.operatorCode = operatorCode;
	}

	public String getOperatorName() {
		return this.operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	public String getUnderwriteFlag() {
		return this.underwriteFlag;
	}

	public void setUnderwriteFlag(String underwriteFlag) {
		this.underwriteFlag = underwriteFlag;
	}

	public String getUnderwriteCode() {
		return this.underwriteCode;
	}

	public void setUnderwriteCode(String underwriteCode) {
		this.underwriteCode = underwriteCode;
	}

	public String getUnderwriteName() {
		return this.underwriteName;
	}

	public void setUnderwriteName(String underwriteName) {
		this.underwriteName = underwriteName;
	}

	public Date getUnderwriteEndDate() {
		return this.underwriteEndDate;
	}

	public void setUnderwriteEndDate(Date underwriteEndDate) {
		this.underwriteEndDate = underwriteEndDate;
	}

	public String getUndwrtFeeCode() {
		return this.undwrtFeeCode;
	}

	public void setUndwrtFeeCode(String undwrtFeeCode) {
		this.undwrtFeeCode = undwrtFeeCode;
	}

	public String getUndwrtFeeName() {
		return this.undwrtFeeName;
	}

	public void setUndwrtFeeName(String undwrtFeeName) {
		this.undwrtFeeName = undwrtFeeName;
	}

	public Date getUndwrtFeeEndDate() {
		return this.undwrtFeeEndDate;
	}

	public void setUndwrtFeeEndDate(Date undwrtFeeEndDate) {
		this.undwrtFeeEndDate = undwrtFeeEndDate;
	}

	public String getClaimReportFlag() {
		return this.claimReportFlag;
	}

	public void setClaimReportFlag(String claimReportFlag) {
		this.claimReportFlag = claimReportFlag;
	}

	public String getClaimReportOpinion() {
		return this.claimReportOpinion;
	}

	public void setClaimReportOpinion(String claimReportOpinion) {
		this.claimReportOpinion = claimReportOpinion;
	}

	public String getItemsName() {
		return this.itemsName;
	}

	public void setItemsName(String itemsName) {
		this.itemsName = itemsName;
	}

	public String getItemsContent() {
		return this.itemsContent;
	}

	public void setItemsContent(String itemsContent) {
		this.itemsContent = itemsContent;
	}

	public String getMakeCom() {
		return this.makeCom;
	}

	public void setMakeCom(String makeCom) {
		this.makeCom = makeCom;
	}

	public String getComCode() {
		return this.comCode;
	}

	public void setComCode(String comCode) {
		this.comCode = comCode;
	}

	public Date getInputTime() {
		return this.inputTime;
	}

	public void setInputTime(Date inputTime) {
		this.inputTime = inputTime;
	}

	public String getValidFlag() {
		return this.validFlag;
	}

	public void setValidFlag(String validFlag) {
		this.validFlag = validFlag;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getCreateUser() {
		return this.createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getUpdateUser() {
		return this.updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getReportType() {
		return this.reportType;
	}

	public void setReportType(String reportType) {
		this.reportType = reportType;
	}

	public String getPlfName() {
		return this.plfName;
	}

	public void setPlfName(String plfName) {
		this.plfName = plfName;
	}

	public String getPlfCertiCode() {
		return this.plfCertiCode;
	}

	public void setPlfCertiCode(String plfCertiCode) {
		this.plfCertiCode = plfCertiCode;
	}

	public String getPlfPhone() {
		return this.plfPhone;
	}

	public void setPlfPhone(String plfPhone) {
		this.plfPhone = plfPhone;
	}

	public String getLossState() {
		return this.lossState;
	}

	public void setLossState(String lossState) {
		this.lossState = lossState;
	}

	public String getAuditStatus() {
		return this.auditStatus;
	}

	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}

	public BigDecimal getSumChargeFee() {
		return this.sumChargeFee;
	}

	public void setSumChargeFee(BigDecimal sumChargeFee) {
		this.sumChargeFee = sumChargeFee;
	}

	public BigDecimal getSumVeriChargeFee() {
		return this.sumVeriChargeFee;
	}

	public void setSumVeriChargeFee(BigDecimal sumVeriChargeFee) {
		this.sumVeriChargeFee = sumVeriChargeFee;
	}

	public BigDecimal getTraceTimes() {
		return this.traceTimes;
	}

	public void setTraceTimes(BigDecimal traceTimes) {
		this.traceTimes = traceTimes;
	}

	public Date getPlfSubTime() {
		return this.plfSubTime;
	}

	public void setPlfSubTime(Date plfSubTime) {
		this.plfSubTime = plfSubTime;
	}

	public Integer getVerifyLevel() {
		return this.verifyLevel;
	}

	public void setVerifyLevel(Integer verifyLevel) {
		this.verifyLevel = verifyLevel;
	}

	public Integer getMaxLevel() {
		return maxLevel;
	}

	public void setMaxLevel(Integer maxLevel) {
		this.maxLevel = maxLevel;
	}

	public String getVerifyCertiCode() {
		return verifyCertiCode;
	}

	public void setVerifyCertiCode(String verifyCertiCode) {
		this.verifyCertiCode = verifyCertiCode;
	}

	public String getPayOpinions() {
		return payOpinions;
	}

	public void setPayOpinions(String payOpinions) {
		this.payOpinions = payOpinions;
	}

	public String getIsTimeout() {
		return isTimeout;
	}
	
	public void setIsTimeout(String isTimeout) {
		this.isTimeout = isTimeout;
	}

	public String getIsMinorInjuryCases() {
		return isMinorInjuryCases;
	}

	public void setIsMinorInjuryCases(String isMinorInjuryCases) {
		this.isMinorInjuryCases = isMinorInjuryCases;
	}

	public String getIsDeroFlag() {
		return isDeroFlag;
	}

	public void setIsDeroFlag(String isDeroFlag) {
		this.isDeroFlag = isDeroFlag;
	}

	public BigDecimal getIsDeroAmout() {
		return isDeroAmout;
	}

	public void setIsDeroAmout(BigDecimal isDeroAmout) {
		this.isDeroAmout = isDeroAmout;
	}

	public BigDecimal getIsDeroVerifyAmout() {
		return isDeroVerifyAmout;
	}

	public void setIsDeroVerifyAmout(BigDecimal isDeroVerifyAmout) {
		this.isDeroVerifyAmout = isDeroVerifyAmout;
	}

	public String getInSideDeroFlag() {
		return inSideDeroFlag;
	}

	public void setInSideDeroFlag(String inSideDeroFlag) {
		this.inSideDeroFlag = inSideDeroFlag;
	}



	public String getCheckCode() {
		return checkCode;
	}



	public void setCheckCode(String checkCode) {
		this.checkCode = checkCode;
	}



	
}
