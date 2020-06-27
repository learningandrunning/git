package com.ssm.controller;

import com.ssm.common.util;
import com.ssm.model.Article;
import com.ssm.model.User;
import com.ssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * discription
 *
 * @author chenwl
 * date 2020-06-24
 */
@Controller
@RequestMapping("/user")
public class UserController { //页面返回值到页面的ModelAndView方式
    @Autowired
    private IUserService userService;

    /**
     * 查询
     * @return
     * @throws Exception
     */
    @RequestMapping("/select")
    public ModelAndView selectUser() throws Exception {
        ModelAndView mv = new ModelAndView();
        User user = userService.selectUser(1);
        user= util.getUser();
        mv.addObject("user", user);
        mv.setViewName("user");
        return mv;
    }
    @RequestMapping("/selectUserByID")
    public ModelAndView selectUserByID() throws Exception {
        ModelAndView mv = new ModelAndView();
        User user = userService.selectUserByID(1);
        mv.addObject("user", user);
        mv.setViewName("user");
        return mv;
    }

    //新增
    @RequestMapping("/insertUserInfo")
    public ModelAndView insertUserInfo() throws Exception {
        ModelAndView mv = new ModelAndView();
        User user = new User();
        user.setuserName("Amyli8");
        user.setRole("206");
        user.setMobile("54325657");
        user.setEmail("Ludun BaLin");
        int Ret = userService.insertUserInfo(user);
        if (Ret > 0) {
            System.out.println("新增成功！");
        } else {
            System.out.println("新增失败！");
        }
        mv.addObject("result", "成功");
        mv.setViewName("user");//返回的页面
        return mv;
    }
    /**
     * 删除
     * @return
     * @throws Exception
     */
    @RequestMapping("/deleteUserInfo")
    public ModelAndView deleteUserInfo() throws Exception {
        ModelAndView mv = new ModelAndView();
        int Ret = userService.deleteUserInfo(3);
        if(Ret>0){
            System.out.println("删除成功！");
        }else{
            System.out.println("删除失败！");
        }
        mv.addObject("result", "成功");
        mv.setViewName("user");//返回的页面
        return mv;
    }

    /**
     * 修改
     * @return
     * @throws Exception
     */
    @RequestMapping("/updateUserInfo")
    public ModelAndView updateUserInfo() throws Exception {
        ModelAndView mv = new ModelAndView();
        User user = userService.selectUser(3);
        user.setuserName("jack");
        user.setRole("8");
        user.setMobile("88888888");
        user.setEmail("Ludun BaLin@qq.com");
        int Ret = userService.updateUserInfo(user);
        if (Ret > 0) {
            System.out.println("修改成功！");
        } else {
            System.out.println("修改失败！");
        }
        mv.addObject("result", "成功");
        mv.setViewName("user");//返回的页面
        return mv;
    }


    @RequestMapping("/getUserAticles")
    public ModelAndView getUserAticles() throws Exception {
        ModelAndView mv = new ModelAndView();
        List<Article> articleList  = userService.getUserAticles(1);
        System.out.println("articleList"+articleList.toString());
        mv.addObject("articleList", articleList);
        mv.setViewName("user");
        return mv;
    }
}
