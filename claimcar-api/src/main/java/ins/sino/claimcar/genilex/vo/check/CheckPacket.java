package ins.sino.claimcar.genilex.vo.check;

import ins.sino.claimcar.genilex.vo.common.FraudRequest;
import ins.sino.claimcar.genilex.vo.common.Requestor;

import java.io.Serializable;
import java.util.List;



import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("DataPacket")
public class CheckPacket implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@XStreamAsAttribute
    @XStreamAlias("xmlns") 
	private String xmlns="http://soap.fraud.message.genilex.com";
	
	@XStreamAlias("PacketType") 
	private String  packetType;
	
	@XStreamAlias("Requestor") 
	private Requestor  requestor;
	
	@XStreamAlias("ProductRequests") 
	private List<FraudRequest>  productRequests;
	
	@XStreamAlias("Entities") 
	private CheckEntities  entities;
	
	public String getPacketType() {
		return packetType;
	}

	public void setPacketType(String packetType) {
		this.packetType = packetType;
	}

	public Requestor getRequestor() {
		return requestor;
	}

	public void setRequestor(Requestor requestor) {
		this.requestor = requestor;
	}

	public List<FraudRequest> getProductRequests() {
		return productRequests;
	}

	public void setProductRequests(List<FraudRequest> productRequests) {
		this.productRequests = productRequests;
	}

	public CheckEntities getEntities() {
		return entities;
	}

	public void setEntities(CheckEntities entities) {
		this.entities = entities;
	}
	
	
}
