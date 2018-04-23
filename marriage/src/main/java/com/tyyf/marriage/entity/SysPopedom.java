package com.tyyf.marriage.entity;

public class SysPopedom {
    private String popedomId;

    private String popedomName;

    private String fatherId;

    private String url;

    private Integer grade;

    public String getPopedomId() {
        return popedomId;
    }

    public void setPopedomId(String popedomId) {
        this.popedomId = popedomId == null ? null : popedomId.trim();
    }

    public String getPopedomName() {
        return popedomName;
    }

    public void setPopedomName(String popedomName) {
        this.popedomName = popedomName == null ? null : popedomName.trim();
    }

    public String getFatherId() {
        return fatherId;
    }

    public void setFatherId(String fatherId) {
        this.fatherId = fatherId == null ? null : fatherId.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }
}