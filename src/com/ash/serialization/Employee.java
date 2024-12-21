package com.ash.serialization;

import java.io.Serializable;

public class Employee implements Serializable {
    private String name;
    private int id;
    private String email;
    private double phoneNumber;

    public Employee() {
    }

    public Employee(String email, int id, String name, double phoneNumber) {
        this.email = email;
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(double phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
