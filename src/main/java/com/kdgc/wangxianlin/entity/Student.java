package com.kdgc.wangxianlin.entity;

public class Student {
    private Integer s_id;

    private String s_name;

    private String s_age;

    private String s_sex;

    private String s_address;

    private Integer claa_id;

    public Integer getS_id() {
        return s_id;
    }

    public void setS_id(Integer s_id) {
        this.s_id = s_id;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name == null ? null : s_name.trim();
    }

    public String getS_age() {
        return s_age;
    }

    public void setS_age(String s_age) {
        this.s_age = s_age == null ? null : s_age.trim();
    }

    public String getS_sex() {
        return s_sex;
    }

    public void setS_sex(String s_sex) {
        this.s_sex = s_sex == null ? null : s_sex.trim();
    }

    public String getS_address() {
        return s_address;
    }

    public void setS_address(String s_address) {
        this.s_address = s_address == null ? null : s_address.trim();
    }

    public Integer getClaa_id() {
        return claa_id;
    }

    public void setClaa_id(Integer claa_id) {
        this.claa_id = claa_id;
    }
}