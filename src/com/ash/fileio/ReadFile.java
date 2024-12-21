package com.ash.fileio;

import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("C:\\Users\\ComUnus 211\\Desktop\\File\\test.txt")) {
            int line;
            while ((line = fileReader.read()) != -1) {
                System.out.print((char) line);
            }
        } catch (IOException e) {
            e.fillInStackTrace();
        }
    }
}
