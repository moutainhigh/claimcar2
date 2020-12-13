package ins.sino.claimcar.certify.po;

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
 * POJO Class PrpLCertifyDirect
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@TableGenerator(name = "utiSequence", table = "UTISEQUENCE", pkColumnName = "GenName", valueColumnName = "GenValue", pkColumnValue = "PRPLCERTIFYDIRECT_PK", allocationSize = 10)
@Table(name = "PRPLCERTIFYDIRECT")
public class PrpLCertifyDirect implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private PrpLCertifyItem prpLCertifyItem;
	private String registNo;
	private String lossItemCode;
	private String lossItemName;
	private String typeCode;
	private String typeName;
	private String checkNode;
	private String checkUser;
	private String mustUpload;
	private String provideInd;
	private Integer imgNumber;
	private String validFlag;
	private String flag;
	private String remark;
	private String createUser;
	private Date createTime;
	private String updateUser;
	private Date updateTime;

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
    @JoinColumn(name="PRPLCERTIFYITEMID", nullable = false)
	public PrpLCertifyItem getPrpLCertifyItem() {
		return this.prpLCertifyItem;
	}

	public void setPrpLCertifyItem(PrpLCertifyItem prpLCertifyItem) {
		this.prpLCertifyItem = prpLCertifyItem;
	}

	@Column(name = "REGISTNO", nullable = false, length=25)
	public String getRegistNo() {
		return this.registNo;
	}

	public void setRegistNo(String registNo) {
		this.registNo = registNo;
	}

	@Column(name = "LOSSITEMCODE", length=10)
	public String getLossItemCode() {
		return this.lossItemCode;
	}

	public void setLossItemCode(String lossItemCode) {
		this.lossItemCode = lossItemCode;
	}

	@Column(name = "LOSSITEMNAME", length=200)
	public String getLossItemName() {
		return this.lossItemName;
	}

	public void setLossItemName(String lossItemName) {
		this.lossItemName = lossItemName;
	}

	@Column(name = "TYPECODE", length=10)
	public String getTypeCode() {
		return this.typeCode;
	}

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	@Column(name = "TYPENAME", length=200)
	public String getTypeName() {
		return this.typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	
	@Column(name = "CHECKNODE", nullable = false, length=30)
	public String getCheckNode() {
		return this.checkNode;
	}

	public void setCheckNode(String checkNode) {
		this.checkNode = checkNode;
	}

	@Column(name = "CHECKUSER", nullable = false, length=30)
	public String getCheckUser() {
		return this.checkUser;
	}

	public void setCheckUser(String checkUser) {
		this.checkUser = checkUser;
	}

	@Column(name = "MUSTUPLOAD", length=2)
	public String getMustUpload() {
		return this.mustUpload;
	}

	public void setMustUpload(String mustUpload) {
		this.mustUpload = mustUpload;
	}

	@Column(name = "PROVIDEIND", length=2)
	public String getProvideInd() {
		return this.provideInd;
	}

	public void setProvideInd(String provideInd) {
		this.provideInd = provideInd;
	}

	@Column(name = "IMGNUMBER", precision=5, scale=0)
	public Integer getImgNumber() {
		return this.imgNumber;
	}

	public void setImgNumber(Integer imgNumber) {
		this.imgNumber = imgNumber;
	}

	@Column(name = "VALIDFLAG", length=2)
	public String getValidFlag() {
		return this.validFlag;
	}

	public void setValidFlag(String validFlag) {
		this.validFlag = validFlag;
	}

	@Column(name = "FLAG", length=10)
	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	@Column(name = "REMARK", length=200)
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Column(name = "CREATEUSER", nullable = false, length=10)
	public String getCreateUser() {
		return this.createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATETIME", nullable = false, length=7)
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Column(name = "UPDATEUSER", nullable = false, length=10)
	public String getUpdateUser() {
		return this.updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATETIME", nullable = false, length=7)
	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}
