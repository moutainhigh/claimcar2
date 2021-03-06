package ins.sino.claimcar.reopencase.po;

//Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
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

@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@TableGenerator(name = "utiSequence", table = "UTISEQUENCE", pkColumnName = "GenName", valueColumnName = "GenValue", pkColumnValue = "PRPLRECASETEXT_PK", allocationSize = 10)
@Table(name = "PRPLRECASETEXT")
public class PrpLReCaseText implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private PrpLReCase prpLReCase;
	private String operatorName;
	private String comName;
	private Date inputTime;
	private String checkOpinion;
	private String checkStatus;
	private String openReasonDetail;

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "utiSequence")   //自动生成主键
	@Column(name = "ID", unique = true, nullable = false, precision=12, scale=0)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="RECASEID", nullable = false)
	public PrpLReCase getPrpLReCase() {
		return prpLReCase;
	}
	public void setPrpLReCase(PrpLReCase prpLReCase) {
		this.prpLReCase = prpLReCase;
	}
	@Column(name = "OPERATORNAME", length=20)
	public String getOperatorName() {
		return operatorName;
	}
	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}
	@Column(name = "COMNAME", length=12)
	public String getComName() {
		return comName;
	}
	public void setComName(String comName) {
		this.comName = comName;
	}
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "INPUTTIME", length=7)
	public Date getInputTime() {
		return inputTime;
	}
	public void setInputTime(Date inputTime) {
		this.inputTime = inputTime;
	}
	@Column(name = "CHECKOPINION", length=500)
	public String getCheckOpinion() {
		return checkOpinion;
	}
	public void setCheckOpinion(String checkOpinion) {
		this.checkOpinion = checkOpinion;
	}
	@Column(name = "CHECKSTATUS", length=2)
	public String getCheckStatus() {
		return checkStatus;
	}
	public void setCheckStatus(String checkStatus) {
		this.checkStatus = checkStatus;
	}
	@Column(name = "OPENREASONDETAIL", length=500)
	public String getOpenReasonDetail() {
		return openReasonDetail;
	}
	public void setOpenReasonDetail(String openReasonDetail) {
		this.openReasonDetail = openReasonDetail;
	}
	
}