/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assthreequesfive;

import java.util.Scanner;
public class Assthreequesfive {

    public static int calculatesum(int[] array){
        int sum = 0;
        for(int value : array){
            sum += value;
        }
        return sum;
    }
    public static void displayreverse(int[] array){
        System.out.print("The array in reverse order is: ");
        for(int i = array.length -1; i>= 0; i--){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] userarray = new int[size];
        System.out.println("Enter the array elements: ");
        for(int i = 0; i<size; i++){
            System.out.print("Element " + (i+1) + ": ");
            userarray[i] = scanner.nextInt();
        }
        int sum = calculatesum(userarray);
        System.out.println("The sum of array elements: " + sum);
        displayreverse(userarray);
        
    }
}

