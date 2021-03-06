package ins.sino.claimcar.claim.vo;

/**
 * Custom VO class of PO PrpLCompensateExt
 */ 
public class PrpLCompensateExtVo extends PrpLCompensateExtVoBase implements java.io.Serializable {
	private static final long serialVersionUID = 1L; 
	private String isAutoPay;//是否自动支付（0：否1：是） 是否推送资金系统
	private String isFastReparation;//是否快赔（0：否1：是）是否自动支付 低于1w
	public String getIsAutoPay() {
		return isAutoPay;
	}
	public void setIsAutoPay(String isAutoPay) {
		this.isAutoPay = isAutoPay;
	}
	public String getIsFastReparation() {
		return isFastReparation;
	}
	public void setIsFastReparation(String isFastReparation) {
		this.isFastReparation = isFastReparation;
	}
	
	
}
