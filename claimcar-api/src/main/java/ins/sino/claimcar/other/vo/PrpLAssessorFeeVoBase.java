package ins.sino.claimcar.other.vo;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
import java.math.BigDecimal;
import java.util.Date;

/**
 * Vo Base Class of PO PrpLAssessorFee
 */
public class PrpLAssessorFeeVoBase implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String registNo;
	private String policyNo;
	private String claimNo;
	private String compensateNo;
	private String kindCode;
	private String insurecode;
	private String insurename;
	private BigDecimal payAmount;
	private BigDecimal amount;
	private String taskIds;
	private String taskDetail;
	private String taskStatus;
	private String payStatus;
	private Date payTime;
	private String createUser;
	private Date createTime;
	private String updateUser;
	private Date updateTime;
	private Long bankId;//公估费银行Id
	private String remark;
	private String endNo;//结算单号
	private String linkBillNo;//发票号与发票代码

	protected PrpLAssessorFeeVoBase(){

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

	public String getPolicyNo() {
		return this.policyNo;
	}

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	public String getClaimNo() {
		return this.claimNo;
	}

	public void setClaimNo(String claimNo) {
		this.claimNo = claimNo;
	}

	
	public String getCompensateNo() {
		return compensateNo;
	}

	
	public void setCompensateNo(String compensateNo) {
		this.compensateNo = compensateNo;
	}

	public String getKindCode() {
		return this.kindCode;
	}

	public void setKindCode(String kindCode) {
		this.kindCode = kindCode;
	}

	public String getInsurecode() {
		return this.insurecode;
	}

	public void setInsurecode(String insurecode) {
		this.insurecode = insurecode;
	}

	public String getInsurename() {
		return this.insurename;
	}

	public void setInsurename(String insurename) {
		this.insurename = insurename;
	}

	public BigDecimal getPayAmount() {
		return this.payAmount;
	}

	public void setPayAmount(BigDecimal payAmount) {
		this.payAmount = payAmount;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getTaskIds() {
		return taskIds;
	}

	public void setTaskIds(String taskIds) {
		this.taskIds = taskIds;
	}

	
	public String getTaskDetail() {
		return taskDetail;
	}

	
	public void setTaskDetail(String taskDetail) {
		this.taskDetail = taskDetail;
	}

	
	public String getTaskStatus() {
		return taskStatus;
	}

	
	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
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

	public String getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}

	public Date getPayTime() {
		return payTime;
	}

	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getEndNo() {
		return endNo;
	}

	public void setEndNo(String endNo) {
		this.endNo = endNo;
	}

	public Long getBankId() {
		return bankId;
	}

	public void setBankId(Long bankId) {
		this.bankId = bankId;
	}

	public String getLinkBillNo() {
		return linkBillNo;
	}

	public void setLinkBillNo(String linkBillNo) {
		this.linkBillNo = linkBillNo;
	}

}
