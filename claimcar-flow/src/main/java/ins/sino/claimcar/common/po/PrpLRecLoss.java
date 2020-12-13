package ins.sino.claimcar.common.po;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * POJO Class PrpLRecLoss
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Table(name = "PRPLRECLOSS")
public class PrpLRecLoss implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private String prpLRecLossId;
	private String recLossType;
	private Long lossMainId;
	private String registNo;
	private String recLossPlace;
	private BigDecimal recLossFee;
	private Date recLossDate;
	private String handlerCode;
	private String handlerName;
	private String handlerPhone;
	private String operatorCode;
	private String operatorName;
	private String flag;
	private String remark;
	private String createUser;
	private Date createTime;
	private String updateUser;
	private Date updateTime;
	private String recLossMainId;
	private String underwriteFlag;
	private List<PrpLRecLossDetail> prpLRecLossDetails = new ArrayList<PrpLRecLossDetail>(0);

	@Id
	@Column(name = "PRPLRECLOSSID", unique = true, nullable = false, length=30)
	public String getPrpLRecLossId() {
		return this.prpLRecLossId;
	}

	public void setPrpLRecLossId(String prpLRecLossId) {
		this.prpLRecLossId = prpLRecLossId;
	}

	@Column(name = "RECLOSSTYPE", nullable = false, length=1)
	public String getRecLossType() {
		return this.recLossType;
	}

	public void setRecLossType(String recLossType) {
		this.recLossType = recLossType;
	}

	@Column(name = "LOSSMAINID", nullable = false, precision=12, scale=0)
	public Long getLossMainId() {
		return this.lossMainId;
	}

	public void setLossMainId(Long lossMainId) {
		this.lossMainId = lossMainId;
	}

	@Column(name = "REGISTNO", nullable = false, length=25)
	public String getRegistNo() {
		return this.registNo;
	}

	public void setRegistNo(String registNo) {
		this.registNo = registNo;
	}

	@Column(name = "RECLOSSPLACE", length=120)
	public String getRecLossPlace() {
		return this.recLossPlace;
	}

	public void setRecLossPlace(String recLossPlace) {
		this.recLossPlace = recLossPlace;
	}

	@Column(name = "RECLOSSFEE", precision=14)
	public BigDecimal getRecLossFee() {
		return this.recLossFee;
	}

	public void setRecLossFee(BigDecimal recLossFee) {
		this.recLossFee = recLossFee;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "RECLOSSDATE", length=7)
	public Date getRecLossDate() {
		return this.recLossDate;
	}

	public void setRecLossDate(Date recLossDate) {
		this.recLossDate = recLossDate;
	}

	@Column(name = "HANDLERCODE", length=10)
	public String getHandlerCode() {
		return this.handlerCode;
	}

	public void setHandlerCode(String handlerCode) {
		this.handlerCode = handlerCode;
	}

	@Column(name = "HANDLERNAME", length=30)
	public String getHandlerName() {
		return this.handlerName;
	}

	public void setHandlerName(String handlerName) {
		this.handlerName = handlerName;
	}

	@Column(name = "HANDLERPHONE", length=30)
	public String getHandlerPhone() {
		return this.handlerPhone;
	}

	public void setHandlerPhone(String handlerPhone) {
		this.handlerPhone = handlerPhone;
	}

	@Column(name = "OPERATORCODE", length=10)
	public String getOperatorCode() {
		return this.operatorCode;
	}

	public void setOperatorCode(String operatorCode) {
		this.operatorCode = operatorCode;
	}

	@Column(name = "OPERATORNAME", length=30)
	public String getOperatorName() {
		return this.operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
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

    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="prpLRecLoss")
	public List<PrpLRecLossDetail> getPrpLRecLossDetails() {
		return this.prpLRecLossDetails;
	}

	public void setPrpLRecLossDetails(List<PrpLRecLossDetail> prpLRecLossDetails) {
		this.prpLRecLossDetails = prpLRecLossDetails;
	}

	@Column(name = "RECLOSSMAINID", length=30)
	public String getRecLossMainId() {
		return recLossMainId;
	}

	public void setRecLossMainId(String recLossMainId) {
		this.recLossMainId = recLossMainId;
	}

	
	@Column(name = "UNDERWRITEFLAG", length=1)
	public String getUnderwriteFlag() {
		return this.underwriteFlag;
	}

	public void setUnderwriteFlag(String underwriteFlag) {
		this.underwriteFlag = underwriteFlag;
	}
	
	
}