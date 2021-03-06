package ins.sino.claimcar.carchild.vo;

import ins.platform.vo.SysUserVo;
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
	List<PrpLScheduleTaskVo> prpLScheduleTaskVoList;
	List<ScheduleItemVo> scheduleItemList;
	RevokeRestoreInfoReqVo reqVo;
	RevokeRestoreInfoResVo resVo;
	RevokeInfoResVo revokeInfoResVo;
	RevokeInfoReqVo revokeInfoReqVo;
	String schType;
	SysUserVo user;
	String businessType;
	String newTaskId;
    String newHandlerUser;
    String flag;
    String operateNode;
    
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
    
    
    public List<PrpLScheduleTaskVo> getPrpLScheduleTaskVoList() {
        return prpLScheduleTaskVoList;
    }

    
    public void setPrpLScheduleTaskVoList(List<PrpLScheduleTaskVo> prpLScheduleTaskVoList) {
        this.prpLScheduleTaskVoList = prpLScheduleTaskVoList;
    }

    
    public List<ScheduleItemVo> getScheduleItemList() {
        return scheduleItemList;
    }

    
    public void setScheduleItemList(List<ScheduleItemVo> scheduleItemList) {
        this.scheduleItemList = scheduleItemList;
    }
    
    

    
    public RevokeRestoreInfoReqVo getReqVo() {
        return reqVo;
    }

    
    public void setReqVo(RevokeRestoreInfoReqVo reqVo) {
        this.reqVo = reqVo;
    }

    
    public RevokeRestoreInfoResVo getResVo() {
        return resVo;
    }

    
    public void setResVo(RevokeRestoreInfoResVo resVo) {
        this.resVo = resVo;
    }

    
    public RevokeInfoResVo getRevokeInfoResVo() {
        return revokeInfoResVo;
    }

    
    public void setRevokeInfoResVo(RevokeInfoResVo revokeInfoResVo) {
        this.revokeInfoResVo = revokeInfoResVo;
    }

    
    public RevokeInfoReqVo getRevokeInfoReqVo() {
        return revokeInfoReqVo;
    }

    
    public void setRevokeInfoReqVo(RevokeInfoReqVo revokeInfoReqVo) {
        this.revokeInfoReqVo = revokeInfoReqVo;
    }

    public String getSchType() {
        return schType;
    }
    
    public void setSchType(String schType) {
        this.schType = schType;
    }

    
    public SysUserVo getUser() {
        return user;
    }

    
    public void setUser(SysUserVo user) {
        this.user = user;
    }

    
    public String getBusinessType() {
        return businessType;
    }

    
    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    
    public String getNewTaskId() {
        return newTaskId;
    }

    
    public void setNewTaskId(String newTaskId) {
        this.newTaskId = newTaskId;
    }

    
    public String getNewHandlerUser() {
        return newHandlerUser;
    }

    
    public void setNewHandlerUser(String newHandlerUser) {
        this.newHandlerUser = newHandlerUser;
    }

    
    public String getFlag() {
        return flag;
    }

    
    public void setFlag(String flag) {
        this.flag = flag;
    }

    
    public String getOperateNode() {
        return operateNode;
    }

    
    public void setOperateNode(String operateNode) {
        this.operateNode = operateNode;
    }
	
    
    
}
