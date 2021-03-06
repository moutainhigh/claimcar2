package ins.platform.saa.schema;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.validator.constraints.NotBlank;

/**
 * POJO Class SaaFactorField
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@TableGenerator(name = "utiSequence", table = "UTISEQUENCE", pkColumnName = "GenName", valueColumnName = "GenValue", pkColumnValue = "PK_SAA_FACTORFIELD", allocationSize = 10)
@Table(name = "SAA_FACTORFIELD")
public class SaaFactorField implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private String id;
	private String tableEntity;
	private String factorCode;
	private String fieldCode;
	private Date createTime;
	private Date updateTime;

	@Id
	@NotBlank
	@Column(name = "ID", unique = true, nullable = false, length=22)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "FIELDCODE", nullable = false, length = 60)
	public String getFieldCode() {
		return this.fieldCode;
	}

	public void setFieldCode(String fieldCode) {
		this.fieldCode = fieldCode;
	}




	@Column(name = "TABLEENTITY", length = 60)
	public String getTableEntity() {
		return tableEntity;
	}

	public void setTableEntity(String tableEntity) {
		this.tableEntity = tableEntity;
	}

	@Column(name = "FACTORCODE", nullable = false, length = 60)
	public String getFactorCode() {
		return factorCode;
	}

	public void setFactorCode(String factorCode) {
		this.factorCode = factorCode;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATETIME", length = 19)
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATETIME", length = 19)
	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}
