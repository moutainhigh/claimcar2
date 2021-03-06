package ins.sino.claimcar.manager.po;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * POJO Class PrpdcoderiskId
 */
@Embeddable
public class PrpdcoderiskId implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private String codetype;
	private String codecode;
	private String riskCode;

	@Column(name = "CODETYPE", nullable = false, length=20)
	public String getCodetype() {
		return this.codetype;
	}

	public void setCodetype(String codetype) {
		this.codetype = codetype;
	}

	@Column(name = "CODECODE", nullable = false, length=20)
	public String getCodecode() {
		return this.codecode;
	}

	public void setCodecode(String codecode) {
		this.codecode = codecode;
	}

	@Column(name = "RISKCODE", nullable = false, length=4)
	public String getRiskCode() {
		return this.riskCode;
	}

	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}
	public boolean equals(Object other) {
		if ((this == other)) {
			return true;
		}
		if ((other == null)) {
			return false;
		}
		
		if (!(other instanceof PrpdcoderiskId)) {
			return false;
		}
		PrpdcoderiskId castOther = (PrpdcoderiskId) other;  
		return ( (this.getCodetype()==castOther.getCodetype()) || ( this.getCodetype()!=null && castOther.getCodetype()!=null && this.getCodetype().equals(castOther.getCodetype()) ) )
 && ( (this.getCodecode()==castOther.getCodecode()) || ( this.getCodecode()!=null && castOther.getCodecode()!=null && this.getCodecode().equals(castOther.getCodecode()) ) )
 && ( (this.getRiskCode()==castOther.getRiskCode()) || ( this.getRiskCode()!=null && castOther.getRiskCode()!=null && this.getRiskCode().equals(castOther.getRiskCode()) ) );
	}
   
	public int hashCode() {
		int result = 17;         
		result = 37 * result + ( getCodetype() == null ? 0 : this.getCodetype().hashCode() );
		result = 37 * result + ( getCodecode() == null ? 0 : this.getCodecode().hashCode() );
		result = 37 * result + ( getRiskCode() == null ? 0 : this.getRiskCode().hashCode() );
		return result;
   }   
}
