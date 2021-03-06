package ins.sino.claimcar.manager.vo;

import java.util.Date;

public class PrpdIntermUserBaseVo implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private Long intermId;
	private String userCode;
	private String userName;
	private Date createTime;
	private String createUser;
	private Date updateTime;
	private String updateUser;

	public PrpdIntermUserBaseVo() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIntermId() {
		return intermId;
	}

	public void setIntermId(Long intermId) {
		this.intermId = intermId;
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

}
