package org.edataserver.entity;

import java.util.List;

import org.edataserver.model.TestInfo;
import org.edataserver.model.TestStandard;

public class TestInfoVO extends TestInfo {

	private List<String> standard;

	public List<String> getStandard() {
		return standard;
	}

	public void setStandard(List<String> standard) {
		this.standard = standard;
	}
	
	
}
