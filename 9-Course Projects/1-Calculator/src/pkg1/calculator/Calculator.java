/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1.calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author priyanshusingh
 */
public class Calculator {
    
    public static void startcal() {
        System.out.println("*****CALCULATOR*****");
    }
    
    public static long addInt(int num1, int num2) {
        return num1 + num2;
    }
    
    public static long subInt(int num1, int num2) {
        return num1 - num2;
    }
    
    public static long mulInt(int num1, int num2) {
        return num1 * num2;
    }
    
    public static long divInt(int num1, int num2) {
        return num1 / num2;
    }
    
    public static long modInt(int num1, int num2) {
        return num1 % num2;
    }
    
    public static void endcal() {
        System.out.println("*****END-CALCULATOR*****");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter First Number: ");
        String userInp1 = reader.readLine();
        int userInt1 = Integer.parseInt(userInp1);
        System.out.print("Enter Second Number: ");
        String userInp2 = reader.readLine();
        int userInt2 = Integer.parseInt(userInp2);
        startcal();
        System.out.println(userInp1 + " + " + userInp2 + " = " + addInt(userInt1, userInt2));
        System.out.println(userInp1 + " - " + userInp2 + " = " + subInt(userInt1, userInt2));
        System.out.println(userInp1 + " * " + userInp2 + " = " + mulInt(userInt1, userInt2));
        System.out.println(userInp1 + " / " + userInp2 + " = " + divInt(userInt1, userInt2));
        System.out.println(userInp1 + " % " + userInp2 + " = " + modInt(userInt1, userInt2));
        endcal();
    }
    
}
