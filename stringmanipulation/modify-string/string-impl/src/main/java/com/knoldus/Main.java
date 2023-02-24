package com.knoldus;
import java.util.Scanner;
import com.knoldus.StringMethod;

public class Main {
    public static void main(String[] args) {
        StringMethod str=new StringMethod();
        String inputString;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String :  ");
        inputString=sc.nextLine();
        str.reverseString(inputString);
        str.getStringLength(inputString);
    }
}