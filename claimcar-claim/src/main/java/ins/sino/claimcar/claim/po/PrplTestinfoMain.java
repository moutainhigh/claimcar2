package ins.sino.claimcar.claim.po;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * POJO Class PrplTestinfoMain
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@TableGenerator(name = "utiSequence", table = "UTISEQUENCE", pkColumnName = "GenName", valueColumnName = "GenValue", pkColumnValue = "PRPLTESTINFOMAIN_PK", allocationSize = 10)
@Table(name = "PRPLTESTINFOMAIN")
public class PrplTestinfoMain implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String registNo;
	private String vehicleRegistionNumber;
	private String vehicleBrandName;
	private String vehicleModelName;
	private String vin;
	private String checkEmployee;
	private String confirmlossEmployee;
	private String repairFactoryName;
	private String riskSavingAmount;
	private Date eventDate;
	private Date confirmlossDate;
	private Date checkTime;
	private String lossType;
	private String partlossAmount;
	private String partceAmount;
	private String partsavingAmount;
	private String laborlossAmount;
	private String laborceAmount;
	private String laborsavingAmount;
	private String comCode;
	private Date createTime;
	private String createUser;
	private String claimResult;
	private String cetotalPrice;
	private String totalPrice;
	private String savingTotalPrice;
	private String lossCarMainId;
	private String nodeFlag;
	private List<PrplPartsInfo> prplPartsInfos=new ArrayList<PrplPartsInfo>(0);
	private List<PrplLaborInfo> prplLaborInfos=new ArrayList<PrplLaborInfo>(0);
	private List<PrplFraudriskInfo> prplFraudriskInfos=new ArrayList<PrplFraudriskInfo>(0);
	private List<PrplRiskpointInfo> prplRiskpointInfos=new ArrayList<PrplRiskpointInfo>(0);
	private List<PrplOperationInfo> prplOperationInfos=new ArrayList<PrplOperationInfo>(0);
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE,generator="utiSequence" )
	@Column(name = "ID", unique = true, nullable = false, precision=12, scale=0)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "REGISTNO", length=25)
	public String getRegistNo() {
		return this.registNo;
	}

	public void setRegistNo(String registNo) {
		this.registNo = registNo;
	}

	@Column(name = "VEHICLEREGISTIONNUMBER", length=25)
	public String getVehicleRegistionNumber() {
		return this.vehicleRegistionNumber;
	}

	public void setVehicleRegistionNumber(String vehicleRegistionNumber) {
		this.vehicleRegistionNumber = vehicleRegistionNumber;
	}

	@Column(name = "VEHICLEBRANDNAME", length=100)
	public String getVehicleBrandName() {
		return this.vehicleBrandName;
	}

	public void setVehicleBrandName(String vehicleBrandName) {
		this.vehicleBrandName = vehicleBrandName;
	}

	@Column(name = "VEHICLEMODELNAME", length=100)
	public String getVehicleModelName() {
		return this.vehicleModelName;
	}

	public void setVehicleModelName(String vehicleModelName) {
		this.vehicleModelName = vehicleModelName;
	}

	@Column(name = "VIN", length=30)
	public String getVin() {
		return this.vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	@Column(name = "CHECKEMPLOYEE", length=30)
	public String getCheckEmployee() {
		return this.checkEmployee;
	}

	public void setCheckEmployee(String checkEmployee) {
		this.checkEmployee = checkEmployee;
	}

	@Column(name = "CONFIRMLOSSEMPLOYEE", length=30)
	public String getConfirmlossEmployee() {
		return this.confirmlossEmployee;
	}

	public void setConfirmlossEmployee(String confirmlossEmployee) {
		this.confirmlossEmployee = confirmlossEmployee;
	}

	@Column(name = "REPAIRFACTORYNAME", length=50)
	public String getRepairFactoryName() {
		return this.repairFactoryName;
	}

	public void setRepairFactoryName(String repairFactoryName) {
		this.repairFactoryName = repairFactoryName;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "EVENTDATE", length=7)
	public Date getEventDate() {
		return this.eventDate;
	}

	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CONFIRMLOSSDATE", length=7)
	public Date getConfirmlossDate() {
		return this.confirmlossDate;
	}

	public void setConfirmlossDate(Date confirmlossDate) {
		this.confirmlossDate = confirmlossDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CHECKTIME", length=7)
	public Date getCheckTime() {
		return this.checkTime;
	}

	public void setCheckTime(Date checkTime) {
		this.checkTime = checkTime;
	}

	@Column(name = "LOSSTYPE", length=12)
	public String getLossType() {
		return this.lossType;
	}

	public void setLossType(String lossType) {
		this.lossType = lossType;
	}

	@Column(name = "PARTLOSSAMOUNT", length=25)
	public String getPartlossAmount() {
		return this.partlossAmount;
	}

	public void setPartlossAmount(String partlossAmount) {
		this.partlossAmount = partlossAmount;
	}

	@Column(name = "PARTCEAMOUNT", length=25)
	public String getPartceAmount() {
		return this.partceAmount;
	}

	public void setPartceAmount(String partceAmount) {
		this.partceAmount = partceAmount;
	}

	@Column(name = "PARTSAVINGAMOUNT", length=25)
	public String getPartsavingAmount() {
		return this.partsavingAmount;
	}

	public void setPartsavingAmount(String partsavingAmount) {
		this.partsavingAmount = partsavingAmount;
	}

	@Column(name = "LABORLOSSAMOUNT", length=25)
	public String getLaborlossAmount() {
		return this.laborlossAmount;
	}

	public void setLaborlossAmount(String laborlossAmount) {
		this.laborlossAmount = laborlossAmount;
	}

	@Column(name = "LABORCEAMOUNT", length=25)
	public String getLaborceAmount() {
		return this.laborceAmount;
	}

	public void setLaborceAmount(String laborceAmount) {
		this.laborceAmount = laborceAmount;
	}

	@Column(name = "LABORSAVINGAMOUNT", length=25)
	public String getLaborsavingAmount() {
		return this.laborsavingAmount;
	}

	public void setLaborsavingAmount(String laborsavingAmount) {
		this.laborsavingAmount = laborsavingAmount;
	}

	
	@Column(name = "COMCODE", length=25)
	public String getComCode() {
		return this.comCode;
	}

	public void setComCode(String comCode) {
		this.comCode = comCode;
	}
    
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATETIME", length=7)
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Column(name = "CREATEUSER", length=25)
	public String getCreateUser() {
		return this.createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	
	@Column(name = "CETOTALPRICE", length=30)
	public String getCetotalPrice() {
		return cetotalPrice;
	}

	public void setCetotalPrice(String cetotalPrice) {
		this.cetotalPrice = cetotalPrice;
	}
	@Column(name = "TOTALPRICE", length=30)
	public String getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}
	@Column(name = "SAVINGTOTALPRICE", length=30)
	public String getSavingTotalPrice() {
		return savingTotalPrice;
	}

	public void setSavingTotalPrice(String savingTotalPrice) {
		this.savingTotalPrice = savingTotalPrice;
	}

	
	@Column(name = "RISKSAVINGAMOUNT", length=30)
	public String getRiskSavingAmount() {
		return riskSavingAmount;
	}

	public void setRiskSavingAmount(String riskSavingAmount) {
		this.riskSavingAmount = riskSavingAmount;
	}

	@Column(name = "LOSSCARMAINID", length=20)
	public String getLossCarMainId() {
		return lossCarMainId;
	}

	public void setLossCarMainId(String lossCarMainId) {
		this.lossCarMainId = lossCarMainId;
	}
	
	
	@Column(name = "NODEFLAG", length=20)
	public String getNodeFlag() {
		return nodeFlag;
	}

	public void setNodeFlag(String nodeFlag) {
		this.nodeFlag = nodeFlag;
	}

	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="prplTestinfoMain")
	public List<PrplPartsInfo> getPrplPartsInfos() {
		return prplPartsInfos;
	}
    
	public void setPrplPartsInfos(List<PrplPartsInfo> prplPartsInfos) {
		this.prplPartsInfos = prplPartsInfos;
	}
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="prplTestinfoMain")
	public List<PrplLaborInfo> getPrplLaborInfos() {
		return prplLaborInfos;
	}

	public void setPrplLaborInfos(List<PrplLaborInfo> prplLaborInfos) {
		this.prplLaborInfos = prplLaborInfos;
	}
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="prplTestinfoMain")
	public List<PrplFraudriskInfo> getPrplFraudriskInfos() {
		return prplFraudriskInfos;
	}
	public void setPrplFraudriskInfos(List<PrplFraudriskInfo> prplFraudriskInfos) {
		this.prplFraudriskInfos = prplFraudriskInfos;
	}
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="prplTestinfoMain")
	public List<PrplRiskpointInfo> getPrplRiskpointInfos() {
		return prplRiskpointInfos;
	}

	public void setPrplRiskpointInfos(List<PrplRiskpointInfo> prplRiskpointInfos) {
		this.prplRiskpointInfos = prplRiskpointInfos;
	}
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="prplTestinfoMain")
	public List<PrplOperationInfo> getPrplOperationInfos() {
		return prplOperationInfos;
	}

	public void setPrplOperationInfos(List<PrplOperationInfo> prplOperationInfos) {
		this.prplOperationInfos = prplOperationInfos;
	}
	@Column(name = "CLAIMRESULT", length=20)
	public String getClaimResult() {
		return claimResult;
	}

	public void setClaimResult(String claimResult) {
		this.claimResult = claimResult;
	}
	
	
	
	
}
