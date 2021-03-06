package ins.sino.claimcar.lossperson.vo;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
import java.util.Date;


/**
 * Vo Base Class of PO PrpLDlossPersExt
 */ 
public class PrpLDlossPersExtVoBase implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String registNo;
	private String personName;
	private String riskCode;
	private String injuredPart;
	private String injuredDiag;
	private String treatMethod;
	private String treatWay;
	private String progSituation;
	private String woundGrade;
	private String diagDetail;
	private String trackRemark;
	private String validFlag;
	private String flag;
	private String remark;
	private String createUser;
	private Date createTime;
	private String updateUser;
	private Date updateTime;

    protected PrpLDlossPersExtVoBase() {
	
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

	public String getPersonName() {
		return this.personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getRiskCode() {
		return this.riskCode;
	}

	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}

	public String getInjuredPart() {
		return this.injuredPart;
	}

	public void setInjuredPart(String injuredPart) {
		this.injuredPart = injuredPart;
	}

	public String getInjuredDiag() {
		return this.injuredDiag;
	}

	public void setInjuredDiag(String injuredDiag) {
		this.injuredDiag = injuredDiag;
	}

	public String getTreatMethod() {
		return this.treatMethod;
	}

	public void setTreatMethod(String treatMethod) {
		this.treatMethod = treatMethod;
	}

	public String getTreatWay() {
		return this.treatWay;
	}

	public void setTreatWay(String treatWay) {
		this.treatWay = treatWay;
	}

	public String getProgSituation() {
		return this.progSituation;
	}

	public void setProgSituation(String progSituation) {
		this.progSituation = progSituation;
	}

	public String getWoundGrade() {
		return this.woundGrade;
	}

	public void setWoundGrade(String woundGrade) {
		this.woundGrade = woundGrade;
	}

	public String getDiagDetail() {
		return this.diagDetail;
	}

	public void setDiagDetail(String diagDetail) {
		this.diagDetail = diagDetail;
	}

	public String getTrackRemark() {
		return this.trackRemark;
	}

	public void setTrackRemark(String trackRemark) {
		this.trackRemark = trackRemark;
	}

	public String getValidFlag() {
		return this.validFlag;
	}

	public void setValidFlag(String validFlag) {
		this.validFlag = validFlag;
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
}
