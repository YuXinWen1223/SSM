package com.ssm.mybatis.entity;

/**
 * @author : yuxinwen
 * @mingcheng : mybatis
 * @模块 : org.ssm.mybatis.entity
 * @date :2022/11/17 14:25
 */
public class Student {
    private Integer sno;
    private String sname;
    private String ssex;
    private String address;
    private String birthday;
    private Integer cid;

    public Student(Integer sno, String sname, String ssex, String address, String birthday, Integer cid) {
        this.sno = sno;
        this.sname = sname;
        this.ssex = ssex;
        this.address = address;
        this.birthday = birthday;
        this.cid = cid;
    }

    public Student() {
    }

    public Integer getSno() {
        return sno;
    }

    public void setSno(Integer sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    @Override
    public String toString() {
        return "Student{" + "sno=" + sno + ", sname='" + sname + '\'' + ", ssex='" + ssex + '\'' + ", address='" + address + '\'' + ", birthday='" + birthday + '\'' + ", cid=" + cid + '}';
    }

}
