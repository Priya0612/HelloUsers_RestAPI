package com.orgName.demoforspringBoot;

import org.springframework.stereotype.Component;

@Component
public class MySQLDatabase implements DataBase{

    @Override
    public void save(String user) {
        System.out.println("MySQLDatabase is saving user");

    }
}
