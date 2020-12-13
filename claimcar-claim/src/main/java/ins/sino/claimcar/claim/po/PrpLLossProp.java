package ins.sino.claimcar.claim.po;

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
 * POJO Class PrpLLossProp
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@TableGenerator(name = "utiSequence", table = "UTISEQUENCE", pkColumnName = "GenName", valueColumnName = "GenValue", pkColumnValue = "PRPLLOSSPROP_PK", allocationSize = 10)
@Table(name = "PRPLLOSSPROP")
public class PrpLLossProp implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private PrpLCompensate prpLCompensate;
	private String policyNo;
	private String riskCode;
	private String propType ;
	private Long dlossId;
	private String itemId;
	private String itemName;
	private String kindCode;
	private BigDecimal itemAmount ;
	private BigDecimal itemValue;
	private String currency;
	private String lossType;
	private String lossName;
	private BigDecimal lossQuantity;
	private String unit;
	private BigDecimal unitPrice;
	private BigDecimal sumLoss;
	private BigDecimal sumRealPay;
	private BigDecimal sumRest;
	private BigDecimal dutyRate;
	private BigDecimal claimRate;
	private BigDecimal bzPaidRescueFee;
	private BigDecimal bzPaidLoss;
	private BigDecimal offPreAmt;
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
	private BigDecimal otherDeductAmt;
	private BigDecimal rescueFee;
	private String deductFlag;
	private String flag;
	private String remark;
	private Date createTime;
	private Date updateTime;
	private Long dlossCarInfoId;
	private String dlossIdExt;
    private BigDecimal originLossFee;  //保存初始化的 定损金额 发票金额 小值

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
    @JoinColumn(name="COMPENSATENO", nullable = false)
	public PrpLCompensate getPrpLCompensate() {
		return this.prpLCompensate;
	}

	public void setPrpLCompensate(PrpLCompensate prpLCompensate) {
		this.prpLCompensate = prpLCompensate;
	}

	@Column(name = "POLICYNO", nullable = false, length=23)
	public String getPolicyNo() {
		return this.policyNo;
	}

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	@Column(name = "RISKCODE", nullable = false, length=5)
	public String getRiskCode() {
		return this.riskCode;
	}

	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}

	@Column(name = "PROPTYPE", nullable = false, length=2)
	public String getPropType () {
		return this.propType ;
	}

	public void setPropType (String propType ) {
		this.propType  = propType ;
	}

	@Column(name = "DLOSSID", precision=13, scale=0)
	public Long getDlossId() {
		return this.dlossId;
	}

	public void setDlossId(Long dlossId) {
		this.dlossId = dlossId;
	}

	@Column(name = "ITEMID", length=3)
	public String getItemId() {
		return this.itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	@Column(name = "ITEMNAME", length=100)
	public String getItemName() {
		return this.itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	@Column(name = "KINDCODE", nullable = false, length=6)
	public String getKindCode() {
		return this.kindCode;
	}

	public void setKindCode(String kindCode) {
		this.kindCode = kindCode;
	}

	@Column(name = "ITEMAMOUNT", precision=14)
	public BigDecimal getItemAmount () {
		return this.itemAmount ;
	}

	public void setItemAmount (BigDecimal itemAmount ) {
		this.itemAmount  = itemAmount ;
	}

	@Column(name = "ITEMVALUE", precision=14)
	public BigDecimal getItemValue() {
		return this.itemValue;
	}

	public void setItemValue(BigDecimal itemValue) {
		this.itemValue = itemValue;
	}

	@Column(name = "CURRENCY", length=3)
	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	@Column(name = "LOSSTYPE", length=2)
	public String getLossType() {
		return this.lossType;
	}

	public void setLossType(String lossType) {
		this.lossType = lossType;
	}

	@Column(name = "LOSSNAME", length=100)
	public String getLossName() {
		return this.lossName;
	}

	public void setLossName(String lossName) {
		this.lossName = lossName;
	}

	@Column(name = "LOSSQUANTITY", precision=14)
	public BigDecimal getLossQuantity() {
		return this.lossQuantity;
	}

	public void setLossQuantity(BigDecimal lossQuantity) {
		this.lossQuantity = lossQuantity;
	}

	@Column(name = "UNIT", length=10)
	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	@Column(name = "UNITPRICE", precision=14)
	public BigDecimal getUnitPrice() {
		return this.unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	@Column(name = "SUMLOSS", precision=14)
	public BigDecimal getSumLoss() {
		return this.sumLoss;
	}

	public void setSumLoss(BigDecimal sumLoss) {
		this.sumLoss = sumLoss;
	}

	@Column(name = "SUMREALPAY", precision=14)
	public BigDecimal getSumRealPay() {
		return this.sumRealPay;
	}

	public void setSumRealPay(BigDecimal sumRealPay) {
		this.sumRealPay = sumRealPay;
	}

	@Column(name = "SUMREST", precision=14)
	public BigDecimal getSumRest() {
		return this.sumRest;
	}

	public void setSumRest(BigDecimal sumRest) {
		this.sumRest = sumRest;
	}

	@Column(name = "DUTYRATE", precision=8, scale=4)
	public BigDecimal getDutyRate() {
		return this.dutyRate;
	}

	public void setDutyRate(BigDecimal dutyRate) {
		this.dutyRate = dutyRate;
	}

	@Column(name = "CLAIMRATE", precision=8, scale=4)
	public BigDecimal getClaimRate() {
		return this.claimRate;
	}

	public void setClaimRate(BigDecimal claimRate) {
		this.claimRate = claimRate;
	}

	@Column(name = "BZPAIDRESCUEFEE", precision=14)
	public BigDecimal getBzPaidRescueFee() {
		return this.bzPaidRescueFee;
	}

	public void setBzPaidRescueFee(BigDecimal bzPaidRescueFee) {
		this.bzPaidRescueFee = bzPaidRescueFee;
	}

	@Column(name = "BZPAIDLOSS", precision=14)
	public BigDecimal getBzPaidLoss() {
		return this.bzPaidLoss;
	}

	public void setBzPaidLoss(BigDecimal bzPaidLoss) {
		this.bzPaidLoss = bzPaidLoss;
	}

	@Column(name = "OFFPREAMT", precision=14)
	public BigDecimal getOffPreAmt() {
		return this.offPreAmt;
	}

	public void setOffPreAmt(BigDecimal offPreAmt) {
		this.offPreAmt = offPreAmt;
	}

	@Column(name = "DEDUCTDUTYRATE", precision=8, scale=4)
	public BigDecimal getDeductDutyRate() {
		return this.deductDutyRate;
	}

	public void setDeductDutyRate(BigDecimal deductDutyRate) {
		this.deductDutyRate = deductDutyRate;
	}

	@Column(name = "DEDUCTDUTYAMT", precision=12)
	public BigDecimal getDeductDutyAmt() {
		return this.deductDutyAmt;
	}

	public void setDeductDutyAmt(BigDecimal deductDutyAmt) {
		this.deductDutyAmt = deductDutyAmt;
	}

	@Column(name = "DEDUCTABSRATE", precision=8, scale=4)
	public BigDecimal getDeductAbsRate() {
		return this.deductAbsRate;
	}

	public void setDeductAbsRate(BigDecimal deductAbsRate) {
		this.deductAbsRate = deductAbsRate;
	}

	@Column(name = "DEDUCTABSAMT", precision=12)
	public BigDecimal getDeductAbsAmt() {
		return this.deductAbsAmt;
	}

	public void setDeductAbsAmt(BigDecimal deductAbsAmt) {
		this.deductAbsAmt = deductAbsAmt;
	}

	@Column(name = "DEDUCTADDRATE", precision=8, scale=4)
	public BigDecimal getDeductAddRate() {
		return this.deductAddRate;
	}

	public void setDeductAddRate(BigDecimal deductAddRate) {
		this.deductAddRate = deductAddRate;
	}

	@Column(name = "DEDUCTADDAMT", precision=12)
	public BigDecimal getDeductAddAmt() {
		return this.deductAddAmt;
	}

	public void setDeductAddAmt(BigDecimal deductAddAmt) {
		this.deductAddAmt = deductAddAmt;
	}

	@Column(name = "DEDUCTOFFRATE", precision=8, scale=4)
	public BigDecimal getDeductOffRate() {
		return this.deductOffRate;
	}

	public void setDeductOffRate(BigDecimal deductOffRate) {
		this.deductOffRate = deductOffRate;
	}

	@Column(name = "DEDUCTOFFAMT", precision=12)
	public BigDecimal getDeductOffAmt() {
		return this.deductOffAmt;
	}

	public void setDeductOffAmt(BigDecimal deductOffAmt) {
		this.deductOffAmt = deductOffAmt;
	}
	
	@Column(name = "DEDUCTIBLERATE", precision=8, scale=4)
	public BigDecimal getDeductibleRate() {
		return deductibleRate;
	}

	public void setDeductibleRate(BigDecimal deductibleRate) {
		this.deductibleRate = deductibleRate;
	}

	@Column(name = "DEDUCTIBLEAMT", precision=12)
	public BigDecimal getDeductibleAmt() {
		return deductibleAmt;
	}

	public void setDeductibleAmt(BigDecimal deductibleAmt) {
		this.deductibleAmt = deductibleAmt;
	}

	@Column(name = "OTHERDEDUCTAMT", precision=14)
	public BigDecimal getOtherDeductAmt() {
		return this.otherDeductAmt;
	}

	public void setOtherDeductAmt(BigDecimal otherDeductAmt) {
		this.otherDeductAmt = otherDeductAmt;
	}

	@Column(name = "RESCUEFEE", precision=14)
	public BigDecimal getRescueFee() {
		return this.rescueFee;
	}

	public void setRescueFee(BigDecimal rescueFee) {
		this.rescueFee = rescueFee;
	}

	@Column(name = "DEDUCTFLAG", length=1)
	public String getDeductFlag() {
		return this.deductFlag;
	}

	public void setDeductFlag(String deductFlag) {
		this.deductFlag = deductFlag;
	}

	@Column(name = "FLAG", length=10)
	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	@Column(name = "REMARK")
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATETIME", nullable = false, length=7)
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATETIME", nullable = false, length=7)
	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@Column(name = "DLOSSCARINFOID", precision=13, scale=0)
	public Long getDlossCarInfoId() {
		return this.dlossCarInfoId;
	}

	public void setDlossCarInfoId(Long dlossCarInfoId) {
		this.dlossCarInfoId = dlossCarInfoId;
	}
	
	@Column(name = "DLOSSIDEXT")
	public String getDlossIdExt() {
		return dlossIdExt;
	}

	public void setDlossIdExt(String dlossIdExt) {
		this.dlossIdExt = dlossIdExt;
	}
	
	@Column(name = "ORIGINLOSSFEE", precision=14)
	public BigDecimal getOriginLossFee() {
		return originLossFee;
	}

	public void setOriginLossFee(BigDecimal originLossFee) {
		this.originLossFee = originLossFee;
	}
}
