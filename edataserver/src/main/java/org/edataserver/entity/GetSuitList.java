package org.edataserver.entity;

import java.util.Date;

public class GetSuitList {
	private String testType;
	private String skillType;
	private Date uploadStartDate;
	private Date uploadEndDate;
	private String keyWord;
	private Integer currentPage;
	private Integer rows;
	public String getTestType() {
		return testType;
	}
	public void setTestType(String testType) {
		this.testType = testType;
	}
	public String getSkillType() {
		return skillType;
	}
	public void setSkillType(String skillType) {
		this.skillType = skillType;
	}
	public Date getUploadStartDate() {
		return uploadStartDate;
	}
	public void setUploadStartDate(Date uploadStartDate) {
		this.uploadStartDate = uploadStartDate;
	}
	public Date getUploadEndDate() {
		return uploadEndDate;
	}
	public void setUploadEndDate(Date uploadEndDate) {
		this.uploadEndDate = uploadEndDate;
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
		return "getSuitList [testType=" + testType + ", skillType=" + skillType
				+ ", uploadStartDate=" + uploadStartDate + ", uploadEndDate="
				+ uploadEndDate + ", keyWord=" + keyWord + ", currentPage="
				+ currentPage + ", rows=" + rows + "]";
	}
	
}
