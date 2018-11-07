package com.zeng.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class HelloWorld {

    public static void main(String[] args){
        System.out.println("helloWorld");
        try {
            FileInputStream fis=new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
