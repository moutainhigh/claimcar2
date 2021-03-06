package ins.sino.claimcar.payment.vo;

import java.io.Serializable;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

/**
 * 主数据VO
 * 
 * @author ★<a href="mailto:huangyi@sinosoft.com.cn">HuangYi</a>
 * @Company www.sinosoft.com.cn
 * @Copyright Copyright (c) 2016年7月6日
 * @since (2016年7月6日 下午8:11:16): <br>
 */
@XStreamAlias("JPlanMain")
public class JPlanMainVo implements Serializable {

	private static final long serialVersionUID = 1L;
	@XStreamAlias("CertiType")
	private String certiType;// 字符 业务类型（Y预赔、C实赔、Z追偿）
	@XStreamAlias("CertiNo")
	private String certiNo;// 字符 业务号（计算书号、预赔款）
	@XStreamAlias("PolicyNo")
	private String policyNo;// 字符 保单号
	@XStreamAlias("RegistNo")
	private String registNo;// 字符 报案号
	@XStreamAlias("ClaimNo")
	private String claimNo;// 字符 立案号
	@XStreamAlias("OperateCode")
	private String operateCode;// 操作员工号
	@XStreamAlias("OperateComCode")
	private String operateComCode;// 操作员登录机构
	@XStreamAlias("PayComCode")
	private String payComCode;// 支付机构代码(一般为保单归属机构，通赔除外)
	@XStreamImplicit
	private List<JplanFeeVo> jplanFeeVos;// 收付主信息明细
	@XStreamImplicit
	private List<JlinkAccountVo> jlinkAccountVos;// 收款直付账号明细

	public String getCertiType() {
		return certiType;
	}

	public void setCertiType(String certiType) {
		this.certiType = certiType;
	}

	public String getCertiNo() {
		return certiNo;
	}

	public void setCertiNo(String certiNo) {
		this.certiNo = certiNo;
	}

	public String getPolicyNo() {
		return policyNo;
	}

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	public String getRegistNo() {
		return registNo;
	}

	public void setRegistNo(String registNo) {
		this.registNo = registNo;
	}

	public String getClaimNo() {
		return claimNo;
	}

	public void setClaimNo(String claimNo) {
		this.claimNo = claimNo;
	}

	public List<JplanFeeVo> getJplanFeeVos() {
		return jplanFeeVos;
	}

	public void setJplanFeeVos(List<JplanFeeVo> jplanFeeVos) {
		this.jplanFeeVos = jplanFeeVos;
	}

	public String getOperateCode() {
		return operateCode;
	}

	public void setOperateCode(String operateCode) {
		this.operateCode = operateCode;
	}

	public List<JlinkAccountVo> getJlinkAccountVos() {
		return jlinkAccountVos;
	}

	public void setJlinkAccountVos(List<JlinkAccountVo> jlinkAccountVos) {
		this.jlinkAccountVos = jlinkAccountVos;
	}

	public String getOperateComCode() {
		return operateComCode;
	}

	public void setOperateComCode(String operateComCode) {
		this.operateComCode = operateComCode;
	}

	public String getPayComCode() {
		return payComCode;
	}

	public void setPayComCode(String payComCode) {
		this.payComCode = payComCode;
	}

}
