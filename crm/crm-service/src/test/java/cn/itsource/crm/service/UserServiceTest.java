package cn.itsource.crm.service;

import cn.itsource.crm.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application-service.xml")
public class UserServiceTest {

    @Autowired
    private IUserService userService;

    @Test
    public void testGetAll() throws Exception{
        userService.getAll().forEach(System.out::println);
    }

    @Test
    public void testAdd() throws Exception{

        User user = new User();
        user.setUsername("abcde");
        user.setPassword("abcde");

        userService.add(user);

    }

}