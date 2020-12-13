package ins.sino.claimcar.lossperson.po;

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

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * POJO Class PrpLDlossPersTraceFeeHis
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@TableGenerator(name = "utiSequence", table = "UTISEQUENCE", pkColumnName = "GenName", valueColumnName = "GenValue", pkColumnValue = "PRPLDLOSSPERSTRACEFEEHIS_PK", allocationSize = 10)
@Table(name = "PRPLDLOSSPERSTRACEFEEHIS")
public class PrpLDlossPersTraceFeeHis implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private PrpLDlossPersTraceHis prpLDlossPersTraceHis;
	private Long persTraceFeeId;
	private String registNo;
	private String itemKindNo;
	private String kindCode;
	private String itemCode;
	private String feeTypeCode;
	private String feeTypeName;
	private BigDecimal unitAmount;
	private Long quantity;
	private String woundRate;
	private BigDecimal reportFee;
	private BigDecimal realFee;
	private BigDecimal detractionfee;
	private BigDecimal defloss;
	private String remark;
	private BigDecimal veriUnitAmount;
	private Long veriQuantity;
	private String veriWoundRate;
	private BigDecimal veriReportFee;
	private BigDecimal veriRealFee;
	private BigDecimal veriDetractionFee;
	private BigDecimal veriDefloss;
	private String veriRemark;
	private String validFlag;
	private String flag;
	private String kindName;
	private String veriLevel;
	private String createUser;
	private Date createTime;
	private String updateUser;
	private Date updateTime;

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "utiSequence")
	@Column(name = "ID", unique = true, nullable = false, precision=14, scale=0)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="PERSTRACEHISID", nullable = false)
	public PrpLDlossPersTraceHis getPrpLDlossPersTraceHis() {
		return this.prpLDlossPersTraceHis;
	}

	public void setPrpLDlossPersTraceHis(PrpLDlossPersTraceHis prpLDlossPersTraceHis) {
		this.prpLDlossPersTraceHis = prpLDlossPersTraceHis;
	}

	@Column(name = "PERSTRACEFEEID", nullable = false, precision=14, scale=0)
	public Long getPersTraceFeeId() {
		return this.persTraceFeeId;
	}

	public void setPersTraceFeeId(Long persTraceFeeId) {
		this.persTraceFeeId = persTraceFeeId;
	}

	@Column(name = "REGISTNO", nullable = false, length=22)
	public String getRegistNo() {
		return this.registNo;
	}

	public void setRegistNo(String registNo) {
		this.registNo = registNo;
	}

	@Column(name = "ITEMKINDNO", length=2)
	public String getItemKindNo() {
		return this.itemKindNo;
	}

	public void setItemKindNo(String itemKindNo) {
		this.itemKindNo = itemKindNo;
	}

	@Column(name = "KINDCODE", length=7)
	public String getKindCode() {
		return this.kindCode;
	}

	public void setKindCode(String kindCode) {
		this.kindCode = kindCode;
	}

	@Column(name = "ITEMCODE", length=10)
	public String getItemCode() {
		return this.itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	@Column(name = "FEETYPECODE", length=10)
	public String getFeeTypeCode() {
		return this.feeTypeCode;
	}

	public void setFeeTypeCode(String feeTypeCode) {
		this.feeTypeCode = feeTypeCode;
	}

	@Column(name = "FEETYPENAME", length=120)
	public String getFeeTypeName() {
		return this.feeTypeName;
	}

	public void setFeeTypeName(String feeTypeName) {
		this.feeTypeName = feeTypeName;
	}

	@Column(name = "UNITAMOUNT", precision=14)
	public BigDecimal getUnitAmount() {
		return this.unitAmount;
	}

	public void setUnitAmount(BigDecimal unitAmount) {
		this.unitAmount = unitAmount;
	}

	@Column(name = "QUANTITY", precision=10, scale=0)
	public Long getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	@Column(name = "WOUNDRATE", length=10)
	public String getWoundRate() {
		return this.woundRate;
	}

	public void setWoundRate(String woundRate) {
		this.woundRate = woundRate;
	}

	@Column(name = "REPORTFEE", precision=14)
	public BigDecimal getReportFee() {
		return this.reportFee;
	}

	public void setReportFee(BigDecimal reportFee) {
		this.reportFee = reportFee;
	}

	@Column(name = "REALFEE", precision=14)
	public BigDecimal getRealFee() {
		return this.realFee;
	}

	public void setRealFee(BigDecimal realFee) {
		this.realFee = realFee;
	}

	@Column(name = "DETRACTIONFEE", precision=14)
	public BigDecimal getDetractionfee() {
		return this.detractionfee;
	}

	public void setDetractionfee(BigDecimal detractionfee) {
		this.detractionfee = detractionfee;
	}

	@Column(name = "DEFLOSS", precision=14)
	public BigDecimal getDefloss() {
		return this.defloss;
	}

	public void setDefloss(BigDecimal defloss) {
		this.defloss = defloss;
	}

	@Column(name = "REMARK")
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Column(name = "VERIUNITAMOUNT", precision=14)
	public BigDecimal getVeriUnitAmount() {
		return this.veriUnitAmount;
	}

	public void setVeriUnitAmount(BigDecimal veriUnitAmount) {
		this.veriUnitAmount = veriUnitAmount;
	}

	@Column(name = "VERIQUANTITY", precision=10, scale=0)
	public Long getVeriQuantity() {
		return this.veriQuantity;
	}

	public void setVeriQuantity(Long veriQuantity) {
		this.veriQuantity = veriQuantity;
	}

	@Column(name = "VERIWOUNDRATE", length=10)
	public String getVeriWoundRate() {
		return this.veriWoundRate;
	}

	public void setVeriWoundRate(String veriWoundRate) {
		this.veriWoundRate = veriWoundRate;
	}

	@Column(name = "VERIREPORTFEE", precision=14)
	public BigDecimal getVeriReportFee() {
		return this.veriReportFee;
	}

	public void setVeriReportFee(BigDecimal veriReportFee) {
		this.veriReportFee = veriReportFee;
	}

	@Column(name = "VERIREALFEE", precision=14)
	public BigDecimal getVeriRealFee() {
		return this.veriRealFee;
	}

	public void setVeriRealFee(BigDecimal veriRealFee) {
		this.veriRealFee = veriRealFee;
	}

	@Column(name = "VERIDETRACTIONFEE", precision=14)
	public BigDecimal getVeriDetractionFee() {
		return this.veriDetractionFee;
	}

	public void setVeriDetractionFee(BigDecimal veriDetractionFee) {
		this.veriDetractionFee = veriDetractionFee;
	}

	@Column(name = "VERIDEFLOSS", precision=14)
	public BigDecimal getVeriDefloss() {
		return this.veriDefloss;
	}

	public void setVeriDefloss(BigDecimal veriDefloss) {
		this.veriDefloss = veriDefloss;
	}

	@Column(name = "VERIREMARK")
	public String getVeriRemark() {
		return this.veriRemark;
	}

	public void setVeriRemark(String veriRemark) {
		this.veriRemark = veriRemark;
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

	@Column(name = "KINDNAME", length=120)
	public String getKindName() {
		return this.kindName;
	}

	public void setKindName(String kindName) {
		this.kindName = kindName;
	}
	
	@Column(name = "VERILEVEL", length=20)
	public String getVeriLevel() {
		return this.veriLevel;
	}

	public void setVeriLevel(String veriLevel) {
		this.veriLevel = veriLevel;
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
}
