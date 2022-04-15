package com.mazhike.sh2022;

import com.mazhike.sh2022.mapper.UserMapper;
import com.mazhike.sh2022.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Sh2022ApplicationTests {
    @Autowired
    private UserMapper userMapper;
    @Test
    void contextLoads() {
    }


    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        //Assert.assertEquals(5, userList.size());
        userList.forEach(System.out::println);
    }

}
