package ins.sino.claimcar.updateVIN.po;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Table(name = "PRPLREGISTEXT")
public class PrpLRegistExt implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private String registNo;
	private PrpLRegist prpLRegist;
	private String policyNoLink;
	private String isCarLoss;
	private String isPersonLoss;
	private String isPropLoss;
	private String isOnSitReport;
	private String isAlarm;
	private String isCantravel;
	private String manageType;
	private String obliGation;
	private String isRescue;
	private String checkType;
	private String isCheckSelf;
	private String isClaimSelf;
	private String isSubRogation;
	private String checkAddressCode;
	private String checkAddress;
	private String checkAddressMapCode;
	private String dangerRemark;
	private String registRemark;
	private String smsInfo;
	private String cancelReason;
	private String cancelUser;
	private String licenseNo;
	private String frameNo;
	private String insuredCode;
	private String insuredName;
	private String flag;
	private String remark;
	private String updateUser;
	private Date updateTime;
	private String accidentTypes;
	private String orderNo;
//	@GenericGenerator(name="generator", strategy="foreign", parameters=@Parameter(name="property", value="prpLRegist"))
	@Id 
//	@GeneratedValue(generator="generator")
	@Column(name = "REGISTNO", unique = true, nullable = false, length=30)
	public String getRegistNo() {
		return this.registNo;
	}

	public void setRegistNo(String registNo) {
		this.registNo = registNo;
	}

	@OneToOne(fetch=FetchType.LAZY)@PrimaryKeyJoinColumn
	public PrpLRegist getPrpLRegist() {
		return this.prpLRegist;
	}

	public void setPrpLRegist(PrpLRegist prpLRegist) {
		this.prpLRegist = prpLRegist;
	}

	@Column(name = "POLICYNOLINK", length=30)
	public String getPolicyNoLink() {
		return this.policyNoLink;
	}

	public void setPolicyNoLink(String policyNoLink) {
		this.policyNoLink = policyNoLink;
	}

	@Column(name = "ISCARLOSS", length=1)
	public String getIsCarLoss() {
		return this.isCarLoss;
	}

	public void setIsCarLoss(String isCarLoss) {
		this.isCarLoss = isCarLoss;
	}

	@Column(name = "ISPERSONLOSS", length=1)
	public String getIsPersonLoss() {
		return this.isPersonLoss;
	}

	public void setIsPersonLoss(String isPersonLoss) {
		this.isPersonLoss = isPersonLoss;
	}

	@Column(name = "ISPROPLOSS", length=1)
	public String getIsPropLoss() {
		return this.isPropLoss;
	}

	public void setIsPropLoss(String isPropLoss) {
		this.isPropLoss = isPropLoss;
	}

	@Column(name = "ISONSITREPORT", length=1)
	public String getIsOnSitReport() {
		return this.isOnSitReport;
	}

	public void setIsOnSitReport(String isOnSitReport) {
		this.isOnSitReport = isOnSitReport;
	}

	@Column(name = "ISALARM", length=1)
	public String getIsAlarm() {
		return this.isAlarm;
	}

	public void setIsAlarm(String isAlarm) {
		this.isAlarm = isAlarm;
	}

	@Column(name = "ISCANTRAVEL", length=1)
	public String getIsCantravel() {
		return this.isCantravel;
	}

	public void setIsCantravel(String isCantravel) {
		this.isCantravel = isCantravel;
	}

	@Column(name = "MANAGETYPE", length=2)
	public String getManageType() {
		return this.manageType;
	}

	public void setManageType(String manageType) {
		this.manageType = manageType;
	}

	@Column(name = "OBLIGATION", length=2)
	public String getObliGation() {
		return this.obliGation;
	}

	public void setObliGation(String obliGation) {
		this.obliGation = obliGation;
	}

	@Column(name = "ISRESCUE", length=1)
	public String getIsRescue() {
		return this.isRescue;
	}

	public void setIsRescue(String isRescue) {
		this.isRescue = isRescue;
	}

	@Column(name = "CHECKTYPE", length=1)
	public String getCheckType() {
		return this.checkType;
	}

	public void setCheckType(String checkType) {
		this.checkType = checkType;
	}

	@Column(name = "ISCHECKSELF", length=1)
	public String getIsCheckSelf() {
		return this.isCheckSelf;
	}

	public void setIsCheckSelf(String isCheckSelf) {
		this.isCheckSelf = isCheckSelf;
	}

	@Column(name = "ISCLAIMSELF", length=1)
	public String getIsClaimSelf() {
		return this.isClaimSelf;
	}

	public void setIsClaimSelf(String isClaimSelf) {
		this.isClaimSelf = isClaimSelf;
	}

	@Column(name = "ISSUBROGATION", length=1)
	public String getIsSubRogation() {
		return this.isSubRogation;
	}

	public void setIsSubRogation(String isSubRogation) {
		this.isSubRogation = isSubRogation;
	}

	@Column(name = "CHECKADDRESSCODE", length=20)
	public String getCheckAddressCode() {
		return this.checkAddressCode;
	}

	public void setCheckAddressCode(String checkAddressCode) {
		this.checkAddressCode = checkAddressCode;
	}

	@Column(name = "CHECKADDRESS", length=1000)
	public String getCheckAddress() {
		return this.checkAddress;
	}

	public void setCheckAddress(String checkAddress) {
		this.checkAddress = checkAddress;
	}

	@Column(name = "CHECKADDRESSMAPCODE", length=100)
	public String getCheckAddressMapCode() {
		return this.checkAddressMapCode;
	}

	public void setCheckAddressMapCode(String checkAddressMapCode) {
		this.checkAddressMapCode = checkAddressMapCode;
	}

	@Column(name = "DANGERREMARK", length=3000)
	public String getDangerRemark() {
		return this.dangerRemark;
	}

	public void setDangerRemark(String dangerRemark) {
		this.dangerRemark = dangerRemark;
	}

	@Column(name = "REGISTREMARK", length=3000)
	public String getRegistRemark() {
		return this.registRemark;
	}

	public void setRegistRemark(String registRemark) {
		this.registRemark = registRemark;
	}

	@Column(name = "SMSINFO", length=1000)
	public String getSmsInfo() {
		return this.smsInfo;
	}

	public void setSmsInfo(String smsInfo) {
		this.smsInfo = smsInfo;
	}

	@Column(name = "CANCELREASON", length=200)
	public String getCancelReason() {
		return this.cancelReason;
	}

	public void setCancelReason(String cancelReason) {
		this.cancelReason = cancelReason;
	}

	@Column(name = "CANCELUSER", length=200)
	public String getCancelUser() {
		return this.cancelUser;
	}

	public void setCancelUser(String cancelUser) {
		this.cancelUser = cancelUser;
	}

	@Column(name = "LICENSENO", length=20)
	public String getLicenseNo() {
		return this.licenseNo;
	}

	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}

	@Column(name = "FRAMENO", length=20)
	public String getFrameNo() {
		return this.frameNo;
	}

	public void setFrameNo(String frameNo) {
		this.frameNo = frameNo;
	}

	@Column(name = "INSUREDCODE", length=20)
	public String getInsuredCode() {
		return this.insuredCode;
	}

	public void setInsuredCode(String insuredCode) {
		this.insuredCode = insuredCode;
	}
	
	@Column(name = "INSUREDNAME", length=20)
	public String getInsuredName() {
		return this.insuredName;
	}

	public void setInsuredName(String insuredName) {
		this.insuredName = insuredName;
	}

	@Column(name = "FLAG", length=10)
	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	@Column(name = "REMARK", length=200)
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Column(name = "UPDATEUSER", nullable = false, length=10)
	public String getUpdateUser() {
		return this.updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATETIME", nullable = false, length=7)
	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	
	@Column(name = "ACCIDENTTYPES", length=10)
	public String getAccidentTypes() {
		return accidentTypes;
	}

	public void setAccidentTypes(String accidentTypes) {
		this.accidentTypes = accidentTypes;
	}
	@Column(name = "ORDERNO", length=50)
	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
}
