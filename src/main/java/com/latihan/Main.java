package com.nostratech;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static java.lang.System.out;

/**
 * @author BUDI
 *
 **/

public class Main {
    public static void main(String[] args) throws IOException {

//        out.println(tes()); //false
//        out.println(Palindrome.enryptData("Payment")); //false
//        out.println(Palindrome.decryptData2("Payment")); //false
        out.println(tes()); //false

        //angka 1-100 bil prima

    }
//    private static StringBuilder prima(){
//        StringBuilder result=new StringBuilder();
//        for (int i=0;i<=100;i++){
//                if (i > 1 && i % i == 0 && i % 1 == 0&&i==) {
//                    if (i == 2) {
//                        result.append(i + ",");
//                    }
//                    result.append(i + ",");
//                }
//
//        }
//        return result;
//    }
    private static int tes(){
        int result=0;
        int []a={6,5,18, 12, 21, 2};
        int max=a[0];
        int max2=a[0];
        for (int i=0;i<a.length;i++){
            if(max<a[i]){
                max=a[i];
            }

        }
        for (int i=0;i<a.length;i++){
            if(a[i]!=max) {
                if (a[i] > max2) {
                    max2 = a[i];
                }
            }

        }

        return max2;
    }
}
