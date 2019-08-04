import com.kdgc.wangxianlin.entity.Student;
import com.kdgc.wangxianlin.mapper.StudentMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author wangxl
 * @ClassName TestStudent
 * @Description
 * @date 2019/7/22 21:32
 */
public class TestStudent {

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
     * where - if 查询
     * @throws IOException
     */
    @Test
    public void test01() throws IOException {
        SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
        SqlSession openSession = sqlSessionFactory.openSession();
        try {
            StudentMapper studentMapper = openSession.getMapper(StudentMapper.class);
            Student stu = new Student();
            //stu.setS_id(1);
            stu.setS_name("王咸林");
            stu.setS_address("安徽宿松");
            //stu.setClaa_id(1);
            //stu.setS_age("23");
            System.out.println(studentMapper.selectByStudent(stu));
        } finally {
            openSession.close();
        }
    }



}
