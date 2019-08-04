# mybatis_learn
MyBatis操作数据库

目前数据库中只有三张表的信息，目前已完成的情况：（后续继续更新）
where-if查询、一对一查询，一对多查询以及关联查询

以下为配置文件的信息：mybatis.properties、mybatis-config.xml、log4j.properties

mybatis.properties
# jdbc  连接数据库
jdbc.driver=com.mysql.jdbc.Driver
jdbc.url=jdbc:mysql://localhost/homework?useUnicode=true&characterEncoding=utf-8
jdbc.username=homework
jdbc.password=new2019

mybatis-config.xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE configuration PUBLIC "-//mybatis.org//DTD Config 3.0//EN" "http://mybatis.org/dtd/mybatis-3-config.dtd">
<configuration>
    <!-- 引用mybatis.properties配置文件 -->
    <properties resource="mybatis.properties" />
    <!--日志输出的方式-->
    <settings>
        <setting name="logImpl" value="LOG4J" />
    </settings>

    <!-- development : 开发模式 work : 工作模式 -->
    <environments default="development">
        <!--可以设置多个数据库的链接   id是唯一的标识，通过id来进行区分-->
        <environment id="development">
            <!--transactionManager事务控制-->
            <transactionManager type="JDBC" />
            <!-- 配置数据库连接信息 -->
            <dataSource type="POOLED">
                <!-- value属性值引用db.properties配置文件中配置的值 -->
                <property name="driver" value="${jdbc.driver}" />
                <property name="url" value="${jdbc.url}" />
                <property name="username" value="${jdbc.username}" />
                <property name="password" value="${jdbc.password}" />
            </dataSource>
        </environment>
    </environments>
    <!-- 映射文件 在这代表的是映射文件的地址-->
    <mappers>
        <mapper resource="com/kdgc/wangxianlin/dao/StudentMapper.xml" />
        <mapper resource="com/kdgc/wangxianlin/dao/ClassesMapper.xml" />
    </mappers>
</configuration>

log4j.properties

log4j.rootLogger=DEBUG,stdout
### console ###
log4j.appender.stdout=org.apache.log4j.ConsoleAppender
#log4j.appender.stdout.Target=System.err
log4j.appender.stdout.layout=org.apache.log4j.SimpleLayout

### mybatis ###
log4j.logger.com.ibatis=DEBUG
log4j.logger.com.ibatis.common.jdbc.SimpleDataSource=DEBUG
log4j.logger.com.ibatis.common.jdbc.ScriptRunner=DEBUG
log4j.logger.com.ibatis.sqlmap.engine.impl.SqlMapClientDelegate=DEBUG
log4j.logger.java.sql.Connection=ERROR
log4j.logger.java.sql.Statement=DEBUG
log4j.logger.java.sql.PreparedStatement=DEBUG
