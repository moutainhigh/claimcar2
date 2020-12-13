package ins.sino.claimcar.hnbxrest.po;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * POJO Class PRPLQUICKUSER
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Table(name = "PRPLQUICKUSER")
public class PrplQuickUser implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private String userCode;
	private String userName;
	private String comCode;
	private String comName;
	private String phone;
	private Integer times;
	private String validStatus;
	private Date createTime;
	private Date updateTime;
	private String isGBFlag;
	    
	@Id
	@Column(name = "USERCODE", unique = true, nullable = false, length=10)
    public String getUserCode() {
        return userCode;
    }
    
    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }
    
    @Column(name = "USERNAME", nullable = false, length=30)
    public String getUserName() {
        return userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    @Column(name = "COMCODE", nullable = false, length=30)
    public String getComCode() {
        return comCode;
    }
       
    public void setComCode(String comCode) {
        this.comCode = comCode;
    }
    
    @Column(name = "COMNAME", nullable = false, length=200)
    public String getComName() {
        return comName;
    }
   
    public void setComName(String comName) {
        this.comName = comName;
    }

    @Column(name = "PHONE", length=18)
    public String getPhone() {
        return phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    @Column(name = "TIMES", length=6, precision=38, scale=0)
    public Integer getTimes() {
        return times;
    }
    
    public void setTimes(Integer times) {
        this.times = times;
    }
    
    @Column(name = "VALIDSTATUS", nullable = false, length=1)
    public String getValidStatus() {
        return validStatus;
    }
    
    public void setValidStatus(String validStatus) {
        this.validStatus = validStatus;
    }
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATETIME", length=7)
    public Date getCreateTime() {
        return createTime;
    }
    
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "UPDATETIME", length=7)
    public Date getUpdateTime() {
        return updateTime;
    }
    
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Column(name = "ISGBFLAG", length=2)
	public String getIsGBFlag() {
		return isGBFlag;
	}

	
	public void setIsGBFlag(String isGBFlag) {
		this.isGBFlag = isGBFlag;
	}
    
}
