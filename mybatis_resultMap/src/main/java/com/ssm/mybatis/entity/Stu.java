package com.ssm.mybatis.entity;

import java.io.Serializable;

/**
 * @author 余欣文
 * @TableName stu
 */
public class Stu implements Serializable {
    private Integer stuId;
    private String stuName;
    private Integer stuAge;
    private Integer cid;
    private Clazz clazz;

    public Stu() {
    }

    public Stu(Integer stuId, String stuName, Integer stuAge, Integer cid, Clazz clazz) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.stuAge = stuAge;
        this.cid = cid;
        this.clazz = clazz;
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

    public Clazz getClazz() {
        return clazz;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    @Override
    public String toString() {
        return "Stu{" +
                "stuId=" + stuId +
                ", stuName='" + stuName + '\'' +
                ", stuAge=" + stuAge +
                ", cid=" + cid +
                ", clazz=" + clazz +
                '}';
    }
}
