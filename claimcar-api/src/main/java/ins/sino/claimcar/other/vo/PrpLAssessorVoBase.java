package ins.sino.claimcar.other.vo;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
import java.util.Date;


/**
 * Vo Base Class of PO PrpLAssessor
 */ 
public class PrpLAssessorVoBase implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String registNo;
	private String intermcode;
	private String intermname;
	private String taskType;
	private Long lossId;
	private Date lossDate;
	private String licenseNo;
	private String serialNo;
	private String underWriteFlag;
	private Date underWriteDate;
	private String kindCode;
	private String createUser;
	private Date createTime;
	private String updateUser;
	private Date updateTime;
    
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRegistNo() {
		return this.registNo;
	}

	public void setRegistNo(String registNo) {
		this.registNo = registNo;
	}

	public String getIntermcode() {
		return this.intermcode;
	}

	public void setIntermcode(String intermcode) {
		this.intermcode = intermcode;
	}

	public String getIntermname() {
		return this.intermname;
	}

	public void setIntermname(String intermname) {
		this.intermname = intermname;
	}

	public String getTaskType() {
		return this.taskType;
	}
	
	public Long getLossId() {
		return lossId;
	}

	public void setLossId(Long lossId) {
		this.lossId = lossId;
	}

	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}

	public Date getLossDate() {
		return this.lossDate;
	}

	public void setLossDate(Date lossDate) {
		this.lossDate = lossDate;
	}

	public String getLicenseNo() {
		return this.licenseNo;
	}

	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}

	
	public String getSerialNo() {
		return serialNo;
	}


	
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}


	public String getUnderWriteFlag() {
		return this.underWriteFlag;
	}

	public void setUnderWriteFlag(String underWriteFlag) {
		this.underWriteFlag = underWriteFlag;
	}

	public Date getUnderWriteDate() {
		return this.underWriteDate;
	}

	public void setUnderWriteDate(Date underWriteDate) {
		this.underWriteDate = underWriteDate;
	}

	public String getKindCode() {
		return kindCode;
	}

	public void setKindCode(String kindCode) {
		this.kindCode = kindCode;
	}

	public String getCreateUser() {
		return this.createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getUpdateUser() {
		return this.updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}
