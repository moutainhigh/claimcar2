package ins.sino.claimcar.regist.platform.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * 商业报案平台返回信息LockedData类
 * @author dengkk
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class BiRegistLockedDataResVo {
	@XmlElement(name="RecoveryCode", required = true)
	private String ecoveryCode; // 结算码
	@XmlElement(name="RecoveryCodeStatus", required = true)
	private String recoveryCodeStatus; // 结算码状态；参见代码
	@XmlElement(name="RecoverStatus", required = true)
	private String recoverStatus; // 本方追偿状态；参见代码
	@XmlElement(name="InsurerCode", required = true)
	private String insurerCode; // 对方保险公司代码；参见代码
	@XmlElement(name="InsurerArea", required = true)
	private String insurerArea; // 对方承保地区代码；参见代码
	@XmlElement(name="CoverageType", required = true)
	private String coverageType; // 对方保单险种类型；参见代码
	@XmlElement(name="PolicyNo", required = true)
	private String policyNo; // 对方保单号
	@XmlElement(name="ClaimNotificationNo", required = true)
	private String reportNo; // 对方报案号
	@XmlElement(name="ClaimStatus", required = true)
	private String claimStatus; // 对方案件状态代码；参见代码
	@XmlElement(name="ClaimProgress", required = true)
	private String claimProgress; // 对方案件进展 ；参见代码
	public String getEcoveryCode() {
		return ecoveryCode;
	}
	public void setEcoveryCode(String ecoveryCode) {
		this.ecoveryCode = ecoveryCode;
	}
	public String getRecoveryCodeStatus() {
		return recoveryCodeStatus;
	}
	public void setRecoveryCodeStatus(String recoveryCodeStatus) {
		this.recoveryCodeStatus = recoveryCodeStatus;
	}
	public String getRecoverStatus() {
		return recoverStatus;
	}
	public void setRecoverStatus(String recoverStatus) {
		this.recoverStatus = recoverStatus;
	}
	public String getInsurerCode() {
		return insurerCode;
	}
	public void setInsurerCode(String insurerCode) {
		this.insurerCode = insurerCode;
	}
	public String getInsurerArea() {
		return insurerArea;
	}
	public void setInsurerArea(String insurerArea) {
		this.insurerArea = insurerArea;
	}
	public String getCoverageType() {
		return coverageType;
	}
	public void setCoverageType(String coverageType) {
		this.coverageType = coverageType;
	}
	public String getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	public String getReportNo() {
		return reportNo;
	}
	public void setReportNo(String reportNo) {
		this.reportNo = reportNo;
	}
	public String getClaimStatus() {
		return claimStatus;
	}
	public void setClaimStatus(String claimStatus) {
		this.claimStatus = claimStatus;
	}
	public String getClaimProgress() {
		return claimProgress;
	}
	public void setClaimProgress(String claimProgress) {
		this.claimProgress = claimProgress;
	}

	
}
