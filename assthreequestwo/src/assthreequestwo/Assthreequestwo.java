/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assthreequestwo;
import java.util.Scanner;
public class Assthreequestwo {
    public static boolean validateuser(String name){
        return name. matches("^[a-zA-Z]+$");
    }
    public static boolean validateuser(int age){
        return age>3 && age<15;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String username = scanner.nextLine();
        if(validateuser(username)){
            System.out.println("Name is valid.");
        } else{
            System.out.println("The name is invalid. Use alphabets only.");
            return;
        }
        System.out.print("Enter your age: ");
        int userage;
        try{
            userage = Integer.parseInt(scanner.nextLine());
        } 
        catch(NumberFormatException e){
            System.out.println("The age is invalid. Please add a valid integer.");
            return;
        }
        if(validateuser(userage)){
            System.out.println("Age is valid.");
        } else{
            System.out.println("The age is invalid. Enter an age between 3 and 15.");
        }
    }
}

