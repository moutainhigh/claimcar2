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
@TableGenerator(name = "utiSequence", table = "UTISEQUENCE", pkColumnName = "GenName", valueColumnName = "GenValue", pkColumnValue = "PRPLPAYMENT_PK", allocationSize = 10)
@Table(name = "PRPLPAYMENT")
public class PrpLPayment implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private PrpLCompensate prpLCompensate;
	private String otherFlag;
	private String otherCause;
	private BigDecimal sumRealPay;
	private String payStatus;
	private String sendPayStatus;
	private Date createTime;
	private Date updateTime;
	private Long payeeId;
	private Date payTime;
	private String serialNo;
	private String settleNo;
	private String summary;
	private String invoiceType;
	private String addTaxRate;
	private String addTaxValue;
	private String noTaxValue;
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

	@Column(name = "OTHERFLAG", nullable = false, length=2)
	public String getOtherFlag() {
		return this.otherFlag;
	}

	public void setOtherFlag(String otherFlag) {
		this.otherFlag = otherFlag;
	}

	@Column(name = "OTHERCAUSE", length=5)
	public String getOtherCause() {
		return this.otherCause;
	}

	public void setOtherCause(String otherCause) {
		this.otherCause = otherCause;
	}

	@Column(name = "SUMREALPAY", nullable = false, precision=14)
	public BigDecimal getSumRealPay() {
		return this.sumRealPay;
	}

	public void setSumRealPay(BigDecimal sumRealPay) {
		this.sumRealPay = sumRealPay;
	}

	@Column(name = "PAYSTATUS", length=3)
	public String getPayStatus() {
		return this.payStatus;
	}

	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}

	@Column(name = "SENDPAYSTATUS", length=3)
	public String getSendPayStatus() {
		return this.sendPayStatus;
	}

	public void setSendPayStatus(String sendPayStatus) {
		this.sendPayStatus = sendPayStatus;
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
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "PAYTIME", length=7)
	public Date getPayTime() {
		return this.payTime;
	}

	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	@Column(name = "SERIALNO", length=4)
	public String getSerialNo() {
		return serialNo;
	}
	
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	@Column(name = "SETTLENO", length=50)
	public String getSettleNo() {
		return settleNo;
	}

	public void setSettleNo(String settleNo) {
		this.settleNo = settleNo;
	}

	@Column(name = "SUMMARY", length=3000)
	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}
	@Column(name = "INVOICETYPE", length=10)
	public String getInvoiceType() {
		return invoiceType;
	}

	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}
	@Column(name = "ADDTAXRATE", length=10)
	public String getAddTaxRate() {
		return addTaxRate;
	}

	public void setAddTaxRate(String addTaxRate) {
		this.addTaxRate = addTaxRate;
	}
	@Column(name = "ADDTAXVALUE", length=10)
	public String getAddTaxValue() {
		return addTaxValue;
	}

	public void setAddTaxValue(String addTaxValue) {
		this.addTaxValue = addTaxValue;
	}
	@Column(name = "NOTAXVALUE", length=10)
	public String getNoTaxValue() {
		return noTaxValue;
	}

	public void setNoTaxValue(String noTaxValue) {
		this.noTaxValue = noTaxValue;
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