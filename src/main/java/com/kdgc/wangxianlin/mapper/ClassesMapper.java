package com.kdgc.wangxianlin.mapper;

import com.kdgc.wangxianlin.entity.Classes;

import java.util.List;

public interface ClassesMapper {
    Classes selectByClassId(int cid);
    List<Classes> selectStudentByClassesId(int cid);
    List<Classes> selectStudentAndSchool(int cid);



}
