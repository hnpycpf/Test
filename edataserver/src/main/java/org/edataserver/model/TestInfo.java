package org.edataserver.model;

import java.util.Date;

public class TestInfo {
    private Integer testId;

    private String userId;

    private String testName;

    private String testType;

    private String testSkill;

    private String testMode;

    private String testState;
    
    private String applicant;

    private Date starttime;

    private Date endtime;

    private String testContent;
    

	public String getApplicant() {
		return applicant;
	}

	public void setApplicant(String applicant) {
		this.applicant = applicant;
	}

	public Integer getTestId() {
        return testId;
    }

    public void setTestId(Integer testId) {
        this.testId = testId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName == null ? null : testName.trim();
    }

    public String getTestType() {
        return testType;
    }

    public void setTestType(String testType) {
        this.testType = testType == null ? null : testType.trim();
    }

    public String getTestSkill() {
        return testSkill;
    }

    public void setTestSkill(String testSkill) {
        this.testSkill = testSkill == null ? null : testSkill.trim();
    }

    public String getTestMode() {
        return testMode;
    }

    public void setTestMode(String testMode) {
        this.testMode = testMode == null ? null : testMode.trim();
    }

    public String getTestState() {
        return testState;
    }

    public void setTestState(String testState) {
        this.testState = testState == null ? null : testState.trim();
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getTestContent() {
        return testContent;
    }

    public void setTestContent(String testContent) {
        this.testContent = testContent == null ? null : testContent.trim();
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TestInfo [testId=");
		builder.append(testId);
		builder.append(", userId=");
		builder.append(userId);
		builder.append(", testName=");
		builder.append(testName);
		builder.append(", testType=");
		builder.append(testType);
		builder.append(", testSkill=");
		builder.append(testSkill);
		builder.append(", testMode=");
		builder.append(testMode);
		builder.append(", testState=");
		builder.append(testState);
		builder.append(", starttime=");
		builder.append(starttime);
		builder.append(", endtime=");
		builder.append(endtime);
		builder.append(", testContent=");
		builder.append(testContent);
		builder.append("]");
		return builder.toString();
	}
    
    
}