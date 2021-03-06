package ins.sino.claimcar.check.po;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * POJO Class PrpLCheckTask
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Table(name = "PRPLCHECKTASK")
public class PrpLCheckTask implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private PrpLCheck prpLCheck;
	private String registNo;
	private String linkerName;
	private String linkerNumber;
	private String linkerMobile;
	private Date checkDate;
	private String checkAddress;
	private String firstAddressFlag;
	private String checkerCode;
	private String checker;
	private String checkerIdfNo;
	private String checkerPhone;
	private String contexts;
	private BigDecimal sumRescueFee;
	private BigDecimal sumLossCarFee;
	private BigDecimal sumLossPropFee;
	private BigDecimal sumLossPersnFee;
	private String comCode;
	private String makeCom;
	private String verifyCheckFlag;
	private String underWriteState;
	private String deflossRepairType;
	private String claimText;
	private BigDecimal repairFee;
	private Date underWriteDate;
	private String underWriteUserCode;
	private String verifyCheckContext;
	private String isTimeout;
	private String validFlag;
	private String flag;
	private String remark;
	private String createUser;
	private Date createTime;
	private String updateUser;
	private Date updateTime;
	private List<PrpLCheckCar> prpLCheckCars = new ArrayList<PrpLCheckCar>(0);
	private List<PrpLCheckProp> prpLCheckProps = new ArrayList<PrpLCheckProp>(0);
	private List<PrpLCheckExt> prpLCheckExts = new ArrayList<PrpLCheckExt>(0);
	private List<PrpLCheckPerson> prpLCheckPersons = new ArrayList<PrpLCheckPerson>(0);

	@Id
	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "prpLCheck"))
	@GeneratedValue(generator = "generator")
	@Column(name = "ID", unique = true, nullable = false, precision = 13, scale = 0)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public PrpLCheck getPrpLCheck() {
		return this.prpLCheck;
	}

	public void setPrpLCheck(PrpLCheck prpLCheck) {
		this.prpLCheck = prpLCheck;
	}

	@Column(name = "REGISTNO", nullable = false, length = 30)
	public String getRegistNo() {
		return this.registNo;
	}

	public void setRegistNo(String registNo) {
		this.registNo = registNo;
	}

	@Column(name = "LINKERNAME")
	public String getLinkerName() {
		return this.linkerName;
	}

	public void setLinkerName(String linkerName) {
		this.linkerName = linkerName;
	}

	@Column(name = "LINKERNUMBER", length = 20)
	public String getLinkerNumber() {
		return this.linkerNumber;
	}

	public void setLinkerNumber(String linkerNumber) {
		this.linkerNumber = linkerNumber;
	}

	@Column(name = "LINKERMOBILE", length = 20)
	public String getLinkerMobile() {
		return this.linkerMobile;
	}

	public void setLinkerMobile(String linkerMobile) {
		this.linkerMobile = linkerMobile;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CHECKDATE", nullable = false, length = 7)
	public Date getCheckDate() {
		return this.checkDate;
	}

	public void setCheckDate(Date checkDate) {
		this.checkDate = checkDate;
	}

	@Column(name = "CHECKADDRESS")
	public String getCheckAddress() {
		return this.checkAddress;
	}

	public void setCheckAddress(String checkAddress) {
		this.checkAddress = checkAddress;
	}

	@Column(name = "FIRSTADDRESSFLAG", length = 1)
	public String getFirstAddressFlag() {
		return this.firstAddressFlag;
	}

	public void setFirstAddressFlag(String firstAddressFlag) {
		this.firstAddressFlag = firstAddressFlag;
	}

	@Column(name = "CHECKERCODE", length = 10)
	public String getCheckerCode() {
		return this.checkerCode;
	}

	public void setCheckerCode(String checkerCode) {
		this.checkerCode = checkerCode;
	}

	@Column(name = "CHECKER", length = 30)
	public String getChecker() {
		return this.checker;
	}

	public void setChecker(String checker) {
		this.checker = checker;
	}

	@Column(name = "CHECKERIDFNO", length = 40)
	public String getCheckerIdfNo() {
		return this.checkerIdfNo;
	}

	public void setCheckerIdfNo(String checkerIdfNo) {
		this.checkerIdfNo = checkerIdfNo;
	}

	@Column(name = "CLAIMTEXT", nullable = false, length = 300)
	public String getClaimText() {
		return this.claimText;
	}

	public void setClaimText(String claimText) {
		this.claimText = claimText;
	}

	@Column(name = "CHECKERPHONE", nullable = false, length = 20)
	public String getCheckerPhone() {
		return this.checkerPhone;
	}

	public void setCheckerPhone(String checkerPhone) {
		this.checkerPhone = checkerPhone;
	}

	@Column(name = "CONTEXTS", length = 1000)
	public String getContexts() {
		return this.contexts;
	}

	public void setContexts(String contexts) {
		this.contexts = contexts;
	}

	@Column(name = "SUMRESCUEFEE", precision = 14)
	public BigDecimal getSumRescueFee() {
		return this.sumRescueFee;
	}

	public void setSumRescueFee(BigDecimal sumRescueFee) {
		this.sumRescueFee = sumRescueFee;
	}

	@Column(name = "SUMLOSSCARFEE", precision = 14)
	public BigDecimal getSumLossCarFee() {
		return this.sumLossCarFee;
	}

	public void setSumLossCarFee(BigDecimal sumLossCarFee) {
		this.sumLossCarFee = sumLossCarFee;
	}

	@Column(name = "SUMLOSSPROPFEE", precision = 14)
	public BigDecimal getSumLossPropFee() {
		return this.sumLossPropFee;
	}

	public void setSumLossPropFee(BigDecimal sumLossPropFee) {
		this.sumLossPropFee = sumLossPropFee;
	}

	@Column(name = "SUMLOSSPERSNFEE", precision = 14)
	public BigDecimal getSumLossPersnFee() {
		return this.sumLossPersnFee;
	}

	public void setSumLossPersnFee(BigDecimal sumLossPersnFee) {
		this.sumLossPersnFee = sumLossPersnFee;
	}

	@Column(name = "COMCODE", length = 8)
	public String getComCode() {
		return this.comCode;
	}

	public void setComCode(String comCode) {
		this.comCode = comCode;
	}

	@Column(name = "MAKECOM", length = 8)
	public String getMakeCom() {
		return this.makeCom;
	}

	public void setMakeCom(String makeCom) {
		this.makeCom = makeCom;
	}

	@Column(name = "VERIFYCHECKFLAG", length = 3)
	public String getVerifyCheckFlag() {
		return this.verifyCheckFlag;
	}

	public void setVerifyCheckFlag(String verifyCheckFlag) {
		this.verifyCheckFlag = verifyCheckFlag;
	}

	@Column(name = "UNDERWRITESTATE", length = 1)
	public String getUnderWriteState() {
		return this.underWriteState;
	}

	public void setUnderWriteState(String underWriteState) {
		this.underWriteState = underWriteState;
	}

	@Column(name = "DEFLOSSREPAIRTYPE", length = 2)
	public String getDeflossRepairType() {
		return this.deflossRepairType;
	}

	public void setDeflossRepairType(String deflossRepairType) {
		this.deflossRepairType = deflossRepairType;
	}

	@Column(name = "REPAIRFEE", precision = 14)
	public BigDecimal getRepairFee() {
		return this.repairFee;
	}

	public void setRepairFee(BigDecimal repairFee) {
		this.repairFee = repairFee;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UNDERWRITEDATE", length = 7)
	public Date getUnderWriteDate() {
		return this.underWriteDate;
	}

	public void setUnderWriteDate(Date underWriteDate) {
		this.underWriteDate = underWriteDate;
	}

	@Column(name = "UNDERWRITEUSERCODE", length = 20)
	public String getUnderWriteUserCode() {
		return this.underWriteUserCode;
	}

	public void setUnderWriteUserCode(String underWriteUserCode) {
		this.underWriteUserCode = underWriteUserCode;
	}

	@Column(name = "VERIFYCHECKCONTEXT", length = 500)
	public String getVerifyCheckContext() {
		return this.verifyCheckContext;
	}

	public void setVerifyCheckContext(String verifyCheckContext) {
		this.verifyCheckContext = verifyCheckContext;
	}

	@Column(name = "ISTIMEOUT", length = 5)
	public String getIsTimeout() {
		return this.isTimeout;
	}

	public void setIsTimeout(String isTimeout) {
		this.isTimeout = isTimeout;
	}
	
	@Column(name = "VALIDFLAG", length = 1)
	public String getValidFlag() {
		return this.validFlag;
	}

	public void setValidFlag(String validFlag) {
		this.validFlag = validFlag;
	}

	@Column(name = "FLAG", length = 10)
	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	@Column(name = "REMARK", length = 200)
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Column(name = "CREATEUSER", nullable = false, length = 10)
	public String getCreateUser() {
		return this.createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATETIME", nullable = false, length = 7)
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Column(name = "UPDATEUSER", nullable = false, length = 10)
	public String getUpdateUser() {
		return this.updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATETIME", nullable = false, length = 7)
	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "prpLCheckTask")
	public List<PrpLCheckCar> getPrpLCheckCars() {
		return this.prpLCheckCars;
	}

	public void setPrpLCheckCars(List<PrpLCheckCar> prpLCheckCars) {
		this.prpLCheckCars = prpLCheckCars;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "prpLCheckTask")
	public List<PrpLCheckProp> getPrpLCheckProps() {
		return this.prpLCheckProps;
	}

	public void setPrpLCheckProps(List<PrpLCheckProp> prpLCheckProps) {
		this.prpLCheckProps = prpLCheckProps;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "prpLCheckTask")
	public List<PrpLCheckExt> getPrpLCheckExts() {
		return this.prpLCheckExts;
	}

	public void setPrpLCheckExts(List<PrpLCheckExt> prpLCheckExts) {
		this.prpLCheckExts = prpLCheckExts;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "prpLCheckTask")
	public List<PrpLCheckPerson> getPrpLCheckPersons() {
		return this.prpLCheckPersons;
	}

	public void setPrpLCheckPersons(List<PrpLCheckPerson> prpLCheckPersons) {
		this.prpLCheckPersons = prpLCheckPersons;
	}

}
