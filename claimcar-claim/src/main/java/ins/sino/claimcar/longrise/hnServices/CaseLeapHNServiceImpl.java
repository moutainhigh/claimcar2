package ins.sino.claimcar.longrise.hnServices;

import ins.platform.common.service.facade.CodeTranService;
import ins.platform.utils.Base64EncodedUtil;
import ins.platform.utils.DateUtils;
import ins.platform.vo.SysUserVo;
import ins.sino.claimcar.CodeConstants;
import ins.sino.claimcar.carinterface.service.CaseLeapHNService;
import ins.sino.claimcar.carinterface.service.ClaimInterfaceLogService;
import ins.sino.claimcar.carinterface.util.BusinessType;
import ins.sino.claimcar.carinterface.vo.ClaimInterfaceLogVo;
import ins.sino.claimcar.certify.service.CertifyPubService;
import ins.sino.claimcar.certify.vo.PrpLCertifyMainVo;
import ins.sino.claimcar.claim.service.ClaimTaskService;
import ins.sino.claimcar.claim.service.CompensateTaskService;
import ins.sino.claimcar.claim.vo.PrpLClaimVo;
import ins.sino.claimcar.claim.vo.PrpLCompensateVo;
import ins.sino.claimcar.commom.vo.StringUtils;
import ins.sino.claimcar.endcase.vo.PrpLEndCaseVo;
import ins.sino.claimcar.flow.constant.FlowNode;
import ins.sino.claimcar.regist.service.PolicyViewService;
import ins.sino.claimcar.regist.service.RegistQueryService;
import ins.sino.claimcar.regist.service.RegistService;
import ins.sino.claimcar.regist.vo.PrpLCItemKindVo;
import ins.sino.claimcar.regist.vo.PrpLCMainVo;
import ins.sino.claimcar.regist.vo.PrpLRegistCarLossVo;
import ins.sino.claimcar.regist.vo.PrpLRegistVo;

import java.io.UnsupportedEncodingException;
import java.rmi.RemoteException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ws.rs.Path;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.SpringProperties;

import com.alibaba.dubbo.config.annotation.Service;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.XmlFriendlyNameCoder;
import com.thoughtworks.xstream.io.xml.XppDriver;
@Service(protocol = {"dubbo"}, validation = "true", registry = {"default"})
@Path("caseLeapHNService")
public class CaseLeapHNServiceImpl implements CaseLeapHNService{
	
	private Logger logger = LoggerFactory.getLogger(CaseLeapHNServiceImpl.class);
	
	@Autowired
	RegistService registService;
	@Autowired
	RegistQueryService registQueryService;
	@Autowired
	PolicyViewService policyViewService;
	@Autowired
	ClaimInterfaceLogService logService;
	@Autowired
	CompensateTaskService compensateTaskService;
	@Autowired
	CodeTranService codeTranService;
	@Autowired
	ClaimTaskService claimTaskService;
	@Autowired
	CertifyPubService certifyPubService;
	
	public  CaseBean importCaseData(CaseBean caseBean,String comCode) throws ParseException {
		if(caseBean==null){
			return null;
		}
		List<CaseBean> caseBeans = new ArrayList<CaseBean>();
		caseBeans.add(caseBean);
		return importCaseData(caseBeans,comCode).get(0);
	}

	public  CaseBean importCaseData(CaseBean caseBean,String url,String user,String pwd)  {
		if(caseBean==null){
			return null;
		}
		List<CaseBean> caseBeans = new ArrayList<CaseBean>();
		caseBeans.add(caseBean);
		return importCaseData(caseBeans,url,user,pwd).get(0);
	}

	public  List<CaseBean> importCaseData(List<CaseBean> caseBeans,String comCode) throws ParseException {
		if(caseBeans==null||caseBeans.isEmpty()){
			return caseBeans;
		}
		if(comCode==null||comCode.length()<2){
			for(CaseBean caseBean:caseBeans){
				caseBean.setIstatus("3");
				caseBean.setResultdesc("机构不明确");
			}
			return caseBeans;
		}
		String comCodeSub = comCode.substring(0,2);
		String url = "";
		String user = "";
		String pwd = "";
		return importCaseData(caseBeans,url,user,pwd);
	}

