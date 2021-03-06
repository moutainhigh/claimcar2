package ins.sino.claimcar.regist.vo;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
import java.math.BigDecimal;
import java.util.Date;


/**
 * Vo Base Class of PO PrpLOldClaimRiskInfo
 */ 
public class PrpLOldClaimRiskInfoVoBase implements java.io.Serializable {
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
	
	
	protected PrpLOldClaimRiskInfoVoBase() {
	
	}


	public String getRegistNo() {
		return registNo;
	}


	public void setRegistNo(String registNo) {
		this.registNo = registNo;
	}


	public String getPolicyNo() {
		return policyNo;
	}


	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}


	public String getRiskCode() {
		return riskCode;
	}


	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}


	public Date getReportTime() {
		return reportTime;
	}


	public void setReportTime(Date reportTime) {
		this.reportTime = reportTime;
	}


	public Date getDamageTime() {
		return damageTime;
	}


	public void setDamageTime(Date damageTime) {
		this.damageTime = damageTime;
	}


	public String getLicenseNo() {
		return licenseNo;
	}


	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}


	public String getIsDanageKindL() {
		return isDanageKindL;
	}


	public void setIsDanageKindL(String isDanageKindL) {
		this.isDanageKindL = isDanageKindL;
	}


	public BigDecimal getKindLPayment() {
		return kindLPayment;
	}


	public void setKindLPayment(BigDecimal kindLPayment) {
		this.kindLPayment = kindLPayment;
	}


	public BigDecimal getKindTPayment() {
		return kindTPayment;
	}


	public void setKindTPayment(BigDecimal kindTPayment) {
		this.kindTPayment = kindTPayment;
	}


	public BigDecimal getKindCPayment() {
		return kindCPayment;
	}


	public void setKindCPayment(BigDecimal kindCPayment) {
		this.kindCPayment = kindCPayment;
	}


	public BigDecimal getKindRFPayment() {
		return kindRFPayment;
	}


	public void setKindRFPayment(BigDecimal kindRFPayment) {
		this.kindRFPayment = kindRFPayment;
	}


	public BigDecimal getKindZPayment() {
		return kindZPayment;
	}


	public void setKindZPayment(BigDecimal kindZPayment) {
		this.kindZPayment = kindZPayment;
	}


	public String getComCode() {
		return comCode;
	}


	public void setComCode(String comCode) {
		this.comCode = comCode;
	}
	
}
