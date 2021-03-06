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
 * POJO Class Prplcourtconfirm
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@TableGenerator(name = "utiSequence", table = "UTISEQUENCE", pkColumnName = "GenName", valueColumnName = "GenValue", pkColumnValue = "PK_PRPLCOURTCONFIRM", allocationSize = 10)
@Table(name = "PRPLCOURTCONFIRM")
public class PrpLCourtConfirm implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private PrpLCourtMessage prpLCourtMessage;
	private String acciNo;
	private String accidentno;
	private String zjhm;
	private String sqr;
	private Date sqsj;
	private String sqzt;
	private Date sfqrkssj;
	private Date sfqrjzsj;
	private String sfqrqk;
	private String sfqrjg;
	private String ah;
	private String slfy;

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

	@Column(name = "ACCINO", length=50)
	public String getAcciNo() {
		return this.acciNo;
	}

	public void setAcciNo(String acciNo) {
		this.acciNo = acciNo;
	}

	@Column(name = "ACCIDENTNO", length=50)
	public String getAccidentno() {
		return this.accidentno;
	}

	public void setAccidentno(String accidentno) {
		this.accidentno = accidentno;
	}

	@Column(name = "ZJHM", length=50)
	public String getZjhm() {
		return this.zjhm;
	}

	public void setZjhm(String zjhm) {
		this.zjhm = zjhm;
	}

	@Column(name = "SQR", length=40)
	public String getSqr() {
		return this.sqr;
	}

	public void setSqr(String sqr) {
		this.sqr = sqr;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "SQSJ", length=7)
	public Date getSqsj() {
		return this.sqsj;
	}

	public void setSqsj(Date sqsj) {
		this.sqsj = sqsj;
	}

	@Column(name = "SQZT", length=2)
	public String getSqzt() {
		return this.sqzt;
	}

	public void setSqzt(String sqzt) {
		this.sqzt = sqzt;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "SFQRKSSJ", length=7)
	public Date getSfqrkssj() {
		return this.sfqrkssj;
	}

	public void setSfqrkssj(Date sfqrkssj) {
		this.sfqrkssj = sfqrkssj;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "SFQRJZSJ", length=7)
	public Date getSfqrjzsj() {
		return this.sfqrjzsj;
	}

	public void setSfqrjzsj(Date sfqrjzsj) {
		this.sfqrjzsj = sfqrjzsj;
	}

	@Column(name = "SFQRQK", length=4000)
	public String getSfqrqk() {
		return this.sfqrqk;
	}

	public void setSfqrqk(String sfqrqk) {
		this.sfqrqk = sfqrqk;
	}

	@Column(name = "SFQRJG", length=4000)
	public String getSfqrjg() {
		return this.sfqrjg;
	}

	public void setSfqrjg(String sfqrjg) {
		this.sfqrjg = sfqrjg;
	}

	@Column(name = "AH", length=60)
	public String getAh() {
		return this.ah;
	}

	public void setAh(String ah) {
		this.ah = ah;
	}

	@Column(name = "SLFY", length=20)
	public String getSlfy() {
		return this.slfy;
	}

	public void setSlfy(String slfy) {
		this.slfy = slfy;
	}
}