	protected  List<CaseBean> importCaseData(List<CaseBean> caseBeans,String url,String user,String pwd) {
		if(caseBeans==null||caseBeans.isEmpty()){
			for(CaseBean caseBean:caseBeans){
				caseBean.setIstatus("3");
				caseBean.setResultdesc("上传的数据为空");
			}
			return caseBeans;
		}
		if(url==null||url.trim().length()==0){
			for(CaseBean caseBean:caseBeans){
				caseBean.setIstatus("3");
				caseBean.setResultdesc("上传数据的服务地址为空");
			}
			return caseBeans;
		}
		try{
			IleapProxy ileapProxy = new IleapProxy(url);
			JSONArray jArray = JSONArray.fromObject(caseBeans);

			user = Base64EncodedUtil.encode(StringUtils.rightTrim(user).getBytes());
			pwd = Base64EncodedUtil.encode(StringUtils.rightTrim(pwd).getBytes());
			//System.out.println(jArray.toString());
			byte[] reBytes = ileapProxy.importCaseinfo(jArray.toString().getBytes("UTF-8"),user,pwd);
			if(reBytes==null){
				for(CaseBean caseBean:caseBeans){
					caseBean.setIstatus("");
					caseBean.setResultdesc("平台未返回信息");
				}
				return caseBeans;
			}
			jArray = JSONArray.fromObject(new String(reBytes,"UTF-8"));
			int index = 0;
			for(CaseBean caseBean:caseBeans){
				JSONObject jobj = jArray.getJSONObject(index);
				caseBean.setIstatus(String.valueOf(jobj.get("istatus")));
				caseBean.setResultdesc(String.valueOf(jobj.get("resultdesc")));
			}
		}
		catch(RemoteException e){
			for(CaseBean caseBean:caseBeans){
				caseBean.setIstatus("3");
				caseBean.setResultdesc(e.getMessage());
			}
			e.printStackTrace();
		}
		catch(UnsupportedEncodingException e){
			for(CaseBean caseBean:caseBeans){
				caseBean.setIstatus("3");
				caseBean.setResultdesc(e.getMessage());
			}
			e.printStackTrace();
		}
		catch(Exception e){
			for(CaseBean caseBean:caseBeans){
				caseBean.setIstatus("3");
				caseBean.setResultdesc(e.getMessage());
			}
			e.printStackTrace();
		}
		return caseBeans;
	}
	
	
//public  void main(String[] args) throws Exception {
//	CaseBean caseBean = new CaseBean();
//		caseBean.setInstype("1");// 产险
//	caseBean.setPhase("3");
//	caseBean.setCaseno("523044777");
//	caseBean.setMobile("132456465");
//	caseBean.setName("ste");
//	caseBean.setDotime("2016-09-09");
//	caseBean.setDoaddress("dress");
//	caseBean.setInssort("2313");
//	String url = "http://59.173.241.186:8042/HNIS/services/com.longrise.services.leap";
//	String user = "410000003065";
//	String pwd = "410000003065";
//	caseBean = importCaseData(caseBean,url,user,pwd);
//		System.out.println("====caseBean=="+caseBean);
//		System.out.println("====caseBean.getCaseno()=="+caseBean.getCaseno());
//		System.out.println("====caseBean.getIstatus()=="+caseBean.getIstatus());
//		System.out.println("====caseBean.getImessage()=="+caseBean.getImessage());
//	}
	
/**
 * 产险立案：案件号、立案人姓名、立案人手机号码、险种、车牌号、车架号、被保险人身份证号、出险时间
	产险结案：案件号、立案人姓名、立案人手机号码、险种、结案时间
 * @param prpLRegistVo
 * @param userVo
 * @throws ParseException 
 */
    @Override
	public  ClaimInterfaceLogVo claimToHN(PrpLClaimVo prpLClaimVo,SysUserVo userVo) throws ParseException{
		PrpLRegistVo prpLRegistVo = registQueryService.findByRegistNo(prpLClaimVo.getRegistNo());
		//联共保 从共，从保不对接外部系统
		if(CodeConstants.GBFlag.MINORCOMMON.equals(prpLRegistVo.getIsGBFlag()) || CodeConstants.GBFlag.MINORRELATION.equals(prpLRegistVo.getIsGBFlag())){
			return null;
		}
    	PrpLCMainVo prpLCMain = policyViewService.getPolicyInfo(prpLRegistVo.getRegistNo(), 
				prpLRegistVo.getPolicyNo());
    	if(prpLCMain.getComCode().startsWith("50")){
    		Date date = new Date();
    		CaseBean caseBean = new CaseBean();
    		String kindCode = getKindCode(prpLClaimVo.getRegistNo(),prpLClaimVo.getRiskCode());
    		caseBean.setInstype("1");// 产险
    		caseBean.setInssort(kindCode);
    		caseBean.setPhase("2");
    		caseBean.setPolicyno(prpLClaimVo.getPolicyNo());
    		if(prpLClaimVo.getClaimNo() != null && !"".equals(prpLClaimVo.getClaimNo())){
				caseBean.setCaseno(prpLClaimVo.getClaimNo());
			}
    		caseBean.setName(userVo.getUserCode());
    		//TODO 根据机构前四位查询ywuser.PrpDcompany表
    		caseBean.setAreaid("郑州市");
    		caseBean.setMobile(prpLRegistVo.getReportorPhone());
    		caseBean.setClaimsnum(prpLCMain.getClaimTimes().toString());//理赔次数
    		caseBean.setEffectivedate(DateUtils.dateToStr(prpLCMain.getStartDate(), DateUtils.YToDay));//保险生效日期
    		if(prpLRegistVo.getPrpLRegistExt() != null && prpLRegistVo.getPrpLRegistExt().getInsuredName()!=null){
    			caseBean.setInsuredname(prpLRegistVo.getPrpLRegistExt().getInsuredName());
    		}
    		//是否有人伤
    		if("1".equals(prpLRegistVo.getPrpLRegistExt().getIsPersonLoss())){
    			caseBean.setIspeoplehurt("是");
    		}else{
    			caseBean.setIspeoplehurt("否");
    		}
    		if(prpLRegistVo.getInsuredPhone() != null){
    			caseBean.setInsuredmobile(prpLRegistVo.getInsuredPhone());
    		}
    		caseBean.setXzname(codeTranService.findCodeName("CarRiskCode", prpLClaimVo.getRiskCode()));
    		//车牌号
    		if(prpLRegistVo.getPrpLRegistExt().getLicenseNo()!=null && 
    				!"".equals(prpLRegistVo.getPrpLRegistExt().getLicenseNo())){
    			caseBean.setCarbrandno(prpLRegistVo.getPrpLRegistExt().getLicenseNo());
    		}
    		//车架号
    		if(prpLRegistVo.getPrpLRegistExt().getFrameNo()!=null && 
    				!"".equals(prpLRegistVo.getPrpLRegistExt().getFrameNo())){
    			caseBean.setCarframeno(prpLRegistVo.getPrpLRegistExt().getFrameNo());
    		}
    		//三者车牌号、车架号
    		String dutybrandno = "";
    		String dutyframeno = "";
    		for(PrpLRegistCarLossVo registCarLossVo:prpLRegistVo.getPrpLRegistCarLosses()){
    			if("3".equals(registCarLossVo.getLossparty())){
    				if(registCarLossVo.getLicenseNo()!=null&&!registCarLossVo.getLicenseNo().isEmpty()){
    					dutybrandno = dutybrandno+registCarLossVo.getLicenseNo()+",";
    				}
    				if(registCarLossVo.getFrameNo()!=null&&!registCarLossVo.getFrameNo().isEmpty()){
    					dutyframeno = dutyframeno+registCarLossVo.getFrameNo()+",";
    				}
    				break;
    			}
    		}
    		if(!"".equals(dutybrandno)){
    			dutybrandno = dutybrandno.substring(0, dutybrandno.length()-1);
    			caseBean.setDutybrandno(dutybrandno);
    		}
    		if(!"".equals(dutyframeno)){
    			dutyframeno = dutyframeno.substring(0, dutyframeno.length()-1);
    			caseBean.setDutyframeno(dutyframeno);
    		}
    		//出险日期
    		 if(prpLRegistVo.getDamageTime() != null){
    			 caseBean.setStarttime(DateUtils.dateToStr(prpLRegistVo.getDamageTime(), DateUtils.YToDay));
    		 }
    		 //出险地点
    		 if(prpLRegistVo.getDamageAddress() != null){
    			 caseBean.setAddress(prpLRegistVo.getDamageAddress());
    		 }
    		 //被保险人身份证
//    		 for(PrpLCInsuredVo prpLCInsuredVo:prpLCMain.getPrpCInsureds()){
//    			 if("1".equals(prpLCInsuredVo.getInsuredFlag())){
//    				 caseBean.setInsuredidcard(prpLCInsuredVo.getIdentifyNumber());
//    				 break;
//    			 }
//    		 }
    		 String url = SpringProperties.getProperty("HNIS_RUL");
    		 String user = SpringProperties.getProperty("HNIS_USER");
    		 String pwd = SpringProperties.getProperty("HNIS_PWD");
    		 XStream stream = new XStream(new XppDriver(new XmlFriendlyNameCoder("-_","_")));
    		 String requestXml = stream.toXML(caseBean);
    		 caseBean = importCaseData(caseBean,url,user,pwd);
    		 String responseXml = stream.toXML(caseBean);
    		 logger.info("河南销保平台返回报文：--->"+responseXml);
    		 ClaimInterfaceLogVo logVo = new ClaimInterfaceLogVo();
    		 logVo.setRegistNo(prpLClaimVo.getRegistNo());
    		 logVo.setBusinessType(BusinessType.HNIS_claim.name());
    		 logVo.setBusinessName(BusinessType.HNIS_claim.getName());
    		 logVo.setOperateNode(FlowNode.Claim.getName());
    		 logVo.setComCode(prpLCMain.getComCode());
    		 logVo.setClaimNo(prpLClaimVo.getClaimNo());
    		 if("5".equals(caseBean.getIstatus())){
    			 logVo.setStatus("1");
    		 }else{
    			 logVo.setStatus("0");
    		 }
    		 if(caseBean.getResultdesc().isEmpty()||"null".equals(caseBean.getResultdesc())){
    			 String msg = this.getResultdesc(caseBean.getIstatus());
    			 logVo.setErrorMessage(msg);
    		 }else{

    			 logVo.setErrorMessage(caseBean.getResultdesc());
    		 }
    		 logVo.setRequestTime(date);
    		 logVo.setRequestUrl(url);
    		 logVo.setErrorCode(caseBean.getIstatus());
    		 logVo.setCreateTime(date);
    		 logVo.setCreateUser(userVo.getUserCode());
    		 logVo.setRequestXml(requestXml);
    		 logVo.setResponseXml(responseXml);
    		 logService.save(logVo);
    		 return logVo;
    	}
		return null;
	}
    
@Override
public ClaimInterfaceLogVo endCaseToHN(PrpLEndCaseVo endCaseVo,String userCode) {
	PrpLRegistVo prpLRegistVo = registQueryService.findByRegistNo(endCaseVo.getRegistNo());
	//联共保 从共，从保不对接外部系统
	if(CodeConstants.GBFlag.MINORCOMMON.equals(prpLRegistVo.getIsGBFlag()) || CodeConstants.GBFlag.MINORRELATION.equals(prpLRegistVo.getIsGBFlag())){
		return null;
	}
	PrpLCMainVo prpLCMain = policyViewService.getPolicyInfo(prpLRegistVo.getRegistNo(), 
			prpLRegistVo.getPolicyNo());
	PrpLClaimVo claimVo = claimTaskService.findClaimVoByClaimNo(endCaseVo.getClaimNo());
	PrpLCertifyMainVo certiMainVo = certifyPubService.findPrpLCertifyMainVoByRegistNo(endCaseVo.getRegistNo());
	
	if(prpLCMain.getComCode().startsWith("50")){
		Date date = new Date();
		CaseBean caseBean = new CaseBean();
		String kindCode = getKindCode(endCaseVo.getRegistNo(),endCaseVo.getRiskCode());
		PrpLCompensateVo compensateVo = compensateTaskService.findCompByPK(endCaseVo.getCompensateNo());
		caseBean.setInstype("1");// 产险
		caseBean.setInssort(kindCode);
		caseBean.setPhase("3");//结案
		caseBean.setPolicyno(endCaseVo.getPolicyNo());
		if(endCaseVo.getEndCaseNo()!=null&&!"".equals(endCaseVo.getEndCaseNo())){
			caseBean.setCaseno(endCaseVo.getEndCaseNo());
		}
		caseBean.setName(userCode);
		caseBean.setMobile(prpLRegistVo.getReportorPhone());
		caseBean.setClaimsnum(prpLCMain.getClaimTimes().toString());//理赔次数
		if(compensateVo!=null&&compensateVo.getSumAmt()!=null){
			caseBean.setMoneys(Double.valueOf(compensateVo.getSumAmt().toString()));//赔款金额
		}else{
			caseBean.setMoneys(Double.valueOf("0"));//赔款金额
		}
		//拒赔金额默认为0
		if("2".equals(claimVo.getValidFlag()) || "1".equals(certiMainVo.getIsFraud()) ||
				("1101".equals(claimVo.getRiskCode())&&"1".equals(certiMainVo.getIsJQFraud())) ||
				(!"1101".equals(claimVo.getRiskCode())&&"1".equals(certiMainVo.getIsSYFraud()))){
			caseBean.setResult("拒赔");
			caseBean.setMoneys(Double.valueOf("0"));
		}else{
			caseBean.setResult("同意");
		}
		caseBean.setXzname(codeTranService.findCodeName("CarRiskCode", endCaseVo.getRiskCode()));
		
		caseBean.setEffectivedate(DateUtils.dateToStr(prpLCMain.getStartDate(), DateUtils.YToDay));//保险生效日期
//		caseBean.setAreaid(codeTranService.transCode("ComCodeFull",prpLCMain.getComCode()));//地区
		caseBean.setAreaid("郑州市");
		if(prpLRegistVo.getPrpLRegistExt() != null && prpLRegistVo.getPrpLRegistExt().getInsuredName()!=null){
			caseBean.setInsuredname(prpLRegistVo.getPrpLRegistExt().getInsuredName());
		}
		if(prpLRegistVo.getInsuredPhone() != null){
			caseBean.setInsuredmobile(prpLRegistVo.getInsuredPhone());
		}
		//是否有人伤
		if("1".equals(prpLRegistVo.getPrpLRegistExt().getIsPersonLoss())){
			caseBean.setIspeoplehurt("是");
		}else{
			caseBean.setIspeoplehurt("否");
		}
		//车牌号
		if(prpLRegistVo.getPrpLRegistExt()!=null && 
				StringUtils.isNotBlank(prpLRegistVo.getPrpLRegistExt().getLicenseNo())){
			caseBean.setCarbrandno(prpLRegistVo.getPrpLRegistExt().getLicenseNo());
		}
		//车架号
		if(prpLRegistVo.getPrpLRegistExt()!=null&&
				StringUtils.isNotBlank(prpLRegistVo.getPrpLRegistExt().getFrameNo())){
			caseBean.setCarframeno(prpLRegistVo.getPrpLRegistExt().getFrameNo());
		}
		//三者车牌号、车架号
		String dutybrandno = "";
		String dutyframeno = "";
		for(PrpLRegistCarLossVo registCarLossVo:prpLRegistVo.getPrpLRegistCarLosses()){
			if("3".equals(registCarLossVo.getLossparty())){
				if(registCarLossVo.getLicenseNo()!=null&&!registCarLossVo.getLicenseNo().isEmpty()){
					dutybrandno = dutybrandno+registCarLossVo.getLicenseNo()+",";
				}
				if(registCarLossVo.getFrameNo()!=null&&!registCarLossVo.getFrameNo().isEmpty()){
					dutyframeno = dutyframeno+registCarLossVo.getFrameNo()+",";
				}
				break;
			}
		}
		if(StringUtils.isNotBlank(dutybrandno)){
			dutybrandno = dutybrandno.substring(0, dutybrandno.length()-1);
			caseBean.setDutybrandno(dutybrandno);
		}
		if(StringUtils.isNotBlank(dutyframeno)){
			dutyframeno = dutyframeno.substring(0, dutyframeno.length()-1);
			caseBean.setDutyframeno(dutyframeno);
		}
		//结案日期
		caseBean.setClosetime(DateUtils.dateToStr(endCaseVo.getEndCaseDate(), DateUtils.YToDay));
		//出险日期
		if(prpLRegistVo.getDamageTime() != null){
			caseBean.setStarttime(DateUtils.dateToStr(prpLRegistVo.getDamageTime(), DateUtils.YToDay));
		}
		//出险地点
		if(StringUtils.isNotBlank(prpLRegistVo.getDamageAddress())){
			caseBean.setAddress(prpLRegistVo.getDamageAddress());
		}
		//被保险人手机
//		for(PrpLCInsuredVo prpLCInsuredVo:prpLCMain.getPrpCInsureds()){
//			 if("1".equals(prpLCInsuredVo.getInsuredFlag())){
//				 caseBean.setInsuredidcard(prpLCInsuredVo.getIdentifyNumber());
//				 break;
//			 }
//		 }
		 String url = SpringProperties.getProperty("HNIS_RUL");
		 String user = SpringProperties.getProperty("HNIS_USER");
		 String pwd = SpringProperties.getProperty("HNIS_PWD");
		 XStream stream = new XStream(new XppDriver(new XmlFriendlyNameCoder("-_","_")));
		 String requestXml = stream.toXML(caseBean);
		 caseBean = importCaseData(caseBean,url,user,pwd);
		 String responseXml = stream.toXML(caseBean);
		 logger.info("河南销保平台返回报文：--->"+responseXml);
		 ClaimInterfaceLogVo logVo = new ClaimInterfaceLogVo();
		 logVo.setRegistNo(endCaseVo.getRegistNo());
		 logVo.setBusinessType(BusinessType.HNIS_endCase.name());
		 logVo.setBusinessName(BusinessType.HNIS_endCase.getName());
		 logVo.setOperateNode(FlowNode.EndCas.getName());
		 logVo.setComCode(prpLCMain.getComCode());
		 logVo.setClaimNo(endCaseVo.getClaimNo());
		 if(endCaseVo.getCompensateNo()!=null&&!"".equals(endCaseVo.getCompensateNo())){
			 logVo.setCompensateNo(endCaseVo.getCompensateNo());
		 }
		 if("5".equals(caseBean.getIstatus())){
			 logVo.setStatus("1");
		 }else{
			 logVo.setStatus("0");
		 }
		 if(caseBean.getResultdesc().isEmpty()||"null".equals(caseBean.getResultdesc())){
			 String msg = this.getResultdesc(caseBean.getIstatus());
			 logVo.setErrorMessage(msg);
		 }else{

			 logVo.setErrorMessage(caseBean.getResultdesc());
		 }
		 logVo.setRequestTime(date);
		 logVo.setRequestUrl(url);
		 logVo.setErrorCode(caseBean.getIstatus());
		 logVo.setCreateTime(date);
		 logVo.setCreateUser(userCode);
		 logVo.setRequestXml(requestXml);
		 logVo.setResponseXml(responseXml);
		 logService.save(logVo);
		 return logVo;
	}
	return null;
}
	
