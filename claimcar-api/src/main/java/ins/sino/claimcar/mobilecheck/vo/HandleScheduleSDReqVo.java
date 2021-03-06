package ins.sino.claimcar.mobilecheck.vo;

import java.io.Serializable;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 * 手动调度请求接口-vo（理赔请求快赔）
 * @author zy
 *
 */
@XStreamAlias("PACKET")
public class HandleScheduleSDReqVo implements Serializable {

	/**  */
	private static final long serialVersionUID = 1L;

	@XStreamAsAttribute
	private String type = "REQUEST";
	
	@XStreamAsAttribute
	private String version = "1.0";
	
	@XStreamAlias("HEAD")
	private HeadReq head;
	
	@XStreamAlias("BODY")
	private HandleScheduleReqSDBody body;
	
	

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

	public HeadReq getHead() {
		return head;
	}

	public void setHead(HeadReq head) {
		this.head = head;
	}

	public HandleScheduleReqSDBody getBody() {
		return body;
	}

	public void setBody(HandleScheduleReqSDBody body) {
		this.body = body;
	}


	
}
