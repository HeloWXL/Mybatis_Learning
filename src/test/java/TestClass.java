import com.kdgc.wangxianlin.entity.Classes;
import com.kdgc.wangxianlin.entity.Student;
import com.kdgc.wangxianlin.mapper.ClassesMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author wangxl
 * @ClassName TestClass
 * @Description
 * @date 2019/7/26 13:44
 */
public class TestClass {

  /**
   * 创建会话工厂
   * @return
   * @throws IOException
   */
  public SqlSessionFactory getSqlSessionFactory() throws IOException {
    String resource = "mybatis-config.xml";
    InputStream inputStream = Resources.getResourceAsStream(resource);
    return new SqlSessionFactoryBuilder().build(inputStream);
  }

  /**
   * 一对多查询
   * @throws IOException
   */
  @Test
  public void test02() throws IOException {
    SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
    SqlSession openSession = sqlSessionFactory.openSession();
    try {
      ClassesMapper classesMapper = openSession.getMapper(ClassesMapper.class);
      Classes classes = classesMapper.selectByClassId(3);

      System.out.println(classes.getClass_name());
      System.out.println(classes.getSchool().getSchool_name());
    } finally {
      openSession.close();
    }
  }

  /**
   * 多对多查询
   * @throws IOException
   */
  @Test
  public void test03() throws IOException {
    SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
    SqlSession openSession = sqlSessionFactory.openSession();
    try {
      ClassesMapper classesMapper = openSession.getMapper(ClassesMapper.class);
      List<Classes> classesList = classesMapper.selectStudentByClassesId(2);

      System.out.println("学生信息：");
      if(classesList.size()!=0){
        for(int i =0;i<classesList.size();i++){
          for(Student student : classesList.get(i).getStudentList()){
            System.out.println("班级的名称："+classesList.get(i).getClass_name()+" 学生姓名："+student.getS_name());
          }
        }
      }else{
        System.out.println("该班级暂时还没有学生");
      }

    } finally {
      openSession.close();
    }
  }

  /**
   * student - class - school 关联查询
   * @throws IOException
   */
  @Test
  public void test04() throws IOException {
    SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
    SqlSession openSession = sqlSessionFactory.openSession();
    try {
      ClassesMapper classesMapper = openSession.getMapper(ClassesMapper.class);
      List<Classes> classesList  = classesMapper.selectStudentAndSchool(3);
      System.out.println("学生的信息：");
      for(int i =0;i<classesList.size();i++){
        for(Student student : classesList.get(i).getStudentList()){
          System.out.println("班级的名称："+classesList.get(i).getClass_name()+" 学校名称:"+classesList.get(i).getSchool().getSchool_name()+
              " 姓名："+student.getS_name() +" 年龄: "+student.getS_age()+" 家庭地址："+student.getS_address());
        }
      }
    } finally {
      openSession.close();
    }
  }



}
