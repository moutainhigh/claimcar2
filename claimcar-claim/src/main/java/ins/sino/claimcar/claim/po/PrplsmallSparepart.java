package ins.sino.claimcar.claim.po;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
import java.util.Date;

import javax.persistence.Basic;
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

import org.hibernate.annotations.Type;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * POJO Class PrplsmallSparepart
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@TableGenerator(name = "utiSequence", table = "UTISEQUENCE", pkColumnName = "GenName", valueColumnName = "GenValue", pkColumnValue = "PRPLSMALLSPAREPART_PK", allocationSize = 10)
@Table(name = "PRPLSMALLSPAREPART")
public class PrplsmallSparepart implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private PrplcecheckResult prplcecheckResult;
	private String insuranceMaterialId;
	private String materialName;
	private String inputPrice;
	private String inputCount;
	private String inputTotalprice;
	private String feedbackPrice;
	private String feedbackQuantity;
	private String feedbackTotal;
	private String savingPrice;
	private String ceSaving;
	private String remark;
	private Date createTime;

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "utiSequence")
	@Column(name = "ID", unique = true, nullable = false, precision=15, scale=0)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CEMAINID", nullable = false)
	public PrplcecheckResult getPrplcecheckResult() {
		return prplcecheckResult;
	}

	public void setPrplcecheckResult(PrplcecheckResult prplcecheckResult) {
		this.prplcecheckResult = prplcecheckResult;
	}


	@Column(name = "INSURANCE_MATERIAL_ID", length=80)
	public String getInsuranceMaterialId() {
		return this.insuranceMaterialId;
	}

	public void setInsuranceMaterialId(String insuranceMaterialId) {
		this.insuranceMaterialId = insuranceMaterialId;
	}

	@Column(name = "MATERIAL_NAME", length=50)
	public String getMaterialName() {
		return this.materialName;
	}

	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}

	@Column(name = "INPUT_PRICE", length=35)
	public String getInputPrice() {
		return this.inputPrice;
	}

	public void setInputPrice(String inputPrice) {
		this.inputPrice = inputPrice;
	}

	@Column(name = "INPUT_COUNT", length=35)
	public String getInputCount() {
		return this.inputCount;
	}

	public void setInputCount(String inputCount) {
		this.inputCount = inputCount;
	}

	@Column(name = "INPUT_TOTALPRICE", length=35)
	public String getInputTotalprice() {
		return this.inputTotalprice;
	}

	public void setInputTotalprice(String inputTotalprice) {
		this.inputTotalprice = inputTotalprice;
	}

	@Column(name = "FEEDBACK_PRICE", length=35)
	public String getFeedbackPrice() {
		return this.feedbackPrice;
	}

	public void setFeedbackPrice(String feedbackPrice) {
		this.feedbackPrice = feedbackPrice;
	}

	@Column(name = "FEEDBACK_QUANTITY", length=35)
	public String getFeedbackQuantity() {
		return this.feedbackQuantity;
	}

	public void setFeedbackQuantity(String feedbackQuantity) {
		this.feedbackQuantity = feedbackQuantity;
	}

	@Column(name = "FEEDBACK_TOTAL", length=35)
	public String getFeedbackTotal() {
		return this.feedbackTotal;
	}

	public void setFeedbackTotal(String feedbackTotal) {
		this.feedbackTotal = feedbackTotal;
	}

	@Column(name = "SAVING_PRICE", length=35)
	public String getSavingPrice() {
		return this.savingPrice;
	}

	public void setSavingPrice(String savingPrice) {
		this.savingPrice = savingPrice;
	}

	@Column(name = "CESAVING", length=10)
	public String getCeSaving() {
		return this.ceSaving;
	}

	public void setCeSaving(String ceSaving) {
		this.ceSaving = ceSaving;
	}

	@Column(name = "REMARK")
    @Basic(fetch = FetchType.LAZY)
	@Type(type = "org.hibernate.type.MaterializedClobType")
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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
