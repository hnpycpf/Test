package org.edataserver.model;

import java.util.Date;
import java.util.List;

public class Suite {
    private String id;

    private String suitName;

    private String testType;

    private String skillType;

    private String suitUtil;

    private Date createtime;

    private Date updatetime;

    private String suitGuide;
    
    private List<String> suitStandard;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getSuitName() {
        return suitName;
    }

    public void setSuitName(String suitName) {
        this.suitName = suitName == null ? null : suitName.trim();
    }

    public String getTestType() {
        return testType;
    }

    public void setTestType(String testType) {
        this.testType = testType == null ? null : testType.trim();
    }

    public List<String> getSuitStandard() {
		return suitStandard;
	}

	public void setSuitStandard(List<String> suitStandard) {
		this.suitStandard = suitStandard;
	}

	public String getSkillType() {
        return skillType;
    }

    public void setSkillType(String skillType) {
        this.skillType = skillType == null ? null : skillType.trim();
    }

    public String getSuitUtil() {
        return suitUtil;
    }

    public void setSuitUtil(String suitUtil) {
        this.suitUtil = suitUtil == null ? null : suitUtil.trim();
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

    public String getSuitGuide() {
        return suitGuide;
    }

    public void setSuitGuide(String suitGuide) {
        this.suitGuide = suitGuide == null ? null : suitGuide.trim();
    }
}