package ins.sino.claimcar.certify.vo;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
import java.util.Date;


/**
 * Vo Base Class of PO PrpLCertifyDirect
 */ 
public class PrpLCertifyDirectVoBase implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private PrpLCertifyItemVo prpLCertifyItem;
	private String registNo;
	private String lossItemCode;
	private String lossItemName;
	private String typeCode;
	private String typeName;
	private String checkNode;
	private String checkUser;
	private String mustUpload;
	private String provideInd;
	private Integer imgNumber;
	private String validFlag;
	private String flag;
	private String remark;
	private String createUser;
	private Date createTime;
	private String updateUser;
	private Date updateTime;

    protected PrpLCertifyDirectVoBase() {
	
    }

    
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public PrpLCertifyItemVo getPrpLCertifyItem() {
		return this.prpLCertifyItem;
	}

	public void setPrpLCertifyItem(PrpLCertifyItemVo prpLCertifyItem) {
		this.prpLCertifyItem = prpLCertifyItem;
	}

	public String getRegistNo() {
		return this.registNo;
	}

	public void setRegistNo(String registNo) {
		this.registNo = registNo;
	}

	public String getLossItemCode() {
		return this.lossItemCode;
	}

	public void setLossItemCode(String lossItemCode) {
		this.lossItemCode = lossItemCode;
	}

	public String getLossItemName() {
		return this.lossItemName;
	}

	public void setLossItemName(String lossItemName) {
		this.lossItemName = lossItemName;
	}

	public String getTypeCode() {
		return this.typeCode;
	}

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	public String getTypeName() {
		return this.typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	
	public String getCheckNode() {
		return this.checkNode;
	}

	public void setCheckNode(String checkNode) {
		this.checkNode = checkNode;
	}

	public String getCheckUser() {
		return this.checkUser;
	}

	public void setCheckUser(String checkUser) {
		this.checkUser = checkUser;
	}

	public String getMustUpload() {
		return this.mustUpload;
	}

	public void setMustUpload(String mustUpload) {
		this.mustUpload = mustUpload;
	}

	public String getProvideInd() {
		return this.provideInd;
	}

	public void setProvideInd(String provideInd) {
		this.provideInd = provideInd;
	}

	public Integer getImgNumber() {
		return this.imgNumber;
	}

	public void setImgNumber(Integer imgNumber) {
		this.imgNumber = imgNumber;
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

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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
}
