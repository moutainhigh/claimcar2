package ins.sino.claimcar.regist.vo;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
import java.math.BigDecimal;
import java.util.Date;


/**
 * Vo Base Class of PO PrpLTmpCItemKind
 */ 
public class PrpLTmpCItemKindVoBase implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Long tmpcitemkindid;
	private String registNo;
	private Long itemKindNo;
	private String claimNo;
	private String policyNo;
	private String riskCode;
	private String kindCode;
	private String kindName;
	private Date startTime;
	private Date endTime;
	private String currency;
	private BigDecimal unitAmount;
	private BigDecimal quantity;
	private BigDecimal value;
	private BigDecimal amount;
	private String validFlag;
	private String flag;
	private String remark;
	private String createUser;
	private Date createTime;
	private String updateUser;
	private Date updateTime;

    protected PrpLTmpCItemKindVoBase() {
	
    }

    
	public Long getTmpcitemkindid() {
		return this.tmpcitemkindid;
	}

	public void setTmpcitemkindid(Long tmpcitemkindid) {
		this.tmpcitemkindid = tmpcitemkindid;
	}


	public String getRegistNo() {
		return this.registNo;
	}

	public void setRegistNo(String registNo) {
		this.registNo = registNo;
	}

	public Long getItemKindNo() {
		return this.itemKindNo;
	}

	public void setItemKindNo(Long itemKindNo) {
		this.itemKindNo = itemKindNo;
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

	public String getKindName() {
		return this.kindName;
	}

	public void setKindName(String kindName) {
		this.kindName = kindName;
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

	public BigDecimal getUnitAmount() {
		return this.unitAmount;
	}

	public void setUnitAmount(BigDecimal unitAmount) {
		this.unitAmount = unitAmount;
	}

	public BigDecimal getQuantity() {
		return this.quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getValue() {
		return this.value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
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
