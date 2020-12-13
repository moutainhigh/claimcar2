package ins.sino.claimcar.lossperson.po;

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
import javax.persistence.OneToOne;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * POJO Class PrpLDlossPersTrace
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@TableGenerator(name = "utiSequence", table = "UTISEQUENCE", pkColumnName = "GenName", valueColumnName = "GenValue", pkColumnValue = "PRPLDLOSSPERSTRACE_PK", allocationSize = 10)
@Table(name = "PRPLDLOSSPERSTRACE")
public class PrpLDlossPersTrace implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private Long persTraceMainId;
	private String registNo;
	private Long injuredId;
	private Long checkPersonId;
	private String personName;
	private String lossFeeType;
	private String traceForms;
	private String endFlag;
	private BigDecimal sumReportFee;
	private BigDecimal sumRealFee;
	private BigDecimal sumDetractionFee;
	private BigDecimal sumdefLoss;
	private BigDecimal sumVeriReportFee;
	private BigDecimal sumVeriRealFee;
	private BigDecimal sumVeriDetractionFee;
	private BigDecimal sumVeriDefloss;
	private String operatorCode;
	private String makeCom;
	private String comCode;
	private String lossState;
	private String validFlag;
	private String flag;
	private String remark;
	private String operatorDesc;
	private String createUser;
	private Date createTime;
	private String updateUser;
	private Date updateTime;
	private Date operatorTime;
	private String undwrtCode;
	private Date undwrtTime;
	private String undwrtDesc;
	private PrpLDlossPersInjured prpLDlossPersInjured;
	private List<PrpLDlossPersTraceFee> prpLDlossPersTraceFees = new ArrayList<PrpLDlossPersTraceFee>(0);
	private BigDecimal invoiceFee;
	private String payTimes;
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "utiSequence")
	@Column(name = "ID", unique = true, nullable = false, precision=14, scale=0)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "PERSTRACEMAINID", nullable = false, precision=14, scale=0)
	public Long getPersTraceMainId() {
		return this.persTraceMainId;
	}

	public void setPersTraceMainId(Long persTraceMainId) {
		this.persTraceMainId = persTraceMainId;
	}

	@Column(name = "REGISTNO", nullable = false, length=30)
	public String getRegistNo() {
		return this.registNo;
	}

	public void setRegistNo(String registNo) {
		this.registNo = registNo;
	}

	@Column(name = "INJUREDID", precision=14, scale=0)
	public Long getInjuredId() {
		return this.injuredId;
	}

	public void setInjuredId(Long injuredId) {
		this.injuredId = injuredId;
	}

	@Column(name = "CHECKPERSONID", precision=14, scale=0)
	public Long getCheckPersonId() {
		return this.checkPersonId;
	}

	public void setCheckPersonId(Long checkPersonId) {
		this.checkPersonId = checkPersonId;
	}

	@Column(name = "PERSONNAME", length=320)
	public String getPersonName() {
		return this.personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	@Column(name = "LOSSFEETYPE", length=3)
	public String getLossFeeType() {
		return this.lossFeeType;
	}

	public void setLossFeeType(String lossFeeType) {
		this.lossFeeType = lossFeeType;
	}

	@Column(name = "TRACEFORMS", length=2)
	public String getTraceForms() {
		return this.traceForms;
	}

	public void setTraceForms(String traceForms) {
		this.traceForms = traceForms;
	}

	@Column(name = "ENDFLAG", length=1)
	public String getEndFlag() {
		return this.endFlag;
	}

	public void setEndFlag(String endFlag) {
		this.endFlag = endFlag;
	}

	@Column(name = "SUMREPORTFEE", precision=14)
	public BigDecimal getSumReportFee() {
		return this.sumReportFee;
	}

	public void setSumReportFee(BigDecimal sumReportFee) {
		this.sumReportFee = sumReportFee;
	}

	@Column(name = "SUMREALFEE", precision=14)
	public BigDecimal getSumRealFee() {
		return this.sumRealFee;
	}

	public void setSumRealFee(BigDecimal sumRealFee) {
		this.sumRealFee = sumRealFee;
	}

	@Column(name = "SUMDETRACTIONFEE", precision=14)
	public BigDecimal getSumDetractionFee() {
		return this.sumDetractionFee;
	}

	public void setSumDetractionFee(BigDecimal sumDetractionFee) {
		this.sumDetractionFee = sumDetractionFee;
	}

	@Column(name = "SUMDEFLOSS", precision=14)
	public BigDecimal getSumdefLoss() {
		return this.sumdefLoss;
	}

	public void setSumdefLoss(BigDecimal sumdefLoss) {
		this.sumdefLoss = sumdefLoss;
	}

	@Column(name = "SUMVERIREPORTFEE", precision=14)
	public BigDecimal getSumVeriReportFee() {
		return this.sumVeriReportFee;
	}

	public void setSumVeriReportFee(BigDecimal sumVeriReportFee) {
		this.sumVeriReportFee = sumVeriReportFee;
	}

	@Column(name = "SUMVERIREALFEE", precision=14)
	public BigDecimal getSumVeriRealFee() {
		return this.sumVeriRealFee;
	}

	public void setSumVeriRealFee(BigDecimal sumVeriRealFee) {
		this.sumVeriRealFee = sumVeriRealFee;
	}

	@Column(name = "SUMVERIDETRACTIONFEE", precision=14)
	public BigDecimal getSumVeriDetractionFee() {
		return this.sumVeriDetractionFee;
	}

	public void setSumVeriDetractionFee(BigDecimal sumVeriDetractionFee) {
		this.sumVeriDetractionFee = sumVeriDetractionFee;
	}

	@Column(name = "SUMVERIDEFLOSS", precision=14)
	public BigDecimal getSumVeriDefloss() {
		return this.sumVeriDefloss;
	}

	public void setSumVeriDefloss(BigDecimal sumVeriDefloss) {
		this.sumVeriDefloss = sumVeriDefloss;
	}

	@Column(name = "OPERATORCODE", length=10)
	public String getOperatorCode() {
		return this.operatorCode;
	}

	public void setOperatorCode(String operatorCode) {
		this.operatorCode = operatorCode;
	}

	@Column(name = "MAKECOM", length=10)
	public String getMakeCom() {
		return this.makeCom;
	}

	public void setMakeCom(String makeCom) {
		this.makeCom = makeCom;
	}

	@Column(name = "COMCODE", length=10)
	public String getComCode() {
		return this.comCode;
	}

	public void setComCode(String comCode) {
		this.comCode = comCode;
	}

	@Column(name = "LOSSSTATE", length=2)
	public String getLossState() {
		return this.lossState;
	}

	public void setLossState(String lossState) {
		this.lossState = lossState;
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

	@Column(name = "REMARK", length=1000)
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Column(name = "OPERATORDESC", length=1000)
	public String getOperatorDesc() {
		return this.operatorDesc;
	}

	public void setOperatorDesc(String operatorDesc) {
		this.operatorDesc = operatorDesc;
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

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "OPERATORTIME", length=7)
	public Date getOperatorTime() {
		return operatorTime;
	}

	
	public void setOperatorTime(Date operatorTime) {
		this.operatorTime = operatorTime;
	}

	@Column(name = "UNDWRTCODE", length=10)
	public String getUndwrtCode() {
		return undwrtCode;
	}

	
	public void setUndwrtCode(String undwrtCode) {
		this.undwrtCode = undwrtCode;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UNDWRTTIME", length=7)
	public Date getUndwrtTime() {
		return undwrtTime;
	}

	
	public void setUndwrtTime(Date undwrtTime) {
		this.undwrtTime = undwrtTime;
	}

	@Column(name = "UNDWRTDESC", length=1000)
	public String getUndwrtDesc() {
		return undwrtDesc;
	}
	
	public void setUndwrtDesc(String undwrtDesc) {
		this.undwrtDesc = undwrtDesc;
	}

	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY, mappedBy="prpLDlossPersTrace")
	public PrpLDlossPersInjured getPrpLDlossPersInjured() {
		return this.prpLDlossPersInjured;
	}

	public void setPrpLDlossPersInjured(PrpLDlossPersInjured prpLDlossPersInjured) {
		this.prpLDlossPersInjured = prpLDlossPersInjured;
	}

    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="prpLDlossPersTrace")
    @OrderBy(value="id")
	public List<PrpLDlossPersTraceFee> getPrpLDlossPersTraceFees() {
		return this.prpLDlossPersTraceFees;
	}

	public void setPrpLDlossPersTraceFees(List<PrpLDlossPersTraceFee> prpLDlossPersTraceFees) {
		this.prpLDlossPersTraceFees = prpLDlossPersTraceFees;
	}
	@Column(name = "INVOICEFEE", precision=14)
	public BigDecimal getInvoiceFee() {
		return invoiceFee;
	}

	public void setInvoiceFee(BigDecimal invoiceFee) {
		this.invoiceFee = invoiceFee;
	}
	@Column(name = "PAYTIMES", length = 30)
	public String getPayTimes() {
		return payTimes;
	}

	public void setPayTimes(String payTimes) {
		this.payTimes = payTimes;
	}
	
	
}
