package ins.sino.claimcar.updateVIN.po;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Table(name = "PRPLREGIST")
public class PrpLRegist implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private String registNo;
	private String flowId;
	private String policyNo;
	private String riskCode;
	private String tempRegistNo;
	private String tempRegistFlag;
	private Date damageTime;
	private Date reportTime;
	private String registTaskFlag;
	private String reportType;
	private String reportorName;
	private String reportorPhone;
	private String reportorIdfNo;
	private String driverName;
	private String driverSex;
	private String drivingNo;
	private String driverPhone;
	private String driverIdfNo;
	private String linkerName;
	private String linkerMobile;
	private String linkerPhone;
	private String reportorRelation;
	private String insuredPhone;
	private String firstRegUserCode;
	private String firstRegUserName;
	private String firstRegComCode;
	private String callId;
	private String damageCode;
	private String damageAreaCode;
	private String damageAddress;
	private String damageMapCode;
	private String mercyFlag;
	private String customerLevel;
	private String cancelFlag;
	private Date cancelTime;
	private String isMajorCase;
	private String isoffSite;
	private String tpFlag;
	private String tpDisposeFlag;
	private String tpOffSiteCom;
	private String submitSource;
	private String qdcaseType;
	private String caseFlag;
	private String comCode;
	private String flag;
	private String remark;
	private String createUser;
	private Date createTime;
	private String updateUser;
	private Date updateTime;
	private String shDamageAreaCode;
	private String shDamageAddress;
	private String selfDefinareaCode;
	private String damageOtherCode;
	private String isPeopleflag;//调度是否带出人伤标志
	private String accidentReason; //事故原因  送上海平台
	private String isQuickCase; //是否为快赔案件
	private String updateVINFlag;
	private String updateVINUser;
	private Date updateVINTime;
	private PrpLRegistExt prpLRegistExt;
	private String isGBFlag;
	private String selfClaimFlag;//是否自助理赔案件
	private String weekDayriskFlag;//是否假日翻倍险案件
	
	@Id
	@Column(name = "REGISTNO", unique = true, nullable = false, length = 30)
	public String getRegistNo() {
		return this.registNo;
	}

	public void setRegistNo(String registNo) {
		this.registNo = registNo;
	}

	@Column(name = "FLOWID", nullable = false, length = 30)
	public String getFlowId() {
		return this.flowId;
	}

	public void setFlowId(String flowId) {
		this.flowId = flowId;
	}

	@Column(name = "POLICYNO", nullable = false, length = 30)
	public String getPolicyNo() {
		return this.policyNo;
	}

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	@Column(name = "RISKCODE", nullable = false, length = 10)
	public String getRiskCode() {
		return this.riskCode;
	}

	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}

	@Column(name = "TEMPREGISTNO", length = 30)
	public String getTempRegistNo() {
		return this.tempRegistNo;
	}

	public void setTempRegistNo(String tempRegistNo) {
		this.tempRegistNo = tempRegistNo;
	}

	@Column(name = "TEMPREGISTFLAG", length = 1)
	public String getTempRegistFlag() {
		return this.tempRegistFlag;
	}

	public void setTempRegistFlag(String tempRegistFlag) {
		this.tempRegistFlag = tempRegistFlag;
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

	@Column(name = "REGISTTASKFLAG", length = 1)
	public String getRegistTaskFlag() {
		return this.registTaskFlag;
	}

	public void setRegistTaskFlag(String registTaskFlag) {
		this.registTaskFlag = registTaskFlag;
	}

	@Column(name = "REPORTTYPE", length = 1)
	public String getReportType() {
		return reportType;
	}

	public void setReportType(String reportType) {
		this.reportType = reportType;
	}

	@Column(name = "REPORTORNAME", length = 300)
	public String getReportorName() {
		return this.reportorName;
	}

	public void setReportorName(String reportorName) {
		this.reportorName = reportorName;
	}

	@Column(name = "REPORTORPHONE", length = 50)
	public String getReportorPhone() {
		return this.reportorPhone;
	}

	public void setReportorPhone(String reportorPhone) {
		this.reportorPhone = reportorPhone;
	}

	@Column(name = "REPORTORIDFNO", length = 20)
	public String getReportorIdfNo() {
		return this.reportorIdfNo;
	}

	public void setReportorIdfNo(String reportorIdfNo) {
		this.reportorIdfNo = reportorIdfNo;
	}

	@Column(name = "DRIVERNAME", length = 30)
	public String getDriverName() {
		return this.driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	@Column(name = "DRIVERSEX", length = 3)
	public String getDriverSex() {
		return this.driverSex;
	}

	public void setDriverSex(String driverSex) {
		this.driverSex = driverSex;
	}

	@Column(name = "DRIVINGNO", length = 30)
	public String getDrivingNo() {
		return this.drivingNo;
	}

	public void setDrivingNo(String drivingNo) {
		this.drivingNo = drivingNo;
	}

	@Column(name = "DRIVERPHONE")
	public String getDriverPhone() {
		return this.driverPhone;
	}

	public void setDriverPhone(String driverPhone) {
		this.driverPhone = driverPhone;
	}

	@Column(name = "DRIVERIDFNO", length = 20)
	public String getDriverIdfNo() {
		return this.driverIdfNo;
	}

	public void setDriverIdfNo(String driverIdfNo) {
		this.driverIdfNo = driverIdfNo;
	}

	@Column(name = "LINKERNAME")
	public String getLinkerName() {
		return this.linkerName;
	}

	public void setLinkerName(String linkerName) {
		this.linkerName = linkerName;
	}

	@Column(name = "LINKERMOBILE")
	public String getLinkerMobile() {
		return this.linkerMobile;
	}

	public void setLinkerMobile(String linkerMobile) {
		this.linkerMobile = linkerMobile;
	}

	@Column(name = "LINKERPHONE")
	public String getLinkerPhone() {
		return this.linkerPhone;
	}

	public void setLinkerPhone(String linkerPhone) {
		this.linkerPhone = linkerPhone;
	}

	@Column(name = "REPORTORRELATION", length = 3)
	public String getReportorRelation() {
		return this.reportorRelation;
	}

	public void setReportorRelation(String reportorRelation) {
		this.reportorRelation = reportorRelation;
	}

	@Column(name = "INSUREDPHONE")
	public String getInsuredPhone() {
		return this.insuredPhone;
	}

	public void setInsuredPhone(String insuredPhone) {
		this.insuredPhone = insuredPhone;
	}

	@Column(name = "FIRSTREGUSERCODE", nullable = false, length = 10)
	public String getFirstRegUserCode() {
		return this.firstRegUserCode;
	}

	public void setFirstRegUserCode(String firstRegUserCode) {
		this.firstRegUserCode = firstRegUserCode;
	}

	@Column(name = "FIRSTREGUSERNAME", nullable = false, length = 50)
	public String getFirstRegUserName() {
		return firstRegUserName;
	}

	public void setFirstRegUserName(String firstRegUserName) {
		this.firstRegUserName = firstRegUserName;
	}

	@Column(name = "FIRSTREGCOMCODE", nullable = false, length = 8)
	public String getFirstRegComCode() {
		return this.firstRegComCode;
	}

	public void setFirstRegComCode(String firstRegComCode) {
		this.firstRegComCode = firstRegComCode;
	}

	@Column(name = "CALLID", length = 22)
	public String getCallId() {
		return this.callId;
	}

	public void setCallId(String callId) {
		this.callId = callId;
	}

	@Column(name = "DAMAGECODE", length = 20)
	public String getDamageCode() {
		return this.damageCode;
	}

	public void setDamageCode(String damageCode) {
		this.damageCode = damageCode;
	}

	@Column(name = "DAMAGEAREACODE", length = 20)
	public String getDamageAreaCode() {
		return this.damageAreaCode;
	}

	public void setDamageAreaCode(String damageAreaCode) {
		this.damageAreaCode = damageAreaCode;
	}

	@Column(name = "DAMAGEADDRESS", length = 2000)
	public String getDamageAddress() {
		return this.damageAddress;
	}

	public void setDamageAddress(String damageAddress) {
		this.damageAddress = damageAddress;
	}

	@Column(name = "DAMAGEMAPCODE", length = 2000)
	public String getDamageMapCode() {
		return this.damageMapCode;
	}

	public void setDamageMapCode(String damageMapCode) {
		this.damageMapCode = damageMapCode;
	}

	@Column(name = "MERCYFLAG", length = 2)
	public String getMercyFlag() {
		return this.mercyFlag;
	}

	public void setMercyFlag(String mercyFlag) {
		this.mercyFlag = mercyFlag;
	}

	@Column(name = "CUSTOMERLEVEL", length = 2)
	public String getCustomerLevel() {
		return this.customerLevel;
	}

	public void setCustomerLevel(String customerLevel) {
		this.customerLevel = customerLevel;
	}

	@Column(name = "CANCELFLAG", length = 1)
	public String getCancelFlag() {
		return this.cancelFlag;
	}

	public void setCancelFlag(String cancelFlag) {
		this.cancelFlag = cancelFlag;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CANCELTIME", length = 7)
	public Date getCancelTime() {
		return this.cancelTime;
	}

	public void setCancelTime(Date cancelTime) {
		this.cancelTime = cancelTime;
	}

	@Column(name = "ISMAJORCASE", length = 1)
	public String getIsMajorCase() {
		return this.isMajorCase;
	}

	public void setIsMajorCase(String isMajorCase) {
		this.isMajorCase = isMajorCase;
	}

	@Column(name = "ISOFFSITE", length = 1)
	public String getIsoffSite() {
		return this.isoffSite;
	}

	public void setIsoffSite(String isoffSite) {
		this.isoffSite = isoffSite;
	}

	@Column(name = "TPFLAG", length = 2)
	public String getTpFlag() {
		return this.tpFlag;
	}

	public void setTpFlag(String tpFlag) {
		this.tpFlag = tpFlag;
	}

	@Column(name = "TPDISPOSEFLAG", length = 1)
	public String getTpDisposeFlag() {
		return this.tpDisposeFlag;
	}

	public void setTpDisposeFlag(String tpDisposeFlag) {
		this.tpDisposeFlag = tpDisposeFlag;
	}

	@Column(name = "TPOFFSITECOM", length = 10)
	public String getTpOffSiteCom() {
		return this.tpOffSiteCom;
	}

	public void setTpOffSiteCom(String tpOffSiteCom) {
		this.tpOffSiteCom = tpOffSiteCom;
	}

	@Column(name = "SUBMITSOURCE", length = 3)
	public String getSubmitSource() {
		return this.submitSource;
	}

	public void setSubmitSource(String submitSource) {
		this.submitSource = submitSource;
	}

	@Column(name = "QDCASETYPE", length = 3)
	public String getQdcaseType() {
		return this.qdcaseType;
	}

	public void setQdcaseType(String qdcaseType) {
		this.qdcaseType = qdcaseType;
	}

	@Column(name = "CASEFLAG", length = 2)
	public String getCaseFlag() {
		return this.caseFlag;
	}

	public void setCaseFlag(String caseFlag) {
		this.caseFlag = caseFlag;
	}

	@Column(name = "COMCODE", nullable = false, length = 8)
	public String getComCode() {
		return this.comCode;
	}

	public void setComCode(String comCode) {
		this.comCode = comCode;
	}

	@Column(name = "FLAG", length = 10)
	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	@Column(name = "REMARK", length = 200)
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Column(name = "CREATEUSER", nullable = false, length = 10)
	public String getCreateUser() {
		return this.createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATETIME", nullable = false, length = 7)
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Column(name = "UPDATEUSER", nullable = false, length = 10)
	public String getUpdateUser() {
		return this.updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATETIME", nullable = false, length = 7)
	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@Column(name = "SELFDEFINAREACODE", length = 20)
	public String getSelfDefinareaCode() {
		return selfDefinareaCode;
	}

	public void setSelfDefinareaCode(String selfDefinareaCode) {
		this.selfDefinareaCode = selfDefinareaCode;
	}
	
	@Column(name = "ISQUICKCASE", length = 1)
    public String getIsQuickCase() {
        return isQuickCase;
    }
   
    public void setIsQuickCase(String isQuickCase) {
        this.isQuickCase = isQuickCase;
    }

	public String getShDamageAreaCode() {
		return shDamageAreaCode;
	}

	public void setShDamageAreaCode(String shDamageAreaCode) {
		this.shDamageAreaCode = shDamageAreaCode;
	}

	public String getShDamageAddress() {
		return shDamageAddress;
	}

	public void setShDamageAddress(String shDamageAddress) {
		this.shDamageAddress = shDamageAddress;
	}

	@Column(name = "DAMAGEOTHERCODE", length = 20)
	public String getDamageOtherCode() {
		return damageOtherCode;
	}

	public void setDamageOtherCode(String damageOtherCode) {
		this.damageOtherCode = damageOtherCode;
	}

	@Column(name = "ISPEOPLEFLAG", length = 10)
	public String getIsPeopleflag() {
		return isPeopleflag;
	}

	public void setIsPeopleflag(String isPeopleflag) {
		this.isPeopleflag = isPeopleflag;
	}
	@Column(name = "ACCIDENTREASON", length = 10)
	public String getAccidentReason() {
		return accidentReason;
	}

	public void setAccidentReason(String accidentReason) {
		this.accidentReason = accidentReason;
	}
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "prpLRegist")
	public PrpLRegistExt getPrpLRegistExt() {
		return this.prpLRegistExt;
	}

	public void setPrpLRegistExt(PrpLRegistExt prpLRegistExt) {
		this.prpLRegistExt = prpLRegistExt;
	}

	@Column(name = "UPDATEVINFLAG", length = 2)
	public String getUpdateVINFlag() {
		return updateVINFlag;
	}

	public void setUpdateVINFlag(String updateVINFlag) {
		this.updateVINFlag = updateVINFlag;
	}

	@Column(name = "UPDATEVINUSER", length = 30)
	public String getUpdateVINUser() {
		return updateVINUser;
	}

	public void setUpdateVINUser(String updateVINUser) {
		this.updateVINUser = updateVINUser;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATEVINTIME", length = 7)
	public Date getUpdateVINTime() {
		return updateVINTime;
	}

	public void setUpdateVINTime(Date updateVINTime) {
		this.updateVINTime = updateVINTime;
	}

	@Column(name = "ISGBFLAG", length = 2)
	public String getIsGBFlag() {
		return isGBFlag;
	}

	public void setIsGBFlag(String isGBFlag) {
		this.isGBFlag = isGBFlag;
	}
	
	@Column(name = "SELFCLAIMFLAG", length = 12)
	public String getSelfClaimFlag() {
		return selfClaimFlag;
	}

	public void setSelfClaimFlag(String selfClaimFlag) {
		this.selfClaimFlag = selfClaimFlag;
	}


	@Column(name = "WEEKDAYRISKFLAG", length = 10)
	public String getWeekDayriskFlag() {
		return weekDayriskFlag;
	}

	public void setWeekDayriskFlag(String weekDayriskFlag) {
		this.weekDayriskFlag = weekDayriskFlag;
	}
	
}