	public  String getKindCode(String registNo,String riskcode){
		String kindCode = "";
		if("1101".equals(riskcode)){
			kindCode = "交强";//交强
		}else{
			List<PrpLCItemKindVo> CItemKindVoList = registService.findCItemKindByPolicyNo(registNo);
			if(CItemKindVoList != null && CItemKindVoList.size() > 0){
				for(PrpLCItemKindVo prpLCItemKindVo:CItemKindVoList){
					if("A".equals(prpLCItemKindVo.getKindCode())){
						kindCode = "车损险";//车损
						break;
					}else if("B".equals(prpLCItemKindVo.getKindCode())){
						kindCode = "商业三责险";//商业三者
						break;
					}else if("G".equals(prpLCItemKindVo.getKindCode())){
						kindCode = "盗抢险";//盗抢
						break;
					}else if(prpLCItemKindVo.getKindCode().startsWith("D1")){
						kindCode = "车上人员";//车上人员
						break;
					}else if("F".equals(prpLCItemKindVo.getKindCode())){
						kindCode = "玻璃破碎险";
						break;
					}else if(prpLCItemKindVo.getKindCode().startsWith("L")){
						kindCode = "划痕险";
						break;
					}else if(prpLCItemKindVo.getKindCode().startsWith("Z")){
						kindCode = "自燃险";
						break;
					}else{
						kindCode = "其他商业险";//其他商业险
					}
				}
			}
		}
		return kindCode;
	}
	
	public String getResultdesc(String istatus){
		String resultdesc="";
		if("-4".equals(istatus)){
			resultdesc = "上传数据超出限制数量";
		}else if("-3".equals(istatus)){
			resultdesc = "接口异常";
		}else if("-2".equals(istatus)){
			resultdesc = "无效用户";
		}else if("-1".equals(istatus)){
			resultdesc = "传入数据参数为空";
		}else if("0".equals(istatus)){
			resultdesc = "无效保险类型或阶段";
		}else if("1".equals(istatus)){
			resultdesc = "重复数据";
		}else if("2".equals(istatus)){
			resultdesc = "数据校验失败";
		}else if("3".equals(istatus)){
			resultdesc = "数据校验通过";
		}else if("4".equals(istatus)){
			resultdesc = "数据库校验失败";
		}else if("5".equals(istatus)){
			resultdesc = "全部导入成功";
		}
		return resultdesc;
	}
}
