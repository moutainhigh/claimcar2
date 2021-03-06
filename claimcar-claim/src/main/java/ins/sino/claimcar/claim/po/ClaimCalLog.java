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
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Type;

/**
 * POJO Class PrpLCompensate
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@TableGenerator(name = "utiSequence", table = "UTISEQUENCE", pkColumnName = "GenName", valueColumnName = "GenValue", pkColumnValue = "CLAIMCALLOG_PK", allocationSize = 10)
@Table(name = "CLAIMCALLOG")
public class ClaimCalLog implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String registNo;
	private String claimNo;
	private String lctext;
	private Date createTime;
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "utiSequence") 
	@Column(name = "ID", unique = true, nullable = false, precision=13, scale=0)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name = "REGISTNO")
	public String getRegistNo() {
		return registNo;
	}
	public void setRegistNo(String registNo) {
		this.registNo = registNo;
	}
	
	@Column(name = "CLAIMNO")
	public String getClaimNo() {
		return claimNo;
	}
	public void setClaimNo(String claimNo) {
		this.claimNo = claimNo;
	}
	
	@Column(name = "LCTEXT")
	@Basic(fetch = FetchType.LAZY)
	@Type(type = "org.hibernate.type.MaterializedClobType")
	public String getLctext() {
		return lctext;
	}
	public void setLctext(String lctext) {
		this.lctext = lctext;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATETIME", nullable = false, length=7)
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	

}
