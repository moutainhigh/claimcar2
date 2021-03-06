package ins.sino.claimcar.subrogation.vo;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * Vo Base Class of PO PrpLPlatCheck
 */ 
public class PrpLPlatCheckVoBase implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String recoveryCode;
	private Date recoverdStart;
	private String recoverComCode;
	private String recoverAreaCode;
	private String compensateComCode;
	private String compensateAreaCode;
	private String recoverReportNo;
	private String compensateReportNo;
	private String coverageCode;
	private String checkStats;
	private Date operateTime;
	private List<PrpLPlatCheckSubVo> prpLPlatCheckSubs = new ArrayList<PrpLPlatCheckSubVo>(0);

    protected PrpLPlatCheckVoBase() {
	
    }

    
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRecoveryCode() {
		return this.recoveryCode;
	}

	public void setRecoveryCode(String recoveryCode) {
		this.recoveryCode = recoveryCode;
	}

	public Date getRecoverdStart() {
		return this.recoverdStart;
	}

	public void setRecoverdStart(Date recoverdStart) {
		this.recoverdStart = recoverdStart;
	}

	public String getRecoverComCode() {
		return this.recoverComCode;
	}

	public void setRecoverComCode(String recoverComCode) {
		this.recoverComCode = recoverComCode;
	}

	public String getRecoverAreaCode() {
		return this.recoverAreaCode;
	}

	public void setRecoverAreaCode(String recoverAreaCode) {
		this.recoverAreaCode = recoverAreaCode;
	}

	public String getCompensateComCode() {
		return this.compensateComCode;
	}

	public void setCompensateComCode(String compensateComCode) {
		this.compensateComCode = compensateComCode;
	}

	public String getCompensateAreaCode() {
		return this.compensateAreaCode;
	}

	public void setCompensateAreaCode(String compensateAreaCode) {
		this.compensateAreaCode = compensateAreaCode;
	}

	public String getRecoverReportNo() {
		return this.recoverReportNo;
	}

	public void setRecoverReportNo(String recoverReportNo) {
		this.recoverReportNo = recoverReportNo;
	}

	public String getCompensateReportNo() {
		return this.compensateReportNo;
	}

	public void setCompensateReportNo(String compensateReportNo) {
		this.compensateReportNo = compensateReportNo;
	}

	public String getCoverageCode() {
		return this.coverageCode;
	}

	public void setCoverageCode(String coverageCode) {
		this.coverageCode = coverageCode;
	}

	public String getCheckStats() {
		return this.checkStats;
	}

	public void setCheckStats(String checkStats) {
		this.checkStats = checkStats;
	}

	public Date getOperateTime() {
		return this.operateTime;
	}

	public void setOperateTime(Date operateTime) {
		this.operateTime = operateTime;
	}

	public List<PrpLPlatCheckSubVo> getPrpLPlatCheckSubs() {
		return this.prpLPlatCheckSubs;
	}

	public void setPrpLPlatCheckSubs(List<PrpLPlatCheckSubVo> prpLPlatCheckSubs) {
		this.prpLPlatCheckSubs = prpLPlatCheckSubs;
	}
}
