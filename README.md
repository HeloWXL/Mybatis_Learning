# mybatis_learn
MyBatis操作数据库

目前数据库中只有三张表的信息，目前已完成的情况：（后续继续更新）
where-if查询、一对一查询，一对多查询以及关联查询

以下为配置文件的信息：mybatis.properties、mybatis-config.xml、log4j.properties

# 出现报错
当出现以下的情况的时候：在pom.xml中加入以下：
org.apache.ibatis.exceptions.PersistenceException: 
Error building SqlSession.
The error may exist in com/kdgc/wangxianlin/dao/StudentMapper.xml
Cause: org.apache.ibatis.builder.BuilderException: Error parsing SQL Mapper Configuration. Cause: java.io.IOException: Could not find resource com/kdgc/wangxianlin/dao/StudentMapper.xml

## 加入的东东----->pom.xml
<!--扫描xml文件的位置-->
<build>
    <resources>
        <resource>
            <directory>src/main/java</directory>
            <includes>
                <include>**/*.xml</include>
            </includes>
            <filtering>true</filtering>
        </resource>
        <resource>
            <directory>src/main/resources</directory>
            <includes>
                <include>**/*.xml</include>
                <include>**/*.properties</include>
            </includes>
        </resource>
    </resources>
</build>

