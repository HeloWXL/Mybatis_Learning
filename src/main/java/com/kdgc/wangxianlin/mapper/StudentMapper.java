package com.kdgc.wangxianlin.mapper;

import com.kdgc.wangxianlin.entity.Student;

import java.util.List;

public interface StudentMapper {
    int deleteByPrimaryKey(Integer s_id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer s_id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

    /**
     * where - if 查询
     * @param student
     * @return student
     */
    Student selectByStudent(Student student);
}