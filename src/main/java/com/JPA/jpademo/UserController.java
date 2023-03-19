package com.JPA.jpademo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/add")
    public String addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @GetMapping("/get-users")
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @GetMapping("/get-user")
    public User getUser(@RequestParam("id") int id){
        return userService.getUser(id);
    }

//    H.W
    //delete by a roll no
    @DeleteMapping("/delete-user")
    public String deleteUser(@RequestParam("id") int id){
        return userService.deleteUser(id);
    }
    //delete all the users
    @DeleteMapping("/delete-all-users")
    public String deleteAllUsers(){
        return userService.deleteAllUsers();
    }
    //update a user by id
    @PutMapping("/update-user")
    public User updateById(@RequestBody User user, @RequestParam("id") int id){
        return userService.updateById(user,id);
    }
}

