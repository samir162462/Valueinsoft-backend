package com.example.demo.Model;

import java.util.UUID;

public class Person {

    private UUID id;
    private String userName;
    private String password;
    private String role;
    private String firstName;
    private String lastName;
    private String email;

    public Person() {
    }

    public Person(UUID id, String name) {
        this.id = id;
        this.userName = name;
    }

    public Person(UUID id, String name, String password) {
        this.id = id;
        this.userName = name;
        this.password = password;
    }

    public Person(UUID id, String name, String password, String role) {
        this.id = id;
        this.userName = name;
        this.password = password;
        this.role = role;
    }

    public Person(String name, String password, String role) {
        this.id = UUID.randomUUID();
        this.userName = name;
        this.password = password;
        this.role = role;
    }

    public Person(String userName, String password, String role, String firstName, String lastName, String email) {
        this.id = UUID.randomUUID();
        this.userName = userName;
        this.password = password;
        this.role = role;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public UUID getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }
}
