package com.ssm.controller;

import com.alibaba.fastjson.JSON;
import com.ssm.model.User;
import com.ssm.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * discription
 *
 * @author chenwl
 * date 2020-06-26
 */
@Controller
@RequestMapping("/test")
public class TestController {//初始化页面，页面请求，action返回值到新的页面

    @Autowired
    private IUserService userService;

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);


    //映射一个action ，返回初始化页面
    @RequestMapping("/inituser")
    public  String inituser(){
        //输出日志文件
        logger.info("the first jsp pages");
        //返回一个index.jsp这个视图
        return "inituser";//返回的字符串就是视图的名称name
    }


    @RequestMapping("/addUser")
    @ResponseBody
    public ModelAndView addUser(User user){//可以不添加@ModelAttribute注解

        ModelAndView mv=new ModelAndView();
        try {
            User user1=user;
//            userService.insertUserInfo(user);
            mv.setViewName("user");
        } catch (Exception e) {
            e.printStackTrace();
            mv.addObject("result", "添加失败");
        }
        mv.addObject("result", "添加成功");
        return mv;
    }

/*
$("#test2").on("click",function(){
            var id          =1;
            var username    ="fangxin";
            $.post("/mvc/client1/test2",{id:id,username:username})
        });
 */
    @RequestMapping("/addUserAjax")
    @ResponseBody //直接返回json
    public String addUserAjax(User user){//userName返回值是user的一个属性，会自动装配
        try {
            User user1=user;
//            userService.insertUserInfo(user);
        } catch (Exception e) {
            e.printStackTrace();
            return JSON.toJSONString("false");
        }
        return JSON.toJSONString("success");
    }

    /**
     * 直接接收参数
     * @param userName
     * @param age
     * @param session
     * @return
     */
    @RequestMapping(value="/doLogin", method= RequestMethod.POST)
    private String doLogin(@RequestParam("userName") String userName, @RequestParam("id") Integer age, HttpSession session){
        return "user";
    }

    /**
     * 接收对象entity
     * @param user
     * @param session
     * @return
     */
    @RequestMapping(value="/save", method=RequestMethod.POST)
    private String doSave(User user, HttpSession session){//可以不添加@ModelAttribute注解 ，user本身也会传给下一个jsp页面
        return "user";
    }

    /*
    $("#test1").on("click",function(){
                var idList = new Array();
                idList.push("1");
                idList.push("2");
                idList.push("3");
                $.post("/mvc/client1/test1",{idList:idList})
            });
     */
    @RequestMapping("/list")
    @ResponseBody
    public void test1(@RequestParam("idList[]") List<Integer> idList){
        for(Integer i: idList){
            System.out.println(i);
        }
    }


}
