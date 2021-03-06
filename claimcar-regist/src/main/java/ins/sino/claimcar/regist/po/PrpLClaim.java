package ins.sino.claimcar.regist.po;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * POJO Class PrpLClaim
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
//@TableGenerator(name = "utiSequence", table = "UTISEQUENCE", pkColumnName = "GenName", valueColumnName = "GenValue", pkColumnValue = "PRPLCLAIMKINDHIS_PK", allocationSize = 10)
@Table(name = "PRPLCLAIM")

public class PrpLClaim implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	//private Long id;
	private String claimNo;
	private String flowId;
	private String registNo;
	private String comCode;
	private String policyNo;
	private String riskCode;
	private String classCode;
	private Date reportTime;
	private Date claimTime;
	private Date damageTime;
	private String damageCode;
	private String damageTypeCode;
	private String damageAreaCode;
	private String claimType;
	private String claimFlag;
	private String mercyFlag;
	private String autoEndCaseFlag;
	private String ciIndemDuty;
	private String indemnityDuty;
	private BigDecimal indemnityDutyRate;
	private BigDecimal deductibleRate;
	private String isTotalLoss;
	private String caseFlag;
	private String isSubRogation;
	private String isAlarm;
	private String tpFlag;
	private String isMajorCase;
	private BigDecimal sumDefLoss;
	private BigDecimal sumClaim;
	private BigDecimal sumRescueFee;
	private BigDecimal sumPaid;
	private BigDecimal sumReplevy;
	private BigDecimal sumChargeFee;
	private Integer estiTimes;
	private String caseNo;
	private Date endCaseTime;
	private String endCaserCode;
	private String cancelCode;
	private String cancelCom;
	private Date cancelTime;
	private String validFlag;
	private String flag;
	private String remark;
	private String createUser;
	private Date createTime;
	private String updateUser;
	private Date updateTime;
	private List<PrpLClaimKind> prpLClaimKinds = new ArrayList<PrpLClaimKind>(0);
	private List<PrpLClaimKindFee> prpLClaimKindFees = new ArrayList<PrpLClaimKindFee>(0);

	@Id
	/*@GeneratedValue(strategy = GenerationType.TABLE, generator = "utiSequence")
	@Column(name = "ID", unique = true, nullable = false, precision=14, scale=0)
	@NotNull
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}*/
	
	@Column(name = "CLAIMNO", unique = true, nullable = false, length=25)
	public String getClaimNo() {
		return this.claimNo;
	}

	public void setClaimNo(String claimNo) {
		this.claimNo = claimNo;
	}

	@Column(name = "FLOWID", nullable = false, length=22)
	public String getFlowId() {
		return this.flowId;
	}

	public void setFlowId(String flowId) {
		this.flowId = flowId;
	}

	@Column(name = "REGISTNO", nullable = false, length=30)
	public String getRegistNo() {
		return this.registNo;
	}

	public void setRegistNo(String registNo) {
		this.registNo = registNo;
	}

	@Column(name = "COMCODE", nullable = false, length=8)
	public String getComCode() {
		return this.comCode;
	}

	public void setComCode(String comCode) {
		this.comCode = comCode;
	}

	@Column(name = "POLICYNO", nullable = false, length=22)
	public String getPolicyNo() {
		return this.policyNo;
	}

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	@Column(name = "RISKCODE", nullable = false, length=4)
	public String getRiskCode() {
		return this.riskCode;
	}

	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}

	@Column(name = "CLASSCODE", nullable = false, length=3)
	public String getClassCode() {
		return this.classCode;
	}

	public void setClassCode(String classCode) {
		this.classCode = classCode;
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
	@Column(name = "CLAIMTIME", nullable = false, length=7)
	public Date getClaimTime() {
		return this.claimTime;
	}

	public void setClaimTime(Date claimTime) {
		this.claimTime = claimTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DAMAGETIME", nullable = false, length=7)
	public Date getDamageTime() {
		return this.damageTime;
	}

	public void setDamageTime(Date damageTime) {
		this.damageTime = damageTime;
	}

	@Column(name = "DAMAGECODE", length=4)
	public String getDamageCode() {
		return this.damageCode;
	}

	public void setDamageCode(String damageCode) {
		this.damageCode = damageCode;
	}

	@Column(name = "DAMAGETYPECODE", length=3)
	public String getDamageTypeCode() {
		return this.damageTypeCode;
	}

	public void setDamageTypeCode(String damageTypeCode) {
		this.damageTypeCode = damageTypeCode;
	}

	@Column(name = "DAMAGEAREACODE", length=20)
	public String getDamageAreaCode() {
		return this.damageAreaCode;
	}

	public void setDamageAreaCode(String damageAreaCode) {
		this.damageAreaCode = damageAreaCode;
	}

	@Column(name = "CLAIMTYPE", length=2)
	public String getClaimType() {
		return this.claimType;
	}

	public void setClaimType(String claimType) {
		this.claimType = claimType;
	}

	@Column(name = "CLAIMFLAG", length=1)
	public String getClaimFlag() {
		return claimFlag;
	}

	public void setClaimFlag(String claimFlag) {
		this.claimFlag = claimFlag;
	}

	@Column(name = "MERCYFLAG", length=2)
	public String getMercyFlag() {
		return this.mercyFlag;
	}

	public void setMercyFlag(String mercyFlag) {
		this.mercyFlag = mercyFlag;
	}

	@Column(name = "AUTOENDCASEFLAG", length=1)
	public String getAutoEndCaseFlag() {
		return this.autoEndCaseFlag;
	}

	public void setAutoEndCaseFlag(String autoEndCaseFlag) {
		this.autoEndCaseFlag = autoEndCaseFlag;
	}

	@Column(name = "CIINDEMDUTY", length = 1)
	public String getCiIndemDuty() {
		return ciIndemDuty;
	}

	public void setCiIndemDuty(String ciIndemDuty) {
		this.ciIndemDuty = ciIndemDuty;
	}

	@Column(name = "INDEMNITYDUTY", length = 1)
	public String getIndemnityDuty() {
		return indemnityDuty;
	}

	public void setIndemnityDuty(String indemnityDuty) {
		this.indemnityDuty = indemnityDuty;
	}

	@Column(name = "INDEMNITYDUTYRATE", nullable = false, precision = 8)
	public BigDecimal getIndemnityDutyRate() {
		return indemnityDutyRate;
	}

	public void setIndemnityDutyRate(BigDecimal indemnityDutyRate) {
		this.indemnityDutyRate = indemnityDutyRate;
	}

	@Column(name = "DEDUCTIBLERATE", nullable = false, precision = 8)
	public BigDecimal getDeductibleRate() {
		return deductibleRate;
	}

	public void setDeductibleRate(BigDecimal deductibleRate) {
		this.deductibleRate = deductibleRate;
	}

	@Column(name = "ISTOTALLOSS", length = 1)
	public String getIsTotalLoss() {
		return isTotalLoss;
	}

	public void setIsTotalLoss(String isTotalLoss) {
		this.isTotalLoss = isTotalLoss;
	}

	@Column(name = "CASEFLAG", length = 2)
	public String getCaseFlag() {
		return caseFlag;
	}

	public void setCaseFlag(String caseFlag) {
		this.caseFlag = caseFlag;
	}

	@Column(name = "ISSUBROGATION", length = 1)
	public String getIsSubRogation() {
		return isSubRogation;
	}

	public void setIsSubRogation(String isSubRogation) {
		this.isSubRogation = isSubRogation;
	}
	
	@Column(name = "ISALARM", length = 1)
	public String getIsAlarm() {
		return isAlarm;
	}

	public void setIsAlarm(String isAlarm) {
		this.isAlarm = isAlarm;
	}

	@Column(name = "TPFLAG", length = 1)
	public String getTpFlag() {
		return tpFlag;
	}

	public void setTpFlag(String tpFlag) {
		this.tpFlag = tpFlag;
	}

	@Column(name = "ISMAJORCASE", length = 1)
	public String getIsMajorCase() {
		return isMajorCase;
	}

	public void setIsMajorCase(String isMajorCase) {
		this.isMajorCase = isMajorCase;
	}

	@Column(name = "SUMDEFLOSS", nullable = false, precision=12)
	public BigDecimal getSumDefLoss() {
		return this.sumDefLoss;
	}

	public void setSumDefLoss(BigDecimal sumDefLoss) {
		this.sumDefLoss = sumDefLoss;
	}

	@Column(name = "SUMCLAIM", nullable = false, precision=12)
	public BigDecimal getSumClaim() {
		return this.sumClaim;
	}

	public void setSumClaim(BigDecimal sumClaim) {
		this.sumClaim = sumClaim;
	}

	@Column(name = "SUMRESCUEFEE", precision=12)
	public BigDecimal getSumRescueFee() {
		return this.sumRescueFee;
	}

	public void setSumRescueFee(BigDecimal sumRescueFee) {
		this.sumRescueFee = sumRescueFee;
	}

	@Column(name = "SUMPAID", precision=12)
	public BigDecimal getSumPaid() {
		return this.sumPaid;
	}

	public void setSumPaid(BigDecimal sumPaid) {
		this.sumPaid = sumPaid;
	}

	@Column(name = "SUMREPLEVY", precision=12)
	public BigDecimal getSumReplevy() {
		return this.sumReplevy;
	}

	public void setSumReplevy(BigDecimal sumReplevy) {
		this.sumReplevy = sumReplevy;
	}

	@Column(name = "SUMCHARGEFEE", precision=12)
	public BigDecimal getSumChargeFee() {
		return this.sumChargeFee;
	}

	public void setSumChargeFee(BigDecimal sumChargeFee) {
		this.sumChargeFee = sumChargeFee;
	}
	
	@Column(name = "ESTITIMES", precision = 5)
	public Integer getEstiTimes() {
		return estiTimes;
	}

	public void setEstiTimes(Integer estiTimes) {
		this.estiTimes = estiTimes;
	}

	@Column(name = "CASENO", length=22)
	public String getCaseNo() {
		return this.caseNo;
	}

	public void setCaseNo(String caseNo) {
		this.caseNo = caseNo;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ENDCASETIME", length=7)
	public Date getEndCaseTime() {
		return this.endCaseTime;
	}

	public void setEndCaseTime(Date endCaseTime) {
		this.endCaseTime = endCaseTime;
	}

	@Column(name = "ENDCASERCODE", length=10)
	public String getEndCaserCode() {
		return this.endCaserCode;
	}

	public void setEndCaserCode(String endCaserCode) {
		this.endCaserCode = endCaserCode;
	}

	@Column(name = "CANCELCODE", length=10)
	public String getCancelCode() {
		return this.cancelCode;
	}

	public void setCancelCode(String cancelCode) {
		this.cancelCode = cancelCode;
	}

	@Column(name = "CANCELCOM", length=8)
	public String getCancelCom() {
		return this.cancelCom;
	}

	public void setCancelCom(String cancelCom) {
		this.cancelCom = cancelCom;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CANCELTIME", length=7)
	public Date getCancelTime() {
		return this.cancelTime;
	}

	public void setCancelTime(Date cancelTime) {
		this.cancelTime = cancelTime;
	}

	@Column(name = "VALIDFLAG", length=1)
	public String getValidFlag() {
		return this.validFlag;
	}

	public void setValidFlag(String validFlag) {
		this.validFlag = validFlag;
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

	@Column(name = "UPDATEUSER", length=10)
	public String getUpdateUser() {
		return this.updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATETIME", length=7)
	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="prpLClaim")
	public List<PrpLClaimKind> getPrpLClaimKinds() {
		return this.prpLClaimKinds;
	}

	public void setPrpLClaimKinds(List<PrpLClaimKind> prpLClaimKinds) {
		this.prpLClaimKinds = prpLClaimKinds;
	}

    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="prpLClaim")
	public List<PrpLClaimKindFee> getPrpLClaimKindFees() {
		return this.prpLClaimKindFees;
	}

	public void setPrpLClaimKindFees(List<PrpLClaimKindFee> prpLClaimKindFees) {
		this.prpLClaimKindFees = prpLClaimKindFees;
	}

	
}
