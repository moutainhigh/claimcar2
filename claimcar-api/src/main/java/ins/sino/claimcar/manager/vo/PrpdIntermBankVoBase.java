package ins.sino.claimcar.manager.vo;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
import java.util.Date;


/**
 * Vo Base Class of PO PrpdIntermBank
 */ 
public class PrpdIntermBankVoBase implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String accountName;
	private String accountNo;
	private String bankName;
	private String bankType;
	private String province;
	private String city;
	private String bankOutlets;
	private String bankNumber;
	private String mobile;
	private String updateUser;
	private Date createTime;
	private String createUser;
	private Date updateTime;
	private String certifyNo;
	private String accountId;
	private String vaildFlag;//该公估机构下的银行账号
	private String publicAndPrivate;//对公对私

    protected PrpdIntermBankVoBase() {
	
    }

    
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAccountName() {
		return this.accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountNo() {
		return this.accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getBankName() {
		return this.bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankType() {
		return this.bankType;
	}

	public void setBankType(String bankType) {
		this.bankType = bankType;
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getBankOutlets() {
		return this.bankOutlets;
	}

	public void setBankOutlets(String bankOutlets) {
		this.bankOutlets = bankOutlets;
	}

	public String getBankNumber() {
		return this.bankNumber;
	}

	public void setBankNumber(String bankNumber) {
		this.bankNumber = bankNumber;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
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
	public String getCertifyNo() {
		return certifyNo;
	}


	
	public void setCertifyNo(String certifyNo) {
		this.certifyNo = certifyNo;
	}


	
	public String getAccountId() {
		return accountId;
	}


	
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}


	public String getVaildFlag() {
		return vaildFlag;
	}


	public void setVaildFlag(String vaildFlag) {
		this.vaildFlag = vaildFlag;
	}


	public String getPublicAndPrivate() {
		return publicAndPrivate;
	}


	public void setPublicAndPrivate(String publicAndPrivate) {
		this.publicAndPrivate = publicAndPrivate;
	}
	
	
}
