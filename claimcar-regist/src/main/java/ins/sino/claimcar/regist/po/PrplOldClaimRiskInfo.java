package ins.sino.claimcar.regist.po;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * POJO Class VIEW_PRPLOLDCLAIMRISKINFO
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Table(name = "VIEW_PRPLOLDCLAIMRISKINFO")
public class PrplOldClaimRiskInfo implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private String registNo;
	private String policyNo;
	private String riskCode;
	private Date reportTime;
	private Date damageTime;
	private String licenseNo;
	private String isDanageKindL;
	private BigDecimal kindLPayment;
	private BigDecimal kindTPayment;
	private BigDecimal kindCPayment;
	private BigDecimal kindRFPayment;
	private BigDecimal kindZPayment;
	private String comCode;
	
	@Id
	@Column(name = "REGISTNO")
	public String getRegistNo() {
		return this.registNo;
	}

	public void setRegistNo(String registNo) {
		this.registNo = registNo;
	}

	@Column(name = "POLICYNO", length = 30)
	public String getPolicyNo() {
		return this.policyNo;
	}

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	@Column(name = "RISKCODE", length = 10)
	public String getRiskCode() {
		return this.riskCode;
	}

	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DAMAGETIME", length = 7)
	public Date getDamageTime() {
		return this.damageTime;
	}

	public void setDamageTime(Date damageTime) {
		this.damageTime = damageTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "REPORTTIME", length = 7)
	public Date getReportTime() {
		return this.reportTime;
	}

	public void setReportTime(Date reportTime) {
		this.reportTime = reportTime;
	}

	@Column(name = "LICENSENO")
	public String getLicenseNo() {
		return licenseNo;
	}

	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}

	@Column(name = "ISDANAGEKINDL")
	public String getIsDanageKindL() {
		return isDanageKindL;
	}

	public void setIsDanageKindL(String isDanageKindL) {
		this.isDanageKindL = isDanageKindL;
	}

	@Column(name = "KINDLPAYMENT",precision=14)
	public BigDecimal getKindLPayment() {
		return kindLPayment;
	}

	public void setKindLPayment(BigDecimal kindLPayment) {
		this.kindLPayment = kindLPayment;
	}

	@Column(name = "KINDTPAYMENT",precision=14)
	public BigDecimal getKindTPayment() {
		return kindTPayment;
	}

	public void setKindTPayment(BigDecimal kindTPayment) {
		this.kindTPayment = kindTPayment;
	}

	@Column(name = "KINDCPAYMENT",precision=14)
	public BigDecimal getKindCPayment() {
		return kindCPayment;
	}

	public void setKindCPayment(BigDecimal kindCPayment) {
		this.kindCPayment = kindCPayment;
	}

	@Column(name = "KINDRFPAYMENT",precision=14)
	public BigDecimal getKindRFPayment() {
		return kindRFPayment;
	}

	public void setKindRFPayment(BigDecimal kindRFPayment) {
		this.kindRFPayment = kindRFPayment;
	}

	@Column(name = "KINDZPAYMENT",precision=14)
	public BigDecimal getKindZPayment() {
		return kindZPayment;
	}

	public void setKindZPayment(BigDecimal kindZPayment) {
		this.kindZPayment = kindZPayment;
	}

	@Column(name = "COMCODE")
	public String getComCode() {
		return comCode;
	}

	public void setComCode(String comCode) {
		this.comCode = comCode;
	}

	
	
	
	
}
