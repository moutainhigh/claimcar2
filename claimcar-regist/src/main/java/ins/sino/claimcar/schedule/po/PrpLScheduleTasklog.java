package ins.sino.claimcar.schedule.po;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
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

/**
 * POJO Class PrpLScheduleTasklog
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@TableGenerator(name = "utiSequence", table = "UTISEQUENCE", pkColumnName = "GenName", valueColumnName = "GenValue", pkColumnValue = "PRPLSCHEDULETASKLOG_PK", allocationSize = 10)
@Table(name = "PRPLSCHEDULETASKLOG")
public class PrpLScheduleTasklog implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private PrpLScheduleTask prpLScheduleTask;
	private String registNo;
	private String position;
	private String customerLevel;
	private String mercyFlag;
	private String linkerMan;
	private String linkerManPhone;
	private String damageAreaCode;
	private String damageAddress;
	private String checkorDeflossAreaCode;
	private String linkerManPhone2;
	private String checkAddress;
	private String provinceCityAreaCode;
	private String scheduledComname;
	private String scheduledComcode;
	private String regionCode;
	private String checkareaName;
	private String scheduledUsercode;
	private String scheduledUsername;
	private String lossContent;
	private String scheduleStatus;
	private String cancelOrReassignCode;
	private String cancelOrReassignContent;
	private Date cancelOrReassinModifyTime;
	private String scheduledRemark;
	private Date scheduledTime;
	private String scheduleType;
	private String operatorCode;
	private String operatorName;
	private String isPersonFlag;
	private String validFlag;
	private String submitSource;
	private String flag;
	private String remark;
	private String createUser;
	private Date createTime;
	private String updateUser;
	private Date updateTime;

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "utiSequence")
	@Column(name = "ID", unique = true, nullable = false, scale=0)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="PRPLSCHEDULETASKID", nullable = false)
	public PrpLScheduleTask getPrpLScheduleTask() {
		return this.prpLScheduleTask;
	}

	public void setPrpLScheduleTask(PrpLScheduleTask prpLScheduleTask) {
		this.prpLScheduleTask = prpLScheduleTask;
	}

	@Column(name = "REGISTNO", length=30)
	public String getRegistNo() {
		return this.registNo;
	}

	public void setRegistNo(String registNo) {
		this.registNo = registNo;
	}

	@Column(name = "POSITION", length=10)
	public String getPosition() {
		return this.position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Column(name = "CUSTOMERLEVEL", length=30)
	public String getCustomerLevel() {
		return this.customerLevel;
	}

	public void setCustomerLevel(String customerLevel) {
		this.customerLevel = customerLevel;
	}

	@Column(name = "MERCYFLAG", length=3)
	public String getMercyFlag() {
		return this.mercyFlag;
	}

	public void setMercyFlag(String mercyFlag) {
		this.mercyFlag = mercyFlag;
	}

	@Column(name = "LINKERMAN")
	public String getLinkerMan() {
		return this.linkerMan;
	}

	public void setLinkerMan(String linkerMan) {
		this.linkerMan = linkerMan;
	}

	@Column(name = "LINKERMANPHONE")
	public String getLinkerManPhone() {
		return this.linkerManPhone;
	}

	public void setLinkerManPhone(String linkerManPhone) {
		this.linkerManPhone = linkerManPhone;
	}

	@Column(name = "DAMAGEAREACODE", length=20)
	public String getDamageAreaCode() {
		return this.damageAreaCode;
	}

	public void setDamageAreaCode(String damageAreaCode) {
		this.damageAreaCode = damageAreaCode;
	}

	@Column(name = "DAMAGEADDRESS", length=1024)
	public String getDamageAddress() {
		return this.damageAddress;
	}

	public void setDamageAddress(String damageAddress) {
		this.damageAddress = damageAddress;
	}

	@Column(name = "CHECKORDEFLOSSAREACODE", length=20)
	public String getCheckorDeflossAreaCode() {
		return this.checkorDeflossAreaCode;
	}

	public void setCheckorDeflossAreaCode(String checkorDeflossAreaCode) {
		this.checkorDeflossAreaCode = checkorDeflossAreaCode;
	}

	@Column(name = "LINKERMANPHONE2")
	public String getLinkerManPhone2() {
		return this.linkerManPhone2;
	}

	public void setLinkerManPhone2(String linkerManPhone2) {
		this.linkerManPhone2 = linkerManPhone2;
	}

	@Column(name = "CHECKADDRESS", length=1024)
	public String getCheckAddress() {
		return this.checkAddress;
	}

	public void setCheckAddress(String checkAddress) {
		this.checkAddress = checkAddress;
	}

	@Column(name = "PROVINCECITYAREACODE", length=20)
	public String getProvinceCityAreaCode() {
		return this.provinceCityAreaCode;
	}

	public void setProvinceCityAreaCode(String provinceCityAreaCode) {
		this.provinceCityAreaCode = provinceCityAreaCode;
	}

	@Column(name = "SCHEDULEDCOMNAME")
	public String getScheduledComname() {
		return this.scheduledComname;
	}

	public void setScheduledComname(String scheduledComname) {
		this.scheduledComname = scheduledComname;
	}

	@Column(name = "SCHEDULEDCOMCODE")
	public String getScheduledComcode() {
		return this.scheduledComcode;
	}

	public void setScheduledComcode(String scheduledComcode) {
		this.scheduledComcode = scheduledComcode;
	}

	@Column(name = "REGIONCODE", length=20)
	public String getRegionCode() {
		return this.regionCode;
	}

	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}

	@Column(name = "CHECKAREANAME", length=40)
	public String getCheckareaName() {
		return this.checkareaName;
	}

	public void setCheckareaName(String checkareaName) {
		this.checkareaName = checkareaName;
	}

	@Column(name = "SCHEDULEDUSERCODE")
	public String getScheduledUsercode() {
		return this.scheduledUsercode;
	}

	public void setScheduledUsercode(String scheduledUsercode) {
		this.scheduledUsercode = scheduledUsercode;
	}

	@Column(name = "SCHEDULEDUSERNAME")
	public String getScheduledUsername() {
		return this.scheduledUsername;
	}

	public void setScheduledUsername(String scheduledUsername) {
		this.scheduledUsername = scheduledUsername;
	}

	@Column(name = "LOSSCONTENT")
	public String getLossContent() {
		return this.lossContent;
	}

	public void setLossContent(String lossContent) {
		this.lossContent = lossContent;
	}

	@Column(name = "SCHEDULESTATUS", length=1)
	public String getScheduleStatus() {
		return this.scheduleStatus;
	}

	public void setScheduleStatus(String scheduleStatus) {
		this.scheduleStatus = scheduleStatus;
	}
	
	@Column(name = "CANCELORREASSIGNCODE", length=2)
	public String getCancelOrReassignCode() {
		return this.cancelOrReassignCode;
	}

	public void setCancelOrReassignCode(String cancelOrReassignCode) {
		this.cancelOrReassignCode = cancelOrReassignCode;
	}

	@Column(name = "CANCELORREASSIGNCONTENT", length=100)
	public String getCancelOrReassignContent() {
		return this.cancelOrReassignContent;
	}

	public void setCancelOrReassignContent(String cancelOrReassignContent) {
		this.cancelOrReassignContent = cancelOrReassignContent;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CANCELORREASSINMODIFYTIME", length=7)
	public Date getCancelOrReassinModifyTime() {
		return this.cancelOrReassinModifyTime;
	}

	public void setCancelOrReassinModifyTime(Date cancelOrReassinModifyTime) {
		this.cancelOrReassinModifyTime = cancelOrReassinModifyTime;
	}

	@Column(name = "SCHEDULEDREMARK")
	public String getScheduledRemark() {
		return this.scheduledRemark;
	}

	public void setScheduledRemark(String scheduledRemark) {
		this.scheduledRemark = scheduledRemark;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "SCHEDULEDTIME", length=7)
	public Date getScheduledTime() {
		return this.scheduledTime;
	}

	public void setScheduledTime(Date scheduledTime) {
		this.scheduledTime = scheduledTime;
	}

	@Column(name = "SCHEDULETYPE", length=1)
	public String getScheduleType() {
		return this.scheduleType;
	}

	public void setScheduleType(String scheduleType) {
		this.scheduleType = scheduleType;
	}

	@Column(name = "OPERATORCODE", length=10)
	public String getOperatorCode() {
		return this.operatorCode;
	}

	public void setOperatorCode(String operatorCode) {
		this.operatorCode = operatorCode;
	}

	@Column(name = "OPERATORNAME", length=30)
	public String getOperatorName() {
		return this.operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	@Column(name = "ISPERSONFLAG", length=10)
	public String getIsPersonFlag() {
		return this.isPersonFlag;
	}

	public void setIsPersonFlag(String isPersonFlag) {
		this.isPersonFlag = isPersonFlag;
	}

	@Column(name = "VALIDFLAG", length=1)
	public String getValidFlag() {
		return this.validFlag;
	}

	public void setValidFlag(String validFlag) {
		this.validFlag = validFlag;
	}

	@Column(name = "SUBMITSOURCE", length=3)
	public String getSubmitSource() {
		return this.submitSource;
	}

	public void setSubmitSource(String submitSource) {
		this.submitSource = submitSource;
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

	@Column(name = "CREATEUSER", nullable = false, length=10)
	public String getCreateUser() {
		return this.createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATETIME", nullable = false, length=7)
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
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
}
