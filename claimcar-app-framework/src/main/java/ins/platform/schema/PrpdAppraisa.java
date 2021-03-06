package ins.platform.schema;

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

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * POJO Class PrpdAppraisa
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@TableGenerator(name = "utiSequence", table = "UTISEQUENCE", pkColumnName = "GenName", valueColumnName = "GenValue", pkColumnValue = "PRPDAPPRAISA_PK", allocationSize = 10)
@Table(name = "PRPDAPPRAISA")
public class PrpdAppraisa implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String appraisaName;
	private String appraisaCode;
	private String address;
	private String areaCode;
	private String telephoneNumber;
	private String validStatus;
	private String remark;
	private Date creatTime;
	private String creatUser;
	private Date updateTime;
	private String updateUser;

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "utiSequence")
	@Column(name = "ID", unique = true, nullable = false, precision=13, scale=0)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "APPRAISANAME", nullable = false, length=50)
	public String getAppraisaName() {
		return this.appraisaName    ;
	}

	public void setAppraisaName(String appraisaName    ) {
		this.appraisaName= appraisaName;
	}

	@Column(name = "APPRAISACODE", nullable = false, length=20)
	public String getAppraisaCode() {
		return this.appraisaCode;
	}

	public void setAppraisaCode(String appraisaCode    ) {
		this.appraisaCode= appraisaCode;
	}

	@Column(name = "ADDRESS", nullable = false, length=200)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address        ) {
		this.address= address;
	}

	@Column(name = "AREACODE", nullable = false, length=30)
	public String getAreaCode() {
		return this.areaCode;
	}

	public void setAreaCode(String areaCode        ) {
		this.areaCode= areaCode        ;
	}

	@Column(name = "TELEPHONENUMBER", length=30)
	public String getTelephoneNumber () {
		return this.telephoneNumber ;
	}

	public void setTelephoneNumber (String telephoneNumber ) {
		this.telephoneNumber = telephoneNumber ;
	}

	@Column(name = "VALIDSTATUS", nullable = false, length=10)
	public String getValidStatus() {
		return this.validStatus;
	}

	public void setValidStatus(String validStatus     ) {
		this.validStatus= validStatus     ;
	}

	@Column(name = "REMARK", length=100)
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark        ) {
		this.remark = remark;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATTIME", length=7)
	public Date getCreatTime() {
		return this.creatTime;
	}

	public void setCreatTime(Date creatTime     ) {
		this.creatTime= creatTime     ;
	}

	@Column(name = "CREATUSER", length=20)
	public String getCreatUser() {
		return this.creatUser;
	}

	public void setCreatUser(String creatUser      ) {
		this.creatUser= creatUser;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATETIME", length=7)
	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime     ) {
		this.updateTime= updateTime     ;
	}

	@Column(name = "UPDATEUSER", length=20)
	public String getUpdateUser() {
		return this.updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
}
