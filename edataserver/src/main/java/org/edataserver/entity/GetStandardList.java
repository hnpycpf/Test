package org.edataserver.entity;

import java.util.Date;

public class GetStandardList {
	private String standardTypeId;
	private String status;
	private Date impleStartDate;
	private Date impleEndDate;
	private String keyWord;
	private Integer currentPage;
	private Integer rows;
	public String getStandardTypeId() {
		return standardTypeId;
	}
	public void setStandardTypeId(String standardTypeId) {
		this.standardTypeId = standardTypeId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getImpleStartDate() {
		return impleStartDate;
	}
	public void setImpleStartDate(Date impleStartDate) {
		this.impleStartDate = impleStartDate;
	}
	public Date getImpleEndDate() {
		return impleEndDate;
	}
	public void setImpleEndDate(Date impleEndDate) {
		this.impleEndDate = impleEndDate;
	}
	public String getKeyWord() {
		return keyWord;
	}
	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}

	public Integer getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
	public Integer getRows() {
		return rows;
	}
	public void setRows(Integer rows) {
		this.rows = rows;
	}
	@Override
	public String toString() {
		return "GetStandardList [standardTypeId=" + standardTypeId
				+ ", status=" + status + ", impleStartDate=" + impleStartDate
				+ ", impleEndDate=" + impleEndDate + ", keyWord=" + keyWord
				+ ", currentPage=" + currentPage + ", rows=" + rows + "]";
	}
	
}
