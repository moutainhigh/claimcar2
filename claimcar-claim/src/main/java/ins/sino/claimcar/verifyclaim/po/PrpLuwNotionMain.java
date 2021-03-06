package ins.sino.claimcar.verifyclaim.po;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * POJO Class PrpLuwNotionMain
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@TableGenerator(name = "utiSequence", table = "UTISEQUENCE", pkColumnName = "GenName", valueColumnName = "GenValue", pkColumnValue = "PRPLUWNOTIONMAIN_PK", allocationSize = 10)
@Table(name = "PRPLUWNOTIONMAIN")
public class PrpLuwNotionMain implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private Long taskId;
	private String registNo;
	private String compensateNo;
	private String claimNo;
	private String policyNo;
	private String policyType;
	private String taskInNode;
	private String recoveries;
	private String handle;
	private String handleUser;
	private Date handleTime;
	private String validFlag;
	private String flag;
	private String remark;
	private Date createTime;
	private String createUser;
	private Date updateTime;
	private String updateUser;
	private List<PrpLuwNotion> prpLuwNotions = new ArrayList<PrpLuwNotion>(0);
	private String impairmentType;//��������
	private String fraudType;//��թ����

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "utiSequence")
	@Column(name = "ID", unique = true, nullable = false, precision=13, scale=0)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "TASKID", precision=13, scale=0)
	public Long getTaskId() {
		return this.taskId;
	}

	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}

	@Column(name = "REGISTNO", nullable = false, length=32)
	public String getRegistNo() {
		return this.registNo;
	}

	public void setRegistNo(String registNo) {
		this.registNo = registNo;
	}

	@Column(name = "COMPENSATENO", nullable = false, length=32)
	public String getCompensateNo() {
		return this.compensateNo;
	}

	public void setCompensateNo(String compensateNo) {
		this.compensateNo = compensateNo;
	}

	@Column(name = "CLAIMNO", length=32)
	public String getClaimNo() {
		return this.claimNo;
	}

	public void setClaimNo(String claimNo) {
		this.claimNo = claimNo;
	}

	@Column(name = "POLICYNO", length=30)
	public String getPolicyNo() {
		return this.policyNo;
	}

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	@Column(name = "POLICYTYPE", length=2)
	public String getPolicyType() {
		return this.policyType;
	}

	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}

	@Column(name = "TASKINNODE", length=20)
	public String getTaskInNode() {
		return this.taskInNode;
	}

	public void setTaskInNode(String taskInNode) {
		this.taskInNode = taskInNode;
	}

	@Column(name = "RECOVERIES", length=2)
	public String getRecoveries() {
		return this.recoveries;
	}

	public void setRecoveries(String recoveries) {
		this.recoveries = recoveries;
	}

	@Column(name = "HANDLE", length=2)
	public String getHandle() {
		return this.handle;
	}

	public void setHandle(String handle) {
		this.handle = handle;
	}

	@Column(name = "HANDLEUSER", length=20)
	public String getHandleUser() {
		return this.handleUser;
	}

	public void setHandleUser(String handleUser) {
		this.handleUser = handleUser;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "HANDLETIME", length=7)
	public Date getHandleTime() {
		return this.handleTime;
	}

	public void setHandleTime(Date handleTime) {
		this.handleTime = handleTime;
	}

	@Column(name = "VALIDFLAG", length=1)
	public String getValidFlag() {
		return this.validFlag;
	}

	public void setValidFlag(String validFlag) {
		this.validFlag = validFlag;
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

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATETIME", nullable = false, length=7)
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Column(name = "CREATEUSER", nullable = false, length=20)
	public String getCreateUser() {
		return this.createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATETIME", length=7)
	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@Column(name = "UPDATEUSER", length=20)
	public String getUpdateUser() {
		return this.updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER, mappedBy="prpLuwNotionMain")
	public List<PrpLuwNotion> getPrpLuwNotions() {
		return this.prpLuwNotions;
	}

	public void setPrpLuwNotions(List<PrpLuwNotion> prpLuwNotions) {
		this.prpLuwNotions = prpLuwNotions;
	}

	@Column(name = "IMPAIRMENTTYPE", length=255)
	public String getImpairmentType() {
		return impairmentType;
	}

	public void setImpairmentType(String impairmentType) {
		this.impairmentType = impairmentType;
	}

	@Column(name = "FRAUDTYPE", length=255)
	public String getFraudType() {
		return fraudType;
	}

	public void setFraudType(String fraudType) {
		this.fraudType = fraudType;
	}
	
}
