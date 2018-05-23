package cn.summerwaves.controller;

import cn.summerwaves.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;
@ContextConfiguration(locations = {"classpath:spring-all.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class UserControllerTest {
    @Resource
    private UserService userService;

    @Test
    public void dubboTest() {
        System.out.println("==================================");
        System.out.println(userService.selectAllUser());
        System.out.println("==================================");

    }

}