package com.itmuch.cloud.controller;

import com.itmuch.cloud.entity.User;
import com.itmuch.cloud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    /**
     * http://localhost:7900/simple/1
     * @param id
     * @return
     */
    @GetMapping("/simple/{id}")
//   @GetMapping相当于 @RequestMapping(value = "/simple",method = RequestMethod.GET)
    public User findById(@PathVariable  Long id) {
//        return this.userRepository.findById(id).orElse(null); //springboot 2.1.4版本
        return this.userRepository.findOne(id);//springboot 1.4.1版本
    }
}
