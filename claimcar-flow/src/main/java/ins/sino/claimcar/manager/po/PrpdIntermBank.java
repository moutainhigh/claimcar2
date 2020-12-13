package ins.sino.claimcar.manager.po;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * POJO Class PrpdIntermBank
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@TableGenerator(name = "utiSequence", table = "UTISEQUENCE", pkColumnName = "GenName", valueColumnName = "GenValue", pkColumnValue = "PRPDINTERMBANK_PK", allocationSize = 10)
@Table(name = "PRPDINTERMBANK")
public class PrpdIntermBank implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private PrpdIntermMain prpdIntermMain;
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

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "utiSequence")
	@Column(name = "ID", unique = true, nullable = false, precision=12, scale=0)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="INTERMID")
	public PrpdIntermMain getPrpdIntermMain() {
		return this.prpdIntermMain;
	}

	public void setPrpdIntermMain(PrpdIntermMain prpdIntermMain) {
		this.prpdIntermMain = prpdIntermMain;
	}

	@Column(name = "ACCOUNTNAME", length=60)
	public String getAccountName() {
		return this.accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	@Column(name = "ACCOUNTNO", nullable = false, length=35)
	public String getAccountNo() {
		return this.accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	@Column(name = "BANKNAME", length=60)
	public String getBankName() {
		return this.bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	@Column(name = "BANKTYPE", nullable = false, length=5)
	public String getBankType() {
		return this.bankType;
	}

	public void setBankType(String bankType) {
		this.bankType = bankType;
	}

	@Column(name = "PROVINCE", length=20)
	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	@Column(name = "CITY", length=30)
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "BANKOUTLETS", length=100)
	public String getBankOutlets() {
		return this.bankOutlets;
	}

	public void setBankOutlets(String bankOutlets) {
		this.bankOutlets = bankOutlets;
	}

	@Column(name = "BANKNUMBER", length=30)
	public String getBankNumber() {
		return this.bankNumber;
	}

	public void setBankNumber(String bankNumber) {
		this.bankNumber = bankNumber;
	}

	@Column(name = "MOBILE", length=20)
	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Column(name = "UPDATEUSER", length=10)
	public String getUpdateUser() {
		return this.updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATETIME", length=7)
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Column(name = "CREATEUSER", length=10)
	public String getCreateUser() {
		return this.createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATETIME", length=7)
	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	@Column(name = "CERTIFYNO", nullable = false, length=25)
	public String getCertifyNo() {
		return this.certifyNo;
	}

	public void setCertifyNo(String certifyNo) {
		this.certifyNo = certifyNo;
	}
	@Column(name = "ACCOUNTID", nullable = false, length=25)
	public String getAccountId() {
		return this.accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	@Column(name = "VAILDFLAG", length=10)
	public String getVaildFlag() {
		return vaildFlag;
	}

	public void setVaildFlag(String vaildFlag) {
		this.vaildFlag = vaildFlag;
	}
	@Column(name = "PUBLICANDPRIVATE", length=10)
	public String getPublicAndPrivate() {
		return publicAndPrivate;
	}

	public void setPublicAndPrivate(String publicAndPrivate) {
		this.publicAndPrivate = publicAndPrivate;
	}
	
	
}