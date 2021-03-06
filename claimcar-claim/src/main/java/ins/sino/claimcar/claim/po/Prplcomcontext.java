package ins.sino.claimcar.claim.po;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
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
 * POJO Class Prplcomcontext
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@TableGenerator(name = "utiSequence", table = "UTISEQUENCE", pkColumnName = "GenName", valueColumnName = "GenValue", pkColumnValue = "PRPLCOMCONTEXT_PK", allocationSize = 10)
@Table(name = "PRPLCOMCONTEXT")
public class Prplcomcontext implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String compensateNo;
	private String flag;
	private String flagContext;
	private String causes;
	private String nodeSign;
	private String createUser;
	private Date createTime;

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "utiSequence")
	@Column(name = "ID", unique = true, nullable = false, precision = 13, scale = 0)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "COMPENSATENO", length = 35)
	public String getCompensateNo() {
		return this.compensateNo;
	}

	public void setCompensateNo(String compensateNo) {
		this.compensateNo = compensateNo;
	}

	@Column(name = "FLAG", length = 10)
	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	@Column(name = "FLAGCONTEXT", length = 300)
	public String getFlagContext() {
		return this.flagContext;
	}

	public void setFlagContext(String flagContext) {
		this.flagContext = flagContext;
	}

	@Column(name = "CAUSES", length = 350)
	public String getCauses() {
		return this.causes;
	}

	public void setCauses(String causes) {
		this.causes = causes;
	}

	@Column(name = "NODESIGN", length = 15)
	public String getNodeSign() {
		return this.nodeSign;
	}

	public void setNodeSign(String nodeSign) {
		this.nodeSign = nodeSign;
	}

	@Column(name = "CREATEUSER", length = 10)
	public String getCreateUser() {
		return this.createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATETIME", length = 7)
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}
