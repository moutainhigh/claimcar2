package ins.sino.claimcar.base.vo;

import ins.sino.claimcar.schedule.vo.PrpLScheduleItemsVo;
import ins.sino.claimcar.schedule.vo.PrpLScheduleTaskVo;

import java.util.List;
// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!


/**
 * Vo Base Class of PO SysMsgSendinfo
 */ 
public class RegistInformationVo implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	List<PrpLScheduleItemsVo> scheduleItemVos;
	PrpLScheduleTaskVo prpLScheduleTaskVo;
	String schType;
    
    public List<PrpLScheduleItemsVo> getScheduleItemVos() {
        return scheduleItemVos;
    }
    
    public void setScheduleItemVos(List<PrpLScheduleItemsVo> scheduleItemVos) {
        this.scheduleItemVos = scheduleItemVos;
    }
    
    public PrpLScheduleTaskVo getPrpLScheduleTaskVo() {
        return prpLScheduleTaskVo;
    }
    
    public void setPrpLScheduleTaskVo(PrpLScheduleTaskVo prpLScheduleTaskVo) {
        this.prpLScheduleTaskVo = prpLScheduleTaskVo;
    }
    
    public String getSchType() {
        return schType;
    }
    
    public void setSchType(String schType) {
        this.schType = schType;
    }
	
}
