package ins.sino.claimcar.vat.po;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * POJO Class PrpLbillcont
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@TableGenerator(name = "utiSequence", table = "UTISEQUENCE", pkColumnName = "GenName", valueColumnName = "GenValue", pkColumnValue = "PRPLBILLCONT_PK", allocationSize = 10)
@Table(name = "PRPLBILLCONT")
public class PrpLbillcont implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String billId;
	private String registNo;
	private String policyNo;
	private String compensateNo;
	private String bussType;
	private String feeType;
	private Long payId;
	private String comCode;
	private String billNo;
	private String billCode;
	private String saleNo;
	private String saleName;
	private String vidFlag;
	private BigDecimal registerNum;
	private String status;
	private String billUrl;
	private String linktableName;
	private Long linktableId;
	private Date creatTime;
	private String creatUser;
	private Date updateTime;
	private String localFeeType;
	private String billsortType;
	private String uploadFlag;

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "utiSequence")
	@Column(name = "ID", unique = true, nullable = false, precision=12, scale=0)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "BILLID",unique = true, nullable = false, length=100)
	public String getBillId() {
		return this.billId;
	}

	public void setBillId(String billId) {
		this.billId = billId;
	}

	@Column(name = "REGISTNO", length=80)
	public String getRegistNo() {
		return this.registNo;
	}

	public void setRegistNo(String registNo) {
		this.registNo = registNo;
	}
    
	
	
	@Column(name = "COMPENSATENO", length=55)
	public String getCompensateNo() {
		return this.compensateNo;
	}

	public void setCompensateNo(String compensateNo) {
		this.compensateNo = compensateNo;
	}

	@Column(name = "BUSSTYPE", length=20)
	public String getBussType() {
		return this.bussType;
	}

	public void setBussType(String bussType) {
		this.bussType = bussType;
	}

	@Column(name = "FEETYPE", length=20)
	public String getFeeType() {
		return this.feeType;
	}

	public void setFeeType(String feeType) {
		this.feeType = feeType;
	}

	@Column(name = "PAYID", precision=12, scale=0)
	public Long getPayId() {
		return this.payId;
	}

	public void setPayId(Long payId) {
		this.payId = payId;
	}

	@Column(name = "COMCODE", length=35)
	public String getComCode() {
		return this.comCode;
	}

	public void setComCode(String comCode) {
		this.comCode = comCode;
	}

	@Column(name = "BILLNO", length=100)
	public String getBillNo() {
		return this.billNo;
	}

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	@Column(name = "BILLCODE", length=100)
	public String getBillCode() {
		return this.billCode;
	}

	public void setBillCode(String billCode) {
		this.billCode = billCode;
	}

	@Column(name = "VIDFLAG", length=20)
	public String getVidFlag() {
		return this.vidFlag;
	}

	public void setVidFlag(String vidFlag) {
		this.vidFlag = vidFlag;
	}

	@Column(name = "REGISTERNUM", precision=14)
	public BigDecimal getRegisterNum() {
		return this.registerNum;
	}

	public void setRegisterNum(BigDecimal registerNum) {
		this.registerNum = registerNum;
	}

	@Column(name = "STATUS", length=20)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "BILLURL", length=1000)
	public String getBillUrl() {
		return this.billUrl;
	}

	public void setBillUrl(String billUrl) {
		this.billUrl = billUrl;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATTIME", length=7)
	public Date getCreatTime() {
		return this.creatTime;
	}

	public void setCreatTime(Date creatTime) {
		this.creatTime = creatTime;
	}

	@Column(name = "CREATUSER", length=35)
	public String getCreatUser() {
		return this.creatUser;
	}

	public void setCreatUser(String creatUser) {
		this.creatUser = creatUser;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATETIME", length=7)
	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	@Column(name = "POLICYNO", length=80)
	public String getPolicyNo() {
		return policyNo;
	}

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	@Column(name = "LINKTABLENAME", length=10)
	public String getLinktableName() {
		return linktableName;
	}

	public void setLinktableName(String linktableName) {
		this.linktableName = linktableName;
	}
	@Column(name = "LINKTABLEID", precision=12, scale=0)
	public Long getLinktableId() {
		return linktableId;
	}

	public void setLinktableId(Long linktableId) {
		this.linktableId = linktableId;
	}
	@Column(name = "LOCALFEETYPE", length=12)
	public String getLocalFeeType() {
		return localFeeType;
	}

	public void setLocalFeeType(String localFeeType) {
		this.localFeeType = localFeeType;
	}
	@Column(name = "BILLSORTTYPE", length=12)
	public String getBillsortType() {
		return billsortType;
	}

	public void setBillsortType(String billsortType) {
		this.billsortType = billsortType;
	}
	

	@Column(name = "SALENAME", length=100)
	public String getSaleName() {
		return this.saleName;
	}

	public void setSaleName(String saleName) {
		this.saleName = saleName;
	}

	@Column(name = "SALENO", length=100)
	public String getSaleNo() {
		return this.saleNo;
	}

	public void setSaleNo(String saleNo) {
		this.saleNo = saleNo;
	}
	@Column(name = "UPLOADFLAG", length=25)
	public String getUploadFlag() {
		return uploadFlag;
	}

	public void setUploadFlag(String uploadFlag) {
		this.uploadFlag = uploadFlag;
	}
    
	
}
