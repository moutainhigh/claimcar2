package ins.sino.claimcar.regist.po;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.validator.constraints.NotBlank;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * POJO Class PrpCItemCar
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@TableGenerator(name = "utiSequence", table = "UTISEQUENCE", pkColumnName = "GenName", valueColumnName = "GenValue", pkColumnValue = "PRPCITEMCAR_PK", allocationSize = 10)
@Table(name = "PRPCITEMCAR")
public class PrpCItemCar implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private PrpCItemCarId id;
	private PrpCMain prpCMain;
	private String riskCode;
	private String insuredTypeCode;
	private String carInsuredRelation;
	private String carOwner;
	private String clauseType;
	private String agreeDriverFlag;
	private String newDeviceFlag;
	private String carPolicyNo;
	private String licenseNo;
	private String licenseColorCode;
	private String carKindCode;
	private String hkFlag;
	private String hkLicenseNo;
	private String engineNo;
	private String vinNo;
	private String frameNo;
	private String runAreaCode;
	private String runAreaName;
	private BigDecimal runMiles;
	private Date enrollDate;
	private Long useYears;
	private String modelCode;
	private String brandName;
	private String countryNature;
	private String countryCode;
	private String useNatureCode;
	private String businessClassCode;
	private Long seatCount;
	private BigDecimal tonCount;
	private BigDecimal exhaustScale;
	private String colorCode;
	private String safeDevice;
	private String parkSite;
	private String ownerAddress;
	private String otherNature;
	private String rateCode;
	private Date makeDate;
	private String carUsage;
	private String currency;
	private BigDecimal purchasePrice;
	private BigDecimal actualValue;
	private String invoiceNo;
	private String carLoanFlag;
	private String insurerCode;
	private String lastInsurer;
	private String carCheckStatus;
	private String carChecker;
	private String carCheckTime;
	private BigDecimal specialTreat;
	private String relievingAreaCode;
	private Long addonCount;
	private String carDealerCode;
	private String carDealerName;
	private String remark;
	private String flag;
	private String carcheckReason;
	private Long lviolatedTimes;
	private Long sviolatedTimes;
	private String licenseKindCode;
	private String registModelCode;
	private String secondHandCarFlag;
	private BigDecimal secondHandCarPrice;
	private String runAreadesc;
	private String licenseNo1;
	private String visaCode;
	private String carAttachNature;
	private BigDecimal allMass;
	private String useKindCode;
	private String carType;
	private Long seatCountShow;
	private BigDecimal tonCountShow;
	private BigDecimal exhaustScaleShow;
	private String vehicleBrand;
	private String vehicleStyleDesc;
	private String carModelid;
	private String vehicleCode;
	private String vehicleStyle;
	private Integer wholeWeight;
	private Date ineffectualDate;
	private Date rejectDate;
	private Date lastCheckDate;
	private Date transferDate;
	private String define1;
	private String define2;
	private String define3;
	private String noCarShipFlag;
	private String fuelType;
	private String madeFactory;
	private String carActualValueTrue;
	private String redPriceFlag;
	private String sex;
	private Date birthday;
	private String basicratecode;
	private String noticetype;
	private String carname;
	private String mobilecardnumber;
	private String startplace;
	private String destination;

	@EmbeddedId
	@NotBlank
	@AttributeOverrides( {
        @AttributeOverride(name = "POLICYNO", column = @Column(name = "POLICYNO", nullable = false, length=22) ), 
        @AttributeOverride(name = "ITEMNO", column = @Column(name = "ITEMNO", nullable = false, precision=15, scale=0) ) } )
	public PrpCItemCarId getId() {
		return this.id;
	}

	public void setId(PrpCItemCarId id) {
		this.id = id;
	}

	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="POLICYNO", nullable = false, insertable = false, updatable = false)
	public PrpCMain getPrpCMain() {
		return this.prpCMain;
	}

	public void setPrpCMain(PrpCMain prpCMain) {
		this.prpCMain = prpCMain;
	}

	@Column(name = "RISKCODE", nullable = false, length=4)
	public String getRiskCode() {
		return this.riskCode;
	}

	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}

	@Column(name = "INSUREDTYPECODE", length=2)
	public String getInsuredTypeCode() {
		return this.insuredTypeCode;
	}

	public void setInsuredTypeCode(String insuredTypeCode) {
		this.insuredTypeCode = insuredTypeCode;
	}

	@Column(name = "CARINSUREDRELATION", length=1)
	public String getCarInsuredRelation() {
		return this.carInsuredRelation;
	}

	public void setCarInsuredRelation(String carInsuredRelation) {
		this.carInsuredRelation = carInsuredRelation;
	}

	@Column(name = "CAROWNER", length=60)
	public String getCarOwner() {
		return this.carOwner;
	}

	public void setCarOwner(String carOwner) {
		this.carOwner = carOwner;
	}

	@Column(name = "CLAUSETYPE", length=3)
	public String getClauseType() {
		return this.clauseType;
	}

	public void setClauseType(String clauseType) {
		this.clauseType = clauseType;
	}

	@Column(name = "AGREEDRIVERFLAG", length=1)
	public String getAgreeDriverFlag() {
		return this.agreeDriverFlag;
	}

	public void setAgreeDriverFlag(String agreeDriverFlag) {
		this.agreeDriverFlag = agreeDriverFlag;
	}

	@Column(name = "NEWDEVICEFLAG", length=1)
	public String getNewDeviceFlag() {
		return this.newDeviceFlag;
	}

	public void setNewDeviceFlag(String newDeviceFlag) {
		this.newDeviceFlag = newDeviceFlag;
	}

	@Column(name = "CARPOLICYNO", length=22)
	public String getCarPolicyNo() {
		return this.carPolicyNo;
	}

	public void setCarPolicyNo(String carPolicyNo) {
		this.carPolicyNo = carPolicyNo;
	}

	@Column(name = "LICENSENO", length=20)
	public String getLicenseNo() {
		return this.licenseNo;
	}

	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}

	@Column(name = "LICENSECOLORCODE", length=2)
	public String getLicenseColorCode() {
		return this.licenseColorCode;
	}

	public void setLicenseColorCode(String licenseColorCode) {
		this.licenseColorCode = licenseColorCode;
	}

	@Column(name = "CARKINDCODE", length=4)
	public String getCarKindCode() {
		return this.carKindCode;
	}

	public void setCarKindCode(String carKindCode) {
		this.carKindCode = carKindCode;
	}

	@Column(name = "HKFLAG", length=1)
	public String getHkFlag() {
		return this.hkFlag;
	}

	public void setHkFlag(String hkFlag) {
		this.hkFlag = hkFlag;
	}

	@Column(name = "HKLICENSENO", length=20)
	public String getHkLicenseNo() {
		return this.hkLicenseNo;
	}

	public void setHkLicenseNo(String hkLicenseNo) {
		this.hkLicenseNo = hkLicenseNo;
	}

	@Column(name = "ENGINENO", nullable = false, length=30)
	public String getEngineNo() {
		return this.engineNo;
	}

	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}

	@Column(name = "VINNO", length=18)
	public String getVinNo() {
		return this.vinNo;
	}

	public void setVinNo(String vinNo) {
		this.vinNo = vinNo;
	}

	@Column(name = "FRAMENO", length=30)
	public String getFrameNo() {
		return this.frameNo;
	}

	public void setFrameNo(String frameNo) {
		this.frameNo = frameNo;
	}

	@Column(name = "RUNAREACODE", length=10)
	public String getRunAreaCode() {
		return this.runAreaCode;
	}

	public void setRunAreaCode(String runAreaCode) {
		this.runAreaCode = runAreaCode;
	}

	@Column(name = "RUNAREANAME", length=60)
	public String getRunAreaName() {
		return this.runAreaName;
	}

	public void setRunAreaName(String runAreaName) {
		this.runAreaName = runAreaName;
	}

	@Column(name = "RUNMILES", precision=14)
	public BigDecimal getRunMiles() {
		return this.runMiles;
	}

	public void setRunMiles(BigDecimal runMiles) {
		this.runMiles = runMiles;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ENROLLDATE", length=7)
	public Date getEnrollDate() {
		return this.enrollDate;
	}

	public void setEnrollDate(Date enrollDate) {
		this.enrollDate = enrollDate;
	}

	@Column(name = "USEYEARS", precision=15, scale=0)
	public Long getUseYears() {
		return this.useYears;
	}

	public void setUseYears(Long useYears) {
		this.useYears = useYears;
	}

	@Column(name = "MODELCODE", length=24)
	public String getModelCode() {
		return this.modelCode;
	}

	public void setModelCode(String modelCode) {
		this.modelCode = modelCode;
	}

	@Column(name = "BRANDNAME", nullable = false, length=100)
	public String getBrandName() {
		return this.brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	@Column(name = "COUNTRYNATURE", length=1)
	public String getCountryNature() {
		return this.countryNature;
	}

	public void setCountryNature(String countryNature) {
		this.countryNature = countryNature;
	}

	@Column(name = "COUNTRYCODE", length=3)
	public String getCountryCode() {
		return this.countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	@Column(name = "USENATURECODE", length=2)
	public String getUseNatureCode() {
		return this.useNatureCode;
	}

	public void setUseNatureCode(String useNatureCode) {
		this.useNatureCode = useNatureCode;
	}

	@Column(name = "BUSINESSCLASSCODE", length=1)
	public String getBusinessClassCode() {
		return this.businessClassCode;
	}

	public void setBusinessClassCode(String businessClassCode) {
		this.businessClassCode = businessClassCode;
	}

	@Column(name = "SEATCOUNT", precision=15, scale=0)
	public Long getSeatCount() {
		return this.seatCount;
	}

	public void setSeatCount(Long seatCount) {
		this.seatCount = seatCount;
	}

	@Column(name = "TONCOUNT", precision=12, scale=4)
	public BigDecimal getTonCount() {
		return this.tonCount;
	}

	public void setTonCount(BigDecimal tonCount) {
		this.tonCount = tonCount;
	}

	@Column(name = "EXHAUSTSCALE", precision=8, scale=4)
	public BigDecimal getExhaustScale() {
		return this.exhaustScale;
	}

	public void setExhaustScale(BigDecimal exhaustScale) {
		this.exhaustScale = exhaustScale;
	}

	@Column(name = "COLORCODE", length=6)
	public String getColorCode() {
		return this.colorCode;
	}

	public void setColorCode(String colorCode) {
		this.colorCode = colorCode;
	}

	@Column(name = "SAFEDEVICE", length=30)
	public String getSafeDevice() {
		return this.safeDevice;
	}

	public void setSafeDevice(String safeDevice) {
		this.safeDevice = safeDevice;
	}

	@Column(name = "PARKSITE", length=30)
	public String getParkSite() {
		return this.parkSite;
	}

	public void setParkSite(String parkSite) {
		this.parkSite = parkSite;
	}

	@Column(name = "OWNERADDRESS", length=40)
	public String getOwnerAddress() {
		return this.ownerAddress;
	}

	public void setOwnerAddress(String ownerAddress) {
		this.ownerAddress = ownerAddress;
	}

	@Column(name = "OTHERNATURE", length=10)
	public String getOtherNature() {
		return this.otherNature;
	}

	public void setOtherNature(String otherNature) {
		this.otherNature = otherNature;
	}

	@Column(name = "RATECODE", length=8)
	public String getRateCode() {
		return this.rateCode;
	}

	public void setRateCode(String rateCode) {
		this.rateCode = rateCode;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "MAKEDATE", length=7)
	public Date getMakeDate() {
		return this.makeDate;
	}

	public void setMakeDate(Date makeDate) {
		this.makeDate = makeDate;
	}

	@Column(name = "CARUSAGE", length=20)
	public String getCarUsage() {
		return this.carUsage;
	}

	public void setCarUsage(String carUsage) {
		this.carUsage = carUsage;
	}

	@Column(name = "CURRENCY", length=3)
	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	@Column(name = "PURCHASEPRICE", precision=14)
	public BigDecimal getPurchasePrice() {
		return this.purchasePrice;
	}

	public void setPurchasePrice(BigDecimal purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	@Column(name = "ACTUALVALUE", precision=14)
	public BigDecimal getActualValue() {
		return this.actualValue;
	}

	public void setActualValue(BigDecimal actualValue) {
		this.actualValue = actualValue;
	}

	@Column(name = "INVOICENO", length=20)
	public String getInvoiceNo() {
		return this.invoiceNo;
	}

	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	@Column(name = "CARLOANFLAG", length=1)
	public String getCarLoanFlag() {
		return this.carLoanFlag;
	}

	public void setCarLoanFlag(String carLoanFlag) {
		this.carLoanFlag = carLoanFlag;
	}

	@Column(name = "INSURERCODE", length=2)
	public String getInsurerCode() {
		return this.insurerCode;
	}

	public void setInsurerCode(String insurerCode) {
		this.insurerCode = insurerCode;
	}

	@Column(name = "LASTINSURER", length=40)
	public String getLastInsurer() {
		return this.lastInsurer;
	}

	public void setLastInsurer(String lastInsurer) {
		this.lastInsurer = lastInsurer;
	}

	@Column(name = "CARCHECKSTATUS", length=2)
	public String getCarCheckStatus() {
		return this.carCheckStatus;
	}

	public void setCarCheckStatus(String carCheckStatus) {
		this.carCheckStatus = carCheckStatus;
	}

	@Column(name = "CARCHECKER", length=60)
	public String getCarChecker() {
		return this.carChecker;
	}

	public void setCarChecker(String carChecker) {
		this.carChecker = carChecker;
	}

	@Column(name = "CARCHECKTIME", length=16)
	public String getCarCheckTime() {
		return this.carCheckTime;
	}

	public void setCarCheckTime(String carCheckTime) {
		this.carCheckTime = carCheckTime;
	}

	@Column(name = "SPECIALTREAT", precision=14)
	public BigDecimal getSpecialTreat() {
		return this.specialTreat;
	}

	public void setSpecialTreat(BigDecimal specialTreat) {
		this.specialTreat = specialTreat;
	}

	@Column(name = "RELIEVINGAREACODE", length=2)
	public String getRelievingAreaCode() {
		return this.relievingAreaCode;
	}

	public void setRelievingAreaCode(String relievingAreaCode) {
		this.relievingAreaCode = relievingAreaCode;
	}

	@Column(name = "ADDONCOUNT", precision=15, scale=0)
	public Long getAddonCount() {
		return this.addonCount;
	}

	public void setAddonCount(Long addonCount) {
		this.addonCount = addonCount;
	}

	@Column(name = "CARDEALERCODE", length=16)
	public String getCarDealerCode() {
		return this.carDealerCode;
	}

	public void setCarDealerCode(String carDealerCode) {
		this.carDealerCode = carDealerCode;
	}

	@Column(name = "CARDEALERNAME", length=120)
	public String getCarDealerName() {
		return this.carDealerName;
	}

	public void setCarDealerName(String carDealerName) {
		this.carDealerName = carDealerName;
	}

	@Column(name = "REMARK", length=40)
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Column(name = "FLAG", length=2)
	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	@Column(name = "CARCHECKREASON", length=60)
	public String getCarcheckReason() {
		return this.carcheckReason;
	}

	public void setCarcheckReason(String carcheckReason) {
		this.carcheckReason = carcheckReason;
	}

	@Column(name = "LVIOLATEDTIMES", precision=15, scale=0)
	public Long getLviolatedTimes() {
		return this.lviolatedTimes;
	}

	public void setLviolatedTimes(Long lviolatedTimes) {
		this.lviolatedTimes = lviolatedTimes;
	}

	@Column(name = "SVIOLATEDTIMES", precision=15, scale=0)
	public Long getSviolatedTimes() {
		return this.sviolatedTimes;
	}

	public void setSviolatedTimes(Long sviolatedTimes) {
		this.sviolatedTimes = sviolatedTimes;
	}

	@Column(name = "LICENSEKINDCODE", length=2)
	public String getLicenseKindCode() {
		return this.licenseKindCode;
	}

	public void setLicenseKindCode(String licenseKindCode) {
		this.licenseKindCode = licenseKindCode;
	}

	@Column(name = "REGISTMODELCODE", length=60)
	public String getRegistModelCode() {
		return this.registModelCode;
	}

	public void setRegistModelCode(String registModelCode) {
		this.registModelCode = registModelCode;
	}

	@Column(name = "SECONDHANDCARFLAG", length=2)
	public String getSecondHandCarFlag() {
		return this.secondHandCarFlag;
	}

	public void setSecondHandCarFlag(String secondHandCarFlag) {
		this.secondHandCarFlag = secondHandCarFlag;
	}

	@Column(name = "SECONDHANDCARPRICE", precision=14)
	public BigDecimal getSecondHandCarPrice() {
		return this.secondHandCarPrice;
	}

	public void setSecondHandCarPrice(BigDecimal secondHandCarPrice) {
		this.secondHandCarPrice = secondHandCarPrice;
	}

	@Column(name = "RUNAREADESC")
	public String getRunAreadesc() {
		return this.runAreadesc;
	}

	public void setRunAreadesc(String runAreadesc) {
		this.runAreadesc = runAreadesc;
	}

	@Column(name = "LICENSENO1", length=20)
	public String getLicenseNo1() {
		return this.licenseNo1;
	}

	public void setLicenseNo1(String licenseNo1) {
		this.licenseNo1 = licenseNo1;
	}

	@Column(name = "VISACODE", length=20)
	public String getVisaCode() {
		return this.visaCode;
	}

	public void setVisaCode(String visaCode) {
		this.visaCode = visaCode;
	}

	@Column(name = "CARATTACHNATURE", length=10)
	public String getCarAttachNature() {
		return this.carAttachNature;
	}

	public void setCarAttachNature(String carAttachNature) {
		this.carAttachNature = carAttachNature;
	}

	@Column(name = "ALLMASS", precision=22, scale=12)
	public BigDecimal getAllMass() {
		return this.allMass;
	}

	public void setAllMass(BigDecimal allMass) {
		this.allMass = allMass;
	}

	@Column(name = "USEKINDCODE", length=10)
	public String getUseKindCode() {
		return this.useKindCode;
	}

	public void setUseKindCode(String useKindCode) {
		this.useKindCode = useKindCode;
	}

	@Column(name = "CARTYPE", length=10)
	public String getCarType() {
		return this.carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	@Column(name = "SEATCOUNTSHOW", precision=15, scale=0)
	public Long getSeatCountShow() {
		return this.seatCountShow;
	}

	public void setSeatCountShow(Long seatCountShow) {
		this.seatCountShow = seatCountShow;
	}

	@Column(name = "TONCOUNTSHOW", precision=12, scale=4)
	public BigDecimal getTonCountShow() {
		return this.tonCountShow;
	}

	public void setTonCountShow(BigDecimal tonCountShow) {
		this.tonCountShow = tonCountShow;
	}

	@Column(name = "EXHAUSTSCALESHOW", precision=8, scale=4)
	public BigDecimal getExhaustScaleShow() {
		return this.exhaustScaleShow;
	}

	public void setExhaustScaleShow(BigDecimal exhaustScaleShow) {
		this.exhaustScaleShow = exhaustScaleShow;
	}

	@Column(name = "VEHICLEBRAND", length=64)
	public String getVehicleBrand() {
		return this.vehicleBrand;
	}

	public void setVehicleBrand(String vehicleBrand) {
		this.vehicleBrand = vehicleBrand;
	}

	@Column(name = "VEHICLESTYLEDESC", length=128)
	public String getVehicleStyleDesc() {
		return this.vehicleStyleDesc;
	}

	public void setVehicleStyleDesc(String vehicleStyleDesc) {
		this.vehicleStyleDesc = vehicleStyleDesc;
	}

	@Column(name = "CARMODELID", length=64)
	public String getCarModelid() {
		return this.carModelid;
	}

	public void setCarModelid(String carModelid) {
		this.carModelid = carModelid;
	}

	@Column(name = "VEHICLECODE", length=64)
	public String getVehicleCode() {
		return this.vehicleCode;
	}

	public void setVehicleCode(String vehicleCode) {
		this.vehicleCode = vehicleCode;
	}

	@Column(name = "VEHICLESTYLE", length=3)
	public String getVehicleStyle() {
		return this.vehicleStyle;
	}

	public void setVehicleStyle(String vehicleStyle) {
		this.vehicleStyle = vehicleStyle;
	}

	@Column(name = "WHOLEWEIGHT", precision=8, scale=0)
	public Integer getWholeWeight() {
		return this.wholeWeight;
	}

	public void setWholeWeight(Integer wholeWeight) {
		this.wholeWeight = wholeWeight;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "INEFFECTUALDATE", length=7)
	public Date getIneffectualDate() {
		return this.ineffectualDate;
	}

	public void setIneffectualDate(Date ineffectualDate) {
		this.ineffectualDate = ineffectualDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "REJECTDATE", length=7)
	public Date getRejectDate() {
		return this.rejectDate;
	}

	public void setRejectDate(Date rejectDate) {
		this.rejectDate = rejectDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LASTCHECKDATE", length=7)
	public Date getLastCheckDate() {
		return this.lastCheckDate;
	}

	public void setLastCheckDate(Date lastCheckDate) {
		this.lastCheckDate = lastCheckDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "TRANSFERDATE", length=7)
	public Date getTransferDate() {
		return this.transferDate;
	}

	public void setTransferDate(Date transferDate) {
		this.transferDate = transferDate;
	}

	@Column(name = "DEFINE1", length=50)
	public String getDefine1() {
		return this.define1;
	}

	public void setDefine1(String define1) {
		this.define1 = define1;
	}

	@Column(name = "DEFINE2", length=50)
	public String getDefine2() {
		return this.define2;
	}

	public void setDefine2(String define2) {
		this.define2 = define2;
	}

	@Column(name = "DEFINE3", length=50)
	public String getDefine3() {
		return this.define3;
	}

	public void setDefine3(String define3) {
		this.define3 = define3;
	}

	@Column(name = "NOCARSHIPFLAG", length=1)
	public String getNoCarShipFlag() {
		return this.noCarShipFlag;
	}

	public void setNoCarShipFlag(String noCarShipFlag) {
		this.noCarShipFlag = noCarShipFlag;
	}

	@Column(name = "FUELTYPE", length=2)
	public String getFuelType() {
		return this.fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	@Column(name = "MADEFACTORY", length=200)
	public String getMadeFactory() {
		return this.madeFactory;
	}

	public void setMadeFactory(String madeFactory) {
		this.madeFactory = madeFactory;
	}

	@Column(name = "CARACTUALVALUETRUE", length=20)
	public String getCarActualValueTrue() {
		return this.carActualValueTrue;
	}

	public void setCarActualValueTrue(String carActualValueTrue) {
		this.carActualValueTrue = carActualValueTrue;
	}

	@Column(name = "REDPRICEFLAG", length=1)
	public String getRedPriceFlag() {
		return this.redPriceFlag;
	}

	public void setRedPriceFlag(String redPriceFlag) {
		this.redPriceFlag = redPriceFlag;
	}

	@Column(name = "SEX", length=1)
	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "BIRTHDAY", length=7)
	public Date getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Column(name = "BASICRATECODE", length=50)
	public String getBasicratecode() {
		return this.basicratecode;
	}

	public void setBasicratecode(String basicratecode) {
		this.basicratecode = basicratecode;
	}

	@Column(name = "NOTICETYPE", length=30)
	public String getNoticetype() {
		return this.noticetype;
	}

	public void setNoticetype(String noticetype) {
		this.noticetype = noticetype;
	}

	@Column(name = "CARNAME", length=200)
	public String getCarname() {
		return this.carname;
	}

	public void setCarname(String carname) {
		this.carname = carname;
	}

	@Column(name = "MOBILECARDNUMBER", length=50)
	public String getMobilecardnumber() {
		return this.mobilecardnumber;
	}

	public void setMobilecardnumber(String mobilecardnumber) {
		this.mobilecardnumber = mobilecardnumber;
	}

	@Column(name = "STARTPLACE")
	public String getStartplace() {
		return this.startplace;
	}

	public void setStartplace(String startplace) {
		this.startplace = startplace;
	}

	@Column(name = "DESTINATION")
	public String getDestination() {
		return this.destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}
}
