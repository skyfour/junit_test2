package com.sky.dao;

import com.sky.beans.User;
import com.sky.dao.UserDao;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TestServiceApplication.class)
public class UserDaoTest {
    @Autowired
    private UserDao userDao;
    @Autowired
    private UserRepository userRepository;

    @Test
    public void testInsert() {
        User user = new User();  
//        User user = userRepository.findOne(10);
        user.setUsername("张三11");
        user.setPassword("zhangsan11");
        user.setBirthday(new Date());
//        userRepository.delete(user);
        userRepository.saveAndFlush(user);
    }

    @Test
    public void testGetById() {
        User user = this.userDao.getById(1);
        System.out.println(user.getUsername());
    }

    @Test
    public void testUpdate() {
        User user = new User();
        user.setId(1);
        user.setPassword("zhangsan123");
        this.userDao.update(user);
    }

    @Test
    public void testDeleteById() {
        int result = this.userDao.deleteById(1);
        System.out.println(result);
    }
}
