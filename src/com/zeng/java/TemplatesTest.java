package com.zeng.java;

import com.zeng.bean.Customer;

import java.util.ArrayList;

/**
 * @author hdj
 * @data 2018/11/7 - 17:25
 */
public class TemplatesTest {

    //模板六：prsf:private static void final
    private static final Customer CUST=new Customer();

    //变形:psf
    public static final int NUM=1;
    //变形:psfi
    public static final int NUM2=2;
    //变形:psfs
    public static final String s="hh";

    //模板一：Psvm

    public static void main(String[] args) {

        //模板二：sout
        System.out.println();
        //变形：soutp/soutm/soutv/xxx.sout
        System.out.println("args = [" + args + "]");
        System.out.println("TemplatesTest.main");
        System.out.println("args = " + args);
        System.out.println("args = " + args);

        int num1=10;
        System.out.println("num1 = " + num1);
        int num2=20;
        System.out.println("num2 = " + num2);

        System.out.println(num1);


        //模板三:fori
        String[] arr=new String[]{"tom","jerry","haha"};
        for (int i = 0; i <arr.length; i++) {
            System.out.println(arr[i]);
        }
        //变形：iter
        for (String s : arr) {
            System.out.println(s);
        }
        //变形:itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        //模板四：list.for
        ArrayList<Integer> list=new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);

        for (Integer integer : list) {

        }
        //变形：list.fori
        for (int i = 0; i < list.size(); i++) {
            
        }
        //逆序变形：list.forr
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }
    }

    public void method(){
        ArrayList<Integer> list=new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);

        //模板五:ifn
        if (list == null) {
            
        }
        //变形：inn
        if (list != null) {
            
        }

        //变形:xx.nn  /  xx.null
        if (list != null) {

        }
        if (list == null) {

        }
    }
}
