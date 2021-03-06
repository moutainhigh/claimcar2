package ins.sino.claimcar.claim.po;

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
 * POJO Class PrpLrejectClaimText
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@TableGenerator(name = "utiSequence", table = "UTISEQUENCE", pkColumnName = "GenName", valueColumnName = "GenValue", pkColumnValue = "PRPLREJECTCLAIMTEXT_PK", allocationSize = 10)
@Table(name = "PRPLREJECTCLAIMTEXT")
public class PrpLrejectClaimText implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private BigDecimal id;
	private String registNo;
	private String claimNo;
	private BigDecimal prplcancelTraceId;
	private BigDecimal operatorNode;
	private String operatorCode;
	private String operatorName;
	private String comCode;
	private Date operateDate;
	private String opinionCode;
	private String opinionName;
	private String description;
	private String status;
	private String validFlag;
	private Date insertTimeForHis;
	private Date operateTimeForHis;
	private String reasonCode;
	private String stationName;//岗位
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "utiSequence")
	@Column(name = "ID", unique = true, nullable = false, scale=0)
	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	@Column(name = "REGISTNO", nullable = false, length=22)
	public String getRegistNo() {
		return this.registNo;
	}

	public void setRegistNo(String registNo) {
		this.registNo = registNo;
	}

	@Column(name = "CLAIMNO", nullable = false, length=22)
	public String getClaimNo() {
		return this.claimNo;
	}

	public void setClaimNo(String claimNo) {
		this.claimNo = claimNo;
	}

	@Column(name = "PRPLCANCELTRACEID", scale=0)
	public BigDecimal getPrplcancelTraceId() {
		return this.prplcancelTraceId;
	}

	public void setPrplcancelTraceId(BigDecimal prplcancelTraceId) {
		this.prplcancelTraceId = prplcancelTraceId;
	}

	@Column(name = "OPERATORNODE", precision=38, scale=0)
	public BigDecimal getOperatorNode() {
		return this.operatorNode;
	}

	public void setOperatorNode(BigDecimal operatorNode) {
		this.operatorNode = operatorNode;
	}

	@Column(name = "OPERATORCODE", length=10)
	public String getOperatorCode() {
		return this.operatorCode;
	}

	public void setOperatorCode(String operatorCode) {
		this.operatorCode = operatorCode;
	}

	@Column(name = "OPERATORNAME", length=30)
	public String getOperatorName() {
		return this.operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	@Column(name = "COMCODE", length=8)
	public String getComCode() {
		return this.comCode;
	}

	public void setComCode(String comCode) {
		this.comCode = comCode;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "OPERATEDATE", length=7)
	public Date getOperateDate() {
		return this.operateDate;
	}

	public void setOperateDate(Date operateDate) {
		this.operateDate = operateDate;
	}

	@Column(name = "OPINIONCODE", length=2)
	public String getOpinionCode() {
		return this.opinionCode;
	}

	public void setOpinionCode(String opinionCode) {
		this.opinionCode = opinionCode;
	}

	@Column(name = "OPINIONNAME", length=50)
	public String getOpinionName() {
		return opinionName;
	}

	public void setOpinionName(String opinionName) {
		this.opinionName = opinionName;
	}

	@Column(name = "DESCRIPTION", length=2000)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "STATUS", length=1)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "VALIDFLAG", length=1)
	public String getValidFlag() {
		return this.validFlag;
	}

	public void setValidFlag(String validFlag) {
		this.validFlag = validFlag;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "INSERTTIMEFORHIS", length=7, insertable = false, updatable = false)
	public Date getInsertTimeForHis() {
		return this.insertTimeForHis;
	}

	public void setInsertTimeForHis(Date insertTimeForHis) {
		this.insertTimeForHis = insertTimeForHis;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "OPERATETIMEFORHIS", length=7, insertable = false)
	public Date getOperateTimeForHis() {
		return this.operateTimeForHis;
	}

	public void setOperateTimeForHis(Date operateTimeForHis) {
		this.operateTimeForHis = operateTimeForHis;
	}

	@Column(name = "REASONCODE", length=7)
	public String getReasonCode() {
		return reasonCode;
	}

	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}

	@Column(name = "STATIONNAME", length=100)
	public String getStationName() {
		return stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}
	
}
