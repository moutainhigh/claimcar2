package ins.sino.claimcar.check.vo;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
import java.math.BigDecimal;
import java.util.Date;

/**
 * Vo Base Class of PO PrpLCheckPerson
 */
public class PrpLCheckPersonVoBase implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private Long checkTaskId;
	private String registNo;
	private Long lossPartyId;
	private String lossPartyName;
	private String personName;
	private String personSex;
	private BigDecimal personAge;
	private String personPayType;
	private String ticCode;
	private String treatType;
	private String hospital;
	private String lossFeeType;
	private BigDecimal lossFee;
	private String checkDispose;
	private String woundDetail;
	private String validFlag;
	private String remark;
	private String flag;
	private String createUser;
	private Date createTime;
	private String updateUser;
	private Date updateTime;
	private String personProp;
	private String identifyType;
	private String idNo;
	private String injuredPart;

	protected PrpLCheckPersonVoBase(){

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

	public Long getLossPartyId() {
		return this.lossPartyId;
	}

	public void setLossPartyId(Long lossPartyId) {
		this.lossPartyId = lossPartyId;
	}

	public String getLossPartyName() {
		return this.lossPartyName;
	}

	public void setLossPartyName(String lossPartyName) {
		this.lossPartyName = lossPartyName;
	}

	public String getPersonName() {
		return this.personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getPersonSex() {
		return this.personSex;
	}

	public void setPersonSex(String personSex) {
		this.personSex = personSex;
	}

	public BigDecimal getPersonAge() {
		return this.personAge;
	}

	public void setPersonAge(BigDecimal personAge) {
		this.personAge = personAge;
	}

	public String getPersonPayType() {
		return this.personPayType;
	}

	public void setPersonPayType(String personPayType) {
		this.personPayType = personPayType;
	}

	public String getTicCode() {
		return this.ticCode;
	}

	public void setTicCode(String ticCode) {
		this.ticCode = ticCode;
	}

	public String getTreatType() {
		return this.treatType;
	}

	public void setTreatType(String treatType) {
		this.treatType = treatType;
	}

	public String getHospital() {
		return this.hospital;
	}

	public void setHospital(String hospital) {
		this.hospital = hospital;
	}

	public String getLossFeeType() {
		return this.lossFeeType;
	}

	public void setLossFeeType(String lossFeeType) {
		this.lossFeeType = lossFeeType;
	}

	public BigDecimal getLossFee() {
		return this.lossFee;
	}

	public void setLossFee(BigDecimal lossFee) {
		this.lossFee = lossFee;
	}

	public String getCheckDispose() {
		return this.checkDispose;
	}

	public void setCheckDispose(String checkDispose) {
		this.checkDispose = checkDispose;
	}

	public String getWoundDetail() {
		return this.woundDetail;
	}

	public void setWoundDetail(String woundDetail) {
		this.woundDetail = woundDetail;
	}

	public String getValidFlag() {
		return this.validFlag;
	}

	public void setValidFlag(String validFlag) {
		this.validFlag = validFlag;
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

	public Long getCheckTaskId() {
		return checkTaskId;
	}

	public void setCheckTaskId(Long checkTaskId) {
		this.checkTaskId = checkTaskId;
	}

	public String getPersonProp() {
		return personProp;
	}

	public void setPersonProp(String personProp) {
		this.personProp = personProp;
	}

	public String getIdentifyType() {
		return identifyType;
	}

	public void setIdentifyType(String identifyType) {
		this.identifyType = identifyType;
	}

	public String getIdNo() {
		return idNo;
	}

	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}

	public String getInjuredPart() {
		return injuredPart;
	}

	public void setInjuredPart(String injuredPart) {
		this.injuredPart = injuredPart;
	}
}