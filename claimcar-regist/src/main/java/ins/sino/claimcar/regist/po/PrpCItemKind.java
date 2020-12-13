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
 * POJO Class PrpCItemKind
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@TableGenerator(name = "utiSequence", table = "UTISEQUENCE", pkColumnName = "GenName", valueColumnName = "GenValue", pkColumnValue = "PRPCITEMKIND_PK", allocationSize = 10)
@Table(name = "PRPCITEMKIND")
public class PrpCItemKind implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private PrpCItemKindId id;
	private PrpCMain prpCMain;
	private String riskCode;
	private Long familyNo;
	private String familyName;
	private String rationType;
	private String kindCode;
	private String kindName;
	private Long itemNo;
	private String itemCode;
	private String itemDetailName;
	private String modeCode;
	private String modeName;
	private Date startDate;
	private Long startHour;
	private Date endDate;
	private Long endHour;
	private String model;
	private Date buyDate;
	private Long addressNo;
	private String calculateFlag;
	private String currency;
	private BigDecimal unitAmount;
	private BigDecimal quantity;
	private String unit;
	private BigDecimal value;
	private BigDecimal amount;
	private Long ratePeriod;
	private BigDecimal rate;
	private String shortRateFlag;
	private BigDecimal shortRate;
	private BigDecimal basePremium;
	private BigDecimal benchMarkPremium;
	private BigDecimal discount;
	private BigDecimal adjustRate;
	private BigDecimal premium;
	private BigDecimal deductibleRate;
	private BigDecimal deductible;
	private String flag;
	private BigDecimal profitScale;
	private Date newStartDate;
	private Date newendDate;
	private String chassisNumber;
	private BigDecimal basebenchmarkpremium;
	private BigDecimal deductiblepremium;
	private BigDecimal reservepremium;

	@EmbeddedId
	@NotBlank
	@AttributeOverrides( {
        @AttributeOverride(name = "POLICYNO", column = @Column(name = "POLICYNO", nullable = false, length=22) ), 
        @AttributeOverride(name = "ITEMKINDNO", column = @Column(name = "ITEMKINDNO", nullable = false, precision=15, scale=0) ) } )
	public PrpCItemKindId getId() {
		return this.id;
	}

	public void setId(PrpCItemKindId id) {
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

	@Column(name = "FAMILYNO", precision=15, scale=0)
	public Long getFamilyNo() {
		return this.familyNo;
	}

	public void setFamilyNo(Long familyNo) {
		this.familyNo = familyNo;
	}

	@Column(name = "FAMILYNAME", length=120)
	public String getFamilyName() {
		return this.familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	@Column(name = "RATIONTYPE", length=8)
	public String getRationType() {
		return this.rationType;
	}

	public void setRationType(String rationType) {
		this.rationType = rationType;
	}

	@Column(name = "KINDCODE", length=7)
	public String getKindCode() {
		return this.kindCode;
	}

	public void setKindCode(String kindCode) {
		this.kindCode = kindCode;
	}

	@Column(name = "KINDNAME", length=120)
	public String getKindName() {
		return this.kindName;
	}

	public void setKindName(String kindName) {
		this.kindName = kindName;
	}

	@Column(name = "ITEMNO", precision=15, scale=0)
	public Long getItemNo() {
		return this.itemNo;
	}

	public void setItemNo(Long itemNo) {
		this.itemNo = itemNo;
	}

	@Column(name = "ITEMCODE", length=4)
	public String getItemCode() {
		return this.itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	@Column(name = "ITEMDETAILNAME", length=120)
	public String getItemDetailName() {
		return this.itemDetailName;
	}

	public void setItemDetailName(String itemDetailName) {
		this.itemDetailName = itemDetailName;
	}

	@Column(name = "MODECODE", length=6)
	public String getModeCode() {
		return this.modeCode;
	}

	public void setModeCode(String modeCode) {
		this.modeCode = modeCode;
	}

	@Column(name = "MODENAME", length=120)
	public String getModeName() {
		return this.modeName;
	}

	public void setModeName(String modeName) {
		this.modeName = modeName;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "STARTDATE", length=7)
	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	@Column(name = "STARTHOUR", precision=15, scale=0)
	public Long getStartHour() {
		return this.startHour;
	}

	public void setStartHour(Long startHour) {
		this.startHour = startHour;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ENDDATE", length=7)
	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	@Column(name = "ENDHOUR", precision=15, scale=0)
	public Long getEndHour() {
		return this.endHour;
	}

	public void setEndHour(Long endHour) {
		this.endHour = endHour;
	}

	@Column(name = "MODEL", length=40)
	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "BUYDATE", length=7)
	public Date getBuyDate() {
		return this.buyDate;
	}

	public void setBuyDate(Date buyDate) {
		this.buyDate = buyDate;
	}

	@Column(name = "ADDRESSNO", precision=15, scale=0)
	public Long getAddressNo() {
		return this.addressNo;
	}

	public void setAddressNo(Long addressNo) {
		this.addressNo = addressNo;
	}

	@Column(name = "CALCULATEFLAG", length=1)
	public String getCalculateFlag() {
		return this.calculateFlag;
	}

	public void setCalculateFlag(String calculateFlag) {
		this.calculateFlag = calculateFlag;
	}

	@Column(name = "CURRENCY", length=3)
	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	@Column(name = "UNITAMOUNT", precision=14)
	public BigDecimal getUnitAmount() {
		return this.unitAmount;
	}

	public void setUnitAmount(BigDecimal unitAmount) {
		this.unitAmount = unitAmount;
	}

	@Column(name = "QUANTITY", precision=14)
	public BigDecimal getQuantity() {
		return this.quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	@Column(name = "UNIT", length=10)
	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	@Column(name = "VALUE", precision=14)
	public BigDecimal getValue() {
		return this.value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	@Column(name = "AMOUNT", precision=14)
	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	@Column(name = "RATEPERIOD", precision=15, scale=0)
	public Long getRatePeriod() {
		return this.ratePeriod;
	}

	public void setRatePeriod(Long ratePeriod) {
		this.ratePeriod = ratePeriod;
	}

	@Column(name = "RATE", precision=8, scale=5)
	public BigDecimal getRate() {
		return this.rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

	@Column(name = "SHORTRATEFLAG", length=1)
	public String getShortRateFlag() {
		return this.shortRateFlag;
	}

	public void setShortRateFlag(String shortRateFlag) {
		this.shortRateFlag = shortRateFlag;
	}

	@Column(name = "SHORTRATE", precision=8, scale=4)
	public BigDecimal getShortRate() {
		return this.shortRate;
	}

	public void setShortRate(BigDecimal shortRate) {
		this.shortRate = shortRate;
	}

	@Column(name = "BASEPREMIUM", precision=14)
	public BigDecimal getBasePremium() {
		return this.basePremium;
	}

	public void setBasePremium(BigDecimal basePremium) {
		this.basePremium = basePremium;
	}

	@Column(name = "BENCHMARKPREMIUM", precision=14)
	public BigDecimal getBenchMarkPremium() {
		return this.benchMarkPremium;
	}

	public void setBenchMarkPremium(BigDecimal benchMarkPremium) {
		this.benchMarkPremium = benchMarkPremium;
	}

	@Column(name = "DISCOUNT", precision=8, scale=4)
	public BigDecimal getDiscount() {
		return this.discount;
	}

	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}

	@Column(name = "ADJUSTRATE", precision=8, scale=4)
	public BigDecimal getAdjustRate() {
		return this.adjustRate;
	}

	public void setAdjustRate(BigDecimal adjustRate) {
		this.adjustRate = adjustRate;
	}

	@Column(name = "PREMIUM", precision=14)
	public BigDecimal getPremium() {
		return this.premium;
	}

	public void setPremium(BigDecimal premium) {
		this.premium = premium;
	}

	@Column(name = "DEDUCTIBLERATE", precision=8, scale=4)
	public BigDecimal getDeductibleRate() {
		return this.deductibleRate;
	}

	public void setDeductibleRate(BigDecimal deductibleRate) {
		this.deductibleRate = deductibleRate;
	}

	@Column(name = "DEDUCTIBLE", precision=12)
	public BigDecimal getDeductible() {
		return this.deductible;
	}

	public void setDeductible(BigDecimal deductible) {
		this.deductible = deductible;
	}

	@Column(name = "FLAG", length=10)
	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	@Column(name = "PROFITSCALE", precision=8, scale=4)
	public BigDecimal getProfitScale() {
		return this.profitScale;
	}

	public void setProfitScale(BigDecimal profitScale) {
		this.profitScale = profitScale;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "NEWSTARTDATE", length=7)
	public Date getNewStartDate() {
		return this.newStartDate;
	}

	public void setNewStartDate(Date newStartDate) {
		this.newStartDate = newStartDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "NEWENDDATE", length=7)
	public Date getNewendDate() {
		return this.newendDate;
	}

	public void setNewendDate(Date newendDate) {
		this.newendDate = newendDate;
	}

	@Column(name = "CHASSISNUMBER", length=50)
	public String getChassisNumber() {
		return this.chassisNumber;
	}

	public void setChassisNumber(String chassisNumber) {
		this.chassisNumber = chassisNumber;
	}

	@Column(name = "BASEBENCHMARKPREMIUM", precision=14)
	public BigDecimal getBasebenchmarkpremium() {
		return this.basebenchmarkpremium;
	}

	public void setBasebenchmarkpremium(BigDecimal basebenchmarkpremium) {
		this.basebenchmarkpremium = basebenchmarkpremium;
	}

	@Column(name = "DEDUCTIBLEPREMIUM", precision=14)
	public BigDecimal getDeductiblepremium() {
		return this.deductiblepremium;
	}

	public void setDeductiblepremium(BigDecimal deductiblepremium) {
		this.deductiblepremium = deductiblepremium;
	}

	@Column(name = "RESERVEPREMIUM", precision=14)
	public BigDecimal getReservepremium() {
		return this.reservepremium;
	}

	public void setReservepremium(BigDecimal reservepremium) {
		this.reservepremium = reservepremium;
	}
}