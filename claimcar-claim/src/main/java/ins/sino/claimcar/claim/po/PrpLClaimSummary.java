package ins.sino.claimcar.claim.po;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * POJO Class PrpLClaimSummary
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Table(name = "PRPLCLAIMSUMMARY")
public class PrpLClaimSummary implements java.io.Serializable {
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
	private BigDecimal kindw1Balance;

	@Id
	@Column(name = "CLAIMNO", unique = true, nullable = false, length=30)
	public String getClaimNo() {
		return this.claimNo;
	}

	public void setClaimNo(String claimNo) {
		this.claimNo = claimNo;
	}

	@Column(name = "REGISTNO", nullable = false, length=30)
	public String getRegistNo() {
		return this.registNo;
	}

	public void setRegistNo(String registNo) {
		this.registNo = registNo;
	}

	@Column(name = "FLOWID", nullable = false, length=30)
	public String getFlowId() {
		return this.flowId;
	}

	public void setFlowId(String flowId) {
		this.flowId = flowId;
	}

	@Column(name = "POLICYNO", nullable = false, length=30)
	public String getPolicyNo() {
		return this.policyNo;
	}

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	@Column(name = "POLICYNOLINK", length=30)
	public String getPolicyNoLink() {
		return this.policyNoLink;
	}

	public void setPolicyNoLink(String policyNoLink) {
		this.policyNoLink = policyNoLink;
	}

	@Column(name = "REGISTCOUNT", precision=5, scale=0)
	public Integer getRegistCount() {
		return this.registCount;
	}

	public void setRegistCount(Integer registCount) {
		this.registCount = registCount;
	}

