package com.ssm.service;

import com.ssm.model.Article;
import com.ssm.model.User;

import java.util.List;

/**
 * discription
 *
 * @author chenwl
 * date 2020-06-24
 */
public interface IUserService {
    public User selectUser(long userId);

    //定义的接口名需与User.xml里的id值要对应
    public List<User> getUserList(String userName);

    public List<Article> getUserAticles(int id);

    public User selectUserByID(int id);

    public int insertUserInfo(User user);

    public int updateUserInfo(User user);

    public int deleteUserInfo(int id);

}
