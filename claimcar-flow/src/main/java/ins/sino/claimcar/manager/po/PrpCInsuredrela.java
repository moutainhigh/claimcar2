package ins.sino.claimcar.manager.po;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * POJO Class PrpCInsuredrela
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Table(name = "PRPCINSUREDRELA")
public class PrpCInsuredrela implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    private String certiType;
    private String certiNo;
    private String customerKind;
    private String policyNo;
    private String customerType;
    private String ownType;
    private String name;
    private String gender;
    private String natioNality;
    private String identifyType;
    private String identifyNumber;
    private Date validDate;
    private String revenueRegistNo;
    private String businessCode;
    private String businessArea;
    private String occupAtionCode;
    private String phone;
    private String addrType;
    private String address;
    private String payAccount;
    private String acceptAccount;
    private String sameFlag;
    private String insuredIdentity;
    private String operatorCode;
    private Date operateTime;
    private String lossFlag;

    @Column(name = "CERTITYPE", nullable = false, length=4)
    public String getCertiType() {
        return this.certiType;
    }

    public void setCertiType(String certiType) {
        this.certiType = certiType;
    }

    @Column(name = "CERTINO", nullable = false, length=30)
    public String getCertiNo() {
        return this.certiNo;
    }

    public void setCertiNo(String certiNo) {
        this.certiNo = certiNo;
    }

    @Column(name = "CUSTOMERKIND", nullable = false, length=1)
    public String getCustomerKind() {
        return this.customerKind;
    }

    public void setCustomerKind(String customerKind) {
        this.customerKind = customerKind;
    }

    @Column(name = "POLICYNO", length=22)
    public String getPolicyNo() {
        return this.policyNo;
    }

    public void setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
    }

    @Column(name = "CUSTOMERTYPE", nullable = false, length=1)
    public String getCustomerType() {
        return this.customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    @Column(name = "OWNTYPE", length=20)
    public String getOwnType() {
        return this.ownType;
    }

    public void setOwnType(String ownType) {
        this.ownType = ownType;
    }

    @Column(name = "NAME", nullable = false, length=60)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "GENDER", length=1)
    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Column(name = "NATIONALITY", length=5)
    public String getNatioNality() {
        return this.natioNality;
    }

    public void setNatioNality(String natioNality) {
        this.natioNality = natioNality;
    }

    @Column(name = "IDENTIFYTYPE", nullable = false, length=4)
    public String getIdentifyType() {
        return this.identifyType;
    }

    public void setIdentifyType(String identifyType) {
        this.identifyType = identifyType;
    }

    @Column(name = "IDENTIFYNUMBER", nullable = false, length=20)
    public String getIdentifyNumber() {
        return this.identifyNumber;
    }

    public void setIdentifyNumber(String identifyNumber) {
        this.identifyNumber = identifyNumber;
    }

    @Column(name = "VALIDDATE", length=7)
    public Date getValidDate() {
        return this.validDate;
    }

    public void setValidDate(Date validDate) {
        this.validDate = validDate;
    }

    @Column(name = "REVENUEREGISTNO", length=20)
    public String getRevenueRegistNo() {
        return this.revenueRegistNo;
    }

    public void setRevenueRegistNo(String revenueRegistNo) {
        this.revenueRegistNo = revenueRegistNo;
    }

    @Column(name = "BUSINESSCODE", length=20)
    public String getBusinessCode() {
        return this.businessCode;
    }

    public void setBusinessCode(String businessCode) {
        this.businessCode = businessCode;
    }

    @Column(name = "BUSINESSAREA", length=200)
    public String getBusinessArea() {
        return this.businessArea;
    }

    public void setBusinessArea(String businessArea) {
        this.businessArea = businessArea;
    }

    @Column(name = "OCCUPATIONCODE", length=20)
    public String getOccupAtionCode() {
        return this.occupAtionCode;
    }

    public void setOccupAtionCode(String occupAtionCode) {
        this.occupAtionCode = occupAtionCode;
    }

    @Column(name = "PHONE", length=20)
    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Column(name = "ADDRTYPE", length=1)
    public String getAddrType() {
        return this.addrType;
    }

    public void setAddrType(String addrType) {
        this.addrType = addrType;
    }

    @Id
    @Column(name = "ADDRESS", length=100)
    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Column(name = "PAYACCOUNT", length=30)
    public String getPayAccount() {
        return this.payAccount;
    }

    public void setPayAccount(String payAccount) {
        this.payAccount = payAccount;
    }

    @Column(name = "ACCEPTACCOUNT", length=30)
    public String getAcceptAccount() {
        return this.acceptAccount;
    }

    public void setAcceptAccount(String acceptAccount) {
        this.acceptAccount = acceptAccount;
    }

    @Column(name = "SAMEFLAG", length=1)
    public String getSameFlag() {
        return this.sameFlag;
    }

    public void setSameFlag(String sameFlag) {
        this.sameFlag = sameFlag;
    }

    @Column(name = "INSUREDIDENTITY", length=2)
    public String getInsuredIdentity() {
        return this.insuredIdentity;
    }

    public void setInsuredIdentity(String insuredIdentity) {
        this.insuredIdentity = insuredIdentity;
    }

    @Column(name = "OPERATORCODE", nullable = false, length=10)
    public String getOperatorCode() {
        return this.operatorCode;
    }

    public void setOperatorCode(String operatorCode) {
        this.operatorCode = operatorCode;
    }

    @Column(name = "OPERATETIME", nullable = false, length=7)
    public Date getOperateTime() {
        return this.operateTime;
    }

    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }

    @Column(name = "LOSSFLAG", length=1)
    public String getLossFlag() {
        return this.lossFlag;
    }

    public void setLossFlag(String lossFlag) {
        this.lossFlag = lossFlag;
    }

}