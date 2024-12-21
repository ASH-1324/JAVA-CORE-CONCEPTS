package com.ash.fileio;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {
    public static void main(String[] args) {
        try (FileWriter fileWriter = new FileWriter("C:\\Users\\ComUnus 211\\Desktop\\File\\file.txt")
        ) {
            fileWriter.write("writing something via java in file");
            System.out.println("successful");
        } catch (IOException e) {
            e.fillInStackTrace();
        }
    }
}
