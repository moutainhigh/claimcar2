package ins.sino.claimcar.court.po;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
import java.util.Date;

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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * POJO Class Prplcourtmediation
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@TableGenerator(name = "utiSequence", table = "UTISEQUENCE", pkColumnName = "GenName", valueColumnName = "GenValue", pkColumnValue = "PK_PRPLCOURTMEDIATION", allocationSize = 10)
@Table(name = "PRPLCOURTMEDIATION")
public class PrpLCourtMediation implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private PrpLCourtMessage prpLCourtMessage;
	private String accidentno;
	private String acciNo;
	private String mediationnum;
	private String mediationtype;
	private Date applydate;
	private Date acceptdate;
	private String mediation;
	private String handler;
	private String mediationaddr;
	private Date mediationdate;
	private String mediationstatus;
	private String isappraisal;
	private String jyqk;
	private String dfqk;
	private String jcrqk;
	private String apply;
	private String dealresult;
	private String pcd;
	private String pcnd;
	private String mediationcontent;
	private Date lxsx;
	private String lxfs;
	private String issfqr;

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "utiSequence")
	@Column(name = "ID", unique = true, nullable = false, precision=12, scale=0)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="MAINID", nullable = false)
	public PrpLCourtMessage getPrpLCourtMessage() {
		return this.prpLCourtMessage;
	}

	public void setPrpLCourtMessage(PrpLCourtMessage prpLCourtMessage) {
		this.prpLCourtMessage = prpLCourtMessage;
	}

	@Column(name = "ACCIDENTNO", length=50)
	public String getAccidentno() {
		return this.accidentno;
	}

	public void setAccidentno(String accidentno) {
		this.accidentno = accidentno;
	}

	@Column(name = "ACCINO", length=50)
	public String getAcciNo() {
		return this.acciNo;
	}

	public void setAcciNo(String acciNo) {
		this.acciNo = acciNo;
	}

	@Column(name = "MEDIATIONNUM", length=50)
	public String getMediationnum() {
		return this.mediationnum;
	}

	public void setMediationnum(String mediationnum) {
		this.mediationnum = mediationnum;
	}

	@Column(name = "MEDIATIONTYPE", length=5)
	public String getMediationtype() {
		return this.mediationtype;
	}

	public void setMediationtype(String mediationtype) {
		this.mediationtype = mediationtype;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "APPLYDATE", length=7)
	public Date getApplydate() {
		return this.applydate;
	}

	public void setApplydate(Date applydate) {
		this.applydate = applydate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ACCEPTDATE", length=7)
	public Date getAcceptdate() {
		return this.acceptdate;
	}

	public void setAcceptdate(Date acceptdate) {
		this.acceptdate = acceptdate;
	}

	@Column(name = "MEDIATION", length=40)
	public String getMediation() {
		return this.mediation;
	}

	public void setMediation(String mediation) {
		this.mediation = mediation;
	}

	@Column(name = "HANDLER", length=40)
	public String getHandler() {
		return this.handler;
	}

	public void setHandler(String handler) {
		this.handler = handler;
	}

	@Column(name = "MEDIATIONADDR", length=80)
	public String getMediationaddr() {
		return this.mediationaddr;
	}

	public void setMediationaddr(String mediationaddr) {
		this.mediationaddr = mediationaddr;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "MEDIATIONDATE", length=7)
	public Date getMediationdate() {
		return this.mediationdate;
	}

	public void setMediationdate(Date mediationdate) {
		this.mediationdate = mediationdate;
	}

	@Column(name = "MEDIATIONSTATUS", length=80)
	public String getMediationstatus() {
		return this.mediationstatus;
	}

	public void setMediationstatus(String mediationstatus) {
		this.mediationstatus = mediationstatus;
	}

	@Column(name = "ISAPPRAISAL", length=2)
	public String getIsappraisal() {
		return this.isappraisal;
	}

	public void setIsappraisal(String isappraisal) {
		this.isappraisal = isappraisal;
	}

	@Column(name = "JYQK", length=200)
	public String getJyqk() {
		return this.jyqk;
	}

	public void setJyqk(String jyqk) {
		this.jyqk = jyqk;
	}

	@Column(name = "DFQK", length=200)
	public String getDfqk() {
		return this.dfqk;
	}

	public void setDfqk(String dfqk) {
		this.dfqk = dfqk;
	}

	@Column(name = "JCRQK", length=200)
	public String getJcrqk() {
		return this.jcrqk;
	}

	public void setJcrqk(String jcrqk) {
		this.jcrqk = jcrqk;
	}

	@Column(name = "APPLY", length=4000)
	public String getApply() {
		return this.apply;
	}

	public void setApply(String apply) {
		this.apply = apply;
	}

	@Column(name = "DEALRESULT", length=200)
	public String getDealresult() {
		return this.dealresult;
	}

	public void setDealresult(String dealresult) {
		this.dealresult = dealresult;
	}

	@Column(name = "PCD", length=80)
	public String getPcd() {
		return this.pcd;
	}

	public void setPcd(String pcd) {
		this.pcd = pcd;
	}

	@Column(name = "PCND", length=8)
	public String getPcnd() {
		return this.pcnd;
	}

	public void setPcnd(String pcnd) {
		this.pcnd = pcnd;
	}

	@Column(name = "MEDIATIONCONTENT", length=4000)
	public String getMediationcontent() {
		return this.mediationcontent;
	}

	public void setMediationcontent(String mediationcontent) {
		this.mediationcontent = mediationcontent;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LXSX", length=7)
	public Date getLxsx() {
		return this.lxsx;
	}

	public void setLxsx(Date lxsx) {
		this.lxsx = lxsx;
	}

	@Column(name = "LXFS", length=80)
	public String getLxfs() {
		return this.lxfs;
	}

	public void setLxfs(String lxfs) {
		this.lxfs = lxfs;
	}

	@Column(name = "ISSFQR", length=2)
	public String getIssfqr() {
		return this.issfqr;
	}

	public void setIssfqr(String issfqr) {
		this.issfqr = issfqr;
	}
}
