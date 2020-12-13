package ins.sino.claimcar.dloss.lossperson.po;

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
 * POJO Class PrpLDlossPersHospital
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
@Table(name = "PRPLDLOSSPERSHOSPITAL")
public class PrpLDlossPersHospital implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private Long injuredId;
	private String registNo;
	private String personName;
	private String riskCode;
	private Date inHospitalDate;
	private Date outHospitalDate;
	private String hospitalProvince;
	private String hospitalCity;
	private String hospitalCode;
	private String hospitalName;
	private String remark;
	private String validFlag;
	private String flag;
	private String createUser;
	private Date createTime;
	private String updateUser;
	private Date updateTime;

	@Id
	@Column(name = "ID", unique = true, nullable = false, precision=14, scale=0)
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

	@Column(name = "PERSONNAME", length=120)
	public String getPersonName() {
		return this.personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	@Column(name = "RISKCODE", length=4)
	public String getRiskCode() {
		return this.riskCode;
	}

	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "INHOSPITALDATE", length=7)
	public Date getInHospitalDate() {
		return this.inHospitalDate;
	}

	public void setInHospitalDate(Date inHospitalDate) {
		this.inHospitalDate = inHospitalDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "OUTHOSPITALDATE", length=7)
	public Date getOutHospitalDate() {
		return this.outHospitalDate;
	}

	public void setOutHospitalDate(Date outHospitalDate) {
		this.outHospitalDate = outHospitalDate;
	}

	@Column(name = "HOSPITALPROVINCE", length=10)
	public String getHospitalProvince() {
		return this.hospitalProvince;
	}

	public void setHospitalProvince(String hospitalProvince) {
		this.hospitalProvince = hospitalProvince;
	}

	@Column(name = "HOSPITALCITY", length=10)
	public String getHospitalCity() {
		return this.hospitalCity;
	}

	public void setHospitalCity(String hospitalCity) {
		this.hospitalCity = hospitalCity;
	}

	@Column(name = "HOSPITALCODE", length=50)
	public String getHospitalCode() {
		return this.hospitalCode;
	}

	public void setHospitalCode(String hospitalCode) {
		this.hospitalCode = hospitalCode;
	}

	@Column(name = "HOSPITALNAME", length=120)
	public String getHospitalName() {
		return this.hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	@Column(name = "REMARK")
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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

	@Column(name = "INJUREDID")
	public Long getInjuredId() {
		return injuredId;
	}

	public void setInjuredId(Long injuredId) {
		this.injuredId = injuredId;
	}
}
