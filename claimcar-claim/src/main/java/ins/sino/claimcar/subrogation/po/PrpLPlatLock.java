package ins.sino.claimcar.subrogation.po;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * POJO Class PrpLPlatLock
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@TableGenerator(name = "utiSequence", table = "UTISEQUENCE", pkColumnName = "GenName", valueColumnName = "GenValue", pkColumnValue = "PRPLPLATLOCK_PK", allocationSize = 10)
@Table(name = "PRPLPLATLOCK")
public class PrpLPlatLock implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String recoveryCode;
	private String claimSequenceNo;
	private String registNo;
	private String policyNo;
	private String licenseNo;
	private String insureName;
	private String riskCode;
	private String oppoentRegistNo;
	private String oppoentInsurerCode;
	private String oppoentInsurerArea;
	private String coverageType;
	private String oppoentPolicyNo;
	private String oppoentLicensePlateNo;
	private String oppoentLicensePlateType;
	private String oppoentEngineNo;
	private String oppoentVin;
	private Date lossTime;
	private String lossArea;
	private String lossDesc;
	private Date lockTime;
	private String recoveryOrPayFlag;
	private String recoveryOrPayType;
	private String recoveryCodeStatus;
	private String recoverOrPayStatus;
	private Date startTime;
	private BigDecimal sumRecoveryAmount;
	private BigDecimal sumRealAmount;
	private String comCode;
	private String lockedOperateCode;
	private String lockedOperateName;
	private Date failureTime;
	private String failureCause;
	private String unlockedOperateCode;
	private String unlockedOperateName;
	private String qsConfirmOperateCode;
	private String qsConfirmOperateName;
	private String checkStats;
	private String createUser;
	private Date createTime;
	private String updateUser;
	private Date updateTime;
	private List<PrpLRecoveryOrPay> prpLRecoveryOrPays = new ArrayList<PrpLRecoveryOrPay>(0);

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "utiSequence")
	@Column(name = "ID", unique = true, nullable = false, precision=12, scale=0)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "RECOVERYCODE", nullable = false, length=50)
	public String getRecoveryCode() {
		return this.recoveryCode;
	}

	public void setRecoveryCode(String recoveryCode) {
		this.recoveryCode = recoveryCode;
	}

	@Column(name = "CLAIMSEQUENCENO", nullable = false, length=50)
	public String getClaimSequenceNo() {
		return this.claimSequenceNo;
	}

	public void setClaimSequenceNo(String claimSequenceNo) {
		this.claimSequenceNo = claimSequenceNo;
	}

	@Column(name = "REGISTNO", nullable = false, length=50)
	public String getRegistNo() {
		return this.registNo;
	}

	public void setRegistNo(String registNo) {
		this.registNo = registNo;
	}

	@Column(name = "POLICYNO", nullable = false, length=50)
	public String getPolicyNo() {
		return this.policyNo;
	}

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	@Column(name = "LICENSENO", nullable = false, length=15)
	public String getLicenseNo() {
		return this.licenseNo;
	}

	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}

	@Column(name = "INSURENAME", nullable = false, length=50)
	public String getInsureName() {
		return this.insureName;
	}

	public void setInsureName(String insureName) {
		this.insureName = insureName;
	}

	@Column(name = "RISKCODE", length=4)
	public String getRiskCode() {
		return this.riskCode;
	}

	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}

	@Column(name = "OPPOENTREGISTNO", length=50)
	public String getOppoentRegistNo() {
		return this.oppoentRegistNo;
	}

	public void setOppoentRegistNo(String oppoentRegistNo) {
		this.oppoentRegistNo = oppoentRegistNo;
	}

	@Column(name = "OPPOENTINSURERCODE", nullable = false, length=4)
	public String getOppoentInsurerCode() {
		return this.oppoentInsurerCode;
	}

	public void setOppoentInsurerCode(String oppoentInsurerCode) {
		this.oppoentInsurerCode = oppoentInsurerCode;
	}

	@Column(name = "OPPOENTINSURERAREA", nullable = false, length=6)
	public String getOppoentInsurerArea() {
		return this.oppoentInsurerArea;
	}

	public void setOppoentInsurerArea(String oppoentInsurerArea) {
		this.oppoentInsurerArea = oppoentInsurerArea;
	}

	@Column(name = "COVERAGETYPE", nullable = false, length=1)
	public String getCoverageType() {
		return this.coverageType;
	}

	public void setCoverageType(String coverageType) {
		this.coverageType = coverageType;
	}

	@Column(name = "OPPOENTPOLICYNO", nullable = false, length=50)
	public String getOppoentPolicyNo() {
		return this.oppoentPolicyNo;
	}

	public void setOppoentPolicyNo(String oppoentPolicyNo) {
		this.oppoentPolicyNo = oppoentPolicyNo;
	}

	@Column(name = "OPPOENTLICENSEPLATENO", length=15)
	public String getOppoentLicensePlateNo() {
		return this.oppoentLicensePlateNo;
	}

	public void setOppoentLicensePlateNo(String oppoentLicensePlateNo) {
		this.oppoentLicensePlateNo = oppoentLicensePlateNo;
	}

	@Column(name = "OPPOENTLICENSEPLATETYPE", length=2)
	public String getOppoentLicensePlateType() {
		return this.oppoentLicensePlateType;
	}

	public void setOppoentLicensePlateType(String oppoentLicensePlateType) {
		this.oppoentLicensePlateType = oppoentLicensePlateType;
	}

	@Column(name = "OPPOENTENGINENO", length=50)
	public String getOppoentEngineNo() {
		return this.oppoentEngineNo;
	}

	public void setOppoentEngineNo(String oppoentEngineNo) {
		this.oppoentEngineNo = oppoentEngineNo;
	}

	@Column(name = "OPPOENTVIN", length=50)
	public String getOppoentVin() {
		return this.oppoentVin;
	}

	public void setOppoentVin(String oppoentVin) {
		this.oppoentVin = oppoentVin;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LOSSTIME", nullable = false, length=7)
	public Date getLossTime() {
		return this.lossTime;
	}

	public void setLossTime(Date lossTime) {
		this.lossTime = lossTime;
	}

	@Column(name = "LOSSAREA", length=100)
	public String getLossArea() {
		return this.lossArea;
	}

	public void setLossArea(String lossArea) {
		this.lossArea = lossArea;
	}

	@Column(name = "LOSSDESC", length=1000)
	public String getLossDesc() {
		return this.lossDesc;
	}

	public void setLossDesc(String lossDesc) {
		this.lossDesc = lossDesc;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LOCKTIME", length=7)
	public Date getLockTime() {
		return this.lockTime;
	}

	public void setLockTime(Date lockTime) {
		this.lockTime = lockTime;
	}

	@Column(name = "RECOVERYORPAYFLAG", length=1)
	public String getRecoveryOrPayFlag() {
		return this.recoveryOrPayFlag;
	}

	public void setRecoveryOrPayFlag(String recoveryOrPayFlag) {
		this.recoveryOrPayFlag = recoveryOrPayFlag;
	}

	@Column(name = "RECOVERYORPAYTYPE", length=5)
	public String getRecoveryOrPayType() {
		return this.recoveryOrPayType;
	}

	public void setRecoveryOrPayType(String recoveryOrPayType) {
		this.recoveryOrPayType = recoveryOrPayType;
	}

	@Column(name = "RECOVERYCODESTATUS", length=2)
	public String getRecoveryCodeStatus() {
		return this.recoveryCodeStatus;
	}

	public void setRecoveryCodeStatus(String recoveryCodeStatus) {
		this.recoveryCodeStatus = recoveryCodeStatus;
	}

	@Column(name = "RECOVERORPAYSTATUS", length=1)
	public String getRecoverOrPayStatus() {
		return this.recoverOrPayStatus;
	}

	public void setRecoverOrPayStatus(String recoverOrPayStatus) {
		this.recoverOrPayStatus = recoverOrPayStatus;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "STARTTIME", length=7)
	public Date getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	@Column(name = "SUMRECOVERYAMOUNT", precision=14)
	public BigDecimal getSumRecoveryAmount() {
		return this.sumRecoveryAmount;
	}

	public void setSumRecoveryAmount(BigDecimal sumRecoveryAmount) {
		this.sumRecoveryAmount = sumRecoveryAmount;
	}

	@Column(name = "SUMREALAMOUNT", precision=14)
	public BigDecimal getSumRealAmount() {
		return this.sumRealAmount;
	}

	public void setSumRealAmount(BigDecimal sumRealAmount) {
		this.sumRealAmount = sumRealAmount;
	}

	@Column(name = "COMCODE", length=8)
	public String getComCode() {
		return this.comCode;
	}

	public void setComCode(String comCode) {
		this.comCode = comCode;
	}

	@Column(name = "LOCKEDOPERATECODE", length=10)
	public String getLockedOperateCode() {
		return this.lockedOperateCode;
	}

	public void setLockedOperateCode(String lockedOperateCode) {
		this.lockedOperateCode = lockedOperateCode;
	}

	@Column(name = "LOCKEDOPERATENAME", length=50)
	public String getLockedOperateName() {
		return this.lockedOperateName;
	}

	public void setLockedOperateName(String lockedOperateName) {
		this.lockedOperateName = lockedOperateName;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "FAILURETIME", length=7)
	public Date getFailureTime() {
		return this.failureTime;
	}

	public void setFailureTime(Date failureTime) {
		this.failureTime = failureTime;
	}

	@Column(name = "FAILURECAUSE", length=1)
	public String getFailureCause() {
		return this.failureCause;
	}

	public void setFailureCause(String failureCause) {
		this.failureCause = failureCause;
	}

	@Column(name = "UNLOCKEDOPERATECODE", length=10)
	public String getUnlockedOperateCode() {
		return this.unlockedOperateCode;
	}

	public void setUnlockedOperateCode(String unlockedOperateCode) {
		this.unlockedOperateCode = unlockedOperateCode;
	}

	@Column(name = "UNLOCKEDOPERATENAME", length=50)
	public String getUnlockedOperateName() {
		return this.unlockedOperateName;
	}

	public void setUnlockedOperateName(String unlockedOperateName) {
		this.unlockedOperateName = unlockedOperateName;
	}

	@Column(name = "QSCONFIRMOPERATECODE", length=10)
	public String getQsConfirmOperateCode() {
		return this.qsConfirmOperateCode;
	}

	public void setQsConfirmOperateCode(String qsConfirmOperateCode) {
		this.qsConfirmOperateCode = qsConfirmOperateCode;
	}

	@Column(name = "QSCONFIRMOPERATENAME", length=50)
	public String getQsConfirmOperateName() {
		return this.qsConfirmOperateName;
	}

	public void setQsConfirmOperateName(String qsConfirmOperateName) {
		this.qsConfirmOperateName = qsConfirmOperateName;
	}

	@Column(name = "CHECKSTATS", length=1)
	public String getCheckStats() {
		return this.checkStats;
	}

	public void setCheckStats(String checkStats) {
		this.checkStats = checkStats;
	}

	@Column(name = "CREATEUSER", length=10)
	public String getCreateUser() {
		return this.createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATETIME", length=7)
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

    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="prpLPlatLock")
    @OrderBy(value="times")
	public List<PrpLRecoveryOrPay> getPrpLRecoveryOrPays() {
		return this.prpLRecoveryOrPays;
	}

	public void setPrpLRecoveryOrPays(List<PrpLRecoveryOrPay> prpLRecoveryOrPays) {
		this.prpLRecoveryOrPays = prpLRecoveryOrPays;
	}
}
