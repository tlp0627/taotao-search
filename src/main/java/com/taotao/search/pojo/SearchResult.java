package com.taotao.search.pojo;

import java.util.List;

public class SearchResult {
	private List<Item> itemList;
	private long recordCount;
	public List<Item> getItemList() {
		return itemList;
	}
	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}
	public long getRecordCount() {
		return recordCount;
	}
	public void setRecordCount(long recordCount) {
		this.recordCount = recordCount;
	}
	public long getPageCount() {
		return pageCount;
	}
	public void setPageCount(long pageCount) {
		this.pageCount = pageCount;
	}
	public long getCurpage() {
		return curpage;
	}
	public void setCurpage(long curpage) {
		this.curpage = curpage;
	}
	private long pageCount;
	private long curpage;
}
