package ins.sino.claimcar.claim.po;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
import java.util.Date;

import javax.persistence.Basic;
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

import org.hibernate.annotations.Type;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * POJO Class PrplFraudrisk
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@TableGenerator(name = "utiSequence", table = "UTISEQUENCE", pkColumnName = "GenName", valueColumnName = "GenValue", pkColumnValue = "PRPLFRAUDRISK_PK", allocationSize = 10)
@Table(name = "PRPLFRAUDRISK")
public class PrplFraudrisk implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private PrplcecheckResult prplcecheckResult;
	private String factCode;
	private String riskDesc;
	private String suggest;
	private Date createTime;

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "utiSequence")
	@Column(name = "ID", unique = true, nullable = false, precision=15, scale=0)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CEMAINID", nullable = false)
	public PrplcecheckResult getPrplcecheckResult() {
		return prplcecheckResult;
	}

	public void setPrplcecheckResult(PrplcecheckResult prplcecheckResult) {
		this.prplcecheckResult = prplcecheckResult;
	}


	@Column(name = "FACTCODE", length=80)
	public String getFactCode() {
		return this.factCode;
	}

	public void setFactCode(String factCode) {
		this.factCode = factCode;
	}

	@Column(name = "RISKDESC")
    @Basic(fetch = FetchType.LAZY)
	@Type(type = "org.hibernate.type.MaterializedClobType")
	public String getRiskDesc() {
		return this.riskDesc;
	}

	public void setRiskDesc(String riskDesc) {
		this.riskDesc = riskDesc;
	}

	@Column(name = "SUGGEST")
    @Basic(fetch = FetchType.LAZY)
	@Type(type = "org.hibernate.type.MaterializedClobType")
	public String getSuggest() {
		return this.suggest;
	}

	public void setSuggest(String suggest) {
		this.suggest = suggest;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATETIME", nullable = false, length=7)
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}
