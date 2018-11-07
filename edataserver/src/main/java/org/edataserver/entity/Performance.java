package org.edataserver.entity;

public class Performance {
	private String month;
	private String quarter;
	private String year;
	private String startDate;
	private String endDate;
	private String testMode;
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getQuarter() {
		return quarter;
	}
	public void setQuarter(String quarter) {
		this.quarter = quarter;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getTestMode() {
		return testMode;
	}
	public void setTestMode(String testMode) {
		this.testMode = testMode;
	}
	@Override
	public String toString() {
		return "Performance [month=" + month + ", quarter=" + quarter
				+ ", year=" + year + ", startDate=" + startDate + ", endDate="
				+ endDate + ", testMode=" + testMode + "]";
	}
	
	
}
