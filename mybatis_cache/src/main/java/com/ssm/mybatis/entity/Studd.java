package com.ssm.mybatis.entity;


import java.io.Serializable;

/**
 * @author 余欣文
 * @TableName studd
 */
public class Studd implements Serializable {
    private Integer sId;
    private String sName;
    private String sAge;

    public Studd(Integer sId, String sName, String sAge) {
        this.sId = sId;
        this.sName = sName;
        this.sAge = sAge;
    }

    public Studd() {
    }

    @Override
    public String toString() {
        return "Studd{" +
                "sId=" + sId +
                ", sName='" + sName + '\'' +
                ", sAge='" + sAge + '\'' +
                '}';
    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsAge() {
        return sAge;
    }

    public void setsAge(String sAge) {
        this.sAge = sAge;
    }
}
