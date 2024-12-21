package com.ash.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\ComUnus 211\\Desktop\\File\\serializing.txt";

        try (FileInputStream fileInputStream = new FileInputStream(filePath);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {

            Employee read = (Employee) objectInputStream.readObject();
            System.out.println(read);

        } catch (ClassNotFoundException e) {
            System.err.println("Error: Class not found - " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error: I/O issue - " + e.getMessage());
            e.fillInStackTrace();
        }
    }
}
