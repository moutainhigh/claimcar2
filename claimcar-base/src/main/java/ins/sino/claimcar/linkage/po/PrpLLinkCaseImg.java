package ins.sino.claimcar.linkage.po;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
import java.math.BigDecimal;
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

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * POJO Class PrpLLinkCaseImg
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@TableGenerator(name = "utiSequence", table = "UTISEQUENCE", pkColumnName = "GenName", valueColumnName = "GenValue", pkColumnValue = "PRPLLINKCASEIMG_PK", allocationSize = 10)
@Table(name = "PRPLLINKCASEIMG")
public class PrpLLinkCaseImg implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String caseNumber;
	private String caseId;
	private String imgId;
	private String picUrl;
	private String tags;
	private BigDecimal orders;
	private String type;
	private Date createTime;
	private String smallPicUrl;

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "utiSequence") 
	@Column(name = "ID", unique = true, nullable = false, precision=15, scale=0)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "CASENUMBER", length=50)
	public String getCaseNumber() {
		return this.caseNumber;
	}

	public void setCaseNumber(String caseNumber) {
		this.caseNumber = caseNumber;
	}

	@Column(name = "CASEID", nullable = false, length=50)
	public String getCaseId() {
		return this.caseId;
	}

	public void setCaseId(String caseId) {
		this.caseId = caseId;
	}

	@Column(name = "IMGID", nullable = false, length=50)
	public String getImgId() {
		return this.imgId;
	}

	public void setImgId(String imgId) {
		this.imgId = imgId;
	}

	@Column(name = "PICURL", length=500)
	public String getPicUrl() {
		return this.picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	@Column(name = "TAGS", length=2)
	public String getTags() {
		return this.tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	@Column(name = "ORDERS", precision=0)
	public BigDecimal getOrders() {
		return this.orders;
	}

	public void setOrders(BigDecimal orders) {
		this.orders = orders;
	}

	@Column(name = "TYPE", length=2)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATETIME", nullable = false, length=7)
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Column(name = "SMALLPICURL", length=500)
	public String getSmallPicUrl() {
		return this.smallPicUrl;
	}

	public void setSmallPicUrl(String smallPicUrl) {
		this.smallPicUrl = smallPicUrl;
	}
}