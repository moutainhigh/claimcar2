package ins.sino.claimcar.hnbxrest.po;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * POJO Class PrpLcaseImageinfoMain
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@TableGenerator(name = "utiSequence", table = "UTISEQUENCE", pkColumnName = "GenName", valueColumnName = "GenValue", pkColumnValue = "PRPLCASEIMAGEINFOMAIN_PK", allocationSize = 10)
@Table(name = "PRPLCASEIMAGEINFOMAIN")
public class PrpLcaseImageinfoMain implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String caseNumber;
	private String registNo;
	private String dataType;
	private Date createTime;
	private String uploadFlag;
    private List<PrpLcaseimageBaseinfo> prpLcaseimageBaseinfos=new ArrayList<PrpLcaseimageBaseinfo>(0);
    private List<PrpLcasebankBaseinfo> prpLcasebankBaseinfos=new ArrayList<PrpLcasebankBaseinfo>(0);
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE,generator="utiSequence" )
	@Column(name = "ID", unique = true, nullable = false, precision = 12, scale = 0)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "CASENUMBER", length = 35)
	public String getCaseNumber() {
		return this.caseNumber;
	}

	public void setCaseNumber(String caseNumber) {
		this.caseNumber = caseNumber;
	}

	@Column(name = "REGISTNO", length = 35)
	public String getRegistNo() {
		return this.registNo;
	}

	public void setRegistNo(String registNo) {
		this.registNo = registNo;
	}

	@Column(name = "DATATYPE", length = 10)
	public String getDataType() {
		return this.dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATETIME", length = 7)
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	@Column(name = "UPLOADFLAG", length = 10)
	public String getUploadFlag() {
		return uploadFlag;
	}

	public void setUploadFlag(String uploadFlag) {
		this.uploadFlag = uploadFlag;
	}

	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="prpLcaseImageinfoMain")
	public List<PrpLcaseimageBaseinfo> getPrpLcaseimageBaseinfos() {
		return prpLcaseimageBaseinfos;
	}

	public void setPrpLcaseimageBaseinfos(List<PrpLcaseimageBaseinfo> prpLcaseimageBaseinfos) {
		this.prpLcaseimageBaseinfos = prpLcaseimageBaseinfos;
	}
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="prpLcaseImageinfoMain")
	public List<PrpLcasebankBaseinfo> getPrpLcasebankBaseinfos() {
		return prpLcasebankBaseinfos;
	}

	public void setPrpLcasebankBaseinfos(List<PrpLcasebankBaseinfo> prpLcasebankBaseinfos) {
		this.prpLcasebankBaseinfos = prpLcasebankBaseinfos;
	}
	
	
}