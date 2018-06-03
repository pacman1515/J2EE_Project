import com.zq.dao.UserMapper;
import com.zq.model.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class TestMain {
    @Test
    public void TestUserSelect() throws IOException {
        String resource="mybatis.xml";
        InputStream is=Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);

        SqlSession openSession = sqlSessionFactory.openSession();
        try{
            UserMapper mapper = openSession.getMapper(UserMapper.class);
            User user = mapper.selectByPrimaryKey("222");
            openSession.commit();
            System.out.println("222用户的密码为:"+user.getPassword());
        }finally{
            openSession.close();
        }
    }
}
