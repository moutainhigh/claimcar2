package ins.sino.claimcar.policyInfo.register.vo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class InsuranceClaimOutDangerVo implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String COMPANY_ID;//公司代码
	private String CLAIM_CODE;//理赔编码
	private String VEHICLE_TYPE;//出险车辆号牌种类
	private String CAR_MARK;//出险车辆号牌号码
	private String VEHICLE_CATEGORY;//出险车辆种类代码
	private String RACK_NO;//出险车辆车架号
	private String ENGINE_NO;//出险车辆发动机号
	private String DRIVER_NAME;//出险驾驶员姓名
	private String DRIVER_LICENSE_NO;//出险驾驶员证件号码
	private String REPAIR_FACTORY_NAME;//修理机构名称
	private String ESTIMATE_TYPE;//定损方式
	public String getCOMPANY_ID() {
		return COMPANY_ID;
	}
	public void setCOMPANY_ID(String cOMPANY_ID) {
		COMPANY_ID = cOMPANY_ID;
	}
	public String getCLAIM_CODE() {
		return CLAIM_CODE;
	}
	public void setCLAIM_CODE(String cLAIM_CODE) {
		CLAIM_CODE = cLAIM_CODE;
	}
	public String getVEHICLE_TYPE() {
		return VEHICLE_TYPE;
	}
	public void setVEHICLE_TYPE(String vEHICLE_TYPE) {
		VEHICLE_TYPE = vEHICLE_TYPE;
	}
	public String getCAR_MARK() {
		return CAR_MARK;
	}
	public void setCAR_MARK(String cAR_MARK) {
		CAR_MARK = cAR_MARK;
	}
	public String getVEHICLE_CATEGORY() {
		return VEHICLE_CATEGORY;
	}
	public void setVEHICLE_CATEGORY(String vEHICLE_CATEGORY) {
		VEHICLE_CATEGORY = vEHICLE_CATEGORY;
	}
	public String getRACK_NO() {
		return RACK_NO;
	}
	public void setRACK_NO(String rACK_NO) {
		RACK_NO = rACK_NO;
	}
	public String getENGINE_NO() {
		return ENGINE_NO;
	}
	public void setENGINE_NO(String eNGINE_NO) {
		ENGINE_NO = eNGINE_NO;
	}
	public String getDRIVER_NAME() {
		return DRIVER_NAME;
	}
	public void setDRIVER_NAME(String dRIVER_NAME) {
		DRIVER_NAME = dRIVER_NAME;
	}
	public String getDRIVER_LICENSE_NO() {
		return DRIVER_LICENSE_NO;
	}
	public void setDRIVER_LICENSE_NO(String dRIVER_LICENSE_NO) {
		DRIVER_LICENSE_NO = dRIVER_LICENSE_NO;
	}
	public String getREPAIR_FACTORY_NAME() {
		return REPAIR_FACTORY_NAME;
	}
	public void setREPAIR_FACTORY_NAME(String rEPAIR_FACTORY_NAME) {
		REPAIR_FACTORY_NAME = rEPAIR_FACTORY_NAME;
	}
	public String getESTIMATE_TYPE() {
		return ESTIMATE_TYPE;
	}
	public void setESTIMATE_TYPE(String eSTIMATE_TYPE) {
		ESTIMATE_TYPE = eSTIMATE_TYPE;
	}
	

}
