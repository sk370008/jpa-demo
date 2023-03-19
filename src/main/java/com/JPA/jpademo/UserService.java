package com.JPA.jpademo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public String addUser(User user){
        userRepository.save(user);
        return "user added";
    }

    public List<User> getUsers() {
      return userRepository.findAll();
    }

    public User getUser(int id) {
        return userRepository.findById(id).get();
    }

    public String deleteUser(int id) {
        userRepository.deleteById(id);
        return "user deleted";
    }

    public String deleteAllUsers() {
        userRepository.deleteAll();
        return "Deleted every user successfully";
    }

    public User updateById(User user,int id) {
        User updatedUser = userRepository.findById(id).get();
        updatedUser = user;
        return userRepository.save(user);
    }
}
