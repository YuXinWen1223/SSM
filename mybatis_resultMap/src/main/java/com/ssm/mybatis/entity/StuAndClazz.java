package com.ssm.mybatis.entity;

/**
 * @author : yuxinwen
 * @mingcheng : SSM
 * @模块 : com.ssm.mybatis.entity
 * @date :2022/11/21 10:55
 */
public class StuAndClazz {
    private Integer stuId;
    private String stuName;
    private Integer stuAge;
    private Integer cid;
    private String clazzName;

    public StuAndClazz() {
    }

    public StuAndClazz(Integer stuId, String stuName, Integer stuAge, Integer cid, String clazzName) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.stuAge = stuAge;
        this.cid = cid;
        this.clazzName = clazzName;
    }

    @Override
    public String toString() {
        return "StuAndClazz{" + "stuId=" + stuId + ", stuName='" + stuName + '\'' + ", stuAge=" + stuAge + ", cid=" + cid + ", clazzName='" + clazzName + '\'' + '}';
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public Integer getStuAge() {
        return stuAge;
    }

    public void setStuAge(Integer stuAge) {
        this.stuAge = stuAge;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getClazzName() {
        return clazzName;
    }

    public void setClazzName(String clazzName) {
        this.clazzName = clazzName;
    }
}
