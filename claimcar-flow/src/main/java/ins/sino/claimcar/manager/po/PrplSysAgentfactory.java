package ins.sino.claimcar.manager.po;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * POJO Class SysAgentfactoryId
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Table(name = "SYS_AGENTFACTORY")
public class PrplSysAgentfactory implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private String agentCode;
	private String agentName;
	private String addressName;
	private String postCode;
	private String agentType;
	private String permitNo;
	private String linkerName;
	private Date bargainDate;
	private String phoneNumber;
	private String faxNumber;
	private String comCode;
	private String handlerCode;
	private String upperAgentCode;
	private String newAgentCode;
	private String validStatus;
	private String articleCode;
	private String flag;
	private String agenteName;
	private String permitFlag;
	private String prinCipalName;
	private String mobile;
	private String email;
	private String netAddress;
	private String bank;
	private String account;
	private String lowerViewFlag;
	private String agentShortName;
	private String createrCode;
	private String createTime;
	private String updaterCode;
	private String updateDate;
	private Date startDate;
	private Date endDate;
	private String saleSchannelCode;
	private String isAdd;
	private String checkRemark;
	private String sendMsgFlag;

	@Id
    @Column(name = "AGENTCODE", unique = true, nullable = false, length = 12)
	public String getAgentCode() {
		return this.agentCode;
	}

	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}

	@Column(name = "AGENTNAME", length=120)
	public String getAgentName() {
		return this.agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	@Column(name = "ADDRESSNAME", length=120)
	public String getAddressName() {
		return this.addressName;
	}

	public void setAddressName(String addressName) {
		this.addressName = addressName;
	}

	@Column(name = "POSTCODE", length=6)
	public String getPostCode() {
		return this.postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	@Column(name = "AGENTTYPE", length=1)
	public String getAgentType() {
		return this.agentType;
	}

	public void setAgentType(String agentType) {
		this.agentType = agentType;
	}

	@Column(name = "PERMITNO", length=40)
	public String getPermitNo() {
		return this.permitNo;
	}

	public void setPermitNo(String permitNo) {
		this.permitNo = permitNo;
	}

	@Column(name = "LINKERNAME", length=20)
	public String getLinkerName() {
		return this.linkerName;
	}

	public void setLinkerName(String linkerName) {
		this.linkerName = linkerName;
	}

	@Column(name = "BARGAINDATE", length=7)
	public Date getBargainDate() {
		return this.bargainDate;
	}

	public void setBargainDate(Date bargainDate) {
		this.bargainDate = bargainDate;
	}

	@Column(name = "PHONENUMBER", length=100)
	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Column(name = "FAXNUMBER", length=20)
	public String getFaxNumber() {
		return this.faxNumber;
	}

	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}

	@Column(name = "COMCODE", nullable = false, length=8)
	public String getComCode() {
		return this.comCode;
	}

	public void setComCode(String comCode) {
		this.comCode = comCode;
	}

	@Column(name = "HANDLERCODE", length=14)
	public String getHandlerCode() {
		return this.handlerCode;
	}

	public void setHandlerCode(String handlerCode) {
		this.handlerCode = handlerCode;
	}

	@Column(name = "UPPERAGENTCODE", length=12)
	public String getUpperAgentCode() {
		return this.upperAgentCode;
	}

	public void setUpperAgentCode(String upperAgentCode) {
		this.upperAgentCode = upperAgentCode;
	}

	@Column(name = "NEWAGENTCODE", nullable = false, length=12)
	public String getNewAgentCode() {
		return this.newAgentCode;
	}

	public void setNewAgentCode(String newAgentCode) {
		this.newAgentCode = newAgentCode;
	}

	@Column(name = "VALIDSTATUS", nullable = false, length=1)
	public String getValidStatus() {
		return this.validStatus;
	}

	public void setValidStatus(String validStatus) {
		this.validStatus = validStatus;
	}

	@Column(name = "ARTICLECODE", length=8)
	public String getArticleCode() {
		return this.articleCode;
	}

	public void setArticleCode(String articleCode) {
		this.articleCode = articleCode;
	}

	@Column(name = "FLAG", length=2)
	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	@Column(name = "AGENTENAME", length=120)
	public String getAgenteName() {
		return this.agenteName;
	}

	public void setAgenteName(String agenteName) {
		this.agenteName = agenteName;
	}

	@Column(name = "PERMITFLAG", nullable = false, length=1)
	public String getPermitFlag() {
		return this.permitFlag;
	}

	public void setPermitFlag(String permitFlag) {
		this.permitFlag = permitFlag;
	}

	@Column(name = "PRINCIPALNAME", length=20)
	public String getPrinCipalName() {
		return this.prinCipalName;
	}

	public void setPrinCipalName(String prinCipalName) {
		this.prinCipalName = prinCipalName;
	}

	@Column(name = "MOBILE", length=100)
	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Column(name = "EMAIL", length=60)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "NETADDRESS", length=60)
	public String getNetAddress() {
		return this.netAddress;
	}

	public void setNetAddress(String netAddress) {
		this.netAddress = netAddress;
	}

	@Column(name = "BANK", length=120)
	public String getBank() {
		return this.bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	@Column(name = "ACCOUNT", length=60)
	public String getAccount() {
		return this.account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	@Column(name = "LOWERVIEWFLAG", nullable = false, length=1)
	public String getLowerViewFlag() {
		return this.lowerViewFlag;
	}

	public void setLowerViewFlag(String lowerViewFlag) {
		this.lowerViewFlag = lowerViewFlag;
	}

	@Column(name = "AGENTSHORTNAME", length=120)
	public String getAgentShortName() {
		return this.agentShortName;
	}

	public void setAgentShortName(String agentShortName) {
		this.agentShortName = agentShortName;
	}

	@Column(name = "CREATERCODE", length=10)
	public String getCreaterCode() {
		return this.createrCode;
	}

	public void setCreaterCode(String createrCode) {
		this.createrCode = createrCode;
	}

	@Column(name = "CREATETIME", length=19)
	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	@Column(name = "UPDATERCODE", length=10)
	public String getUpdaterCode() {
		return this.updaterCode;
	}

	public void setUpdaterCode(String updaterCode) {
		this.updaterCode = updaterCode;
	}

	@Column(name = "UPDATEDATE", length=19)
	public String getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}

	@Column(name = "STARTDATE", length=7)
	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	@Column(name = "ENDDATE", length=7)
	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	@Column(name = "SALESCHANNELCODE", length=19)
	public String getSaleSchannelCode() {
		return this.saleSchannelCode;
	}

	public void setSaleSchannelCode(String saleSchannelCode) {
		this.saleSchannelCode = saleSchannelCode;
	}

	@Column(name = "ISADD", length=1)
	public String getIsAdd() {
		return this.isAdd;
	}

	public void setIsAdd(String isAdd) {
		this.isAdd = isAdd;
	}

	@Column(name = "CHECKREMARK", length=300)
	public String getCheckRemark() {
		return this.checkRemark;
	}

	public void setCheckRemark(String checkRemark) {
		this.checkRemark = checkRemark;
	}

	@Column(name = "SENDMSGFLAG", length=1)
	public String getSendMsgFlag() {
		return this.sendMsgFlag;
	}

	public void setSendMsgFlag(String sendMsgFlag) {
		this.sendMsgFlag = sendMsgFlag;
	}
}