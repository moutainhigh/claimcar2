package ins.sino.claimcar.genilex.comResVo;

import java.io.Serializable;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("AccountNumberStatus")
public class AccountNumberStatusVo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@XStreamAlias("ResultCode")
	private String resultCode;//用户账户检验结果代码
	@XStreamAlias("ResultDesc")
	private String resultDesc;//用户账户检验结果描述					
	public String getResultCode() {
		return resultCode;
	}
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultDesc() {
		return resultDesc;
	}
	public void setResultDesc(String resultDesc) {
		this.resultDesc = resultDesc;
	}
		 				

}
