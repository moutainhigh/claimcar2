package ins.platform.schema;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
import java.math.BigDecimal;
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
 * POJO Class SysAreaDict
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Table(name = "SYS_AREADICT")
public class SysAreaDict implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private String areaCode;
	private String areaName;
	private String shortCode;
	private String fullName;
	private BigDecimal areaLevel;
	private Short serialNo;
	private String upperCode;
	private String postCode;
	private String isValid;
	private String remark;
	private String oftenflag;
	private String comCode;
	private Date createTime;
	private String gpsCode;

	@Id
	@Column(name = "AREACODE", unique = true, nullable = false, length=20)
	public String getAreaCode() {
		return this.areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	@Column(name = "AREANAME", nullable = false, length=300)
	public String getAreaName() {
		return this.areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	@Column(name = "SHORTCODE", length=20)
	public String getShortCode() {
		return this.shortCode;
	}

	public void setShortCode(String shortCode) {
		this.shortCode = shortCode;
	}

	@Column(name = "FULLNAME", length=4000)
	public String getFullName() {
		return this.fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	@Column(name = "AREALEVEL", nullable = false, precision=3, scale=1)
	public BigDecimal getAreaLevel() {
		return this.areaLevel;
	}

	public void setAreaLevel(BigDecimal areaLevel) {
		this.areaLevel = areaLevel;
	}

	@Column(name = "SERIALNO", precision=4, scale=0)
	public Short getSerialNo() {
		return this.serialNo;
	}

	public void setSerialNo(Short serialNo) {
		this.serialNo = serialNo;
	}

	@Column(name = "UPPERCODE", nullable = false, length=20)
	public String getUpperCode() {
		return this.upperCode;
	}

	public void setUpperCode(String upperCode) {
		this.upperCode = upperCode;
	}

	@Column(name = "POSTCODE", length=20)
	public String getPostCode() {
		return this.postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	@Column(name = "ISVALID", length=1)
	public String getIsValid() {
		return this.isValid;
	}

	public void setIsValid(String isValid) {
		this.isValid = isValid;
	}

	@Column(name = "REMARK", length=1000)
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Column(name = "OFTENFLAG", length=2)
	public String getOftenflag() {
		return this.oftenflag;
	}

	public void setOftenflag(String oftenflag) {
		this.oftenflag = oftenflag;
	}

	@Column(name = "COMCODE", length=10)
	public String getComCode() {
		return this.comCode;
	}

	public void setComCode(String comCode) {
		this.comCode = comCode;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATETIME", length=7)
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Column(name = "GPSCODE", length=100)
	public String getGpsCode() {
		return gpsCode;
	}

	public void setGpsCode(String gpsCode) {
		this.gpsCode = gpsCode;
	}
	
	
}