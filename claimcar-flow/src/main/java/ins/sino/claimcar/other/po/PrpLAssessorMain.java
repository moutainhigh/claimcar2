package ins.sino.claimcar.other.po;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
import java.math.BigDecimal;
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

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * POJO Class PrpLAssessorMain
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@TableGenerator(name = "utiSequence", table = "UTISEQUENCE", pkColumnName = "GenName", valueColumnName = "GenValue", pkColumnValue = "PRPLASSESSORMAIN_PK", allocationSize = 10)
@Table(name = "PRPLASSESSORMAIN")
public class PrpLAssessorMain implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String taskId;
	private String intermcode;
	private String intermname;
	private BigDecimal sumAmount;
	private String underWriteFlag;
	private Date underWriteDate;
	private String underwriteuser;
	private String createUser;
	private Date createTime;
	private String updateUser;
	private Date updateTime;
	private String comCode;
	private Long intermId;
	private String intermNameDetail;
	private List<PrpLAssessorFee> prpLAssessorFees = new ArrayList<PrpLAssessorFee>(0);

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE,generator="utiSequence" )
	@Column(name = "ID", unique = true, nullable = false, precision=12, scale=0)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "TASKID", nullable = false, length=25)
	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	@Column(name = "INTERMCODE", length=30)
	public String getIntermcode() {
		return this.intermcode;
	}

	public void setIntermcode(String intermcode) {
		this.intermcode = intermcode;
	}

	@Column(name = "INTERMNAME", length=30)
	public String getIntermname() {
		return this.intermname;
	}

	public void setIntermname(String intermname) {
		this.intermname = intermname;
	}

	@Column(name = "SUMAMOUNT", precision=10)
	public BigDecimal getSumAmount() {
		return this.sumAmount;
	}

	public void setSumAmount(BigDecimal sumAmount) {
		this.sumAmount = sumAmount;
	}

	@Column(name = "UNDERWRITEFLAG", length=4)
	public String getUnderWriteFlag() {
		return this.underWriteFlag;
	}

	public void setUnderWriteFlag(String underWriteFlag) {
		this.underWriteFlag = underWriteFlag;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UNDERWRITEDATE", length=7)
	public Date getUnderWriteDate() {
		return this.underWriteDate;
	}

	public void setUnderWriteDate(Date underWriteDate) {
		this.underWriteDate = underWriteDate;
	}

	@Column(name = "UNDERWRITEUSER", length=30)
	public String getUnderwriteuser() {
		return this.underwriteuser;
	}

	public void setUnderwriteuser(String underwriteuser) {
		this.underwriteuser = underwriteuser;
	}

	@Column(name = "CREATEUSER", length=10)
	public String getCreateUser() {
		return this.createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATETIME", length=7)
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Column(name = "UPDATEUSER", length=10)
	public String getUpdateUser() {
		return this.updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATETIME", length=7)
	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="prpLAssessorMain")
	public List<PrpLAssessorFee> getPrpLAssessorFees() {
		return this.prpLAssessorFees;
	}

	public void setPrpLAssessorFees(List<PrpLAssessorFee> prpLAssessorFees) {
		this.prpLAssessorFees = prpLAssessorFees;
	}
	
	@Column(name = "COMCODE", length=20)
	public String getComCode() {
		return comCode;
	}

	public void setComCode(String comCode) {
		this.comCode = comCode;
	}

	@Column(name = "INTERMID", length=20)
	public Long getIntermId() {
		return intermId;
	}

	public void setIntermId(Long intermId) {
		this.intermId = intermId;
	}

	@Column(name = "INTERMNAMEDETAIL", length=250)
	public String getIntermNameDetail() {
		return intermNameDetail;
	}

	public void setIntermNameDetail(String intermNameDetail) {
		this.intermNameDetail = intermNameDetail;
	}
}
