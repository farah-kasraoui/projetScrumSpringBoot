package tn.esprit.scrumfarah.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.scrumfarah.Entities.User;
import tn.esprit.scrumfarah.service.IServiceUser;

@RestController
public class UserController {
    @Autowired
    IServiceUser iServiceUser;


    @PostMapping("/add")
    public User addUser( @RequestBody User user){
        return iServiceUser.addUser(user) ;
    }
}
