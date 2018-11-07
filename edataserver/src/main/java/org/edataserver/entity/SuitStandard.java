package org.edataserver.entity;

import java.util.Date;

public class SuitStandard {
	private String standard_id;
	private String suite_id;
	private Date createtime;
	private Date updatetime;
	public String getStandard_id() {
		return standard_id;
	}
	public void setStandard_id(String standard_id) {
		this.standard_id = standard_id;
	}
	public String getSuite_id() {
		return suite_id;
	}
	public void setSuite_id(String suite_id) {
		this.suite_id = suite_id;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public Date getUpdatetime() {
		return updatetime;
	}
	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}
}
