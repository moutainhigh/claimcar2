package ins.sino.claimcar.flow.po;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * POJO Class PrpDNode
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Table(name = "PRPDNODE")
public class PrpDNode implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private String nodeCode;
	private String nodeName;
	private String upperNode;
	private Integer serialno;
	private String validStatus;
	private Integer acceptOverMinutes;
	private Integer outOverMinutes;
	private String nodeType;
	private String remark;
	private Date createTime;
	private String createUser;
	private Date updateTime;
	private String updateUser;
	private String gradeId;

	@Id
	@Column(name = "NODECODE", unique = true, nullable = false, length=30)
	public String getNodeCode() {
		return this.nodeCode;
	}

	public void setNodeCode(String nodeCode) {
		this.nodeCode = nodeCode;
	}

	@Column(name = "NODENAME", nullable = false, length=25)
	public String getNodeName() {
		return this.nodeName;
	}

	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}

	@Column(name = "UPPERNODE", nullable = false, length=25)
	public String getUpperNode() {
		return this.upperNode;
	}

	public void setUpperNode(String upperNode) {
		this.upperNode = upperNode;
	}

	@Column(name = "SERIALNO", precision=4, scale=0)
	public Integer getSerialno() {
		return this.serialno;
	}

	public void setSerialno(Integer serialno) {
		this.serialno = serialno;
	}

	@Column(name = "VALIDSTATUS", nullable = false, length=10)
	public String getValidStatus() {
		return this.validStatus;
	}

	public void setValidStatus(String validStatus) {
		this.validStatus = validStatus;
	}

	@Column(name = "ACCEPTOVERMINUTES", precision=6, scale=0)
	public Integer getAcceptOverMinutes() {
		return this.acceptOverMinutes;
	}

	public void setAcceptOverMinutes(Integer acceptOverMinutes) {
		this.acceptOverMinutes = acceptOverMinutes;
	}

	@Column(name = "OUTOVERMINUTES", precision=6, scale=0)
	public Integer getOutOverMinutes() {
		return this.outOverMinutes;
	}

	public void setOutOverMinutes(Integer outOverMinutes) {
		this.outOverMinutes = outOverMinutes;
	}

	@Column(name = "NODETYPE", length=25)
	public String getNodeType() {
		return this.nodeType;
	}

	public void setNodeType(String nodeType) {
		this.nodeType = nodeType;
	}

	@Column(name = "REMARK", length=10)
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATETIME", nullable = false, length=7)
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Column(name = "CREATEUSER", nullable = false, length=25)
	public String getCreateUser() {
		return this.createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATETIME", nullable = false, length=7)
	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@Column(name = "UPDATEUSER", nullable = false, length=25)
	public String getUpdateUser() {
		return this.updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	@Column(name = "GradeId", length = 25)
	public String getGradeId() {
		return gradeId;
	}

	public void setGradeId(String gradeId) {
		this.gradeId = gradeId;
	}
}
