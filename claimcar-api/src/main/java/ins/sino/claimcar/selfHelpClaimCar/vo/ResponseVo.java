package ins.sino.claimcar.selfHelpClaimCar.vo;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("PACKET")
public class ResponseVo{
@XStreamAsAttribute
@XStreamAlias("type")
private String type="RESPONSE";
@XStreamAsAttribute
@XStreamAlias("version")
private String version="1.0";
 @XStreamAlias("HEAD")
 private ResponseHeadVo resHeadVo;

public ResponseHeadVo getResHeadVo() {
	return resHeadVo;
}

public void setResHeadVo(ResponseHeadVo resHeadVo) {
	this.resHeadVo = resHeadVo;
}

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
 

}
