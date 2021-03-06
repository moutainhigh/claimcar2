package ins.sino.claimcar.manager.vo;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
import java.util.Date;


/**
 * Vo Base Class of PO PrpDFxqCustomer
 */ 
public class PrpDFxqCustomerVoBase implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private PrpDFxqCustomerIdVo id;
	private String certiNo;
	private String educationCode;
	private String addrType;
	private String address;
	private String insuredRera;
	private String name;
	private String phone;
	private Date validDate;
	private String businessCode;
	private String businessArea;
	private String revenueRegistNo;
	private String ownType;

    protected PrpDFxqCustomerVoBase() {
	
    }

    
	public PrpDFxqCustomerIdVo getId() {
		return this.id;
	}

	public void setId(PrpDFxqCustomerIdVo id) {
		this.id = id;
	}

	public String getCertiNo() {
		return this.certiNo;
	}

	public void setCertiNo(String certiNo) {
		this.certiNo = certiNo;
	}

	public String getEducationCode() {
		return this.educationCode;
	}

	public void setEducationCode(String educationCode) {
		this.educationCode = educationCode;
	}

	public String getAddrType() {
		return this.addrType;
	}

	public void setAddrType(String addrType) {
		this.addrType = addrType;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getInsuredRera() {
		return this.insuredRera;
	}

	public void setInsuredRera(String insuredRera) {
		this.insuredRera = insuredRera;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getValidDate() {
		return this.validDate;
	}

	public void setValidDate(Date validDate) {
		this.validDate = validDate;
	}

	public String getBusinessCode() {
		return this.businessCode;
	}

	public void setBusinessCode(String businessCode) {
		this.businessCode = businessCode;
	}

	public String getBusinessArea() {
		return this.businessArea;
	}

	public void setBusinessArea(String businessArea) {
		this.businessArea = businessArea;
	}

	public String getRevenueRegistNo() {
		return this.revenueRegistNo;
	}

	public void setRevenueRegistNo(String revenueRegistNo) {
		this.revenueRegistNo = revenueRegistNo;
	}

	public String getOwnType() {
		return this.ownType;
	}

	public void setOwnType(String ownType) {
		this.ownType = ownType;
	}
}
