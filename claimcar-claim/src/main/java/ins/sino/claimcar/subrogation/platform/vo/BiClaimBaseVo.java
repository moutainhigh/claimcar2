/******************************************************************************
* CREATETIME : 2016年3月17日 下午7:19:11
******************************************************************************/
package ins.sino.claimcar.subrogation.platform.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;


/**
 * @author ★YangKun
 * @CreateTime 2016年3月17日
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class BiClaimBaseVo {

	@XmlElement(name = "RecoveryCode", required = true)
	private String recoveryCode;//结算码


	/** 
	 * @return 返回 recoveryCode  结算码
	 */ 
	public String getRecoveryCode(){ 
	    return recoveryCode;
	}

	/** 
	 * @param recoveryCode 要设置的 结算码
	 */ 
	public void setRecoveryCode(String recoveryCode){ 
	    this.recoveryCode=recoveryCode;
	}






	
}
