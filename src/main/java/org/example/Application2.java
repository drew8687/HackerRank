package org.example;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Application2 {

    static int B,H;
    static boolean flag=true;

    static {

        if(B<0 || H<0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag=false;
        }else if(B>0 && H>0){
            flag=true;
        }
    }
    public static void main(String[] args){
        Scanner scanner1=new Scanner(System.in);

        scanner1.nextLine();
        scanner1.nextInt();
        scanner1.close();
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main

}//end of class

