package com.orgName.demoforspringBoot.controller;

import com.orgName.demoforspringBoot.UserService;
import com.orgName.demoforspringBoot.dto.HelloDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hello/users")
public class HelloController {
    private final UserService userService;

    public HelloController(UserService userService) {
        this.userService = userService;
    }
    // Updated to support both JSON and XML
    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public List<HelloDto> getAllUsers(){
        return this.userService.getAllUsers();
    }
    // Updated to support both JSON and XML
    @GetMapping(value = "/{id}" , produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public HelloDto getUserById(@PathVariable Long id){
        return userService.getUserById(id);
    }

}
