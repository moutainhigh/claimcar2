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
 * POJO Class Prplcourtclaim
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@TableGenerator(name = "utiSequence", table = "UTISEQUENCE", pkColumnName = "GenName", valueColumnName = "GenValue", pkColumnValue = "PK_PRPLCOURTCLAIM", allocationSize = 10)
@Table(name = "PRPLCOURTCLAIM")
public class PrpLCourtClaim implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private PrpLCourtMessage prpLCourtMessage;
	private String laid;
	private Date ladate;
	private String issqtj;
	private String laaydm;
	private String jbfydm;
	private String jbfymc;
	private String labdje;
	private String laaymc;
	private String ajlybm;
	private String ssly;
	private String ssqq;
	private String scjg;
	private String jyqk;
	private String ly;
	private String acciNo;

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

	@Column(name = "LAID", length=50)
	public String getLaid() {
		return this.laid;
	}

	public void setLaid(String laid) {
		this.laid = laid;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LADATE", length=7)
	public Date getLadate() {
		return this.ladate;
	}

	public void setLadate(Date ladate) {
		this.ladate = ladate;
	}

	@Column(name = "ISSQTJ", length=50)
	public String getIssqtj() {
		return this.issqtj;
	}

	public void setIssqtj(String issqtj) {
		this.issqtj = issqtj;
	}

	@Column(name = "LAAYDM", length=50)
	public String getLaaydm() {
		return this.laaydm;
	}

	public void setLaaydm(String laaydm) {
		this.laaydm = laaydm;
	}

	@Column(name = "JBFYDM", length=50)
	public String getJbfydm() {
		return this.jbfydm;
	}

	public void setJbfydm(String jbfydm) {
		this.jbfydm = jbfydm;
	}

	@Column(name = "JBFYMC", length=50)
	public String getJbfymc() {
		return this.jbfymc;
	}

	public void setJbfymc(String jbfymc) {
		this.jbfymc = jbfymc;
	}

	@Column(name = "LABDJE", length=50)
	public String getLabdje() {
		return this.labdje;
	}

	public void setLabdje(String labdje) {
		this.labdje = labdje;
	}

	@Column(name = "LAAYMC", length=50)
	public String getLaaymc() {
		return this.laaymc;
	}

	public void setLaaymc(String laaymc) {
		this.laaymc = laaymc;
	}

	@Column(name = "AJLYBM", length=50)
	public String getAjlybm() {
		return this.ajlybm;
	}

	public void setAjlybm(String ajlybm) {
		this.ajlybm = ajlybm;
	}

	@Column(name = "SSLY", length=4000)
	public String getSsly() {
		return this.ssly;
	}

	public void setSsly(String ssly) {
		this.ssly = ssly;
	}

	@Column(name = "SSQQ", length=4000)
	public String getSsqq() {
		return this.ssqq;
	}

	public void setSsqq(String ssqq) {
		this.ssqq = ssqq;
	}

	@Column(name = "SCJG", length=4000)
	public String getScjg() {
		return this.scjg;
	}

	public void setScjg(String scjg) {
		this.scjg = scjg;
	}

	@Column(name = "JYQK", length=4000)
	public String getJyqk() {
		return this.jyqk;
	}

	public void setJyqk(String jyqk) {
		this.jyqk = jyqk;
	}

	@Column(name = "LY", length=4000)
	public String getLy() {
		return this.ly;
	}

	public void setLy(String ly) {
		this.ly = ly;
	}

	@Column(name = "ACCINO", length=50)
	public String getAcciNo() {
		return this.acciNo;
	}

	public void setAcciNo(String acciNo) {
		this.acciNo = acciNo;
	}
}
