package com.knoldus;
public class StringMethod {
    static void reverseString(String input){
        char splitString[]=input.toCharArray();
        int i;
        System.out.print("\nString after Reversing :  ");
        for(i=splitString.length-1;i>=0;i--){
            System.out.print(splitString[i]);
        }
    }
    static void getStringLength(String input){
        char splitString[]=input.toCharArray();
        int i, len=0;
        for(i=0;i<splitString.length;i++){
            len++;
        }
        System.out.print("\nThe Length of "+input+" String is  :"+len);
    }
}