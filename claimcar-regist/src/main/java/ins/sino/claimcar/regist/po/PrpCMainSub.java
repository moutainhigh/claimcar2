package ins.sino.claimcar.regist.po;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import org.hibernate.validator.constraints.NotBlank;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * POJO Class PrpCMainSub
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@TableGenerator(name = "utiSequence", table = "UTISEQUENCE", pkColumnName = "GenName", valueColumnName = "GenValue", pkColumnValue = "PRPCMAINSUB_PK", allocationSize = 10)
@Table(name = "PRPCMAINSUB")
public class PrpCMainSub implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private PrpCMainSubId id;
	private String endorseNo;
	private String flag;
	private String remark;
	private Integer balancetimes;

	@EmbeddedId
	@NotBlank
	@AttributeOverrides( {
        @AttributeOverride(name = "POLICYNO", column = @Column(name = "POLICYNO", nullable = false, length=22) ), 
        @AttributeOverride(name = "MAINPOLICYNO", column = @Column(name = "MAINPOLICYNO", nullable = false, length=22) ) } )
	public PrpCMainSubId getId() {
		return this.id;
	}

	public void setId(PrpCMainSubId id) {
		this.id = id;
	}

	@Column(name = "ENDORSENO", length=25)
	public String getEndorseNo() {
		return this.endorseNo;
	}

	public void setEndorseNo(String endorseNo) {
		this.endorseNo = endorseNo;
	}

	@Column(name = "FLAG", length=10)
	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	@Column(name = "REMARK")
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Column(name = "BALANCETIMES", precision=8, scale=0)
	public Integer getBalancetimes() {
		return this.balancetimes;
	}

	public void setBalancetimes(Integer balancetimes) {
		this.balancetimes = balancetimes;
	}
}
