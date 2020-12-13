package ins.sino.claimcar.regist.vo;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
import java.math.BigDecimal;
import java.util.Date;


/**
 * Vo Base Class of PO PrpDClaimAvg
 */ 
public class PrpDClaimAvgVoBase implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private BigDecimal id;
	private BigDecimal avgYear;
	private String comCode;
	private String riskCode;
	private String kindCode;
	private String avgType;
	private BigDecimal avgAmount;
	private String validFlag;
	private String flag;
	private String remark;
	private String createUser;
	private Date createTime;
	private String updateUser;
	private Date updateTime;
	private Date effectTimes;
    protected PrpDClaimAvgVoBase() {
	
    }

    
	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public BigDecimal getAvgYear() {
		return this.avgYear;
	}

	public void setAvgYear(BigDecimal avgYear) {
		this.avgYear = avgYear;
	}

	public String getComCode() {
		return this.comCode;
	}

	public void setComCode(String comCode) {
		this.comCode = comCode;
	}

	public String getRiskCode() {
		return this.riskCode;
	}

	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}

	public String getKindCode() {
		return this.kindCode;
	}

	public void setKindCode(String kindCode) {
		this.kindCode = kindCode;
	}

	public String getAvgType() {
		return this.avgType;
	}

	public void setAvgType(String avgType) {
		this.avgType = avgType;
	}

	public BigDecimal getAvgAmount() {
		return this.avgAmount;
	}

	public void setAvgAmount(BigDecimal avgAmount) {
		this.avgAmount = avgAmount;
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


	public Date getEffectTimes() {
		return effectTimes;
	}


	public void setEffectTimes(Date effectTimes) {
		this.effectTimes = effectTimes;
	}



	
}