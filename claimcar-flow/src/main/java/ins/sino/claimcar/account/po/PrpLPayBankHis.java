package ins.sino.claimcar.account.po;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * POJO Class PrpLPayBankHis
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@TableGenerator(name = "utiSequence", table = "UTISEQUENCE", pkColumnName = "GenName", valueColumnName = "GenValue", pkColumnValue = "PRPLPAYBANKHIS_PK", allocationSize = 10)
@Table(name = "PRPLPAYBANKHIS")
public class PrpLPayBankHis implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private BigDecimal id;
	private String policyNo;
	private String registNo;
	private String claimNo;
	private String riskCode;
	private String compensateNo;
	private String lossType;
	private String businessType;
	private String chargeCode;
	private String chargeName;
	private String accountsTypeName;
	private String payObjectType;
	private BigDecimal payeeNumber;
	private BigDecimal payeeMobile;
	private String bankName;
	private String bankOutlets;
	private String bankType;
	private String accountName;
	private String accountNo;
	private Long areaCode;
	
	private String bankNo;
	private String priorityFlag;
	private String purpose;
	private String validFlag;
	private String flag;
	private String remark;
	private String createUser;
	private Date createTime;
	private String updateUser;
	private Date updateTime;
	private Long payeeId;
	private String payObjectKind;
	private String certifyNo;
	private String payeeName;
	private Long provinceCode;
	private Long cityCode;
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "utiSequence")   //自动生成主键
	@Column(name = "ID", unique = true, nullable = false, scale=0)
	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	@Column(name = "POLICYNO", nullable = false, length=22)
	public String getPolicyNo() {
		return this.policyNo;
	}

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	@Column(name = "REGISTNO", nullable = false, length=22)
	public String getRegistNo() {
		return this.registNo;
	}

	public void setRegistNo(String registNo) {
		this.registNo = registNo;
	}

	@Column(name = "CLAIMNO", nullable = false, length=22)
	public String getClaimNo() {
		return this.claimNo;
	}

	public void setClaimNo(String claimNo) {
		this.claimNo = claimNo;
	}

	@Column(name = "RISKCODE", length=4)
	public String getRiskCode() {
		return this.riskCode;
	}

	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}

	@Column(name = "COMPENSATENO", length=22)
	public String getCompensateNo() {
		return this.compensateNo;
	}

	public void setCompensateNo(String compensateNo) {
		this.compensateNo = compensateNo;
	}

	@Column(name = "LOSSTYPE", length=2)
	public String getLossType() {
		return this.lossType;
	}

	public void setLossType(String lossType) {
		this.lossType = lossType;
	}

	@Column(name = "BUSINESSTYPE", length=1)
	public String getBusinessType() {
		return this.businessType;
	}

	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	@Column(name = "CHARGECODE", length=7)
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


	@Column(name = "ACCOUNTSTYPENAME", length=50)
	public String getAccountsTypeName() {
		return this.accountsTypeName;
	}

	public void setAccountsTypeName(String accountsTypeName) {
		this.accountsTypeName = accountsTypeName;
	}

	@Column(name = "PAYOBJECTTYPE", length=2)
	public String getPayObjectType() {
		return this.payObjectType;
	}

	public void setPayObjectType(String payObjectType) {
		this.payObjectType = payObjectType;
	}


	@Column(name = "PAYEENUMBER", precision=20, scale=0)
	public BigDecimal getPayeeNumber() {
		return this.payeeNumber;
	}

	public void setPayeeNumber(BigDecimal payeeNumber) {
		this.payeeNumber = payeeNumber;
	}

	@Column(name = "PAYEEMOBILE", precision=20, scale=0)
	public BigDecimal getPayeeMobile() {
		return this.payeeMobile;
	}

	public void setPayeeMobile(BigDecimal payeeMobile) {
		this.payeeMobile = payeeMobile;
	}

	@Column(name = "BANKNAME", length=60)
	public String getBankName() {
		return this.bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	@Column(name = "BANKOUTLETS", length=100)
	public String getBankOutlets() {
		return this.bankOutlets;
	}

	public void setBankOutlets(String bankOutlets) {
		this.bankOutlets = bankOutlets;
	}

	@Column(name = "BANKTYPE", length=5)
	public String getBankType() {
		return this.bankType;
	}

	public void setBankType(String bankType) {
		this.bankType = bankType;
	}

	@Column(name = "ACCOUNTNAME", length=60)
	public String getAccountName() {
		return this.accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	@Column(name = "ACCOUNTNO", length=35)
	public String getAccountNo() {
		return this.accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	

	@Column(name = "BANKNO", length=30)
	public String getBankNo() {
		return this.bankNo;
	}

	public void setBankNo(String bankNo) {
		this.bankNo = bankNo;
	}

	@Column(name = "PRIORITYFLAG", length=2)
	public String getPriorityFlag() {
		return this.priorityFlag;
	}

	public void setPriorityFlag(String priorityFlag) {
		this.priorityFlag = priorityFlag;
	}

	@Column(name = "PURPOSE", length=60)
	public String getPurpose() {
		return this.purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	@Column(name = "VALIDFLAG", length=2)
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

	public Long getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(Long areaCode) {
		this.areaCode = areaCode;
	}

	public Long getPayeeId() {
		return payeeId;
	}

	public void setPayeeId(Long payeeId) {
		this.payeeId = payeeId;
	}

	public String getPayObjectKind() {
		return payObjectKind;
	}

	public void setPayObjectKind(String payObjectKind) {
		this.payObjectKind = payObjectKind;
	}

	public String getCertifyNo() {
		return certifyNo;
	}

	public void setCertifyNo(String certifyNo) {
		this.certifyNo = certifyNo;
	}

	public String getPayeeName() {
		return payeeName;
	}

	public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
	}

	public Long getProvinceCode() {
		return provinceCode;
	}

	public void setProvinceCode(Long provinceCode) {
		this.provinceCode = provinceCode;
	}

	public Long getCityCode() {
		return cityCode;
	}

	public void setCityCode(Long cityCode) {
		this.cityCode = cityCode;
	}
}
