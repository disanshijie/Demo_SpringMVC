package com.oracle.sun.common.result;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

/**功能描述:</br>
 * 返回值
 * 
 * @author 武鹏程
 * @date 2015年6月18日
 */
@XmlRootElement(name="ReturnObject")
public class ReturnObject implements Serializable {
	private static final long serialVersionUID = 7578493643163086741L;
	/** 请求是否成功*/
	Integer success;
	/** 错误码*/
	Integer code;
	/** 错误信息*/
	String msg;
	/** 分页信息*/
	Pager<?> pager;
	/** 传到前台的数据*/
	Object datas;
	/** 前台传过来的数据，回显到前台*/
	Object param;

	public ReturnObject() {}
	public ReturnObject(Integer success, Integer code, String msg) {
		this.success = success;
		this.msg = msg;
		this.code = code;
	}
	public Integer getSuccess() {
		return success;
	}
	public void setSuccess(Integer success) {
		this.success = success;
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Pager<?> getPager() {
		return pager;
	}
	public void setPager(Pager<?> pager) {
		this.pager = pager;
	}
	public Object getDatas() {
		return datas;
	}
	public void setDatas(Object datas) {
		this.datas = datas;
	}
	public Object getParam() {
		return param;
	}
	public void setParam(Object param) {
		this.param = param;
	}
}
