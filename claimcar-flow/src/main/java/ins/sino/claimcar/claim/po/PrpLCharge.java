package ins.sino.claimcar.claim.po;

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

@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@TableGenerator(name = "utiSequence", table = "UTISEQUENCE", pkColumnName = "GenName", valueColumnName = "GenValue", pkColumnValue = "PRPLCHARGE_PK", allocationSize = 10)
@Table(name = "PRPLCHARGE")
public class PrpLCharge implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private PrpLCompensate prpLCompensate;
	private String policyNo;
	private String riskCode;
	private String kindCode;
	private String businessType;
	private String chargeCode;
	private String chargeName;
	private String currency;
	private BigDecimal exchRate;
	private BigDecimal feeAmt;
	private BigDecimal offAmt;
	private BigDecimal offPreAmt;
	private BigDecimal feeRealAmt;
	private Long businessId;
	private String validFlag;
	private String flag;
	private String remark;
	private Date createTime;
	private Date updateTime;
	private Long payeeId;
	private String payStatus;
	private String serialNo;
	private Date payTime;
	private String summary;
	private String settleNo;
	
	private String vatInvoiceFlag;
	private String vatTaxRate;
	private BigDecimal regsumAmount;
	/** 平安支付信息主键 */
	private String idClmPaymentResult;
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

	@Column(name = "POLICYNO", length=22)
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

	@Column(name = "KINDCODE", nullable = false, length=6)
	public String getKindCode() {
		return this.kindCode;
	}

	public void setKindCode(String kindCode) {
		this.kindCode = kindCode;
	}

	@Column(name = "BUSINESSTYPE", length=10)
	public String getBusinessType() {
		return this.businessType;
	}

	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	@Column(name = "CHARGECODE", nullable = false, length=3)
	public String getChargeCode() {
		return this.chargeCode;
	}

	public void setChargeCode(String chargeCode) {
		this.chargeCode = chargeCode;
	}

	@Column(name = "CHARGENAME", length=16)
	public String getChargeName() {
		return this.chargeName;
	}

	public void setChargeName(String chargeName) {
		this.chargeName = chargeName;
	}

	@Column(name = "CURRENCY", nullable = false, length=3)
	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	@Column(name = "EXCHRATE", precision=8)
	public BigDecimal getExchRate() {
		return this.exchRate;
	}

	public void setExchRate(BigDecimal exchRate) {
		this.exchRate = exchRate;
	}

	@Column(name = "FEEAMT", nullable = false, precision=12)
	public BigDecimal getFeeAmt() {
		return this.feeAmt;
	}

	public void setFeeAmt(BigDecimal feeAmt) {
		this.feeAmt = feeAmt;
	}

	@Column(name = "OFFAMT", precision=12)
	public BigDecimal getOffAmt() {
		return this.offAmt;
	}

	public void setOffAmt(BigDecimal offAmt) {
		this.offAmt = offAmt;
	}

	@Column(name = "OFFPREAMT", precision=12)
	public BigDecimal getOffPreAmt() {
		return this.offPreAmt;
	}

	public void setOffPreAmt(BigDecimal offPreAmt) {
		this.offPreAmt = offPreAmt;
	}

	@Column(name = "FEEREALAMT", precision=12)
	public BigDecimal getFeeRealAmt() {
		return this.feeRealAmt;
	}

	public void setFeeRealAmt(BigDecimal feeRealAmt) {
		this.feeRealAmt = feeRealAmt;
	}

	@Column(name = "BUSINESSID", precision=10, scale=0)
	public Long getBusinessId() {
		return this.businessId;
	}

	public void setBusinessId(Long businessId) {
		this.businessId = businessId;
	}

	@Column(name = "VALIDFLAG", nullable = false, length=1)
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

	@Column(name = "REMARK")
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATETIME", length=7)
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATETIME", length=7)
	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@Column(name = "PAYEEID", nullable = false, scale=0)
	public Long getPayeeId() {
		return this.payeeId;
	}

	public void setPayeeId(Long payeeId) {
		this.payeeId = payeeId;
	}

	@Column(name = "PAYSTATUS", length=3)
	public String getPayStatus() {
		return this.payStatus;
	}

	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}

	@Column(name = "SERIALNO", length=4)
	public String getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "PAYTIME", length=7)
	public Date getPayTime() {
		return payTime;
	}

	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	@Column(name = "SUMMARY", length=2000)
	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	@Column(name = "SETTLENO", length=50)
	public String getSettleNo() {
		return settleNo;
	}

	public void setSettleNo(String settleNo) {
		this.settleNo = settleNo;
	}
	
	@Column(name = "VATINVOICEFLAG")
	public String getVatInvoiceFlag() {
		return vatInvoiceFlag;
	}

	public void setVatInvoiceFlag(String vatInvoiceFlag) {
		this.vatInvoiceFlag = vatInvoiceFlag;
	}
	
	@Column(name = "VATTAXRATE")
	public String getVatTaxRate() {
		return vatTaxRate;
	}

	public void setVatTaxRate(String vatTaxRate) {
		this.vatTaxRate = vatTaxRate;
	}
	@Column(name = "REGSUMAMOUNT", precision=12)
	public BigDecimal getRegsumAmount() {
		return regsumAmount;
	}

	public void setRegsumAmount(BigDecimal regsumAmount) {
		this.regsumAmount = regsumAmount;
	}

	@Column(name = "IDCLMPAYMENTRESULT", length=50)
	public String getIdClmPaymentResult() { return idClmPaymentResult; }

	public void setIdClmPaymentResult(String idClmPaymentResult) { this.idClmPaymentResult = idClmPaymentResult; }
}
