package ins.sino.claimcar.carchildren.po;

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

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * POJO Class Prplcarchildregistcancle
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@TableGenerator(name = "utiSequence", table = "UTISEQUENCE", pkColumnName = "GenName", valueColumnName = "GenValue", pkColumnValue = "PRPLCARCHILDREGISTCANCLE_PK", allocationSize = 10)
@Table(name = "PRPLCARCHILDREGISTCANCLE")
public class Prplcarchildregistcancle implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private Date timesTamp;
	private String registNo;
	private String userCode;
	private Date cancleDate;
	private String reason;
	private String requestSource;
	private String status;
	private String licenseNo;
	private String bipolicyNo;
	private String cipolicyNo;
	private String remark;
	private String flagLog;
	private Date handleDate;
	private String handleUser;
	private String examineRusult;
	private Date createTime;

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "utiSequence")
	@Column(name = "ID", unique = true, nullable = false, precision = 12, scale = 0)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "TIMESTAMP", length = 7)
	public Date getTimesTamp() {
		return this.timesTamp;
	}

	public void setTimesTamp(Date timesTamp) {
		this.timesTamp = timesTamp;
	}

	@Column(name = "REGISTNO", length = 35)
	public String getRegistNo() {
		return this.registNo;
	}

	public void setRegistNo(String registNo) {
		this.registNo = registNo;
	}

	@Column(name = "USERCODE", length = 25)
	public String getUserCode() {
		return this.userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CANCLEDATE", length = 7)
	public Date getCancleDate() {
		return this.cancleDate;
	}

	public void setCancleDate(Date cancleDate) {
		this.cancleDate = cancleDate;
	}

	@Column(name = "REASON", length = 50)
	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	@Column(name = "REQUESTSOURCE", length = 35)
	public String getRequestSource() {
		return this.requestSource;
	}

	public void setRequestSource(String requestSource) {
		this.requestSource = requestSource;
	}

	@Column(name = "STATUS", length = 20)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "LICENSENO", length = 35)
	public String getLicenseNo() {
		return this.licenseNo;
	}

	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}

	@Column(name = "BIPOLICYNO", length = 35)
	public String getBipolicyNo() {
		return this.bipolicyNo;
	}

	public void setBipolicyNo(String bipolicyNo) {
		this.bipolicyNo = bipolicyNo;
	}

	@Column(name = "CIPOLICYNO", length = 35)
	public String getCipolicyNo() {
		return this.cipolicyNo;
	}

	public void setCipolicyNo(String cipolicyNo) {
		this.cipolicyNo = cipolicyNo;
	}

	@Column(name = "REMARK", length = 225)
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	

	@Column(name = "FLAGLOG", length = 50)
	public String getFlagLog() {
		return this.flagLog;
	}

	public void setFlagLog(String flagLog) {
		this.flagLog = flagLog;
	}
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "HANDLEDATE", length = 7)
	public Date getHandleDate() {
		return handleDate;
	}

	public void setHandleDate(Date handleDate) {
		this.handleDate = handleDate;
	}
	@Column(name = "HANDLEUSER", length = 35)
	public String getHandleUser() {
		return handleUser;
	}

	public void setHandleUser(String handleUser) {
		this.handleUser = handleUser;
	}
	@Column(name = "EXAMINERUSULT", length = 10)
	public String getExamineRusult() {
		return examineRusult;
	}

	public void setExamineRusult(String examineRusult) {
		this.examineRusult = examineRusult;
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
