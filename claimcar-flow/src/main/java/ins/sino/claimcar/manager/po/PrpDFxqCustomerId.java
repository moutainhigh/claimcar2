package ins.sino.claimcar.manager.po;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * POJO Class PrpDFxqCustomerId
 */
@Embeddable
public class PrpDFxqCustomerId implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private String certiType;
	private String identifyType;
	private String identifyCode;

	@Column(name = "CERTITYPE", nullable = false, length=4)
	public String getCertiType() {
		return this.certiType;
	}

	public void setCertiType(String certiType) {
		this.certiType = certiType;
	}

	@Column(name = "IDENTIFYTYPE", nullable = false, length=4)
	public String getIdentifyType() {
		return this.identifyType;
	}

	public void setIdentifyType(String identifyType) {
		this.identifyType = identifyType;
	}

	@Column(name = "IDENTIFYCODE", nullable = false, length=20)
	public String getIdentifyCode() {
		return this.identifyCode;
	}

	public void setIdentifyCode(String identifyCode) {
		this.identifyCode = identifyCode;
	}
	public boolean equals(Object other) {
		if ((this == other)) {
			return true;
		}
		if ((other == null)) {
			return false;
		}
		
		if (!(other instanceof PrpDFxqCustomerId)) {
			return false;
		}
		PrpDFxqCustomerId castOther = (PrpDFxqCustomerId) other;  
		return ( (this.getCertiType()==castOther.getCertiType()) || ( this.getCertiType()!=null && castOther.getCertiType()!=null && this.getCertiType().equals(castOther.getCertiType()) ) )
 && ( (this.getIdentifyType()==castOther.getIdentifyType()) || ( this.getIdentifyType()!=null && castOther.getIdentifyType()!=null && this.getIdentifyType().equals(castOther.getIdentifyType()) ) )
 && ( (this.getIdentifyCode()==castOther.getIdentifyCode()) || ( this.getIdentifyCode()!=null && castOther.getIdentifyCode()!=null && this.getIdentifyCode().equals(castOther.getIdentifyCode()) ) );
	}
   
	public int hashCode() {
		int result = 17;         
		result = 37 * result + ( getCertiType() == null ? 0 : this.getCertiType().hashCode() );
		result = 37 * result + ( getIdentifyType() == null ? 0 : this.getIdentifyType().hashCode() );
		result = 37 * result + ( getIdentifyCode() == null ? 0 : this.getIdentifyCode().hashCode() );
		return result;
   }   
}
