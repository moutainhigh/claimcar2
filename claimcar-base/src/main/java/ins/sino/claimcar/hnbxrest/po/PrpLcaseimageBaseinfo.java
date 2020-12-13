package ins.sino.claimcar.hnbxrest.po;

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

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * POJO Class PrpLcaseimageBaseinfo
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@TableGenerator(name = "utiSequence", table = "UTISEQUENCE", pkColumnName = "GenName", valueColumnName = "GenValue", pkColumnValue = "PRPLCASEIMAGEBASEINFO_PK", allocationSize = 10)
@Table(name = "PRPLCASEIMAGEBASEINFO")
public class PrpLcaseimageBaseinfo implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private PrpLcaseImageinfoMain prpLcaseImageinfoMain;
	private String casecarNo;
	private String dutyType;
	private String imageUrl;
	private String imagetype;
	private Date createTime;
	

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "utiSequence")
	@Column(name = "ID", unique = true, nullable = false, precision = 12, scale = 0)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "INFOMAINID", nullable = false)
	public PrpLcaseImageinfoMain getPrpLcaseImageinfoMain() {
		return this.prpLcaseImageinfoMain;
	}

	public void setPrpLcaseImageinfoMain(PrpLcaseImageinfoMain prpLcaseImageinfoMain) {
		this.prpLcaseImageinfoMain = prpLcaseImageinfoMain;
	}

	@Column(name = "CASECARNO", length = 35)
	public String getCasecarNo() {
		return this.casecarNo;
	}

	public void setCasecarNo(String casecarNo) {
		this.casecarNo = casecarNo;
	}

	@Column(name = "DUTYTYPE", length = 35)
	public String getDutyType() {
		return this.dutyType;
	}

	public void setDutyType(String dutyType) {
		this.dutyType = dutyType;
	}

	@Column(name = "IMAGEURL", length = 200)
	public String getImageUrl() {
		return this.imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	@Column(name = "IMAGETYPE", length = 10)
	public String getImagetype() {
		return this.imagetype;
	}

	public void setImagetype(String imagetype) {
		this.imagetype = imagetype;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATETIME", length = 7)
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}