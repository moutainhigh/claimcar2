package ins.platform.vo;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!

/**
 * Vo Base Class of PO PrpdoldprovincecityArea
 */
public class PrpdoldprovincecityAreaVoBase implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private String code;
	private String name;
	private String parent;
	private String validStatus;

	protected PrpdoldprovincecityAreaVoBase() {

	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getParent() {
		return this.parent;
	}

	public void setParent(String parent) {
		this.parent = parent;
	}

	public String getValidStatus() {
		return this.validStatus;
	}

	public void setValidStatus(String validStatus) {
		this.validStatus = validStatus;
	}
}
