/******************************************************************************
* CREATETIME : 2016年1月8日 下午5:17:26
******************************************************************************/
package ins.sino.claimcar.flow.constant;


/**
 * 工作流提交类型
 * @author ★LiuPing
 * @CreateTime 2016年1月8日
 */
public enum SubmitType {

	/** 正常提交 */
	N,
	/** 退回 */
	B,
	/** 注销 */
	C,
	/** 更新数据：仅更新关键数据，不改变工作流 */
	U,
	/** 报案临时保存 */
	TMP, ;


}
