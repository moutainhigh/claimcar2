package ins.platform.saa.vo;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * Vo Base Class of PO SaaTask
 */ 
public class SaaTaskVoBase implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private String taskCode;
	private Integer version;
	private String groupName;
	private String taskCName;
	private String taskTName;
	private String taskEName;
	private String url;
	private String creatorCode;
	private Date createTime;
	private String updaterCode;
	private Date updateTime;
	private String validInd;
	private String remark;
	private String flag;
	private Date insertTimeForHis;
	private Date operateTimeForHis;
	private List<SaaRoleTaskVo> saaRoleTasks = new ArrayList<SaaRoleTaskVo>(0);

    protected SaaTaskVoBase() {
	
    }

    
	public String getTaskCode() {
		return this.taskCode;
	}

	public void setTaskCode(String taskCode) {
		this.taskCode = taskCode;
	}

	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getTaskCName() {
		return this.taskCName;
	}

	public void setTaskCName(String taskCName) {
		this.taskCName = taskCName;
	}

	public String getTaskTName() {
		return this.taskTName;
	}

	public void setTaskTName(String taskTName) {
		this.taskTName = taskTName;
	}

	public String getTaskEName() {
		return this.taskEName;
	}

	public void setTaskEName(String taskEName) {
		this.taskEName = taskEName;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getCreatorCode() {
		return this.creatorCode;
	}

	public void setCreatorCode(String creatorCode) {
		this.creatorCode = creatorCode;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getUpdaterCode() {
		return this.updaterCode;
	}

	public void setUpdaterCode(String updaterCode) {
		this.updaterCode = updaterCode;
	}

	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getValidInd() {
		return this.validInd;
	}

	public void setValidInd(String validInd) {
		this.validInd = validInd;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public Date getInsertTimeForHis() {
		return this.insertTimeForHis;
	}

	public void setInsertTimeForHis(Date insertTimeForHis) {
		this.insertTimeForHis = insertTimeForHis;
	}

	public Date getOperateTimeForHis() {
		return this.operateTimeForHis;
	}

	public void setOperateTimeForHis(Date operateTimeForHis) {
		this.operateTimeForHis = operateTimeForHis;
	}

	public List<SaaRoleTaskVo> getSaaRoleTasks() {
		return this.saaRoleTasks;
	}

	public void setSaaRoleTasks(List<SaaRoleTaskVo> saaRoleTasks) {
		this.saaRoleTasks = saaRoleTasks;
	}
}