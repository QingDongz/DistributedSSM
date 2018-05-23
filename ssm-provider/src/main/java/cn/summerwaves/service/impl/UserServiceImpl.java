package cn.summerwaves.service.impl;

import cn.summerwaves.dao.UserDao;
import cn.summerwaves.model.User;
import cn.summerwaves.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    public Boolean deleteByPrimaryKey(Long id) {
        return userDao.deleteByPrimaryKey(id);
    }

    public Long insert(User record) {
        return userDao.insert(record);
    }

    public Long insertSelective(User record) {
        return userDao.insertSelective(record);
    }

    public User selectByPrimaryKey(Long id) {
        return userDao.selectByPrimaryKey(id);
    }

    public Boolean updateByPrimaryKeySelective(User record) {
        return userDao.updateByPrimaryKeySelective(record);
    }

    public Boolean updateByPrimaryKey(User record) {
        return userDao.updateByPrimaryKey(record);
    }

    public List<User> selectAllUser() {
        return userDao.selectAllUser();
    }


}
