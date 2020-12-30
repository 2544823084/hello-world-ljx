package com.atguigu.maildemo.controller;
import com.atguigu.maildemo.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ApplicationController {

    @Autowired
    ApplicationService applicationService;

    @RequestMapping("/index")
    public String toIndex() {
        return "registerPage";
    }

    @RequestMapping("/register")
//    @RequestMapping(value = "code",method = RequestMethod.GET)
//        public String show(Model model){
//        model.addAttribute("uid","123");
//        model.addAttribute("name","Jerry");
//        return  "code";
//    }
    public String toRegister(String textx, String texty) {
        int x = Integer.parseInt(textx);
        int y = Integer.parseInt(texty);
        int sum = applicationService.toRegister(x, y);
        System.out.println(sum);
        //toCode(sum);
        toCode(sum);
        return "code";
    }

    @RequestMapping("/code")
    public int toCode(int sum) {
        System.out.println(sum);
        return sum;
    }
}
//    @GetMapping("/verifi")
//    public String toVerifi(String code){
//        boolean result = applicationService.verifi(code);
//        if(true){
//            return "success";
//        }else{
//            return "fail";
//        }
//    }

