package ins.sino.claimcar.policyLinkage.vo;

// Generated by Hibernate Tools 3.2.5 (sinosoft versionNumber), Don't modify!
import java.util.Date;


/**
 * Vo Base Class of PO PrpLLinkCaseInfo
 */ 
public class PrpLLinkCaseInfoVoBase implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String versionNumber;
	private String caseNumber;
	private String caseType;
	private Date accidentTime;
	private String hphm;
	private String status;
	private String externalType;
	private Date createTime;

    protected PrpLLinkCaseInfoVoBase() {
	
    }

    
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getVersionNumber() {
		return this.versionNumber;
	}

	public void setVersionNumber(String versionNumber) {
		this.versionNumber = versionNumber;
	}

	public String getCaseNumber() {
		return this.caseNumber;
	}

	public void setCaseNumber(String caseNumber) {
		this.caseNumber = caseNumber;
	}

	public String getCaseType() {
		return this.caseType;
	}

	public void setCaseType(String caseType) {
		this.caseType = caseType;
	}

	public Date getAccidentTime() {
		return this.accidentTime;
	}

	public void setAccidentTime(Date accidentTime) {
		this.accidentTime = accidentTime;
	}

	public String getHphm() {
		return this.hphm;
	}

	public void setHphm(String hphm) {
		this.hphm = hphm;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getExternalType() {
		return this.externalType;
	}

	public void setExternalType(String externalType) {
		this.externalType = externalType;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}
