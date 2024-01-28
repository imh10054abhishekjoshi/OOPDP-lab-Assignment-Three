/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ques6ass3;

import java.util.Scanner;


public class Ques6ass3 {

     public static void displayvalue(int value){
        System.out.println("Display the int value: " + value);
    }
    public static void displayvalue(double value){
        System.out.println("Display the double value: " + value);
    }
    public static void displayvalue(float value){
        System.out.println("Display the float value: " + value);
    }
    public static void displayvalue(short value){
        System.out.println("Display the short value: " + value);
    }
    public static void displayvalue(int value, boolean demote){
        if (demote){
            System.out.println("Display int value after type demotion: " + value);
        } else{
            System.out.println("Display float value: " + value);
        }
    }
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        int intvalue = scanner.nextInt();
        System.out.print("Ener a float value: ");
        float floatvalue = scanner.nextFloat();
        displayvalue(intvalue);
        displayvalue(floatvalue);
        displayvalue((short) intvalue);
        
        displayvalue((int) intvalue, true);
        
    }
}   

    
    

