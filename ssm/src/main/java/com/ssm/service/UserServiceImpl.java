package com.ssm.service;

import com.ssm.dao.IUserDao;
import com.ssm.model.Article;
import com.ssm.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * discription
 *
 * @author chenwl
 * date 2020-06-24
 */
@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserDao userDao;

    public User selectUser(long userId) {
        return userDao.selectUser(userId);
    }

    //定义的接口名需与User.xml里的id值要对应
    public List<User> getUserList(String userName){
        return userDao.getUserList(userName);
    }

    public List<Article> getUserAticles(int id){
        return userDao.getUserAticles(id);
    }

    public User selectUserByID(int id){
        return userDao.selectUserByID(id);
    }


    public int insertUserInfo(User user){
        return userDao.insertUserInfo(user);
    }

    public int updateUserInfo(User user){
        return userDao.updateUserInfo(user);
    }

    public int deleteUserInfo(int id){
        return userDao.deleteUserInfo(id);
    }

}
