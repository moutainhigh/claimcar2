package ins.sino.claimcar.regist.po;

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
 * POJO Class PrpLfestival
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@TableGenerator(name = "utiSequence", table = "UTISEQUENCE", pkColumnName = "GenName", valueColumnName = "GenValue", pkColumnValue = "PRPLFESTIVAL_PK", allocationSize = 10)
@Table(name = "PRPLFESTIVAL")
public class PrpLfestival implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String year;
	private String festivalName;
	private Date startDate;
	private Date endDate;
	private String festivalLength;
	private String remark;
	private String festivalType;

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "utiSequence")
	@Column(name = "ID", unique = true, nullable = false, precision = 13, scale = 0)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "YEAR", length = 20)
	public String getYear() {
		return this.year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	@Column(name = "FESTIVALNAME", length = 30)
	public String getFestivalName() {
		return this.festivalName;
	}

	public void setFestivalName(String festivalName) {
		this.festivalName = festivalName;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "STARTDATE", length = 7)
	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ENDDATE", length = 7)
	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	@Column(name = "FESTIVALLENGTH", length = 25)
	public String getFestivalLength() {
		return this.festivalLength;
	}

	public void setFestivalLength(String festivalLength) {
		this.festivalLength = festivalLength;
	}

	@Column(name = "REMARK", length = 350)
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Column(name = "FESTIVALTYPE", length = 30)
	public String getFestivalType() {
		return this.festivalType;
	}

	public void setFestivalType(String festivalType) {
		this.festivalType = festivalType;
	}
}
