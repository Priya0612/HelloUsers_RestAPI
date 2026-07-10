package com.orgName.demoforspringBoot.Repository;

import com.orgName.demoforspringBoot.dto.HelloDto;
import org.apache.catalina.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Repository
public class UserRepository {
    List<HelloDto> users = new ArrayList<>();
    public UserRepository() {
        users.add(new HelloDto(1L, "Priyanka", "priyankaxyz@cbc.com"));
        users.add(new HelloDto(2L, "Priyank", "priyankxyz@cbc.com"));
        users.add(new HelloDto(3L, "Priyansh", "priyanshxyz@cbc.com"));
    }

    public List<HelloDto> findAll(){
        return this.users;
    }

    public HelloDto findUserById(long id){
        for(HelloDto user: users){
            if (Objects.equals(user.getId(), id)){
                return user;
            }
        }
        return null;
    }



}
