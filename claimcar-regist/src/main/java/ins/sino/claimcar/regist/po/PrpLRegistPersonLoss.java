package ins.sino.claimcar.regist.po;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * POJO Class PrpLRegistPersonLoss
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@TableGenerator(name = "utiSequence", table = "UTISEQUENCE", pkColumnName = "GenName", valueColumnName = "GenValue", pkColumnValue = "PRPLREGISTPERSONLOSS_PK", allocationSize = 10)
@Table(name = "PRPLREGISTPERSONLOSS")
public class PrpLRegistPersonLoss implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private PrpLRegist prpLRegist;
	private String lossparty;
	private Integer injuredcount;
	private Integer deathcount;
	private String driverflag;
	private String hospitalcode;
	private String hospitalname;
	private String validflag;
	private String flag;
	private String remark;
	private String createUser;
	private Date createTime;
	private String updateUser;
	private Date updateTime;

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "utiSequence")
	@Column(name = "ID", unique = true, nullable = false, precision=0)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="REGISTNO")
	public PrpLRegist getPrpLRegist() {
		return this.prpLRegist;
	}

	public void setPrpLRegist(PrpLRegist prpLRegist) {
		this.prpLRegist = prpLRegist;
	}

	@Column(name = "LOSSPARTY", nullable = false, length=1)
	public String getLossparty() {
		return this.lossparty;
	}

	public void setLossparty(String lossparty) {
		this.lossparty = lossparty;
	}

	@Column(name = "INJUREDCOUNT", precision=5, scale=0)
	public Integer getInjuredcount() {
		return this.injuredcount;
	}

	public void setInjuredcount(Integer injuredcount) {
		this.injuredcount = injuredcount;
	}

	@Column(name = "DEATHCOUNT", precision=5, scale=0)
	public Integer getDeathcount() {
		return this.deathcount;
	}

	public void setDeathcount(Integer deathcount) {
		this.deathcount = deathcount;
	}

	@Column(name = "DRIVERFLAG", length=1)
	public String getDriverflag() {
		return this.driverflag;
	}

	public void setDriverflag(String driverflag) {
		this.driverflag = driverflag;
	}

	@Column(name = "HOSPITALCODE", length=10)
	public String getHospitalcode() {
		return this.hospitalcode;
	}

	public void setHospitalcode(String hospitalcode) {
		this.hospitalcode = hospitalcode;
	}

	@Column(name = "HOSPITALNAME", length=120)
	public String getHospitalname() {
		return this.hospitalname;
	}

	public void setHospitalname(String hospitalname) {
		this.hospitalname = hospitalname;
	}

	@Column(name = "VALIDFLAG", length=1)
	public String getValidflag() {
		return this.validflag;
	}

	public void setValidflag(String validflag) {
		this.validflag = validflag;
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
