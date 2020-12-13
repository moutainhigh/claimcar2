package ins.sino.claimcar.check.vo;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
import java.math.BigDecimal;
import java.util.Date;


/**
 * Vo Base Class of PO PrpLCheckDriver
 */ 
public class PrpLCheckDriverVoBase implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Long driverId;
	private String registNo;
	private String driverName;
	private String driverSex;
	private BigDecimal driverAge;
	private String drivingCarType;
	private String identifyType;
	private String linkPhoneNumber;
	private String drivingLicenseNo;
	private String identifyNumber;
	private Date acceptLicenseDate;
	private Date driverValidDate;
	private String unitAddress;
	private String remark;
	private String validFlag;
	private String flag;

    protected PrpLCheckDriverVoBase() {
    }

	public Long getDriverId() {
		return this.driverId;
	}

	public void setDriverId(Long driverId) {
		this.driverId = driverId;
	}

	public String getRegistNo() {
		return this.registNo;
	}

	public void setRegistNo(String registNo) {
		this.registNo = registNo;
	}

	public String getDriverName() {
		return this.driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getDriverSex() {
		return this.driverSex;
	}

	public void setDriverSex(String driverSex) {
		this.driverSex = driverSex;
	}

	public BigDecimal getDriverAge() {
		return this.driverAge;
	}

	public void setDriverAge(BigDecimal driverAge) {
		this.driverAge = driverAge;
	}

	public String getDrivingCarType() {
		return this.drivingCarType;
	}

	public void setDrivingCarType(String drivingCarType) {
		this.drivingCarType = drivingCarType;
	}

	public String getIdentifyType() {
		return this.identifyType;
	}

	public void setIdentifyType(String identifyType) {
		this.identifyType = identifyType;
	}

	public String getLinkPhoneNumber() {
		return this.linkPhoneNumber;
	}

	public void setLinkPhoneNumber(String linkPhoneNumber) {
		this.linkPhoneNumber = linkPhoneNumber;
	}

	public String getDrivingLicenseNo() {
		return this.drivingLicenseNo;
	}

	public void setDrivingLicenseNo(String drivingLicenseNo) {
		this.drivingLicenseNo = drivingLicenseNo;
	}

	public String getIdentifyNumber() {
		return this.identifyNumber;
	}

	public void setIdentifyNumber(String identifyNumber) {
		this.identifyNumber = identifyNumber;
	}

	public Date getAcceptLicenseDate() {
		return this.acceptLicenseDate;
	}

	public void setAcceptLicenseDate(Date acceptLicenseDate) {
		this.acceptLicenseDate = acceptLicenseDate;
	}

	public Date getDriverValidDate() {
		return this.driverValidDate;
	}

	public void setDriverValidDate(Date driverValidDate) {
		this.driverValidDate = driverValidDate;
	}

	public String getUnitAddress() {
		return this.unitAddress;
	}

	public void setUnitAddress(String unitAddress) {
		this.unitAddress = unitAddress;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getValidFlag() {
		return this.validFlag;
	}

	public void setValidFlag(String validFlag) {
		this.validFlag = validFlag;
	}

	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}
}
