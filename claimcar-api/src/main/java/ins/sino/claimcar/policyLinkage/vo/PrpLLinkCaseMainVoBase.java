package ins.sino.claimcar.policyLinkage.vo;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
import java.math.BigDecimal;
import java.util.Date;


/**
 * Vo Base Class of PO PrpLLinkCaseMain
 */ 
public class PrpLLinkCaseMainVoBase implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String caseId;
	private String caseNumber;
	private Date accidentTime;
	private String accdientAddress;
	private String assidentDescribe;
	private String caseType;
	private Date resptime;
	private String respUserName;
	private String respUserPhone;
	private Date startTime;
	private Date arriveTime;
	private Date leaveTime;
	private BigDecimal lng;
	private BigDecimal lat;
	private String status;
	private String district;
	private String surveyMembers;
	private String surveyMembersPhone;
	private String itemsName;
	private Date createTime;

    protected PrpLLinkCaseMainVoBase() {
	
    }

    
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCaseId() {
		return this.caseId;
	}

	public void setCaseId(String caseId) {
		this.caseId = caseId;
	}

	public String getCaseNumber() {
		return this.caseNumber;
	}

	public void setCaseNumber(String caseNumber) {
		this.caseNumber = caseNumber;
	}

	public Date getAccidentTime() {
		return this.accidentTime;
	}

	public void setAccidentTime(Date accidentTime) {
		this.accidentTime = accidentTime;
	}

	public String getAccdientAddress() {
		return this.accdientAddress;
	}

	public void setAccdientAddress(String accdientAddress) {
		this.accdientAddress = accdientAddress;
	}

	public String getAssidentDescribe() {
		return this.assidentDescribe;
	}

	public void setAssidentDescribe(String assidentDescribe) {
		this.assidentDescribe = assidentDescribe;
	}

	public String getCaseType() {
		return this.caseType;
	}

	public void setCaseType(String caseType) {
		this.caseType = caseType;
	}

	public Date getResptime() {
		return this.resptime;
	}

	public void setResptime(Date resptime) {
		this.resptime = resptime;
	}

	public String getRespUserName() {
		return this.respUserName;
	}

	public void setRespUserName(String respUserName) {
		this.respUserName = respUserName;
	}

	public String getRespUserPhone() {
		return this.respUserPhone;
	}

	public void setRespUserPhone(String respUserPhone) {
		this.respUserPhone = respUserPhone;
	}

	public Date getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getArriveTime() {
		return this.arriveTime;
	}

	public void setArriveTime(Date arriveTime) {
		this.arriveTime = arriveTime;
	}

	public Date getLeaveTime() {
		return this.leaveTime;
	}

	public void setLeaveTime(Date leaveTime) {
		this.leaveTime = leaveTime;
	}

	public BigDecimal getLng() {
		return this.lng;
	}

	public void setLng(BigDecimal lng) {
		this.lng = lng;
	}

	public BigDecimal getLat() {
		return this.lat;
	}

	public void setLat(BigDecimal lat) {
		this.lat = lat;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDistrict() {
		return this.district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getSurveyMembers() {
		return this.surveyMembers;
	}

	public void setSurveyMembers(String surveyMembers) {
		this.surveyMembers = surveyMembers;
	}

	public String getSurveyMembersPhone() {
		return this.surveyMembersPhone;
	}

	public void setSurveyMembersPhone(String surveyMembersPhone) {
		this.surveyMembersPhone = surveyMembersPhone;
	}

	public String getItemsName() {
		return this.itemsName;
	}

	public void setItemsName(String itemsName) {
		this.itemsName = itemsName;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}
