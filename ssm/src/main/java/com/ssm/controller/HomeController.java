package com.ssm.controller;

import com.ssm.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//
@Controller
@RequestMapping("/home")
public class HomeController {
    //添加一个日志器
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    /**
     * 使用ModelAndView来保存数据
     * @return
     */
    @RequestMapping("/demo1")
    public ModelAndView ModelView(){ //页面返回值到页面的ModelAndView方式返回值和页面
        ModelAndView view = new ModelAndView();
        User bean = new User();
        bean.setuserName("admin");
        bean.setMobile("admin");
        view.addObject("admin", bean);
        view.setViewName("Model");//Model.jsp
        return view;
    }

    /**
     * 使用model来保存数据到前台
     * @param model
     * @return
     */
    @RequestMapping("/demo")
    public String Model(Model model){//返回字符串就是对应的页面，也有用Model、hashMap、HttpSession、HttpServletRequest返回值到页面
        User bean = new User();
        bean.setuserName("admin");
        bean.setMobile("admina");
        model.addAttribute("admin", bean);//前台取值 ${admin }
        return "Model";//返回视图
    }

    /**
     * 使用hashmap保存数据
     * @param hashMap
     * @return
     */
    @RequestMapping("/demo2")
    public String Hashmap(HashMap<String, Object> hashMap) {
        User bean = new User();
        bean.setuserName("admin");
        bean.setMobile("168888");
        hashMap.put("admin", bean);
        return "Model";
    }

    /**
     * 使用session来保存数据
     * @param session
     * @return
     */
    @RequestMapping("/demo3")
    public String session(HttpSession session){
        User bean = new User();
        bean.setuserName("admin");
        bean.setMobile("188888");
        session.setAttribute("admin", bean);
        return "Model";
    }

    /**
     * request来保存数据
     * @param request
     * @return
     */
    @RequestMapping("/demo4")
    public String request(HttpServletRequest request){
        User bean = new User();
        bean.setuserName("admin");
        bean.setMobile("1888888");
        request.setAttribute("admin", bean);
        return "Model";
    }


}
