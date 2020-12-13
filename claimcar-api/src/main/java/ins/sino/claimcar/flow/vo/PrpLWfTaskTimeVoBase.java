package ins.sino.claimcar.flow.vo;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
import java.util.Date;


/**
 * Vo Base Class of PO PrpLWfTaskTime
 */ 
public class PrpLWfTaskTimeVoBase implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private String id;
	private String flowId;
	private String taskId;
	private String taskName;
	private String operUser;
	private Date startTime;
	private Date endTime;
	private Long operMinutes;
	private String logState;
	private String validStatus;

    protected PrpLWfTaskTimeVoBase() {
	
    }

    
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFlowId() {
		return this.flowId;
	}

	public void setFlowId(String flowId) {
		this.flowId = flowId;
	}

	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getTaskName() {
		return this.taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getOperUser() {
		return this.operUser;
	}

	public void setOperUser(String operUser) {
		this.operUser = operUser;
	}

	public Date getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Long getOperMinutes() {
		return this.operMinutes;
	}

	public void setOperMinutes(Long operMinutes) {
		this.operMinutes = operMinutes;
	}

	public String getLogState() {
		return this.logState;
	}

	public void setLogState(String logState) {
		this.logState = logState;
	}

	public String getValidStatus() {
		return this.validStatus;
	}

	public void setValidStatus(String validStatus) {
		this.validStatus = validStatus;
	}
}
