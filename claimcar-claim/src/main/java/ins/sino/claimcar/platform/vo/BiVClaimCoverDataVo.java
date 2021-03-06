/******************************************************************************
 * CREATETIME : 2016年5月24日 上午10:18:14
 ******************************************************************************/
package ins.sino.claimcar.platform.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * 理算核赔登记(商业)
 * 损失赔偿情况
 * @author ★XMSH
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class BiVClaimCoverDataVo {

	@XmlElement(name = "RecoveryOrPayFlag", required = true)
	private String recoveryOrPayFlag;// 追偿/清付标志；参见代码

	@XmlElement(name = "CoverageCode", required = true)
	private String coverageCode;// 赔偿险种代码；参见代码

	@XmlElement(name = "LossFeeType", required = true)
	private String lossFeeType;// 损失赔偿类型；参见代码

	@XmlElement(name = "LiabilityRate", required = true)
	private String liabilityRate;// 赔偿责任比例

	@XmlElement(name = "ClaimAmount", required = true)
	private Double claimAmount;// 赔款金额（含施救费）

	@XmlElement(name = "SalvageFee", required = true)
	private Double salvageFee;// 施救费

	@XmlElement(name = "LossAmount", required = true)
	private Double lossAmount;// 损失金额（不乘责任比例，不剔除免赔）
	
	@XmlElement(name = "IsDeviceItem")
	private String IsDeviceItem;//是否新增设备

	/**
	 * @return 返回 recoveryOrPayFlag 追偿/清付标志；参见代码
	 */
	public String getRecoveryOrPayFlag() {
		return recoveryOrPayFlag;
	}

	/**
	 * @param recoveryOrPayFlag 要设置的 追偿/清付标志；参见代码
	 */
	public void setRecoveryOrPayFlag(String recoveryOrPayFlag) {
		this.recoveryOrPayFlag = recoveryOrPayFlag;
	}

	/**
	 * @return 返回 coverageCode 赔偿险种代码；参见代码
	 */
	public String getCoverageCode() {
		return coverageCode;
	}

	/**
	 * @param coverageCode 要设置的 赔偿险种代码；参见代码
	 */
	public void setCoverageCode(String coverageCode) {
		this.coverageCode = coverageCode;
	}

	/**
	 * @return 返回 lossFeeType 损失赔偿类型；参见代码
	 */
	public String getLossFeeType() {
		return lossFeeType;
	}

	/**
	 * @param lossFeeType 要设置的 损失赔偿类型；参见代码
	 */
	public void setLossFeeType(String lossFeeType) {
		this.lossFeeType = lossFeeType;
	}

	/**
	 * @return 返回 liabilityRate 赔偿责任比例
	 */
	public String getLiabilityRate() {
		return liabilityRate;
	}

	/**
	 * @param liabilityRate 要设置的 赔偿责任比例
	 */
	public void setLiabilityRate(String liabilityRate) {
		this.liabilityRate = liabilityRate;
	}

	/**
	 * @return 返回 claimAmount 赔款金额（含施救费）
	 */
	public Double getClaimAmount() {
		return claimAmount;
	}

	/**
	 * @param claimAmount 要设置的 赔款金额（含施救费）
	 */
	public void setClaimAmount(Double claimAmount) {
		this.claimAmount = claimAmount;
	}

	/**
	 * @return 返回 salvageFee 施救费
	 */
	public Double getSalvageFee() {
		return salvageFee;
	}

	/**
	 * @param salvageFee 要设置的 施救费
	 */
	public void setSalvageFee(Double salvageFee) {
		this.salvageFee = salvageFee;
	}

	/**
	 * @return 返回 lossAmount 损失金额（不乘责任比例，不剔除免赔）
	 */
	public Double getLossAmount() {
		return lossAmount;
	}

	/**
	 * @param lossAmount 要设置的 损失金额（不乘责任比例，不剔除免赔）
	 */
	public void setLossAmount(Double lossAmount) {
		this.lossAmount = lossAmount;
	}
	
	public String getIsDeviceItem() {
		return IsDeviceItem;
	}
	/**
	 * @return 返回 IsDeviceItem 是否新增设备；参见代码
	 */
	public void setIsDeviceItem(String isDeviceItem) {
		IsDeviceItem = isDeviceItem;
	}
	
	

}
