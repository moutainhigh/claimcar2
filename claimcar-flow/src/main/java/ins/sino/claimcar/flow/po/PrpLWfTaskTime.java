package ins.sino.claimcar.flow.po;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.validator.constraints.NotBlank;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * POJO Class PrpLWfTaskTime
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@TableGenerator(name = "utiSequence", table = "UTISEQUENCE", pkColumnName = "GenName", valueColumnName = "GenValue", pkColumnValue = "PRPLWFTASKTIME_PK", allocationSize = 10)
@Table(name = "PRPLWFTASKTIME")
public class PrpLWfTaskTime implements java.io.Serializable {
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

	@Id
	@NotBlank
	@Column(name = "ID", unique = true, nullable = false, length=30)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "FLOWID", nullable = false, length=10)
	public String getFlowId() {
		return this.flowId;
	}

	public void setFlowId(String flowId) {
		this.flowId = flowId;
	}

	@Column(name = "TASKID", nullable = false, length=25)
	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	@Column(name = "TASKNAME", nullable = false, length=30)
	public String getTaskName() {
		return this.taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	@Column(name = "OPERUSER", nullable = false, length=30)
	public String getOperUser() {
		return this.operUser;
	}

	public void setOperUser(String operUser) {
		this.operUser = operUser;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "STARTTIME", length=7)
	public Date getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ENDTIME", length=7)
	public Date getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	@Column(name = "OPERMINUTES", precision=10, scale=0)
	public Long getOperMinutes() {
		return this.operMinutes;
	}

	public void setOperMinutes(Long operMinutes) {
		this.operMinutes = operMinutes;
	}

	@Column(name = "LOGSTATE", length=30)
	public String getLogState() {
		return this.logState;
	}

	public void setLogState(String logState) {
		this.logState = logState;
	}

	@Column(name = "VALIDSTATUS", length=10)
	public String getValidStatus() {
		return this.validStatus;
	}

	public void setValidStatus(String validStatus) {
		this.validStatus = validStatus;
	}
}