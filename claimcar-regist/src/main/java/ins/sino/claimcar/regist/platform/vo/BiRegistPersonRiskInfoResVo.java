package ins.sino.claimcar.regist.platform.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
/*
 * 6.1.2.5.人员风险类型提示信息
 * niuqiang
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class BiRegistPersonRiskInfoResVo {
	@XmlElement(name="PersonRiskType", required = true)
	private String personRiskType;

	public String getPersonRiskType() {
		return personRiskType;
	}

	public void setPersonRiskType(String personRiskType) {
		this.personRiskType = personRiskType;
	}
	

}
