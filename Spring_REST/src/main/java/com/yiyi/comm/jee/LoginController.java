package com.yiyi.comm.jee;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.validation.Valid;

/**
 * Created by liuzhe on 16/6/14.
 */
@Controller
public class LoginController extends WebMvcConfigurerAdapter{

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String showLogin(User user){
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@Valid User user, BindingResult result) {
        if(result.hasErrors()){
            return "login";
        }

        return "redirect:/welcome";
//        if (name == null) {
//            return "login";
//        } else {
//            model.addAttribute("name", name);
//            System.out.println("input name is:" + name);
//            return "welcome";
//        }
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/welcome").setViewName("welcome");
    }


}
