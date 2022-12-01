package com.spring.ioc.entity;

import com.spring.ioc.service.StudentService;

import java.util.Arrays;
import java.util.Map;

/**
 * @author : yuxinwen
 * @mingcheng : SSM
 * @模块 : com.spring.ioc.entity
 * @date :2022/11/25 14:14
 */
public class Student implements StudentService {
    private Integer sid;
    private String name;
    private String email;
    private String age;
    private Integer cid;
    private String[] hobby;
    private Clazz clazz;

    private Map<String, Teacher> teacherMap;

    @Override
    public String toString() {
        return "Student{" + "sid=" + sid + ", name='" + name + '\'' + ", email='" + email + '\'' + ", age='" + age + '\'' + ", cid=" + cid + ", hobby=" + Arrays.toString(hobby) + ", clazz=" + clazz + ", teacherMap=" + teacherMap + '}';
    }

    public Map<String, Teacher> getTeacherMap() {
        return teacherMap;
    }

    public void setTeacherMap(Map<String, Teacher> teacherMap) {
        this.teacherMap = teacherMap;
    }

    public Student(Integer sid, String name, String email, String age, Integer cid, String[] hobby, Clazz clazz, Map<String, Teacher> teacherMap) {
        this.sid = sid;
        this.name = name;
        this.email = email;
        this.age = age;
        this.cid = cid;
        this.hobby = hobby;
        this.clazz = clazz;
        this.teacherMap = teacherMap;
    }

    public Student(Integer sid, String name, String email, String age, Integer cid, String[] hobby, Clazz clazz) {
        this.sid = sid;
        this.name = name;
        this.email = email;
        this.age = age;
        this.cid = cid;
        this.hobby = hobby;
        this.clazz = clazz;
    }

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    public Student() {
    }

    public Student(Integer sid, String name, String email, String age) {
        this.sid = sid;
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public Student(Integer sid, String name, String email, String age, Integer cid, Clazz clazz) {
        this.sid = sid;
        this.name = name;
        this.email = email;
        this.age = age;
        this.cid = cid;
        this.clazz = clazz;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
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

}
