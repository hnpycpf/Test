package org.edataserver.model;

import java.util.Date;

public class Modular {
    private String modularId;

    private String userId;

    private String userType;

    private String modularName;

    private Date createtime;

    public String getModularId() {
        return modularId;
    }

    public void setModularId(String modularId) {
        this.modularId = modularId == null ? null : modularId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    public String getModularName() {
        return modularName;
    }

    public void setModularName(String modularName) {
        this.modularName = modularName == null ? null : modularName.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}