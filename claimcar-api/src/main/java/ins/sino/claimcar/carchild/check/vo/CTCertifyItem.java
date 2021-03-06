package ins.sino.claimcar.carchild.check.vo;

import ins.platform.utils.xstreamconverters.SinosoftDateConverter;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

@XStreamAlias("PRPLCERTIFYITEM")
public class CTCertifyItem implements Serializable{
	
	private static final long serialVersionUID = -4623864062836013585L;
	
	@XStreamAlias("REGISTNO")
	private String registNo; //报案号

    @XStreamAlias("CERTIFYTYPECODE")
    private String certifyTypeCode; //单证分类代码
	
    @XStreamAlias("CERTIFYTYPENAME")
    private String certifytypeName; //单证分类名称
  
    @XStreamAlias("DIRECTFLAG")
    private String directFlag; //收集齐全标志
    
    @XStreamAlias("CREATEUSER")
    private String createUser; //上传人员
    
    @XStreamAlias("CREATETIME")
    private String createTime; //上传时间

    @XStreamAlias("PRPLCERTIFYDIRECTLIST")
    private List<CTCertifyDirect> certifyDirect; //单证目录

	public String getRegistNo() {
		return registNo;
	}

	public void setRegistNo(String registNo) {
		this.registNo = registNo;
	}

	public String getCertifyTypeCode() {
		return certifyTypeCode;
	}

	public void setCertifyTypeCode(String certifyTypeCode) {
		this.certifyTypeCode = certifyTypeCode;
	}

	public String getCertifytypeName() {
		return certifytypeName;
	}

	public void setCertifytypeName(String certifytypeName) {
		this.certifytypeName = certifytypeName;
	}

	public String getDirectFlag() {
		return directFlag;
	}

	public void setDirectFlag(String directFlag) {
		this.directFlag = directFlag;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public List<CTCertifyDirect> getCertifyDirect() {
		return certifyDirect;
	}

	public void setCertifyDirect(List<CTCertifyDirect> certifyDirect) {
		this.certifyDirect = certifyDirect;
	}

}
