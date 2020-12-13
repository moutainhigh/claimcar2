package ins.sino.claimcar.regist.po;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.validator.constraints.NotBlank;

/**
 * POJO Class PrpLCengage
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Table(name = "PRPCENGAGE")
public class PrpCengage implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private PrpCengageId id;
	private PrpCMain prpCMain;
	private String riskCode;
	private String clauseCode;
	private String clauses;
	private String titleFlag;
	private String flag;

	@EmbeddedId
	@NotBlank
	@AttributeOverrides( {
        @AttributeOverride(name = "POLICYNO", column = @Column(name = "POLICYNO", nullable = false, length=22) ), 
        @AttributeOverride(name = "SERIALNO", column = @Column(name = "SERIALNO", nullable = false, precision=15, scale=0)),
        @AttributeOverride(name = "LINENO", column = @Column(name = "LINENO", nullable = false, precision=15, scale=0 )) } )
	
	public PrpCengageId getId() {
		return id;
	}

	public void setId(PrpCengageId id) {
		this.id = id;
	}
	


	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="POLICYNO", nullable = false, insertable = false, updatable = false)
	public PrpCMain getPrpCMain() {
		return prpCMain;
	}

	public void setPrpCMain(PrpCMain prpCMain) {
		this.prpCMain = prpCMain;
	}

	

	@Column(name = "RISKCODE", length=4)
	public String getRiskCode() {
		return this.riskCode;
	}

	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}


	

	@Column(name = "CLAUSECODE", length=10)
	public String getClauseCode() {
		return this.clauseCode;
	}

	public void setClauseCode(String clauseCode) {
		this.clauseCode = clauseCode;
	}

	
	@Column(name = "CLAUSES", length=1000)
	public String getClauses() {
		return this.clauses;
	}

	public void setClauses(String clauses) {
		this.clauses = clauses;
	}

	@Column(name = "TITLEFLAG", length=1)
	public String getTitleFlag() {
		return this.titleFlag;
	}

	public void setTitleFlag(String titleFlag) {
		this.titleFlag = titleFlag;
	}

	

	@Column(name = "FLAG", length=10)
	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	
}
