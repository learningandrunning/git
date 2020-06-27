package com.ssm.common;

import com.ssm.model.User;

/**
 * discription
 *
 * @author chenwl
 * date 2020-06-24
 */
public class util {

    /**
     * 获取用户信息
     * @return
     */
    public static User getUser(){
        User user =new User();
        user.setEmail("324232");
        user.setId(1);
        user.setuserName("sdfa");
        user.setRole("管理员");
        user.setMobile("12364657");
        return user;
    }


}
