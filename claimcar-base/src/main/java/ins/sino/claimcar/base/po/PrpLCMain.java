package ins.sino.claimcar.base.po;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * POJO Class PrpLCMain
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Table(name = "PRPLCMAIN")
public class PrpLCMain implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String registNo;
	private String claimNo;
	private String policyNo;
	private String groupID;
	private String groupName;
	private String classCode;
	private String riskCode;
	private String proposalNo;
	private String contractNo;
	private String policySort;
	private String printNo;
	private String businessNature;
	private String language;
	private String policyType;
	private String appliCode;
	private String appliName;
	private String appliAddress;
	private String insuredCode;
	private String insuredName;
	private String insuredAddress;
	private Date operateDate;
	private Date startDate;
	private Long startHour;
	private Date endDate;
	private Long endHour;
	private BigDecimal pureRate;
	private BigDecimal disRate;
	private BigDecimal discount;
	private String currency;
	private BigDecimal sumValue;
	private BigDecimal sumAmount;
	private BigDecimal sumDiscount;
	private BigDecimal sumPremium;
	private BigDecimal sumSubprem;
	private BigDecimal sumQuantity;
	private String judicalScope;
	private String autoTransRenewFlag;
	private String argueSolution;
	private String arbitBoardName;
	private BigDecimal payTimes;
	private BigDecimal endorseTimes;
	private BigDecimal registTimes;
	private BigDecimal claimTimes;
	private BigDecimal sumClaim;
	private String makeCom;
	private String operateSite;
	private String comCode;
	private String handlerCode;
	private String handler1Code;
	private String approverCode;
	private String underWriteCode;
	private String underWriteName;
	private String operatorCode;
	private Date inputDate;
	private BigDecimal inputHour;
	private Date underWriteEndDate;
	private Date statisticsYm;
	private String agentCode;
	private String coinsFlag;
	private String reinsFlag;
	private String allinsFlag;
	private String underWriteFlag;
	private String othFlag;
	private String validFlag;
	private String judicalCode;
	private BigDecimal disrate1;
	private String businessFlag;
	private String updaterCode;
	private Date updateDate;
	private String updateHour;
	private Date signDate;
	private String agreementNo;
	private String inquiryNo;
	private String payMode;
	private String shareHolderFlag;
	private String visaCode;
	private String manualType;
	private String nationFlag;
	private String jfeeFlag;
	private Date precheckDate;
	private String handlerName;
	private String handler1Name;
	private String payrefCode;
	private String payrefName;
	private Date payrefTime;
	private Date printTime;
	private String agriNature;
	private String serviceProviders;
	private String serviceType;
	private String services;
	private String billingWay;
	private String businessChannel;
	private String businessAgentType;
	private String uniteAgentChannel;
	private String currency1;
	private String currency2;
	private String twoAvoid;
	private String busiNatureNo;
	private String renewal;
	private String businessPlate;
	private String stockHolderCode;
	private String stockHolderName;
	private String farmFlag;
	private String otherBusinessFlag;
	private String businessClass;
	private BigDecimal peccancyCoeff;
	private BigDecimal claimCoeff;
	private String rateFloatFlag;
	private String agentName;
	private String flag;
	private String remark;
	private String createUser;
	private Date createTime;
	private String updateUser;
	private Date updateTime;
	private String validNo;
	private String endorseNo;
	private String serviceMobile;//修理厂手机号码
	private String isTwentyFlag; //2020条款交强险标志
	@Id
	@SequenceGenerator(name="sequence",sequenceName="SEQ_PRPLCMAIN",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="sequence")
	@Column(name = "ID", unique = true, nullable = false, scale=0)
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

	@Column(name = "CLAIMNO", length=22)
	public String getClaimNo() {
		return this.claimNo;
	}

	public void setClaimNo(String claimNo) {
		this.claimNo = claimNo;
	}

	@Column(name = "POLICYNO", nullable = false, length=22)
	public String getPolicyNo() {
		return this.policyNo;
	}

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	@Column(name = "GROUPID", length=22)
	public String getGroupID() {
		return this.groupID;
	}

	public void setGroupID(String groupID) {
		this.groupID = groupID;
	}

	@Column(name = "GROUPNAME", length=22)
	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	@Column(name = "CLASSCODE", nullable = false, length=3)
	public String getClassCode() {
		return this.classCode;
	}

	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}

	@Column(name = "RISKCODE", nullable = false, length=4)
	public String getRiskCode() {
		return this.riskCode;
	}

	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}

	@Column(name = "PROPOSALNO", length=22)
	public String getProposalNo() {
		return this.proposalNo;
	}

	public void setProposalNo(String proposalNo) {
		this.proposalNo = proposalNo;
	}

	@Column(name = "CONTRACTNO", length=22)
	public String getContractNo() {
		return this.contractNo;
	}

	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	@Column(name = "POLICYSORT", nullable = false, length=2)
	public String getPolicySort() {
		return this.policySort;
	}

	public void setPolicySort(String policySort) {
		this.policySort = policySort;
	}

	@Column(name = "PRINTNO", length=50)
	public String getPrintNo() {
		return this.printNo;
	}

	public void setPrintNo(String printNo) {
		this.printNo = printNo;
	}

	@Column(name = "BUSINESSNATURE", nullable = false, length=8)
	public String getBusinessNature() {
		return this.businessNature;
	}

	public void setBusinessNature(String businessNature) {
		this.businessNature = businessNature;
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

	@Column(name = "APPLICODE", length=20)
	public String getAppliCode() {
		return this.appliCode;
	}

	public void setAppliCode(String appliCode) {
		this.appliCode = appliCode;
	}

	@Column(name = "APPLINAME", length=512)
	public String getAppliName() {
		return this.appliName;
	}

	public void setAppliName(String appliName) {
		this.appliName = appliName;
	}

	@Column(name = "APPLIADDRESS")
	public String getAppliAddress() {
		return this.appliAddress;
	}

	public void setAppliAddress(String appliAddress) {
		this.appliAddress = appliAddress;
	}

	@Column(name = "INSUREDCODE", length=20)
	public String getInsuredCode() {
		return this.insuredCode;
	}

	public void setInsuredCode(String insuredCode) {
		this.insuredCode = insuredCode;
	}

	@Column(name = "INSUREDNAME", length=320)
	public String getInsuredName() {
		return this.insuredName;
	}

	public void setInsuredName(String insuredName) {
		this.insuredName = insuredName;
	}

	@Column(name = "INSUREDADDRESS")
	public String getInsuredAddress() {
		return this.insuredAddress;
	}

	public void setInsuredAddress(String insuredAddress) {
		this.insuredAddress = insuredAddress;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "OPERATEDATE", length=7)
	public Date getOperateDate() {
		return this.operateDate;
	}

	public void setOperateDate(Date operateDate) {
		this.operateDate = operateDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "STARTDATE", length=7)
	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	@Column(name = "STARTHOUR", precision=15, scale=0)
	public Long getStartHour() {
		return this.startHour;
	}

	public void setStartHour(Long startHour) {
		this.startHour = startHour;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ENDDATE", length=7)
	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	@Column(name = "ENDHOUR", precision=15, scale=0)
	public Long getEndHour() {
		return this.endHour;
	}

	public void setEndHour(Long endHour) {
		this.endHour = endHour;
	}

	@Column(name = "PURERATE", precision=8, scale=4)
	public BigDecimal getPureRate() {
		return this.pureRate;
	}

	public void setPureRate(BigDecimal pureRate) {
		this.pureRate = pureRate;
	}

	@Column(name = "DISRATE", precision=8, scale=4)
	public BigDecimal getDisRate() {
		return this.disRate;
	}

	public void setDisRate(BigDecimal disRate) {
		this.disRate = disRate;
	}

	@Column(name = "DISCOUNT", precision=8, scale=4)
	public BigDecimal getDiscount() {
		return this.discount;
	}

	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}

	@Column(name = "CURRENCY", length=3)
	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	@Column(name = "SUMVALUE", precision=14)
	public BigDecimal getSumValue() {
		return this.sumValue;
	}

	public void setSumValue(BigDecimal sumValue) {
		this.sumValue = sumValue;
	}

	@Column(name = "SUMAMOUNT", precision=14)
	public BigDecimal getSumAmount() {
		return this.sumAmount;
	}

	public void setSumAmount(BigDecimal sumAmount) {
		this.sumAmount = sumAmount;
	}

	@Column(name = "SUMDISCOUNT", precision=14)
	public BigDecimal getSumDiscount() {
		return this.sumDiscount;
	}

	public void setSumDiscount(BigDecimal sumDiscount) {
		this.sumDiscount = sumDiscount;
	}

	@Column(name = "SUMPREMIUM", precision=14)
	public BigDecimal getSumPremium() {
		return this.sumPremium;
	}

	public void setSumPremium(BigDecimal sumPremium) {
		this.sumPremium = sumPremium;
	}

	@Column(name = "SUMSUBPREM", precision=14)
	public BigDecimal getSumSubprem() {
		return this.sumSubprem;
	}

	public void setSumSubprem(BigDecimal sumSubprem) {
		this.sumSubprem = sumSubprem;
	}

	@Column(name = "SUMQUANTITY", scale=0)
	public BigDecimal getSumQuantity() {
		return this.sumQuantity;
	}

	public void setSumQuantity(BigDecimal sumQuantity) {
		this.sumQuantity = sumQuantity;
	}

	@Column(name = "JUDICALSCOPE")
	public String getJudicalScope() {
		return this.judicalScope;
	}

	public void setJudicalScope(String judicalScope) {
		this.judicalScope = judicalScope;
	}

	@Column(name = "AUTOTRANSRENEWFLAG", length=1)
	public String getAutoTransRenewFlag() {
		return this.autoTransRenewFlag;
	}

	public void setAutoTransRenewFlag(String autoTransRenewFlag) {
		this.autoTransRenewFlag = autoTransRenewFlag;
	}

	@Column(name = "ARGUESOLUTION", length=1)
	public String getArgueSolution() {
		return this.argueSolution;
	}

	public void setArgueSolution(String argueSolution) {
		this.argueSolution = argueSolution;
	}

	@Column(name = "ARBITBOARDNAME", length=60)
	public String getArbitBoardName() {
		return this.arbitBoardName;
	}

	public void setArbitBoardName(String arbitBoardName) {
		this.arbitBoardName = arbitBoardName;
	}

	@Column(name = "PAYTIMES", scale=0)
	public BigDecimal getPayTimes() {
		return this.payTimes;
	}

	public void setPayTimes(BigDecimal payTimes) {
		this.payTimes = payTimes;
	}

	@Column(name = "ENDORSETIMES", scale=0)
	public BigDecimal getEndorseTimes() {
		return this.endorseTimes;
	}

	public void setEndorseTimes(BigDecimal endorseTimes) {
		this.endorseTimes = endorseTimes;
	}

	@Column(name = "REGISTTIMES", scale=0)
	public BigDecimal getRegistTimes() {
		return this.registTimes;
	}

	public void setRegistTimes(BigDecimal registTimes) {
		this.registTimes = registTimes;
	}

	@Column(name = "CLAIMTIMES", scale=0)
	public BigDecimal getClaimTimes() {
		return this.claimTimes;
	}

	public void setClaimTimes(BigDecimal claimTimes) {
		this.claimTimes = claimTimes;
	}

	@Column(name = "SUMCLAIM", precision=14)
	public BigDecimal getSumClaim() {
		return this.sumClaim;
	}

	public void setSumClaim(BigDecimal sumClaim) {
		this.sumClaim = sumClaim;
	}

	@Column(name = "MAKECOM", nullable = false, length=8)
	public String getMakeCom() {
		return this.makeCom;
	}

	public void setMakeCom(String makeCom) {
		this.makeCom = makeCom;
	}

	@Column(name = "OPERATESITE", length=60)
	public String getOperateSite() {
		return this.operateSite;
	}

	public void setOperateSite(String operateSite) {
		this.operateSite = operateSite;
	}

	@Column(name = "COMCODE", nullable = false, length=8)
	public String getComCode() {
		return this.comCode;
	}

	public void setComCode(String comCode) {
		this.comCode = comCode;
	}

	@Column(name = "HANDLERCODE", nullable = false, length=10)
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
	public String getUnderWriteCode() {
		return this.underWriteCode;
	}

	public void setUnderWriteCode(String underWriteCode) {
		this.underWriteCode = underWriteCode;
	}

	@Column(name = "UNDERWRITENAME", length=20)
	public String getUnderWriteName() {
		return this.underWriteName;
	}

	public void setUnderWriteName(String underWriteName) {
		this.underWriteName = underWriteName;
	}

	@Column(name = "OPERATORCODE", nullable = false, length=10)
	public String getOperatorCode() {
		return this.operatorCode;
	}

	public void setOperatorCode(String operatorCode) {
		this.operatorCode = operatorCode;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "INPUTDATE", length=7)
	public Date getInputDate() {
		return this.inputDate;
	}

	public void setInputDate(Date inputDate) {
		this.inputDate = inputDate;
	}

	@Column(name = "INPUTHOUR", scale=0)
	public BigDecimal getInputHour() {
		return this.inputHour;
	}

	public void setInputHour(BigDecimal inputHour) {
		this.inputHour = inputHour;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UNDERWRITEENDDATE", length=7)
	public Date getUnderWriteEndDate() {
		return this.underWriteEndDate;
	}

	public void setUnderWriteEndDate(Date underWriteEndDate) {
		this.underWriteEndDate = underWriteEndDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "STATISTICSYM", length=7)
	public Date getStatisticsYm() {
		return this.statisticsYm;
	}

	public void setStatisticsYm(Date statisticsYm) {
		this.statisticsYm = statisticsYm;
	}

	@Column(name = "AGENTCODE", length=30)
	public String getAgentCode() {
		return this.agentCode;
	}

	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}

	@Column(name = "COINSFLAG", length=1)
	public String getCoinsFlag() {
		return this.coinsFlag;
	}

	public void setCoinsFlag(String coinsFlag) {
		this.coinsFlag = coinsFlag;
	}

	@Column(name = "REINSFLAG", length=10)
	public String getReinsFlag() {
		return this.reinsFlag;
	}

	public void setReinsFlag(String reinsFlag) {
		this.reinsFlag = reinsFlag;
	}

	@Column(name = "ALLINSFLAG", length=1)
	public String getAllinsFlag() {
		return this.allinsFlag;
	}

	public void setAllinsFlag(String allinsFlag) {
		this.allinsFlag = allinsFlag;
	}

	@Column(name = "UNDERWRITEFLAG", length=1)
	public String getUnderWriteFlag() {
		return this.underWriteFlag;
	}

	public void setUnderWriteFlag(String underWriteFlag) {
		this.underWriteFlag = underWriteFlag;
	}

	@Column(name = "OTHFLAG", length=20)
	public String getOthFlag() {
		return this.othFlag;
	}

	public void setOthFlag(String othFlag) {
		this.othFlag = othFlag;
	}

	@Column(name = "VALIDFLAG", length=1)
	public String getValidFlag() {
		return this.validFlag;
	}

	public void setValidFlag(String validFlag) {
		this.validFlag = validFlag;
	}

	@Column(name = "JUDICALCODE", length=1)
	public String getJudicalCode() {
		return this.judicalCode;
	}

	public void setJudicalCode(String judicalCode) {
		this.judicalCode = judicalCode;
	}

	@Column(name = "DISRATE1", precision=8, scale=4)
	public BigDecimal getDisrate1() {
		return this.disrate1;
	}

	public void setDisrate1(BigDecimal disrate1) {
		this.disrate1 = disrate1;
	}

	@Column(name = "BUSINESSFLAG", length=1)
	public String getBusinessFlag() {
		return this.businessFlag;
	}

	public void setBusinessFlag(String businessFlag) {
		this.businessFlag = businessFlag;
	}

	@Column(name = "UPDATERCODE", length=10)
	public String getUpdaterCode() {
		return this.updaterCode;
	}

	public void setUpdaterCode(String updaterCode) {
		this.updaterCode = updaterCode;
	}

	@Temporal(TemporalType.TIMESTAMP)
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

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "SIGNDATE", length=7)
	public Date getSignDate() {
		return this.signDate;
	}

	public void setSignDate(Date signDate) {
		this.signDate = signDate;
	}

	@Column(name = "AGREEMENTNO", length=30)
	public String getAgreementNo() {
		return this.agreementNo;
	}

	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	@Column(name = "INQUIRYNO", length=22)
	public String getInquiryNo() {
		return this.inquiryNo;
	}

	public void setInquiryNo(String inquiryNo) {
		this.inquiryNo = inquiryNo;
	}

	@Column(name = "PAYMODE", length=1)
	public String getPayMode() {
		return this.payMode;
	}

	public void setPayMode(String payMode) {
		this.payMode = payMode;
	}

	@Column(name = "SHAREHOLDERFLAG", length=1)
	public String getShareHolderFlag() {
		return this.shareHolderFlag;
	}

	public void setShareHolderFlag(String shareHolderFlag) {
		this.shareHolderFlag = shareHolderFlag;
	}

	@Column(name = "VISACODE", length=20)
	public String getVisaCode() {
		return this.visaCode;
	}

	public void setVisaCode(String visaCode) {
		this.visaCode = visaCode;
	}

	@Column(name = "MANUALTYPE", length=1)
	public String getManualType() {
		return this.manualType;
	}

	public void setManualType(String manualType) {
		this.manualType = manualType;
	}

	@Column(name = "NATIONFLAG", length=5)
	public String getNationFlag() {
		return this.nationFlag;
	}

	public void setNationFlag(String nationFlag) {
		this.nationFlag = nationFlag;
	}

	@Column(name = "JFEEFLAG", length=1)
	public String getJfeeFlag() {
		return this.jfeeFlag;
	}

	public void setJfeeFlag(String jfeeFlag) {
		this.jfeeFlag = jfeeFlag;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "PRECHECKDATE", length=7)
	public Date getPrecheckDate() {
		return this.precheckDate;
	}

	public void setPrecheckDate(Date precheckDate) {
		this.precheckDate = precheckDate;
	}

	@Column(name = "HANDLERNAME", length=20)
	public String getHandlerName() {
		return this.handlerName;
	}

	public void setHandlerName(String handlerName) {
		this.handlerName = handlerName;
	}

	@Column(name = "HANDLER1NAME", length=20)
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

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "PAYREFTIME", length=7)
	public Date getPayrefTime() {
		return this.payrefTime;
	}

	public void setPayrefTime(Date payrefTime) {
		this.payrefTime = payrefTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "PRINTTIME", length=7)
	public Date getPrintTime() {
		return this.printTime;
	}

	public void setPrintTime(Date printTime) {
		this.printTime = printTime;
	}

	@Column(name = "AGRINATURE", length=20)
	public String getAgriNature() {
		return this.agriNature;
	}

	public void setAgriNature(String agriNature) {
		this.agriNature = agriNature;
	}

	@Column(name = "SERVICEPROVIDERS", length=20)
	public String getServiceProviders() {
		return this.serviceProviders;
	}

	public void setServiceProviders(String serviceProviders) {
		this.serviceProviders = serviceProviders;
	}

	@Column(name = "SERVICETYPE", length=20)
	public String getServiceType() {
		return this.serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	@Column(name = "SERVICES", length=20)
	public String getServices() {
		return this.services;
	}

	public void setServices(String services) {
		this.services = services;
	}

	@Column(name = "BILLINGWAY", length=20)
	public String getBillingWay() {
		return this.billingWay;
	}

	public void setBillingWay(String billingWay) {
		this.billingWay = billingWay;
	}

	@Column(name = "BUSINESSCHANNEL", length=8)
	public String getBusinessChannel() {
		return this.businessChannel;
	}

	public void setBusinessChannel(String businessChannel) {
		this.businessChannel = businessChannel;
	}

	@Column(name = "BUSINESSAGENTTYPE", length=8)
	public String getBusinessAgentType() {
		return this.businessAgentType;
	}

	public void setBusinessAgentType(String businessAgentType) {
		this.businessAgentType = businessAgentType;
	}

	@Column(name = "UNITEAGENTCHANNEL", length=8)
	public String getUniteAgentChannel() {
		return this.uniteAgentChannel;
	}

	public void setUniteAgentChannel(String uniteAgentChannel) {
		this.uniteAgentChannel = uniteAgentChannel;
	}

	@Column(name = "CURRENCY1", length=3)
	public String getCurrency1() {
		return this.currency1;
	}

	public void setCurrency1(String currency1) {
		this.currency1 = currency1;
	}

	@Column(name = "CURRENCY2", length=3)
	public String getCurrency2() {
		return this.currency2;
	}

	public void setCurrency2(String currency2) {
		this.currency2 = currency2;
	}

	@Column(name = "TWOAVOID", length=1)
	public String getTwoAvoid() {
		return this.twoAvoid;
	}

	public void setTwoAvoid(String twoAvoid) {
		this.twoAvoid = twoAvoid;
	}

	@Column(name = "BUSINATURENO", length=30)
	public String getBusiNatureNo() {
		return this.busiNatureNo;
	}

	public void setBusiNatureNo(String busiNatureNo) {
		this.busiNatureNo = busiNatureNo;
	}

	@Column(name = "RENEWAL", length=1)
	public String getRenewal() {
		return this.renewal;
	}

	public void setRenewal(String renewal) {
		this.renewal = renewal;
	}

	@Column(name = "BUSINESSPLATE", length=1)
	public String getBusinessPlate() {
		return this.businessPlate;
	}

	public void setBusinessPlate(String businessPlate) {
		this.businessPlate = businessPlate;
	}

	@Column(name = "STOCKHOLDERCODE", length=30)
	public String getStockHolderCode() {
		return this.stockHolderCode;
	}

	public void setStockHolderCode(String stockHolderCode) {
		this.stockHolderCode = stockHolderCode;
	}

	@Column(name = "STOCKHOLDERNAME", length=50)
	public String getStockHolderName() {
		return this.stockHolderName;
	}

	public void setStockHolderName(String stockHolderName) {
		this.stockHolderName = stockHolderName;
	}

	@Column(name = "FARMFLAG", length=10)
	public String getFarmFlag() {
		return this.farmFlag;
	}

	public void setFarmFlag(String farmFlag) {
		this.farmFlag = farmFlag;
	}

	@Column(name = "OTHERBUSINESSFLAG", length=10)
	public String getOtherBusinessFlag() {
		return this.otherBusinessFlag;
	}

	public void setOtherBusinessFlag(String otherBusinessFlag) {
		this.otherBusinessFlag = otherBusinessFlag;
	}

	@Column(name = "BUSINESSCLASS", length=2)
	public String getBusinessClass() {
		return this.businessClass;
	}

	public void setBusinessClass(String businessClass) {
		this.businessClass = businessClass;
	}

	@Column(name = "PECCANCYCOEFF", precision=14)
	public BigDecimal getPeccancyCoeff() {
		return this.peccancyCoeff;
	}

	public void setPeccancyCoeff(BigDecimal peccancyCoeff) {
		this.peccancyCoeff = peccancyCoeff;
	}

	@Column(name = "CLAIMCOEFF", precision=14)
	public BigDecimal getClaimCoeff() {
		return this.claimCoeff;
	}

	public void setClaimCoeff(BigDecimal claimCoeff) {
		this.claimCoeff = claimCoeff;
	}

	@Column(name = "RATEFLOATFLAG", length=4)
	public String getRateFloatFlag() {
		return this.rateFloatFlag;
	}

	public void setRateFloatFlag(String rateFloatFlag) {
		this.rateFloatFlag = rateFloatFlag;
	}

	@Column(name = "AGENTNAME", length=120)
	public String getAgentName() {
		return this.agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
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

	@Column(name = "ENDORSENO", nullable = false, length=24)
	public String getEndorseNo() {
		return endorseNo;
	}

	public void setEndorseNo(String endorseNo) {
		this.endorseNo = endorseNo;
	}

	@Column(name = "VALIDNO", length=50)
	public String getValidNo() {
		return validNo;
	}

	
	public void setValidNo(String validNo) {
		this.validNo = validNo;
	}

	@Column(name = "SERVICEMOBILE", length=20)
	public String getServiceMobile() {
		return serviceMobile;
	}

	public void setServiceMobile(String serviceMobile) {
		this.serviceMobile = serviceMobile;
	}

	@Column(name = "ISTWENTYFLAG", length=2)
	public String getIsTwentyFlag() {
		return isTwentyFlag;
	}

	public void setIsTwentyFlag(String isTwentyFlag) {
		this.isTwentyFlag = isTwentyFlag;
	}
	
	
}
