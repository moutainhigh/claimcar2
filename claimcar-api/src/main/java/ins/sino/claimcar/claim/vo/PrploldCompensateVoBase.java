package ins.sino.claimcar.claim.vo;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
import java.math.BigDecimal;
import java.util.Date;

/**
 * Vo Base Class of PO PrploldCompensate
 */
public class PrploldCompensateVoBase implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private String compensateNo;
	private String lflag;
	private String caseNo;
	private BigDecimal times;
	private String classCode;
	private String riskCode;
	private String claimNo;
	private String policyNo;
	private String deductCond;
	private Date preserveDate;
	private String checkagentCode;
	private String checkagentName;
	private String surveyorName;
	private String counterclaimerName;
	private String dutydeScription;
	private String currency;
	private BigDecimal sumLoss;
	private BigDecimal sumRest;
	private BigDecimal sumdutyPaid;
	private BigDecimal sumnodutyFee;
	private BigDecimal sumPaid;
	private BigDecimal sumprePaid;
	private BigDecimal sumthisPaid;
	private String receiverName;
	private String bank;
	private String account;
	private String makeCom;
	private String comCode;
	private String handlerCode;
	private String handler1Code;
	private String approverCode;
	private String underwriteCode;
	private String underwriteName;
	private Date statiSticsym;
	private String operatorCode;
	private Date inputDate;
	private Date underwriteendDate;
	private String underwriteFlag;
	private String remark;
	private String flag;
	private String caseType;
	private BigDecimal indemnityDutyrate;
	private String indemnityDuty;
	private String finallyFlag;
	private String result;
	private Date endcaseDate;
	private Date underwriteendTime;
	private String recoveryorpayflagCode;
	private String recoveryorpayflagName;
	private String paycomCode;
	private String tlossFlag;
	private String claimdealType;
	private String accidentpartiesType;
	private String damageCode;
	private String damageName;
	private String litigationFlag;

	protected PrploldCompensateVoBase() {

	}

	public String getCompensateNo() {
		return this.compensateNo;
	}

	public void setCompensateNo(String compensateNo) {
		this.compensateNo = compensateNo;
	}

	public String getLflag() {
		return this.lflag;
	}

	public void setLflag(String lflag) {
		this.lflag = lflag;
	}

	public String getCaseNo() {
		return this.caseNo;
	}

	public void setCaseNo(String caseNo) {
		this.caseNo = caseNo;
	}

	public BigDecimal getTimes() {
		return this.times;
	}

	public void setTimes(BigDecimal times) {
		this.times = times;
	}

	public String getClassCode() {
		return this.classCode;
	}

	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}

	public String getRiskCode() {
		return this.riskCode;
	}

	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}

	public String getClaimNo() {
		return this.claimNo;
	}

	public void setClaimNo(String claimNo) {
		this.claimNo = claimNo;
	}

	public String getPolicyNo() {
		return this.policyNo;
	}

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	public String getDeductCond() {
		return this.deductCond;
	}

	public void setDeductCond(String deductCond) {
		this.deductCond = deductCond;
	}

	public Date getPreserveDate() {
		return this.preserveDate;
	}

	public void setPreserveDate(Date preserveDate) {
		this.preserveDate = preserveDate;
	}

	public String getCheckagentCode() {
		return this.checkagentCode;
	}

	public void setCheckagentCode(String checkagentCode) {
		this.checkagentCode = checkagentCode;
	}

	public String getCheckagentName() {
		return this.checkagentName;
	}

	public void setCheckagentName(String checkagentName) {
		this.checkagentName = checkagentName;
	}

	public String getSurveyorName() {
		return this.surveyorName;
	}

	public void setSurveyorName(String surveyorName) {
		this.surveyorName = surveyorName;
	}

	public String getCounterclaimerName() {
		return this.counterclaimerName;
	}

	public void setCounterclaimerName(String counterclaimerName) {
		this.counterclaimerName = counterclaimerName;
	}

	public String getDutydeScription() {
		return this.dutydeScription;
	}

	public void setDutydeScription(String dutydeScription) {
		this.dutydeScription = dutydeScription;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public BigDecimal getSumLoss() {
		return this.sumLoss;
	}

	public void setSumLoss(BigDecimal sumLoss) {
		this.sumLoss = sumLoss;
	}

	public BigDecimal getSumRest() {
		return this.sumRest;
	}

	public void setSumRest(BigDecimal sumRest) {
		this.sumRest = sumRest;
	}

	public BigDecimal getSumdutyPaid() {
		return this.sumdutyPaid;
	}

	public void setSumdutyPaid(BigDecimal sumdutyPaid) {
		this.sumdutyPaid = sumdutyPaid;
	}

	public BigDecimal getSumnodutyFee() {
		return this.sumnodutyFee;
	}

	public void setSumnodutyFee(BigDecimal sumnodutyFee) {
		this.sumnodutyFee = sumnodutyFee;
	}

	public BigDecimal getSumPaid() {
		return this.sumPaid;
	}

	public void setSumPaid(BigDecimal sumPaid) {
		this.sumPaid = sumPaid;
	}

	public BigDecimal getSumprePaid() {
		return this.sumprePaid;
	}

	public void setSumprePaid(BigDecimal sumprePaid) {
		this.sumprePaid = sumprePaid;
	}

	public BigDecimal getSumthisPaid() {
		return this.sumthisPaid;
	}

	public void setSumthisPaid(BigDecimal sumthisPaid) {
		this.sumthisPaid = sumthisPaid;
	}

	public String getReceiverName() {
		return this.receiverName;
	}

	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	public String getBank() {
		return this.bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getAccount() {
		return this.account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getMakeCom() {
		return this.makeCom;
	}

	public void setMakeCom(String makeCom) {
		this.makeCom = makeCom;
	}

	public String getComCode() {
		return this.comCode;
	}

	public void setComCode(String comCode) {
		this.comCode = comCode;
	}

	public String getHandlerCode() {
		return this.handlerCode;
	}

	public void setHandlerCode(String handlerCode) {
		this.handlerCode = handlerCode;
	}

	public String getHandler1Code() {
		return this.handler1Code;
	}

	public void setHandler1Code(String handler1Code) {
		this.handler1Code = handler1Code;
	}

	public String getApproverCode() {
		return this.approverCode;
	}

	public void setApproverCode(String approverCode) {
		this.approverCode = approverCode;
	}

	public String getUnderwriteCode() {
		return this.underwriteCode;
	}

	public void setUnderwriteCode(String underwriteCode) {
		this.underwriteCode = underwriteCode;
	}

	public String getUnderwriteName() {
		return this.underwriteName;
	}

	public void setUnderwriteName(String underwriteName) {
		this.underwriteName = underwriteName;
	}

	public Date getStatiSticsym() {
		return this.statiSticsym;
	}

	public void setStatiSticsym(Date statiSticsym) {
		this.statiSticsym = statiSticsym;
	}

	public String getOperatorCode() {
		return this.operatorCode;
	}

	public void setOperatorCode(String operatorCode) {
		this.operatorCode = operatorCode;
	}

	public Date getInputDate() {
		return this.inputDate;
	}

	public void setInputDate(Date inputDate) {
		this.inputDate = inputDate;
	}

	public Date getUnderwriteendDate() {
		return this.underwriteendDate;
	}

	public void setUnderwriteendDate(Date underwriteendDate) {
		this.underwriteendDate = underwriteendDate;
	}

	public String getUnderwriteFlag() {
		return this.underwriteFlag;
	}

	public void setUnderwriteFlag(String underwriteFlag) {
		this.underwriteFlag = underwriteFlag;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getCaseType() {
		return this.caseType;
	}

	public void setCaseType(String caseType) {
		this.caseType = caseType;
	}

	public BigDecimal getIndemnityDutyrate() {
		return this.indemnityDutyrate;
	}

	public void setIndemnityDutyrate(BigDecimal indemnityDutyrate) {
		this.indemnityDutyrate = indemnityDutyrate;
	}

	public String getIndemnityDuty() {
		return this.indemnityDuty;
	}

	public void setIndemnityDuty(String indemnityDuty) {
		this.indemnityDuty = indemnityDuty;
	}

	public String getFinallyFlag() {
		return this.finallyFlag;
	}

	public void setFinallyFlag(String finallyFlag) {
		this.finallyFlag = finallyFlag;
	}

	public String getResult() {
		return this.result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public Date getEndcaseDate() {
		return this.endcaseDate;
	}

	public void setEndcaseDate(Date endcaseDate) {
		this.endcaseDate = endcaseDate;
	}

	public Date getUnderwriteendTime() {
		return this.underwriteendTime;
	}

	public void setUnderwriteendTime(Date underwriteendTime) {
		this.underwriteendTime = underwriteendTime;
	}

	public String getRecoveryorpayflagCode() {
		return this.recoveryorpayflagCode;
	}

	public void setRecoveryorpayflagCode(String recoveryorpayflagCode) {
		this.recoveryorpayflagCode = recoveryorpayflagCode;
	}

	public String getRecoveryorpayflagName() {
		return this.recoveryorpayflagName;
	}

	public void setRecoveryorpayflagName(String recoveryorpayflagName) {
		this.recoveryorpayflagName = recoveryorpayflagName;
	}

	public String getPaycomCode() {
		return this.paycomCode;
	}

	public void setPaycomCode(String paycomCode) {
		this.paycomCode = paycomCode;
	}

	public String getTlossFlag() {
		return this.tlossFlag;
	}

	public void setTlossFlag(String tlossFlag) {
		this.tlossFlag = tlossFlag;
	}

	public String getClaimdealType() {
		return this.claimdealType;
	}

	public void setClaimdealType(String claimdealType) {
		this.claimdealType = claimdealType;
	}

	public String getAccidentpartiesType() {
		return this.accidentpartiesType;
	}

	public void setAccidentpartiesType(String accidentpartiesType) {
		this.accidentpartiesType = accidentpartiesType;
	}

	public String getDamageCode() {
		return this.damageCode;
	}

	public void setDamageCode(String damageCode) {
		this.damageCode = damageCode;
	}

	public String getDamageName() {
		return this.damageName;
	}

	public void setDamageName(String damageName) {
		this.damageName = damageName;
	}

	public String getLitigationFlag() {
		return this.litigationFlag;
	}

	public void setLitigationFlag(String litigationFlag) {
		this.litigationFlag = litigationFlag;
	}
}