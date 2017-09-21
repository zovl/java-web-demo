package zovlzhongguanhua.demo.mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Application {

    public static void main(String[] args) {

        String resource = "mybatis.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(inputStream);
        SqlSession session = factory.openSession();
        try {
            SystemUserMapper mapper = session.getMapper(SystemUserMapper.class);
            SystemUserBean systemUserBean = new SystemUserBean();
            systemUserBean.setUserName("Adam");
            systemUserBean.setUserAge(24);
            mapper.insert(systemUserBean);
            System.out.println(systemUserBean);
        } finally {
            session.close();
        }
    }
}
