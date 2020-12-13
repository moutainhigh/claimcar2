package ins.sino.claimcar.flow.po;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * POJO Class PrpLWfMain
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Table(name = "PRPLWFMAIN")
public class PrpLWfMain implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private String flowId;
	private String registNo;
	private String policyNo;
	private String policyNoLink;
	private String riskCode;
	private String comCode;
	private String flowStatus;
	private String lastNode;
	private String storeFlag;
	private Date registTime;
	private String licenseNo;
	private String frameNo;
	private String insuredCode;
	private String insuredName;
	private String insuredIdNo;
	private String reportorName;
	private String reportorPhone;
	private String businessFlag;
	private String comCodePly;
	private String remark;
	private Date createTime;
	private Date updateTime;
	private String isMobileCase; //是否为移动端案件
	private List<PrpLWfTaskOut> prpLWfTaskOuts = new ArrayList<PrpLWfTaskOut>(0);
	private List<PrpLWfNode> prpLWfNodes = new ArrayList<PrpLWfNode>(0);
	private List<PrpLWfTaskIn> prpLWfTaskIns = new ArrayList<PrpLWfTaskIn>(0);

	@Id
	@Column(name = "FLOWID", unique = true, nullable = false, length=32)
	public String getFlowId() {
		return this.flowId;
	}

	public void setFlowId(String flowId) {
		this.flowId = flowId;
	}

	@Column(name = "REGISTNO", nullable = false, length=25)
	public String getRegistNo() {
		return this.registNo;
	}

	public void setRegistNo(String registNo) {
		this.registNo = registNo;
	}

	@Column(name = "POLICYNO", nullable = false, length=25)
	public String getPolicyNo() {
		return this.policyNo;
	}

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	@Column(name = "POLICYNOLINK", length=25)
	public String getPolicyNoLink() {
		return this.policyNoLink;
	}

	public void setPolicyNoLink(String policyNoLink) {
		this.policyNoLink = policyNoLink;
	}

	@Column(name = "RISKCODE", length=10)
	public String getRiskCode() {
		return this.riskCode;
	}

	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}

	@Column(name = "COMCODE", nullable = false, length=10)
	public String getComCode() {
		return this.comCode;
	}

	public void setComCode(String comCode) {
		this.comCode = comCode;
	}

	@Column(name = "FLOWSTATUS", nullable = false, length=2)
	public String getFlowStatus() {
		return this.flowStatus;
	}

	public void setFlowStatus(String flowStatus) {
		this.flowStatus = flowStatus;
	}

	@Column(name = "LASTNODE", nullable = false, length=20)
	public String getLastNode() {
		return this.lastNode;
	}

	public void setLastNode(String lastNode) {
		this.lastNode = lastNode;
	}

	@Column(name = "STOREFLAG", length=2)
	public String getStoreFlag() {
		return this.storeFlag;
	}

	public void setStoreFlag(String storeFlag) {
		this.storeFlag = storeFlag;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "REGISTTIME", length=7)
	public Date getRegistTime() {
		return this.registTime;
	}

	public void setRegistTime(Date registTime) {
		this.registTime = registTime;
	}

	@Column(name = "LICENSENO", length=25)
	public String getLicenseNo() {
		return this.licenseNo;
	}

	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}

	@Column(name = "FRAMENO", length=25)
	public String getFrameNo() {
		return this.frameNo;
	}

	public void setFrameNo(String frameNo) {
		this.frameNo = frameNo;
	}

	@Column(name = "INSUREDCODE", length=25)
	public String getInsuredCode() {
		return this.insuredCode;
	}

	public void setInsuredCode(String insuredCode) {
		this.insuredCode = insuredCode;
	}

	@Column(name = "INSUREDNAME", length=25)
	public String getInsuredName() {
		return this.insuredName;
	}

	public void setInsuredName(String insuredName) {
		this.insuredName = insuredName;
	}

	@Column(name = "INSUREDIDNO", length=50)
	public String getInsuredIdNo() {
		return this.insuredIdNo;
	}

	public void setInsuredIdNo(String insuredIdNo) {
		this.insuredIdNo = insuredIdNo;
	}

	@Column(name = "REPORTORNAME", length=25)
	public String getReportorName() {
		return this.reportorName;
	}

	public void setReportorName(String reportorName) {
		this.reportorName = reportorName;
	}

	@Column(name = "REPORTORPHONE", length=25)
	public String getReportorPhone() {
		return this.reportorPhone;
	}

	public void setReportorPhone(String reportorPhone) {
		this.reportorPhone = reportorPhone;
	}

	@Column(name = "BUSINESSFLAG", length=10)
	public String getBusinessFlag() {
		return this.businessFlag;
	}

	public void setBusinessFlag(String businessFlag) {
		this.businessFlag = businessFlag;
	}

	@Column(name = "COMCODEPLY", length=10)
	public String getComCodePly() {
		return this.comCodePly;
	}

	public void setComCodePly(String comCodePly) {
		this.comCodePly = comCodePly;
	}

	@Column(name = "REMARK", length=1000)
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATETIME", length=7)
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATETIME", length=7)
	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	public List<PrpLWfTaskOut> getPrpLWfTaskOuts() {
		return this.prpLWfTaskOuts;
	}

	public void setPrpLWfTaskOuts(List<PrpLWfTaskOut> prpLWfTaskOuts) {
		this.prpLWfTaskOuts = prpLWfTaskOuts;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	public List<PrpLWfNode> getPrpLWfNodes() {
		return this.prpLWfNodes;
	}

	public void setPrpLWfNodes(List<PrpLWfNode> prpLWfNodes) {
		this.prpLWfNodes = prpLWfNodes;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	public List<PrpLWfTaskIn> getPrpLWfTaskIns() {
		return this.prpLWfTaskIns;
	}

	public void setPrpLWfTaskIns(List<PrpLWfTaskIn> prpLWfTaskIns) {
		this.prpLWfTaskIns = prpLWfTaskIns;
	}

	@Column(name = "ISMOBILECASE", length=2)
    public String getIsMobileCase() {
        return isMobileCase;
    }
   
    public void setIsMobileCase(String isMobileCase) {
        this.isMobileCase = isMobileCase;
    }  
}
