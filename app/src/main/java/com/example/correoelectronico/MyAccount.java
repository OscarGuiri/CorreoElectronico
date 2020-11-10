package com.example.correoelectronico;

public class MyAccount {
    private int id;
    private String name;
    private String firstName;
    private String email;

    public MyAccount(int id, String name, String firstName, String email) {
        this.id = id;
        this.name = name;
        this.firstName = firstName;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
