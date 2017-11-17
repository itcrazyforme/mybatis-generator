package com.garlic.domain;

public class SysRole {
    private String roleid;

    private String parentroleid;

    private String rolename;

    private String roletype;

    private String orgno;

    private Short authlevel;

    private Short checklevel;

    private String descript;

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid == null ? null : roleid.trim();
    }

    public String getParentroleid() {
        return parentroleid;
    }

    public void setParentroleid(String parentroleid) {
        this.parentroleid = parentroleid == null ? null : parentroleid.trim();
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    public String getRoletype() {
        return roletype;
    }

    public void setRoletype(String roletype) {
        this.roletype = roletype == null ? null : roletype.trim();
    }

    public String getOrgno() {
        return orgno;
    }

    public void setOrgno(String orgno) {
        this.orgno = orgno == null ? null : orgno.trim();
    }

    public Short getAuthlevel() {
        return authlevel;
    }

    public void setAuthlevel(Short authlevel) {
        this.authlevel = authlevel;
    }

    public Short getChecklevel() {
        return checklevel;
    }

    public void setChecklevel(Short checklevel) {
        this.checklevel = checklevel;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript == null ? null : descript.trim();
    }
}