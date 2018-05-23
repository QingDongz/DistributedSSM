package cn.summerwaves.service.impl;

import cn.summerwaves.model.User;
import cn.summerwaves.service.UserService;
import com.github.pagehelper.PageHelper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
//@ContextConfiguration(locations = {"classpath:spring/spring-all.xml"})
//@RunWith(SpringJUnit4ClassRunner.class)
public class UserServiceImplTest {
    @Autowired
    private UserService userService;

    @Test
    public void deleteByPrimaryKey() {
    }

    @Test
    public void insert() {
    }

    @Test
    public void insertSelective() {
        User user = new User();
        user.setUsername("分布式");
        user.setPassword("password");
        user.setAge(25);
        Long success = userService.insertSelective(user);
        System.out.println("插入数据成功：" + success);
        System.out.println("插入数据id为:"+user.getId());
    }

    @Test
    public void selectByPrimaryKey() {
    }

    @Test
    public void updateByPrimaryKeySelective() {
    }

    @Test
    public void updateByPrimaryKey() {
    }

    @Test
    public void selectAllUser() {
        PageHelper.startPage(1, 4);
        List<User> userList = userService.selectAllUser();
        System.out.println("=====================");
        System.out.println(userList);
        System.out.println("=====================");
        for (User user : userList) {
            System.out.println(user);
        }

    }



    @Test
    public void charInStringTest() {
        String string = "测试字符ABC123,./不想测试了";

        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i < string.length(); i++) {
            if (null != map.get(string.charAt(i))) {
                map.put(string.charAt(i), map.get(string.charAt(i)) + 1);
            } else {
                map.put(string.charAt(i), 1);
            }
        }

        System.out.println(map);

    }


    @Test
    public void reverseString() {
        String s = "反转字符串";
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = temp;
        }

        String r = new String(chars);
        System.out.println(r);


    }


}