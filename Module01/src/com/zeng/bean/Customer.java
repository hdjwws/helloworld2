package com.zeng.bean;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;

//这是单行注释
public class Customer {



    public static final int INITIAL_SIZE=10;
    private int num;

    public static void main(String[] args) {
        System.out.println("helloWorld12355");
        getList();
    }

    public static void getList() {
        ArrayList list2 = new ArrayList();
        list2.add(0,123);
        ArrayList list1 = new ArrayList();
    }

    public void intd() {
        num = 10;
        Date date = new Date();
    }

    FileInputStream fis;

    {
        try {
            fis = new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


}
