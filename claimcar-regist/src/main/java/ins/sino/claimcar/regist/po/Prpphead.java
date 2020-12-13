package ins.sino.claimcar.regist.po;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * POJO Class Vprpphead
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Table(name = "PRPPHEAD")
public class Prpphead implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private String endorseNo;
	private String policyNo;
	private String printNo;
	private String classCode;
	private String riskCode;
	private Long endorseTimes;
	private String makeCom;
	private String compensateNo;
	private String insuredCode;
	private String insuredName;
	private String language;
	private String policyType;
	private String endorType;
	private Date endorDate;
	private Date validDate;
	private Long validHour;
	private String handlerCode;
	private String handler1Code;
	private String approverCode;
	private String underwriteCode;
	private String underwriteName;
	private String operatorCode;
	private Date inputDate;
	private Long inputHour;
	private String comCode;
	private String agentCode;
	private Date statiSticsym;
	private Date underwriteendDate;
	private String underwriteFlag;
	private String flag;
	private String updaterCode;
	private Date updateDate;
	private String updateHour;
	private String jfeeFlag;
	private Date precheckDate;
	private String handlerName;
	private String handler1Name;
	private String payrefCode;
	private String payrefName;
	private Date updateTime;
	private Date inputTime;
	private Date underwriteendTime;
	private String reason;
	private String reasonCode;
	private String businessPlate;
	private String endorseMode;
	private String isfullEndor;
	private BigDecimal disFee;
	private Date cancelreasonDate;
	private String isTax;

	@Id
	@Column(name = "ENDORSENO", nullable = false, length=25)
	public String getEndorseNo() {
		return this.endorseNo;
	}

	public void setEndorseNo(String endorseNo) {
		this.endorseNo = endorseNo;
	}

	@Column(name = "POLICYNO", nullable = false, length=22)
	public String getPolicyNo() {
		return this.policyNo;
	}

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	@Column(name = "PRINTNO", length=22)
	public String getPrintNo() {
		return this.printNo;
	}

	public void setPrintNo(String printNo) {
		this.printNo = printNo;
	}

	@Column(name = "CLASSCODE", length=3)
	public String getClassCode() {
		return this.classCode;
	}

	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}

	@Column(name = "RISKCODE", length=4)
	public String getRiskCode() {
		return this.riskCode;
	}

	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}

	@Column(name = "ENDORSETIMES", precision=15, scale=0)
	public Long getEndorseTimes() {
		return this.endorseTimes;
	}

	public void setEndorseTimes(Long endorseTimes) {
		this.endorseTimes = endorseTimes;
	}

	@Column(name = "MAKECOM", length=8)
	public String getMakeCom() {
		return this.makeCom;
	}

	public void setMakeCom(String makeCom) {
		this.makeCom = makeCom;
	}

	@Column(name = "COMPENSATENO", length=25)
	public String getCompensateNo() {
		return this.compensateNo;
	}

	public void setCompensateNo(String compensateNo) {
		this.compensateNo = compensateNo;
	}

	@Column(name = "INSUREDCODE", length=20)
	public String getInsuredCode() {
		return this.insuredCode;
	}

	public void setInsuredCode(String insuredCode) {
		this.insuredCode = insuredCode;
	}

	@Column(name = "INSUREDNAME", length=500)
	public String getInsuredName() {
		return this.insuredName;
	}

	public void setInsuredName(String insuredName) {
		this.insuredName = insuredName;
	}

	@Column(name = "LANGUAGE", length=1)
	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@Column(name = "POLICYTYPE", length=2)
	public String getPolicyType() {
		return this.policyType;
	}

	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}

	@Column(name = "ENDORTYPE", length=40)
	public String getEndorType() {
		return this.endorType;
	}

	public void setEndorType(String endorType) {
		this.endorType = endorType;
	}

	@Column(name = "ENDORDATE", length=7)
	public Date getEndorDate() {
		return this.endorDate;
	}

	public void setEndorDate(Date endorDate) {
		this.endorDate = endorDate;
	}

	@Column(name = "VALIDDATE", length=7)
	public Date getValidDate() {
		return this.validDate;
	}

	public void setValidDate(Date validDate) {
		this.validDate = validDate;
	}

	@Column(name = "VALIDHOUR", precision=15, scale=0)
	public Long getValidHour() {
		return this.validHour;
	}

	public void setValidHour(Long validHour) {
		this.validHour = validHour;
	}

	@Column(name = "HANDLERCODE", length=14)
	public String getHandlerCode() {
		return this.handlerCode;
	}

	public void setHandlerCode(String handlerCode) {
		this.handlerCode = handlerCode;
	}

	@Column(name = "HANDLER1CODE", length=10)
	public String getHandler1Code() {
		return this.handler1Code;
	}

	public void setHandler1Code(String handler1Code) {
		this.handler1Code = handler1Code;
	}

	@Column(name = "APPROVERCODE", length=10)
	public String getApproverCode() {
		return this.approverCode;
	}

	public void setApproverCode(String approverCode) {
		this.approverCode = approverCode;
	}

	@Column(name = "UNDERWRITECODE", length=10)
	public String getUnderwriteCode() {
		return this.underwriteCode;
	}

	public void setUnderwriteCode(String underwriteCode) {
		this.underwriteCode = underwriteCode;
	}

	@Column(name = "UNDERWRITENAME", length=32)
	public String getUnderwriteName() {
		return this.underwriteName;
	}

	public void setUnderwriteName(String underwriteName) {
		this.underwriteName = underwriteName;
	}

	@Column(name = "OPERATORCODE", length=10)
	public String getOperatorCode() {
		return this.operatorCode;
	}

	public void setOperatorCode(String operatorCode) {
		this.operatorCode = operatorCode;
	}

	@Column(name = "INPUTDATE", length=7)
	public Date getInputDate() {
		return this.inputDate;
	}

	public void setInputDate(Date inputDate) {
		this.inputDate = inputDate;
	}

	@Column(name = "INPUTHOUR", precision=15, scale=0)
	public Long getInputHour() {
		return this.inputHour;
	}

	public void setInputHour(Long inputHour) {
		this.inputHour = inputHour;
	}

	@Column(name = "COMCODE", length=8)
	public String getComCode() {
		return this.comCode;
	}

	public void setComCode(String comCode) {
		this.comCode = comCode;
	}

	@Column(name = "AGENTCODE", length=12)
	public String getAgentCode() {
		return this.agentCode;
	}

	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}

	@Column(name = "STATISTICSYM", length=7)
	public Date getStatiSticsym() {
		return this.statiSticsym;
	}

	public void setStatiSticsym(Date statiSticsym) {
		this.statiSticsym = statiSticsym;
	}

	@Column(name = "UNDERWRITEENDDATE", length=7)
	public Date getUnderwriteendDate() {
		return this.underwriteendDate;
	}

	public void setUnderwriteendDate(Date underwriteendDate) {
		this.underwriteendDate = underwriteendDate;
	}

	@Column(name = "UNDERWRITEFLAG", length=1)
	public String getUnderwriteFlag() {
		return this.underwriteFlag;
	}

	public void setUnderwriteFlag(String underwriteFlag) {
		this.underwriteFlag = underwriteFlag;
	}

	@Column(name = "FLAG", length=10)
	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	@Column(name = "UPDATERCODE", length=10)
	public String getUpdaterCode() {
		return this.updaterCode;
	}

	public void setUpdaterCode(String updaterCode) {
		this.updaterCode = updaterCode;
	}

	@Column(name = "UPDATEDATE", length=7)
	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	@Column(name = "UPDATEHOUR", length=8)
	public String getUpdateHour() {
		return this.updateHour;
	}

	public void setUpdateHour(String updateHour) {
		this.updateHour = updateHour;
	}

	@Column(name = "JFEEFLAG", length=1)
	public String getJfeeFlag() {
		return this.jfeeFlag;
	}

	public void setJfeeFlag(String jfeeFlag) {
		this.jfeeFlag = jfeeFlag;
	}

	@Column(name = "PRECHECKDATE", length=7)
	public Date getPrecheckDate() {
		return this.precheckDate;
	}

	public void setPrecheckDate(Date precheckDate) {
		this.precheckDate = precheckDate;
	}

	@Column(name = "HANDLERNAME", length=30)
	public String getHandlerName() {
		return this.handlerName;
	}

	public void setHandlerName(String handlerName) {
		this.handlerName = handlerName;
	}

	@Column(name = "HANDLER1NAME", length=30)
	public String getHandler1Name() {
		return this.handler1Name;
	}

	public void setHandler1Name(String handler1Name) {
		this.handler1Name = handler1Name;
	}

	@Column(name = "PAYREFCODE", length=20)
	public String getPayrefCode() {
		return this.payrefCode;
	}

	public void setPayrefCode(String payrefCode) {
		this.payrefCode = payrefCode;
	}

	@Column(name = "PAYREFNAME", length=120)
	public String getPayrefName() {
		return this.payrefName;
	}

	public void setPayrefName(String payrefName) {
		this.payrefName = payrefName;
	}

	@Column(name = "UPDATETIME", length=7)
	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@Column(name = "INPUTTIME", length=7)
	public Date getInputTime() {
		return this.inputTime;
	}

	public void setInputTime(Date inputTime) {
		this.inputTime = inputTime;
	}

	@Column(name = "UNDERWRITEENDTIME", length=7)
	public Date getUnderwriteendTime() {
		return this.underwriteendTime;
	}

	public void setUnderwriteendTime(Date underwriteendTime) {
		this.underwriteendTime = underwriteendTime;
	}

	@Column(name = "REASON", length=120)
	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	@Column(name = "REASONCODE", length=10)
	public String getReasonCode() {
		return this.reasonCode;
	}

	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}

	@Column(name = "BUSINESSPLATE", length=1)
	public String getBusinessPlate() {
		return this.businessPlate;
	}

	public void setBusinessPlate(String businessPlate) {
		this.businessPlate = businessPlate;
	}

	@Column(name = "ENDORSEMODE", length=1)
	public String getEndorseMode() {
		return this.endorseMode;
	}

	public void setEndorseMode(String endorseMode) {
		this.endorseMode = endorseMode;
	}

	@Column(name = "ISFULLENDOR", length=1)
	public String getIsfullEndor() {
		return this.isfullEndor;
	}

	public void setIsfullEndor(String isfullEndor) {
		this.isfullEndor = isfullEndor;
	}

	@Column(name = "DISFEE", precision=14)
	public BigDecimal getDisFee() {
		return this.disFee;
	}

	public void setDisFee(BigDecimal disFee) {
		this.disFee = disFee;
	}

	@Column(name = "CANCELREASONDATE", length=7)
	public Date getCancelreasonDate() {
		return this.cancelreasonDate;
	}

	public void setCancelreasonDate(Date cancelreasonDate) {
		this.cancelreasonDate = cancelreasonDate;
	}

	@Column(name = "ISTAX", length=2)
	public String getIsTax() {
		return this.isTax;
	}

	public void setIsTax(String isTax) {
		this.isTax = isTax;
	}
}
