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
 * POJO Class Prplcourtfile
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@TableGenerator(name = "utiSequence", table = "UTISEQUENCE", pkColumnName = "GenName", valueColumnName = "GenValue", pkColumnValue = "PK_PRPLCOURTFILE", allocationSize = 10)
@Table(name = "PRPLCOURTFILE")
public class PrpLCourtFile implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private PrpLCourtMessage prpLCourtMessage;
	private String fileid;
	private String accidentno;
	private String caseno;
	private String wjmc;
	private Date scsj;
	private String wjurl;
	private String wjtype;
	private String dsrno;

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

	@Column(name = "FILEID", length=15)
	public String getFileid() {
		return this.fileid;
	}

	public void setFileid(String fileid) {
		this.fileid = fileid;
	}

	@Column(name = "ACCIDENTNO", length=50)
	public String getAccidentno() {
		return this.accidentno;
	}

	public void setAccidentno(String accidentno) {
		this.accidentno = accidentno;
	}

	@Column(name = "CASENO", length=50)
	public String getCaseno() {
		return this.caseno;
	}

	public void setCaseno(String caseno) {
		this.caseno = caseno;
	}

	@Column(name = "WJMC", length=80)
	public String getWjmc() {
		return this.wjmc;
	}

	public void setWjmc(String wjmc) {
		this.wjmc = wjmc;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "SCSJ", length=7)
	public Date getScsj() {
		return this.scsj;
	}

	public void setScsj(Date scsj) {
		this.scsj = scsj;
	}

	@Column(name = "WJURL", length=200)
	public String getWjurl() {
		return this.wjurl;
	}

	public void setWjurl(String wjurl) {
		this.wjurl = wjurl;
	}

	@Column(name = "WJTYPE", length=20)
	public String getWjtype() {
		return this.wjtype;
	}

	public void setWjtype(String wjtype) {
		this.wjtype = wjtype;
	}

	@Column(name = "DSRNO", length=50)
	public String getDsrno() {
		return this.dsrno;
	}

	public void setDsrno(String dsrno) {
		this.dsrno = dsrno;
	}
}
