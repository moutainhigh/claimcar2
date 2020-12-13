package ins.sino.claimcar.claim.vo;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
import java.math.BigDecimal;
import java.util.Date;



/**
 * Vo Base Class of PO PrpLClaimKindHis
 */ 
public class PrpLClaimKindHisVoBase implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String registNo;
	private String claimNo;
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
	private BigDecimal defLossChg;
	private BigDecimal rescueFee;
	private BigDecimal rescueFeeChg;
	private BigDecimal claimLoss;
	private BigDecimal claimLossChg;
	private BigDecimal deductibleRate;
	private BigDecimal deductible;
	private BigDecimal paidLoss;
	private Integer estiTimes;
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
	
    protected PrpLClaimKindHisVoBase() {
	
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

	public String getClaimNo() {
		return this.claimNo;
	}

	public void setClaimNo(String claimNo) {
		this.claimNo = claimNo;
	}

	public String getRiskCode() {
		return this.riskCode;
	}

	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}

	public String getFeeType() {
		return this.feeType;
	}

	public void setFeeType(String feeType) {
		this.feeType = feeType;
	}

	public String getNodeName() {
		return this.nodeName;
	}

	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}

	public String getKindCode() {
		return this.kindCode;
	}

	public void setKindCode(String kindCode) {
		this.kindCode = kindCode;
	}

	public String getKindName() {
		return this.kindName;
	}

	public void setKindName(String kindName) {
		this.kindName = kindName;
	}

	public String getLossItemNo() {
		return this.lossItemNo;
	}

	public void setLossItemNo(String lossItemNo) {
		this.lossItemNo = lossItemNo;
	}

	public String getLossItemName() {
		return this.lossItemName;
	}

	public void setLossItemName(String lossItemName) {
		this.lossItemName = lossItemName;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public BigDecimal getExchRate() {
		return this.exchRate;
	}

	public void setExchRate(BigDecimal exchRate) {
		this.exchRate = exchRate;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getDefLoss() {
		return this.defLoss;
	}

	public void setDefLoss(BigDecimal defLoss) {
		this.defLoss = defLoss;
	}

	public BigDecimal getDefLossChg() {
		return this.defLossChg;
	}

	public void setDefLossChg(BigDecimal defLossChg) {
		this.defLossChg = defLossChg;
	}

	public BigDecimal getRescueFee() {
		return this.rescueFee;
	}

	public void setRescueFee(BigDecimal rescueFee) {
		this.rescueFee = rescueFee;
	}

	public BigDecimal getRescueFeeChg() {
		return this.rescueFeeChg;
	}

	public void setRescueFeeChg(BigDecimal rescueFeeChg) {
		this.rescueFeeChg = rescueFeeChg;
	}

	public BigDecimal getClaimLoss() {
		return this.claimLoss;
	}

	public void setClaimLoss(BigDecimal claimLoss) {
		this.claimLoss = claimLoss;
	}

	public BigDecimal getClaimLossChg() {
		return this.claimLossChg;
	}

	public void setClaimLossChg(BigDecimal claimLossChg) {
		this.claimLossChg = claimLossChg;
	}

	public BigDecimal getDeductibleRate() {
		return this.deductibleRate;
	}

	public void setDeductibleRate(BigDecimal deductibleRate) {
		this.deductibleRate = deductibleRate;
	}

	public BigDecimal getDeductible() {
		return this.deductible;
	}

	public void setDeductible(BigDecimal deductible) {
		this.deductible = deductible;
	}

	public BigDecimal getPaidLoss() {
		return this.paidLoss;
	}

	public void setPaidLoss(BigDecimal paidLoss) {
		this.paidLoss = paidLoss;
	}

	public String getAdjustReason() {
		return this.adjustReason;
	}

	public void setAdjustReason(String adjustReason) {
		this.adjustReason = adjustReason;
	}

	public Date getAdjustTime() {
		return this.adjustTime;
	}

	public void setAdjustTime(Date adjustTime) {
		this.adjustTime = adjustTime;
	}

	public String getCompStatus() {
		return this.compStatus;
	}

	public void setCompStatus(String compStatus) {
		this.compStatus = compStatus;
	}

	public String getCancelFlag() {
		return this.cancelFlag;
	}

	public void setCancelFlag(String cancelFlag) {
		this.cancelFlag = cancelFlag;
	}

	public String getDangerUnit() {
		return this.dangerUnit;
	}

	public void setDangerUnit(String dangerUnit) {
		this.dangerUnit = dangerUnit;
	}

	public String getValidFlag() {
		return this.validFlag;
	}

	public void setValidFlag(String validFlag) {
		this.validFlag = validFlag;
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

	public Integer getEstiTimes() {
		return estiTimes;
	}

	public void setEstiTimes(Integer estiTimes) {
		this.estiTimes = estiTimes;
	}


	public BigDecimal getCarLossRate() {
		return carLossRate;
	}


	public void setCarLossRate(BigDecimal carLossRate) {
		this.carLossRate = carLossRate;
	}
}
