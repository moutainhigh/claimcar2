package ins.sino.claimcar.schedule.vo;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
import java.util.Date;


/**
 * Vo Base Class of PO PrpLScheduleItems
 */ 
public class PrpLScheduleItemsVoBase implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String registNo;
	private String serialNo;
	private String itemType;
	private String itemsName;
	private String itemsContent;
	private String licenseNo;
	private Long itemsSourceId;
	private String addoperatorCode;
	private String scheduledComcode;
	private String scheduledUsercode;
	private String flag;
	private String itemRemark;
	private String remark;
	private String createUser;
	private String scheduleStatus;
	private Date createTime;
	private String updateUser;
	private Date updateTime;

    protected PrpLScheduleItemsVoBase() {
	
    }

    
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

	public String getSerialNo() {
		return this.serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public String getItemType() {
		return this.itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public String getItemsName() {
		return this.itemsName;
	}

	public void setItemsName(String itemsName) {
		this.itemsName = itemsName;
	}

	public String getItemsContent() {
		return this.itemsContent;
	}

	public void setItemsContent(String itemsContent) {
		this.itemsContent = itemsContent;
	}
	
	public String getLicenseNo() {
		return licenseNo;
	}

	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}
	
	public Long getItemsSourceId() {
		return itemsSourceId;
	}


	public void setItemsSourceId(Long itemsSourceId) {
		this.itemsSourceId = itemsSourceId;
	}


	public String getAddoperatorCode() {
		return this.addoperatorCode;
	}

	public void setAddoperatorCode(String addoperatorCode) {
		this.addoperatorCode = addoperatorCode;
	}

	public String getScheduledComcode() {
		return this.scheduledComcode;
	}

	public void setScheduledComcode(String scheduledComcode) {
		this.scheduledComcode = scheduledComcode;
	}

	public String getScheduledUsercode() {
		return this.scheduledUsercode;
	}

	public void setScheduledUsercode(String scheduledUsercode) {
		this.scheduledUsercode = scheduledUsercode;
	}

	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getItemRemark() {
		return this.itemRemark;
	}

	public void setItemRemark(String itemRemark) {
		this.itemRemark = itemRemark;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getCreateUser() {
		return this.createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public String getScheduleStatus() {
		return this.scheduleStatus;
	}

	public void setScheduleStatus(String scheduleStatus) {
		this.scheduleStatus = scheduleStatus;
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
