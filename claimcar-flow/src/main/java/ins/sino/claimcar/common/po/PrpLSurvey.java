package ins.sino.claimcar.common.po;

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

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * POJO Class PrpLSurvey
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Table(name = "PRPLSURVEY")
@TableGenerator(name = "utiSequence", table = "UTISEQUENCE", pkColumnName = "GenName", valueColumnName = "GenValue", pkColumnValue = "PK_PRPLSURVEY", allocationSize = 10)
public class PrpLSurvey implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String registNo;
	private Long fraudScoreId;
	private String nodeCode;
	private String reasonDesc;
	private String createUser;
	private Date createTime;
	private String handlerUser;
	private Date handlerTime;
	private String handlerStatus;
	private String isInjuryCases;
	private String isMinorCases;
	private String isAutoTrigger;
	private String opinionDesc;
	private String isFraud;//是否欺诈
	private BigDecimal amout;//减损金额
	private String impairmentCase;//是否整案减损
	private String fraudType;//增加欺诈类型
	private String externalSurvey;//是否转外部调查机构处理
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "utiSequence")
	@Column(name = "ID", unique = true, nullable = false, precision=15, scale=0)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "REGISTNO", nullable = false, length=25)
	public String getRegistNo() {
		return this.registNo;
	}

	public void setRegistNo(String registNo) {
		this.registNo = registNo;
	}
	
	@Column(name = "FRAUDSCOREID", length=12)
	public Long getFraudScoreId() {
		return fraudScoreId;
	}

	public void setFraudScoreId(Long fraudScoreId) {
		this.fraudScoreId = fraudScoreId;
	}

	@Column(name = "NODECODE", nullable = false, length=10)
	public String getNodeCode() {
		return this.nodeCode;
	}

	public void setNodeCode(String nodeCode) {
		this.nodeCode = nodeCode;
	}

	@Column(name = "REASONDESC", length=1000)
	public String getReasonDesc() {
		return this.reasonDesc;
	}

	public void setReasonDesc(String reasonDesc) {
		this.reasonDesc = reasonDesc;
	}

	@Column(name = "CREATEUSER", nullable = false, length=12)
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

	@Column(name = "HANDLERUSER", length=12)
	public String getHandlerUser() {
		return this.handlerUser;
	}

	public void setHandlerUser(String handlerUser) {
		this.handlerUser = handlerUser;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "HANDLERTIME", length=7)
	public Date getHandlerTime() {
		return this.handlerTime;
	}

	public void setHandlerTime(Date handlerTime) {
		this.handlerTime = handlerTime;
	}

	@Column(name = "HANDLERSTATUS", nullable = false, length=2)
	public String getHandlerStatus() {
		return this.handlerStatus;
	}

	public void setHandlerStatus(String handlerStatus) {
		this.handlerStatus = handlerStatus;
	}

	@Column(name = "ISINJURYCASES", length=1)
	public String getIsInjuryCases() {
		return isInjuryCases;
	}

	public void setIsInjuryCases(String isInjuryCases) {
		this.isInjuryCases = isInjuryCases;
	}

	@Column(name = "ISMINORCASES", length=1)
	public String getIsMinorCases() {
		return isMinorCases;
	}

	public void setIsMinorCases(String isMinorCases) {
		this.isMinorCases = isMinorCases;
	}
	
	@Column(name = "ISAUTOTRIGGER", length=1)
	public String getIsAutoTrigger() {
		return isAutoTrigger;
	}

	public void setIsAutoTrigger(String isAutoTrigger) {
		this.isAutoTrigger = isAutoTrigger;
	}

	@Column(name = "OPINIONDESC", length=30)
	public String getOpinionDesc() {
		return opinionDesc;
	}

	public void setOpinionDesc(String opinionDesc) {
		this.opinionDesc = opinionDesc;
	}

	@Column(name = "ISFRAUD", length=2)
	public String getIsFraud() {
		return isFraud;
	}

	public void setIsFraud(String isFraud) {
		this.isFraud = isFraud;
	}

	@Column(name = "AMOUT", precision=14)
	public BigDecimal getAmout() {
		return amout;
	}

	public void setAmout(BigDecimal amout) {
		this.amout = amout;
	}

	@Column(name = "IMPAIRMENTCASE", length=2)
	public String getImpairmentCase() {
		return impairmentCase;
	}

	public void setImpairmentCase(String impairmentCase) {
		this.impairmentCase = impairmentCase;
	}

	@Column(name = "FRAUDTYPE", length=10)
	public String getFraudType() {
		return fraudType;
	}

	public void setFraudType(String fraudType) {
		this.fraudType = fraudType;
	}

	@Column(name = "EXTERNALSURVEY", length=2)
	public String getExternalSurvey() {
		return externalSurvey;
	}

	public void setExternalSurvey(String externalSurvey) {
		this.externalSurvey = externalSurvey;
	}
	
	
}
