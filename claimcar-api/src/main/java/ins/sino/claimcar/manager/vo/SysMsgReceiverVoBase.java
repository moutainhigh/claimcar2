package ins.sino.claimcar.manager.vo;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
import java.util.Date;


/**
 * Vo Base Class of PO SysMsgreceiver
 */ 
public class SysMsgReceiverVoBase implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private Long msgId;
	private String msgReceiver;
	private String receTerminalType;
	private String receTerminal;
	private String readFlag;
	private String status;
	private Date ctreatedate;
	private String remark;

    protected SysMsgReceiverVoBase() {
	
    }

    
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getMsgId() {
		return this.msgId;
	}

	public void setMsgId(Long msgId) {
		this.msgId = msgId;
	}

	public String getMsgReceiver() {
		return this.msgReceiver;
	}

	public void setMsgReceiver(String msgReceiver) {
		this.msgReceiver = msgReceiver;
	}

	public String getReceTerminalType() {
		return this.receTerminalType;
	}

	public void setReceTerminalType(String receTerminalType) {
		this.receTerminalType = receTerminalType;
	}

	public String getReceTerminal() {
		return this.receTerminal;
	}

	public void setReceTerminal(String receTerminal) {
		this.receTerminal = receTerminal;
	}

	public String getReadFlag() {
		return this.readFlag;
	}

	public void setReadFlag(String readFlag) {
		this.readFlag = readFlag;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCtreatedate() {
		return this.ctreatedate;
	}

	public void setCtreatedate(Date ctreatedate) {
		this.ctreatedate = ctreatedate;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
