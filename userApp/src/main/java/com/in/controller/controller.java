package com.in.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.in.service.UsersService;
import com.in.user.Users;

@Controller
@RequestMapping("/users/")
@Configuration
@ComponentScan("com.in.service")
public class controller {
	
	 @Autowired
	 UsersService userServices;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "home";
	}

	@RequestMapping(value = "/page", method = RequestMethod.GET)
	public String getPage() {
		//System.out.println("INSIDE users/page REQUEST");
		//ModelAndView view = new ModelAndView("users");
		return "users";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.POST)
    public @ResponseBody Map<String, Object> getAll(Users users) {
        Map<String, Object> map = new HashMap<String, Object>();

       /* List<Users> list = userServices.list();
 
        if (list != null) {
            map.put("status", "200");
            map.put("message", "Data found");
            map.put("data", list);
        } else {
            map.put("status", "404");
            map.put("message", "Data not found");
 
        }*/
 
        return map;
    } 

}
