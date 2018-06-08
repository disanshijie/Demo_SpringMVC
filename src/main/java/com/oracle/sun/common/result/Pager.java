package com.oracle.sun.common.result;

import java.io.Serializable;

import com.github.pagehelper.PageInfo;

/**功能描述:</br>
 * 分页信息类
 * 
 * @author pcwu
 * @date 2015年6月20日
 */
public class Pager<T> implements Serializable {
	private static final long serialVersionUID = -8126996385552248681L;
	
	/** 当前第几页*/
	private Integer pageNum;
	/** 总页数*/
	private Integer totalPages;
	/** 总记录数*/
	private Long totalRecodes;
	/** 是否有下一页*/
	private Boolean hasNexPage = true;
	/** 每页几条*/
	private Integer pageSize;

	public Pager() {}
	public Pager(Integer pageNum) {
		this.pageNum = pageNum;
	}
	public Pager(PageInfo<?> pageInfo) {
		if(pageInfo != null) {
			this.pageNum = pageInfo.getPageNum();
			this.totalPages = pageInfo.getPages();
			this.totalRecodes = pageInfo.getTotal();
			if(this.pageNum >= this.totalPages)
				hasNexPage = false;
		}
	}
	public Pager(Integer pageNum, Integer totalPages, Long totalRecodes,
				Boolean hasNexPage)	{
		this.pageNum = pageNum;
		this.totalPages = totalPages;
		this.totalRecodes = totalRecodes;
		this.hasNexPage = hasNexPage;
	}
	
	public Integer getPageNum() {
		return pageNum;
	}
	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}
	public Integer getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}
	public Long getTotalRecodes() {
		return totalRecodes;
	}
	public void setTotalRecodes(Long totalRecodes) {
		this.totalRecodes = totalRecodes;
	}
	public Integer getPageSize() {
		if(pageSize == null || pageSize == 0)
			pageSize = 10;
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Boolean getHasNexPage() {
		return hasNexPage;
	}
	public void setHasNexPage(Boolean hasNexPage) {
		this.hasNexPage = hasNexPage;
	}
}
