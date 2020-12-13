package ins.sino.claimcar.lossperson.vo;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * Vo Base Class of PO PrpLDlossPersInjured
 */ 
public class PrpLDlossPersInjuredVoBase implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String registNo;
	private Long thirdPartyId;
	private String riskCode;
	private String treatSituation;
	private String personName;
	private Long personId;
	private String certiType;
	private String certiCode;
	private String lossItemType;
	private String phoneNumber;
	private BigDecimal personAge;
	private String personSex;
	private String ticCode;
	private String ticName;
	private String income;
	private String domicile;
	private String woundCode;
	private String licenseNo;
	private String injuryPart;
	private Date inputTime;
	private String remark;
	private String flag;
	private String validFlag;
	private String createUser;
	private Date createTime;
	private String updateUser;
	private Date updateTime;
	private Date deathTime;
	private String chkComCode;
	private String chkComName;
	private Integer serialNo;
	private String appraisaCity;
	private String idClmChannelProcess;//平安通道号

	private List<PrpLDlossPersExtVo> prpLDlossPersExts = new ArrayList<PrpLDlossPersExtVo>(0);
	private List<PrpLDlossPersNurseVo> prpLDlossPersNurses = new ArrayList<PrpLDlossPersNurseVo>(0);
	private List<PrpLDlossPersHospitalVo> prpLDlossPersHospitals = new ArrayList<PrpLDlossPersHospitalVo>(0);
	private List<PrpLDlossPersRaiseVo> prpLDlossPersRaises = new ArrayList<PrpLDlossPersRaiseVo>(0);

    protected PrpLDlossPersInjuredVoBase() {
	
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

	public Long getThirdPartyId() {
		return this.thirdPartyId;
	}

	public void setThirdPartyId(Long thirdPartyId) {
		this.thirdPartyId = thirdPartyId;
	}

	public String getRiskCode() {
		return this.riskCode;
	}

	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}

	public String getTreatSituation() {
		return this.treatSituation;
	}

	public void setTreatSituation(String treatSituation) {
		this.treatSituation = treatSituation;
	}

	public String getPersonName() {
		return this.personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public Long getPersonId() {
		return this.personId;
	}

	public void setPersonId(Long personId) {
		this.personId = personId;
	}

	public String getCertiType() {
		return this.certiType;
	}

	public void setCertiType(String certiType) {
		this.certiType = certiType;
	}

	public String getCertiCode() {
		return this.certiCode;
	}

	public void setCertiCode(String certiCode) {
		this.certiCode = certiCode;
	}

	public String getLossItemType() {
		return this.lossItemType;
	}

	public void setLossItemType(String lossItemType) {
		this.lossItemType = lossItemType;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public BigDecimal getPersonAge() {
		return this.personAge;
	}

	public void setPersonAge(BigDecimal personAge) {
		this.personAge = personAge;
	}

	public String getPersonSex() {
		return this.personSex;
	}

	public void setPersonSex(String personSex) {
		this.personSex = personSex;
	}

	public String getTicCode() {
		return this.ticCode;
	}

	public void setTicCode(String ticCode) {
		this.ticCode = ticCode;
	}

	public String getTicName() {
		return this.ticName;
	}

	public void setTicName(String ticName) {
		this.ticName = ticName;
	}

	public String getIncome() {
		return this.income;
	}

	public void setIncome(String income) {
		this.income = income;
	}

	public String getDomicile() {
		return this.domicile;
	}

	public void setDomicile(String domicile) {
		this.domicile = domicile;
	}

	public String getWoundCode() {
		return this.woundCode;
	}

	public void setWoundCode(String woundCode) {
		this.woundCode = woundCode;
	}

	public String getLicenseNo() {
		return this.licenseNo;
	}

	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}

	public String getInjuryPart() {
		return this.injuryPart;
	}

	public void setInjuryPart(String injuryPart) {
		this.injuryPart = injuryPart;
	}

	public Date getInputTime() {
		return this.inputTime;
	}

	public void setInputTime(Date inputTime) {
		this.inputTime = inputTime;
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

	public String getValidFlag() {
		return this.validFlag;
	}

	public void setValidFlag(String validFlag) {
		this.validFlag = validFlag;
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

	public Date getDeathTime() {
		return this.deathTime;
	}

	public void setDeathTime(Date deathTime) {
		this.deathTime = deathTime;
	}

	public String getChkComCode() {
		return this.chkComCode;
	}

	public void setChkComCode(String chkComCode) {
		this.chkComCode = chkComCode;
	}

	public String getChkComName() {
		return this.chkComName;
	}

	public void setChkComName(String chkComName) {
		this.chkComName = chkComName;
	}
	
	public Integer getSerialNo() {
		return serialNo;
	}
	
	public void setSerialNo(Integer serialNo) {
		this.serialNo = serialNo;
	}
	
	public String getAppraisaCity() {
		return appraisaCity;
	}


	public void setAppraisaCity(String appraisaCity) {
		this.appraisaCity = appraisaCity;
	}

	public List<PrpLDlossPersExtVo> getPrpLDlossPersExts() {
		return this.prpLDlossPersExts;
	}

	public void setPrpLDlossPersExts(List<PrpLDlossPersExtVo> prpLDlossPersExts) {
		this.prpLDlossPersExts = prpLDlossPersExts;
	}

	public List<PrpLDlossPersNurseVo> getPrpLDlossPersNurses() {
		return this.prpLDlossPersNurses;
	}

	public void setPrpLDlossPersNurses(List<PrpLDlossPersNurseVo> prpLDlossPersNurses) {
		this.prpLDlossPersNurses = prpLDlossPersNurses;
	}

	public List<PrpLDlossPersHospitalVo> getPrpLDlossPersHospitals() {
		return this.prpLDlossPersHospitals;
	}

	public void setPrpLDlossPersHospitals(List<PrpLDlossPersHospitalVo> prpLDlossPersHospitals) {
		this.prpLDlossPersHospitals = prpLDlossPersHospitals;
	}

	public List<PrpLDlossPersRaiseVo> getPrpLDlossPersRaises() {
		return this.prpLDlossPersRaises;
	}

	public void setPrpLDlossPersRaises(List<PrpLDlossPersRaiseVo> prpLDlossPersRaises) {
		this.prpLDlossPersRaises = prpLDlossPersRaises;
	}

	public String getIdClmChannelProcess() {
		return idClmChannelProcess;
	}

	public void setIdClmChannelProcess(String idClmChannelProcess) {
		this.idClmChannelProcess = idClmChannelProcess;
	}
}
