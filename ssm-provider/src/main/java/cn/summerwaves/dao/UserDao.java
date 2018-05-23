package cn.summerwaves.dao;

import cn.summerwaves.model.User;

import java.util.List;

public interface UserDao {
    Boolean deleteByPrimaryKey(Long id);

    Long insert(User record);

    Long insertSelective(User record);

    User selectByPrimaryKey(Long id);

    Boolean updateByPrimaryKeySelective(User record);

    Boolean updateByPrimaryKey(User record);

    List<User> selectAllUser();
}