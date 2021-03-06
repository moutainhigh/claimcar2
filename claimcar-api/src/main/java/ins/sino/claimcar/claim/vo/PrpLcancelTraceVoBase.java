package ins.sino.claimcar.claim.vo;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
import java.math.BigDecimal;
import java.util.Date;


/**
 * Vo Base Class of PO PrpLcancelTrace
 */ 
public class PrpLcancelTraceVoBase implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private BigDecimal id;
	private String claimNo;
	private String riskCode;
	private String textType;
	private String cancelText;
	private String dealReasoon;
	private String applyReason;
	private String applyUserCode;
	private Date applyDate;
	private String operaToRCode;
	private Date inputTime;
	private String makeCom;
	private String status;
	private String aandelCode;
	private String cancelCode;
	private Date candelDate;
	private String dealerCode;
	private String comCode;
	private String flag;
	private String validFlag;
	private Date insertTimeForHis;
	private Date operateTimeForHis;
	private String flags;
	private String swindleReason;
	private String swindleType;
	private BigDecimal swindleSum;
    protected PrpLcancelTraceVoBase() {
	
    }

    
	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public String getClaimNo() {
		return this.claimNo;
	}

	public void setClaimNo(String claimNo) {
		this.claimNo = claimNo;
	}

	public String getRiskCode() {
		return this.riskCode;
	}

	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}

	public String getTextType() {
		return this.textType;
	}

	public void setTextType(String textType) {
		this.textType = textType;
	}

	public String getCancelText() {
		return this.cancelText;
	}

	public void setCancelText(String cancelText) {
		this.cancelText = cancelText;
	}

	public String getDealReasoon() {
		return this.dealReasoon;
	}

	public void setDealReasoon(String dealReasoon) {
		this.dealReasoon = dealReasoon;
	}

	public String getApplyReason() {
		return this.applyReason;
	}

	public void setApplyReason(String applyReason) {
		this.applyReason = applyReason;
	}

	public String getApplyUserCode() {
		return this.applyUserCode;
	}

	public void setApplyUserCode(String applyUserCode) {
		this.applyUserCode = applyUserCode;
	}

	public Date getApplyDate() {
		return this.applyDate;
	}

	public void setApplyDate(Date applyDate) {
		this.applyDate = applyDate;
	}

	public String getOperaToRCode() {
		return this.operaToRCode;
	}

	public void setOperaToRCode(String operaToRCode) {
		this.operaToRCode = operaToRCode;
	}

	public Date getInputTime() {
		return this.inputTime;
	}

	public void setInputTime(Date inputTime) {
		this.inputTime = inputTime;
	}

	public String getMakeCom() {
		return this.makeCom;
	}

	public void setMakeCom(String makeCom) {
		this.makeCom = makeCom;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAandelCode() {
		return this.aandelCode;
	}

	public void setAandelCode(String aandelCode) {
		this.aandelCode = aandelCode;
	}

	public Date getCandelDate() {
		return this.candelDate;
	}

	public void setCandelDate(Date candelDate) {
		this.candelDate = candelDate;
	}

	public String getDealerCode() {
		return this.dealerCode;
	}

	public void setDealerCode(String dealerCode) {
		this.dealerCode = dealerCode;
	}

	public String getComCode() {
		return this.comCode;
	}

	public void setComCode(String comCode) {
		this.comCode = comCode;
	}

	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getValidFlag() {
		return this.validFlag;
	}

	public void setValidFlag(String validFlag) {
		this.validFlag = validFlag;
	}

	public Date getInsertTimeForHis() {
		return this.insertTimeForHis;
	}

	public void setInsertTimeForHis(Date insertTimeForHis) {
		this.insertTimeForHis = insertTimeForHis;
	}

	public Date getOperateTimeForHis() {
		return this.operateTimeForHis;
	}

	public void setOperateTimeForHis(Date operateTimeForHis) {
		this.operateTimeForHis = operateTimeForHis;
	}


	public String getFlags() {
		return flags;
	}


	public void setFlags(String flags) {
		this.flags = flags;
	}


	public String getCancelCode() {
		return cancelCode;
	}


	public void setCancelCode(String cancelCode) {
		this.cancelCode = cancelCode;
	}


	public String getSwindleReason() {
		return swindleReason;
	}


	public void setSwindleReason(String swindleReason) {
		this.swindleReason = swindleReason;
	}


	public String getSwindleType() {
		return swindleType;
	}


	public void setSwindleType(String swindleType) {
		this.swindleType = swindleType;
	}


	public BigDecimal getSwindleSum() {
		return swindleSum;
	}


	public void setSwindleSum(BigDecimal swindleSum) {
		this.swindleSum = swindleSum;
	}



	
}
