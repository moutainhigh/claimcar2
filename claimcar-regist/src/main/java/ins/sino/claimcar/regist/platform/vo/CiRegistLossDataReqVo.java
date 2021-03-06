package ins.sino.claimcar.regist.platform.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;


/**
 * 交强报案请求平台信息ThirdVehicleDataVo类
 * @author dengkk
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class CiRegistLossDataReqVo {

	@XmlElement(name="CLAIM_FEE_TYPE")
	private String claimFeeType;    //损失项赔偿类型代码

	public String getClaimFeeType() {
		return claimFeeType;
	}

	public void setClaimFeeType(String claimFeeType) {
		this.claimFeeType = claimFeeType;
	}
	
	
}
