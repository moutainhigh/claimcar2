package ins.sino.claimcar.regist.vo;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
import java.util.Date;

/**
 * Vo Base Class of PO PrpLRegistRiskInfo
 */
public class PrpLRegistRiskInfoVoBase implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String registNo;
	private String nodename;
	private String factorcode;
	private String factorname;
	private String factorvalue;
	private String displayseq;
	private String flag;
	private String remark;
	private String createUser;
	private Date createTime;
	private String updateUser;
	private Date updateTime;

	protected PrpLRegistRiskInfoVoBase(){

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

	public String getNodename() {
		return this.nodename;
	}

	public void setNodename(String nodename) {
		this.nodename = nodename;
	}

	public String getFactorcode() {
		return this.factorcode;
	}

	public void setFactorcode(String factorcode) {
		this.factorcode = factorcode;
	}

	public String getFactorname() {
		return this.factorname;
	}

	public void setFactorname(String factorname) {
		this.factorname = factorname;
	}

	public String getFactorvalue() {
		return this.factorvalue;
	}

	public void setFactorvalue(String factorvalue) {
		this.factorvalue = factorvalue;
	}

	public String getDisplayseq() {
		return this.displayseq;
	}

	public void setDisplayseq(String displayseq) {
		this.displayseq = displayseq;
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
