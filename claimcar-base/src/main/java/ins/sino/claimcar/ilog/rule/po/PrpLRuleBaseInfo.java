package ins.sino.claimcar.ilog.rule.po;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * POJO Class PrpLRuleBaseInfo
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@TableGenerator(name = "utiSequence", table = "UTISEQUENCE", pkColumnName = "GenName", valueColumnName = "GenValue", pkColumnValue = "PRPLRULEBASEINFO_PK", allocationSize = 10)
@Table(name = "PRPLRULEBASEINFO")
public class PrpLRuleBaseInfo implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private PrpLRuleBaseInfoId id;
	private String businessNo;
	private String compensateNo;
	private String comCode;
	private String operatorCode;
	private String riskCode;
	private String operateType;
	private String ruleState;
	private String ruleType;
	private String underwriterFlag;
	private String minUndwrtNode;
	private String maxUndwrtNode;
	private Date createTime;
	private String ruleContent;
	private String flag;
	private BigDecimal taskId;
	private String lossParty;
	private String licenseNo;
	private String triggerNode;
	
	@EmbeddedId
	//@NotBlank
	@AttributeOverrides( {
        @AttributeOverride(name = "RULEID", column = @Column(name = "RULEID", nullable = false, length=50) ), 
        @AttributeOverride(name = "RULENODE", column = @Column(name = "RULENODE", nullable = false, length=10) ) } )
	public PrpLRuleBaseInfoId getId() {
		return this.id;
	}

	public void setId(PrpLRuleBaseInfoId id) {
		this.id = id;
	}

	@Column(name = "BUSINESSNO", nullable = false, length=50)
	public String getBusinessNo() {
		return this.businessNo;
	}

	public void setBusinessNo(String businessNo) {
		this.businessNo = businessNo;
	}

	@Column(name = "COMPENSATENO", length=50)
	public String getCompensateNo() {
		return this.compensateNo;
	}

	public void setCompensateNo(String compensateNo) {
		this.compensateNo = compensateNo;
	}

	@Column(name = "COMCODE", nullable = false, length=8)
	public String getComCode() {
		return this.comCode;
	}

	public void setComCode(String comCode) {
		this.comCode = comCode;
	}

	@Column(name = "OPERATORCODE", nullable = false, length=10)
	public String getOperatorCode() {
		return this.operatorCode;
	}

	public void setOperatorCode(String operatorCode) {
		this.operatorCode = operatorCode;
	}

	@Column(name = "RISKCODE", length=4)
	public String getRiskCode() {
		return this.riskCode;
	}

	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}

	@Column(name = "OPERATETYPE", nullable = false, length=1)
	public String getOperateType() {
		return this.operateType;
	}

	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

	@Column(name = "RULESTATE", nullable = false, length=1)
	public String getRuleState() {
		return this.ruleState;
	}

	public void setRuleState(String ruleState) {
		this.ruleState = ruleState;
	}

	@Column(name = "RULETYPE", length=10)
	public String getRuleType() {
		return this.ruleType;
	}

	public void setRuleType(String ruleType) {
		this.ruleType = ruleType;
	}

	@Column(name = "UNDERWRITERFLAG",  length=1)
	public String getUnderwriterFlag() {
		return this.underwriterFlag;
	}

	public void setUnderwriterFlag(String underwriterFlag) {
		this.underwriterFlag = underwriterFlag;
	}

	@Column(name = "MINUNDWRTNODE", length=4)
	public String getMinUndwrtNode() {
		return this.minUndwrtNode;
	}

	public void setMinUndwrtNode(String minUndwrtNode) {
		this.minUndwrtNode = minUndwrtNode;
	}

	@Column(name = "MAXUNDWRTNODE", length=4)
	public String getMaxUndwrtNode() {
		return this.maxUndwrtNode;
	}

	public void setMaxUndwrtNode(String maxUndwrtNode) {
		this.maxUndwrtNode = maxUndwrtNode;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATETIME", length=7)
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Column(name = "RULECONTENT", length=4000)
	public String getRuleContent() {
		return this.ruleContent;
	}

	public void setRuleContent(String ruleContent) {
		this.ruleContent = ruleContent;
	}

	@Column(name = "FLAG", length=4)
	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}
	
	@Column(name = "TASKID", nullable = false)
	public BigDecimal getTaskId() {
		return this.taskId;
	}

	public void setTaskId(BigDecimal taskId) {
		this.taskId = taskId;
	}
	
	@Column(name = "LOSSPARTY", nullable = false,length=20)
	public String getLossParty() {
		return lossParty;
	}
	
	public void setLossParty(String lossParty) {
		this.lossParty = lossParty;
	}
	
	@Column(name = "LICENSENO", nullable = false,length=10)
	public String getLicenseNo() {
		return licenseNo;
	}
	
	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}
	
	@Column(name = "TRIGGERNODE", nullable = false, length=10)
	public String getTriggerNode() {
		return triggerNode;
	}

	
	public void setTriggerNode(String triggerNode) {
		this.triggerNode = triggerNode;
	}
}
