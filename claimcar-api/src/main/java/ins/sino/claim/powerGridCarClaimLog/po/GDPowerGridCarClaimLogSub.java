package ins.sino.claim.powerGridCarClaimLog.po;

//Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
* POJO Class GDPowerGridCarClaimLog
*/
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Table(name = "GDPOWERGRIDCARCLAIMLOGSUB")
public class GDPowerGridCarClaimLogSub implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private String id;
	private String gdClaimLogId;
	private String registNo;
	private String claimNo;
	private String caseNo;

	@Id
	@Column(name = "ID", unique = true, nullable = false, length=100)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	@Column(name = "GDCLAIMLOGID", unique = true, nullable = false, length=100)
	public String getGdClaimLogId() {
		return gdClaimLogId;
	}

	public void setGdClaimLogId(String gdClaimLogId) {
		this.gdClaimLogId = gdClaimLogId;
	}

	@Column(name = "REGISTNO", length=32)
	public String getRegistNo() {
		return registNo;
	}

	public void setRegistNo(String registNo) {
		this.registNo = registNo;
	}

	@Column(name = "CLAIMNO", length=32)
	public String getClaimNo() {
		return claimNo;
	}

	public void setClaimNo(String claimNo) {
		this.claimNo = claimNo;
	}

	@Column(name = "CASENO", length=22)
	public String getCaseNo() {
		return caseNo;
	}

	public void setCaseNo(String caseNo) {
		this.caseNo = caseNo;
	}

}