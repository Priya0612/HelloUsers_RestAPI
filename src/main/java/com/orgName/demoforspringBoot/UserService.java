package com.orgName.demoforspringBoot;

import com.orgName.demoforspringBoot.Repository.UserRepository;
import com.orgName.demoforspringBoot.dto.HelloDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final DataBase dataBase;

    public UserService(UserRepository userRepository,DataBase dataBase) {
        this.userRepository = userRepository;
        this.dataBase = dataBase;
    }

    public List<HelloDto> getAllUsers() {
        return this.userRepository.findAll();
    }
    public HelloDto getUserById(Long id) {
        return this.userRepository.findUserById(id);
    }

    public void saveUser(String user1) {
        System.out.println("UserService is saving user");
        dataBase.save(user1);
    }
}

