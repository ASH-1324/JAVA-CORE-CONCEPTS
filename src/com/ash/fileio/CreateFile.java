package com.ash.fileio;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\ComUnus 211\\Desktop\\File\\file.txt");

        try {
            if (file.createNewFile()) {
                System.out.println("File created successfully: " + file.getName());
            } else {
                System.out.println("File already exists!");
            }
        } catch (IOException e) {
            System.out.println("Something went wrong");
            e.fillInStackTrace();
        }
    }
}
