package ins.sino.claimcar.platform.vo.transKindCodeVo;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!


/**
 * Vo Base Class of PO SysCicodeconvert
 */ 
public class SysCicodeconvertVoBase implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String codeType;
	private String codeCode;
	private String codeName;
	private String ciCode;
	private String ciCodeName;
	private String comCode;
	private String riskType;
	private String validStatus;
	private String remark;

    protected SysCicodeconvertVoBase() {
	
    }

    
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodeType() {
		return this.codeType;
	}

	public void setCodeType(String codeType) {
		this.codeType = codeType;
	}

	public String getCodeCode() {
		return this.codeCode;
	}

	public void setCodeCode(String codeCode) {
		this.codeCode = codeCode;
	}

	public String getCodeName() {
		return this.codeName;
	}

	public void setCodeName(String codeName) {
		this.codeName = codeName;
	}

	public String getCiCode() {
		return this.ciCode;
	}

	public void setCiCode(String ciCode) {
		this.ciCode = ciCode;
	}

	public String getCiCodeName() {
		return this.ciCodeName;
	}

	public void setCiCodeName(String ciCodeName) {
		this.ciCodeName = ciCodeName;
	}

	public String getComCode() {
		return this.comCode;
	}

	public void setComCode(String comCode) {
		this.comCode = comCode;
	}

	public String getRiskType() {
		return this.riskType;
	}

	public void setRiskType(String riskType) {
		this.riskType = riskType;
	}

	public String getValidStatus() {
		return this.validStatus;
	}

	public void setValidStatus(String validStatus) {
		this.validStatus = validStatus;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}