package com.ssm.mybatis.entity;

import java.io.Serializable;
import java.util.List;

/**
 * @author 余欣文
 * @TableName clazz
 */
public class Clazz implements Serializable {
    private Integer cid;
    private String clazzName;
    private List<Stu> stu;

    public Clazz(Integer cid, String clazzName, List<Stu> stu) {
        this.cid = cid;
        this.clazzName = clazzName;
        this.stu = stu;
    }

    public Clazz() {
    }

    @Override
    public String toString() {
        return "Clazz{" + "cid=" + cid + ", clazzName='" + clazzName + '\'' + ", stu=" + stu + '}';
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

    public List<Stu> getStu() {
        return stu;
    }

    public void setStu(List<Stu> stu) {
        this.stu = stu;
    }

}