	@Column(name = "RISKCODE", length=10)
	public String getRiskCode() {
		return this.riskCode;
	}

	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}

	@Column(name = "LICENSENO", length=15)
	public String getLicenseNo() {
		return this.licenseNo;
	}

	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DAMAGETIME", length=7)
	public Date getDamageTime() {
		return this.damageTime;
	}

	public void setDamageTime(Date damageTime) {
		this.damageTime = damageTime;
	}

	@Column(name = "DAMAGEADDRESS", length=500)
	public String getDamageAddress() {
		return this.damageAddress;
	}

	public void setDamageAddress(String damageAddress) {
		this.damageAddress = damageAddress;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "REPORTTIME", nullable = false, length=7)
	public Date getReportTime() {
		return this.reportTime;
	}

	public void setReportTime(Date reportTime) {
		this.reportTime = reportTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CLAIMTIME", length=7)
	public Date getClaimTime() {
		return this.claimTime;
	}

	public void setClaimTime(Date claimTime) {
		this.claimTime = claimTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ENDCASETIME", length=7)
	public Date getEndCaseTime() {
		return this.endCaseTime;
	}

	public void setEndCaseTime(Date endCaseTime) {
		this.endCaseTime = endCaseTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CANCELTIME", length=7)
	public Date getCancelTime() {
		return this.cancelTime;
	}

	public void setCancelTime(Date cancelTime) {
		this.cancelTime = cancelTime;
	}

	@Column(name = "DAMAGECODE", length=20)
	public String getDamageCode() {
		return this.damageCode;
	}

	public void setDamageCode(String damageCode) {
		this.damageCode = damageCode;
	}

	@Column(name = "CASEFLAG", length=2)
	public String getCaseFlag() {
		return this.caseFlag;
	}

	public void setCaseFlag(String caseFlag) {
		this.caseFlag = caseFlag;
	}

	@Column(name = "CASESTATUS", length=2)
	public String getCaseStatus() {
		return this.caseStatus;
	}

	public void setCaseStatus(String caseStatus) {
		this.caseStatus = caseStatus;
	}

	@Column(name = "NODESTATUS", length=20)
	public String getNodeStatus() {
		return this.nodeStatus;
	}

	public void setNodeStatus(String nodeStatus) {
		this.nodeStatus = nodeStatus;
	}

	@Column(name = "ISDAMAGEKINDL", length=1)
	public String getIsDamageKindL() {
		return this.isDamageKindL;
	}

	public void setIsDamageKindL(String isDamageKindL) {
		this.isDamageKindL = isDamageKindL;
	}

	@Column(name = "KINDLBALANCE", precision=8)
	public BigDecimal getKindLBalance() {
		return this.kindLBalance;
	}

	public void setKindLBalance(BigDecimal kindLBalance) {
		this.kindLBalance = kindLBalance;
	}

	@Column(name = "KINDLPAYMENT", precision=8)
	public BigDecimal getKindLPayment() {
		return this.kindLPayment;
	}

	public void setKindLPayment(BigDecimal kindLPayment) {
		this.kindLPayment = kindLPayment;
	}

	@Column(name = "ISSUBROGATION", length=1)
	public String getIsSubrogation() {
		return this.isSubrogation;
	}

	public void setIsSubrogation(String isSubrogation) {
		this.isSubrogation = isSubrogation;
	}

	@Column(name = "ISINVESTIGATION", length=1)
	public String getIsInvestigation() {
		return this.isInvestigation;
	}

	public void setIsInvestigation(String isInvestigation) {
		this.isInvestigation = isInvestigation;
	}

	@Column(name = "ISNIGHT", length=1)
	public String getIsNight() {
		return this.isNight;
	}

	public void setIsNight(String isNight) {
		this.isNight = isNight;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "STARTDATE", length=7)
	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ENDDATE", length=7)
	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	@Column(name = "ISOFFSITE", length=1)
	public String getIsOffsite() {
		return this.isOffsite;
	}

	public void setIsOffsite(String isOffsite) {
		this.isOffsite = isOffsite;
	}

	@Column(name = "ENDORSETIMES", precision=5, scale=0)
	public Integer getEndorseTimes() {
		return this.endorseTimes;
	}

	public void setEndorseTimes(Integer endorseTimes) {
		this.endorseTimes = endorseTimes;
	}

	@Column(name = "MERCYFLAG", length=3)
	public String getMercyFlag() {
		return this.mercyFlag;
	}

	public void setMercyFlag(String mercyFlag) {
		this.mercyFlag = mercyFlag;
	}

	@Column(name = "TMPREGISTNO", length=30)
	public String getTmpRegistNo() {
		return this.tmpRegistNo;
	}

	public void setTmpRegistNo(String tmpRegistNo) {
		this.tmpRegistNo = tmpRegistNo;
	}

	@Column(name = "LOSSPAY", precision=8)
	public BigDecimal getLossPay() {
		return this.lossPay;
	}

	public void setLossPay(BigDecimal lossPay) {
		this.lossPay = lossPay;
	}

	@Column(name = "WILLPAY", precision=8)
	public BigDecimal getWillPay() {
		return this.willPay;
	}

	public void setWillPay(BigDecimal willPay) {
		this.willPay = willPay;
	}

	@Column(name = "REALPAY", precision=8)
	public BigDecimal getRealPay() {
		return this.realPay;
	}

	public void setRealPay(BigDecimal realPay) {
		this.realPay = realPay;
	}

	@Column(name = "COMPENSATETIMES", precision=5, scale=0)
	public Integer getCompensateTimes() {
		return this.compensateTimes;
	}

	public void setCompensateTimes(Integer compensateTimes) {
		this.compensateTimes = compensateTimes;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LASTENDCASEDATE", length=7)
	public Date getLastEndCaseDate() {
		return this.lastEndCaseDate;
	}

	public void setLastEndCaseDate(Date lastEndCaseDate) {
		this.lastEndCaseDate = lastEndCaseDate;
	}

	@Column(name = "LASTREGISTNO", length=25)
	public String getLastRegistNo() {
		return this.lastRegistNo;
	}

	public void setLastRegistNo(String lastRegistNo) {
		this.lastRegistNo = lastRegistNo;
	}

	@Column(name = "COMCODE", length=8)
	public String getComCode() {
		return this.comCode;
	}

	public void setComCode(String comCode) {
		this.comCode = comCode;
	}

	@Column(name = "FLAG", length=10)
	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	@Column(name = "REMARK", length=200)
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Column(name = "CREATEUSER", nullable = false, length=10)
	public String getCreateUser() {
		return this.createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATETIME", nullable = false, length=7)
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Column(name = "UPDATEUSER", nullable = false, length=10)
	public String getUpdateUser() {
		return this.updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATETIME", nullable = false, length=7)
	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	@Column(name = "KINDW1BALANCE", precision=12, scale=2)
	public BigDecimal getKindw1Balance() {
		return kindw1Balance;
	}

	public void setKindw1Balance(BigDecimal kindw1Balance) {
		this.kindw1Balance = kindw1Balance;
	}
	
	
}