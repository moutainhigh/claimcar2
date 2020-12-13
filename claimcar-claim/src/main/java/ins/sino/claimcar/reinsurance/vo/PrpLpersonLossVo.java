package ins.sino.claimcar.reinsurance.vo;

import ins.platform.utils.xstreamconverters.SinosoftDoubleConverter;
import ins.platform.utils.xstreamconverters.SinosoftIntegerConverter;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!

/**
 * ����������ʧ����ϢPrpLClaimVo
 * @author luows
 * @since (2016��7��26�� ����9:11:16): <br>
 */ 
@XStreamAlias("PrpLpersonLoss")
public class PrpLpersonLossVo implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	@XStreamAlias("compensateNo")
	private	String 	compensateNo;	//	�������
	@XStreamAlias("riskCode")
	private	String	riskCode;	//	����
	@XStreamAlias("policyNo")
	private	String 	policyNo;	//	������
	@XStreamConverter(value = SinosoftIntegerConverter.class)
	private	int	serialNo;	//	�⸶������
	@XStreamConverter(value = SinosoftIntegerConverter.class)
	private	int	personNo;	//	��Ա���
	@XStreamConverter(value = SinosoftIntegerConverter.class)
	private	int	itemKindNo;	//	����ձ����
	@XStreamAlias("kindCode")
	private	String 	kindCode;	//	����ձ����
	@XStreamAlias("kindName")
	private	String 	kindName;	//	�ձ�������
	@XStreamAlias("currency")
	private	String 	currency;	//	ʵ��ұ�
	@XStreamConverter(value = SinosoftDoubleConverter.class,strings = {"0.00"})
	private	double	sumRealPay;	//	ʵ����
	@XStreamConverter(value = SinosoftDoubleConverter.class,strings = {"0.00"})
	private	double	exceptDeductiblePay;	//	���������ʽ��
	@XStreamConverter(value = SinosoftIntegerConverter.class)
	private	int	dangerNo;	//	Σ�յ�λ���


    public PrpLpersonLossVo() {
	
    }

	public String getCompensateNo() {
		return this.compensateNo;
	}

	public void setCompensateNo(String compensateNo) {
		this.compensateNo = compensateNo;
	}

	public String getPolicyNo() {
		return this.policyNo;
	}

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	public String getRiskCode() {
		return this.riskCode;
	}

	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}

	public int getSerialNo() {
		return this.serialNo;
	}

	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}

	public int getPersonNo() {
		return this.personNo;
	}

	public void setPersonNo(int personNo) {
		this.personNo = personNo;
	}
	
	public Integer getItemKindNo() {
		return this.itemKindNo;
	}

	public void setItemKindNo(Integer itemKindNo) {
		this.itemKindNo = itemKindNo;
	}

	public String getKindCode() {
		return this.kindCode;
	}

	public void setKindCode(String kindCode) {
		this.kindCode = kindCode;
	}

	public String getKindName() {
		return this.kindName;
	}

	public void setKindName(String kindName) {
		this.kindName = kindName;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public double getSumRealPay() {
		return this.sumRealPay;
	}

	public void setSumRealPay(double sumRealPay) {
		this.sumRealPay = sumRealPay;
	}
	
	public double getExceptDeductiblePay() {
		return this.exceptDeductiblePay;
	}

	public void setExceptDeductiblePay(double exceptDeductiblePay) {
		this.exceptDeductiblePay = exceptDeductiblePay;
	}
	
	public int getDangerNo() {
		return this.dangerNo;
	}

	public void setDangerNo(int dangerNo) {
		this.dangerNo = dangerNo;
	}
	
}