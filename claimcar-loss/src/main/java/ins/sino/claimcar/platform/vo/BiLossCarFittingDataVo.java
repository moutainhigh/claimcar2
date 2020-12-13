package ins.sino.claimcar.platform.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class BiLossCarFittingDataVo {

	@XmlElement(name = "ChangeOrRepair")
	private String changeOrRepair;// 更换或修理标志；参见代码

	@XmlElement(name = "FittingName")
	private String fittingName;// 更换/修理配件名称

	@XmlElement(name = "FittingNum")
	private String fittingNum;// 更换/修理配件件数

	@XmlElement(name = "MaterialFee")
	private String materialFee;// 更换/修理配件材料费（单价）

	@XmlElement(name = "ManHour")
	private String manHour;// 更换/修理配件工时

	@XmlElement(name = "ManPowerFee")
	private String manPowerFee;// 更换/修理配件人工费

	@XmlElement(name = "IsSubjoin")
	private String isSubjoin;// 是否增补；参见代码
	
	@XmlElement(name = "FittingCode")
	private String fittingCode;// 更换/修理配件名称代码
	
	@XmlElement(name = "FittingHostCode")
	private String fittingHostCode;// 更换/修理配件主机厂编码
	
	@XmlElement(name = "FittingPrice")
	private String fittingPrice;// 配件价格
	
	@XmlElement(name = "FittingPriceType")
	private String fittingPriceType;// 配件价格种类
	
	@XmlElement(name = "FittingBrand")
	private String fittingBrand;// 配件品牌

	/**
	 * @return 返回 changeOrRepair 更换或修理标志；参见代码
	 */
	public String getChangeOrRepair() {
		return changeOrRepair;
	}

	/**
	 * @param changeOrRepair 要设置的 更换或修理标志；参见代码
	 */
	public void setChangeOrRepair(String changeOrRepair) {
		this.changeOrRepair = changeOrRepair;
	}

	/**
	 * @return 返回 fittingName 更换/修理配件名称
	 */
	public String getFittingName() {
		return fittingName;
	}

	/**
	 * @param fittingName 要设置的 更换/修理配件名称
	 */
	public void setFittingName(String fittingName) {
		this.fittingName = fittingName;
	}

	/**
	 * @return 返回 fittingNum 更换/修理配件件数
	 */
	public String getFittingNum() {
		return fittingNum;
	}

	/**
	 * @param fittingNum 要设置的 更换/修理配件件数
	 */
	public void setFittingNum(String fittingNum) {
		this.fittingNum = fittingNum;
	}

	/**
	 * @return 返回 materialFee 更换/修理配件材料费（单价）
	 */
	public String getMaterialFee() {
		return materialFee;
	}

	/**
	 * @param materialFee 要设置的 更换/修理配件材料费（单价）
	 */
	public void setMaterialFee(String materialFee) {
		this.materialFee = materialFee;
	}

	/**
	 * @return 返回 manHour 更换/修理配件工时
	 */
	public String getManHour() {
		return manHour;
	}

	/**
	 * @param manHour 要设置的 更换/修理配件工时
	 */
	public void setManHour(String manHour) {
		this.manHour = manHour;
	}

	/**
	 * @return 返回 manPowerFee 更换/修理配件人工费
	 */
	public String getManPowerFee() {
		return manPowerFee;
	}

	/**
	 * @param manPowerFee 要设置的 更换/修理配件人工费
	 */
	public void setManPowerFee(String manPowerFee) {
		this.manPowerFee = manPowerFee;
	}

	/**
	 * @return 返回 isSubjoin 是否增补；参见代码
	 */
	public String getIsSubjoin() {
		return isSubjoin;
	}

	/**
	 * @param isSubjoin 要设置的 是否增补；参见代码
	 */
	public void setIsSubjoin(String isSubjoin) {
		this.isSubjoin = isSubjoin;
	}

	public String getFittingCode() {
		return fittingCode;
	}

	public void setFittingCode(String fittingCode) {
		this.fittingCode = fittingCode;
	}

	public String getFittingHostCode() {
		return fittingHostCode;
	}

	public void setFittingHostCode(String fittingHostCode) {
		this.fittingHostCode = fittingHostCode;
	}

	public String getFittingPrice() {
		return fittingPrice;
	}

	public void setFittingPrice(String fittingPrice) {
		this.fittingPrice = fittingPrice;
	}

	public String getFittingPriceType() {
		return fittingPriceType;
	}

	public void setFittingPriceType(String fittingPriceType) {
		this.fittingPriceType = fittingPriceType;
	}

	public String getFittingBrand() {
		return fittingBrand;
	}

	public void setFittingBrand(String fittingBrand) {
		this.fittingBrand = fittingBrand;
	}

}
