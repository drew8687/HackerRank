package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner line=new Scanner(System.in);
        int index=1;
        while(line.hasNext()){
            String s=line.nextLine();
            System.out.println(index+" "+s);
            index++;


        }




      /* BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        for(int i=0;i<11;i++){
            System.out.println(N+"x"+i+"="+N*i);
        }*/
       /* Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

                System.out.println(a+Math.pow(2,i)*b);

        in.close();*/






      /*  class Solution{
            public static void main(String []argh)
            {



                Scanner sc = new Scanner(System.in);
                int t=sc.nextInt();


                for(int i=0;i<t;i++)
                {

                    try {
                        long x = sc.nextLong();
                        System.out.println(x + " can be fitted in:");
                        if (x >= -128 && x <= 127)
                            System.out.println("* byte");
                        if (x >= -32768 && x <= 32767)
                            System.out.println("* short");

                        if (x >= -2147483648 && x <= 2147483647)
                            System.out.println("* int");

                        if (x >= -9223372036854775808L && x <= 9223372036854775807L)
                            System.out.println("* long");




                    }


                    //Complete the code

                    catch(Exception e)
                    {
                        System.out.println(sc.next()+" can't be fitted anywhere.");
                    }



                }
                sc.close();
            }
        }
*/


        //Scanner scan =new Scanner((System.in));

                /*int i = scan.nextInt();
                double d=scan.nextDouble();
                scan.close();
        Scanner scan2=new Scanner((System.in));
                String  S=new String();
                S=scan2.nextLine();

                scan.close();
                // Write your code here.

                System.out.println("String: " + System.getProperty(S));
                System.out.println("Double: " + d);
                System.out.println("Int: " + i);*/
       /* Scanner sc=new Scanner(System.in);
        System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                //sc.nextLine();
                int x=sc.nextInt();
                //Complete this line
                System.out.printf("%-15s %03d\n", s1, x);                //System.out.format("%d",x);
            }


            /*DecimalFormat formater=new DecimalFormat("000");
            System.out.println(String.format(s1 + "          " +formater.format(x)));
            String str1=new String("driss");
            String str2=new String("eloifi");
            String str = String.format(
                    "My Company name"
                            + " is: %1$s, %1$s and %2$s",
                    str1, str2);
            System.out.println(str);*/













       /* Scanner scan =new Scanner((System.in));
       // String  myString=scan.next();
        //int MyInt=scan.nextInt();
        //scan.close();
        Scanner scan2=new Scanner(System.in);
        String S=scan2.nextLine() ;
        scan2.close();
    //System.out.println("myString is: " + myString);
    System.out.println("myString2 is: " + S);*/






       /* int i = scan.nextInt();
        double d=scan.nextDouble();
        String  s=scan.next();


        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);*/
        /*
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int som=0;


        for(int i=0;i<t;i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for (int j=0;j<n;j++){


                a+= (int) (Math.pow(2,j)*b);
                System.out.print(a+" ");






        };
            System.out.println();


    }
        in.close();*/
        Scanner scan = new Scanner(System.in);
        String s = new String();
        s = scan.nextLine();
        /*while (scan.hasNext()){
            System.out.println(scan.next());
        }

         */
        int i = 0;
        while (scan.hasNext()) {
            i++;

            System.out.print(i + s);



            scan.close();


        }
    }
}
