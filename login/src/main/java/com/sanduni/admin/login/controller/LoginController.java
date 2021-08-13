package com.sanduni.admin.login.controller;

import com.sanduni.admin.login.model.User;
import com.sanduni.admin.login.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    //create a new user (btn)
    @RequestMapping(value = "/user", method = RequestMethod.POST)
    @CrossOrigin(origins = "http://localhost:4200")
    public User save(@RequestBody User user) throws Exception {

        String tempEmailId = user.getEmail();

        if (tempEmailId != null && !"".equals(tempEmailId)){

         User userObj = loginService.fetchByEmailId(tempEmailId);
         if (userObj != null){
             throw new Exception("The user with "+tempEmailId+" is already in the system.");
         }
        }

        User userObj = null;
        userObj = loginService.save(user);
        return userObj;

    }

    //login user
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @CrossOrigin(origins = "http://localhost:4200")
   public User loginUser(@RequestBody User user) throws Exception {

        String tempUsername = user.getUsername();
        String tempPassword = user.getPassword();
        User userObj = null;

        if (tempUsername != null && tempPassword != null){

            userObj = loginService.fetchByUsernameAndPassword(tempUsername, tempPassword);

        }

        if (userObj == null){
            throw new Exception("Bad Crededntials");
        }
        return userObj;
   }
}
