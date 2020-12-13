package ins.sino.claimcar.manager.vo;

//Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
* Vo Base Class of PO PrpdIntermMain
*/ 
public class PrpdCheckBankMainVoBase implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String comCode;
	private String makeCode;
	private String upperCode;
	private String checkCode;
	private String checkName;
	private Date establishDate;
	private String officeAddress;
	private String linker;
	private String postOde;
	private String fax;
	private String telNo;
	private String email;
	private String validStatus;
	private String payStandard;
	private String checkRemark;
	private String updateUser;
	private Date createTime;
	private String createUser;
	private Date updateTime;
	private String remark;
	private String payStandardMax;
	private List<PrpdcheckBankVo> prpdcheckBanks = new ArrayList<PrpdcheckBankVo>(0);
	private List<PrpdcheckServerVo> prpdcheckServers = new ArrayList<PrpdcheckServerVo>(0);
	private List<PrpdcheckUserVo> prpdcheckUsers = new ArrayList<PrpdcheckUserVo>(0);

 protected PrpdCheckBankMainVoBase() {
	
 }

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getComCode() {
	return comCode;
}

public void setComCode(String comCode) {
	this.comCode = comCode;
}

public String getMakeCode() {
	return makeCode;
}

public void setMakeCode(String makeCode) {
	this.makeCode = makeCode;
}

public String getUpperCode() {
	return upperCode;
}

public void setUpperCode(String upperCode) {
	this.upperCode = upperCode;
}

public String getCheckCode() {
	return checkCode;
}

public void setCheckCode(String checkCode) {
	this.checkCode = checkCode;
}

public String getCheckName() {
	return checkName;
}

public void setCheckName(String checkName) {
	this.checkName = checkName;
}

public Date getEstablishDate() {
	return establishDate;
}

public void setEstablishDate(Date establishDate) {
	this.establishDate = establishDate;
}

public String getOfficeAddress() {
	return officeAddress;
}

public void setOfficeAddress(String officeAddress) {
	this.officeAddress = officeAddress;
}

public String getLinker() {
	return linker;
}

public void setLinker(String linker) {
	this.linker = linker;
}

public String getPostOde() {
	return postOde;
}

public void setPostOde(String postOde) {
	this.postOde = postOde;
}

public String getFax() {
	return fax;
}

public void setFax(String fax) {
	this.fax = fax;
}

public String getTelNo() {
	return telNo;
}

public void setTelNo(String telNo) {
	this.telNo = telNo;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getValidStatus() {
	return validStatus;
}

public void setValidStatus(String validStatus) {
	this.validStatus = validStatus;
}

public String getPayStandard() {
	return payStandard;
}

public void setPayStandard(String payStandard) {
	this.payStandard = payStandard;
}

public String getCheckRemark() {
	return checkRemark;
}

public void setCheckRemark(String checkRemark) {
	this.checkRemark = checkRemark;
}

public String getUpdateUser() {
	return updateUser;
}

public void setUpdateUser(String updateUser) {
	this.updateUser = updateUser;
}

public Date getCreateTime() {
	return createTime;
}

public void setCreateTime(Date createTime) {
	this.createTime = createTime;
}

public String getCreateUser() {
	return createUser;
}

public void setCreateUser(String createUser) {
	this.createUser = createUser;
}

public Date getUpdateTime() {
	return updateTime;
}

public void setUpdateTime(Date updateTime) {
	this.updateTime = updateTime;
}

public String getRemark() {
	return remark;
}

public void setRemark(String remark) {
	this.remark = remark;
}

public String getPayStandardMax() {
	return payStandardMax;
}

public void setPayStandardMax(String payStandardMax) {
	this.payStandardMax = payStandardMax;
}

public List<PrpdcheckBankVo> getPrpdcheckBanks() {
	return prpdcheckBanks;
}

public void setPrpdcheckBanks(List<PrpdcheckBankVo> prpdcheckBanks) {
	this.prpdcheckBanks = prpdcheckBanks;
}

public List<PrpdcheckServerVo> getPrpdcheckServers() {
	return prpdcheckServers;
}

public void setPrpdcheckServers(List<PrpdcheckServerVo> prpdcheckServers) {
	this.prpdcheckServers = prpdcheckServers;
}

public List<PrpdcheckUserVo> getPrpdcheckUsers() {
	return prpdcheckUsers;
}

public void setPrpdcheckUsers(List<PrpdcheckUserVo> prpdcheckUsers) {
	this.prpdcheckUsers = prpdcheckUsers;
}

 
}
