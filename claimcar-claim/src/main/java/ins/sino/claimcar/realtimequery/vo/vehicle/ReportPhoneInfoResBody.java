package ins.sino.claimcar.realtimequery.vo.vehicle;

import java.io.Serializable;
import java.util.List;

public class ReportPhoneInfoResBody implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String usAge; //查询剩余次数
	private List<AntiFraud> AntiFraud;
	private List<ReportPhoneHistoryClaims> HistoryClaims;
	public String getUsAge() {
		return usAge;
	}
	public void setUsAge(String usAge) {
		this.usAge = usAge;
	}
	public List<AntiFraud> getAntiFraud() {
		return AntiFraud;
	}
	public void setAntiFraud(List<AntiFraud> antiFraud) {
		AntiFraud = antiFraud;
	}
	public List<ReportPhoneHistoryClaims> getHistoryClaims() {
		return HistoryClaims;
	}
	public void setHistoryClaims(List<ReportPhoneHistoryClaims> historyClaims) {
		HistoryClaims = historyClaims;
	}
	
	
	
	
}
