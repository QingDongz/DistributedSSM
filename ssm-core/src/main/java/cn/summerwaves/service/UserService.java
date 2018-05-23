package cn.summerwaves.service;

import cn.summerwaves.model.User;

import java.util.List;

public interface UserService {
    Boolean deleteByPrimaryKey(Long id);

    Long insert(User record);

    Long insertSelective(User record);

    User selectByPrimaryKey(Long id);

    Boolean updateByPrimaryKeySelective(User record);

    Boolean updateByPrimaryKey(User record);

    List<User> selectAllUser();
}
