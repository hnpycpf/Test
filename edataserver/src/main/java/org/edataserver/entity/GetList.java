package org.edataserver.entity;

import java.util.Date;

public class GetList {
	private	Integer currentPage;
	private	Integer rows;
	private	String testType;
	private	String testState;
	private	Date appStartDate;
	private	Date appEndDate;
	private	String keyWord;
	private	Date successStartDate;
	private	Date successEndDate;

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
	public String getTestType() {
		return testType;
	}
	public void setTestType(String testType) {
		this.testType = testType;
	}
	public String getTestState() {
		return testState;
	}
	public void setTestState(String testState) {
		this.testState = testState;
	}
	public Date getAppStartDate() {
		return appStartDate;
	}
	public void setAppStartDate(Date appStartDate) {
		this.appStartDate = appStartDate;
	}
	public Date getAppEndDate() {
		return appEndDate;
	}
	public void setAppEndDate(Date appEndDate) {
		this.appEndDate = appEndDate;
	}
	public String getKeyWord() {
		return keyWord;
	}
	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}
	public Date getSuccessStartDate() {
		return successStartDate;
	}
	public void setSuccessStartDate(Date successStartDate) {
		this.successStartDate = successStartDate;
	}
	public Date getSuccessEndDate() {
		return successEndDate;
	}
	public void setSuccessEndDate(Date successEndDate) {
		this.successEndDate = successEndDate;
	}
	@Override
	public String toString() {
		return "GetList [currentPage=" + currentPage + ", rows=" + rows
				+ ", testType=" + testType + ", testState=" + testState
				+ ", appStartDate=" + appStartDate + ", appEndDate="
				+ appEndDate + ", keyWord=" + keyWord + ", successStartDate="
				+ successStartDate + ", successEndDate=" + successEndDate + "]";
	}
	
}
