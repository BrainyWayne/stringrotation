package com.francis;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String string1, string2;
        Scanner scanner = new Scanner(System.in);
        printOut("Enter the first string\n");
        string1 = scanner.next();
        printOut("Enter the second string\n");
        string2 = scanner.next();
        printOut(String.valueOf(isRotation(string1,string2)));
    }

    static boolean isRotation(String string1, String string2){

        return (string1.length() == string2.length()) && ((string1+string1).contains(string2));
    }

    static void printOut(String string){
        System.out.print(string);
    }
}
