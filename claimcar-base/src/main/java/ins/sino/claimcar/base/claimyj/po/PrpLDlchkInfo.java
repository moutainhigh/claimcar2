package ins.sino.claimcar.base.claimyj.po;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
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

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * POJO Class PrpLDlhkMain
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@TableGenerator(name = "utiSequence", table = "UTISEQUENCE", pkColumnName = "GenName", valueColumnName = "GenValue", pkColumnValue = "PRPLDLCHKINFO_PK", allocationSize = 10)
@Table(name = "PRPLDLCHKINFO")
public class PrpLDlchkInfo implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private PrpLDlhkMain prpLDlhkMain;
	private String partName;
	private String partNo;
	private String partId;
	private String original;
	private String operator;
	private String operateDate;
	private String identifyResult;
	private String identifyResultType;
	private String unitPrice;
	private String appraisalPrice;
	private String decreaseAmount;
	private String remark;
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "utiSequence")
	@Column(name = "ID", unique = true, nullable = false, precision=13, scale=0)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="DLCHKMAINID", nullable = false)
	public PrpLDlhkMain getPrpLDlhkMain() {
		return prpLDlhkMain;
	}
	public void setPrpLDlhkMain(PrpLDlhkMain prpLDlhkMain) {
		this.prpLDlhkMain = prpLDlhkMain;
	}
	@Column(name = "PARTNAME", nullable = false, length=30)
	public String getPartName() {
		return partName;
	}
	public void setPartName(String partName) {
		this.partName = partName;
	}
	@Column(name = "PARTNO", nullable = false, length=50)
	public String getPartNo() {
		return partNo;
	}
	public void setPartNo(String partNo) {
		this.partNo = partNo;
	}
	@Column(name = "PARTID", length=50)
	public String getPartId() {
		return partId;
	}
	public void setPartId(String partId) {
		this.partId = partId;
	}
	@Column(name = "ORIGINAL", nullable = false, length=10)
	public String getOriginal() {
		return original;
	}
	public void setOriginal(String original) {
		this.original = original;
	}
	@Column(name = "OPERATOR", nullable = false, length=20)
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	@Column(name = "OPERATEDATE", nullable = false, length=30)
	public String getOperateDate() {
		return operateDate;
	}
	public void setOperateDate(String operateDate) {
		this.operateDate = operateDate;
	}
	@Column(name = "IDENTIFYRESULT", nullable = false, length=100)
	public String getIdentifyResult() {
		return identifyResult;
	}
	public void setIdentifyResult(String identifyResult) {
		this.identifyResult = identifyResult;
	}
	@Column(name = "IDENTIFYRESULTTYPE", nullable = false, length=10)
	public String getIdentifyResultType() {
		return identifyResultType;
	}
	public void setIdentifyResultType(String identifyResultType) {
		this.identifyResultType = identifyResultType;
	}
	@Column(name = "UNITPRICE", nullable = false, length=50)
	public String getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}
	@Column(name = "APPRAISALPRICE", nullable = false, length=10)
	public String getAppraisalPrice() {
		return appraisalPrice;
	}
	public void setAppraisalPrice(String appraisalPrice) {
		this.appraisalPrice = appraisalPrice;
	}
	@Column(name = "DECREASEAMOUNT", nullable = false, length=30)
	public String getDecreaseAmount() {
		return decreaseAmount;
	}
	public void setDecreaseAmount(String decreaseAmount) {
		this.decreaseAmount = decreaseAmount;
	}
	@Column(name = "REMARK", length=100)
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	
	
}
