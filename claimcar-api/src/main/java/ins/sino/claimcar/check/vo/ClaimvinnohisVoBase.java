package ins.sino.claimcar.check.vo;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
import java.util.Date;


/**
 * Vo Base Class of PO Claimvinnohis
 */ 
public class ClaimvinnohisVoBase implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String registNo;
	private Integer serialNo;
	private String licenseNo;
	private String oldVinNo;
	private String newVinNo;
	private String updateUser;
	private Date updateTime;
	private String remark;

    protected ClaimvinnohisVoBase() {
	
    }

    
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getLicenseNo() {
		return this.licenseNo;
	}

	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}

	public String getOldVinNo() {
		return this.oldVinNo;
	}

	public void setOldVinNo(String oldVinNo) {
		this.oldVinNo = oldVinNo;
	}

	public String getNewVinNo() {
		return this.newVinNo;
	}

	public void setNewVinNo(String newVinNo) {
		this.newVinNo = newVinNo;
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

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}