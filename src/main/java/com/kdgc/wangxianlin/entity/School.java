package com.kdgc.wangxianlin.entity;

import java.util.List;

public class School {
    private Integer id;

    private String school_name;

    private String school_address;


    private List<Classes> classesList;

    public List<Classes> getClassesList() {
        return classesList;
    }

    public void setClassesList(List<Classes> classesList) {
        this.classesList = classesList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSchool_name() {
        return school_name;
    }

    public void setSchool_name(String school_name) {
        this.school_name = school_name == null ? null : school_name.trim();
    }

    public String getSchool_address() {
        return school_address;
    }

    public void setSchool_address(String school_address) {
        this.school_address = school_address == null ? null : school_address.trim();
    }
}