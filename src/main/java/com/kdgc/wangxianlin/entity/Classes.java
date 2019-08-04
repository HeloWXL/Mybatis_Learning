package com.kdgc.wangxianlin.entity;

import java.util.List;

public class Classes {
    private Integer class_id;

    private String class_name;

    private Integer school_id;

    /**
     * 一个班级对应一个学校
     */
    private School school;



    /**
     * 一个班级对应多个学生
     */
    private List<Student> studentList;

    public List<Student> getStudentList() {
        return studentList;
    }


    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public Integer getClass_id() {
        return class_id;
    }

    public void setClass_id(Integer class_id) {
        this.class_id = class_id;
    }

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name == null ? null : class_name.trim();
    }

    public Integer getSchool_id() {
        return school_id;
    }

    public void setSchool_id(Integer school_id) {
        this.school_id = school_id;
    }
}