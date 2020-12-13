package ins.sino.claimcar.regist.vo;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * Vo Base Class of PO PrpLTmpCMain
 */ 
public class PrpLTmpCMainVoBase implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String registNo;
	private String claimNo;
	private String policyNo;
	private String classCode;
	private String riskCode;
	private String policySort;
	private String policyType;
	private String businessNature;
	private String appliCode;
	private String appliName;
	private String appliAddress;
	private String insuredCode;
	private String insuredName;
	private String insuredAddress;
	private Date startTime;
	private Date endTime;
	private String currency;
	private BigDecimal sumValue;
	private BigDecimal sumAmount;
	private BigDecimal sumPremium;
	private BigDecimal sumSubprem;
	private Long sumQuantity;
	private String makeCom;
	private String comCode;
	private String handlerCode;
	private String operatorCode;
	private String validFlag;
	private String twoAvoid;
	private String tempPolicyRemark;
	private String flag;
	private String remark;
	private String createUser;
	private Date createTime;
	private String updateUser;
	private Date updateTime;
	private List<PrpLTmpCItemCarVo> prpCItemCars = new ArrayList<PrpLTmpCItemCarVo>(0);
	private List<PrpLTmpCItemKindVo> prpCItemKinds = new ArrayList<PrpLTmpCItemKindVo>(0);

    protected PrpLTmpCMainVoBase() {
	
    }

    
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRegistNo() {
		return this.registNo;
	}

	public void setRegistNo(String registNo) {
		this.registNo = registNo;
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

	public String getPolicySort() {
		return this.policySort;
	}

	public void setPolicySort(String policySort) {
		this.policySort = policySort;
	}

	public String getPolicyType() {
		return this.policyType;
	}

	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}
	
	public String getBusinessNature() {
		return this.businessNature;
	}

	public void setBusinessNature(String businessNature) {
		this.businessNature = businessNature;
	}

	public String getAppliCode() {
		return this.appliCode;
	}

	public void setAppliCode(String appliCode) {
		this.appliCode = appliCode;
	}

	public String getAppliName() {
		return this.appliName;
	}

	public void setAppliName(String appliName) {
		this.appliName = appliName;
	}

	public String getAppliAddress() {
		return this.appliAddress;
	}

	public void setAppliAddress(String appliAddress) {
		this.appliAddress = appliAddress;
	}

	public String getInsuredCode() {
		return this.insuredCode;
	}

	public void setInsuredCode(String insuredCode) {
		this.insuredCode = insuredCode;
	}

	public String getInsuredName() {
		return this.insuredName;
	}

	public void setInsuredName(String insuredName) {
		this.insuredName = insuredName;
	}

	public String getInsuredAddress() {
		return this.insuredAddress;
	}

	public void setInsuredAddress(String insuredAddress) {
		this.insuredAddress = insuredAddress;
	}

	public Date getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public BigDecimal getSumValue() {
		return this.sumValue;
	}

	public void setSumValue(BigDecimal sumValue) {
		this.sumValue = sumValue;
	}

	public BigDecimal getSumAmount() {
		return this.sumAmount;
	}

	public void setSumAmount(BigDecimal sumAmount) {
		this.sumAmount = sumAmount;
	}

	public BigDecimal getSumPremium() {
		return this.sumPremium;
	}

	public void setSumPremium(BigDecimal sumPremium) {
		this.sumPremium = sumPremium;
	}

	public BigDecimal getSumSubprem() {
		return this.sumSubprem;
	}

	public void setSumSubprem(BigDecimal sumSubprem) {
		this.sumSubprem = sumSubprem;
	}

	public Long getSumQuantity() {
		return this.sumQuantity;
	}

	public void setSumQuantity(Long sumQuantity) {
		this.sumQuantity = sumQuantity;
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

	public String getOperatorCode() {
		return this.operatorCode;
	}

	public void setOperatorCode(String operatorCode) {
		this.operatorCode = operatorCode;
	}

	public String getValidFlag() {
		return this.validFlag;
	}

	public void setValidFlag(String validFlag) {
		this.validFlag = validFlag;
	}

	public String getTwoAvoid() {
		return this.twoAvoid;
	}

	public void setTwoAvoid(String twoAvoid) {
		this.twoAvoid = twoAvoid;
	}

	public String getTempPolicyRemark() {
		return this.tempPolicyRemark;
	}

	public void setTempPolicyRemark(String tempPolicyRemark) {
		this.tempPolicyRemark = tempPolicyRemark;
	}

	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getCreateUser() {
		return this.createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getUpdateUser() {
		return this.updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public List<PrpLTmpCItemCarVo> getPrpCItemCars() {
		return this.prpCItemCars;
	}

	public void setPrpCItemCars(List<PrpLTmpCItemCarVo> prpCItemCars) {
		this.prpCItemCars = prpCItemCars;
	}

	public List<PrpLTmpCItemKindVo> getPrpCItemKinds() {
		return this.prpCItemKinds;
	}

	public void setPrpCItemKinds(List<PrpLTmpCItemKindVo> prpCItemKinds) {
		this.prpCItemKinds = prpCItemKinds;
	}
}
