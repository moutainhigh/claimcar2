package ins.sino.claimcar.flow.vo;

import java.io.Serializable;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("TASKITEM")
public class NotifyMobileItem implements Serializable {

	/**  */
	private static final long serialVersionUID = 2964968376557481068L;
	
	@XStreamAlias("TASKID")
	private String taskId; 
	
	@XStreamAlias("NODETYPE")
	private String nodeType; //节点
	
	@XStreamAlias("ORIGINALTASKID")
	private String originalTaskId; //退回任务原ID
	
	@XStreamAlias("ITEMNO")
	private String itemNo; //标的序号
	
	@XStreamAlias("ITEMNONAME")
	private String itemName; //标的名称
	
	@XStreamAlias("CHECKSTATUS")
	private String checkStatus; //案件状态
	
	@XStreamAlias("HANDLERCODE")
	private String handlerCode; //原始处理人编码
	
	@XStreamAlias("HANDLERNAME")
	private String handlerName; //原始处理人名称
	
	@XStreamAlias("NEXTHANDLERCODE")
	private String nextHandlerCode; //处理人员编码
	
	@XStreamAlias("NEXTHANDLERNAME")
	private String nextHandlerName; // 处理人名称

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getNodeType() {
		return nodeType;
	}

	public void setNodeType(String nodeType) {
		this.nodeType = nodeType;
	}

	public String getItemNo() {
		return itemNo;
	}

	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getCheckStatus() {
		return checkStatus;
	}

	public void setCheckStatus(String checkStatus) {
		this.checkStatus = checkStatus;
	}

	public String getHandlerCode() {
		return handlerCode;
	}

	public void setHandlerCode(String handlerCode) {
		this.handlerCode = handlerCode;
	}

	public String getHandlerName() {
		return handlerName;
	}

	public void setHandlerName(String handlerName) {
		this.handlerName = handlerName;
	}

	public String getNextHandlerCode() {
		return nextHandlerCode;
	}

	public void setNextHandlerCode(String nextHandlerCode) {
		this.nextHandlerCode = nextHandlerCode;
	}

	public String getNextHandlerName() {
		return nextHandlerName;
	}

	public void setNextHandlerName(String nextHandlerName) {
		this.nextHandlerName = nextHandlerName;
	}

	public String getOriginalTaskId() {
		return originalTaskId;
	}

	public void setOriginalTaskId(String originalTaskId) {
		this.originalTaskId = originalTaskId;
	}
	
}
