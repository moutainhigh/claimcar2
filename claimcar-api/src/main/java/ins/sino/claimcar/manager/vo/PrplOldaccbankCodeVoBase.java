package ins.sino.claimcar.manager.vo;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!

/**
 * Vo Base Class of PO PrplOldaccbankCode
 */
public class PrplOldaccbankCodeVoBase implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private String bankCode;
	private String bankName;
	private String bankNature;
	private String flag;
	private String articleCode;
	private String bankId;

	protected PrplOldaccbankCodeVoBase() {

	}

	public String getBankCode() {
		return this.bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getBankName() {
		return this.bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankNature() {
		return this.bankNature;
	}

	public void setBankNature(String bankNature) {
		this.bankNature = bankNature;
	}

	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getArticleCode() {
		return this.articleCode;
	}

	public void setArticleCode(String articleCode) {
		this.articleCode = articleCode;
	}

	public String getBankId() {
		return this.bankId;
	}

	public void setBankId(String bankId) {
		this.bankId = bankId;
	}
}
