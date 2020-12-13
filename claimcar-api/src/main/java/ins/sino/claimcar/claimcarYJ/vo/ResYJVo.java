package ins.sino.claimcar.claimcarYJ.vo;

import ins.sino.claimcar.mobileCheckCommon.vo.MobileCheckResponseHead;

import java.io.Serializable;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("PACKET")
public class ResYJVo  implements Serializable {

	/**  */
	private static final long serialVersionUID = 1L;

	@XStreamAlias("HEAD")
	private MobileCheckResponseHead head;

	public MobileCheckResponseHead getHead() {
		return head;
	}

	public void setHead(MobileCheckResponseHead head) {
		this.head = head;
	}

}
