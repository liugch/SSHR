package edu.nf.JoyfulKitchen.controller;

import edu.nf.JoyfulKitchen.bean.User;
import edu.nf.JoyfulKitchen.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/3/29.
 */
@Controller
public class UsersController {

    @Resource
    private UserService userService;

   /* @GetMapping("/")
    @ResponseBody
    public List<User> index(Model model){
        List<User> list = userService.getAllUser();
        return list;
    }*/

    @GetMapping("/")
    public String index(Model model){
        List<User> list = userService.getAllUser();
        model.addAttribute("list",list);
        return "index";
    }

}
