package ins.sino.claimcar.claim.po;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * POJO Class PrplpriceSummary
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@TableGenerator(name = "utiSequence", table = "UTISEQUENCE", pkColumnName = "GenName", valueColumnName = "GenValue", pkColumnValue = "PRPLPRICESUMMARY_PK", allocationSize = 10)
@Table(name = "PRPLPRICESUMMARY")
public class PrplpriceSummary implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private PrplcecheckResult prplcecheckResult;
	private String confirmLossPrice;
	private String fraudRiskHit;
	private String partTotalPrice;
	private String cePartTotalPrice;
	private String savingPartTotalPrice;
	private String laborTotalPrice;
	private String ceLaborTotalPrice;
	private String savingLaborTotalPrice;
	private String smallPartTotalPrice;
	private String ceSmallPartTotalPrice;
	private String savingSmallPartTotalPrice;
	private String totalPrice;
	private String ceTotalPrice;
	private String savingTotalPrice;
	private String rescueFee;
	private String ceRescueFee;
	private String savingRescueFee;
	private Date createTime;

	@Id
	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "prplcecheckResult"))
	@GeneratedValue(generator = "generator")
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public PrplcecheckResult getPrplcecheckResult() {
		return prplcecheckResult;
	}

	public void setPrplcecheckResult(PrplcecheckResult prplcecheckResult) {
		this.prplcecheckResult = prplcecheckResult;
	}

	@Column(name = "CONFIRMLOSSPRICE", length=35)
	public String getConfirmLossPrice() {
		return this.confirmLossPrice;
	}

	public void setConfirmLossPrice(String confirmLossPrice) {
		this.confirmLossPrice = confirmLossPrice;
	}

	@Column(name = "FRAUDRISKHIT", length=35)
	public String getFraudRiskHit() {
		return this.fraudRiskHit;
	}

	public void setFraudRiskHit(String fraudRiskHit) {
		this.fraudRiskHit = fraudRiskHit;
	}

	@Column(name = "PARTTOTALPRICE", length=35)
	public String getPartTotalPrice() {
		return this.partTotalPrice;
	}

	public void setPartTotalPrice(String partTotalPrice) {
		this.partTotalPrice = partTotalPrice;
	}

	@Column(name = "CEPARTTOTALPRICE", length=35)
	public String getCePartTotalPrice() {
		return this.cePartTotalPrice;
	}

	public void setCePartTotalPrice(String cePartTotalPrice) {
		this.cePartTotalPrice = cePartTotalPrice;
	}

	@Column(name = "SAVINGPARTTOTALPRICE", length=35)
	public String getSavingPartTotalPrice() {
		return this.savingPartTotalPrice;
	}

	public void setSavingPartTotalPrice(String savingPartTotalPrice) {
		this.savingPartTotalPrice = savingPartTotalPrice;
	}

	@Column(name = "LABORTOTALPRICE", length=35)
	public String getLaborTotalPrice() {
		return this.laborTotalPrice;
	}

	public void setLaborTotalPrice(String laborTotalPrice) {
		this.laborTotalPrice = laborTotalPrice;
	}

	@Column(name = "CELABORTOTALPRICE", length=35)
	public String getCeLaborTotalPrice() {
		return this.ceLaborTotalPrice;
	}

	public void setCeLaborTotalPrice(String ceLaborTotalPrice) {
		this.ceLaborTotalPrice = ceLaborTotalPrice;
	}

	@Column(name = "SAVINGLABORTOTALPRICE", length=35)
	public String getSavingLaborTotalPrice() {
		return this.savingLaborTotalPrice;
	}

	public void setSavingLaborTotalPrice(String savingLaborTotalPrice) {
		this.savingLaborTotalPrice = savingLaborTotalPrice;
	}

	
	
	@Column(name = "SMALLPARTTOTALPRICE", length=35)
	public String getSmallPartTotalPrice() {
		return smallPartTotalPrice;
	}

	public void setSmallPartTotalPrice(String smallPartTotalPrice) {
		this.smallPartTotalPrice = smallPartTotalPrice;
	}

	@Column(name = "CESMALLPARTTOTALPRICE", length=35)
	public String getCeSmallPartTotalPrice() {
		return this.ceSmallPartTotalPrice;
	}

	public void setCeSmallPartTotalPrice(String ceSmallPartTotalPrice) {
		this.ceSmallPartTotalPrice = ceSmallPartTotalPrice;
	}

	@Column(name = "SAVINGSMALLPARTTOTALPRICE", length=35)
	public String getSavingSmallPartTotalPrice() {
		return this.savingSmallPartTotalPrice;
	}

	public void setSavingSmallPartTotalPrice(String savingSmallPartTotalPrice) {
		this.savingSmallPartTotalPrice = savingSmallPartTotalPrice;
	}

	@Column(name = "TOTALPRICE", length=35)
	public String getTotalPrice() {
		return this.totalPrice;
	}

	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}

	@Column(name = "CETOTALPRICE", length=35)
	public String getCeTotalPrice() {
		return this.ceTotalPrice;
	}

	public void setCeTotalPrice(String ceTotalPrice) {
		this.ceTotalPrice = ceTotalPrice;
	}

	@Column(name = "SAVINGTOTALPRICE", length=35)
	public String getSavingTotalPrice() {
		return this.savingTotalPrice;
	}

	public void setSavingTotalPrice(String savingTotalPrice) {
		this.savingTotalPrice = savingTotalPrice;
	}

	@Column(name = "RESCUEFEE", length=35)
	public String getRescueFee() {
		return this.rescueFee;
	}

	public void setRescueFee(String rescueFee) {
		this.rescueFee = rescueFee;
	}

	@Column(name = "CERESCUEFEE", length=35)
	public String getCeRescueFee() {
		return this.ceRescueFee;
	}

	public void setCeRescueFee(String ceRescueFee) {
		this.ceRescueFee = ceRescueFee;
	}

	@Column(name = "SAVINGRESCUEFEE", length=35)
	public String getSavingRescueFee() {
		return this.savingRescueFee;
	}

	public void setSavingRescueFee(String savingRescueFee) {
		this.savingRescueFee = savingRescueFee;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATETIME", nullable = false, length=7)
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}
