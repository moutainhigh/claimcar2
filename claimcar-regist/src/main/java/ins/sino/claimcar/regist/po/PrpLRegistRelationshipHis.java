package ins.sino.claimcar.regist.po;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * POJO Class PrpLRegistRelationshipHis
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@TableGenerator(name = "utiSequence", table = "UTISEQUENCE", pkColumnName = "GenName", valueColumnName = "GenValue", pkColumnValue = "PRPLREGISTRELATIONSHIPHIS_PK", allocationSize = 10)
@Table(name = "PRPLREGISTRELATIONSHIPHIS")
public class PrpLRegistRelationshipHis implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String registNo;
	private String operationtype;
	private String operationbefore;
	private String operationafter;
	private String flag;
	private String remark;
	private String createUser;
	private Date createTime;
	private String updateUser;
	private Date updateTime;

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "utiSequence")
	@Column(name = "ID", unique = true, nullable = false, scale=0)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "REGISTNO", nullable = false, length=30)
	public String getRegistNo() {
		return this.registNo;
	}

	public void setRegistNo(String registNo) {
		this.registNo = registNo;
	}

	@Column(name = "OPERATIONTYPE", length=1)
	public String getOperationtype() {
		return this.operationtype;
	}

	public void setOperationtype(String operationtype) {
		this.operationtype = operationtype;
	}

	@Column(name = "OPERATIONBEFORE", length=100)
	public String getOperationbefore() {
		return this.operationbefore;
	}

	public void setOperationbefore(String operationbefore) {
		this.operationbefore = operationbefore;
	}

	@Column(name = "OPERATIONAFTER", length=100)
	public String getOperationafter() {
		return this.operationafter;
	}

	public void setOperationafter(String operationafter) {
		this.operationafter = operationafter;
	}

	@Column(name = "FLAG", length=10)
	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	@Column(name = "REMARK", length=200)
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Column(name = "CREATEUSER", nullable = false, length=10)
	public String getCreateUser() {
		return this.createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATETIME", nullable = false, length=7)
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Column(name = "UPDATEUSER", nullable = false, length=10)
	public String getUpdateUser() {
		return this.updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATETIME", nullable = false, length=7)
	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}
