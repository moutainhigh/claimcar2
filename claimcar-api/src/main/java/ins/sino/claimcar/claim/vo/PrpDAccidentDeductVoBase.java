package ins.sino.claimcar.claim.vo;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
import java.math.BigDecimal;
import java.util.Date;


/**
 * Vo Base Class of PO PrpDAccidentDeduct
 */ 
public class PrpDAccidentDeductVoBase implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String riskCode;
	private String kindCode;
	private String indemnityDuty;
	private String dangerLevel;
	private BigDecimal deductibleRate;
	private String validStatus;
	private Date validDate;
	private String deductPeriod;
	private String clauseType;

    protected PrpDAccidentDeductVoBase() {
	
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

	public String getKindCode() {
		return this.kindCode;
	}

	public void setKindCode(String kindCode) {
		this.kindCode = kindCode;
	}

	public String getIndemnityDuty() {
		return this.indemnityDuty;
	}

	public void setIndemnityDuty(String indemnityDuty) {
		this.indemnityDuty = indemnityDuty;
	}

	public String getDangerLevel() {
		return this.dangerLevel;
	}

	public void setDangerLevel(String dangerLevel) {
		this.dangerLevel = dangerLevel;
	}

	public BigDecimal getDeductibleRate() {
		return this.deductibleRate;
	}

	public void setDeductibleRate(BigDecimal deductibleRate) {
		this.deductibleRate = deductibleRate;
	}

	public String getValidStatus() {
		return this.validStatus;
	}

	public void setValidStatus(String validStatus) {
		this.validStatus = validStatus;
	}

	public Date getValidDate() {
		return this.validDate;
	}

	public void setValidDate(Date validDate) {
		this.validDate = validDate;
	}

	public String getDeductPeriod() {
		return this.deductPeriod;
	}

	public void setDeductPeriod(String deductPeriod) {
		this.deductPeriod = deductPeriod;
	}

	public String getClauseType() {
		return this.clauseType;
	}

	public void setClauseType(String clauseType) {
		this.clauseType = clauseType;
	}
}
