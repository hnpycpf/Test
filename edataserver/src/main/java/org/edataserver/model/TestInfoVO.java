package org.edataserver.model;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class TestInfoVO  extends TestInfo{
	private List<TestStandard> standards;
	
	private Date applyDate;
	
	private Date successDate;
	
	public Date getSuccessDate() {
		return successDate;
	}

	public void setSuccessDate(Date successDate) {
		this.successDate = successDate;
	}

	public List<TestStandard> getStandards() {
		return standards;
	}

	public void setStandards(List<TestStandard> standards) {
		this.standards = standards;
	}

	public Date getApplyDate() {
		return applyDate;
	}

	public void setApplyDate(Date applyDate) {
		this.applyDate = applyDate;
	}
	
	
}
