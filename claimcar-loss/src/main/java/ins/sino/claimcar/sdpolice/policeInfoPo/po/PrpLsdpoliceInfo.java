package ins.sino.claimcar.sdpolice.policeInfoPo.po;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * POJO Class PrpLsdpoliceInfo
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@TableGenerator(name = "utiSequence", table = "UTISEQUENCE", pkColumnName = "GenName", valueColumnName = "GenValue", pkColumnValue = "PRPLSDPOLICEINFO_PK", allocationSize = 2)
@Table(name = "PRPLSDPOLICEINFO")
public class PrpLsdpoliceInfo implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String registNo;
	private String claimsequenceNo;
	private String claimStage;
	private String warnMessage;
	private Date createTime;
	private Date updateTime;

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "utiSequence")
	@Column(name = "ID", unique = true, nullable = false, precision = 12, scale = 0)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "REGISTNO", length = 25)
	public String getRegistNo() {
		return this.registNo;
	}

	public void setRegistNo(String registNo) {
		this.registNo = registNo;
	}

	@Column(name = "CLAIMSEQUENCENO", length = 35)
	public String getClaimsequenceNo() {
		return this.claimsequenceNo;
	}

	public void setClaimsequenceNo(String claimsequenceNo) {
		this.claimsequenceNo = claimsequenceNo;
	}

	@Column(name = "CLAIMSTAGE", length = 25)
	public String getClaimStage() {
		return this.claimStage;
	}

	public void setClaimStage(String claimStage) {
		this.claimStage = claimStage;
	}

	@Column(name = "WARNMESSAGE", length = 1000)
	public String getWarnMessage() {
		return this.warnMessage;
	}

	public void setWarnMessage(String warnMessage) {
		this.warnMessage = warnMessage;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATETIME", length = 7)
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATETIME", length = 7)
	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}
