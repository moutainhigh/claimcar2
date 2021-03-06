package ins.sino.claimcar.mobilecheck.vo;

import java.io.Serializable;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 * 手动调度返回查勘定损员信息接口 - vo（快赔请求理赔）
 * @author zy
 *
 */
@XStreamAlias("PACKET")
public class HandleScheduleSDBackReqVo implements Serializable {

	/**  */
	private static final long serialVersionUID = 1L;

	@XStreamAsAttribute
	private String type = "REQUEST";
	
	@XStreamAsAttribute
	private String version = "1.0";
	
	@XStreamAlias("HEAD")
	private HeadRes head;
	
	@XStreamAlias("BODY")
	private HandleScheduleSDBackReqBody body;
	
	

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public HeadRes getHead() {
		return head;
	}

	public void setHead(HeadRes head) {
		this.head = head;
	}

	public HandleScheduleSDBackReqBody getBody() {
		return body;
	}

	public void setBody(HandleScheduleSDBackReqBody body) {
		this.body = body;
	}

	
	
}
