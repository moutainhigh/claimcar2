package ins.sino.claimcar.manager.vo;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * Vo Base Class of PO PrpdIntermMain
 */ 
public class PrpdIntermMainVoBase implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String comCode;
	private String makeCode;
	private String upperCode;
	private String intermCode;
	private String intermName;
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
	private List<PrpdIntermBankVo> prpdIntermBanks = new ArrayList<PrpdIntermBankVo>(0);
	private List<PrpdIntermServerVo> prpdIntermServers = new ArrayList<PrpdIntermServerVo>(0);
	private List<PrpdIntermUserVo> prpdIntermUsers = new ArrayList<PrpdIntermUserVo>(0);

    protected PrpdIntermMainVoBase() {
	
    }

    
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getComCode() {
		return this.comCode;
	}

	public void setComCode(String comCode) {
		this.comCode = comCode;
	}

	public String getMakeCode() {
		return this.makeCode;
	}

	public void setMakeCode(String makeCode) {
		this.makeCode = makeCode;
	}

	public String getUpperCode() {
		return this.upperCode;
	}

	public void setUpperCode(String upperCode) {
		this.upperCode = upperCode;
	}

	public String getIntermCode() {
		return this.intermCode;
	}

	public void setIntermCode(String intermCode) {
		this.intermCode = intermCode;
	}

	public String getIntermName() {
		return this.intermName;
	}

	public void setIntermName(String intermName) {
		this.intermName = intermName;
	}

	public Date getEstablishDate() {
		return this.establishDate;
	}

	public void setEstablishDate(Date establishDate) {
		this.establishDate = establishDate;
	}

	public String getOfficeAddress() {
		return this.officeAddress;
	}

	public void setOfficeAddress(String officeAddress) {
		this.officeAddress = officeAddress;
	}

	public String getLinker() {
		return this.linker;
	}

	public void setLinker(String linker) {
		this.linker = linker;
	}

	public String getPostOde() {
		return this.postOde;
	}

	public void setPostOde(String postOde) {
		this.postOde = postOde;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getTelNo() {
		return this.telNo;
	}

	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getValidStatus() {
		return this.validStatus;
	}

	public void setValidStatus(String validStatus) {
		this.validStatus = validStatus;
	}

	public String getPayStandard() {
		return this.payStandard;
	}

	public void setPayStandard(String payStandard) {
		this.payStandard = payStandard;
	}

	public String getCheckRemark() {
		return this.checkRemark;
	}

	public void setCheckRemark(String checkRemark) {
		this.checkRemark = checkRemark;
	}

	public String getUpdateUser() {
		return this.updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getCreateUser() {
		return this.createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getRemark() {
		return this.remark;
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

	
	public List<PrpdIntermBankVo> getPrpdIntermBanks() {
		return this.prpdIntermBanks;
	}

	public void setPrpdIntermBanks(List<PrpdIntermBankVo> prpdIntermBanks) {
		this.prpdIntermBanks = prpdIntermBanks;
	}

	public List<PrpdIntermServerVo> getPrpdIntermServers() {
		return this.prpdIntermServers;
	}

	public void setPrpdIntermServers(List<PrpdIntermServerVo> prpdIntermServers) {
		this.prpdIntermServers = prpdIntermServers;
	}


	public List<PrpdIntermUserVo> getPrpdIntermUsers() {
		return prpdIntermUsers;
	}


	public void setPrpdIntermUsers(List<PrpdIntermUserVo> prpdIntermUsers) {
		this.prpdIntermUsers = prpdIntermUsers;
	}
	
	
}
