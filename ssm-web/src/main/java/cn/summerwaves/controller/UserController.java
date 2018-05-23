package cn.summerwaves.controller;

import cn.summerwaves.model.User;
import cn.summerwaves.service.UserService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {

    @Resource
    private UserService userService;


    @RequestMapping(value = "student/list", method = RequestMethod.GET)
    @ResponseBody
    public Map getStudentList() {
        Map<String, Object> studentMap = new HashMap<>(4);
        List<User> userList = userService.selectAllUser();
        studentMap.put("code", 0);
        studentMap.put("message", "成功");
        studentMap.put("userList", userList);
        return studentMap;
    }

}
