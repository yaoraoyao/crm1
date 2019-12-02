package cn.itsource.crm.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application-mapper.xml")
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelectAll() throws Exception{
        userMapper.selectAll().forEach(st->{
            System.out.println(st);
        });
    }

}