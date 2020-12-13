package ins.sino.claimcar.claim.vo;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
import java.math.BigDecimal;
import java.util.Date;


/**
 * Vo Base Class of PO PrpLClaimSummary
 */ 
public class PrpLClaimSummaryVoBase implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private String claimNo;
	private String registNo;
	private String flowId;
	private String policyNo;
	private String policyNoLink;
	private Integer registCount;
	private String riskCode;
	private String licenseNo;
	private Date damageTime;
	private String damageAddress;
	private Date reportTime;
	private Date claimTime;
	private Date endCaseTime;
	private Date cancelTime;
	private String damageCode;
	private String caseFlag;
	private String caseStatus;
	private String nodeStatus;
	private String isDamageKindL;
	private BigDecimal kindLBalance;
	private BigDecimal kindLPayment;
	private BigDecimal kindw1Balance;
	private String isSubrogation;
	private String isInvestigation;
	private String isNight;
	private Date startDate;
	private Date endDate;
	private String isOffsite;
	private Integer endorseTimes;
	private String mercyFlag;
	private String tmpRegistNo;
	private BigDecimal lossPay;
	private BigDecimal willPay;
	private BigDecimal realPay;
	private Integer compensateTimes;
	private Date lastEndCaseDate;
	private String lastRegistNo;
	private String comCode;
	private String flag;
	private String remark;
	private String createUser;
	private Date createTime;
	private String updateUser;
	private Date updateTime;

    protected PrpLClaimSummaryVoBase() {
	
    }

    
	public String getClaimNo() {
		return this.claimNo;
	}

	public void setClaimNo(String claimNo) {
		this.claimNo = claimNo;
	}

	public String getRegistNo() {
		return this.registNo;
	}

	public void setRegistNo(String registNo) {
		this.registNo = registNo;
	}

	public String getFlowId() {
		return this.flowId;
	}

	public void setFlowId(String flowId) {
		this.flowId = flowId;
	}

	public String getPolicyNo() {
		return this.policyNo;
	}

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	public String getPolicyNoLink() {
		return this.policyNoLink;
	}

	public void setPolicyNoLink(String policyNoLink) {
		this.policyNoLink = policyNoLink;
	}

	public Integer getRegistCount() {
		return this.registCount;
	}

	public void setRegistCount(Integer registCount) {
		this.registCount = registCount;
	}

	public String getRiskCode() {
		return this.riskCode;
	}

	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}

	public String getLicenseNo() {
		return this.licenseNo;
	}

	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}

	public Date getDamageTime() {
		return this.damageTime;
	}

	public void setDamageTime(Date damageTime) {
		this.damageTime = damageTime;
	}

	public String getDamageAddress() {
		return this.damageAddress;
	}

	public void setDamageAddress(String damageAddress) {
		this.damageAddress = damageAddress;
	}

	public Date getReportTime() {
		return this.reportTime;
	}

	public void setReportTime(Date reportTime) {
		this.reportTime = reportTime;
	}

	public Date getClaimTime() {
		return this.claimTime;
	}

	public void setClaimTime(Date claimTime) {
		this.claimTime = claimTime;
	}

	public Date getEndCaseTime() {
		return this.endCaseTime;
	}

	public void setEndCaseTime(Date endCaseTime) {
		this.endCaseTime = endCaseTime;
	}

	public Date getCancelTime() {
		return this.cancelTime;
	}

	public void setCancelTime(Date cancelTime) {
		this.cancelTime = cancelTime;
	}

	public String getDamageCode() {
		return this.damageCode;
	}

	public void setDamageCode(String damageCode) {
		this.damageCode = damageCode;
	}

	public String getCaseFlag() {
		return this.caseFlag;
	}

	public void setCaseFlag(String caseFlag) {
		this.caseFlag = caseFlag;
	}

	public String getCaseStatus() {
		return this.caseStatus;
	}

	public void setCaseStatus(String caseStatus) {
		this.caseStatus = caseStatus;
	}

	public String getNodeStatus() {
		return this.nodeStatus;
	}

	public void setNodeStatus(String nodeStatus) {
		this.nodeStatus = nodeStatus;
	}

	public String getIsDamageKindL() {
		return this.isDamageKindL;
	}

	public void setIsDamageKindL(String isDamageKindL) {
		this.isDamageKindL = isDamageKindL;
	}

	public BigDecimal getKindLBalance() {
		return this.kindLBalance;
	}

	public void setKindLBalance(BigDecimal kindLBalance) {
		this.kindLBalance = kindLBalance;
	}

	public BigDecimal getKindLPayment() {
		return this.kindLPayment;
	}

	public void setKindLPayment(BigDecimal kindLPayment) {
		this.kindLPayment = kindLPayment;
	}

	public String getIsSubrogation() {
		return this.isSubrogation;
	}

	public void setIsSubrogation(String isSubrogation) {
		this.isSubrogation = isSubrogation;
	}

	public String getIsInvestigation() {
		return this.isInvestigation;
	}

	public void setIsInvestigation(String isInvestigation) {
		this.isInvestigation = isInvestigation;
	}

	public String getIsNight() {
		return this.isNight;
	}

	public void setIsNight(String isNight) {
		this.isNight = isNight;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getIsOffsite() {
		return this.isOffsite;
	}

	public void setIsOffsite(String isOffsite) {
		this.isOffsite = isOffsite;
	}

	public Integer getEndorseTimes() {
		return this.endorseTimes;
	}

	public void setEndorseTimes(Integer endorseTimes) {
		this.endorseTimes = endorseTimes;
	}

	public String getMercyFlag() {
		return this.mercyFlag;
	}

	public void setMercyFlag(String mercyFlag) {
		this.mercyFlag = mercyFlag;
	}

	public String getTmpRegistNo() {
		return this.tmpRegistNo;
	}

	public void setTmpRegistNo(String tmpRegistNo) {
		this.tmpRegistNo = tmpRegistNo;
	}

	public BigDecimal getLossPay() {
		return this.lossPay;
	}

	public void setLossPay(BigDecimal lossPay) {
		this.lossPay = lossPay;
	}

	public BigDecimal getWillPay() {
		return this.willPay;
	}

	public void setWillPay(BigDecimal willPay) {
		this.willPay = willPay;
	}

	public BigDecimal getRealPay() {
		return this.realPay;
	}

	public void setRealPay(BigDecimal realPay) {
		this.realPay = realPay;
	}

	public Integer getCompensateTimes() {
		return this.compensateTimes;
	}

	public void setCompensateTimes(Integer compensateTimes) {
		this.compensateTimes = compensateTimes;
	}

	public Date getLastEndCaseDate() {
		return this.lastEndCaseDate;
	}

	public void setLastEndCaseDate(Date lastEndCaseDate) {
		this.lastEndCaseDate = lastEndCaseDate;
	}

	public String getLastRegistNo() {
		return this.lastRegistNo;
	}

	public void setLastRegistNo(String lastRegistNo) {
		this.lastRegistNo = lastRegistNo;
	}

	public String getComCode() {
		return this.comCode;
	}

	public void setComCode(String comCode) {
		this.comCode = comCode;
	}

	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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


	public BigDecimal getKindw1Balance() {
		return kindw1Balance;
	}


	public void setKindw1Balance(BigDecimal kindw1Balance) {
		this.kindw1Balance = kindw1Balance;
	}
	
	
}