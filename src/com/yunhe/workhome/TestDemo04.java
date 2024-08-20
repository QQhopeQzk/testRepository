package com.yunhe.workhome;

import java.io.File;
import java.io.IOException;

public class TestDemo04 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("D:\\students\\Java");
        file1.mkdirs();

         new File(file1, "student.txt").createNewFile();
         File  file2 = new File("D:/students/Android");
         file2.mkdirs();
        new File(file2,"student.txt").createNewFile();
    }
}
