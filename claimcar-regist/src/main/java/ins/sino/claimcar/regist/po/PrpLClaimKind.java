package ins.sino.claimcar.regist.po;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * POJO Class PrpLClaimKind
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@TableGenerator(name = "utiSequence", table = "UTISEQUENCE", pkColumnName = "GenName", valueColumnName = "GenValue", pkColumnValue = "PRPLCLAIMKIND_PK", allocationSize = 10)
@Table(name = "PRPLCLAIMKIND")
public class PrpLClaimKind implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private PrpLClaim prpLClaim;
	private String registNo;
	private String riskCode;
	private String feeType;
	private String nodeName;
	private String kindCode;
	private String kindName;
	private String lossItemNo;
	private String lossItemName;
	private String currency;
	private BigDecimal exchRate;
	private BigDecimal amount;
	private BigDecimal defLoss;
	private BigDecimal rescueFee;
	private BigDecimal restFee;
	private BigDecimal claimLoss;
	private BigDecimal paidLoss;
	private BigDecimal deductibleRate;
	private BigDecimal deductible;
	private String adjustReason;
	private Date adjustTime;
	private String compStatus;
	private String cancelFlag;
	private String dangerUnit;
	private String validFlag;
	private String flag;
	private String remark;
	private String createUser;
	private Date createTime;
	private String updateUser;
	private Date updateTime;
	private BigDecimal carLossRate; 
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "utiSequence")
	@Column(name = "ID", unique = true, nullable = false, precision=13, scale=0)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CLAIMNO", nullable = false)
	public PrpLClaim getPrpLClaim() {
		return this.prpLClaim;
	}

	public void setPrpLClaim(PrpLClaim prpLClaim) {
		this.prpLClaim = prpLClaim;
	}

	@Column(name = "REGISTNO", nullable = false, length=25)
	public String getRegistNo() {
		return this.registNo;
	}

	public void setRegistNo(String registNo) {
		this.registNo = registNo;
	}
	
	@Column(name = "RISKCODE", nullable = false, length=4)
	public String getRiskCode() {
		return this.riskCode;
	}

	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}

	@Column(name = "FEETYPE", nullable = false, length=4)
	public String getFeeType() {
		return this.feeType;
	}

	public void setFeeType(String feeType) {
		this.feeType = feeType;
	}

	@Column(name = "NODENAME", length=20)
	public String getNodeName() {
		return this.nodeName;
	}

	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}

	@Column(name = "KINDCODE", nullable = false, length=7)
	public String getKindCode() {
		return this.kindCode;
	}

	public void setKindCode(String kindCode) {
		this.kindCode = kindCode;
	}

	@Column(name = "KINDNAME", length=120)
	public String getKindName() {
		return this.kindName;
	}

	public void setKindName(String kindName) {
		this.kindName = kindName;
	}

	@Column(name = "LOSSITEMNO", length=5)
	public String getLossItemNo() {
		return this.lossItemNo;
	}

	public void setLossItemNo(String lossItemNo) {
		this.lossItemNo = lossItemNo;
	}

	@Column(name = "LOSSITEMNAME", length=50)
	public String getLossItemName() {
		return this.lossItemName;
	}

	public void setLossItemName(String lossItemName) {
		this.lossItemName = lossItemName;
	}

	@Column(name = "CURRENCY", length=3)
	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	@Column(name = "EXCHRATE", precision=8, scale=4)
	public BigDecimal getExchRate() {
		return this.exchRate;
	}

	public void setExchRate(BigDecimal exchRate) {
		this.exchRate = exchRate;
	}

	@Column(name = "AMOUNT", precision=12)
	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	@Column(name = "DEFLOSS", nullable = false, precision=12)
	public BigDecimal getDefLoss() {
		return this.defLoss;
	}

	public void setDefLoss(BigDecimal defLoss) {
		this.defLoss = defLoss;
	}

	@Column(name = "RESCUEFEE", precision=12)
	public BigDecimal getRescueFee() {
		return this.rescueFee;
	}

	public void setRescueFee(BigDecimal rescueFee) {
		this.rescueFee = rescueFee;
	}

	@Column(name = "RESTFEE", precision = 12)
	public BigDecimal getRestFee() {
		return restFee;
	}

	public void setRestFee(BigDecimal restFee) {
		this.restFee = restFee;
	}
	@Column(name = "CLAIMLOSS", nullable = false, precision=12)
	public BigDecimal getClaimLoss() {
		return this.claimLoss;
	}

	public void setClaimLoss(BigDecimal claimLoss) {
		this.claimLoss = claimLoss;
	}

	@Column(name = "PAIDLOSS", precision=12)
	public BigDecimal getPaidLoss() {
		return this.paidLoss;
	}

	public void setPaidLoss(BigDecimal paidLoss) {
		this.paidLoss = paidLoss;
	}

	@Column(name = "DEDUCTIBLERATE", precision=8, scale=4)
	public BigDecimal getDeductibleRate() {
		return this.deductibleRate;
	}

	public void setDeductibleRate(BigDecimal deductibleRate) {
		this.deductibleRate = deductibleRate;
	}

	@Column(name = "DEDUCTIBLE", precision=12)
	public BigDecimal getDeductible() {
		return this.deductible;
	}

	public void setDeductible(BigDecimal deductible) {
		this.deductible = deductible;
	}

	@Column(name = "ADJUSTREASON", length=2000)
	public String getAdjustReason() {
		return this.adjustReason;
	}

	public void setAdjustReason(String adjustReason) {
		this.adjustReason = adjustReason;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ADJUSTTIME", nullable = false, length=7)
	public Date getAdjustTime() {
		return this.adjustTime;
	}

	public void setAdjustTime(Date adjustTime) {
		this.adjustTime = adjustTime;
	}

	@Column(name = "COMPSTATUS", length=1)
	public String getCompStatus() {
		return this.compStatus;
	}

	public void setCompStatus(String compStatus) {
		this.compStatus = compStatus;
	}

	@Column(name = "CANCELFLAG", length=1)
	public String getCancelFlag() {
		return this.cancelFlag;
	}

	public void setCancelFlag(String cancelFlag) {
		this.cancelFlag = cancelFlag;
	}

	@Column(name = "DANGERUNIT", length=10)
	public String getDangerUnit() {
		return this.dangerUnit;
	}

	public void setDangerUnit(String dangerUnit) {
		this.dangerUnit = dangerUnit;
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

	@Column(name = "REMARK", length=120)
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

	@Column(name = "CARLOSSRATE", precision=8, scale=4)
	public BigDecimal getCarLossRate() {
		return carLossRate;
	}

	public void setCarLossRate(BigDecimal carLossRate) {
		this.carLossRate = carLossRate;
	}
}
