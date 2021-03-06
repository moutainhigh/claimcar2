package ins.sino.claimcar.manager.vo;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
import java.math.BigDecimal;

/**
 * Vo Base Class of PO PrpLRepairBrand
 */
public class PrpLRepairBrandVoBase implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private PrpLRepairFactoryVo prpLRepairFactory;
	private String brandName;
	private String brandCode;
	private BigDecimal compRate;
	private BigDecimal hourRate;
	private String remark;

	protected PrpLRepairBrandVoBase(){

	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public PrpLRepairFactoryVo getPrpLRepairFactory() {
		return this.prpLRepairFactory;
	}

	public void setPrpLRepairFactory(PrpLRepairFactoryVo prpLRepairFactory) {
		this.prpLRepairFactory = prpLRepairFactory;
	}

	public String getBrandName() {
		return this.brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getBrandCode() {
		return this.brandCode;
	}

	public void setBrandCode(String brandCode) {
		this.brandCode = brandCode;
	}

	public BigDecimal getCompRate() {
		return this.compRate;
	}

	public void setCompRate(BigDecimal compRate) {
		this.compRate = compRate;
	}

	public BigDecimal getHourRate() {
		return this.hourRate;
	}

	public void setHourRate(BigDecimal hourRate) {
		this.hourRate = hourRate;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
