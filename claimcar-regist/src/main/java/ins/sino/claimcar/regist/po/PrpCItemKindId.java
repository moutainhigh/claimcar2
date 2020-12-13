package ins.sino.claimcar.regist.po;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * POJO Class PrpCItemKindId
 */
@Embeddable
public class PrpCItemKindId implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private String policyNo;
	private Long itemKindNo;

	@Column(name = "POLICYNO", nullable = false, length=22)
	public String getPolicyNo() {
		return this.policyNo;
	}

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	@Column(name = "ITEMKINDNO", nullable = false, precision=15, scale=0)
	public Long getItemKindNo() {
		return this.itemKindNo;
	}

	public void setItemKindNo(Long itemKindNo) {
		this.itemKindNo = itemKindNo;
	}
	public boolean equals(Object other) {
		if ((this == other)) {
			return true;
		}
		if ((other == null)) {
			return false;
		}
		
		if (!(other instanceof PrpCItemKindId)) {
			return false;
		}
		PrpCItemKindId castOther = (PrpCItemKindId) other;  
		return ( (this.getPolicyNo()==castOther.getPolicyNo()) || ( this.getPolicyNo()!=null && castOther.getPolicyNo()!=null && this.getPolicyNo().equals(castOther.getPolicyNo()) ) )
 && ( (this.getItemKindNo()==castOther.getItemKindNo()) || ( this.getItemKindNo()!=null && castOther.getItemKindNo()!=null && this.getItemKindNo().equals(castOther.getItemKindNo()) ) );
	}
   
	public int hashCode() {
		int result = 17;         
		result = 37 * result + ( getPolicyNo() == null ? 0 : this.getPolicyNo().hashCode() );
		result = 37 * result + ( getItemKindNo() == null ? 0 : this.getItemKindNo().hashCode() );
		return result;
   }   
}