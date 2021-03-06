/******************************************************************************
 * CREATETIME : 2016年6月1日 下午5:17:43
 ******************************************************************************/
package ins.sino.claimcar.platform.vo.sh;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @author ★XMSH
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class SHBIVClaimFittingDataVo {

	@XmlElement(name = "CHANGE_PART_NAME")
	private String changePartName;// 更换配件名称

	@XmlElement(name = "CHANGE_PART_NUM")
	private Integer changePartNum;// 更换配件件数

	@XmlElement(name = "CHANGE_PART_FEE")
	private Double changePartFee;// 更换配件材料费（单价）

	@XmlElement(name = "CHANGE_PART_TIME")
	private Double changePartTime;// 更换配件工时

	@XmlElement(name = "CHANGE_PART_MANPOWER_FEE")
	private Double changePartManpowerFee;// 更换配件人工费

	@XmlElement(name = "REPAIR_PART_NAME")
	private String repairPartName;// 修理配件名称

	@XmlElement(name = "REPAIR_PART_NUM")
	private Integer repairPartNum;// 修理配件件数

	@XmlElement(name = "REPAIR_PART_FEE")
	private Double repairPartFee;// 修理配件材料费（单价）

	@XmlElement(name = "REPAIR_PART_TIME")
	private Double repairPartTime;// 修理配件工时

	@XmlElement(name = "REPAIR_PART_MANPOWER_FEE")
	private Double repairPartManpowerFee;// 修理配件人工费

	@XmlElement(name = "REPAIR_METHORD", required = true)
	private String repairMethord;// 修理方式

	@XmlElement(name = "JY_PART_CODE")
	private String jyPartCode;// 精友配件代码

	@XmlElement(name = "OEM_PART_CODE")
	private String oemPartCode;// 原厂零件号

	@XmlElement(name = "DEFINE_FLAG", required = true)
	private String defineFlag;// 定义标志

	@XmlElement(name = "SUBJION_FLAG", required = true)
	private String subjionFlag;// 增补标志

	@XmlElement(name = "PRICE_TYPE", required = true)
	private String priceType;// 参考价格类型

	@XmlElement(name = "QUALITY_TYPE", required = true)
	private String qualityType;// 配件品质类型

	/**
	 * @return 返回 changePartName 更换配件名称
	 */
	public String getChangePartName() {
		return changePartName;
	}

	/**
	 * @param changePartName 要设置的 更换配件名称
	 */
	public void setChangePartName(String changePartName) {
		this.changePartName = changePartName;
	}

	/**
	 * @return 返回 changePartNum 更换配件件数
	 */
	public Integer getChangePartNum() {
		return changePartNum;
	}

	/**
	 * @param changePartNum 要设置的 更换配件件数
	 */
	public void setChangePartNum(Integer changePartNum) {
		this.changePartNum = changePartNum;
	}

	/**
	 * @return 返回 changePartFee 更换配件材料费（单价）
	 */
	public Double getChangePartFee() {
		return changePartFee;
	}

	/**
	 * @param changePartFee 要设置的 更换配件材料费（单价）
	 */
	public void setChangePartFee(Double changePartFee) {
		this.changePartFee = changePartFee;
	}

	/**
	 * @return 返回 changePartTime 更换配件工时
	 */
	public Double getChangePartTime() {
		return changePartTime;
	}

	/**
	 * @param changePartTime 要设置的 更换配件工时
	 */
	public void setChangePartTime(Double changePartTime) {
		this.changePartTime = changePartTime;
	}

	/**
	 * @return 返回 changePartManpowerFee 更换配件人工费
	 */
	public Double getChangePartManpowerFee() {
		return changePartManpowerFee;
	}

	/**
	 * @param changePartManpowerFee 要设置的 更换配件人工费
	 */
	public void setChangePartManpowerFee(Double changePartManpowerFee) {
		this.changePartManpowerFee = changePartManpowerFee;
	}

	/**
	 * @return 返回 repairPartName 修理配件名称
	 */
	public String getRepairPartName() {
		return repairPartName;
	}

	/**
	 * @param repairPartName 要设置的 修理配件名称
	 */
	public void setRepairPartName(String repairPartName) {
		this.repairPartName = repairPartName;
	}

	/**
	 * @return 返回 repairPartNum 修理配件件数
	 */
	public Integer getRepairPartNum() {
		return repairPartNum;
	}

	/**
	 * @param repairPartNum 要设置的 修理配件件数
	 */
	public void setRepairPartNum(Integer repairPartNum) {
		this.repairPartNum = repairPartNum;
	}

	/**
	 * @return 返回 repairPartFee 修理配件材料费（单价）
	 */
	public Double getRepairPartFee() {
		return repairPartFee;
	}

	/**
	 * @param repairPartFee 要设置的 修理配件材料费（单价）
	 */
	public void setRepairPartFee(Double repairPartFee) {
		this.repairPartFee = repairPartFee;
	}

	/**
	 * @return 返回 repairPartTime 修理配件工时
	 */
	public Double getRepairPartTime() {
		return repairPartTime;
	}

	/**
	 * @param repairPartTime 要设置的 修理配件工时
	 */
	public void setRepairPartTime(Double repairPartTime) {
		this.repairPartTime = repairPartTime;
	}

	/**
	 * @return 返回 repairPartManpowerFee 修理配件人工费
	 */
	public Double getRepairPartManpowerFee() {
		return repairPartManpowerFee;
	}

	/**
	 * @param repairPartManpowerFee 要设置的 修理配件人工费
	 */
	public void setRepairPartManpowerFee(Double repairPartManpowerFee) {
		this.repairPartManpowerFee = repairPartManpowerFee;
	}

	/**
	 * @return 返回 repairMethord 修理方式
	 */
	public String getRepairMethord() {
		return repairMethord;
	}

	/**
	 * @param repairMethord 要设置的 修理方式
	 */
	public void setRepairMethord(String repairMethord) {
		this.repairMethord = repairMethord;
	}

	/**
	 * @return 返回 jyPartCode 精友配件代码
	 */
	public String getJyPartCode() {
		return jyPartCode;
	}

	/**
	 * @param jyPartCode 要设置的 精友配件代码
	 */
	public void setJyPartCode(String jyPartCode) {
		this.jyPartCode = jyPartCode;
	}

	/**
	 * @return 返回 oemPartCode 原厂零件号
	 */
	public String getOemPartCode() {
		return oemPartCode;
	}

	/**
	 * @param oemPartCode 要设置的 原厂零件号
	 */
	public void setOemPartCode(String oemPartCode) {
		this.oemPartCode = oemPartCode;
	}

	/**
	 * @return 返回 defineFlag 定义标志
	 */
	public String getDefineFlag() {
		return defineFlag;
	}

	/**
	 * @param defineFlag 要设置的 定义标志
	 */
	public void setDefineFlag(String defineFlag) {
		this.defineFlag = defineFlag;
	}

	/**
	 * @return 返回 subjionFlag 增补标志
	 */
	public String getSubjionFlag() {
		return subjionFlag;
	}

	/**
	 * @param subjionFlag 要设置的 增补标志
	 */
	public void setSubjionFlag(String subjionFlag) {
		this.subjionFlag = subjionFlag;
	}

	/**
	 * @return 返回 priceType 参考价格类型
	 */
	public String getPriceType() {
		return priceType;
	}

	/**
	 * @param priceType 要设置的 参考价格类型
	 */
	public void setPriceType(String priceType) {
		this.priceType = priceType;
	}

	/**
	 * @return 返回 qualityType 配件品质类型
	 */
	public String getQualityType() {
		return qualityType;
	}

	/**
	 * @param qualityType 要设置的 配件品质类型
	 */
	public void setQualityType(String qualityType) {
		this.qualityType = qualityType;
	}

}
