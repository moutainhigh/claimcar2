package ins.sino.claimcar.claim.vo;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * Vo Base Class of PO PrpLLossPerson
 */ 
public class PrpLLossPersonVoBase implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String policyNo;
	private String riskCode;
	private Long dlossId;
	private Long personId;
	private String itemId;
	private String itemName;
	private String kindCode;
	private String lossType;
	private String injuryType;
	private String personName;
	private Integer personAge;
	private String currency;
	private BigDecimal sumLoss;
	private BigDecimal sumRealPay;
	private BigDecimal sumOffLoss;
	private BigDecimal offPreAmt;
	private BigDecimal bzPaidLoss;
	private BigDecimal dutyRate;
	private BigDecimal claimRate;
	private BigDecimal deductDutyRate;
	private BigDecimal deductDutyAmt;
	private BigDecimal deductAbsRate;
	private BigDecimal deductAbsAmt;
	private BigDecimal deductAddRate;
	private BigDecimal deductAddAmt;
	private BigDecimal deductOffRate;
	private BigDecimal deductOffAmt;
	private BigDecimal deductibleRate;
	private BigDecimal deductibleAmt;
	private BigDecimal itemAmount;
	private String flag;
	private String remark;
	private Date createTime;
	private Date updateTime;
	private String registNo;
	private String dlossIdExt;
	

	private List<PrpLLossPersonFeeVo> prpLLossPersonFees = new ArrayList<PrpLLossPersonFeeVo>(0);

    protected PrpLLossPersonVoBase() {
	
    }

    
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}



	public BigDecimal getDeductOffRate() {
		return this.deductOffRate;
	}

	public void setDeductOffRate(BigDecimal deductOffRate) {
		this.deductOffRate = deductOffRate;
	}

	public BigDecimal getDeductOffAmt() {
		return this.deductOffAmt;
	}
	
	public void setDeductOffAmt(BigDecimal deductOffAmt) {
		this.deductOffAmt = deductOffAmt;
	}
	
	public BigDecimal getDeductibleRate() {
		return deductibleRate;
	}

	public void setDeductibleRate(BigDecimal deductibleRate) {
		this.deductibleRate = deductibleRate;
	}

	public BigDecimal getDeductibleAmt() {
		return deductibleAmt;
	}
	
	public void setDeductibleAmt(BigDecimal deductibleAmt) {
		this.deductibleAmt = deductibleAmt;
	}


	public BigDecimal getItemAmount() {
		return itemAmount;
	}

	public void setItemAmount(BigDecimal itemAmount) {
		this.itemAmount = itemAmount;
	}


	public String getPolicyNo() {
		return this.policyNo;
	}

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	public String getRiskCode() {
		return this.riskCode;
	}

	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}

	public Long getDlossId() {
		return this.dlossId;
	}

	public void setDlossId(Long dlossId) {
		this.dlossId = dlossId;
	}

	public Long getPersonId() {
		return this.personId;
	}

	public void setPersonId(Long personId) {
		this.personId = personId;
	}

	public String getItemId() {
		return this.itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return this.itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getKindCode() {
		return this.kindCode;
	}

	public void setKindCode(String kindCode) {
		this.kindCode = kindCode;
	}

	public String getLossType() {
		return this.lossType;
	}

	public void setLossType(String lossType) {
		this.lossType = lossType;
	}

	public String getInjuryType() {
		return this.injuryType;
	}

	public void setInjuryType(String injuryType) {
		this.injuryType = injuryType;
	}

	public String getPersonName() {
		return this.personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public Integer getPersonAge() {
		return this.personAge;
	}

	public void setPersonAge(Integer personAge) {
		this.personAge = personAge;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public BigDecimal getSumLoss() {
		return this.sumLoss;
	}

	public void setSumLoss(BigDecimal sumLoss) {
		this.sumLoss = sumLoss;
	}

	public BigDecimal getSumRealPay() {
		return this.sumRealPay;
	}

	public void setSumRealPay(BigDecimal sumRealPay) {
		this.sumRealPay = sumRealPay;
	}

	public BigDecimal getSumOffLoss() {
		return this.sumOffLoss;
	}

	public void setSumOffLoss(BigDecimal sumOffLoss) {
		this.sumOffLoss = sumOffLoss;
	}

	public BigDecimal getOffPreAmt() {
		return this.offPreAmt;
	}

	public void setOffPreAmt(BigDecimal offPreAmt) {
		this.offPreAmt = offPreAmt;
	}

	public BigDecimal getBzPaidLoss() {
		return this.bzPaidLoss;
	}

	public void setBzPaidLoss(BigDecimal bzPaidLoss) {
		this.bzPaidLoss = bzPaidLoss;
	}

	public BigDecimal getDutyRate() {
		return this.dutyRate;
	}

	public void setDutyRate(BigDecimal dutyRate) {
		this.dutyRate = dutyRate;
	}

	public BigDecimal getClaimRate() {
		return this.claimRate;
	}

	public void setClaimRate(BigDecimal claimRate) {
		this.claimRate = claimRate;
	}

	public BigDecimal getDeductDutyRate() {
		return this.deductDutyRate;
	}

	public void setDeductDutyRate(BigDecimal deductDutyRate) {
		this.deductDutyRate = deductDutyRate;
	}

	public BigDecimal getDeductDutyAmt() {
		return this.deductDutyAmt;
	}

	public void setDeductDutyAmt(BigDecimal deductDutyAmt) {
		this.deductDutyAmt = deductDutyAmt;
	}

	public BigDecimal getDeductAbsRate() {
		return this.deductAbsRate;
	}

	public void setDeductAbsRate(BigDecimal deductAbsRate) {
		this.deductAbsRate = deductAbsRate;
	}

	public BigDecimal getDeductAbsAmt() {
		return this.deductAbsAmt;
	}

	public void setDeductAbsAmt(BigDecimal deductAbsAmt) {
		this.deductAbsAmt = deductAbsAmt;
	}

	public BigDecimal getDeductAddRate() {
		return this.deductAddRate;
	}

	public void setDeductAddRate(BigDecimal deductAddRate) {
		this.deductAddRate = deductAddRate;
	}

	public BigDecimal getDeductAddAmt() {
		return this.deductAddAmt;
	}

	public void setDeductAddAmt(BigDecimal deductAddAmt) {
		this.deductAddAmt = deductAddAmt;
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

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getRegistNo() {
		return this.registNo;
	}

	public void setRegistNo(String registNo) {
		this.registNo = registNo;
	}

	public List<PrpLLossPersonFeeVo> getPrpLLossPersonFees() {
		return this.prpLLossPersonFees;
	}

	public void setPrpLLossPersonFees(List<PrpLLossPersonFeeVo> prpLLossPersonFees) {
		this.prpLLossPersonFees = prpLLossPersonFees;
	}
	public String getDlossIdExt() {
		return dlossIdExt;
	}
	
	public void setDlossIdExt(String dlossIdExt) {
		this.dlossIdExt = dlossIdExt;
	}
	
}
