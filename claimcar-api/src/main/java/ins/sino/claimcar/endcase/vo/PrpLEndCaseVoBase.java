package ins.sino.claimcar.endcase.vo;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
import java.util.Date;


/**
 * Vo Base Class of PO PrpLEndCase
 */ 
public class PrpLEndCaseVoBase implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String endCaseNo;
	private String policyNo;
	private String registNo;
	private String claimNo;
	private String compensateNo;
	private String regressNo;
	private String endcaseType;
	private String riskCode;
	private String isAutoEndCase;
	private Date endCaseDate;
	private String validFlag;
	private String falg;
	private String remark;
	private String createUser;
	private Date createTime;
	private String updateUser;
	private Date updateTime;
	private String confirmCode;

    protected PrpLEndCaseVoBase() {
	
    }

    
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEndCaseNo() {
		return this.endCaseNo;
	}

	public void setEndCaseNo(String endCaseNo) {
		this.endCaseNo = endCaseNo;
	}

	public String getPolicyNo() {
		return this.policyNo;
	}

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
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

	public String getCompensateNo() {
		return this.compensateNo;
	}

	public void setCompensateNo(String compensateNo) {
		this.compensateNo = compensateNo;
	}

	public String getRegressNo() {
		return this.regressNo;
	}

	public void setRegressNo(String regressNo) {
		this.regressNo = regressNo;
	}

	public String getEndcaseType() {
		return this.endcaseType;
	}

	public void setEndcaseType(String endcaseType) {
		this.endcaseType = endcaseType;
	}

	public String getRiskCode() {
		return this.riskCode;
	}

	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}

	public String getIsAutoEndCase() {
		return this.isAutoEndCase;
	}

	public void setIsAutoEndCase(String isAutoEndCase) {
		this.isAutoEndCase = isAutoEndCase;
	}

	public Date getEndCaseDate() {
		return this.endCaseDate;
	}

	public void setEndCaseDate(Date endCaseDate) {
		this.endCaseDate = endCaseDate;
	}

	public String getValidFlag() {
		return this.validFlag;
	}

	public void setValidFlag(String validFlag) {
		this.validFlag = validFlag;
	}

	public String getFalg() {
		return this.falg;
	}

	public void setFalg(String falg) {
		this.falg = falg;
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


	public String getConfirmCode() {
		return confirmCode;
	}


	public void setConfirmCode(String confirmCode) {
		this.confirmCode = confirmCode;
	}
}
