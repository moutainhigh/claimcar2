package ins.sino.claimcar.court.po;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
import java.math.BigDecimal;
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

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * POJO Class Prplcourtparty
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@TableGenerator(name = "utiSequence", table = "UTISEQUENCE", pkColumnName = "GenName", valueColumnName = "GenValue", pkColumnValue = "PK_PRPLCOURTPARTY", allocationSize = 10)
@Table(name = "PRPLCOURTPARTY")
public class PrpLCourtParty implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private PrpLCourtMessage prpLCourtMessage;
	private String acciNo;
	private String name;
	private String personidtype;
	private String personID;
	private String persontype;
	private String sflx;
	private String sex;
	private Date birth;
	private String gj;
	private String nation;
	private String phone;
	private String sdaddr;
	private String email;
	private String address;
	private String death;
	private String hkxz;
	private String nediationnum;
	private String scxs;
	private String hj;
	private String personvehicle;
	private String carno;
	private BigDecimal applicationmoney;
	private BigDecimal protocolmoey;
	private BigDecimal jslxje;

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
    @JoinColumn(name="MAINID", nullable = false)
	public PrpLCourtMessage getPrpLCourtMessage() {
		return this.prpLCourtMessage;
	}

	public void setPrpLCourtMessage(PrpLCourtMessage prpLCourtMessage) {
		this.prpLCourtMessage = prpLCourtMessage;
	}

	@Column(name = "ACCINO", length=50)
	public String getAcciNo() {
		return this.acciNo;
	}

	public void setAcciNo(String acciNo) {
		this.acciNo = acciNo;
	}

	@Column(name = "NAME", length=40)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "PERSONIDTYPE", length=2)
	public String getPersonidtype() {
		return this.personidtype;
	}

	public void setPersonidtype(String personidtype) {
		this.personidtype = personidtype;
	}

	@Column(name = "PERSONID", length=20)
	public String getPersonID() {
		return this.personID;
	}

	public void setPersonID(String personID) {
		this.personID = personID;
	}

	@Column(name = "PERSONTYPE", length=2)
	public String getPersontype() {
		return this.persontype;
	}

	public void setPersontype(String persontype) {
		this.persontype = persontype;
	}

	@Column(name = "SFLX", length=2)
	public String getSflx() {
		return this.sflx;
	}

	public void setSflx(String sflx) {
		this.sflx = sflx;
	}

	@Column(name = "SEX", length=1)
	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "BIRTH", length=7)
	public Date getBirth() {
		return this.birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	@Column(name = "GJ", length=5)
	public String getGj() {
		return this.gj;
	}

	public void setGj(String gj) {
		this.gj = gj;
	}

	@Column(name = "NATION", length=3)
	public String getNation() {
		return this.nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	@Column(name = "PHONE", length=20)
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name = "SDADDR", length=50)
	public String getSdaddr() {
		return this.sdaddr;
	}

	public void setSdaddr(String sdaddr) {
		this.sdaddr = sdaddr;
	}

	@Column(name = "EMAIL", length=50)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "ADDRESS", length=100)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "DEATH", length=2)
	public String getDeath() {
		return this.death;
	}

	public void setDeath(String death) {
		this.death = death;
	}

	@Column(name = "HKXZ", length=2)
	public String getHkxz() {
		return this.hkxz;
	}

	public void setHkxz(String hkxz) {
		this.hkxz = hkxz;
	}

	@Column(name = "NEDIATIONNUM", length=20)
	public String getNediationnum() {
		return this.nediationnum;
	}

	public void setNediationnum(String nediationnum) {
		this.nediationnum = nediationnum;
	}

	@Column(name = "SCXS", length=10)
	public String getScxs() {
		return this.scxs;
	}

	public void setScxs(String scxs) {
		this.scxs = scxs;
	}

	@Column(name = "HJ", length=100)
	public String getHj() {
		return this.hj;
	}

	public void setHj(String hj) {
		this.hj = hj;
	}

	@Column(name = "PERSONVEHICLE", length=5)
	public String getPersonvehicle() {
		return this.personvehicle;
	}

	public void setPersonvehicle(String personvehicle) {
		this.personvehicle = personvehicle;
	}

	@Column(name = "CARNO", length=20)
	public String getCarno() {
		return this.carno;
	}

	public void setCarno(String carno) {
		this.carno = carno;
	}

	@Column(name = "APPLICATIONMONEY", precision=14)
	public BigDecimal getApplicationmoney() {
		return this.applicationmoney;
	}

	public void setApplicationmoney(BigDecimal applicationmoney) {
		this.applicationmoney = applicationmoney;
	}

	@Column(name = "PROTOCOLMOEY", precision=14)
	public BigDecimal getProtocolmoey() {
		return this.protocolmoey;
	}

	public void setProtocolmoey(BigDecimal protocolmoey) {
		this.protocolmoey = protocolmoey;
	}

	@Column(name = "JSLXJE", precision=14)
	public BigDecimal getJslxje() {
		return this.jslxje;
	}

	public void setJslxje(BigDecimal jslxje) {
		this.jslxje = jslxje;
	}
}
