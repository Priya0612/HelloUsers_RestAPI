package com.orgName.demoforspringBoot.dto;

public class HelloDto {
    private long id;
    private String name1;
    private String email;

    public HelloDto(long id, String name, String email) {
        this.id = id;
        this.name1 = name;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name1;
    }

    public String getEmail() {
        return email;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name1 = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
