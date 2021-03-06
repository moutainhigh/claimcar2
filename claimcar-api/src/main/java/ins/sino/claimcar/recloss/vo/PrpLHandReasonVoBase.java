package ins.sino.claimcar.recloss.vo;

import java.math.BigDecimal;
// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
import java.util.Date;


/**
 * Vo Base Class of PO SysMsgcontent
 */ 
public class PrpLHandReasonVoBase implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private BigDecimal taskId;
	private String flowId;
	private String registNo;
	private String comCode;
	private String reasonNode;
	private String reasonDuty;
	private String reasonDesc;
	private String remark;
	private Date createTime;
	private String createUser;
	private Date updateTime;
	private String updateUser;

    protected PrpLHandReasonVoBase() {
	
    }

	public BigDecimal getTaskId() {
		return taskId;
	}

	public void setTaskId(BigDecimal taskId) {
		this.taskId = taskId;
	}

	public String getFlowId() {
		return flowId;
	}

	public void setFlowId(String flowId) {
		this.flowId = flowId;
	}

	public String getRegistNo() {
		return registNo;
	}

	public void setRegistNo(String registNo) {
		this.registNo = registNo;
	}

	public String getComCode() {
		return comCode;
	}

	public void setComCode(String comCode) {
		this.comCode = comCode;
	}

	public String getReasonNode() {
		return reasonNode;
	}

	public void setReasonNode(String reasonNode) {
		this.reasonNode = reasonNode;
	}

	public String getReasonDuty() {
		return reasonDuty;
	}

	public void setReasonDuty(String reasonDuty) {
		this.reasonDuty = reasonDuty;
	}

	public String getReasonDesc() {
		return reasonDesc;
	}

	public void setReasonDesc(String reasonDesc) {
		this.reasonDesc = reasonDesc;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
}
  