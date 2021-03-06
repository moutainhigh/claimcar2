package ins.sino.claimcar.manager.vo;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
import java.util.Date;


/**
 * Vo Base Class of PO PrpdAppraisa
 */ 
public class PrpdAppraisaVoBase implements java.io.Serializable {
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

    protected PrpdAppraisaVoBase() {
	
    }

    
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAppraisaName    () {
		return this.appraisaName    ;
	}

	public void setAppraisaName    (String appraisaName    ) {
		this.appraisaName     = appraisaName    ;
	}

	public String getAppraisaCode    () {
		return this.appraisaCode    ;
	}

	public void setAppraisaCode    (String appraisaCode    ) {
		this.appraisaCode     = appraisaCode    ;
	}

	public String getAddress        () {
		return this.address        ;
	}

	public void setAddress        (String address        ) {
		this.address         = address        ;
	}

	public String getAreaCode        () {
		return this.areaCode        ;
	}

	public void setAreaCode        (String areaCode        ) {
		this.areaCode         = areaCode        ;
	}

	public String getTelephoneNumber () {
		return this.telephoneNumber ;
	}

	public void setTelephoneNumber (String telephoneNumber ) {
		this.telephoneNumber  = telephoneNumber ;
	}

	public String getValidStatus     () {
		return this.validStatus     ;
	}

	public void setValidStatus     (String validStatus     ) {
		this.validStatus      = validStatus     ;
	}

	public String getRemark        () {
		return this.remark        ;
	}

	public void setRemark        (String remark        ) {
		this.remark         = remark        ;
	}

	public Date getCreatTime     () {
		return this.creatTime     ;
	}

	public void setCreatTime     (Date creatTime     ) {
		this.creatTime      = creatTime     ;
	}

	public String getCreatUser      () {
		return this.creatUser      ;
	}

	public void setCreatUser      (String creatUser      ) {
		this.creatUser       = creatUser      ;
	}

	public Date getUpdateTime     () {
		return this.updateTime     ;
	}

	public void setUpdateTime     (Date updateTime     ) {
		this.updateTime      = updateTime     ;
	}

	public String getUpdateUser() {
		return this.updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
}
