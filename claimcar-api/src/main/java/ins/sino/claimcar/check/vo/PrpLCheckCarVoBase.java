package ins.sino.claimcar.check.vo;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
import java.math.BigDecimal;
import java.util.Date;

/**
 * Vo Base Class of PO PrpLCheckCar
 */
public class PrpLCheckCarVoBase implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Long carid;
	private Long checkTaskId;
	private Long scheduleitem;
	private String registNo;
	private Integer serialNo;
	private String lossFlag;
	private String checkAdress;
	private Date checkTime;
	private BigDecimal lossFee;
	private BigDecimal rescueFee;
	private String lossPart;
	private String ciIndemDuty;
	private String indemnityDuty;
	private BigDecimal indemnityDutyRate;
	private String kindCode;
	private String validFlag;
	private String remark;
	private String flag;
	private String createUser;
	private Date createTime;
	private String updateUser;
	private Date updateTime;
	private PrpLCheckCarInfoVo prpLCheckCarInfo;
	private PrpLCheckDriverVo prpLCheckDriver;

	protected PrpLCheckCarVoBase(){

	}

	public Long getCarid() {
		return this.carid;
	}

	public void setCarid(Long carid) {
		this.carid = carid;
	}

	public Long getScheduleitem() {
		return scheduleitem;
	}

	public void setScheduleitem(Long scheduleitem) {
		this.scheduleitem = scheduleitem;
	}

	public String getRegistNo() {
		return this.registNo;
	}

	public void setRegistNo(String registNo) {
		this.registNo = registNo;
	}

	public Integer getSerialNo() {
		return this.serialNo;
	}

	public void setSerialNo(Integer serialNo) {
		this.serialNo = serialNo;
	}

	public String getLossFlag() {
		return this.lossFlag;
	}

	public void setLossFlag(String lossFlag) {
		this.lossFlag = lossFlag;
	}

	public String getCheckAdress() {
		return this.checkAdress;
	}

	public void setCheckAdress(String checkAdress) {
		this.checkAdress = checkAdress;
	}

	public Date getCheckTime() {
		return this.checkTime;
	}

	public void setCheckTime(Date checkTime) {
		this.checkTime = checkTime;
	}

	public BigDecimal getLossFee() {
		return this.lossFee;
	}

	public void setLossFee(BigDecimal lossFee) {
		this.lossFee = lossFee;
	}

	public BigDecimal getRescueFee() {
		return this.rescueFee;
	}

	public void setRescueFee(BigDecimal rescueFee) {
		this.rescueFee = rescueFee;
	}

	public String getLossPart() {
		return this.lossPart;
	}

	public void setLossPart(String lossPart) {
		this.lossPart = lossPart;
	}

	public String getCiIndemDuty() {
		return this.ciIndemDuty;
	}

	public void setCiIndemDuty(String ciIndemDuty) {
		this.ciIndemDuty = ciIndemDuty;
	}

	public String getIndemnityDuty() {
		return this.indemnityDuty;
	}

	public void setIndemnityDuty(String indemnityDuty) {
		this.indemnityDuty = indemnityDuty;
	}

	public BigDecimal getIndemnityDutyRate() {
		return this.indemnityDutyRate;
	}

	public void setIndemnityDutyRate(BigDecimal indemnityDutyRate) {
		this.indemnityDutyRate = indemnityDutyRate;
	}

	public String getKindCode() {
		return this.kindCode;
	}

	public void setKindCode(String kindCode) {
		this.kindCode = kindCode;
	}

	public String getValidFlag() {
		return this.validFlag;
	}

	public void setValidFlag(String validFlag) {
		this.validFlag = validFlag;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getCreateUser() {
		return this.createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getUpdateUser() {
		return this.updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public PrpLCheckCarInfoVo getPrpLCheckCarInfo() {
		return this.prpLCheckCarInfo;
	}

	public void setPrpLCheckCarInfo(PrpLCheckCarInfoVo prpLCheckCarInfo) {
		this.prpLCheckCarInfo = prpLCheckCarInfo;
	}

	public PrpLCheckDriverVo getPrpLCheckDriver() {
		return this.prpLCheckDriver;
	}

	public void setPrpLCheckDriver(PrpLCheckDriverVo prpLCheckDriver) {
		this.prpLCheckDriver = prpLCheckDriver;
	}

	public Long getCheckTaskId() {
		return checkTaskId;
	}

	public void setCheckTaskId(Long checkTaskId) {
		this.checkTaskId = checkTaskId;
	}
}
