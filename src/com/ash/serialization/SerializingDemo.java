package com.ash.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializingDemo {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Ash");
        employee.setId(101);
        employee.setEmail("ash@gmail.com");
        employee.setPhoneNumber(987654321);

        String filePath = "C:\\Users\\ComUnus 211\\Desktop\\File\\serializing.txt";

        try (FileOutputStream fileOutputStream = new FileOutputStream(filePath);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)){

            objectOutputStream.writeObject(employee);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
