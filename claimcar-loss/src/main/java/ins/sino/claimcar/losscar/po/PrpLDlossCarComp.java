package ins.sino.claimcar.losscar.po;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
import java.math.BigDecimal;
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
 * POJO Class PrpLDlossCarComp
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@TableGenerator(name = "utiSequence", table = "UTISEQUENCE", pkColumnName = "GenName", valueColumnName = "GenValue", pkColumnValue = "PRPLDLOSSCARCOMP_PK", allocationSize = 10)
@Table(name = "PRPLDLOSSCARCOMP")
public class PrpLDlossCarComp implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private PrpLDlossCarMain prpLDlossCarMain;
	private String riskCode;
	private String claimNo;
	private String registNo;
	private String policyNo;
	private Integer serialNo;
	private Long itemKindNo;
	private String kindCode;
	private String kindName;
	private String lossItemCode;
	private String licenseNo;
	private String licenseColorCode;
	private String carKindCode;
	private String makeYear;
	private String gearboxType;
	private String quoteCompanyGrade;
	private BigDecimal manageFeeRate;
	private String repairFactoryCode;
	private String repairFactoryName;
	private String handlerCode;
	private Date repairStartDate;
	private Date repairEndDate;
	private String partDesc;
	private String sanctioner;
	private String approverCode;
	private String operatorCode;
	private String compCode;
	private String compName;
	private Integer quantity;
	private BigDecimal manHourFee;
	private BigDecimal materialFee;
	private BigDecimal queryPrice;
	private BigDecimal quotedPrice;
	private BigDecimal lossRate;
	private String currency;
	private BigDecimal sumDefLoss;
	private String remark;
	private String flag;
	private BigDecimal manHour;
	private BigDecimal manHourUnitPrice;
	private BigDecimal materialQuantity;
	private BigDecimal materialUnitPrice;
	private BigDecimal sumCheckLoss;
	private Integer veriQuantity;
	private BigDecimal veriManHourFee;
	private BigDecimal veriMaterFee;
	private BigDecimal veriLossRate;
	private BigDecimal sumVeriLoss;
	private String veriRemark;
	private BigDecimal veriRestFee;
	private BigDecimal sumReject;
	private String rejectReason;
	private BigDecimal restFee;
	private String backCheckRemark;
	private String partCode;
	private String partName;
	private String originalId;
	private BigDecimal sys4SPrice;
	private BigDecimal sysMarketPrice;
	private BigDecimal sysMatchPrice;
	private BigDecimal native4SPrice;
	private BigDecimal nativeMarketPrice;
	private BigDecimal nativeMatchPrice;
	private BigDecimal verpCompPrice;
	private String indId;
	private BigDecimal firstMaterialFee;
	private String verpoFlag;
	private String compensateBackFlag;
	private String priceType;
	private BigDecimal repairFactoryFee;
	private String reclaimFlag;
	private String veripRemark;
	private BigDecimal veripMaterFee;
	private String originalName;
	private String partGroupCode;
	private String partGroupName;
	private String selfConfigFlag;
	private BigDecimal veripRestFee;
	private BigDecimal auditLossCount;
	private BigDecimal auditCount;
	private BigDecimal chgRefPrice;
	private BigDecimal chgLocPrice;
	private String reCheckFlag;
	private Integer replaceNum;
	private String recycleFlag;
	private String wadFlag;
	private BigDecimal manageSingleRate;
	private BigDecimal manageSingleFee;
	private BigDecimal selfPayRate;
	private BigDecimal auditDiscountFee;
	private BigDecimal auditDiscount;
	private BigDecimal veripManageRate; // 核价管理费比率
	private BigDecimal veripManageFee; // 核价管理费
	private String recyclePartFlag;// 回收方式
	private BigDecimal dLChkAuditMaterialFee;// 复检材料费
	private BigDecimal dLChkAuditCount;// 复检数量
	private BigDecimal dLChkAuditManpowerFee;// 复检人工费
	private BigDecimal dLChkApprPartSum;// 复检换件小计
	private BigDecimal dLChkApprRemainsPrice;// 复检残值
	private BigDecimal dLChkManageRate;// 复检管理费率
	private BigDecimal dLChkApprManageFee;// 复检管理费
	private String dLChkCheckState;// 复检状态
	private String dLChkRemark;// 复检备注
	private String directSupplyFlag; //配件直供标志
		private String isYangJie; // 是否送阳杰了;1为已送
	private String yJAskPrivceFlag;//阳杰询价标志0-未讯价，1已询价
	
	public String getDirectSupplyFlag() {
		return directSupplyFlag;
	}

	public void setDirectSupplyFlag(String directSupplyFlag) {
		this.directSupplyFlag = directSupplyFlag;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "utiSequence")
	@Column(name = "ID", unique = true, nullable = false, precision=12, scale=0)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name = "VERIPMANAGERATE", precision=12)
	public BigDecimal getVeripManageRate() {
		return veripManageRate;
	}

	public void setVeripManageRate(BigDecimal veripManageRate) {
		this.veripManageRate = veripManageRate;
	}

	@Column(name = "VERIPMANAGEFEE", precision=12)
	public BigDecimal getVeripManageFee() {
		return veripManageFee;
	}

	public void setVeripManageFee(BigDecimal veripManageFee) {
		this.veripManageFee = veripManageFee;
	}

	@Column(name = "AUDITDISCOUNTFEE", precision=12)
	public BigDecimal getAuditDiscountFee() {
		return auditDiscountFee;
	}

	public void setAuditDiscountFee(BigDecimal auditDiscountFee) {
		this.auditDiscountFee = auditDiscountFee;
	}

	@Column(name = "AUDITDISCOUNT", precision=12)
	public BigDecimal getAuditDiscount() {
		return auditDiscount;
	}

	public void setAuditDiscount(BigDecimal auditDiscount) {
		this.auditDiscount = auditDiscount;
	}

	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="LOSSCARMAINID", nullable = false)
	public PrpLDlossCarMain getPrpLDlossCarMain() {
		return this.prpLDlossCarMain;
	}

	public void setPrpLDlossCarMain(PrpLDlossCarMain prpLDlossCarMain) {
		this.prpLDlossCarMain = prpLDlossCarMain;
	}

	@Column(name = "RISKCODE", nullable = false, length=4)
	public String getRiskCode() {
		return this.riskCode;
	}

	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}

	@Column(name = "CLAIMNO", length=22)
	public String getClaimNo() {
		return this.claimNo;
	}

	public void setClaimNo(String claimNo) {
		this.claimNo = claimNo;
	}

	@Column(name = "REGISTNO", nullable = false, length=25)
	public String getRegistNo() {
		return this.registNo;
	}

	public void setRegistNo(String registNo) {
		this.registNo = registNo;
	}

	@Column(name = "POLICYNO", length=25)
	public String getPolicyNo() {
		return this.policyNo;
	}

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	@Column(name = "SERIALNO", nullable = false, precision=8, scale=0)
	public Integer getSerialNo() {
		return this.serialNo;
	}

	public void setSerialNo(Integer serialNo) {
		this.serialNo = serialNo;
	}

	@Column(name = "ITEMKINDNO", nullable = false, precision=10, scale=0)
	public Long getItemKindNo() {
		return this.itemKindNo;
	}

	public void setItemKindNo(Long itemKindNo) {
		this.itemKindNo = itemKindNo;
	}
	@Column(name = "KINDNAME")
	public String getKindName() {
		return kindName;
	}
	
	public void setKindName(String kindName) {
		this.kindName = kindName;
	}

	@Column(name = "KINDCODE", nullable = false, length=7)
	public String getKindCode() {
		return this.kindCode;
	}

	public void setKindCode(String kindCode) {
		this.kindCode = kindCode;
	}

	@Column(name = "LOSSITEMCODE", length=4)
	public String getLossItemCode() {
		return this.lossItemCode;
	}

	public void setLossItemCode(String lossItemCode) {
		this.lossItemCode = lossItemCode;
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

	@Column(name = "MAKEYEAR", length=4)
	public String getMakeYear() {
		return this.makeYear;
	}

	public void setMakeYear(String makeYear) {
		this.makeYear = makeYear;
	}

	@Column(name = "GEARBOXTYPE", length=1)
	public String getGearboxType() {
		return this.gearboxType;
	}

	public void setGearboxType(String gearboxType) {
		this.gearboxType = gearboxType;
	}

	@Column(name = "QUOTECOMPANYGRADE", length=1)
	public String getQuoteCompanyGrade() {
		return this.quoteCompanyGrade;
	}

	public void setQuoteCompanyGrade(String quoteCompanyGrade) {
		this.quoteCompanyGrade = quoteCompanyGrade;
	}

	@Column(name = "MANAGEFEERATE", precision=4)
	public BigDecimal getManageFeeRate() {
		return this.manageFeeRate;
	}

	public void setManageFeeRate(BigDecimal manageFeeRate) {
		this.manageFeeRate = manageFeeRate;
	}

	@Column(name = "REPAIRFACTORYCODE", length=10)
	public String getRepairFactoryCode() {
		return this.repairFactoryCode;
	}

	public void setRepairFactoryCode(String repairFactoryCode) {
		this.repairFactoryCode = repairFactoryCode;
	}

	@Column(name = "REPAIRFACTORYNAME", length=50)
	public String getRepairFactoryName() {
		return this.repairFactoryName;
	}

	public void setRepairFactoryName(String repairFactoryName) {
		this.repairFactoryName = repairFactoryName;
	}

	@Column(name = "HANDLERCODE", length=14)
	public String getHandlerCode() {
		return this.handlerCode;
	}

	public void setHandlerCode(String handlerCode) {
		this.handlerCode = handlerCode;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "REPAIRSTARTDATE", length=7)
	public Date getRepairStartDate() {
		return this.repairStartDate;
	}

	public void setRepairStartDate(Date repairStartDate) {
		this.repairStartDate = repairStartDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "REPAIRENDDATE", length=7)
	public Date getRepairEndDate() {
		return this.repairEndDate;
	}

	public void setRepairEndDate(Date repairEndDate) {
		this.repairEndDate = repairEndDate;
	}

	@Column(name = "PARTDESC", length=100)
	public String getPartDesc() {
		return this.partDesc;
	}

	public void setPartDesc(String partDesc) {
		this.partDesc = partDesc;
	}

	@Column(name = "SANCTIONER", length=10)
	public String getSanctioner() {
		return this.sanctioner;
	}

	public void setSanctioner(String sanctioner) {
		this.sanctioner = sanctioner;
	}

	@Column(name = "APPROVERCODE", length=10)
	public String getApproverCode() {
		return this.approverCode;
	}

	public void setApproverCode(String approverCode) {
		this.approverCode = approverCode;
	}

	@Column(name = "OPERATORCODE", length=10)
	public String getOperatorCode() {
		return this.operatorCode;
	}

	public void setOperatorCode(String operatorCode) {
		this.operatorCode = operatorCode;
	}

	@Column(name = "COMPCODE", nullable = false, length=20)
	public String getCompCode() {
		return this.compCode;
	}

	public void setCompCode(String compCode) {
		this.compCode = compCode;
	}

	@Column(name = "COMPNAME", length=80)
	public String getCompName() {
		return this.compName;
	}

	public void setCompName(String compName) {
		this.compName = compName;
	}

	@Column(name = "QUANTITY", precision=8, scale=0)
	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Column(name = "MANHOURFEE", precision=14)
	public BigDecimal getManHourFee() {
		return this.manHourFee;
	}

	public void setManHourFee(BigDecimal manHourFee) {
		this.manHourFee = manHourFee;
	}

	@Column(name = "MATERIALFEE", precision=14)
	public BigDecimal getMaterialFee() {
		return this.materialFee;
	}

	public void setMaterialFee(BigDecimal materialFee) {
		this.materialFee = materialFee;
	}

	@Column(name = "QUERYPRICE", precision=14)
	public BigDecimal getQueryPrice() {
		return this.queryPrice;
	}

	public void setQueryPrice(BigDecimal queryPrice) {
		this.queryPrice = queryPrice;
	}

	@Column(name = "QUOTEDPRICE", precision=14)
	public BigDecimal getQuotedPrice() {
		return this.quotedPrice;
	}

	public void setQuotedPrice(BigDecimal quotedPrice) {
		this.quotedPrice = quotedPrice;
	}

	@Column(name = "LOSSRATE", precision=8, scale=4)
	public BigDecimal getLossRate() {
		return this.lossRate;
	}

	public void setLossRate(BigDecimal lossRate) {
		this.lossRate = lossRate;
	}

	@Column(name = "CURRENCY", length=3)
	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	@Column(name = "SUMDEFLOSS", precision=14)
	public BigDecimal getSumDefLoss() {
		return this.sumDefLoss;
	}

	public void setSumDefLoss(BigDecimal sumDefLoss) {
		this.sumDefLoss = sumDefLoss;
	}

	@Column(name = "REMARK", length=60)
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

	@Column(name = "MANHOUR", precision=14)
	public BigDecimal getManHour() {
		return this.manHour;
	}

	public void setManHour(BigDecimal manHour) {
		this.manHour = manHour;
	}

	@Column(name = "MANHOURUNITPRICE", precision=14)
	public BigDecimal getManHourUnitPrice() {
		return this.manHourUnitPrice;
	}

	public void setManHourUnitPrice(BigDecimal manHourUnitPrice) {
		this.manHourUnitPrice = manHourUnitPrice;
	}

	@Column(name = "MATERIALQUANTITY", precision=10)
	public BigDecimal getMaterialQuantity() {
		return this.materialQuantity;
	}

	public void setMaterialQuantity(BigDecimal materialQuantity) {
		this.materialQuantity = materialQuantity;
	}

	@Column(name = "MATERIALUNITPRICE", precision=14)
	public BigDecimal getMaterialUnitPrice() {
		return this.materialUnitPrice;
	}

	public void setMaterialUnitPrice(BigDecimal materialUnitPrice) {
		this.materialUnitPrice = materialUnitPrice;
	}

	@Column(name = "SUMCHECKLOSS", precision=14)
	public BigDecimal getSumCheckLoss() {
		return this.sumCheckLoss;
	}

	public void setSumCheckLoss(BigDecimal sumCheckLoss) {
		this.sumCheckLoss = sumCheckLoss;
	}

	@Column(name = "VERIQUANTITY", precision=8, scale=0)
	public Integer getVeriQuantity() {
		return this.veriQuantity;
	}

	public void setVeriQuantity(Integer veriQuantity) {
		this.veriQuantity = veriQuantity;
	}

	@Column(name = "VERIMANHOURFEE", precision=14)
	public BigDecimal getVeriManHourFee() {
		return this.veriManHourFee;
	}

	public void setVeriManHourFee(BigDecimal veriManHourFee) {
		this.veriManHourFee = veriManHourFee;
	}

	@Column(name = "VERIMATERFEE", precision=14)
	public BigDecimal getVeriMaterFee() {
		return this.veriMaterFee;
	}

	public void setVeriMaterFee(BigDecimal veriMaterFee) {
		this.veriMaterFee = veriMaterFee;
	}

	@Column(name = "VERILOSSRATE", precision=8, scale=4)
	public BigDecimal getVeriLossRate() {
		return this.veriLossRate;
	}

	public void setVeriLossRate(BigDecimal veriLossRate) {
		this.veriLossRate = veriLossRate;
	}

	@Column(name = "SUMVERILOSS", precision=14)
	public BigDecimal getSumVeriLoss() {
		return this.sumVeriLoss;
	}

	public void setSumVeriLoss(BigDecimal sumVeriLoss) {
		this.sumVeriLoss = sumVeriLoss;
	}

	@Column(name = "VERIREMARK", length=60)
	public String getVeriRemark() {
		return this.veriRemark;
	}

	public void setVeriRemark(String veriRemark) {
		this.veriRemark = veriRemark;
	}

	@Column(name = "VERIRESTFEE", precision=14)
	public BigDecimal getVeriRestFee() {
		return this.veriRestFee;
	}

	public void setVeriRestFee(BigDecimal veriRestFee) {
		this.veriRestFee = veriRestFee;
	}

	@Column(name = "SUMREJECT", precision=14)
	public BigDecimal getSumReject() {
		return this.sumReject;
	}

	public void setSumReject(BigDecimal sumReject) {
		this.sumReject = sumReject;
	}

	@Column(name = "REJECTREASON", length=30)
	public String getRejectReason() {
		return this.rejectReason;
	}

	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}

	@Column(name = "RESTFEE", precision=14)
	public BigDecimal getRestFee() {
		return this.restFee;
	}

	public void setRestFee(BigDecimal restFee) {
		this.restFee = restFee;
	}

	@Column(name = "BACKCHECKREMARK")
	public String getBackCheckRemark() {
		return this.backCheckRemark;
	}

	public void setBackCheckRemark(String backCheckRemark) {
		this.backCheckRemark = backCheckRemark;
	}

	@Column(name = "PARTCODE", length=4)
	public String getPartCode() {
		return this.partCode;
	}

	public void setPartCode(String partCode) {
		this.partCode = partCode;
	}

	@Column(name = "PARTNAME", length=100)
	public String getPartName() {
		return this.partName;
	}

	public void setPartName(String partName) {
		this.partName = partName;
	}

	@Column(name = "ORIGINALID", length=50)
	public String getOriginalId() {
		return this.originalId;
	}

	public void setOriginalId(String originalId) {
		this.originalId = originalId;
	}

	@Column(name = "SYS4SPRICE", precision=14)
	public BigDecimal getSys4SPrice() {
		return this.sys4SPrice;
	}

	public void setSys4SPrice(BigDecimal sys4SPrice) {
		this.sys4SPrice = sys4SPrice;
	}

	@Column(name = "SYSMARKETPRICE", precision=14)
	public BigDecimal getSysMarketPrice() {
		return this.sysMarketPrice;
	}

	public void setSysMarketPrice(BigDecimal sysMarketPrice) {
		this.sysMarketPrice = sysMarketPrice;
	}

	@Column(name = "SYSMATCHPRICE", precision=14)
	public BigDecimal getSysMatchPrice() {
		return this.sysMatchPrice;
	}

	public void setSysMatchPrice(BigDecimal sysMatchPrice) {
		this.sysMatchPrice = sysMatchPrice;
	}

	@Column(name = "NATIVE4SPRICE", precision=14)
	public BigDecimal getNative4SPrice() {
		return this.native4SPrice;
	}

	public void setNative4SPrice(BigDecimal native4SPrice) {
		this.native4SPrice = native4SPrice;
	}

	@Column(name = "NATIVEMARKETPRICE", precision=14)
	public BigDecimal getNativeMarketPrice() {
		return this.nativeMarketPrice;
	}

	public void setNativeMarketPrice(BigDecimal nativeMarketPrice) {
		this.nativeMarketPrice = nativeMarketPrice;
	}

	@Column(name = "NATIVEMATCHPRICE", precision=14)
	public BigDecimal getNativeMatchPrice() {
		return this.nativeMatchPrice;
	}

	public void setNativeMatchPrice(BigDecimal nativeMatchPrice) {
		this.nativeMatchPrice = nativeMatchPrice;
	}

	@Column(name = "VERPCOMPPRICE", precision=14)
	public BigDecimal getVerpCompPrice() {
		return this.verpCompPrice;
	}

	public void setVerpCompPrice(BigDecimal verpCompPrice) {
		this.verpCompPrice = verpCompPrice;
	}

	@Column(name = "INDID", length=100)
	public String getIndId() {
		return this.indId;
	}

	public void setIndId(String indId) {
		this.indId = indId;
	}

	@Column(name = "FIRSTMATERIALFEE", precision=14)
	public BigDecimal getFirstMaterialFee() {
		return this.firstMaterialFee;
	}

	public void setFirstMaterialFee(BigDecimal firstMaterialFee) {
		this.firstMaterialFee = firstMaterialFee;
	}

	@Column(name = "VERPOFLAG", length=1)
	public String getVerpoFlag() {
		return this.verpoFlag;
	}

	public void setVerpoFlag(String verpoFlag) {
		this.verpoFlag = verpoFlag;
	}

	@Column(name = "COMPENSATEBACKFLAG", length=1)
	public String getCompensateBackFlag() {
		return this.compensateBackFlag;
	}

	public void setCompensateBackFlag(String compensateBackFlag) {
		this.compensateBackFlag = compensateBackFlag;
	}

	@Column(name = "PRICETYPE", length=20)
	public String getPriceType() {
		return this.priceType;
	}

	public void setPriceType(String priceType) {
		this.priceType = priceType;
	}

	@Column(name = "REPAIRFACTORYFEE", precision=14)
	public BigDecimal getRepairFactoryFee() {
		return this.repairFactoryFee;
	}

	public void setRepairFactoryFee(BigDecimal repairFactoryFee) {
		this.repairFactoryFee = repairFactoryFee;
	}

	@Column(name = "RECLAIMFLAG", length=1)
	public String getReclaimFlag() {
		return this.reclaimFlag;
	}

	public void setReclaimFlag(String reclaimFlag) {
		this.reclaimFlag = reclaimFlag;
	}

	@Column(name = "VERIPREMARK", length=100)
	public String getVeripRemark() {
		return this.veripRemark;
	}

	public void setVeripRemark(String veripRemark) {
		this.veripRemark = veripRemark;
	}

	@Column(name = "VERIPMATERFEE", precision=14)
	public BigDecimal getVeripMaterFee() {
		return this.veripMaterFee;
	}

	public void setVeripMaterFee(BigDecimal veripMaterFee) {
		this.veripMaterFee = veripMaterFee;
	}

	@Column(name = "ORIGINALNAME", length=100)
	public String getOriginalName() {
		return this.originalName;
	}

	public void setOriginalName(String originalName) {
		this.originalName = originalName;
	}

	@Column(name = "PARTGROUPCODE", length=60)
	public String getPartGroupCode() {
		return this.partGroupCode;
	}

	public void setPartGroupCode(String partGroupCode) {
		this.partGroupCode = partGroupCode;
	}

	@Column(name = "PARTGROUPNAME", length=60)
	public String getPartGroupName() {
		return this.partGroupName;
	}

	public void setPartGroupName(String partGroupName) {
		this.partGroupName = partGroupName;
	}

	@Column(name = "SELFCONFIGFLAG", length=2)
	public String getSelfConfigFlag() {
		return this.selfConfigFlag;
	}

	public void setSelfConfigFlag(String selfConfigFlag) {
		this.selfConfigFlag = selfConfigFlag;
	}

	@Column(name = "VERIPRESTFEE", precision=12)
	public BigDecimal getVeripRestFee() {
		return this.veripRestFee;
	}

	public void setVeripRestFee(BigDecimal veripRestFee) {
		this.veripRestFee = veripRestFee;
	}

	@Column(name = "AUDITLOSSCOUNT", precision=12)
	public BigDecimal getAuditLossCount() {
		return this.auditLossCount;
	}

	public void setAuditLossCount(BigDecimal auditLossCount) {
		this.auditLossCount = auditLossCount;
	}

	@Column(name = "AUDITCOUNT", precision=12)
	public BigDecimal getAuditCount() {
		return this.auditCount;
	}

	public void setAuditCount(BigDecimal auditCount) {
		this.auditCount = auditCount;
	}

	@Column(name = "CHGREFPRICE", precision=12)
	public BigDecimal getChgRefPrice() {
		return this.chgRefPrice;
	}

	public void setChgRefPrice(BigDecimal chgRefPrice) {
		this.chgRefPrice = chgRefPrice;
	}

	@Column(name = "CHGLOCPRICE", precision=12)
	public BigDecimal getChgLocPrice() {
		return this.chgLocPrice;
	}

	public void setChgLocPrice(BigDecimal chgLocPrice) {
		this.chgLocPrice = chgLocPrice;
	}

	@Column(name = "RECHECKFLAG", length=2)
	public String getReCheckFlag() {
		return this.reCheckFlag;
	}

	public void setReCheckFlag(String reCheckFlag) {
		this.reCheckFlag = reCheckFlag;
	}

	@Column(name = "REPLACENUM", precision=8, scale=0)
	public Integer getReplaceNum() {
		return this.replaceNum;
	}

	public void setReplaceNum(Integer replaceNum) {
		this.replaceNum = replaceNum;
	}

	@Column(name = "RECYCLEFLAG", length=1)
	public String getRecycleFlag() {
		return this.recycleFlag;
	}

	public void setRecycleFlag(String recycleFlag) {
		this.recycleFlag = recycleFlag;
	}
	@Column(name = "wadFlag")
	public String getWadFlag() {
		return wadFlag;
	}

	public void setWadFlag(String wadFlag) {
		this.wadFlag = wadFlag;
	}

	@Column(name = "ManageSingleRate", precision=14)
	public BigDecimal getManageSingleRate() {
		return manageSingleRate;
	}

	public void setManageSingleRate(BigDecimal manageSingleRate) {
		this.manageSingleRate = manageSingleRate;
	}

	@Column(name = "ManageSingleFee", precision=14)
	public BigDecimal getManageSingleFee() {
		return manageSingleFee;
	}

	public void setManageSingleFee(BigDecimal manageSingleFee) {
		this.manageSingleFee = manageSingleFee;
	}

	@Column(name = "SelfPayRate", precision=14)
	public BigDecimal getSelfPayRate() {
		return selfPayRate;
	}

	public void setSelfPayRate(BigDecimal selfPayRate) {
		this.selfPayRate = selfPayRate;
	}
	
	@Column(name = "RECYCLEPARTFLAG", precision=2)
	public String getRecyclePartFlag() {
		return recyclePartFlag;
	}

	public void setRecyclePartFlag(String recyclePartFlag) {
		this.recyclePartFlag = recyclePartFlag;
	}

	@Column(name = "DLCHKAUDITMATERIALFEE", precision = 12, scale = 2)
	public BigDecimal getdLChkAuditMaterialFee() {
		return dLChkAuditMaterialFee;
	}

	public void setdLChkAuditMaterialFee(BigDecimal dLChkAuditMaterialFee) {
		this.dLChkAuditMaterialFee = dLChkAuditMaterialFee;
	}

	@Column(name = "DLCHKAUDITCOUNT", precision = 12, scale = 2)
	public BigDecimal getdLChkAuditCount() {
		return dLChkAuditCount;
	}

	public void setdLChkAuditCount(BigDecimal dLChkAuditCount) {
		this.dLChkAuditCount = dLChkAuditCount;
	}

	@Column(name = "DLCHKAUDITMANPOWERFEE", precision = 12, scale = 2)
	public BigDecimal getdLChkAuditManpowerFee() {
		return dLChkAuditManpowerFee;
	}

	public void setdLChkAuditManpowerFee(BigDecimal dLChkAuditManpowerFee) {
		this.dLChkAuditManpowerFee = dLChkAuditManpowerFee;
	}

	@Column(name = "DLCHKAPPRPARTSUM", precision = 12, scale = 2)
	public BigDecimal getdLChkApprPartSum() {
		return dLChkApprPartSum;
	}

	public void setdLChkApprPartSum(BigDecimal dLChkApprPartSum) {
		this.dLChkApprPartSum = dLChkApprPartSum;
	}

	@Column(name = "DLCHKAPPRREMAINSPRICE", precision = 12, scale = 2)
	public BigDecimal getdLChkApprRemainsPrice() {
		return dLChkApprRemainsPrice;
	}

	public void setdLChkApprRemainsPrice(BigDecimal dLChkApprRemainsPrice) {
		this.dLChkApprRemainsPrice = dLChkApprRemainsPrice;
	}

	@Column(name = "DLCHKMANAGERATE", precision = 12, scale = 2)
	public BigDecimal getdLChkManageRate() {
		return dLChkManageRate;
	}

	public void setdLChkManageRate(BigDecimal dLChkManageRate) {
		this.dLChkManageRate = dLChkManageRate;
	}

	@Column(name = "DLCHKAPPRMANAGEFEE", precision = 12, scale = 2)
	public BigDecimal getdLChkApprManageFee() {
		return dLChkApprManageFee;
	}

	public void setdLChkApprManageFee(BigDecimal dLChkApprManageFee) {
		this.dLChkApprManageFee = dLChkApprManageFee;
	}

	@Column(name = "DLCHKCHECKSTATE", length = 3)
	public String getdLChkCheckState() {
		return dLChkCheckState;
	}

	public void setdLChkCheckState(String dLChkCheckState) {
		this.dLChkCheckState = dLChkCheckState;
	}

	@Column(name = "DLCHKREMARK", length = 1500)
	public String getdLChkRemark() {
		return dLChkRemark;
	}

	public void setdLChkRemark(String dLChkRemark) {
		this.dLChkRemark = dLChkRemark;
	}
	@Column(name = "YJASKPRIVCEFLAG", length = 20)
	public String getyJAskPrivceFlag() {
		return yJAskPrivceFlag;
	}

	public void setyJAskPrivceFlag(String yJAskPrivceFlag) {
		this.yJAskPrivceFlag = yJAskPrivceFlag;
	}

	@Column(name = "ISYANGJIE", length = 10)
	public String getIsYangJie() {
		return isYangJie;
	}

	public void setIsYangJie(String isYangJie) { 
		this.isYangJie = isYangJie;
	}

}