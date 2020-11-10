package com.example.correoelectronico;

import java.util.GregorianCalendar;

public class Contact {
    private int id;
    private String firstName;
    private String secondSurname;
    private GregorianCalendar birth;
    private String photo;
    private String email;
    private String phone1;
    private String phone2;
    private String address;


    public Contact(int id, String firstName, String secondSurname, GregorianCalendar birth, String photo, String email, String phone1, String phone2, String address) {
        this.id = id;
        this.firstName = firstName;
        this.secondSurname = secondSurname;
        this.birth = birth;
        this.photo = photo;
        this.email = email;
        this.phone1 = phone1;
        this.phone2 = phone2;
        this.address = address;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondSurname() {
        return secondSurname;
    }

    public void setSecondSurname(String secondSurname) {
        this.secondSurname = secondSurname;
    }

    public GregorianCalendar getBirth() {
        return birth;
    }

    public void setBirth(GregorianCalendar birth) {
        this.birth = birth;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
