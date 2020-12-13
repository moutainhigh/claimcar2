package ins.sino.claimcar.losscar.vo;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
import java.math.BigDecimal;
import java.util.Date;


/**
 * Vo Base Class of PO PrpLDlossCarComp
 */ 
public class PrpLDlossCarCompVoBase implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
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
	private PrpLDlossCarMainVo prpLDlossCarMainVo;
	private BigDecimal auditDiscountFee;
	private BigDecimal auditDiscount;
	private BigDecimal veripManageRate;	//核价管理费比率
	private BigDecimal veripManageFee;	//核价管理费
	private BigDecimal veriSelfPrice;	//核损自付比例
	private BigDecimal veriManageRate;	//核损管理费比率
	private BigDecimal veriManageFee;	//核损管理费
    private String recyclePartFlag;//回收方式
	private BigDecimal dLChkAuditMaterialFee;// 复检材料费
	private BigDecimal dLChkAuditCount;// 复检数量
	private BigDecimal dLChkApprPartSum;// 复检换件小计
	private BigDecimal dLChkApprRemainsPrice;// 复检残值
	private String dLChkRemark;// 复检备注
	private String directSupplyFlag; //配件直供标志
	private String yJAskPrivceFlag;//阳杰询价标志0-未讯价，1已询价

	public String getDirectSupplyFlag() {
		return directSupplyFlag;
	}


	public void setDirectSupplyFlag(String directSupplyFlag) {
		this.directSupplyFlag = directSupplyFlag;
	}


	public BigDecimal getVeriManageFee() {
		return veriManageFee;
	}


	public void setVeriManageFee(BigDecimal veriManageFee) {
		this.veriManageFee = veriManageFee;
	}


	public BigDecimal getVeriManageRate() {
		return veriManageRate;
	}


	public void setVeriManageRate(BigDecimal veriManageRate) {
		this.veriManageRate = veriManageRate;
	}


	public BigDecimal getVeripManageRate() {
		return veripManageRate;
	}


	public BigDecimal getVeriSelfPrice() {
		return veriSelfPrice;
	}


	public void setVeriSelfPrice(BigDecimal veriSelfPrice) {
		this.veriSelfPrice = veriSelfPrice;
	}


	public void setVeripManageRate(BigDecimal veripManageRate) {
		this.veripManageRate = veripManageRate;
	}


	public BigDecimal getVeripManageFee() {
		return veripManageFee;
	}


	public void setVeripManageFee(BigDecimal veripManageFee) {
		this.veripManageFee = veripManageFee;
	}


	public BigDecimal getAuditDiscountFee() {
		return auditDiscountFee;
	}


	public void setAuditDiscountFee(BigDecimal auditDiscountFee) {
		this.auditDiscountFee = auditDiscountFee;
	}


	public BigDecimal getAuditDiscount() {
		return auditDiscount;
	}


	public void setAuditDiscount(BigDecimal auditDiscount) {
		this.auditDiscount = auditDiscount;
	}


	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRiskCode() {
		return this.riskCode;
	}

	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}

	public String getClaimNo() {
		return this.claimNo;
	}

	public void setClaimNo(String claimNo) {
		this.claimNo = claimNo;
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

	public Integer getSerialNo() {
		return this.serialNo;
	}

	public void setSerialNo(Integer serialNo) {
		this.serialNo = serialNo;
	}

	public Long getItemKindNo() {
		return this.itemKindNo;
	}

	public void setItemKindNo(Long itemKindNo) {
		this.itemKindNo = itemKindNo;
	}

	public String getKindCode() {
		return this.kindCode;
	}

	public void setKindCode(String kindCode) {
		this.kindCode = kindCode;
	}
	
	public String getKindName() {
		return kindName;
	}
	
	public void setKindName(String kindName) {
		this.kindName = kindName;
	}
	
	public String getLossItemCode() {
		return this.lossItemCode;
	}

	public void setLossItemCode(String lossItemCode) {
		this.lossItemCode = lossItemCode;
	}

	public String getLicenseNo() {
		return this.licenseNo;
	}

	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}

	public String getLicenseColorCode() {
		return this.licenseColorCode;
	}

	public void setLicenseColorCode(String licenseColorCode) {
		this.licenseColorCode = licenseColorCode;
	}

	public String getCarKindCode() {
		return this.carKindCode;
	}

	public void setCarKindCode(String carKindCode) {
		this.carKindCode = carKindCode;
	}

	public String getMakeYear() {
		return this.makeYear;
	}

	public void setMakeYear(String makeYear) {
		this.makeYear = makeYear;
	}

	public String getGearboxType() {
		return this.gearboxType;
	}

	public void setGearboxType(String gearboxType) {
		this.gearboxType = gearboxType;
	}

	public String getQuoteCompanyGrade() {
		return this.quoteCompanyGrade;
	}

	public void setQuoteCompanyGrade(String quoteCompanyGrade) {
		this.quoteCompanyGrade = quoteCompanyGrade;
	}

	public BigDecimal getManageFeeRate() {
		return this.manageFeeRate;
	}

	public void setManageFeeRate(BigDecimal manageFeeRate) {
		this.manageFeeRate = manageFeeRate;
	}

	public String getRepairFactoryCode() {
		return this.repairFactoryCode;
	}

	public void setRepairFactoryCode(String repairFactoryCode) {
		this.repairFactoryCode = repairFactoryCode;
	}

	public String getRepairFactoryName() {
		return this.repairFactoryName;
	}

	public void setRepairFactoryName(String repairFactoryName) {
		this.repairFactoryName = repairFactoryName;
	}

	public String getHandlerCode() {
		return this.handlerCode;
	}

	public void setHandlerCode(String handlerCode) {
		this.handlerCode = handlerCode;
	}

	public Date getRepairStartDate() {
		return this.repairStartDate;
	}

	public void setRepairStartDate(Date repairStartDate) {
		this.repairStartDate = repairStartDate;
	}

	public Date getRepairEndDate() {
		return this.repairEndDate;
	}

	public void setRepairEndDate(Date repairEndDate) {
		this.repairEndDate = repairEndDate;
	}

	public String getPartDesc() {
		return this.partDesc;
	}

	public void setPartDesc(String partDesc) {
		this.partDesc = partDesc;
	}

	public String getSanctioner() {
		return this.sanctioner;
	}

	public void setSanctioner(String sanctioner) {
		this.sanctioner = sanctioner;
	}

	public String getApproverCode() {
		return this.approverCode;
	}

	public void setApproverCode(String approverCode) {
		this.approverCode = approverCode;
	}

	public String getOperatorCode() {
		return this.operatorCode;
	}

	public void setOperatorCode(String operatorCode) {
		this.operatorCode = operatorCode;
	}

	public String getCompCode() {
		return this.compCode;
	}

	public void setCompCode(String compCode) {
		this.compCode = compCode;
	}

	public String getCompName() {
		return this.compName;
	}

	public void setCompName(String compName) {
		this.compName = compName;
	}

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getManHourFee() {
		return this.manHourFee;
	}

	public void setManHourFee(BigDecimal manHourFee) {
		this.manHourFee = manHourFee;
	}

	public BigDecimal getMaterialFee() {
		return this.materialFee;
	}

	public void setMaterialFee(BigDecimal materialFee) {
		this.materialFee = materialFee;
	}

	public BigDecimal getQueryPrice() {
		return this.queryPrice;
	}

	public void setQueryPrice(BigDecimal queryPrice) {
		this.queryPrice = queryPrice;
	}

	public BigDecimal getQuotedPrice() {
		return this.quotedPrice;
	}

	public void setQuotedPrice(BigDecimal quotedPrice) {
		this.quotedPrice = quotedPrice;
	}

	public BigDecimal getLossRate() {
		return this.lossRate;
	}

	public void setLossRate(BigDecimal lossRate) {
		this.lossRate = lossRate;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public BigDecimal getSumDefLoss() {
		return this.sumDefLoss;
	}

	public void setSumDefLoss(BigDecimal sumDefLoss) {
		this.sumDefLoss = sumDefLoss;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public BigDecimal getManHour() {
		return this.manHour;
	}

	public void setManHour(BigDecimal manHour) {
		this.manHour = manHour;
	}

	public BigDecimal getManHourUnitPrice() {
		return this.manHourUnitPrice;
	}

	public void setManHourUnitPrice(BigDecimal manHourUnitPrice) {
		this.manHourUnitPrice = manHourUnitPrice;
	}

	public BigDecimal getMaterialQuantity() {
		return this.materialQuantity;
	}

	public void setMaterialQuantity(BigDecimal materialQuantity) {
		this.materialQuantity = materialQuantity;
	}

	public BigDecimal getMaterialUnitPrice() {
		return this.materialUnitPrice;
	}

	public void setMaterialUnitPrice(BigDecimal materialUnitPrice) {
		this.materialUnitPrice = materialUnitPrice;
	}

	public BigDecimal getSumCheckLoss() {
		return this.sumCheckLoss;
	}

	public void setSumCheckLoss(BigDecimal sumCheckLoss) {
		this.sumCheckLoss = sumCheckLoss;
	}

	public Integer getVeriQuantity() {
		return this.veriQuantity;
	}

	public void setVeriQuantity(Integer veriQuantity) {
		this.veriQuantity = veriQuantity;
	}

	public BigDecimal getVeriManHourFee() {
		return this.veriManHourFee;
	}

	public void setVeriManHourFee(BigDecimal veriManHourFee) {
		this.veriManHourFee = veriManHourFee;
	}

	public BigDecimal getVeriMaterFee() {
		return this.veriMaterFee;
	}

	public void setVeriMaterFee(BigDecimal veriMaterFee) {
		this.veriMaterFee = veriMaterFee;
	}

	public BigDecimal getVeriLossRate() {
		return this.veriLossRate;
	}

	public void setVeriLossRate(BigDecimal veriLossRate) {
		this.veriLossRate = veriLossRate;
	}

	public BigDecimal getSumVeriLoss() {
		return this.sumVeriLoss;
	}

	public void setSumVeriLoss(BigDecimal sumVeriLoss) {
		this.sumVeriLoss = sumVeriLoss;
	}

	public String getVeriRemark() {
		return this.veriRemark;
	}

	public void setVeriRemark(String veriRemark) {
		this.veriRemark = veriRemark;
	}

	public BigDecimal getVeriRestFee() {
		return this.veriRestFee;
	}

	public void setVeriRestFee(BigDecimal veriRestFee) {
		this.veriRestFee = veriRestFee;
	}

	public BigDecimal getSumReject() {
		return this.sumReject;
	}

	public void setSumReject(BigDecimal sumReject) {
		this.sumReject = sumReject;
	}

	public String getRejectReason() {
		return this.rejectReason;
	}

	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}

	public BigDecimal getRestFee() {
		return this.restFee;
	}

	public void setRestFee(BigDecimal restFee) {
		this.restFee = restFee;
	}

	public String getBackCheckRemark() {
		return this.backCheckRemark;
	}

	public void setBackCheckRemark(String backCheckRemark) {
		this.backCheckRemark = backCheckRemark;
	}

	public String getPartCode() {
		return this.partCode;
	}

	public void setPartCode(String partCode) {
		this.partCode = partCode;
	}

	public String getPartName() {
		return this.partName;
	}

	public void setPartName(String partName) {
		this.partName = partName;
	}

	public String getOriginalId() {
		return this.originalId;
	}

	public void setOriginalId(String originalId) {
		this.originalId = originalId;
	}

	public BigDecimal getSys4SPrice() {
		return this.sys4SPrice;
	}

	public void setSys4SPrice(BigDecimal sys4SPrice) {
		this.sys4SPrice = sys4SPrice;
	}

	public BigDecimal getSysMarketPrice() {
		return this.sysMarketPrice;
	}

	public void setSysMarketPrice(BigDecimal sysMarketPrice) {
		this.sysMarketPrice = sysMarketPrice;
	}

	public BigDecimal getSysMatchPrice() {
		return this.sysMatchPrice;
	}

	public void setSysMatchPrice(BigDecimal sysMatchPrice) {
		this.sysMatchPrice = sysMatchPrice;
	}

	public BigDecimal getNative4SPrice() {
		return this.native4SPrice;
	}

	public void setNative4SPrice(BigDecimal native4SPrice) {
		this.native4SPrice = native4SPrice;
	}

	public BigDecimal getNativeMarketPrice() {
		return this.nativeMarketPrice;
	}

	public void setNativeMarketPrice(BigDecimal nativeMarketPrice) {
		this.nativeMarketPrice = nativeMarketPrice;
	}

	public BigDecimal getNativeMatchPrice() {
		return this.nativeMatchPrice;
	}

	public void setNativeMatchPrice(BigDecimal nativeMatchPrice) {
		this.nativeMatchPrice = nativeMatchPrice;
	}

	public BigDecimal getVerpCompPrice() {
		return this.verpCompPrice;
	}

	public void setVerpCompPrice(BigDecimal verpCompPrice) {
		this.verpCompPrice = verpCompPrice;
	}

	public String getIndId() {
		return this.indId;
	}

	public void setIndId(String indId) {
		this.indId = indId;
	}

	public BigDecimal getFirstMaterialFee() {
		return this.firstMaterialFee;
	}

	public void setFirstMaterialFee(BigDecimal firstMaterialFee) {
		this.firstMaterialFee = firstMaterialFee;
	}

	public String getVerpoFlag() {
		return this.verpoFlag;
	}

	public void setVerpoFlag(String verpoFlag) {
		this.verpoFlag = verpoFlag;
	}

	public String getCompensateBackFlag() {
		return this.compensateBackFlag;
	}

	public void setCompensateBackFlag(String compensateBackFlag) {
		this.compensateBackFlag = compensateBackFlag;
	}

	public String getPriceType() {
		return this.priceType;
	}

	public void setPriceType(String priceType) {
		this.priceType = priceType;
	}

	public BigDecimal getRepairFactoryFee() {
		return this.repairFactoryFee;
	}

	public void setRepairFactoryFee(BigDecimal repairFactoryFee) {
		this.repairFactoryFee = repairFactoryFee;
	}

	public String getReclaimFlag() {
		return this.reclaimFlag;
	}

	public void setReclaimFlag(String reclaimFlag) {
		this.reclaimFlag = reclaimFlag;
	}

	public String getVeripRemark() {
		return this.veripRemark;
	}

	public void setVeripRemark(String veripRemark) {
		this.veripRemark = veripRemark;
	}

	public BigDecimal getVeripMaterFee() {
		return this.veripMaterFee;
	}

	public void setVeripMaterFee(BigDecimal veripMaterFee) {
		this.veripMaterFee = veripMaterFee;
	}

	public String getOriginalName() {
		return this.originalName;
	}

	public void setOriginalName(String originalName) {
		this.originalName = originalName;
	}

	public String getPartGroupCode() {
		return this.partGroupCode;
	}

	public void setPartGroupCode(String partGroupCode) {
		this.partGroupCode = partGroupCode;
	}

	public String getPartGroupName() {
		return this.partGroupName;
	}

	public void setPartGroupName(String partGroupName) {
		this.partGroupName = partGroupName;
	}

	public String getSelfConfigFlag() {
		return this.selfConfigFlag;
	}

	public void setSelfConfigFlag(String selfConfigFlag) {
		this.selfConfigFlag = selfConfigFlag;
	}

	public BigDecimal getVeripRestFee() {
		return this.veripRestFee;
	}

	public void setVeripRestFee(BigDecimal veripRestFee) {
		this.veripRestFee = veripRestFee;
	}

	public BigDecimal getAuditLossCount() {
		return this.auditLossCount;
	}

	public void setAuditLossCount(BigDecimal auditLossCount) {
		this.auditLossCount = auditLossCount;
	}

	public BigDecimal getAuditCount() {
		return this.auditCount;
	}

	public void setAuditCount(BigDecimal auditCount) {
		this.auditCount = auditCount;
	}

	public BigDecimal getChgRefPrice() {
		return this.chgRefPrice;
	}

	public void setChgRefPrice(BigDecimal chgRefPrice) {
		this.chgRefPrice = chgRefPrice;
	}

	public BigDecimal getChgLocPrice() {
		return this.chgLocPrice;
	}

	public void setChgLocPrice(BigDecimal chgLocPrice) {
		this.chgLocPrice = chgLocPrice;
	}

	public String getReCheckFlag() {
		return this.reCheckFlag;
	}

	public void setReCheckFlag(String reCheckFlag) {
		this.reCheckFlag = reCheckFlag;
	}

	public Integer getReplaceNum() {
		return this.replaceNum;
	}

	public void setReplaceNum(Integer replaceNum) {
		this.replaceNum = replaceNum;
	}

	public String getRecycleFlag() {
		return this.recycleFlag;
	}

	public void setRecycleFlag(String recycleFlag) {
		this.recycleFlag = recycleFlag;
	}

	public String getWadFlag() {
		return wadFlag;
	}

	public void setWadFlag(String wadFlag) {
		this.wadFlag = wadFlag;
	}

	public BigDecimal getManageSingleRate() {
		return manageSingleRate;
	}

	public void setManageSingleRate(BigDecimal manageSingleRate) {
		this.manageSingleRate = manageSingleRate;
	}

	public BigDecimal getManageSingleFee() {
		return manageSingleFee;
	}

	public void setManageSingleFee(BigDecimal manageSingleFee) {
		this.manageSingleFee = manageSingleFee;
	}

	public BigDecimal getSelfPayRate() {
		return selfPayRate;
	}

	public void setSelfPayRate(BigDecimal selfPayRate) {
		this.selfPayRate = selfPayRate;
	}

	public PrpLDlossCarMainVo getPrpLDlossCarMainVo() {
		return prpLDlossCarMainVo;
	}

	public void setPrpLDlossCarMainVo(PrpLDlossCarMainVo prpLDlossCarMainVo) {
		this.prpLDlossCarMainVo = prpLDlossCarMainVo;
	}

	public String getRecyclePartFlag() {
		return recyclePartFlag;
	}

	public void setRecyclePartFlag(String recyclePartFlag) {
		this.recyclePartFlag = recyclePartFlag;
	}

	public BigDecimal getdLChkAuditMaterialFee() {
		return dLChkAuditMaterialFee;
	}

	public void setdLChkAuditMaterialFee(BigDecimal dLChkAuditMaterialFee) {
		this.dLChkAuditMaterialFee = dLChkAuditMaterialFee;
	}

	public BigDecimal getdLChkAuditCount() {
		return dLChkAuditCount;
	}

	public void setdLChkAuditCount(BigDecimal dLChkAuditCount) {
		this.dLChkAuditCount = dLChkAuditCount;
	}

	public BigDecimal getdLChkApprPartSum() {
		return dLChkApprPartSum;
	}

	public void setdLChkApprPartSum(BigDecimal dLChkApprPartSum) {
		this.dLChkApprPartSum = dLChkApprPartSum;
	}

	public BigDecimal getdLChkApprRemainsPrice() {
		return dLChkApprRemainsPrice;
	}

	public void setdLChkApprRemainsPrice(BigDecimal dLChkApprRemainsPrice) {
		this.dLChkApprRemainsPrice = dLChkApprRemainsPrice;
	}

	public String getdLChkRemark() {
		return dLChkRemark;
	}

	public void setdLChkRemark(String dLChkRemark) {
		this.dLChkRemark = dLChkRemark;
	}


	public String getyJAskPrivceFlag() {
		return yJAskPrivceFlag;
	}


	public void setyJAskPrivceFlag(String yJAskPrivceFlag) {
		this.yJAskPrivceFlag = yJAskPrivceFlag;
	}
	
	

}
