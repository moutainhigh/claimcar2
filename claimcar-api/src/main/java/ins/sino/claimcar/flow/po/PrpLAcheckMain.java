package ins.sino.claimcar.flow.po;

//Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
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

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
* POJO Class PrpLAcheckMain
*/
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@TableGenerator(name = "utiSequence", table = "UTISEQUENCE", pkColumnName = "GenName", valueColumnName = "GenValue", pkColumnValue = "PK_PRPLACHECKMAIN", allocationSize = 10)
@Table(name = "PRPLACHECKMAIN")
public class PrpLAcheckMain implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String taskId;
	private String checkcode;
	private String checkname;
	private BigDecimal sumAmount;
	private String underWriteFlag;
	private Date underWriteDate;
	private String underwriteuser;
	private String createUser;
	private Date createTime;
	private String updateUser;
	private Date updateTime;
	private String comCode;
	private Long checkmId;
	private String checkmNameDetail;
	private List<PrpLCheckFee> prpLCheckFees = new ArrayList<PrpLCheckFee>(0);

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

	@Column(name = "CHECKCODE", length=30)
	public String getCheckcode() {
		return this.checkcode;
	}

	public void setCheckcode(String checkcode) {
		this.checkcode = checkcode;
	}

	@Column(name = "CHECKNAME", length=30)
	public String getCheckname() {
		return this.checkname;
	}

	public void setCheckname(String checkname) {
		this.checkname = checkname;
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

   @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="prpLAcheckMain")
   public List<PrpLCheckFee> getPrpLCheckFees() {
	return prpLCheckFees;
   }

   public void setPrpLCheckFees(List<PrpLCheckFee> prpLCheckFees) {
	this.prpLCheckFees = prpLCheckFees;
  }

    @Column(name = "COMCODE", length=20)
    public String getComCode() {
	return comCode;
    }

    public void setComCode(String comCode) {
		this.comCode = comCode;
	}


	@Column(name = "CHECKMID", length=20)
	public Long getCheckmId() {
		return checkmId;
	}

	public void setCheckmId(Long checkmId) {
		this.checkmId = checkmId;
	}
	@Column(name = "CHECKMNAMEDETAIL", length=250)
	public String getCheckmNameDetail() {
		return checkmNameDetail;
	}

	public void setCheckmNameDetail(String checkmNameDetail) {
		this.checkmNameDetail = checkmNameDetail;
	}
	

	
	
}
