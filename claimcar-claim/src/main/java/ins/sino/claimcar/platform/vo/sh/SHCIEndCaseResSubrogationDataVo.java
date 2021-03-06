/******************************************************************************
 * CREATETIME : 2016年6月6日 下午5:19:52
 ******************************************************************************/
package ins.sino.claimcar.platform.vo.sh;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

/**
 * @author ★XMSH
 */
public class SHCIEndCaseResSubrogationDataVo {

	@XmlElement(name = "SUBROGATION_NO")
	private String subrogationNo;// 代位求偿码

	@XmlElement(name = "SUBROGATION_FLAG", required = true)
	private String subrogationFlag;// 是否代位求偿标志

	@XmlElement(name = "DISPUTE_FLAG", required = true)
	private String disputeFlag;// 是否代位求偿争议标志

	@XmlElementWrapper(name = "RECOVERY_LIST")
	@XmlElement(name = "RECOVERY_DATA")
	private List<SHCIEndCaseResRecoveryDataVo> recoveryList;

	@XmlElementWrapper(name = "BERECOVERY_LIST")
	@XmlElement(name = "BERECOVERY_DATA")
	private List<SHCIEndCaseResBeRecoveryDataVo> beRecoveryList;

	@XmlElementWrapper(name = "BERECOVERY_LIST")
	@XmlElement(name = "BERECOVERY_DATA")
	private List<SHCIEndCaseResReasonDataVo> reasonList;

	/**
	 * @return 返回 subrogationNo 代位求偿码
	 */
	public String getSubrogationNo() {
		return subrogationNo;
	}

	/**
	 * @param subrogationNo 要设置的 代位求偿码
	 */
	public void setSubrogationNo(String subrogationNo) {
		this.subrogationNo = subrogationNo;
	}

	/**
	 * @return 返回 subrogationFlag 是否代位求偿标志
	 */
	public String getSubrogationFlag() {
		return subrogationFlag;
	}

	/**
	 * @param subrogationFlag 要设置的 是否代位求偿标志
	 */
	public void setSubrogationFlag(String subrogationFlag) {
		this.subrogationFlag = subrogationFlag;
	}

	/**
	 * @return 返回 disputeFlag 是否代位求偿争议标志
	 */
	public String getDisputeFlag() {
		return disputeFlag;
	}

	/**
	 * @param disputeFlag 要设置的 是否代位求偿争议标志
	 */
	public void setDisputeFlag(String disputeFlag) {
		this.disputeFlag = disputeFlag;
	}

	/**
	 * @return 返回 recoveryList。
	 */
	public List<SHCIEndCaseResRecoveryDataVo> getRecoveryList() {
		return recoveryList;
	}

	/**
	 * @param recoveryList 要设置的 recoveryList。
	 */
	public void setRecoveryList(List<SHCIEndCaseResRecoveryDataVo> recoveryList) {
		this.recoveryList = recoveryList;
	}

	/**
	 * @return 返回 beRecoveryList。
	 */
	public List<SHCIEndCaseResBeRecoveryDataVo> getBeRecoveryList() {
		return beRecoveryList;
	}

	/**
	 * @param beRecoveryList 要设置的 beRecoveryList。
	 */
	public void setBeRecoveryList(List<SHCIEndCaseResBeRecoveryDataVo> beRecoveryList) {
		this.beRecoveryList = beRecoveryList;
	}

	/**
	 * @return 返回 reasonList。
	 */
	public List<SHCIEndCaseResReasonDataVo> getReasonList() {
		return reasonList;
	}

	/**
	 * @param reasonList 要设置的 reasonList。
	 */
	public void setReasonList(List<SHCIEndCaseResReasonDataVo> reasonList) {
		this.reasonList = reasonList;
	}

}
