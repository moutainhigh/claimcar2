package ins.sino.claimcar.check.vo;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!


/**
 * Vo Base Class of PO PrpLCheckExt
 */ 
public class PrpLCheckExtVoBase implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private Long checkId;
	private String registNo;
	private String claimNo;
	private String checkExtCode;
	private String columnValue;
	private String checkExtName;
	private String validFlag;
	private String remark;
	private String flag;

    protected PrpLCheckExtVoBase() {
	
    }

    
	public String getRegistNo() {
		return this.registNo;
	}

	public void setRegistNo(String registNo) {
		this.registNo = registNo;
	}

	public String getClaimNo() {
		return this.claimNo;
	}

	public void setClaimNo(String claimNo) {
		this.claimNo = claimNo;
	}

	public String getCheckExtCode() {
		return this.checkExtCode;
	}

	public void setCheckExtCode(String checkExtCode) {
		this.checkExtCode = checkExtCode;
	}

	public String getColumnValue() {
		return this.columnValue;
	}

	public void setColumnValue(String columnValue) {
		this.columnValue = columnValue;
	}

	public String getCheckExtName() {
		return this.checkExtName;
	}

	public void setCheckExtName(String checkExtName) {
		this.checkExtName = checkExtName;
	}

	public String getValidFlag() {
		return this.validFlag;
	}

	public void setValidFlag(String validFlag) {
		this.validFlag = validFlag;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCheckId() {
		return checkId;
	}

	public void setCheckId(Long checkId) {
		this.checkId = checkId;
	}
}
